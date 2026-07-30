package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhtv {
    private static final BigInteger zze;
    private static final BigInteger zzf;

    @Nullable
    private Integer zza = null;

    @Nullable
    private BigInteger zzb = zzhty.zza;

    @Nullable
    private zzhtw zzc = null;
    private zzhtx zzd = zzhtx.zzd;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        zze = valueOf;
        zzf = valueOf.pow(256);
    }

    private zzhtv() {
    }

    public final zzhtv zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhtv zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhtv zzc(zzhtx zzhtxVar) {
        this.zzd = zzhtxVar;
        return this;
    }

    public final zzhtv zzd(zzhtw zzhtwVar) {
        this.zzc = zzhtwVar;
        return this;
    }

    public final zzhty zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        BigInteger bigInteger = this.zzb;
        int compareTo = bigInteger.compareTo(zzhty.zza);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhty(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    /* synthetic */ zzhtv(byte[] bArr) {
    }
}
