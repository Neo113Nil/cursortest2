package org.bouncycastle.crypto.digests;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes5.dex */
public abstract class d implements org.bouncycastle.crypto.f, org.bouncycastle.util.g, a {
    private static final int BYTE_LENGTH = 128;
    static final long[] K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;
    private long[] W;
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    protected d() {
        this.xBuf = new byte[8];
        this.W = new long[80];
        this.xBufOff = 0;
        reset();
    }

    private long Ch(long j8, long j9, long j10) {
        return ((~j8) & j10) ^ (j9 & j8);
    }

    private long Maj(long j8, long j9, long j10) {
        return ((j8 & j10) ^ (j8 & j9)) ^ (j9 & j10);
    }

    private long Sigma0(long j8) {
        return (j8 >>> 7) ^ (((j8 << 63) | (j8 >>> 1)) ^ ((j8 << 56) | (j8 >>> 8)));
    }

    private long Sigma1(long j8) {
        return (j8 >>> 6) ^ (((j8 << 45) | (j8 >>> 19)) ^ ((j8 << 3) | (j8 >>> 61)));
    }

    private long Sum0(long j8) {
        return ((j8 >>> 39) | (j8 << 25)) ^ (((j8 << 36) | (j8 >>> 28)) ^ ((j8 << 30) | (j8 >>> 34)));
    }

    private long Sum1(long j8) {
        return ((j8 >>> 41) | (j8 << 23)) ^ (((j8 << 50) | (j8 >>> 14)) ^ ((j8 << 46) | (j8 >>> 18)));
    }

    private void adjustByteCounts() {
        long j8 = this.byteCount1;
        if (j8 > 2305843009213693951L) {
            this.byteCount2 += j8 >>> 61;
            this.byteCount1 = j8 & 2305843009213693951L;
        }
    }

    @Override // org.bouncycastle.util.g
    public abstract /* synthetic */ org.bouncycastle.util.g copy();

