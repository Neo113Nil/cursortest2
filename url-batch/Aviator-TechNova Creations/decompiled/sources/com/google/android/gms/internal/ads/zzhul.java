package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhul {

    @Nullable
    private zzhuo zza = null;

    @Nullable
    private zzhyf zzb = null;

    @Nullable
    private zzhyf zzc = null;

    @Nullable
    private zzhyf zzd = null;

    @Nullable
    private zzhyf zze = null;

    @Nullable
    private zzhyf zzf = null;

    @Nullable
    private zzhyf zzg = null;

    private zzhul() {
    }

    /* synthetic */ zzhul(byte[] bArr) {
    }

    public final zzhul zza(zzhuo zzhuoVar) {
        this.zza = zzhuoVar;
        return this;
    }

    public final zzhul zzb(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zzc = zzhyfVar;
        this.zzd = zzhyfVar2;
        return this;
    }

    public final zzhul zzc(zzhyf zzhyfVar) {
        this.zzb = zzhyfVar;
        return this;
    }

    public final zzhul zzd(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zze = zzhyfVar;
        this.zzf = zzhyfVar2;
        return this;
    }

    public final zzhul zze(zzhyf zzhyfVar) {
        this.zzg = zzhyfVar;
        return this;
    }

    public final zzhum zzf() throws GeneralSecurityException {
        zzhuo zzhuoVar = this.zza;
        if (zzhuoVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger zzd = zzhuoVar.zzf().zzd();
        BigInteger zzd2 = this.zza.zzd();
        BigInteger zzb = this.zzc.zzb(zzhax.zza());
        BigInteger zzb2 = this.zzd.zzb(zzhax.zza());
        BigInteger zzb3 = this.zzb.zzb(zzhax.zza());
        BigInteger zzb4 = this.zze.zzb(zzhax.zza());
        BigInteger zzb5 = this.zzf.zzb(zzhax.zza());
        BigInteger zzb6 = this.zzg.zzb(zzhax.zza());
        if (!zzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!zzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!zzb.multiply(zzb2).equals(zzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger subtract = zzb.subtract(BigInteger.ONE);
        BigInteger subtract2 = zzb2.subtract(BigInteger.ONE);
        if (!zzd.multiply(zzb3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!zzd.multiply(zzb4).mod(subtract).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!zzd.multiply(zzb5).mod(subtract2).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (zzb2.multiply(zzb6).mod(zzb).equals(BigInteger.ONE)) {
            return new zzhum(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
