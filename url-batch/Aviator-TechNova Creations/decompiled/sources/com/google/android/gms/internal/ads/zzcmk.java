package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcmk implements zzikg {
    private final zzcmc zza;

    private zzcmk(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmk zzc(zzcmc zzcmcVar) {
        return new zzcmk(zzcmcVar);
    }

    public static WeakReference zzd(zzcmc zzcmcVar) {
        WeakReference zzc = zzcmcVar.zzc();
        zziko.zzb(zzc);
        return zzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
