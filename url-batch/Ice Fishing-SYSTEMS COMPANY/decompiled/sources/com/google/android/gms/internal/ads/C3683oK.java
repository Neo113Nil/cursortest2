package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.oK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3683oK implements InterfaceC4108wE {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f33130a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC3413jK f33131b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3413jK f33132c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33133d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f33134e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f33135f;

    public /* synthetic */ C3683oK(RSAPublicKey rSAPublicKey, EnumC3413jK enumC3413jK, EnumC3413jK enumC3413jK2, int i, byte[] bArr, byte[] bArr2) {
        if (JF.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3137eE.f(enumC3413jK);
        if (!enumC3413jK.equals(enumC3413jK2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3137eE.i(rSAPublicKey.getModulus().bitLength());
        AbstractC3137eE.k(rSAPublicKey.getPublicExponent());
        this.f33130a = rSAPublicKey;
        this.f33131b = enumC3413jK;
        this.f33132c = enumC3413jK2;
        this.f33133d = i;
        this.f33134e = bArr;
        this.f33135f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f33134e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!IG.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.f33130a;
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
        byte[] i = AbstractC4161xD.i(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        EnumC3413jK enumC3413jK = this.f33131b;
        AbstractC3137eE.f(enumC3413jK);
        C3253gK c3253gK = C3253gK.f30984e;
        MessageDigest messageDigest = (MessageDigest) c3253gK.f30987a.d(YD.f(enumC3413jK));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f33135f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = i.length;
        int i4 = this.f33133d;
        if (length < digestLength + i4 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (i[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i9 = length - digestLength;
        int i10 = i9 - 1;
        byte[] copyOf = Arrays.copyOf(i, i10);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(i, length2, length2 + digestLength);
        int i11 = 0;
        while (true) {
            long j9 = (length * 8) - bitLength3;
            if (i11 < j9) {
                if (((copyOf[i11 / 8] >> (7 - (i11 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i11++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) c3253gK.f30987a.d(YD.f(this.f33132c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i10];
                int i12 = 0;
                int i13 = 0;
                while (i12 <= (i9 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    int i14 = i4;
                    messageDigest2.update(AbstractC4161xD.i(BigInteger.valueOf(i12), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i13, Math.min(length3, i10 - i13));
                    i13 += length3;
                    i12++;
                    i4 = i14;
                    messageDigest2 = messageDigest2;
                }
                int i15 = i4;
                byte[] bArr5 = new byte[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    bArr5[i16] = (byte) (bArr4[i16] ^ copyOf[i16]);
                }
                for (int i17 = 0; i17 <= j9; i17++) {
                    int i18 = i17 / 8;
                    bArr5[i18] = (byte) ((~(1 << (7 - (i17 % 8)))) & bArr5[i18]);
                }
                int i19 = 0;
                while (true) {
                    int i20 = (i9 - i15) - 2;
                    if (i19 >= i20) {
                        if (bArr5[i20] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i10 - i15, i10);
                        int i21 = digestLength + 8;
                        byte[] bArr6 = new byte[i21 + i15];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i21, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i19] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i19++;
                }
            }
        }
    }
}
