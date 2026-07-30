package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcmh implements zzikg {
    private final zzcmc zza;

    private zzcmh(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
    }

    public static zzcmh zzc(zzcmc zzcmcVar) {
        return new zzcmh(zzcmcVar);
    }

    public static Context zzd(zzcmc zzcmcVar) {
        Context zzb = zzcmcVar.zzb();
        zziko.zzb(zzb);
        return zzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
