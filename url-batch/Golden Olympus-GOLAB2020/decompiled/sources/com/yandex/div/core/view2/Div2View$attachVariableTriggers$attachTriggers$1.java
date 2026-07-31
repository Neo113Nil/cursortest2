package com.yandex.div.core.view2;

import O1.C1165z4;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$attachVariableTriggers$attachTriggers$1 extends s implements Function0<Unit> {
    final /* synthetic */ C1165z4.c $state;
    final /* synthetic */ Div2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$attachVariableTriggers$attachTriggers$1(Div2View div2View, C1165z4.c cVar) {
        super(0);
        this.this$0 = div2View;
        this.$state = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m57invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m57invoke() {
        DivRuntimeVisitor runtimeVisitor = this.this$0.getViewComponent$div_release().getRuntimeVisitor();
        C1165z4.c cVar = this.$state;
        runtimeVisitor.createAndAttachRuntimes(cVar.f8721a, DivStatePath.Companion.fromState$div_release(cVar), this.this$0);
    }
}
