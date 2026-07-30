package org.bouncycastle.crypto.digests;

import org.bouncycastle.pqc.crypto.xmss.o;

/* loaded from: classes5.dex */
public class h extends b implements a {
    private static final int DIGEST_LENGTH = 32;
    static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int[] X;
    private int xOff;

    public h() {
        this.X = new int[64];
        reset();
    }

    private static int Ch(int i8, int i9, int i10) {
        return ((~i8) & i10) ^ (i9 & i8);
    }

    private static int Maj(int i8, int i9, int i10) {
        return ((i8 ^ i9) & i10) | (i8 & i9);
    }

    private static int Sum0(int i8) {
        return ((i8 << 10) | (i8 >>> 22)) ^ (((i8 >>> 2) | (i8 << 30)) ^ ((i8 >>> 13) | (i8 << 19)));
    }

    private static int Sum1(int i8) {
        return ((i8 << 7) | (i8 >>> 25)) ^ (((i8 >>> 6) | (i8 << 26)) ^ ((i8 >>> 11) | (i8 << 21)));
    }

    private static int Theta0(int i8) {
        return (i8 >>> 3) ^ (((i8 >>> 7) | (i8 << 25)) ^ ((i8 >>> 18) | (i8 << 14)));
    }

    private static int Theta1(int i8) {
        return (i8 >>> 10) ^ (((i8 >>> 17) | (i8 << 15)) ^ ((i8 >>> 19) | (i8 << 13)));
    }

