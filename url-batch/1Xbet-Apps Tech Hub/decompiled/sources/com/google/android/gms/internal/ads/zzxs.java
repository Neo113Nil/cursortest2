package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzxs {
    public final int zza;
    public final zzdc zzb;
    public final int zzc;
    public final zzam zzd;

    public zzxs(int i, zzdc zzdcVar, int i2) {
        this.zza = i;
        this.zzb = zzdcVar;
        this.zzc = i2;
        this.zzd = zzdcVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzxs zzxsVar);
}
