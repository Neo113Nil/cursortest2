package com.yandex.div.core.view2.errors;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.R$dimen;
import com.yandex.div.R$drawable;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.ErrorView;
import com.yandex.div.internal.widget.FrameContainerLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ErrorView implements Disposable {

    @Nullable
    private ViewGroup counterView;

    @Nullable
    private DetailsViewGroup detailsView;

    @NotNull
    private final ErrorModel errorModel;

    @NotNull
    private final Disposable modelObservation;

    @NotNull
    private final ViewGroup root;
    private final boolean showPermanently;

    @Nullable
    private ErrorViewModel viewModel;

    public ErrorView(@NotNull ViewGroup root, @NotNull ErrorModel errorModel, boolean z4) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
        this.root = root;
        this.errorModel = errorModel;
        this.showPermanently = z4;
        this.modelObservation = errorModel.observeAndGet(new ErrorView$modelObservation$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewModel(ErrorViewModel errorViewModel) {
        updateView(this.viewModel, errorViewModel);
        this.viewModel = errorViewModel;
    }

    private final void tryAddCounterView() {
        if (this.counterView != null) {
            return;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.root.getContext());
        appCompatTextView.setBackgroundResource(R$drawable.error_counter_background);
        appCompatTextView.setTextSize(12.0f);
        appCompatTextView.setTextColor(-16777216);
        appCompatTextView.setGravity(17);
        appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(R$dimen.div_shadow_elevation));
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: A1.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorView.tryAddCounterView$lambda$5$lambda$4(ErrorView.this, view);
            }
        });
        DisplayMetrics metrics = this.root.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(24, metrics);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dpToPx, dpToPx);
        int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(8, metrics);
        marginLayoutParams.topMargin = dpToPx2;
        marginLayoutParams.leftMargin = dpToPx2;
        marginLayoutParams.rightMargin = dpToPx2;
        marginLayoutParams.bottomMargin = dpToPx2;
        Context context = this.root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "root.context");
        FrameContainerLayout frameContainerLayout = new FrameContainerLayout(context, null, 0, 6, null);
        frameContainerLayout.addView(appCompatTextView, marginLayoutParams);
        this.root.addView(frameContainerLayout, -1, -1);
        this.counterView = frameContainerLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryAddCounterView$lambda$5$lambda$4(ErrorView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.errorModel.onCounterClick(this$0.root.getWidth(), this$0.root.getHeight());
    }

    private final void tryAddDetailsView() {
        if (this.detailsView != null) {
            return;
        }
        Context context = this.root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "root.context");
        DetailsViewGroup detailsViewGroup = new DetailsViewGroup(context, this.errorModel.getErrorHandler(), new ErrorView$tryAddDetailsView$view$1(this), new ErrorView$tryAddDetailsView$view$2(this));
        this.root.addView(detailsViewGroup, new ViewGroup.LayoutParams(-1, -1));
        this.detailsView = detailsViewGroup;
    }

    private final void updateView(ErrorViewModel errorViewModel, ErrorViewModel errorViewModel2) {
        if (errorViewModel == null || errorViewModel2 == null || errorViewModel.getShowDetails() != errorViewModel2.getShowDetails()) {
            ViewGroup viewGroup = this.counterView;
            if (viewGroup != null) {
                this.root.removeView(viewGroup);
            }
            this.counterView = null;
            DetailsViewGroup detailsViewGroup = this.detailsView;
            if (detailsViewGroup != null) {
                this.root.removeView(detailsViewGroup);
            }
            this.detailsView = null;
        }
        if (errorViewModel2 == null) {
            return;
        }
        if (errorViewModel2.getShowDetails()) {
            tryAddDetailsView();
            DetailsViewGroup detailsViewGroup2 = this.detailsView;
            if (detailsViewGroup2 != null) {
                detailsViewGroup2.setText(errorViewModel2.getDetails());
            }
            DetailsViewGroup detailsViewGroup3 = this.detailsView;
            if (detailsViewGroup3 != null) {
                detailsViewGroup3.updateVariables(this.errorModel.getAllControllers());
                return;
            }
            return;
        }
        if (errorViewModel2.getCounterText().length() <= 0 && !this.showPermanently) {
            ViewGroup viewGroup2 = this.counterView;
            if (viewGroup2 != null) {
                this.root.removeView(viewGroup2);
            }
            this.counterView = null;
        } else {
            tryAddCounterView();
        }
        ViewGroup viewGroup3 = this.counterView;
        KeyEvent.Callback childAt = viewGroup3 != null ? viewGroup3.getChildAt(0) : null;
        AppCompatTextView appCompatTextView = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(errorViewModel2.getCounterText());
            appCompatTextView.setBackgroundResource(errorViewModel2.getCounterBackground());
        }
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.modelObservation.close();
        this.root.removeView(this.counterView);
        this.root.removeView(this.detailsView);
    }
}
