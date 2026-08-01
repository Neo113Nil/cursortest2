package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaey extends zzact {
    final /* synthetic */ zzade zza;
    final /* synthetic */ zzaez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaey(zzaez zzaezVar, zzade zzadeVar, zzade zzadeVar2) {
        super(zzadeVar);
        this.zzb = zzaezVar;
        this.zza = zzadeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzact, com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        long j2;
        long j3;
        zzadc zzg = this.zza.zzg(j);
        zzadf zzadfVar = zzg.zza;
        long j4 = zzadfVar.zzc;
        j2 = this.zzb.zzb;
        zzadf zzadfVar2 = new zzadf(zzadfVar.zzb, j4 + j2);
        zzadf zzadfVar3 = zzg.zzb;
        long j5 = zzadfVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzadc(zzadfVar2, new zzadf(zzadfVar3.zzb, j5 + j3));
    }
}
