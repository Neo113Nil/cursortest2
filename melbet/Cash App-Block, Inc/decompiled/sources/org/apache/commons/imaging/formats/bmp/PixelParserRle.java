package org.apache.commons.imaging.formats.bmp;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.logging.Logger;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
class PixelParserRle extends PixelParser {
    private static final Logger LOGGER = Logger.getLogger(PixelParserRle.class.getName());

    public PixelParserRle(BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
    }

    private int[] convertDataToSamples(int i) {
        int i2 = this.bhi.bitsPerPixel;
        if (i2 == 8) {
            return new int[]{getColorTableRGB(i)};
        }
        if (i2 == 4) {
            return new int[]{getColorTableRGB(i >> 4), getColorTableRGB(i & 15)};
        }
        throw new ImageReadException("BMP RLE: bad BitsPerPixel: " + this.bhi.bitsPerPixel);
    }

    private int getSamplesPerByte() {
        int i = this.bhi.bitsPerPixel;
        if (i == 8) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        throw new ImageReadException("BMP RLE: bad BitsPerPixel: " + this.bhi.bitsPerPixel);
    }

    private int processByteOfData(int[] iArr, int i, int i2, int i3, int i4, int i5, ImageBuilder imageBuilder) {
        int i6 = i2;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            if (i6 < 0 || i6 >= i4 || i3 < 0 || i3 >= i5) {
                LOGGER.fine(Recorder$$ExternalSyntheticOutline2.m(i6, i3, "skipping bad pixel (", ",", ")"));
            } else {
                imageBuilder.setRGB(i6, i3, iArr[i8 % iArr.length]);
            }
            i6++;
            i7++;
        }
        return i7;
    }

    @Override // org.apache.commons.imaging.formats.bmp.PixelParser
    public void processImage(ImageBuilder imageBuilder) {
        BmpHeaderInfo bmpHeaderInfo = this.bhi;
        int i = bmpHeaderInfo.width;
        int i2 = bmpHeaderInfo.height;
        int i3 = i2 - 1;
        boolean z = false;
        int i4 = 0;
        while (!z) {
            int readByte = BinaryFunctions.readByte(Recorder$$ExternalSyntheticOutline2.m(i4, i3, "RLE (", ",", ") a"), this.is, "BMP: Bad RLE") & 255;
            int readByte2 = BinaryFunctions.readByte(Recorder$$ExternalSyntheticOutline2.m(i4, i3, "RLE (", ",", ") b"), this.is, "BMP: Bad RLE") & 255;
            if (readByte != 0) {
                i4 += processByteOfData(convertDataToSamples(readByte2), readByte, i4, i3, i, i2, imageBuilder);
            } else if (readByte2 == 0) {
                i3--;
                i4 = 0;
            } else if (readByte2 == 1) {
                z = true;
            } else if (readByte2 != 2) {
                int samplesPerByte = getSamplesPerByte();
                int i5 = readByte2 / samplesPerByte;
                if (readByte2 % samplesPerByte > 0) {
                    i5++;
                }
                if (i5 % 2 != 0) {
                    i5++;
                }
                byte[] readBytes = BinaryFunctions.readBytes("bytes", this.is, i5, "RLE: Absolute Mode");
                int i6 = readByte2;
                int i7 = 0;
                while (i6 > 0) {
                    int processByteOfData = processByteOfData(convertDataToSamples(readBytes[i7] & 255), Math.min(i6, samplesPerByte), i4, i3, i, i2, imageBuilder);
                    i4 += processByteOfData;
                    i6 -= processByteOfData;
                    i7++;
                }
            } else {
                i4 += BinaryFunctions.readByte("RLE deltaX", this.is, "BMP: Bad RLE") & 255;
                i3 -= BinaryFunctions.readByte("RLE deltaY", this.is, "BMP: Bad RLE") & 255;
            }
        }
    }
}
