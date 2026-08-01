package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfpu {
    final /* synthetic */ zzfpv zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfpu(zzfpv zzfpvVar, byte[] bArr, zzfpt zzfptVar) {
        this.zza = zzfpvVar;
        this.zzb = bArr;
    }

    public final zzfpu zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfpu zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfpv zzfpvVar = this.zza;
            if (zzfpvVar.zzb) {
                zzfpvVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
