package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes3.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    private void assertValidOffset() {
        int i8;
        int i9 = this.byteOffset;
        Assertions.checkState(i9 >= 0 && (i9 < (i8 = this.byteLimit) || (i9 == i8 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z7 = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z7;
    }

    public int readBits(int i8) {
        int i9 = this.byteOffset;
        int min = Math.min(i8, 8 - this.bitOffset);
        int i10 = i9 + 1;
        int i11 = ((this.data[i9] & 255) >> this.bitOffset) & (255 >> (8 - min));
        while (min < i8) {
            i11 |= (this.data[i10] & 255) << min;
            min += 8;
            i10++;
        }
        int i12 = i11 & ((-1) >>> (32 - i8));
        skipBits(i8);
        return i12;
    }

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i8) {
        int i9 = i8 / 8;
        this.byteOffset = i9;
        this.bitOffset = i8 - (i9 * 8);
        assertValidOffset();
    }

    public void skipBits(int i8) {
        int i9 = i8 / 8;
        int i10 = this.byteOffset + i9;
        this.byteOffset = i10;
        int i11 = this.bitOffset + (i8 - (i9 * 8));
        this.bitOffset = i11;
        if (i11 > 7) {
            this.byteOffset = i10 + 1;
            this.bitOffset = i11 - 8;
        }
        assertValidOffset();
    }
}
