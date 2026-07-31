package com.yandex.div.core.view2.divs;

import O1.C0860i3;
import O1.C0892k0;
import android.view.View;
import com.yandex.div.R$dimen;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.util.CollectionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivFocusBinder {

    @NotNull
    private final DivActionBinder actionBinder;

    @Metadata
    private final class FocusChangeListener implements View.OnFocusChangeListener {

        @Nullable
        private List<C0892k0> blurActions;

        @Nullable
        private C0860i3 blurredBorder;

        @NotNull
        private final BindingContext context;

        @Nullable
        private List<C0892k0> focusActions;

        @Nullable
        private C0860i3 focusedBorder;
        final /* synthetic */ DivFocusBinder this$0;

        public FocusChangeListener(@NotNull DivFocusBinder divFocusBinder, BindingContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.this$0 = divFocusBinder;
            this.context = context;
        }

        private final void applyBorder(View view, C0860i3 c0860i3) {
            this.this$0.applyBorder(view, this.context, c0860i3);
        }

        private final void handle(List<C0892k0> list, View view, String str) {
            this.this$0.actionBinder.handleBulkActions$div_release(this.context, view, list, str);
        }

        @Nullable
        public final List<C0892k0> getBlurActions() {
            return this.blurActions;
        }

        @Nullable
        public final C0860i3 getBlurredBorder() {
            return this.blurredBorder;
        }

        @Nullable
        public final List<C0892k0> getFocusActions() {
            return this.focusActions;
        }

        @Nullable
        public final C0860i3 getFocusedBorder() {
            return this.focusedBorder;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(@NotNull View v4, boolean z4) {
            Intrinsics.checkNotNullParameter(v4, "v");
            if (z4) {
                applyBorder(v4, this.focusedBorder);
                List<C0892k0> list = this.focusActions;
                if (list != null) {
                    handle(list, v4, "focus");
                    return;
                }
                return;
            }
            if (this.focusedBorder != null) {
                applyBorder(v4, this.blurredBorder);
            }
            List<C0892k0> list2 = this.blurActions;
            if (list2 != null) {
                handle(list2, v4, "blur");
            }
        }

        public final void setActions(@Nullable List<C0892k0> list, @Nullable List<C0892k0> list2) {
            this.focusActions = list;
            this.blurActions = list2;
        }

        public final void setBorders(@Nullable C0860i3 c0860i3, @Nullable C0860i3 c0860i32) {
            this.focusedBorder = c0860i3;
            this.blurredBorder = c0860i32;
        }
    }

    public DivFocusBinder(@NotNull DivActionBinder actionBinder) {
        Intrinsics.checkNotNullParameter(actionBinder, "actionBinder");
        this.actionBinder = actionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void applyBorder(View view, BindingContext bindingContext, C0860i3 c0860i3) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).setBorder(bindingContext, c0860i3, view);
            return;
        }
        float f4 = 0.0f;
        if (c0860i3 != null && !BaseDivViewExtensionsKt.isConstantlyEmpty(c0860i3) && ((Boolean) c0860i3.f6461c.evaluate(bindingContext.getExpressionResolver())).booleanValue() && c0860i3.f6462d == null) {
            f4 = view.getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(f4);
    }

    public void bindDivBorder(@NotNull View view, @NotNull BindingContext context, @Nullable C0860i3 c0860i3, @Nullable C0860i3 c0860i32) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        applyBorder(view, context, (c0860i3 == null || BaseDivViewExtensionsKt.isConstantlyEmpty(c0860i3) || !view.isFocused()) ? c0860i32 : c0860i3);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && BaseDivViewExtensionsKt.isConstantlyEmpty(c0860i3)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusActions() == null && focusChangeListener.getBlurActions() == null && BaseDivViewExtensionsKt.isConstantlyEmpty(c0860i3)) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(this, context);
        focusChangeListener2.setBorders(c0860i3, c0860i32);
        if (focusChangeListener != null) {
            focusChangeListener2.setActions(focusChangeListener.getFocusActions(), focusChangeListener.getBlurActions());
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    public void bindDivFocusActions(@NotNull View target, @NotNull BindingContext context, @Nullable List<C0892k0> list, @Nullable List<C0892k0> list2) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        View.OnFocusChangeListener onFocusChangeListener = target.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && CollectionsKt.allIsNullOrEmpty(list, list2)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusedBorder() == null && CollectionsKt.allIsNullOrEmpty(list, list2)) {
            target.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(this, context);
        if (focusChangeListener != null) {
            focusChangeListener2.setBorders(focusChangeListener.getFocusedBorder(), focusChangeListener.getBlurredBorder());
        }
        focusChangeListener2.setActions(list, list2);
        target.setOnFocusChangeListener(focusChangeListener2);
    }
}
