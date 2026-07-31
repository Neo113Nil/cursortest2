package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Ticker$runEndlessTimer$1 extends s implements Function0<Unit> {
    final /* synthetic */ Ticker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ticker$runEndlessTimer$1(Ticker ticker) {
        super(0);
        this.this$0 = ticker;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m40invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m40invoke() {
        this.this$0.coercedTick();
    }
}
