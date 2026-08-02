package org.apache.commons.imaging.formats.tiff.datareaders;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffRasterData;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public final class DataReaderStrips extends ImageDataReader {
    private final int bitsPerPixel;
    private final ByteOrder byteOrder;
    private final int compression;
    private final TiffImageData.Strips imageData;
    private final int rowsPerStrip;
    private int x;
    private int y;

    public DataReaderStrips(TiffDirectory tiffDirectory, PhotometricInterpreter photometricInterpreter, int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, ByteOrder byteOrder, int i8, TiffImageData.Strips strips) {
        super(tiffDirectory, photometricInterpreter, iArr, i2, i3, i4, i5, i6);
        this.bitsPerPixel = i;
        this.compression = i7;
        this.rowsPerStrip = i8;
        this.imageData = strips;
        this.byteOrder = byteOrder;
    }

    private void interpretStrip(ImageBuilder imageBuilder, byte[] bArr, int i, int i2) {
        int i3 = this.y;
        if (i3 >= i2) {
            return;
        }
        int i4 = 3;
        if (this.sampleFormat == 3) {
            int i5 = this.width;
            int i6 = i / i5;
            if (i3 + i6 > i2) {
                i6 = i2 - i3;
            }
            int i7 = i3 + i6;
            this.x = 0;
            this.y = i6 + i3;
            int[] unpackFloatingPointSamples = unpackFloatingPointSamples(i5, i7 - i3, i5, bArr, this.predictor, this.bitsPerPixel, this.byteOrder);
            int i8 = 0;
            while (i3 < i7) {
                int i9 = 0;
                while (i9 < this.width) {
                    this.photometricInterpreter.interpretPixel(imageBuilder, new int[]{unpackFloatingPointSamples[i8]}, i9, i3);
                    i9++;
                    i8++;
                }
                i3++;
            }
            return;
        }
        char c = '\b';
        boolean isHomogenous = isHomogenous(8);
        int i10 = this.predictor;
        if (i10 != 2 && this.bitsPerPixel == 8 && isHomogenous) {
            int i11 = i / this.width;
            int i12 = this.y;
            if (i12 + i11 > i2) {
                i11 = i2 - i12;
            }
            int i13 = i12 + i11;
            this.x = 0;
            this.y = i11 + i12;
            int i14 = 0;
            while (i12 < i13) {
                int i15 = 0;
                while (i15 < this.width) {
                    this.photometricInterpreter.interpretPixel(imageBuilder, new int[]{bArr[i14] & 255}, i15, i12);
                    i15++;
                    i14++;
                }
                i12++;
            }
            return;
        }
        if (this.bitsPerPixel == 24 && isHomogenous && (this.photometricInterpreter instanceof PhotometricInterpreterRgb)) {
            int i16 = i / this.width;
            int i17 = this.y;
            if (i17 + i16 > i2) {
                i16 = i2 - i17;
            }
            int i18 = i17 + i16;
            this.x = 0;
            this.y = i16 + i17;
            if (i10 == 2) {
                int i19 = i17;
                int i20 = 0;
                while (i19 < i18) {
                    int i21 = bArr[i20] & 255;
                    int i22 = i20 + 2;
                    int i23 = bArr[i20 + 1] & 255;
                    i20 += i4;
                    int i24 = bArr[i22] & 255;
                    int i25 = 1;
                    while (i25 < this.width) {
                        i21 = (bArr[i20] + i21) & 255;
                        int i26 = i20 + 1;
                        bArr[i20] = (byte) i21;
                        i23 = (bArr[i26] + i23) & 255;
                        int i27 = i20 + 2;
                        bArr[i26] = (byte) i23;
                        i24 = (bArr[i27] + i24) & 255;
                        i20 += 3;
                        bArr[i27] = (byte) i24;
                        i25++;
                        c = c;
                    }
                    i19++;
                    i4 = 3;
                }
            }
            int i28 = 0;
            while (i17 < i18) {
                int i29 = 0;
                while (i29 < this.width) {
                    imageBuilder.setRGB(i29, i17, (((bArr[i28] << 8) | (bArr[i28 + 1] & 255)) << 8) | (-16777216) | (bArr[i28 + 2] & 255));
                    i29++;
                    i28 += 3;
                }
                i17++;
            }
            return;
        }
        BitInputStream bitInputStream = new BitInputStream(new ByteArrayInputStream(bArr), this.byteOrder);
        try {
            int[] iArr = new int[this.bitsPerSampleLength];
            resetPredictor();
            for (int i30 = 0; i30 < i; i30++) {
                getSamplesAsBytes(bitInputStream, iArr);
                if (this.x < this.width) {
                    iArr = applyPredictor(iArr);
                    this.photometricInterpreter.interpretPixel(imageBuilder, iArr, this.x, this.y);
                }
                int i31 = this.x + 1;
                this.x = i31;
                if (i31 >= this.width) {
                    this.x = 0;
                    resetPredictor();
                    this.y++;
                    bitInputStream.flushCache();
                    if (this.y >= i2) {
                        break;
                    }
                }
            }
            bitInputStream.close();
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public BufferedImage readImageData(Rectangle rectangle) {
        int i = rectangle.y / this.rowsPerStrip;
        int i2 = (rectangle.y + rectangle.height) - 1;
        int i3 = this.rowsPerStrip;
        int i4 = i2 / i3;
        int i5 = ((i4 - i) + 1) * i3;
        int i6 = i * i3;
        int i7 = (rectangle.y - i6) + rectangle.height;
        ImageBuilder imageBuilder = new ImageBuilder(this.width, i5, false);
        for (int i8 = i; i8 <= i4; i8++) {
            long j = this.rowsPerStrip & BodyPartID.bodyIdMax;
            long min = Math.min(this.height - (i8 * j), j);
            int i9 = this.bitsPerPixel;
            interpretStrip(imageBuilder, decompress(this.imageData.getImageData(i8).getData(), this.compression, (int) (Recorder$$ExternalSyntheticOutline1.m(i9, r4, 7, 8) * min), this.width, (int) min), (int) (this.width * min), i7);
        }
        return (rectangle.x == 0 && rectangle.y == i6 && rectangle.width == this.width && rectangle.height == i5) ? imageBuilder.getBufferedImage() : imageBuilder.getSubimage(rectangle.x, rectangle.y - i6, rectangle.width, rectangle.height);
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public TiffRasterData readRasterData(Rectangle rectangle) {
        int i;
        int i2;
        int i3;
        int i4;
        DataReaderStrips dataReaderStrips = this;
        if (rectangle != null) {
            int i5 = rectangle.x;
            int i6 = rectangle.y;
            i = rectangle.width;
            i2 = rectangle.height;
            i3 = i5;
            i4 = i6;
        } else {
            i = dataReaderStrips.width;
            i2 = dataReaderStrips.height;
            i3 = 0;
            i4 = 0;
        }
        int i7 = i2;
        int i8 = i;
        float[] fArr = new float[i8 * i7];
        int i9 = dataReaderStrips.rowsPerStrip;
        int m = Fragment$5$$ExternalSyntheticOutline0.m(i4, i7, 1, i9);
        int i10 = i4 / i9;
        while (i10 <= m) {
            int i11 = dataReaderStrips.rowsPerStrip;
            int i12 = i10 * i11;
            int min = Math.min(dataReaderStrips.height - i12, i11);
            byte[] decompress = dataReaderStrips.decompress(dataReaderStrips.imageData.getImageData(i10).getData(), dataReaderStrips.compression, (((dataReaderStrips.bitsPerPixel * dataReaderStrips.width) + 7) / 8) * min, dataReaderStrips.width, min);
            int i13 = dataReaderStrips.width;
            int i14 = i3;
            int i15 = i4;
            dataReaderStrips.transferBlockToRaster(0, i12, dataReaderStrips.width, min, dataReaderStrips.unpackFloatingPointSamples(i13, min, i13, decompress, dataReaderStrips.predictor, dataReaderStrips.bitsPerPixel, dataReaderStrips.byteOrder), i14, i15, i8, i7, fArr);
            i10++;
            dataReaderStrips = this;
            i3 = i14;
            i4 = i15;
        }
        return new TiffRasterData(i8, i7, fArr);
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public void readImageData(ImageBuilder imageBuilder) {
        int i = 0;
        while (i < this.imageData.getImageDataLength()) {
            long j = this.rowsPerStrip & BodyPartID.bodyIdMax;
            long min = Math.min(this.height - (i * j), j);
            int i2 = this.bitsPerPixel;
            DataReaderStrips dataReaderStrips = this;
            dataReaderStrips.interpretStrip(imageBuilder, dataReaderStrips.decompress(this.imageData.getImageData(i).getData(), this.compression, (int) (Recorder$$ExternalSyntheticOutline1.m(i2, r4, 7, 8) * min), this.width, (int) min), (int) (this.width * min), dataReaderStrips.height);
            i++;
            this = dataReaderStrips;
        }
    }
}
