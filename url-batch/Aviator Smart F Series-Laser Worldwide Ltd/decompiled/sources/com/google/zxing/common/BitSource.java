package com.google.zxing.common;

/* loaded from: classes4.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int i8) {
        if (i8 <= 0 || i8 > 32 || i8 > available()) {
            throw new IllegalArgumentException(String.valueOf(i8));
        }
        int i9 = this.bitOffset;
        int i10 = 0;
        if (i9 > 0) {
            int i11 = 8 - i9;
            int i12 = i8 < i11 ? i8 : i11;
            int i13 = i11 - i12;
            byte[] bArr = this.bytes;
            int i14 = this.byteOffset;
            int i15 = (((255 >> (8 - i12)) << i13) & bArr[i14]) >> i13;
            i8 -= i12;
            int i16 = i9 + i12;
            this.bitOffset = i16;
            if (i16 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i14 + 1;
            }
            i10 = i15;
        }
        if (i8 <= 0) {
            return i10;
        }
        while (i8 >= 8) {
            int i17 = i10 << 8;
            byte[] bArr2 = this.bytes;
            int i18 = this.byteOffset;
            i10 = (bArr2[i18] & 255) | i17;
            this.byteOffset = i18 + 1;
            i8 -= 8;
        }
        if (i8 <= 0) {
            return i10;
        }
        int i19 = 8 - i8;
        int i20 = (i10 << i8) | ((((255 >> i19) << i19) & this.bytes[this.byteOffset]) >> i19);
        this.bitOffset += i8;
        return i20;
    }
}
