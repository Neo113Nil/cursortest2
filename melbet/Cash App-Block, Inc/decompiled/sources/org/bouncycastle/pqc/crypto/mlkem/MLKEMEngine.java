package org.bouncycastle.pqc.crypto.mlkem;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.mlkem.Symmetric;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
class MLKEMEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private MLKEMIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    public MLKEMEngine(int i) {
        this.KyberK = i;
        if (i == 2) {
            this.KyberEta1 = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "K: ", " is not supported for Crystals Kyber"));
                    throw null;
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
                this.KyberPolyVecCompressedBytes = i * 352;
                this.sessionKeyLength = 32;
                int i2 = i * KyberPolyBytes;
                this.KyberPolyVecBytes = i2;
                int i3 = i2 + 32;
                this.KyberIndCpaPublicKeyBytes = i3;
                this.KyberIndCpaSecretKeyBytes = i2;
                int i4 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
                this.KyberIndCpaBytes = i4;
                this.KyberPublicKeyBytes = i3;
                int i5 = i2 + i3 + 64;
                this.KyberSecretKeyBytes = i5;
                this.KyberCipherTextBytes = i4;
                this.CryptoBytes = 32;
                this.CryptoSecretKeyBytes = i5;
                this.CryptoPublicKeyBytes = i3;
                this.CryptoCipherTextBytes = i4;
                this.symmetric = new Symmetric.ShakeSymmetric();
                this.indCpa = new MLKEMIndCpa(this);
            }
            this.KyberEta1 = 2;
        }
        this.KyberPolyCompressedBytes = 128;
        this.KyberPolyVecCompressedBytes = i * 320;
        this.sessionKeyLength = 32;
        int i22 = i * KyberPolyBytes;
        this.KyberPolyVecBytes = i22;
        int i32 = i22 + 32;
        this.KyberIndCpaPublicKeyBytes = i32;
        this.KyberIndCpaSecretKeyBytes = i22;
        int i42 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i42;
        this.KyberPublicKeyBytes = i32;
        int i52 = i22 + i32 + 64;
        this.KyberSecretKeyBytes = i52;
        this.KyberCipherTextBytes = i42;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i52;
        this.CryptoPublicKeyBytes = i32;
        this.CryptoCipherTextBytes = i42;
        this.symmetric = new Symmetric.ShakeSymmetric();
        this.indCpa = new MLKEMIndCpa(this);
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i, boolean z) {
        if (z) {
            System.arraycopy(bArr2, 0, bArr, 0, i);
        } else {
            System.arraycopy(bArr, 0, bArr, 0, i);
        }
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public byte[][] generateKemKeyPair() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        this.random.nextBytes(bArr);
        this.random.nextBytes(bArr2);
        return generateKemKeyPairInternal(bArr, bArr2);
    }

    public byte[][] generateKemKeyPairInternal(byte[] bArr, byte[] bArr2) {
        byte[][] generateKeyPair = this.indCpa.generateKeyPair(bArr);
        int i = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr3 = new byte[i];
        System.arraycopy(generateKeyPair[1], 0, bArr3, 0, i);
        byte[] bArr4 = new byte[32];
        this.symmetric.hash_h(bArr4, generateKeyPair[0], 0);
        int i2 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr5 = new byte[i2];
        System.arraycopy(generateKeyPair[0], 0, bArr5, 0, i2);
        int i3 = i2 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr5, 0, i3), Arrays.copyOfRange(bArr5, i3, i2), bArr3, bArr4, bArr2, Arrays.concatenate(bArr, bArr2)};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public void getRandomBytes(byte[] bArr) {
        this.random.nextBytes(bArr);
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(byte[] bArr, byte[] bArr2) {
        return kemDecryptInternal(bArr, bArr2);
    }

    public byte[] kemDecryptInternal(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.KyberIndCpaSecretKeyBytes, bArr.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        byte[] bArr5 = new byte[this.KyberCipherTextBytes + 32];
        System.arraycopy(bArr, this.KyberSecretKeyBytes - 32, bArr5, 0, 32);
        System.arraycopy(bArr2, 0, bArr5, 32, this.KyberCipherTextBytes);
        this.symmetric.kdf(bArr5, bArr5);
        cmov(bArr4, bArr5, 32, !Arrays.constantTimeAreEqual(bArr2, this.indCpa.encrypt(copyOfRange, Arrays.copyOfRange(bArr3, 0, 32), Arrays.copyOfRange(bArr4, 32, 64))));
        return Arrays.copyOfRange(bArr4, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length == this.KyberIndCpaPublicKeyBytes) {
            PolyVec polyVec = new PolyVec(this);
            if (Arrays.areEqual(this.indCpa.packPublicKey(polyVec, this.indCpa.unpackPublicKey(polyVec, bArr)), bArr)) {
                return kemEncryptInternal(bArr, bArr2);
            }
            str = "Input validation: Modulus check failed for ml-kem encapsulation";
        } else {
            str = "Input validation Error: Type check failed for ml-kem encapsulation";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public byte[][] kemEncryptInternal(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        this.symmetric.hash_h(bArr3, bArr, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        byte[] encrypt = this.indCpa.encrypt(bArr, Arrays.copyOfRange(bArr3, 0, 32), Arrays.copyOfRange(bArr4, 32, 64));
        int i = this.sessionKeyLength;
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr4, 0, bArr5, 0, i);
        return new byte[][]{bArr5, encrypt};
    }
}
