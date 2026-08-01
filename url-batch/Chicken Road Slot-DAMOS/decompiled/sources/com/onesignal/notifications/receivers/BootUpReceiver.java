package com.onesignal.notifications.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import v9.c;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class BootUpReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (c.b(applicationContext)) {
            ((lc.c) c.a().getService(lc.c.class)).beginEnqueueingWork(context, true);
        }
    }
}
