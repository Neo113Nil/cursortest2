package org.apache.commons.imaging.formats.tiff.datareaders;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffRasterData;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;

/* loaded from: classes9.dex */
public final class DataReaderTiled extends ImageDataReader {
    private final int bitsPerPixel;
    private final ByteOrder byteOrder;
    private final int compression;
    private final TiffImageData.Tiles imageData;
    private final int tileLength;
    private final int tileWidth;

    public DataReaderTiled(TiffDirectory tiffDirectory, PhotometricInterpreter photometricInterpreter, int i, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, int i8, int i9, ByteOrder byteOrder, TiffImageData.Tiles tiles) {
        super(tiffDirectory, photometricInterpreter, iArr, i4, i5, i6, i7, i8);
        this.tileWidth = i;
        this.tileLength = i2;
        this.bitsPerPixel = i3;
        this.compression = i9;
        this.imageData = tiles;
        this.byteOrder = byteOrder;
    }

    private void interpretTile(ImageBuilder imageBuilder, byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i4;
        if (this.sampleFormat == 3) {
            int i7 = i2 + this.tileLength;
            int i8 = i7 > i6 ? i6 : i7;
            int i9 = this.tileWidth;
            int i10 = i + i9;
            int i11 = i10 > i5 ? i5 : i10;
            int[] iArr = new int[4];
            int[] unpackFloatingPointSamples = unpackFloatingPointSamples(i11 - i, i8 - i2, i9, bArr, this.predictor, this.bitsPerPixel, this.byteOrder);
            for (int i12 = i2; i12 < i8; i12++) {
                int i13 = (i12 - i2) * this.tileWidth;
                for (int i14 = i; i14 < i11; i14++) {
                    iArr[0] = unpackFloatingPointSamples[(i14 - i) + i13];
                    this.photometricInterpreter.interpretPixel(imageBuilder, iArr, i14, i12);
                }
            }
            return;
        }
        boolean isHomogenous = isHomogenous(8);
        if (this.bitsPerPixel == 24 && isHomogenous && (this.photometricInterpreter instanceof PhotometricInterpreterRgb)) {
            int i15 = i2 + this.tileLength;
            if (i15 <= i6) {
                i6 = i15;
            }
            int i16 = i + this.tileWidth;
            if (i16 <= i5) {
                i5 = i16;
            }
            if (this.predictor == 2) {
                for (int i17 = i2; i17 < i6; i17++) {
                    int i18 = (i17 - i2) * this.tileWidth * 3;
                    int i19 = bArr[i18] & 255;
                    int i20 = i18 + 2;
                    int i21 = bArr[i18 + 1] & 255;
                    int i22 = i18 + 3;
                    int i23 = bArr[i20] & 255;
                    for (int i24 = 1; i24 < this.tileWidth; i24++) {
                        i19 = (bArr[i22] + i19) & 255;
                        int i25 = i22 + 1;
                        bArr[i22] = (byte) i19;
                        i21 = (bArr[i25] + i21) & 255;
                        int i26 = i22 + 2;
                        bArr[i25] = (byte) i21;
                        i23 = (bArr[i26] + i23) & 255;
                        i22 += 3;
                        bArr[i26] = (byte) i23;
                    }
                }
            }
            for (int i27 = i2; i27 < i6; i27++) {
                int i28 = (i27 - i2) * this.tileWidth * 3;
                int i29 = i;
                while (i29 < i5) {
                    imageBuilder.setRGB(i29, i27, (((bArr[i28] << 8) | (bArr[i28 + 1] & 255)) << 8) | (-16777216) | (bArr[i28 + 2] & 255));
                    i29++;
                    i28 += 3;
                }
            }
            return;
        }
        BitInputStream bitInputStream = new BitInputStream(new ByteArrayInputStream(bArr), this.byteOrder);
        try {
            int i30 = this.tileWidth * this.tileLength;
            int[] iArr2 = new int[this.bitsPerSampleLength];
            resetPredictor();
            int i31 = 0;
            int i32 = 0;
            for (int i33 = 0; i33 < i30; i33++) {
                int i34 = i31 + i;
                int i35 = i32 + i2;
                getSamplesAsBytes(bitInputStream, iArr2);
                if (i34 < i5 && i35 < i6) {
                    iArr2 = applyPredictor(iArr2);
                    this.photometricInterpreter.interpretPixel(imageBuilder, iArr2, i34, i35);
                }
                i31++;
                if (i31 >= this.tileWidth) {
                    resetPredictor();
                    i32++;
                    bitInputStream.flushCache();
                    if (i32 >= this.tileLength) {
                        break;
                    } else {
                        i31 = 0;
                    }
                }
            }
            bitInputStream.close();
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public BufferedImage readImageData(Rectangle rectangle) {
        DataReaderTiled dataReaderTiled = this;
        int m = Recorder$$ExternalSyntheticOutline1.m(dataReaderTiled.tileWidth, dataReaderTiled.bitsPerPixel, 7, 8) * dataReaderTiled.tileLength;
        int i = rectangle.x / dataReaderTiled.tileWidth;
        int i2 = ((rectangle.x + rectangle.width) - 1) / dataReaderTiled.tileWidth;
        int i3 = rectangle.y / dataReaderTiled.tileLength;
        int i4 = (rectangle.y + rectangle.height) - 1;
        int i5 = dataReaderTiled.tileLength;
        int i6 = i4 / i5;
        int i7 = dataReaderTiled.tileWidth;
        int i8 = ((i2 - i) + 1) * i7;
        int i9 = ((i6 - i3) + 1) * i5;
        int m2 = Fragment$5$$ExternalSyntheticOutline0.m(dataReaderTiled.width, i7, 1, i7);
        int i10 = i7 * i;
        int i11 = i3 * i5;
        ImageBuilder imageBuilder = new ImageBuilder(i8, i9, false);
        while (i3 <= i6) {
            int i12 = i;
            while (i12 <= i2) {
                int i13 = i12;
                int i14 = i3;
                dataReaderTiled.interpretTile(imageBuilder, dataReaderTiled.decompress(dataReaderTiled.imageData.tiles[(i3 * m2) + i12].getData(), dataReaderTiled.compression, m, dataReaderTiled.tileWidth, dataReaderTiled.tileLength), (dataReaderTiled.tileWidth * i13) - i10, (dataReaderTiled.tileLength * i14) - i11, i8, i9);
                i12 = i13 + 1;
                dataReaderTiled = this;
                i3 = i14;
                m = m;
            }
            i3++;
            dataReaderTiled = this;
        }
        return (rectangle.x == i10 && rectangle.y == i11 && rectangle.width == i8 && rectangle.height == i9) ? imageBuilder.getBufferedImage() : imageBuilder.getSubimage(rectangle.x - i10, rectangle.y - i11, rectangle.width, rectangle.height);
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public TiffRasterData readRasterData(Rectangle rectangle) {
        int i;
        int i2;
        int i3;
        int i4;
        DataReaderTiled dataReaderTiled = this;
        int m = dataReaderTiled.tileLength * Recorder$$ExternalSyntheticOutline1.m(dataReaderTiled.tileWidth, dataReaderTiled.bitsPerPixel, 7, 8);
        if (rectangle != null) {
            int i5 = rectangle.x;
            int i6 = rectangle.y;
            i = rectangle.width;
            i2 = rectangle.height;
            i3 = i5;
            i4 = i6;
        } else {
            i = dataReaderTiled.width;
            i2 = dataReaderTiled.height;
            i3 = 0;
            i4 = 0;
        }
        int i7 = i2;
        int i8 = i;
        float[] fArr = new float[i8 * i7];
        int i9 = dataReaderTiled.tileWidth;
        int i10 = i3 / i9;
        int m2 = Fragment$5$$ExternalSyntheticOutline0.m(i3, i8, 1, i9);
        int i11 = dataReaderTiled.tileLength;
        int i12 = i4 / i11;
        int m3 = Fragment$5$$ExternalSyntheticOutline0.m(i4, i7, 1, i11);
        int m4 = Fragment$5$$ExternalSyntheticOutline0.m(dataReaderTiled.width, i9, 1, i9);
        int i13 = i10 * i9;
        int i14 = i12 * i11;
        int i15 = i12;
        while (i15 <= m3) {
            int i16 = i10;
            while (i16 <= m2) {
                byte[] decompress = dataReaderTiled.decompress(dataReaderTiled.imageData.tiles[(i15 * m4) + i16].getData(), dataReaderTiled.compression, m, dataReaderTiled.tileWidth, dataReaderTiled.tileLength);
                int i17 = m;
                int i18 = dataReaderTiled.tileWidth;
                int i19 = dataReaderTiled.tileLength;
                int i20 = i15;
                int i21 = i16;
                int i22 = i3;
                int i23 = i4;
                dataReaderTiled.transferBlockToRaster((i16 * i18) - i13, (i15 * i19) - i14, dataReaderTiled.tileWidth, dataReaderTiled.tileLength, dataReaderTiled.unpackFloatingPointSamples(i18, i19, i18, decompress, dataReaderTiled.predictor, dataReaderTiled.bitsPerPixel, dataReaderTiled.byteOrder), i22, i23, i8, i7, fArr);
                m = i17;
                i3 = i22;
                i4 = i23;
                i15 = i20;
                i16 = i21 + 1;
                dataReaderTiled = this;
            }
            i3 = i3;
            i4 = i4;
            i15++;
            dataReaderTiled = this;
        }
        return new TiffRasterData(i8, i7, fArr);
    }

    @Override // org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader
    public void readImageData(ImageBuilder imageBuilder) {
        int m = Recorder$$ExternalSyntheticOutline1.m(this.tileWidth, this.bitsPerPixel, 7, 8) * this.tileLength;
        TiffElement.DataElement[] dataElementArr = this.imageData.tiles;
        int length = dataElementArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = m;
            int i5 = i;
            int i6 = i3;
            interpretTile(imageBuilder, decompress(dataElementArr[i2].getData(), this.compression, m, this.tileWidth, this.tileLength), i5, i6, this.width, this.height);
            i = i5 + this.tileWidth;
            if (i >= this.width) {
                i3 = i6 + this.tileLength;
                if (i3 >= this.height) {
                    return;
                } else {
                    i = 0;
                }
            } else {
                i3 = i6;
            }
            i2++;
            m = i4;
        }
    }
}
