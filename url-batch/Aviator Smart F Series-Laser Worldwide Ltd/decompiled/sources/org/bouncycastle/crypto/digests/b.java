package org.bouncycastle.crypto.digests;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes5.dex */
public abstract class b implements org.bouncycastle.crypto.f, org.bouncycastle.util.g {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    protected b() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    @Override // org.bouncycastle.util.g
    public abstract /* synthetic */ org.bouncycastle.util.g copy();

    protected void copyIn(b bVar) {
        byte[] bArr = bVar.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = bVar.xBufOff;
        this.byteCount = bVar.byteCount;
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public abstract /* synthetic */ int doFinal(byte[] bArr, int i8);

    public void finish() {
        long j8 = this.byteCount << 3;
        byte b8 = UnsignedBytes.MAX_POWER_OF_TWO;
        while (true) {
            update(b8);
            if (this.xBufOff == 0) {
                processLength(j8);
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
        return 64;
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public abstract /* synthetic */ int getDigestSize();

    protected void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        org.bouncycastle.util.i.intToBigEndian(this.xBufOff, bArr, 4);
        org.bouncycastle.util.i.longToBigEndian(this.byteCount, bArr, 8);
    }

    protected abstract void processBlock();

    protected abstract void processLength(long j8);

    protected abstract void processWord(byte[] bArr, int i8);

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i8 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i8 >= bArr.length) {
                return;
            }
            bArr[i8] = 0;
            i8++;
        }
    }

    @Override // org.bouncycastle.util.g
    public abstract /* synthetic */ void reset(org.bouncycastle.util.g gVar);

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
        this.byteCount++;
    }

    protected b(b bVar) {
        this.xBuf = new byte[4];
        copyIn(bVar);
    }

    @Override // org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void update(byte[] bArr, int i8, int i9) {
        int i10 = 0;
        int max = Math.max(0, i9);
        if (this.xBufOff != 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= max) {
                    i10 = i11;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i12 = this.xBufOff;
                int i13 = i12 + 1;
                this.xBufOff = i13;
                int i14 = i11 + 1;
                bArr2[i12] = bArr[i11 + i8];
                if (i13 == 4) {
                    processWord(bArr2, 0);
                    this.xBufOff = 0;
                    i10 = i14;
                    break;
                }
                i11 = i14;
            }
        }
        int i15 = ((max - i10) & (-4)) + i10;
        while (i10 < i15) {
            processWord(bArr, i8 + i10);
            i10 += 4;
        }
        while (i10 < max) {
            byte[] bArr3 = this.xBuf;
            int i16 = this.xBufOff;
            this.xBufOff = i16 + 1;
            bArr3[i16] = bArr[i10 + i8];
            i10++;
        }
        this.byteCount += max;
    }

    protected b(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.xBuf = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.xBufOff = org.bouncycastle.util.i.bigEndianToInt(bArr, 4);
        this.byteCount = org.bouncycastle.util.i.bigEndianToLong(bArr, 8);
    }
}
