package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class TimerController$ticker$2 extends p implements Function1<Long, Unit> {
    TimerController$ticker$2(Object obj) {
        super(1, obj, TimerController.class, "updateTimerVariable", "updateTimerVariable(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        ((TimerController) this.receiver).updateTimerVariable(j4);
    }
}
