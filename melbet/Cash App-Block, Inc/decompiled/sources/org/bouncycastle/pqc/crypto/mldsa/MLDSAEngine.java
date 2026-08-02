package org.bouncycastle.pqc.crypto.mldsa;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.mldsa.Symmetric;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
class MLDSAEngine {
    public static final int CrhBytes = 64;
    public static final int DilithiumD = 13;
    public static final int DilithiumN = 256;
    public static final int DilithiumPolyT0PackedBytes = 416;
    public static final int DilithiumPolyT1PackedBytes = 320;
    public static final int DilithiumQ = 8380417;
    public static final int DilithiumQinv = 58728449;
    public static final int DilithiumRootOfUnity = 1753;
    public static final int RndBytes = 32;
    public static final int SeedBytes = 32;
    public static final int TrBytes = 64;
    private final int CryptoBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int DilithiumBeta;
    private final int DilithiumCTilde;
    private final int DilithiumEta;
    private final int DilithiumGamma1;
    private final int DilithiumGamma2;
    private final int DilithiumK;
    private final int DilithiumL;
    private final int DilithiumMode;
    private final int DilithiumOmega;
    private final int DilithiumPolyEtaPackedBytes;
    private final int DilithiumPolyVecHPackedBytes;
    private final int DilithiumPolyW1PackedBytes;
    private final int DilithiumPolyZPackedBytes;
    private final int DilithiumTau;
    private final int PolyUniformGamma1NBlocks;
    private final SecureRandom random;
    private final SHAKEDigest shake256Digest = new SHAKEDigest(256);
    private final Symmetric symmetric;

