package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzqk {
    private boolean zzb;
    private zzqm zzd;
    private zzqd zze;
    private zzox zza = zzox.zza;
    private final zzqj zzc = zzqj.zza;

    @Deprecated
    public zzqk() {
    }

    @Deprecated
    public final zzqk zzc(zzox zzoxVar) {
        this.zza = zzoxVar;
        return this;
    }

    public final zzqk zzd(zzdy[] zzdyVarArr) {
        this.zzd = new zzqm(zzdyVarArr);
        return this;
    }

    public final zzqw zze() {
        zzef.zzf(!this.zzb);
        this.zzb = true;
        if (this.zzd == null) {
            this.zzd = new zzqm(new zzdy[0]);
        }
        zzqv zzqvVar = null;
        if (this.zze == null) {
            this.zze = new zzqd(null);
        }
        return new zzqw(this, zzqvVar);
    }
}
