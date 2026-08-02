package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzafb extends zzacx {
    final /* synthetic */ zzadi zza;
    final /* synthetic */ zzafc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzafb(zzafc zzafcVar, zzadi zzadiVar, zzadi zzadiVar2) {
        super(zzadiVar);
        this.zza = zzadiVar2;
        this.zzb = zzafcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacx, com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        long j2;
        long j3;
        zzadg zzg = this.zza.zzg(j);
        zzadj zzadjVar = zzg.zza;
        long j4 = zzadjVar.zzc;
        j2 = this.zzb.zzb;
        zzadj zzadjVar2 = new zzadj(zzadjVar.zzb, j4 + j2);
        zzadj zzadjVar3 = zzg.zzb;
        long j5 = zzadjVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzadg(zzadjVar2, new zzadj(zzadjVar3.zzb, j5 + j3));
    }
}