    public MLDSAEngine(int i, SecureRandom secureRandom) {
        int i2;
        int i3;
        this.DilithiumMode = i;
        if (i == 2) {
            this.DilithiumK = 4;
            this.DilithiumL = 4;
            this.DilithiumEta = 2;
            this.DilithiumTau = 39;
            this.DilithiumBeta = 78;
            this.DilithiumGamma1 = PKIFailureInfo.unsupportedVersion;
            this.DilithiumGamma2 = 95232;
            this.DilithiumOmega = 80;
            this.DilithiumPolyZPackedBytes = 576;
            this.DilithiumPolyW1PackedBytes = 192;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 32;
        } else if (i == 3) {
            this.DilithiumK = 6;
            this.DilithiumL = 5;
            this.DilithiumEta = 4;
            this.DilithiumTau = 49;
            this.DilithiumBeta = EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
            this.DilithiumGamma1 = PKIFailureInfo.signerNotTrusted;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 55;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 128;
            this.DilithiumCTilde = 48;
        } else {
            if (i != 5) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The mode ", "is not supported by Crystals Dilithium!"));
                throw null;
            }
            this.DilithiumK = 8;
            this.DilithiumL = 7;
            this.DilithiumEta = 2;
            this.DilithiumTau = 60;
            this.DilithiumBeta = 120;
            this.DilithiumGamma1 = PKIFailureInfo.signerNotTrusted;
            this.DilithiumGamma2 = 261888;
            this.DilithiumOmega = 75;
            this.DilithiumPolyZPackedBytes = 640;
            this.DilithiumPolyW1PackedBytes = 128;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 64;
        }
        Symmetric.ShakeSymmetric shakeSymmetric = new Symmetric.ShakeSymmetric();
        this.symmetric = shakeSymmetric;
        this.random = secureRandom;
        int i4 = this.DilithiumOmega;
        int i5 = this.DilithiumK;
        int i6 = i4 + i5;
        this.DilithiumPolyVecHPackedBytes = i6;
        this.CryptoPublicKeyBytes = (i5 * 320) + 32;
        int i7 = this.DilithiumL;
        int i8 = this.DilithiumPolyEtaPackedBytes;
        this.CryptoSecretKeyBytes = (i5 * 416) + (i8 * i5) + (i7 * i8) + 128;
        this.CryptoBytes = Boxes$$ExternalSyntheticOutline1.m(i7, this.DilithiumPolyZPackedBytes, this.DilithiumCTilde, i6);
        int i9 = this.DilithiumGamma1;
        if (i9 == 131072) {
            i2 = shakeSymmetric.stream256BlockBytes;
            i3 = i2 + 575;
        } else {
            if (i9 != 524288) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Wrong Dilithium Gamma1!");
                throw null;
            }
            i2 = shakeSymmetric.stream256BlockBytes;
            i3 = i2 + 639;
        }
        this.PolyUniformGamma1NBlocks = i3 / i2;
    }

    public Symmetric GetSymmetric() {
        return this.symmetric;
    }

    public byte[][] generateKeyPair() {
        byte[] bArr = new byte[32];
        this.random.nextBytes(bArr);
        return generateKeyPairInternal(bArr);
    }

    public byte[][] generateKeyPairInternal(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        this.shake256Digest.update(bArr, 0, 32);
        this.shake256Digest.update((byte) this.DilithiumK);
        this.shake256Digest.update((byte) this.DilithiumL);
        this.shake256Digest.doFinal(bArr2, 0, 128);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        polyVecMatrix.expandMatrix(bArr4);
        polyVecL.uniformEta(bArr5, (short) 0);
        polyVecK.uniformEta(bArr5, (short) this.DilithiumL);
        PolyVecL polyVecL2 = new PolyVecL(this);
        polyVecL.copyPolyVecL(polyVecL2);
        polyVecL2.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL2);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.addPolyVecK(polyVecK);
        polyVecK2.conditionalAddQ();
        polyVecK2.power2Round(polyVecK3);
        byte[] packPublicKey = Packing.packPublicKey(polyVecK2, this);
        this.shake256Digest.update(bArr4, 0, 32);
        this.shake256Digest.update(packPublicKey, 0, packPublicKey.length);
        this.shake256Digest.doFinal(bArr3, 0, 64);
        byte[][] packSecretKey = Packing.packSecretKey(bArr4, bArr3, bArr6, polyVecK3, polyVecL, polyVecK, this);
        return new byte[][]{packSecretKey[0], packSecretKey[1], packSecretKey[2], packSecretKey[3], packSecretKey[4], packSecretKey[5], packPublicKey, bArr};
    }

    public byte[] generateSignature(SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        PolyVecK polyVecK;
        PolyVecL polyVecL;
        byte[] bArr7 = new byte[64];
        sHAKEDigest.doFinal(bArr7, 0, 64);
        byte[] bArr8 = new byte[this.CryptoBytes];
        byte[] bArr9 = new byte[64];
        PolyVecL polyVecL2 = new PolyVecL(this);
        PolyVecL polyVecL3 = new PolyVecL(this);
        PolyVecL polyVecL4 = new PolyVecL(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK polyVecK4 = new PolyVecK(this);
        PolyVecK polyVecK5 = new PolyVecK(this);
        PolyVecK polyVecK6 = new PolyVecK(this);
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecK polyVecK7 = polyVecK5;
        PolyVecK polyVecK8 = polyVecK6;
        Poly poly2 = poly;
        Packing.unpackSecretKey(polyVecK2, polyVecL2, polyVecK3, bArr3, bArr4, bArr5, this);
        byte[] copyOf = Arrays.copyOf(bArr2, 128);
        System.arraycopy(bArr6, 0, copyOf, 32, 32);
        System.arraycopy(bArr7, 0, copyOf, 64, 64);
        sHAKEDigest.update(copyOf, 0, 128);
        sHAKEDigest.doFinal(bArr9, 0, 64);
        polyVecMatrix.expandMatrix(bArr);
        polyVecL2.polyVecNtt();
        polyVecK3.polyVecNtt();
        polyVecK2.polyVecNtt();
        int i = 0;
        short s = 0;
        while (i < 1000) {
            int i2 = i + 1;
            short s2 = (short) (s + 1);
            polyVecL3.uniformGamma1(bArr9, s);
            polyVecL3.copyPolyVecL(polyVecL4);
            polyVecL4.polyVecNtt();
            polyVecMatrix.pointwiseMontgomery(polyVecK4, polyVecL4);
            polyVecK4.reduce();
            polyVecK4.invNttToMont();
            polyVecK4.conditionalAddQ();
            PolyVecK polyVecK9 = polyVecK7;
            polyVecK4.decompose(polyVecK9);
            System.arraycopy(polyVecK4.packW1(), 0, bArr8, 0, this.DilithiumPolyW1PackedBytes * this.DilithiumK);
            sHAKEDigest.update(bArr7, 0, 64);
            sHAKEDigest.update(bArr8, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
            sHAKEDigest.doFinal(bArr8, 0, this.DilithiumCTilde);
            Poly poly3 = poly2;
            poly3.challenge(Arrays.copyOfRange(bArr8, 0, this.DilithiumCTilde));
            poly3.polyNtt();
            polyVecL4.pointwisePolyMontgomery(poly3, polyVecL2);
            polyVecL4.invNttToMont();
            polyVecL4.addPolyVecL(polyVecL3);
            polyVecL4.reduce();
            if (polyVecL4.checkNorm(this.DilithiumGamma1 - this.DilithiumBeta)) {
                polyVecL = polyVecL2;
                polyVecK = polyVecK8;
            } else {
                polyVecK = polyVecK8;
                polyVecK.pointwisePolyMontgomery(poly3, polyVecK3);
                polyVecK.invNttToMont();
                polyVecK9.subtract(polyVecK);
                polyVecK9.reduce();
                polyVecL = polyVecL2;
                if (polyVecK9.checkNorm(this.DilithiumGamma2 - this.DilithiumBeta)) {
                    continue;
                } else {
                    polyVecK.pointwisePolyMontgomery(poly3, polyVecK2);
                    polyVecK.invNttToMont();
                    polyVecK.reduce();
                    if (polyVecK.checkNorm(this.DilithiumGamma2)) {
                        continue;
                    } else {
                        polyVecK9.addPolyVecK(polyVecK);
                        polyVecK9.conditionalAddQ();
                        if (polyVecK.makeHint(polyVecK9, polyVecK4) <= this.DilithiumOmega) {
                            return Packing.packSignature(bArr8, polyVecL4, polyVecK, this);
                        }
                    }
                }
            }
            polyVecL2 = polyVecL;
            polyVecK8 = polyVecK;
            polyVecK7 = polyVecK9;
            poly2 = poly3;
            i = i2;
            s = s2;
        }
        return null;
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getDilithiumBeta() {
        return this.DilithiumBeta;
    }

    public int getDilithiumCTilde() {
        return this.DilithiumCTilde;
    }

    public int getDilithiumEta() {
        return this.DilithiumEta;
    }

    public int getDilithiumGamma1() {
        return this.DilithiumGamma1;
    }

    public int getDilithiumGamma2() {
        return this.DilithiumGamma2;
    }

    public int getDilithiumK() {
        return this.DilithiumK;
    }

    public int getDilithiumL() {
        return this.DilithiumL;
    }

    public int getDilithiumMode() {
        return this.DilithiumMode;
    }

    public int getDilithiumOmega() {
        return this.DilithiumOmega;
    }

    public int getDilithiumPolyEtaPackedBytes() {
        return this.DilithiumPolyEtaPackedBytes;
    }

    public int getDilithiumPolyVecHPackedBytes() {
        return this.DilithiumPolyVecHPackedBytes;
    }

    public int getDilithiumPolyW1PackedBytes() {
        return this.DilithiumPolyW1PackedBytes;
    }

    public int getDilithiumPolyZPackedBytes() {
        return this.DilithiumPolyZPackedBytes;
    }

    public int getDilithiumTau() {
        return this.DilithiumTau;
    }

    public int getPolyUniformGamma1NBlocks() {
        return this.PolyUniformGamma1NBlocks;
    }

    public SHAKEDigest getShake256Digest() {
        return new SHAKEDigest(this.shake256Digest);
    }

    public void initSign(byte[] bArr, boolean z, byte[] bArr2) {
        this.shake256Digest.update(bArr, 0, 64);
        if (bArr2 != null) {
            this.shake256Digest.update(z ? (byte) 1 : (byte) 0);
            this.shake256Digest.update((byte) bArr2.length);
            this.shake256Digest.update(bArr2, 0, bArr2.length);
        }
    }

    public void initVerify(byte[] bArr, byte[] bArr2, boolean z, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        this.shake256Digest.update(bArr, 0, bArr.length);
        this.shake256Digest.update(bArr2, 0, bArr2.length);
        this.shake256Digest.doFinal(bArr4, 0, 64);
        this.shake256Digest.update(bArr4, 0, 64);
        if (bArr3 != null) {
            this.shake256Digest.update(z ? (byte) 1 : (byte) 0);
            this.shake256Digest.update((byte) bArr3.length);
            this.shake256Digest.update(bArr3, 0, bArr3.length);
        }
    }

    public byte[] signInternal(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(this.shake256Digest);
        sHAKEDigest.update(bArr, 0, i);
        return generateSignature(sHAKEDigest, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7);
    }

    public boolean verifyInternal(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        if (i != this.CryptoBytes) {
            return false;
        }
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[this.DilithiumCTilde];
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK unpackPublicKey = Packing.unpackPublicKey(polyVecK, bArr4, this);
        if (!Packing.unpackSignature(polyVecL, polyVecK3, bArr, this)) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.DilithiumCTilde);
        if (polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta())) {
            return false;
        }
        this.shake256Digest.update(bArr2, 0, i2);
        this.shake256Digest.doFinal(bArr5, 0);
        poly.challenge(Arrays.copyOfRange(copyOfRange, 0, this.DilithiumCTilde));
        polyVecMatrix.expandMatrix(bArr3);
        polyVecL.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL);
        poly.polyNtt();
        unpackPublicKey.shiftLeft();
        unpackPublicKey.polyVecNtt();
        unpackPublicKey.pointwisePolyMontgomery(poly, unpackPublicKey);
        polyVecK2.subtract(unpackPublicKey);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.conditionalAddQ();
        polyVecK2.useHint(polyVecK2, polyVecK3);
        byte[] packW1 = polyVecK2.packW1();
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, 64);
        sHAKEDigest.update(packW1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
        sHAKEDigest.doFinal(bArr6, 0, this.DilithiumCTilde);
        return Arrays.constantTimeAreEqual(copyOfRange, bArr6);
    }

    public boolean verifyInternal(byte[] bArr, int i, SHAKEDigest sHAKEDigest, byte[] bArr2, byte[] bArr3) {
        if (i != this.CryptoBytes) {
            return false;
        }
        byte[] bArr4 = new byte[64];
        byte[] bArr5 = new byte[this.DilithiumCTilde];
        Poly poly = new Poly(this);
        PolyVecMatrix polyVecMatrix = new PolyVecMatrix(this);
        PolyVecL polyVecL = new PolyVecL(this);
        PolyVecK polyVecK = new PolyVecK(this);
        PolyVecK polyVecK2 = new PolyVecK(this);
        PolyVecK polyVecK3 = new PolyVecK(this);
        PolyVecK unpackPublicKey = Packing.unpackPublicKey(polyVecK, bArr3, this);
        if (!Packing.unpackSignature(polyVecL, polyVecK3, bArr, this)) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.DilithiumCTilde);
        if (polyVecL.checkNorm(getDilithiumGamma1() - getDilithiumBeta())) {
            return false;
        }
        sHAKEDigest.doFinal(bArr4, 0);
        poly.challenge(Arrays.copyOfRange(copyOfRange, 0, this.DilithiumCTilde));
        polyVecMatrix.expandMatrix(bArr2);
        polyVecL.polyVecNtt();
        polyVecMatrix.pointwiseMontgomery(polyVecK2, polyVecL);
        poly.polyNtt();
        unpackPublicKey.shiftLeft();
        unpackPublicKey.polyVecNtt();
        unpackPublicKey.pointwisePolyMontgomery(poly, unpackPublicKey);
        polyVecK2.subtract(unpackPublicKey);
        polyVecK2.reduce();
        polyVecK2.invNttToMont();
        polyVecK2.conditionalAddQ();
        polyVecK2.useHint(polyVecK2, polyVecK3);
        byte[] packW1 = polyVecK2.packW1();
        SHAKEDigest sHAKEDigest2 = new SHAKEDigest(256);
        sHAKEDigest2.update(bArr4, 0, 64);
        sHAKEDigest2.update(packW1, 0, this.DilithiumK * this.DilithiumPolyW1PackedBytes);
        sHAKEDigest2.doFinal(bArr5, 0, this.DilithiumCTilde);
        return Arrays.constantTimeAreEqual(copyOfRange, bArr5);
    }
}
