package com.yandex.div.core.view2.divs;

import O1.C0839h0;
import O1.C0892k0;
import O1.C1127x2;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$bindDivActions$onApply$1 extends s implements Function0<Unit> {
    final /* synthetic */ C0839h0 $accessibility;
    final /* synthetic */ C1127x2 $actionAnimation;
    final /* synthetic */ List<C0892k0> $actions;
    final /* synthetic */ Expression<Boolean> $captureFocusOnAction;
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ List<C0892k0> $doubleTapActions;
    final /* synthetic */ List<C0892k0> $hoverEndActions;
    final /* synthetic */ List<C0892k0> $hoverStartActions;
    final /* synthetic */ List<C0892k0> $longTapActions;
    final /* synthetic */ List<C0892k0> $pressEndActions;
    final /* synthetic */ List<C0892k0> $pressStartActions;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $target;
    final /* synthetic */ DivActionBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$bindDivActions$onApply$1(List<C0892k0> list, ExpressionResolver expressionResolver, List<C0892k0> list2, List<C0892k0> list3, List<C0892k0> list4, List<C0892k0> list5, List<C0892k0> list6, List<C0892k0> list7, DivActionBinder divActionBinder, BindingContext bindingContext, View view, C1127x2 c1127x2, C0839h0 c0839h0, Expression<Boolean> expression) {
        super(0);
        this.$actions = list;
        this.$resolver = expressionResolver;
        this.$doubleTapActions = list2;
        this.$longTapActions = list3;
        this.$hoverStartActions = list4;
        this.$hoverEndActions = list5;
        this.$pressStartActions = list6;
        this.$pressEndActions = list7;
        this.this$0 = divActionBinder;
        this.$context = bindingContext;
        this.$target = view;
        this.$actionAnimation = c1127x2;
        this.$accessibility = c0839h0;
        this.$captureFocusOnAction = expression;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m68invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m68invoke() {
        List onlyEnabled;
        List onlyEnabled2;
        List onlyEnabled3;
        List onlyEnabled4;
        List onlyEnabled5;
        List onlyEnabled6;
        List onlyEnabled7;
        onlyEnabled = DivActionBinderKt.onlyEnabled(this.$actions, this.$resolver);
        onlyEnabled2 = DivActionBinderKt.onlyEnabled(this.$doubleTapActions, this.$resolver);
        onlyEnabled3 = DivActionBinderKt.onlyEnabled(this.$longTapActions, this.$resolver);
        onlyEnabled4 = DivActionBinderKt.onlyEnabled(this.$hoverStartActions, this.$resolver);
        onlyEnabled5 = DivActionBinderKt.onlyEnabled(this.$hoverEndActions, this.$resolver);
        onlyEnabled6 = DivActionBinderKt.onlyEnabled(this.$pressStartActions, this.$resolver);
        onlyEnabled7 = DivActionBinderKt.onlyEnabled(this.$pressEndActions, this.$resolver);
        this.this$0.applyDivActions(this.$context, this.$target, onlyEnabled, onlyEnabled3, onlyEnabled2, onlyEnabled4, onlyEnabled5, onlyEnabled6, onlyEnabled7, this.$actionAnimation, this.$accessibility, this.$captureFocusOnAction);
    }
}
