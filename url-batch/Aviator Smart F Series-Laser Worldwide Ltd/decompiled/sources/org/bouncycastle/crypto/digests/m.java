package org.bouncycastle.crypto.digests;

/* loaded from: classes5.dex */
public class m extends c implements org.bouncycastle.crypto.i {
    public m() {
        this(128);
    }

    private static int checkBitLength(int i8) {
        if (i8 == 128 || i8 == 256) {
            return i8;
        }
        throw new IllegalArgumentException("'bitLength' " + i8 + " not supported for SHAKE");
    }

    @Override // org.bouncycastle.crypto.digests.c, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        return doFinal(bArr, i8, getDigestSize());
    }

    @Override // org.bouncycastle.crypto.i
    public int doOutput(byte[] bArr, int i8, int i9) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i8, i9 * 8);
        return i9;
    }

    @Override // org.bouncycastle.crypto.digests.c, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.c, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public m(int i8) {
        super(checkBitLength(i8));
    }

    @Override // org.bouncycastle.crypto.digests.c
    protected int doFinal(byte[] bArr, int i8, byte b8, int i9) {
        return doFinal(bArr, i8, getDigestSize(), b8, i9);
    }

    public m(m mVar) {
        super(mVar);
    }

    @Override // org.bouncycastle.crypto.i
    public int doFinal(byte[] bArr, int i8, int i9) {
        int doOutput = doOutput(bArr, i8, i9);
        reset();
        return doOutput;
    }

    protected int doFinal(byte[] bArr, int i8, int i9, byte b8, int i10) {
        if (i10 < 0 || i10 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i11 = (b8 & ((1 << i10) - 1)) | (15 << i10);
        int i12 = i10 + 4;
        if (i12 >= 8) {
            absorb((byte) i11);
            i12 = i10 - 4;
            i11 >>>= 8;
        }
        if (i12 > 0) {
            absorbBits(i11, i12);
        }
        squeeze(bArr, i8, i9 * 8);
        reset();
        return i9;
    }
}
