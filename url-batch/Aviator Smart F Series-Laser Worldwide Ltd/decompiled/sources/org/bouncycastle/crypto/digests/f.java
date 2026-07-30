package org.bouncycastle.crypto.digests;

/* loaded from: classes5.dex */
public class f extends b implements a {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public f() {
        this.X = new int[80];
        reset();
    }

    private void copyIn(f fVar) {
        this.H1 = fVar.H1;
        this.H2 = fVar.H2;
        this.H3 = fVar.H3;
        this.H4 = fVar.H4;
        this.H5 = fVar.H5;
        int[] iArr = fVar.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = fVar.xOff;
    }

    private int f(int i8, int i9, int i10) {
        return ((~i8) & i10) | (i9 & i8);
    }

    private int g(int i8, int i9, int i10) {
        return (i8 & i10) | (i8 & i9) | (i9 & i10);
    }

    private int h(int i8, int i9, int i10) {
        return (i8 ^ i9) ^ i10;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.util.g
    public org.bouncycastle.util.g copy() {
        return new f(this);
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        finish();
        org.bouncycastle.util.i.intToBigEndian(this.H1, bArr, i8);
        org.bouncycastle.util.i.intToBigEndian(this.H2, bArr, i8 + 4);
        org.bouncycastle.util.i.intToBigEndian(this.H3, bArr, i8 + 8);
        org.bouncycastle.util.i.intToBigEndian(this.H4, bArr, i8 + 12);
        org.bouncycastle.util.i.intToBigEndian(this.H5, bArr, i8 + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.a
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        org.bouncycastle.util.i.intToBigEndian(this.H1, bArr, 16);
        org.bouncycastle.util.i.intToBigEndian(this.H2, bArr, 20);
        org.bouncycastle.util.i.intToBigEndian(this.H3, bArr, 24);
        org.bouncycastle.util.i.intToBigEndian(this.H4, bArr, 28);
        org.bouncycastle.util.i.intToBigEndian(this.H5, bArr, 32);
        org.bouncycastle.util.i.intToBigEndian(this.xOff, bArr, 36);
        for (int i8 = 0; i8 != this.xOff; i8++) {
            org.bouncycastle.util.i.intToBigEndian(this.X[i8], bArr, (i8 * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processBlock() {
        for (int i8 = 16; i8 < 80; i8++) {
            int[] iArr = this.X;
            int i9 = ((iArr[i8 - 3] ^ iArr[i8 - 8]) ^ iArr[i8 - 14]) ^ iArr[i8 - 16];
            iArr[i8] = (i9 >>> 31) | (i9 << 1);
        }
        int i10 = this.H1;
        int i11 = this.H2;
        int i12 = this.H3;
        int i13 = this.H4;
        int i14 = this.H5;
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            int f8 = i14 + ((i10 << 5) | (i10 >>> 27)) + f(i11, i12, i13) + this.X[i15] + Y1;
            int i17 = (i11 >>> 2) | (i11 << 30);
            int f9 = i13 + ((f8 << 5) | (f8 >>> 27)) + f(i10, i17, i12) + this.X[i15 + 1] + Y1;
            int i18 = (i10 >>> 2) | (i10 << 30);
            int f10 = i12 + ((f9 << 5) | (f9 >>> 27)) + f(f8, i18, i17) + this.X[i15 + 2] + Y1;
            i14 = (f8 >>> 2) | (f8 << 30);
            int i19 = i15 + 4;
            i11 = i17 + ((f10 << 5) | (f10 >>> 27)) + f(f9, i14, i18) + this.X[i15 + 3] + Y1;
            i13 = (f9 >>> 2) | (f9 << 30);
            i15 += 5;
            i10 = i18 + ((i11 << 5) | (i11 >>> 27)) + f(f10, i13, i14) + this.X[i19] + Y1;
            i12 = (f10 >>> 2) | (f10 << 30);
        }
        for (int i20 = 0; i20 < 4; i20++) {
            int h8 = i14 + ((i10 << 5) | (i10 >>> 27)) + h(i11, i12, i13) + this.X[i15] + Y2;
            int i21 = (i11 >>> 2) | (i11 << 30);
            int h9 = i13 + ((h8 << 5) | (h8 >>> 27)) + h(i10, i21, i12) + this.X[i15 + 1] + Y2;
            int i22 = (i10 >>> 2) | (i10 << 30);
            int h10 = i12 + ((h9 << 5) | (h9 >>> 27)) + h(h8, i22, i21) + this.X[i15 + 2] + Y2;
            i14 = (h8 >>> 2) | (h8 << 30);
            int i23 = i15 + 4;
            i11 = i21 + ((h10 << 5) | (h10 >>> 27)) + h(h9, i14, i22) + this.X[i15 + 3] + Y2;
            i13 = (h9 >>> 2) | (h9 << 30);
            i15 += 5;
            i10 = i22 + ((i11 << 5) | (i11 >>> 27)) + h(h10, i13, i14) + this.X[i23] + Y2;
            i12 = (h10 >>> 2) | (h10 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int g8 = i14 + ((i10 << 5) | (i10 >>> 27)) + g(i11, i12, i13) + this.X[i15] + Y3;
            int i25 = (i11 >>> 2) | (i11 << 30);
            int g9 = i13 + ((g8 << 5) | (g8 >>> 27)) + g(i10, i25, i12) + this.X[i15 + 1] + Y3;
            int i26 = (i10 >>> 2) | (i10 << 30);
            int g10 = i12 + ((g9 << 5) | (g9 >>> 27)) + g(g8, i26, i25) + this.X[i15 + 2] + Y3;
            i14 = (g8 >>> 2) | (g8 << 30);
            int i27 = i15 + 4;
            i11 = i25 + ((g10 << 5) | (g10 >>> 27)) + g(g9, i14, i26) + this.X[i15 + 3] + Y3;
            i13 = (g9 >>> 2) | (g9 << 30);
            i15 += 5;
            i10 = i26 + ((i11 << 5) | (i11 >>> 27)) + g(g10, i13, i14) + this.X[i27] + Y3;
            i12 = (g10 >>> 2) | (g10 << 30);
        }
        for (int i28 = 0; i28 <= 3; i28++) {
            int h11 = i14 + ((i10 << 5) | (i10 >>> 27)) + h(i11, i12, i13) + this.X[i15] + Y4;
            int i29 = (i11 >>> 2) | (i11 << 30);
            int h12 = i13 + ((h11 << 5) | (h11 >>> 27)) + h(i10, i29, i12) + this.X[i15 + 1] + Y4;
            int i30 = (i10 >>> 2) | (i10 << 30);
            int h13 = i12 + ((h12 << 5) | (h12 >>> 27)) + h(h11, i30, i29) + this.X[i15 + 2] + Y4;
            i14 = (h11 >>> 2) | (h11 << 30);
            int i31 = i15 + 4;
            i11 = i29 + ((h13 << 5) | (h13 >>> 27)) + h(h12, i14, i30) + this.X[i15 + 3] + Y4;
            i13 = (h12 >>> 2) | (h12 << 30);
            i15 += 5;
            i10 = i30 + ((i11 << 5) | (i11 >>> 27)) + h(h13, i13, i14) + this.X[i31] + Y4;
            i12 = (h13 >>> 2) | (h13 << 30);
        }
        this.H1 += i10;
        this.H2 += i11;
        this.H3 += i12;
        this.H4 += i13;
        this.H5 += i14;
        this.xOff = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.X[i32] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processLength(long j8) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j8 >>> 32);
        iArr[15] = (int) j8;
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processWord(byte[] bArr, int i8) {
        int i9 = (bArr[i8 + 3] & 255) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
        int[] iArr = this.X;
        int i10 = this.xOff;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.xOff = i11;
        if (i11 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.X;
            if (i8 == iArr.length) {
                return;
            }
            iArr[i8] = 0;
            i8++;
        }
    }

    public f(f fVar) {
        super(fVar);
        this.X = new int[80];
        copyIn(fVar);
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.util.g
    public void reset(org.bouncycastle.util.g gVar) {
        f fVar = (f) gVar;
        super.copyIn((b) fVar);
        copyIn(fVar);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        this.H1 = org.bouncycastle.util.i.bigEndianToInt(bArr, 16);
        this.H2 = org.bouncycastle.util.i.bigEndianToInt(bArr, 20);
        this.H3 = org.bouncycastle.util.i.bigEndianToInt(bArr, 24);
        this.H4 = org.bouncycastle.util.i.bigEndianToInt(bArr, 28);
        this.H5 = org.bouncycastle.util.i.bigEndianToInt(bArr, 32);
        this.xOff = org.bouncycastle.util.i.bigEndianToInt(bArr, 36);
        for (int i8 = 0; i8 != this.xOff; i8++) {
            this.X[i8] = org.bouncycastle.util.i.bigEndianToInt(bArr, (i8 * 4) + 40);
        }
    }
}
