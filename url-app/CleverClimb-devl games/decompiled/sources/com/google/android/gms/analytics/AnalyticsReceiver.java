package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzct;

/* loaded from: classes.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    private zzct zzqk;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zzqk == null) {
            this.zzqk = new zzct();
        }
        zzct.onReceive(context, intent);
    }
}
