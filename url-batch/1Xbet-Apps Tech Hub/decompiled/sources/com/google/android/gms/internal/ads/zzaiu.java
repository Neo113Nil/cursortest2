package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaiu implements zzade {
    final /* synthetic */ zzaiv zza;

    /* synthetic */ zzaiu(zzaiv zzaivVar, zzait zzaitVar) {
        this.zza = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        zzajh zzajhVar;
        long j;
        zzaiv zzaivVar = this.zza;
        zzajhVar = zzaivVar.zzd;
        j = zzaivVar.zzf;
        return zzajhVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        zzajh zzajhVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaiv zzaivVar = this.zza;
        zzajhVar = zzaivVar.zzd;
        long zzg = zzajhVar.zzg(j);
        j2 = zzaivVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaiv zzaivVar2 = this.zza;
        j3 = zzaivVar2.zzc;
        j4 = zzaivVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = this.zza.zzf;
        long longValue = j2 + multiply.divide(BigInteger.valueOf(j5)).longValue();
        zzaiv zzaivVar3 = this.zza;
        j6 = zzaivVar3.zzb;
        j7 = zzaivVar3.zzc;
        zzadf zzadfVar = new zzadf(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new zzadc(zzadfVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }
}
