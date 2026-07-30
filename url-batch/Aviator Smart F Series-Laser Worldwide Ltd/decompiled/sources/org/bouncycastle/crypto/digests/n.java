package org.bouncycastle.crypto.digests;

/* loaded from: classes5.dex */
public class n extends b {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i8;
        int i9 = 0;
        while (true) {
            if (i9 >= 16) {
                break;
            }
            T[i9] = (2043430169 >>> (32 - i9)) | (2043430169 << i9);
            i9++;
        }
        for (i8 = 16; i8 < 64; i8++) {
            int i10 = i8 % 32;
            T[i8] = (2055708042 >>> (32 - i10)) | (2055708042 << i10);
        }
    }

    public n() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        reset();
    }

    private int FF0(int i8, int i9, int i10) {
        return (i8 ^ i9) ^ i10;
    }

    private int FF1(int i8, int i9, int i10) {
        return (i8 & i10) | (i8 & i9) | (i9 & i10);
    }

    private int GG0(int i8, int i9, int i10) {
        return (i8 ^ i9) ^ i10;
    }

    private int GG1(int i8, int i9, int i10) {
        return ((~i8) & i10) | (i9 & i8);
    }

    private int P0(int i8) {
        return (i8 ^ ((i8 << 9) | (i8 >>> 23))) ^ ((i8 << 17) | (i8 >>> 15));
    }

    private int P1(int i8) {
        return (i8 ^ ((i8 << 15) | (i8 >>> 17))) ^ ((i8 << 23) | (i8 >>> 9));
    }

    private void copyIn(n nVar) {
        int[] iArr = nVar.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = nVar.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = nVar.xOff;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.util.g
    public org.bouncycastle.util.g copy() {
        return new n(this);
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        finish();
        org.bouncycastle.util.i.intToBigEndian(this.V, bArr, i8);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processBlock() {
        int i8;
        int i9 = 0;
        while (true) {
            if (i9 >= 16) {
                break;
            }
            this.W[i9] = this.inwords[i9];
            i9++;
        }
        for (int i10 = 16; i10 < 68; i10++) {
            int[] iArr = this.W;
            int i11 = iArr[i10 - 3];
            int i12 = iArr[i10 - 13];
            iArr[i10] = (P1(((i11 >>> 17) | (i11 << 15)) ^ (iArr[i10 - 16] ^ iArr[i10 - 9])) ^ ((i12 >>> 25) | (i12 << 7))) ^ this.W[i10 - 6];
        }
        int[] iArr2 = this.V;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        int i15 = iArr2[2];
        int i16 = iArr2[3];
        int i17 = iArr2[4];
        int i18 = iArr2[5];
        int i19 = iArr2[6];
        int i20 = iArr2[7];
        int i21 = i19;
        int i22 = 0;
        for (i8 = 16; i22 < i8; i8 = 16) {
            int i23 = (i13 << 12) | (i13 >>> 20);
            int i24 = i23 + i17 + T[i22];
            int i25 = (i24 << 7) | (i24 >>> 25);
            int[] iArr3 = this.W;
            int i26 = iArr3[i22];
            int i27 = i26 ^ iArr3[i22 + 4];
            int FF0 = FF0(i13, i14, i15) + i16;
            int GG0 = GG0(i17, i18, i21) + i20 + i25 + i26;
            int i28 = (i14 << 9) | (i14 >>> 23);
            int i29 = (i18 << 19) | (i18 >>> 13);
            i22++;
            i18 = i17;
            i17 = P0(GG0);
            i16 = i15;
            i15 = i28;
            i20 = i21;
            i21 = i29;
            i14 = i13;
            i13 = FF0 + (i25 ^ i23) + i27;
        }
        int i30 = i20;
        int i31 = i17;
        int i32 = i21;
        int i33 = i16;
        int i34 = i15;
        int i35 = i14;
        int i36 = i13;
        int i37 = 16;
        while (i37 < 64) {
            int i38 = (i36 << 12) | (i36 >>> 20);
            int i39 = i38 + i31 + T[i37];
            int i40 = (i39 << 7) | (i39 >>> 25);
            int[] iArr4 = this.W;
            int i41 = iArr4[i37];
            int i42 = i41 ^ iArr4[i37 + 4];
            int FF1 = FF1(i36, i35, i34) + i33;
            int GG1 = GG1(i31, i18, i32) + i30 + i40 + i41;
            int i43 = (i18 << 19) | (i18 >>> 13);
            i37++;
            i18 = i31;
            i31 = P0(GG1);
            i33 = i34;
            i34 = (i35 >>> 23) | (i35 << 9);
            i35 = i36;
            i36 = FF1 + (i40 ^ i38) + i42;
            i30 = i32;
            i32 = i43;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i36 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i35;
        iArr5[2] = iArr5[2] ^ i34;
        iArr5[3] = iArr5[3] ^ i33;
        iArr5[4] = iArr5[4] ^ i31;
        iArr5[5] = iArr5[5] ^ i18;
        iArr5[6] = i32 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i30;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processLength(long j8) {
        int i8 = this.xOff;
        if (i8 > 14) {
            this.inwords[i8] = 0;
            this.xOff = i8 + 1;
            processBlock();
        }
        while (true) {
            int i9 = this.xOff;
            if (i9 >= 14) {
                int[] iArr = this.inwords;
                iArr[i9] = (int) (j8 >>> 32);
                this.xOff = i9 + 2;
                iArr[i9 + 1] = (int) j8;
                return;
            }
            this.inwords[i9] = 0;
            this.xOff = i9 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.b
    protected void processWord(byte[] bArr, int i8) {
        int i9 = (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
        int[] iArr = this.inwords;
        int i10 = this.xOff;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.xOff = i11;
        if (i11 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public n(n nVar) {
        super(nVar);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        copyIn(nVar);
    }

    @Override // org.bouncycastle.crypto.digests.b, org.bouncycastle.util.g
    public void reset(org.bouncycastle.util.g gVar) {
        n nVar = (n) gVar;
        super.copyIn((b) nVar);
        copyIn(nVar);
    }
}
