package org.apache.commons.imaging.formats.bmp;

import java.nio.ByteOrder;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
class PixelParserRgb extends PixelParserSimple {
    private int bytecount;
    private int cachedBitCount;
    private int cachedByte;

    public PixelParserRgb(BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public int getNextRGB() {
        int i = this.bhi.bitsPerPixel;
        if (i == 1 || i == 4) {
            int i2 = this.cachedBitCount;
            if (i2 < i) {
                if (i2 != 0) {
                    throw new ImageReadException("Unexpected leftover bits: " + this.cachedBitCount + "/" + this.bhi.bitsPerPixel);
                }
                this.cachedBitCount = i2 + 8;
                byte[] bArr = this.imageData;
                int i3 = this.bytecount;
                this.cachedByte = bArr[i3] & 255;
                this.bytecount = i3 + 1;
            }
            int i4 = this.cachedByte;
            int i5 = ((1 << i) - 1) & (i4 >> (8 - i));
            this.cachedByte = (i4 << i) & 255;
            this.cachedBitCount -= i;
            return getColorTableRGB(i5);
        }
        if (i == 8) {
            int colorTableRGB = getColorTableRGB(this.imageData[this.bytecount] & 255);
            this.bytecount++;
            return colorTableRGB;
        }
        if (i == 16) {
            int read2Bytes = BinaryFunctions.read2Bytes("Pixel", this.is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);
            int i6 = (((read2Bytes >> 10) & 31) << 19) | (-16777216) | (((read2Bytes >> 5) & 31) << 11) | ((read2Bytes & 31) << 3);
            this.bytecount += 2;
            return i6;
        }
        if (i == 24) {
            byte[] bArr2 = this.imageData;
            int i7 = this.bytecount;
            int i8 = ((bArr2[i7 + 2] & 255) << 16) | (-16777216) | ((bArr2[i7 + 1] & 255) << 8) | (bArr2[i7] & 255);
            this.bytecount = i7 + 3;
            return i8;
        }
        if (i != 32) {
            throw new ImageReadException("Unknown BitsPerPixel: " + this.bhi.bitsPerPixel);
        }
        byte[] bArr3 = this.imageData;
        int i9 = this.bytecount;
        int i10 = ((bArr3[i9 + 2] & 255) << 16) | (-16777216) | ((bArr3[i9 + 1] & 255) << 8) | (bArr3[i9] & 255);
        this.bytecount = i9 + 4;
        return i10;
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParserSimple
    public void newline() {
        this.cachedBitCount = 0;
        while (this.bytecount % 4 != 0) {
            BinaryFunctions.readByte("Pixel", this.is, "BMP Image Data");
            this.bytecount++;
        }
    }
}
