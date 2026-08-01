package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzlw extends zzty {
    private final zzcz zzd;

    zzlw(zzlx zzlxVar, zzda zzdaVar) {
        super(zzdaVar);
        this.zzd = new zzcz();
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzda
    public final zzcx zzd(int i, zzcx zzcxVar, boolean z) {
        zzcx zzd = this.zzc.zzd(i, zzcxVar, z);
        if (this.zzc.zze(zzd.zzd, this.zzd, 0L).zzb()) {
            Object obj = zzcxVar.zzb;
            Object obj2 = zzcxVar.zzc;
            int i2 = zzcxVar.zzd;
            long j = zzcxVar.zze;
            long j2 = zzcxVar.zzf;
            zzd.zzl(obj, obj2, i2, j, 0L, zzd.zza, true);
        } else {
            zzd.zzg = true;
        }
        return zzd;
    }
}
