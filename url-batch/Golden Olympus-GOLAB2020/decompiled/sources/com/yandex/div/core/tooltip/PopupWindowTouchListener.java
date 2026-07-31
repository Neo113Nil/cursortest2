package com.yandex.div.core.tooltip;

import O1.C0892k0;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.ironsource.c9;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class PopupWindowTouchListener implements View.OnTouchListener {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final Rect hitRect;
    private final boolean isModal;

    @NotNull
    private final PopupWindow popupWindow;
    private final boolean shouldDismissByOutsideTouch;

    @Nullable
    private final List<C0892k0> tapOutsideActions;

    @NotNull
    private final View tooltipView;

    public PopupWindowTouchListener(@NotNull PopupWindow popupWindow, @NotNull View tooltipView, boolean z4, boolean z5, @Nullable List<C0892k0> list, @NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(popupWindow, "popupWindow");
        Intrinsics.checkNotNullParameter(tooltipView, "tooltipView");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        this.popupWindow = popupWindow;
        this.tooltipView = tooltipView;
        this.isModal = z4;
        this.shouldDismissByOutsideTouch = z5;
        this.tapOutsideActions = list;
        this.bindingContext = bindingContext;
        this.hitRect = new Rect();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.tooltipView.getHitRect(this.hitRect);
        int i4 = 0;
        if (this.hitRect.contains((int) event.getX(), (int) event.getY())) {
            return false;
        }
        if (event.getAction() == 1) {
            List<C0892k0> list = this.tapOutsideActions;
            if (list != null) {
                ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
                Div2View divView = this.bindingContext.getDivView();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) ((C0892k0) obj).f6753b.evaluate(expressionResolver)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    divView.getDiv2Component$div_release().getActionHandler().handleActionWithReason((C0892k0) obj2, divView, expressionResolver, c9.f15700d);
                }
            }
            if (this.shouldDismissByOutsideTouch) {
                this.popupWindow.dismiss();
            }
        }
        return this.isModal;
    }
}
