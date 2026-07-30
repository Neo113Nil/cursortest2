package org.bouncycastle.crypto.digests;

/* loaded from: classes5.dex */
public class j extends c {
    public j() {
        this(256);
    }

    private static int checkBitLength(int i8) {
        if (i8 == 224 || i8 == 256 || i8 == 384 || i8 == 512) {
            return i8;
        }
        throw new IllegalArgumentException("'bitLength' " + i8 + " not supported for SHA-3");
    }

    @Override // org.bouncycastle.crypto.digests.c, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i8);
    }

    @Override // org.bouncycastle.crypto.digests.c, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public j(int i8) {
        super(checkBitLength(i8));
    }

    @Override // org.bouncycastle.crypto.digests.c
    protected int doFinal(byte[] bArr, int i8, byte b8, int i9) {
        if (i9 < 0 || i9 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i10 = (b8 & ((1 << i9) - 1)) | (2 << i9);
        int i11 = i9 + 2;
        if (i11 >= 8) {
            absorb((byte) i10);
            i11 = i9 - 6;
            i10 >>>= 8;
        }
        return super.doFinal(bArr, i8, (byte) i10, i11);
    }

    public j(j jVar) {
        super(jVar);
    }
}
