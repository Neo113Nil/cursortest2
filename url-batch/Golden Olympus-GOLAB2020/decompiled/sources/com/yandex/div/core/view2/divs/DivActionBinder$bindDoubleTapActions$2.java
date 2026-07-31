package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.Expression;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivActionBinder$bindDoubleTapActions$2 extends s implements Function0<Unit> {
    final /* synthetic */ List<C0892k0> $actions;
    final /* synthetic */ Expression<Boolean> $captureFocusOnAction;
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ View $target;
    final /* synthetic */ DivActionBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionBinder$bindDoubleTapActions$2(View view, Expression<Boolean> expression, BindingContext bindingContext, DivActionBinder divActionBinder, List<C0892k0> list) {
        super(0);
        this.$target = view;
        this.$captureFocusOnAction = expression;
        this.$context = bindingContext;
        this.this$0 = divActionBinder;
        this.$actions = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m70invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m70invoke() {
        DivActionBinderKt.captureFocusIfNeeded(this.$target, this.$captureFocusOnAction, this.$context.getDivView().getInputFocusTracker$div_release(), this.$context.getExpressionResolver());
        this.this$0.handleBulkActions$div_release(this.$context, this.$target, this.$actions, "double_click");
    }
}
