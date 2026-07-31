package com.google.android.gms.measurement;

import Z.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzhx;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements zzhx.zza {
    private zzhx zza;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx.zza
    public void doStartService(Context context, Intent intent) {
        a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzhx(this);
        }
        this.zza.zza(context, intent);
    }
}
