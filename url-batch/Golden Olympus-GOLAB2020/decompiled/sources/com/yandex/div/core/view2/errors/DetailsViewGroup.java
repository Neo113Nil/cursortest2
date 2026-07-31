package com.yandex.div.core.view2.errors;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.R$dimen;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
final class DetailsViewGroup extends LinearLayout {

    @NotNull
    private final AppCompatTextView errorsOutput;

    @NotNull
    private final VariableMonitorView monitorView;

    @NotNull
    private final Function0<Unit> onCloseAction;

    @NotNull
    private final Function0<Unit> onCopyAction;

    @NotNull
    private final VariableMonitor variableMonitor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsViewGroup(@NotNull Context context, @NotNull Function1<? super Throwable, Unit> errorHandler, @NotNull Function0<Unit> onCloseAction, @NotNull Function0<Unit> onCopyAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(onCloseAction, "onCloseAction");
        Intrinsics.checkNotNullParameter(onCopyAction, "onCopyAction");
        this.onCloseAction = onCloseAction;
        this.onCopyAction = onCopyAction;
        VariableMonitor variableMonitor = new VariableMonitor(errorHandler);
        this.variableMonitor = variableMonitor;
        this.errorsOutput = createErrorsOutput();
        this.monitorView = new VariableMonitorView(context, variableMonitor);
        configureView();
    }

    private final void configureView() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, displayMetrics);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        setOrientation(1);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(R$dimen.div_shadow_elevation));
        addView(createTopPanel(), new LinearLayout.LayoutParams(-2, -2));
        addView(this.monitorView, new LinearLayout.LayoutParams(-1, -2));
    }

    private final LinearLayout createControls() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        linearLayout.setPadding(0, 0, BaseDivViewExtensionsKt.dpToPx(8, displayMetrics), 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup.this, view);
            }
        });
        ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setImageResource(R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup.this, view);
            }
        });
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCloseAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCopyAction.invoke();
    }

    private final AppCompatTextView createErrorsOutput() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        return appCompatTextView;
    }

    private final LinearLayout createTopPanel() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout createControls = createControls();
        DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        linearLayout.addView(createControls, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(32, displayMetrics), -2));
        linearLayout.addView(this.errorsOutput, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    public final void setText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.errorsOutput.setText(value);
    }

    public final void updateVariables(@NotNull Map<String, ? extends VariableController> controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.variableMonitor.setControllerMap(controllers);
    }
}
