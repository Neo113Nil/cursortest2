package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzage extends zzafj {
    final /* synthetic */ zzafy zza;
    final /* synthetic */ zzagf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzage(zzagf zzagfVar, zzafy zzafyVar, zzafy zzafyVar2) {
        super(zzafyVar);
        this.zza = zzafyVar2;
        Objects.requireNonNull(zzagfVar);
        this.zzb = zzagfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzafw zzc = this.zza.zzc(j);
        zzafz zzafzVar = zzc.zza;
        long j2 = zzafzVar.zzb;
        zzagf zzagfVar = this.zzb;
        zzafz zzafzVar2 = new zzafz(j2, zzafzVar.zzc + zzagfVar.zza());
        zzafz zzafzVar3 = zzc.zzb;
        return new zzafw(zzafzVar2, new zzafz(zzafzVar3.zzb, zzafzVar3.zzc + zzagfVar.zza()));
    }
}
