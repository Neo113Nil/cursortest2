package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.debug.internal.logging.Logging;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DynamicTriggerTimer {
    public static final DynamicTriggerTimer INSTANCE = new DynamicTriggerTimer();

    private DynamicTriggerTimer() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String triggerId, long j2) {
        i.e(triggerId, "triggerId");
        Logging.debug$default("scheduleTrigger: " + triggerId + " delay: " + j2, null, 2, null);
        new Timer("trigger_timer:".concat(triggerId)).schedule(timerTask, j2);
    }
}
