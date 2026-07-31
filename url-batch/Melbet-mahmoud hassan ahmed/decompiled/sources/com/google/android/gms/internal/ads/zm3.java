package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zm3 {

    /* renamed from: a, reason: collision with root package name */
    private final ECPublicKey f15195a;

    public zm3(ECPublicKey eCPublicKey) {
        this.f15195a = eCPublicKey;
    }

    public final ym3 a(String str, byte[] bArr, byte[] bArr2, int i7, int i8) {
        char c7;
        int i9;
        byte[] bArr3;
        int i10;
        byte[] bArr4;
        KeyPair b7 = an3.b(this.f15195a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) b7.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b7.getPrivate();
        ECPublicKey eCPublicKey2 = this.f15195a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w6 = eCPublicKey2.getW();
            an3.c(w6, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = cn3.f3897k.a("EC").generatePublic(new ECPublicKeySpec(w6, eCPrivateKey.getParams()));
            KeyAgreement a7 = cn3.f3895i.a("ECDH");
            a7.init(eCPrivateKey);
            int i11 = 1;
            try {
                a7.doPhase(generatePublic, true);
                byte[] generateSecret = a7.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, generateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(an3.a(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger a8 = an3.a(curve);
                BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(a8);
                if (a8.signum() != 1) {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
                BigInteger mod2 = mod.mod(a8);
                BigInteger bigInteger2 = BigInteger.ZERO;
                if (!mod2.equals(bigInteger2)) {
                    if (a8.testBit(0) && a8.testBit(1)) {
                        bigInteger2 = mod2.modPow(a8.add(BigInteger.ONE).shiftRight(2), a8);
                    } else if (a8.testBit(0) && !a8.testBit(1)) {
                        bigInteger2 = BigInteger.ONE;
                        BigInteger shiftRight = a8.subtract(bigInteger2).shiftRight(1);
                        int i12 = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(a8);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, a8);
                            BigInteger bigInteger3 = BigInteger.ONE;
                            if (modPow.add(bigInteger3).equals(a8)) {
                                BigInteger shiftRight2 = a8.add(bigInteger3).shiftRight(i11);
                                BigInteger bigInteger4 = bigInteger2;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                    BigInteger mod4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(a8).multiply(mod3)).mod(a8);
                                    BigInteger mod5 = multiply.add(multiply).mod(a8);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod6 = mod4.multiply(bigInteger2).add(mod5.multiply(mod3)).mod(a8);
                                        bigInteger3 = bigInteger2.multiply(mod5).add(mod4).mod(a8);
                                        bigInteger4 = mod6;
                                    } else {
                                        bigInteger4 = mod4;
                                        bigInteger3 = mod5;
                                    }
                                }
                                bigInteger2 = bigInteger4;
                            } else {
                                if (!modPow.equals(bigInteger3)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                                bigInteger2 = bigInteger2.add(bigInteger3);
                                i12++;
                                if (i12 == 128 && !a8.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                                i11 = 1;
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                    if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(a8).compareTo(mod2) != 0) {
                        throw new GeneralSecurityException("Could not find a modular square root");
                    }
                }
                if (!bigInteger2.testBit(0)) {
                    a8.subtract(bigInteger2).mod(a8);
                }
                EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                ECPoint w7 = eCPublicKey.getW();
                an3.c(w7, curve2);
                int bitLength2 = (an3.a(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                int i13 = i8 - 1;
                if (i13 != 0) {
                    if (i13 != 2) {
                        int i14 = bitLength2 + 1;
                        bArr4 = new byte[i14];
                        byte[] byteArray = w7.getAffineX().toByteArray();
                        int length = byteArray.length;
                        c7 = 0;
                        System.arraycopy(byteArray, 0, bArr4, i14 - length, length);
                        bArr4[0] = true != w7.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                    } else {
                        int i15 = bitLength2 + bitLength2;
                        bArr4 = new byte[i15];
                        byte[] byteArray2 = w7.getAffineX().toByteArray();
                        int length2 = byteArray2.length;
                        if (length2 > bitLength2) {
                            byteArray2 = Arrays.copyOfRange(byteArray2, length2 - bitLength2, length2);
                        }
                        byte[] byteArray3 = w7.getAffineY().toByteArray();
                        int length3 = byteArray3.length;
                        if (length3 > bitLength2) {
                            byteArray3 = Arrays.copyOfRange(byteArray3, length3 - bitLength2, length3);
                        }
                        int length4 = byteArray3.length;
                        c7 = 0;
                        System.arraycopy(byteArray3, 0, bArr4, i15 - length4, length4);
                        int length5 = byteArray2.length;
                        System.arraycopy(byteArray2, 0, bArr4, bitLength2 - length5, length5);
                    }
                    bArr3 = bArr4;
                    i10 = 2;
                    i9 = 1;
                } else {
                    c7 = 0;
                    i9 = 1;
                    int i16 = bitLength2 + bitLength2 + 1;
                    bArr3 = new byte[i16];
                    byte[] byteArray4 = w7.getAffineX().toByteArray();
                    byte[] byteArray5 = w7.getAffineY().toByteArray();
                    int length6 = byteArray5.length;
                    System.arraycopy(byteArray5, 0, bArr3, i16 - length6, length6);
                    int length7 = byteArray4.length;
                    System.arraycopy(byteArray4, 0, bArr3, (bitLength2 + 1) - length7, length7);
                    bArr3[0] = 4;
                    i10 = 2;
                }
                byte[][] bArr5 = new byte[i10][];
                bArr5[c7] = bArr3;
                bArr5[i9] = generateSecret;
                byte[] b8 = pm3.b(bArr5);
                Mac a9 = cn3.f3892f.a(str);
                if (i7 > a9.getMacLength() * 255) {
                    throw new GeneralSecurityException("size too large");
                }
                if (bArr == null || bArr.length == 0) {
                    a9.init(new SecretKeySpec(new byte[a9.getMacLength()], str));
                } else {
                    a9.init(new SecretKeySpec(bArr, str));
                }
                byte[] doFinal = a9.doFinal(b8);
                byte[] bArr6 = new byte[i7];
                a9.init(new SecretKeySpec(doFinal, str));
                byte[] bArr7 = new byte[0];
                int i17 = 0;
                while (true) {
                    a9.update(bArr7);
                    a9.update(bArr2);
                    a9.update((byte) i9);
                    byte[] doFinal2 = a9.doFinal();
                    int length8 = doFinal2.length;
                    int i18 = i17 + length8;
                    if (i18 >= i7) {
                        System.arraycopy(doFinal2, 0, bArr6, i17, i7 - i17);
                        return new ym3(bArr3, bArr6);
                    }
                    System.arraycopy(doFinal2, 0, bArr6, i17, length8);
                    i9++;
                    bArr7 = doFinal2;
                    i17 = i18;
                }
            } catch (IllegalStateException e7) {
                throw new GeneralSecurityException(e7.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e8) {
            throw new GeneralSecurityException(e8.toString());
        }
    }
}