    protected void copyIn(d dVar) {
        byte[] bArr = dVar.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = dVar.xBufOff;
        this.byteCount1 = dVar.byteCount1;
        this.byteCount2 = dVar.byteCount2;
        this.H1 = dVar.H1;
        this.H2 = dVar.H2;
        this.H3 = dVar.H3;
        this.H4 = dVar.H4;
        this.H5 = dVar.H5;
        this.H6 = dVar.H6;
        this.H7 = dVar.H7;
        this.H8 = dVar.H8;
        long[] jArr = dVar.W;
        System.arraycopy(jArr, 0, this.W, 0, jArr.length);
        this.wOff = dVar.wOff;
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public abstract /* synthetic */ int doFinal(byte[] bArr, int i8);

    public void finish() {
        adjustByteCounts();
        long j8 = this.byteCount1 << 3;
        long j9 = this.byteCount2;
        byte b8 = UnsignedBytes.MAX_POWER_OF_TWO;
        while (true) {
            update(b8);
            if (this.xBufOff == 0) {
                processLength(j8, j9);
                processBlock();
                return;
            }
            b8 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public abstract /* synthetic */ String getAlgorithmName();

    @Override // org.bouncycastle.crypto.f
    public int getByteLength() {
        return 128;
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public abstract /* synthetic */ int getDigestSize();

    @Override // org.bouncycastle.crypto.digests.a
    public abstract /* synthetic */ byte[] getEncodedState();

    protected int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        org.bouncycastle.util.i.intToBigEndian(this.xBufOff, bArr, 8);
        org.bouncycastle.util.i.longToBigEndian(this.byteCount1, bArr, 12);
        org.bouncycastle.util.i.longToBigEndian(this.byteCount2, bArr, 20);
        org.bouncycastle.util.i.longToBigEndian(this.H1, bArr, 28);
        org.bouncycastle.util.i.longToBigEndian(this.H2, bArr, 36);
        org.bouncycastle.util.i.longToBigEndian(this.H3, bArr, 44);
        org.bouncycastle.util.i.longToBigEndian(this.H4, bArr, 52);
        org.bouncycastle.util.i.longToBigEndian(this.H5, bArr, 60);
        org.bouncycastle.util.i.longToBigEndian(this.H6, bArr, 68);
        org.bouncycastle.util.i.longToBigEndian(this.H7, bArr, 76);
        org.bouncycastle.util.i.longToBigEndian(this.H8, bArr, 84);
        org.bouncycastle.util.i.intToBigEndian(this.wOff, bArr, 92);
        for (int i8 = 0; i8 < this.wOff; i8++) {
            org.bouncycastle.util.i.longToBigEndian(this.W[i8], bArr, (i8 * 8) + 96);
        }
    }

    protected void processBlock() {
        adjustByteCounts();
        for (int i8 = 16; i8 <= 79; i8++) {
            long[] jArr = this.W;
            long Sigma1 = Sigma1(jArr[i8 - 2]);
            long[] jArr2 = this.W;
            jArr[i8] = Sigma1 + jArr2[i8 - 7] + Sigma0(jArr2[i8 - 15]) + this.W[i8 - 16];
        }
        long j8 = this.H1;
        long j9 = this.H2;
        long j10 = this.H3;
        long j11 = this.H4;
        long j12 = this.H5;
        long j13 = this.H6;
        long j14 = this.H7;
        long j15 = j13;
        long j16 = j11;
        int i9 = 0;
        long j17 = j9;
        long j18 = j10;
        long j19 = j12;
        int i10 = 0;
        long j20 = this.H8;
        long j21 = j8;
        long j22 = j14;
        while (i10 < 10) {
            long j23 = j19;
            long Sum1 = Sum1(j19) + Ch(j19, j15, j22);
            long[] jArr3 = K;
            int i11 = i9 + 1;
            long j24 = j20 + Sum1 + jArr3[i9] + this.W[i9];
            long j25 = j16 + j24;
            long Sum0 = j24 + Sum0(j21) + Maj(j21, j17, j18);
            int i12 = i9 + 2;
            long Sum12 = j22 + Sum1(j25) + Ch(j25, j23, j15) + jArr3[i11] + this.W[i11];
            long j26 = j18 + Sum12;
            long Sum02 = Sum12 + Sum0(Sum0) + Maj(Sum0, j21, j17);
            int i13 = i9 + 3;
            long Sum13 = j15 + Sum1(j26) + Ch(j26, j25, j23) + jArr3[i12] + this.W[i12];
            long j27 = j17 + Sum13;
            long Sum03 = Sum13 + Sum0(Sum02) + Maj(Sum02, Sum0, j21);
            int i14 = i9 + 4;
            long Sum14 = j23 + Sum1(j27) + Ch(j27, j26, j25) + jArr3[i13] + this.W[i13];
            long j28 = j21 + Sum14;
            long Sum04 = Sum14 + Sum0(Sum03) + Maj(Sum03, Sum02, Sum0);
            int i15 = i9 + 5;
            long Sum15 = j25 + Sum1(j28) + Ch(j28, j27, j26) + jArr3[i14] + this.W[i14];
            long j29 = Sum0 + Sum15;
            long Sum05 = Sum15 + Sum0(Sum04) + Maj(Sum04, Sum03, Sum02);
            int i16 = i9 + 6;
            long Sum16 = j26 + Sum1(j29) + Ch(j29, j28, j27) + jArr3[i15] + this.W[i15];
            long j30 = Sum02 + Sum16;
            long Sum06 = Sum16 + Sum0(Sum05) + Maj(Sum05, Sum04, Sum03);
            j22 = j30;
            int i17 = i9 + 7;
            long Sum17 = j27 + Sum1(j30) + Ch(j30, j29, j28) + jArr3[i16] + this.W[i16];
            long j31 = Sum03 + Sum17;
            j15 = j31;
            j17 = Sum17 + Sum0(Sum06) + Maj(Sum06, Sum05, Sum04);
            i9 += 8;
            long Sum18 = j28 + Sum1(j31) + Ch(j31, j22, j29) + jArr3[i17] + this.W[i17];
            long Sum07 = Sum18 + Sum0(j17) + Maj(j17, Sum06, Sum05);
            i10++;
            j19 = Sum04 + Sum18;
            j18 = Sum06;
            j20 = j29;
            j16 = Sum05;
            j21 = Sum07;
        }
        this.H1 += j21;
        this.H2 += j17;
        this.H3 += j18;
        this.H4 += j16;
        this.H5 += j19;
        this.H6 += j15;
        this.H7 += j22;
        this.H8 += j20;
        this.wOff = 0;
        for (int i18 = 0; i18 < 16; i18++) {
            this.W[i18] = 0;
        }
    }

    protected void processLength(long j8, long j9) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.W;
        jArr[14] = j9;
        jArr[15] = j8;
    }

    protected void processWord(byte[] bArr, int i8) {
        this.W[this.wOff] = org.bouncycastle.util.i.bigEndianToLong(bArr, i8);
        int i9 = this.wOff + 1;
        this.wOff = i9;
        if (i9 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i8 = 0;
        this.xBufOff = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i9 >= bArr.length) {
                break;
            }
            bArr[i9] = 0;
            i9++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.W;
            if (i8 == jArr.length) {
                return;
            }
            jArr[i8] = 0;
            i8++;
        }
    }

    @Override // org.bouncycastle.util.g
    public abstract /* synthetic */ void reset(org.bouncycastle.util.g gVar);

    protected void restoreState(byte[] bArr) {
        int bigEndianToInt = org.bouncycastle.util.i.bigEndianToInt(bArr, 8);
        this.xBufOff = bigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, bigEndianToInt);
        this.byteCount1 = org.bouncycastle.util.i.bigEndianToLong(bArr, 12);
        this.byteCount2 = org.bouncycastle.util.i.bigEndianToLong(bArr, 20);
        this.H1 = org.bouncycastle.util.i.bigEndianToLong(bArr, 28);
        this.H2 = org.bouncycastle.util.i.bigEndianToLong(bArr, 36);
        this.H3 = org.bouncycastle.util.i.bigEndianToLong(bArr, 44);
        this.H4 = org.bouncycastle.util.i.bigEndianToLong(bArr, 52);
        this.H5 = org.bouncycastle.util.i.bigEndianToLong(bArr, 60);
        this.H6 = org.bouncycastle.util.i.bigEndianToLong(bArr, 68);
        this.H7 = org.bouncycastle.util.i.bigEndianToLong(bArr, 76);
        this.H8 = org.bouncycastle.util.i.bigEndianToLong(bArr, 84);
        this.wOff = org.bouncycastle.util.i.bigEndianToInt(bArr, 92);
        for (int i8 = 0; i8 < this.wOff; i8++) {
            this.W[i8] = org.bouncycastle.util.i.bigEndianToLong(bArr, (i8 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void update(byte b8) {
        byte[] bArr = this.xBuf;
        int i8 = this.xBufOff;
        int i9 = i8 + 1;
        this.xBufOff = i9;
        bArr[i8] = b8;
        if (i9 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    protected d(d dVar) {
        this.xBuf = new byte[8];
        this.W = new long[80];
        copyIn(dVar);
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void update(byte[] bArr, int i8, int i9) {
        while (this.xBufOff != 0 && i9 > 0) {
            update(bArr[i8]);
            i8++;
            i9--;
        }
        while (i9 > this.xBuf.length) {
            processWord(bArr, i8);
            byte[] bArr2 = this.xBuf;
            i8 += bArr2.length;
            i9 -= bArr2.length;
            this.byteCount1 += bArr2.length;
        }
        while (i9 > 0) {
            update(bArr[i8]);
            i8++;
            i9--;
        }
    }
}
