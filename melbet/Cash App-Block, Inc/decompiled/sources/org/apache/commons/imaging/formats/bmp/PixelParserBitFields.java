package org.apache.commons.imaging.formats.bmp;

import java.nio.ByteOrder;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
class PixelParserBitFields extends PixelParserSimple {
    private final int alphaMask;
    private final int alphaShift;
    private final int blueMask;
    private final int blueShift;
    private int bytecount;
    private final int greenMask;
    private final int greenShift;
    private final int redMask;
    private final int redShift;

    public PixelParserBitFields(BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
        int i = bmpHeaderInfo.redMask;
        this.redMask = i;
        int i2 = bmpHeaderInfo.greenMask;
        this.greenMask = i2;
        int i3 = bmpHeaderInfo.blueMask;
        this.blueMask = i3;
        int i4 = bmpHeaderInfo.alphaMask;
        this.alphaMask = i4;
        this.redShift = getMaskShift(i);
        this.greenShift = getMaskShift(i2);
        this.blueShift = getMaskShift(i3);
        this.alphaShift = i4 != 0 ? getMaskShift(i4) : 0;
    }

    private int getMaskShift(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = 0;
        while ((i & 1) == 0) {
            i = (i >> 1) & Integer.MAX_VALUE;
            i3++;
        }
        while ((i & 1) == 1) {
            i = (i >> 1) & Integer.MAX_VALUE;
            i2++;
        }
        return i3 - (8 - i2);
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public int getNextRGB() {
        int read2Bytes;
        int i = this.bhi.bitsPerPixel;
        if (i == 8) {
            byte[] bArr = this.imageData;
            int i2 = this.bytecount;
            read2Bytes = bArr[i2] & 255;
            this.bytecount = i2 + 1;
        } else if (i == 24) {
            read2Bytes = BinaryFunctions.read3Bytes("Pixel", this.is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 3;
        } else if (i == 32) {
            read2Bytes = BinaryFunctions.read4Bytes("Pixel", this.is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 4;
        } else {
            if (i != 16) {
                throw new ImageReadException("Unknown BitsPerPixel: " + this.bhi.bitsPerPixel);
            }
            read2Bytes = BinaryFunctions.read2Bytes("Pixel", this.is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            this.bytecount += 2;
        }
        int i3 = this.redMask & read2Bytes;
        int i4 = this.greenMask & read2Bytes;
        int i5 = this.blueMask & read2Bytes;
        int i6 = this.alphaMask;
        int i7 = i6 != 0 ? i6 & read2Bytes : 255;
        int i8 = this.redShift;
        int i9 = i8 >= 0 ? i3 >> i8 : i3 << (-i8);
        int i10 = this.greenShift;
        int i11 = i10 >= 0 ? i4 >> i10 : i4 << (-i10);
        int i12 = this.blueShift;
        int i13 = i12 >= 0 ? i5 >> i12 : i5 << (-i12);
        int i14 = this.alphaShift;
        return ((i14 >= 0 ? i7 >> i14 : i7 << (-i14)) << 24) | (i9 << 16) | (i11 << 8) | i13;
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public void newline() {
        while (this.bytecount % 4 != 0) {
            BinaryFunctions.readByte("Pixel", this.is, "BMP Image Data");
            this.bytecount++;
        }
    }
}
