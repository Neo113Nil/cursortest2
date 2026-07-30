package com.onesignal.inAppMessages.internal.triggers.impl;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import r4.f;

/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String triggerId, long j) {
        Intrinsics.checkNotNullParameter(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("scheduleTrigger: " + triggerId + " delay: " + j, null, 2, null);
        new Timer(f.i("trigger_timer:", triggerId)).schedule(timerTask, j);
    }
}
