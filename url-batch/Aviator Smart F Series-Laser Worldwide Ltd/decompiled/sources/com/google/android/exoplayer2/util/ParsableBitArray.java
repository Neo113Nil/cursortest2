package com.google.android.exoplayer2.util;

import com.google.common.base.Charsets;
import java.nio.charset.Charset;

@Deprecated
/* loaded from: classes3.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private void assertValidOffset() {
        int i8;
        int i9 = this.byteOffset;
        Assertions.checkState(i9 >= 0 && (i9 < (i8 = this.byteLimit) || (i9 == i8 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Assertions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i8, int i9) {
        if (i9 < 32) {
            i8 &= (1 << i9) - 1;
        }
        int min = Math.min(8 - this.bitOffset, i9);
        int i10 = this.bitOffset;
        int i11 = (8 - i10) - min;
        byte[] bArr = this.data;
        int i12 = this.byteOffset;
        byte b8 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr[i12]);
        bArr[i12] = b8;
        int i13 = i9 - min;
        bArr[i12] = (byte) (b8 | ((i8 >>> i13) << i11));
        int i14 = i12 + 1;
        while (i13 > 8) {
            this.data[i14] = (byte) (i8 >>> (i13 - 8));
            i13 -= 8;
            i14++;
        }
        int i15 = 8 - i13;
        byte[] bArr2 = this.data;
        byte b9 = (byte) (bArr2[i14] & ((1 << i15) - 1));
        bArr2[i14] = b9;
        bArr2[i14] = (byte) (((i8 & ((1 << i13) - 1)) << i15) | b9);
        skipBits(i9);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z7 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z7;
    }

    public int readBits(int i8) {
        int i9;
        if (i8 == 0) {
            return 0;
        }
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
            this.byteOffset = i12 + 1;
            i10 |= (bArr[i12] & 255) << i11;
        }
        byte[] bArr2 = this.data;
        int i13 = this.byteOffset;
        int i14 = ((-1) >>> (32 - i8)) & (i10 | ((bArr2[i13] & 255) >> (8 - i9)));
        if (i9 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i13 + 1;
        }
        assertValidOffset();
        return i14;
    }

    public long readBitsToLong(int i8) {
        return i8 <= 32 ? Util.toUnsignedLong(readBits(i8)) : Util.toLong(readBits(i8 - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i8, int i9) {
        Assertions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i8, i9);
        this.byteOffset += i9;
        assertValidOffset();
    }

    public String readBytesAsString(int i8) {
        return readBytesAsString(i8, Charsets.UTF_8);
    }

    public void reset(byte[] bArr, int i8) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i8;
    }

    public void setPosition(int i8) {
        int i9 = i8 / 8;
        this.byteOffset = i9;
        this.bitOffset = i8 - (i9 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i8 = this.bitOffset + 1;
        this.bitOffset = i8;
        if (i8 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
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

    public void skipBytes(int i8) {
        Assertions.checkState(this.bitOffset == 0);
        this.byteOffset += i8;
        assertValidOffset();
    }

    public String readBytesAsString(int i8, Charset charset) {
        byte[] bArr = new byte[i8];
        readBytes(bArr, 0, i8);
        return new String(bArr, charset);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public ParsableBitArray(byte[] bArr, int i8) {
        this.data = bArr;
        this.byteLimit = i8;
    }

    public void readBits(byte[] bArr, int i8, int i9) {
        int i10 = (i9 >> 3) + i8;
        while (i8 < i10) {
            byte[] bArr2 = this.data;
            int i11 = this.byteOffset;
            int i12 = i11 + 1;
            this.byteOffset = i12;
            byte b8 = bArr2[i11];
            int i13 = this.bitOffset;
            byte b9 = (byte) (b8 << i13);
            bArr[i8] = b9;
            bArr[i8] = (byte) (((255 & bArr2[i12]) >> (8 - i13)) | b9);
            i8++;
        }
        int i14 = i9 & 7;
        if (i14 == 0) {
            return;
        }
        byte b10 = (byte) (bArr[i10] & (255 >> i14));
        bArr[i10] = b10;
        int i15 = this.bitOffset;
        if (i15 + i14 > 8) {
            byte[] bArr3 = this.data;
            int i16 = this.byteOffset;
            this.byteOffset = i16 + 1;
            bArr[i10] = (byte) (b10 | ((bArr3[i16] & 255) << i15));
            this.bitOffset = i15 - 8;
        }
        int i17 = this.bitOffset + i14;
        this.bitOffset = i17;
        byte[] bArr4 = this.data;
        int i18 = this.byteOffset;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i14))) | bArr[i10]);
        if (i17 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i18 + 1;
        }
        assertValidOffset();
    }
}
