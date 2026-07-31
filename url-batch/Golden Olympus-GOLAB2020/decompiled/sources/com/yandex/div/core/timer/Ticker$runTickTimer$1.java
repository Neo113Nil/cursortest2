package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Ticker$runTickTimer$1 extends s implements Function0<Unit> {
    final /* synthetic */ long $duration;
    final /* synthetic */ long $interval;
    final /* synthetic */ Function0<Unit> $processTick;
    final /* synthetic */ F $ticksLeft;
    final /* synthetic */ Ticker this$0;

    @Metadata
    /* renamed from: com.yandex.div.core.timer.Ticker$runTickTimer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $processTick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$processTick = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
            this.$processTick.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ticker$runTickTimer$1(long j4, Ticker ticker, F f4, long j5, Function0<Unit> function0) {
        super(0);
        this.$duration = j4;
        this.this$0 = ticker;
        this.$ticksLeft = f4;
        this.$interval = j5;
        this.$processTick = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m41invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m41invoke() {
        long totalWorkTime;
        long j4 = this.$duration;
        totalWorkTime = this.this$0.getTotalWorkTime();
        long j5 = j4 - totalWorkTime;
        this.this$0.coercedTick();
        F f4 = this.$ticksLeft;
        f4.f41131b--;
        if (1 <= j5 && j5 < this.$interval) {
            this.this$0.cleanTicker();
            Ticker.setupTimer$default(this.this$0, j5, 0L, new AnonymousClass1(this.$processTick), 2, null);
        } else if (j5 <= 0) {
            this.$processTick.invoke();
        }
    }
}
