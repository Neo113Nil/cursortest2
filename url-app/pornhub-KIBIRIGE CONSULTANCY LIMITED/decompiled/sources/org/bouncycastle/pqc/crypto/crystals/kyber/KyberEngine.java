package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class KyberEngine {
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
    private KyberIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KyberEngine(int i, boolean z) {
        int i2;
        this.KyberK = i;
        if (i == 2) {
            this.KyberEta1 = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalArgumentException("K: " + i + " is not supported for Crystals Kyber");
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = 160;
                i2 = i * 352;
                this.KyberPolyVecCompressedBytes = i2;
                this.sessionKeyLength = 32;
                int i3 = i * 384;
                this.KyberPolyVecBytes = i3;
                int i4 = i3 + 32;
                this.KyberIndCpaPublicKeyBytes = i4;
                this.KyberIndCpaSecretKeyBytes = i3;
                int i5 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
                this.KyberIndCpaBytes = i5;
                this.KyberPublicKeyBytes = i4;
                int i6 = i3 + i4 + 64;
                this.KyberSecretKeyBytes = i6;
                this.KyberCipherTextBytes = i5;
                this.CryptoBytes = 32;
                this.CryptoSecretKeyBytes = i6;
                this.CryptoPublicKeyBytes = i4;
                this.CryptoCipherTextBytes = i5;
                this.symmetric = !z ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
                this.indCpa = new KyberIndCpa(this);
            }
            this.KyberEta1 = 2;
        }
        this.KyberPolyCompressedBytes = 128;
        i2 = i * DilithiumEngine.DilithiumPolyT1PackedBytes;
        this.KyberPolyVecCompressedBytes = i2;
        this.sessionKeyLength = 32;
        int i32 = i * 384;
        this.KyberPolyVecBytes = i32;
        int i42 = i32 + 32;
        this.KyberIndCpaPublicKeyBytes = i42;
        this.KyberIndCpaSecretKeyBytes = i32;
        int i52 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i52;
        this.KyberPublicKeyBytes = i42;
        int i62 = i32 + i42 + 64;
        this.KyberSecretKeyBytes = i62;
        this.KyberCipherTextBytes = i52;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i62;
        this.CryptoPublicKeyBytes = i42;
        this.CryptoCipherTextBytes = i52;
        this.symmetric = !z ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        this.indCpa = new KyberIndCpa(this);
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
        byte[][] generateKeyPair = this.indCpa.generateKeyPair();
        int i = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr = new byte[i];
        System.arraycopy(generateKeyPair[1], 0, bArr, 0, i);
        byte[] bArr2 = new byte[32];
        this.symmetric.hash_h(bArr2, generateKeyPair[0], 0);
        byte[] bArr3 = new byte[32];
        this.random.nextBytes(bArr3);
        int i2 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr4 = new byte[i2];
        System.arraycopy(generateKeyPair[0], 0, bArr4, 0, i2);
        int i3 = i2 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr4, 0, i3), Arrays.copyOfRange(bArr4, i3, i2), bArr, bArr2, bArr3};
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
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, this.KyberIndCpaSecretKeyBytes, bArr2.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr2, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        boolean z = !Arrays.constantTimeAreEqual(bArr, this.indCpa.encrypt(Arrays.copyOfRange(bArr3, 0, 32), copyOfRange, Arrays.copyOfRange(bArr4, 32, 64)));
        this.symmetric.hash_h(bArr4, bArr, 32);
        int i = this.KyberSecretKeyBytes;
        cmov(bArr4, Arrays.copyOfRange(bArr2, i - 32, i), 32, z);
        return Arrays.copyOfRange(bArr4, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(byte[] bArr) {
        if (bArr.length != this.KyberIndCpaPublicKeyBytes) {
            throw new IllegalArgumentException("Input validation Error: Type check failed for ml-kem encapsulation");
        }
        PolyVec polyVec = new PolyVec(this);
        if (!Arrays.areEqual(this.indCpa.packPublicKey(polyVec, this.indCpa.unpackPublicKey(polyVec, bArr)), bArr)) {
            throw new IllegalArgumentException("Input validation: Modulus check failed for ml-kem encapsulation");
        }
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        this.random.nextBytes(bArr4);
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, bArr, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] encrypt = this.indCpa.encrypt(Arrays.copyOfRange(bArr2, 0, 32), bArr, Arrays.copyOfRange(bArr3, 32, 64));
        int i = this.sessionKeyLength;
        byte[] bArr5 = new byte[i];
        System.arraycopy(bArr3, 0, bArr5, 0, i);
        return new byte[][]{bArr5, encrypt};
    }
}
