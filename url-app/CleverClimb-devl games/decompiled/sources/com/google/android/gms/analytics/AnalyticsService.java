package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcy;

/* loaded from: classes.dex */
public final class AnalyticsService extends Service implements zzcy {
    private zzcu<AnalyticsService> zzqj;

    private final zzcu<AnalyticsService> zzj() {
        if (this.zzqj == null) {
            this.zzqj = new zzcu<>(this);
        }
        return this.zzqj;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        zzj();
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzj().onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzj().onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return zzj().onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zza(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }
}
