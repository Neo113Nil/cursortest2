package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhir {
    static final zzhir zzd = new zzhir(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    zzhir(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
