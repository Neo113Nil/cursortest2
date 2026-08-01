package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzvp implements zzuw {
    private final zzgp zzc;
    private int zzd;
    private final zzvo zze;
    private final zzyr zzf;
    private final zzri zzg;

    public zzvp(zzgp zzgpVar, zzvo zzvoVar) {
        zzri zzriVar = new zzri();
        zzyr zzyrVar = new zzyr();
        this.zzc = zzgpVar;
        this.zze = zzvoVar;
        this.zzg = zzriVar;
        this.zzf = zzyrVar;
        this.zzd = 1048576;
    }

    public final zzvp zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzvr zzb(zzbs zzbsVar) {
        zzbsVar.zzd.getClass();
        return new zzvr(zzbsVar, this.zzc, this.zze, zzrr.zza, this.zzf, this.zzd, null);
    }
}
