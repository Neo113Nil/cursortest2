package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import android.view.View;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$bindDoubleTapActions$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ Expression<Boolean> $captureFocusOnAction;
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ C0892k0 $menuAction;
    final /* synthetic */ OverflowMenuWrapper $overflowMenuWrapper;
    final /* synthetic */ View $target;
    final /* synthetic */ DivActionBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$bindDoubleTapActions$1$1(DivActionBinder divActionBinder, BindingContext bindingContext, View view, C0892k0 c0892k0, Expression<Boolean> expression, OverflowMenuWrapper overflowMenuWrapper) {
        super(0);
        this.this$0 = divActionBinder;
        this.$context = bindingContext;
        this.$target = view;
        this.$menuAction = c0892k0;
        this.$captureFocusOnAction = expression;
        this.$overflowMenuWrapper = overflowMenuWrapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m69invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m69invoke() {
        Div2Logger div2Logger;
        DivActionBeaconSender divActionBeaconSender;
        div2Logger = this.this$0.logger;
        div2Logger.logDoubleClick(this.$context.getDivView(), this.$context.getExpressionResolver(), this.$target, this.$menuAction);
        divActionBeaconSender = this.this$0.divActionBeaconSender;
        divActionBeaconSender.sendTapActionBeacon(this.$menuAction, this.$context.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(this.$target, this.$captureFocusOnAction, this.$context.getDivView().getInputFocusTracker$div_release(), this.$context.getExpressionResolver());
        this.$overflowMenuWrapper.getOnMenuClickListener().onClick(this.$target);
    }
}
