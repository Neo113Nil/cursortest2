package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivStateBinder$bind$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ List<C0892k0> $it;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivStateLayout $this_bind;
    final /* synthetic */ DivStateBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStateBinder$bind$1$1(DivStateBinder divStateBinder, DivStateLayout divStateLayout, BindingContext bindingContext, ExpressionResolver expressionResolver, List<C0892k0> list) {
        super(0);
        this.this$0 = divStateBinder;
        this.$this_bind = divStateLayout;
        this.$context = bindingContext;
        this.$resolver = expressionResolver;
        this.$it = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m127invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m127invoke() {
        this.this$0.swipeOut(this.$this_bind, this.$context.getDivView(), this.$resolver, this.$it);
    }
}
