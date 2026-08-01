package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzadu implements zzade {
    final /* synthetic */ zzadx zza;
    private final long zzb;

    public zzadu(zzadx zzadxVar, long j) {
        this.zza = zzadxVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        zzaea[] zzaeaVarArr;
        zzaea[] zzaeaVarArr2;
        zzaea[] zzaeaVarArr3;
        zzaeaVarArr = this.zza.zzg;
        zzadc zza = zzaeaVarArr[0].zza(j);
        int i = 1;
        while (true) {
            zzadx zzadxVar = this.zza;
            zzaeaVarArr2 = zzadxVar.zzg;
            if (i >= zzaeaVarArr2.length) {
                return zza;
            }
            zzaeaVarArr3 = zzadxVar.zzg;
            zzadc zza2 = zzaeaVarArr3[i].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
