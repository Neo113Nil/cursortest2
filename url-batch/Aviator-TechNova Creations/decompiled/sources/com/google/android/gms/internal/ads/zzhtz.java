package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhtz {

    @Nullable
    private zzhuc zza = null;

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

    private zzhtz() {
    }

    /* synthetic */ zzhtz(byte[] bArr) {
    }

    public final zzhtz zza(zzhuc zzhucVar) {
        this.zza = zzhucVar;
        return this;
    }

    public final zzhtz zzb(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zzc = zzhyfVar;
        this.zzd = zzhyfVar2;
        return this;
    }

    public final zzhtz zzc(zzhyf zzhyfVar) {
        this.zzb = zzhyfVar;
        return this;
    }

    public final zzhtz zzd(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zze = zzhyfVar;
        this.zzf = zzhyfVar2;
        return this;
    }

    public final zzhtz zze(zzhyf zzhyfVar) {
        this.zzg = zzhyfVar;
        return this;
    }

    public final zzhua zzf() throws GeneralSecurityException {
        zzhuc zzhucVar = this.zza;
        if (zzhucVar == null) {
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
        BigInteger zzd = zzhucVar.zzf().zzd();
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
            return new zzhua(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
