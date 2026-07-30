package com.onesignal.inAppMessages.internal.triggers.impl;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String triggerId, long j9) {
        h.e(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("scheduleTrigger: " + triggerId + " delay: " + j9, null, 2, null);
        new Timer("trigger_timer:".concat(triggerId)).schedule(timerTask, j9);
    }
}
