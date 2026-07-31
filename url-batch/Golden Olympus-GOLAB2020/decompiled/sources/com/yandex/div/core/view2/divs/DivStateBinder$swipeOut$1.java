package com.yandex.div.core.view2.divs;

import O1.C0892k0;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStateBinder$swipeOut$1 extends s implements Function0<Unit> {
    final /* synthetic */ List<C0892k0> $actions;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivStateLayout $this_swipeOut;
    final /* synthetic */ DivStateBinder this$0;

    @Metadata
    /* renamed from: com.yandex.div.core.view2.divs.DivStateBinder$swipeOut$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<C0892k0, Unit> {
        final /* synthetic */ Div2View $divView;
        final /* synthetic */ ExpressionResolver $resolver;
        final /* synthetic */ DivStateLayout $this_swipeOut;
        final /* synthetic */ DivStateBinder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DivStateBinder divStateBinder, Div2View div2View, ExpressionResolver expressionResolver, DivStateLayout divStateLayout) {
            super(1);
            this.this$0 = divStateBinder;
            this.$divView = div2View;
            this.$resolver = expressionResolver;
            this.$this_swipeOut = divStateLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C0892k0) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull C0892k0 it) {
            Div2Logger div2Logger;
            DivActionBeaconSender divActionBeaconSender;
            Intrinsics.checkNotNullParameter(it, "it");
            div2Logger = this.this$0.div2Logger;
            div2Logger.logSwipedAway(this.$divView, this.$resolver, this.$this_swipeOut, it);
            divActionBeaconSender = this.this$0.divActionBeaconSender;
            divActionBeaconSender.sendSwipeOutActionBeacon(it, this.$resolver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStateBinder$swipeOut$1(DivStateBinder divStateBinder, Div2View div2View, ExpressionResolver expressionResolver, List<C0892k0> list, DivStateLayout divStateLayout) {
        super(0);
        this.this$0 = divStateBinder;
        this.$divView = div2View;
        this.$resolver = expressionResolver;
        this.$actions = list;
        this.$this_swipeOut = divStateLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m129invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m129invoke() {
        DivActionBinder divActionBinder;
        divActionBinder = this.this$0.divActionBinder;
        Div2View div2View = this.$divView;
        ExpressionResolver expressionResolver = this.$resolver;
        divActionBinder.handleActions$div_release(div2View, expressionResolver, this.$actions, "state_swipe_out", new AnonymousClass1(this.this$0, div2View, expressionResolver, this.$this_swipeOut));
    }
}
