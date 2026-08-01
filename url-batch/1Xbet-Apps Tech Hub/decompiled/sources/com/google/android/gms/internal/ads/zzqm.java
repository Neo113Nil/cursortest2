package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzqm {
    private final zzdy[] zza;
    private final zzre zzb;
    private final zzeb zzc;

    public zzqm(zzdy... zzdyVarArr) {
        zzre zzreVar = new zzre();
        zzeb zzebVar = new zzeb();
        zzdy[] zzdyVarArr2 = {zzreVar, zzebVar};
        this.zza = zzdyVarArr2;
        System.arraycopy(zzdyVarArr, 0, zzdyVarArr2, 0, 0);
        this.zzb = zzreVar;
        this.zzc = zzebVar;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzcj zzc(zzcj zzcjVar) {
        this.zzc.zzk(zzcjVar.zzc);
        this.zzc.zzj(zzcjVar.zzd);
        return zzcjVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzdy[] zze() {
        return this.zza;
    }
}
