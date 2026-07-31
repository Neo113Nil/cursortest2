package com.yandex.div.core.view2.divs.pager;

import O1.C0892k0;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ List<C0892k0> $actions;
    final /* synthetic */ DivItemBuilderResult $item;
    final /* synthetic */ PagerSelectedActionsDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1(PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher, DivItemBuilderResult divItemBuilderResult, List<C0892k0> list) {
        super(0);
        this.this$0 = pagerSelectedActionsDispatcher;
        this.$item = divItemBuilderResult;
        this.$actions = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m150invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m150invoke() {
        DivActionBinder divActionBinder;
        Div2View div2View;
        divActionBinder = this.this$0.divActionBinder;
        div2View = this.this$0.divView;
        DivActionBinder.handleActions$div_release$default(divActionBinder, div2View, this.$item.getExpressionResolver(), this.$actions, "selection", null, 16, null);
    }
}
