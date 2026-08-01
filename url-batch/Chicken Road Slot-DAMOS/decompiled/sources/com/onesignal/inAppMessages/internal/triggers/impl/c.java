package com.onesignal.inAppMessages.internal.triggers.impl;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String str, long j) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.debug$default("scheduleTrigger: " + str + " delay: " + j, null, 2, null);
        new Timer(v4.a.k("trigger_timer:", str)).schedule(timerTask, j);
    }
}
