package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzako implements zzakx {
    private zzam zza;
    private zzfq zzb;
    private zzadk zzc;

    public zzako(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzU(str);
        this.zza = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final void zza(zzfj zzfjVar) {
        zzef.zzb(this.zzb);
        int i = zzfs.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd == -9223372036854775807L || zze == -9223372036854775807L) {
            return;
        }
        zzam zzamVar = this.zza;
        if (zze != zzamVar.zzq) {
            zzak zzb = zzamVar.zzb();
            zzb.zzY(zze);
            zzam zzac = zzb.zzac();
            this.zza = zzac;
            this.zzc.zzl(zzac);
        }
        int zza = zzfjVar.zza();
        this.zzc.zzr(zzfjVar, zza);
        this.zzc.zzt(zzd, 1, zza, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final void zzb(zzfq zzfqVar, zzach zzachVar, zzalk zzalkVar) {
        this.zzb = zzfqVar;
        zzalkVar.zzc();
        zzadk zzw = zzachVar.zzw(zzalkVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
