package com.google.android.exoplayer2.util;

@Deprecated
/* loaded from: classes3.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    public ParsableNalUnitBitArray(byte[] bArr, int i8, int i9) {
        reset(bArr, i8, i9);
    }

    private void assertValidOffset() {
        int i8;
        int i9 = this.byteOffset;
        Assertions.checkState(i9 >= 0 && (i9 < (i8 = this.byteLimit) || (i9 == i8 && this.bitOffset == 0)));
    }

    private int readExpGolombCodeNum() {
        int i8 = 0;
        while (!readBit()) {
            i8++;
        }
        return ((1 << i8) - 1) + (i8 > 0 ? readBits(i8) : 0);
    }

    private boolean shouldSkipByte(int i8) {
        if (2 <= i8 && i8 < this.byteLimit) {
            byte[] bArr = this.data;
            if (bArr[i8] == 3 && bArr[i8 - 2] == 0 && bArr[i8 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean canReadBits(int i8) {
        int i9 = this.byteOffset;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        int i12 = (this.bitOffset + i8) - (i10 * 8);
        if (i12 > 7) {
            i11++;
            i12 -= 8;
        }
        while (true) {
            i9++;
            if (i9 > i11 || i11 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i9)) {
                i11++;
                i9 += 2;
            }
        }
        int i13 = this.byteLimit;
        if (i11 >= i13) {
            return i11 == i13 && i12 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i8 = this.byteOffset;
        int i9 = this.bitOffset;
        int i10 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i10++;
        }
        boolean z7 = this.byteOffset == this.byteLimit;
        this.byteOffset = i8;
        this.bitOffset = i9;
        return !z7 && canReadBits((i10 * 2) + 1);
    }

    public boolean readBit() {
        boolean z7 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z7;
    }

    public int readBits(int i8) {
        int i9;
        this.bitOffset += i8;
        int i10 = 0;
        while (true) {
            i9 = this.bitOffset;
            if (i9 <= 8) {
                break;
            }
            int i11 = i9 - 8;
            this.bitOffset = i11;
            byte[] bArr = this.data;
            int i12 = this.byteOffset;
            i10 |= (bArr[i12] & 255) << i11;
            if (!shouldSkipByte(i12 + 1)) {
                r3 = 1;
            }
            this.byteOffset = i12 + r3;
        }
        byte[] bArr2 = this.data;
        int i13 = this.byteOffset;
        int i14 = ((-1) >>> (32 - i8)) & (i10 | ((bArr2[i13] & 255) >> (8 - i9)));
        if (i9 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i13 + (shouldSkipByte(i13 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i14;
    }

    public int readSignedExpGolombCodedInt() {
        int readExpGolombCodeNum = readExpGolombCodeNum();
        return (readExpGolombCodeNum % 2 == 0 ? -1 : 1) * ((readExpGolombCodeNum + 1) / 2);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public void reset(byte[] bArr, int i8, int i9) {
        this.data = bArr;
        this.byteOffset = i8;
        this.byteLimit = i9;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i8 = this.bitOffset + 1;
        this.bitOffset = i8;
        if (i8 == 8) {
            this.bitOffset = 0;
            int i9 = this.byteOffset;
            this.byteOffset = i9 + (shouldSkipByte(i9 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i8) {
        int i9 = this.byteOffset;
        int i10 = i8 / 8;
        int i11 = i9 + i10;
        this.byteOffset = i11;
        int i12 = this.bitOffset + (i8 - (i10 * 8));
        this.bitOffset = i12;
        if (i12 > 7) {
            this.byteOffset = i11 + 1;
            this.bitOffset = i12 - 8;
        }
        while (true) {
            i9++;
            if (i9 > this.byteOffset) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i9)) {
                this.byteOffset++;
                i9 += 2;
            }
        }
    }
}