    private void copyIn(h hVar) {
        super.copyIn((b) hVar);
        this.H1 = hVar.H1;
        this.H2 = hVar.H2;
        this.H3 = hVar.H3;
        this.H4 = hVar.H4;
        this.H5 = hVar.H5;
        this.H6 = hVar.H6;
        this.H7 = hVar.H7;
        this.H8 = hVar.H8;
        int[] iArr = hVar.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = hVar.xOff;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.util.g
    public org.bouncycastle.util.g copy() {
        return new h(this);
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        finish();
        org.bouncycastle.util.i.intToBigEndian(this.H1, bArr, i8);
        org.bouncycastle.util.i.intToBigEndian(this.H2, bArr, i8 + 4);
        org.bouncycastle.util.i.intToBigEndian(this.H3, bArr, i8 + 8);
        org.bouncycastle.util.i.intToBigEndian(this.H4, bArr, i8 + 12);
        org.bouncycastle.util.i.intToBigEndian(this.H5, bArr, i8 + 16);
        org.bouncycastle.util.i.intToBigEndian(this.H6, bArr, i8 + 20);
        org.bouncycastle.util.i.intToBigEndian(this.H7, bArr, i8 + 24);
        org.bouncycastle.util.i.intToBigEndian(this.H8, bArr, i8 + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return o.SHA_256;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.a
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 52];
        super.populateState(bArr);
        org.bouncycastle.util.i.intToBigEndian(this.H1, bArr, 16);
        org.bouncycastle.util.i.intToBigEndian(this.H2, bArr, 20);
        org.bouncycastle.util.i.intToBigEndian(this.H3, bArr, 24);
        org.bouncycastle.util.i.intToBigEndian(this.H4, bArr, 28);
        org.bouncycastle.util.i.intToBigEndian(this.H5, bArr, 32);
        org.bouncycastle.util.i.intToBigEndian(this.H6, bArr, 36);
        org.bouncycastle.util.i.intToBigEndian(this.H7, bArr, 40);
        org.bouncycastle.util.i.intToBigEndian(this.H8, bArr, 44);
        org.bouncycastle.util.i.intToBigEndian(this.xOff, bArr, 48);
        for (int i8 = 0; i8 != this.xOff; i8++) {
            org.bouncycastle.util.i.intToBigEndian(this.X[i8], bArr, (i8 * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processBlock() {
        for (int i8 = 16; i8 <= 63; i8++) {
            int[] iArr = this.X;
            int Theta1 = Theta1(iArr[i8 - 2]);
            int[] iArr2 = this.X;
            iArr[i8] = Theta1 + iArr2[i8 - 7] + Theta0(iArr2[i8 - 15]) + this.X[i8 - 16];
        }
        int i9 = this.H1;
        int i10 = this.H2;
        int i11 = this.H3;
        int i12 = this.H4;
        int i13 = this.H5;
        int i14 = this.H6;
        int i15 = this.H7;
        int i16 = this.H8;
        int i17 = 0;
        for (int i18 = 0; i18 < 8; i18++) {
            int Sum1 = Sum1(i13) + Ch(i13, i14, i15);
            int[] iArr3 = K;
            int i19 = i16 + Sum1 + iArr3[i17] + this.X[i17];
            int i20 = i12 + i19;
            int Sum0 = i19 + Sum0(i9) + Maj(i9, i10, i11);
            int i21 = i17 + 1;
            int Sum12 = i15 + Sum1(i20) + Ch(i20, i13, i14) + iArr3[i21] + this.X[i21];
            int i22 = i11 + Sum12;
            int Sum02 = Sum12 + Sum0(Sum0) + Maj(Sum0, i9, i10);
            int i23 = i17 + 2;
            int Sum13 = i14 + Sum1(i22) + Ch(i22, i20, i13) + iArr3[i23] + this.X[i23];
            int i24 = i10 + Sum13;
            int Sum03 = Sum13 + Sum0(Sum02) + Maj(Sum02, Sum0, i9);
            int i25 = i17 + 3;
            int Sum14 = i13 + Sum1(i24) + Ch(i24, i22, i20) + iArr3[i25] + this.X[i25];
            int i26 = i9 + Sum14;
            int Sum04 = Sum14 + Sum0(Sum03) + Maj(Sum03, Sum02, Sum0);
            int i27 = i17 + 4;
            int Sum15 = i20 + Sum1(i26) + Ch(i26, i24, i22) + iArr3[i27] + this.X[i27];
            i16 = Sum0 + Sum15;
            i12 = Sum15 + Sum0(Sum04) + Maj(Sum04, Sum03, Sum02);
            int i28 = i17 + 5;
            int Sum16 = i22 + Sum1(i16) + Ch(i16, i26, i24) + iArr3[i28] + this.X[i28];
            i15 = Sum02 + Sum16;
            i11 = Sum16 + Sum0(i12) + Maj(i12, Sum04, Sum03);
            int i29 = i17 + 6;
            int Sum17 = i24 + Sum1(i15) + Ch(i15, i16, i26) + iArr3[i29] + this.X[i29];
            i14 = Sum03 + Sum17;
            i10 = Sum17 + Sum0(i11) + Maj(i11, i12, Sum04);
            int i30 = i17 + 7;
            int Sum18 = i26 + Sum1(i14) + Ch(i14, i15, i16) + iArr3[i30] + this.X[i30];
            i13 = Sum04 + Sum18;
            i9 = Sum18 + Sum0(i10) + Maj(i10, i11, i12);
            i17 += 8;
        }
        this.H1 += i9;
        this.H2 += i10;
        this.H3 += i11;
        this.H4 += i12;
        this.H5 += i13;
        this.H6 += i14;
        this.H7 += i15;
        this.H8 += i16;
        this.xOff = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.X[i31] = 0;
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
        this.H1 = 1779033703;
        this.H2 = -1150833019;
        this.H3 = 1013904242;
        this.H4 = -1521486534;
        this.H5 = 1359893119;
        this.H6 = -1694144372;
        this.H7 = 528734635;
        this.H8 = 1541459225;
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

    public h(h hVar) {
        super(hVar);
        this.X = new int[64];
        copyIn(hVar);
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.util.g
    public void reset(org.bouncycastle.util.g gVar) {
        copyIn((h) gVar);
    }

    public h(byte[] bArr) {
        super(bArr);
        this.X = new int[64];
        this.H1 = org.bouncycastle.util.i.bigEndianToInt(bArr, 16);
        this.H2 = org.bouncycastle.util.i.bigEndianToInt(bArr, 20);
        this.H3 = org.bouncycastle.util.i.bigEndianToInt(bArr, 24);
        this.H4 = org.bouncycastle.util.i.bigEndianToInt(bArr, 28);
        this.H5 = org.bouncycastle.util.i.bigEndianToInt(bArr, 32);
        this.H6 = org.bouncycastle.util.i.bigEndianToInt(bArr, 36);
        this.H7 = org.bouncycastle.util.i.bigEndianToInt(bArr, 40);
        this.H8 = org.bouncycastle.util.i.bigEndianToInt(bArr, 44);
        this.xOff = org.bouncycastle.util.i.bigEndianToInt(bArr, 48);
        for (int i8 = 0; i8 != this.xOff; i8++) {
            this.X[i8] = org.bouncycastle.util.i.bigEndianToInt(bArr, (i8 * 4) + 52);
        }
    }
}
