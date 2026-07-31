package com.yandex.div.core.view2;

import O1.Xb;
import O1.Z;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import h2.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class SightActionIsEnabledObserver$observe$2$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ Xb $action;
    final /* synthetic */ Z $div;
    final /* synthetic */ Div2View $div2View;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $view;
    final /* synthetic */ SightActionIsEnabledObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SightActionIsEnabledObserver$observe$2$1(SightActionIsEnabledObserver sightActionIsEnabledObserver, Div2View div2View, ExpressionResolver expressionResolver, View view, Z z4, Xb xb) {
        super(1);
        this.this$0 = sightActionIsEnabledObserver;
        this.$div2View = div2View;
        this.$resolver = expressionResolver;
        this.$view = view;
        this.$div = z4;
        this.$action = xb;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        p pVar;
        p pVar2;
        if (z4) {
            pVar2 = this.this$0.onEnable;
            pVar2.invoke(this.$div2View, this.$resolver, this.$view, this.$div, this.$action);
        } else {
            pVar = this.this$0.onDisable;
            pVar.invoke(this.$div2View, this.$resolver, this.$view, this.$div, this.$action);
        }
    }
}
