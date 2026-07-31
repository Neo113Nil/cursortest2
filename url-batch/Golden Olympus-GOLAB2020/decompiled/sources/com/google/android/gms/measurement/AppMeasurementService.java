package com.google.android.gms.measurement;

import Z.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzof;
import com.google.android.gms.measurement.internal.zzog;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements zzof {
    private zzog zza;

    private final zzog zzd() {
        if (this.zza == null) {
            this.zza = new zzog(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return zzd().zzb(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zzf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzg();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        zzd();
        zzog.zzi(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        zzd().zza(intent, i4, i5);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        zzd();
        zzog.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zza(Intent intent) {
        a.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final void zzb(JobParameters jobParameters, boolean z4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzof
    public final boolean zzc(int i4) {
        return stopSelfResult(i4);
    }
}
