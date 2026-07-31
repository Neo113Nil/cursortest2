package com.google.android.gms.stats;

import Z.a;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class GCoreWakefulBroadcastReceiver extends a {
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return a.completeWakefulIntent(intent);
    }
}
