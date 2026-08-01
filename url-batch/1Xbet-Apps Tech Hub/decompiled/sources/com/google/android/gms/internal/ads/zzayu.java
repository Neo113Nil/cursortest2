package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzayu {
    final /* synthetic */ zzayv zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzayu(zzayv zzayvVar, byte[] bArr, zzayt zzaytVar) {
        this.zza = zzayvVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzayv zzayvVar = this.zza;
            if (zzayvVar.zzb) {
                zzayvVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzcbn.zzf("Clearcut log failed", e);
        }
    }

    public final zzayu zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        ExecutorService executorService;
        executorService = this.zza.zzc;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzays
            @Override // java.lang.Runnable
            public final void run() {
                zzayu.this.zzd();
            }
        });
    }
}
