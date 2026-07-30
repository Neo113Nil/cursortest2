package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhxz implements zzhbs {
    private final RSAPublicKey zza;
    private final zzhxn zzb;
    private final zzhxn zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    /* synthetic */ zzhxz(RSAPublicKey rSAPublicKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhie.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zzb(zzhxnVar);
        if (!zzhxnVar.equals(zzhxnVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
        zzhyc.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhxnVar;
        this.zzc = zzhxnVar2;
        this.zzd = i;
        this.zze = bArr;
        this.zzf = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] zzb = zzhig.zzb(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        zzhxn zzhxnVar = this.zzb;
        zzhyc.zzb(zzhxnVar);
        zzhxe zzhxeVar = zzhxe.zzd;
        MessageDigest messageDigest = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(zzhxnVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = zzb.length;
        int i = this.zzd;
        if (length < digestLength + i + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (zzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] copyOf = Arrays.copyOf(zzb, i3);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(zzb, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            long j = (length * 8) - bitLength3;
            if (i4 < j) {
                if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i4++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(this.zzc));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 <= (i2 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    int i7 = i;
                    messageDigest2.update(zzhig.zzb(BigInteger.valueOf(i5), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i6, Math.min(length3, i3 - i6));
                    i6 += length3;
                    i5++;
                    i = i7;
                    messageDigest2 = messageDigest2;
                }
                int i8 = i;
                byte[] bArr5 = new byte[i3];
                for (int i9 = 0; i9 < i3; i9++) {
                    bArr5[i9] = (byte) (bArr4[i9] ^ copyOf[i9]);
                }
                for (int i10 = 0; i10 <= j; i10++) {
                    int i11 = i10 / 8;
                    bArr5[i11] = (byte) ((~(1 << (7 - (i10 % 8)))) & bArr5[i11]);
                }
                int i12 = 0;
                while (true) {
                    int i13 = (i2 - i8) - 2;
                    if (i12 >= i13) {
                        if (bArr5[i13] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i3 - i8, i3);
                        int i14 = digestLength + 8;
                        byte[] bArr6 = new byte[i14 + i8];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i14, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i12] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i12++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
