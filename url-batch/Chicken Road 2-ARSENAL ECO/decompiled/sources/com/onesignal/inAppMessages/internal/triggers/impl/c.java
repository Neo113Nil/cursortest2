package com.onesignal.inAppMessages.internal.triggers.impl;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String triggerId, long j4) {
        i.e(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("scheduleTrigger: " + triggerId + " delay: " + j4, null, 2, null);
        new Timer("trigger_timer:".concat(triggerId)).schedule(timerTask, j4);
    }
}
