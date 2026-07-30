package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.MemoableResetException;

/* loaded from: classes5.dex */
public class l extends d {
    private long H1t;
    private long H2t;
    private long H3t;
    private long H4t;
    private long H5t;
    private long H6t;
    private long H7t;
    private long H8t;
    private int digestLength;

    public l(int i8) {
        if (i8 >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i8 % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i8 == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i9 = i8 / 8;
        this.digestLength = i9;
        tIvGenerate(i9 * 8);
        reset();
    }

    private static void intToBigEndian(int i8, byte[] bArr, int i9, int i10) {
        int min = Math.min(4, i10);
        while (true) {
            min--;
            if (min < 0) {
                return;
            } else {
                bArr[i9 + min] = (byte) (i8 >>> ((3 - min) * 8));
            }
        }
    }

    private static void longToBigEndian(long j8, byte[] bArr, int i8, int i9) {
        if (i9 > 0) {
            intToBigEndian((int) (j8 >>> 32), bArr, i8, i9);
            if (i9 > 4) {
                intToBigEndian((int) (j8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32), bArr, i8 + 4, i9 - 4);
            }
        }
    }

    private static int readDigestLength(byte[] bArr) {
        return org.bouncycastle.util.i.bigEndianToInt(bArr, bArr.length - 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007f, code lost:
    
        if (r4 > 10) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void tIvGenerate(int i8) {
        this.H1 = -3482333909917012819L;
        this.H2 = 2216346199247487646L;
        this.H3 = -7364697282686394994L;
        this.H4 = 65953792586715988L;
        this.H5 = -816286391624063116L;
        this.H6 = 4512832404995164602L;
        this.H7 = -5033199132376557362L;
        this.H8 = -124578254951840548L;
        update(a4.a.P0);
        update((byte) 72);
        update(a4.a.I0);
        update((byte) 45);
        update((byte) 53);
        update((byte) 49);
        update((byte) 50);
        update((byte) 47);
        if (i8 > 100) {
            update((byte) ((i8 / 100) + 48));
            i8 %= 100;
        }
        update((byte) ((i8 / 10) + 48));
        i8 %= 10;
        update((byte) (i8 + 48));
        finish();
        this.H1t = this.H1;
        this.H2t = this.H2;
        this.H3t = this.H3;
        this.H4t = this.H4;
        this.H5t = this.H5;
        this.H6t = this.H6;
        this.H7t = this.H7;
        this.H8t = this.H8;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.util.g
    public org.bouncycastle.util.g copy() {
        return new l(this);
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        finish();
        longToBigEndian(this.H1, bArr, i8, this.digestLength);
        longToBigEndian(this.H2, bArr, i8 + 8, this.digestLength - 8);
        longToBigEndian(this.H3, bArr, i8 + 16, this.digestLength - 16);
        longToBigEndian(this.H4, bArr, i8 + 24, this.digestLength - 24);
        longToBigEndian(this.H5, bArr, i8 + 32, this.digestLength - 32);
        longToBigEndian(this.H6, bArr, i8 + 40, this.digestLength - 40);
        longToBigEndian(this.H7, bArr, i8 + 48, this.digestLength - 48);
        longToBigEndian(this.H8, bArr, i8 + 56, this.digestLength - 56);
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.digestLength * 8);
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.digests.a
    public byte[] getEncodedState() {
        int encodedStateSize = getEncodedStateSize();
        byte[] bArr = new byte[encodedStateSize + 4];
        populateState(bArr);
        org.bouncycastle.util.i.intToBigEndian(this.digestLength * 8, bArr, encodedStateSize);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void reset() {
        super.reset();
        this.H1 = this.H1t;
        this.H2 = this.H2t;
        this.H3 = this.H3t;
        this.H4 = this.H4t;
        this.H5 = this.H5t;
        this.H6 = this.H6t;
        this.H7 = this.H7t;
        this.H8 = this.H8t;
    }

    public l(l lVar) {
        super(lVar);
        this.digestLength = lVar.digestLength;
        reset(lVar);
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.util.g
    public void reset(org.bouncycastle.util.g gVar) {
        l lVar = (l) gVar;
        if (this.digestLength != lVar.digestLength) {
            throw new MemoableResetException("digestLength inappropriate in other");
        }
        super.copyIn(lVar);
        this.H1t = lVar.H1t;
        this.H2t = lVar.H2t;
        this.H3t = lVar.H3t;
        this.H4t = lVar.H4t;
        this.H5t = lVar.H5t;
        this.H6t = lVar.H6t;
        this.H7t = lVar.H7t;
        this.H8t = lVar.H8t;
    }

    public l(byte[] bArr) {
        this(readDigestLength(bArr));
        restoreState(bArr);
    }
}
