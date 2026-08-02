package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeaf extends zzeai {
    private zzbuc zzh;

    zzeaf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            try {
                this.zzd.zzp().zzf(this.zzh, new zzeah(this));
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyp(1));
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.zza.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeai, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        com.google.android.gms.ads.internal.util.client.zzm.zze(format);
        this.zza.zzd(new zzdyp(1, format));
    }

    public final synchronized ListenableFuture zza(zzbuc zzbucVar, long j) {
        if (this.zzb) {
            return zzgcj.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbucVar;
        zzb();
        ListenableFuture zzo = zzgcj.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // java.lang.Runnable
            public final void run() {
                zzeaf.this.zzc();
            }
        }, zzbzo.zzf);
        return zzo;
    }
}
