package com.yandex.div.core.timer;

import com.yandex.div.core.timer.Ticker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Ticker$runTickTimer$processTick$1 extends s implements Function0<Unit> {
    final /* synthetic */ long $duration;
    final /* synthetic */ F $ticksLeft;
    final /* synthetic */ Ticker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ticker$runTickTimer$processTick$1(F f4, Ticker ticker, long j4) {
        super(0);
        this.$ticksLeft = f4;
        this.this$0 = ticker;
        this.$duration = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m43invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m43invoke() {
        Function1 function1;
        Function1 function12;
        if (this.$ticksLeft.f41131b > 0) {
            function12 = this.this$0.onTick;
            function12.invoke(Long.valueOf(this.$duration));
        }
        function1 = this.this$0.onEnd;
        function1.invoke(Long.valueOf(this.$duration));
        this.this$0.cleanTicker();
        this.this$0.resetTickerState();
        this.this$0.state = Ticker.State.STOPPED;
    }
}
