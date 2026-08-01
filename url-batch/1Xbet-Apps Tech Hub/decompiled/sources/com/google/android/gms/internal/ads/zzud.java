package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzud extends zzty {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzud(zzda zzdaVar, Object obj, Object obj2) {
        super(zzdaVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzud zzq(zzbs zzbsVar) {
        return new zzud(new zzue(zzbsVar), zzcz.zza, zzd);
    }

    public static zzud zzr(zzda zzdaVar, Object obj, Object obj2) {
        return new zzud(zzdaVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzda
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzda
    public final zzcx zzd(int i, zzcx zzcxVar, boolean z) {
        this.zzc.zzd(i, zzcxVar, z);
        if (zzfs.zzF(zzcxVar.zzc, this.zzf) && z) {
            zzcxVar.zzc = zzd;
        }
        return zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzda
    public final zzcz zze(int i, zzcz zzczVar, long j) {
        this.zzc.zze(i, zzczVar, j);
        if (zzfs.zzF(zzczVar.zzc, this.zze)) {
            zzczVar.zzc = zzcz.zza;
        }
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzda
    public final Object zzf(int i) {
        Object zzf = this.zzc.zzf(i);
        return zzfs.zzF(zzf, this.zzf) ? zzd : zzf;
    }

    public final zzud zzp(zzda zzdaVar) {
        return new zzud(zzdaVar, this.zze, this.zzf);
    }
}
