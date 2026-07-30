package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzalh implements zzafy {
    final /* synthetic */ zzali zza;

    /* synthetic */ zzalh(zzali zzaliVar, byte[] bArr) {
        Objects.requireNonNull(zzaliVar);
        this.zza = zzaliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        zzali zzaliVar = this.zza;
        return zzaliVar.zzf().zzh(zzaliVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzali zzaliVar = this.zza;
        long zzd = zzaliVar.zzd() + BigInteger.valueOf(zzaliVar.zzf().zzi(j)).multiply(BigInteger.valueOf(zzaliVar.zze() - zzaliVar.zzd())).divide(BigInteger.valueOf(zzaliVar.zzg())).longValue();
        String str = zzfj.zza;
        zzafz zzafzVar = new zzafz(j, Math.max(zzaliVar.zzd(), Math.min(zzd - 30000, zzaliVar.zze() - 1)));
        return new zzafw(zzafzVar, zzafzVar);
    }
}
