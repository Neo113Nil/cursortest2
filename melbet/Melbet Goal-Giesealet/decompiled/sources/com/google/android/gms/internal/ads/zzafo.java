package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzafo extends zzadj {
    final /* synthetic */ zzadv zza;
    final /* synthetic */ zzafp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzafo(zzafp zzafpVar, zzadv zzadvVar, zzadv zzadvVar2) {
        super(zzadvVar);
        this.zza = zzadvVar2;
        Objects.requireNonNull(zzafpVar);
        this.zzb = zzafpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadj, com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        zzadt zzc = this.zza.zzc(j);
        zzadw zzadwVar = zzc.zza;
        long j2 = zzadwVar.zzb;
        zzafp zzafpVar = this.zzb;
        zzadw zzadwVar2 = new zzadw(j2, zzadwVar.zzc + zzafpVar.zza());
        zzadw zzadwVar3 = zzc.zzb;
        return new zzadt(zzadwVar2, new zzadw(zzadwVar3.zzb, zzadwVar3.zzc + zzafpVar.zza()));
    }
}
