package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzyf {
    public final int zza;
    public final zzmc[] zzb;
    public final zzxy[] zzc;
    public final zzdn zzd;
    public final Object zze;

    public zzyf(zzmc[] zzmcVarArr, zzxy[] zzxyVarArr, zzdn zzdnVar, Object obj) {
        this.zzb = zzmcVarArr;
        this.zzc = (zzxy[]) zzxyVarArr.clone();
        this.zzd = zzdnVar;
        this.zze = obj;
        this.zza = zzmcVarArr.length;
    }

    public final boolean zza(zzyf zzyfVar, int i) {
        return zzyfVar != null && zzfs.zzF(this.zzb[i], zzyfVar.zzb[i]) && zzfs.zzF(this.zzc[i], zzyfVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
