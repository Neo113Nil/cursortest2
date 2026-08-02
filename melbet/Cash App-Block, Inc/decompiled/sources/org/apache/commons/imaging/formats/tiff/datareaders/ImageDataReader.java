package org.apache.commons.imaging.formats.tiff.datareaders;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.ZlibDeflate;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.common.mylzw.MyLzwDecompressor;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffRasterData;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

/* loaded from: classes9.dex */
public abstract class ImageDataReader {
    private final int[] bitsPerSample;
    protected final int bitsPerSampleLength;
    protected final TiffDirectory directory;
    protected final int height;
    private final int[] last;
    protected final PhotometricInterpreter photometricInterpreter;
    protected final int predictor;
    protected final int sampleFormat;
    protected final int samplesPerPixel;
    protected final int width;

    public ImageDataReader(TiffDirectory tiffDirectory, PhotometricInterpreter photometricInterpreter, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        this.directory = tiffDirectory;
        this.photometricInterpreter = photometricInterpreter;
        this.bitsPerSample = iArr;
        this.bitsPerSampleLength = iArr.length;
        this.samplesPerPixel = i2;
        this.sampleFormat = i3;
        this.predictor = i;
        this.width = i4;
        this.height = i5;
        this.last = new int[i2];
    }

    public int[] applyPredictor(int[] iArr) {
        if (this.predictor == 2) {
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                int[] iArr2 = this.last;
                int i3 = (i2 + iArr2[i]) & 255;
                iArr[i] = i3;
                iArr2[i] = i3;
            }
        }
        return iArr;
    }

    public byte[] decompress(byte[] bArr, int i, int i2, int i3, int i4) {
        byte[] bArr2;
        TiffField findField = this.directory.findField(TiffTagConstants.TIFF_TAG_FILL_ORDER);
        int intValue = findField != null ? findField.getIntValue() : 1;
        if (intValue == 1) {
            bArr2 = bArr;
        } else {
            if (intValue != 2) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "TIFF FillOrder=", " is invalid"));
            }
            bArr2 = new byte[bArr.length];
            for (int i5 = 0; i5 < bArr.length; i5++) {
                bArr2[i5] = (byte) (Integer.reverse(bArr[i5] & 255) >>> 24);
            }
        }
        if (i == 1) {
            return bArr2;
        }
        if (i == 2) {
            return T4AndT6Compression.decompressModifiedHuffman(bArr2, i3, i4);
        }
        if (i == 3) {
            TiffField findField2 = this.directory.findField(TiffTagConstants.TIFF_TAG_T4_OPTIONS);
            int intValue2 = findField2 != null ? findField2.getIntValue() : 0;
            boolean z = (intValue2 & 1) != 0;
            if ((intValue2 & 2) == 0) {
                boolean z2 = (intValue2 & 4) != 0;
                return z ? T4AndT6Compression.decompressT4_2D(bArr2, i3, i4, z2) : T4AndT6Compression.decompressT4_1D(bArr2, i3, i4, z2);
            }
            f$$ExternalSyntheticLambda0.m("T.4 compression with the uncompressed mode extension is not yet supported");
            return null;
        }
        if (i == 4) {
            TiffField findField3 = this.directory.findField(TiffTagConstants.TIFF_TAG_T6_OPTIONS);
            if (((findField3 != null ? findField3.getIntValue() : 0) & 2) == 0) {
                return T4AndT6Compression.decompressT6(bArr2, i3, i4);
            }
            f$$ExternalSyntheticLambda0.m("T.6 compression with the uncompressed mode extension is not yet supported");
            return null;
        }
        if (i == 5) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
            MyLzwDecompressor myLzwDecompressor = new MyLzwDecompressor(8, ByteOrder.BIG_ENDIAN);
            myLzwDecompressor.setTiffLZWMode();
            return myLzwDecompressor.decompress(byteArrayInputStream, i2);
        }
        if (i != 8) {
            if (i == 32773) {
                return new PackBits().decompress(bArr2, i2);
            }
            if (i != 32946) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Tiff: unknown/unsupported compression: "));
            }
        }
        return ZlibDeflate.decompress(bArr, i2);
    }

    public void getSamplesAsBytes(BitInputStream bitInputStream, int[] iArr) {
        int i = 0;
        while (true) {
            int[] iArr2 = this.bitsPerSample;
            if (i >= iArr2.length) {
                return;
            }
            int i2 = iArr2[i];
            int readBits = bitInputStream.readBits(i2);
            if (i2 < 8) {
                int i3 = readBits & 1;
                int i4 = 8 - i2;
                readBits <<= i4;
                if (i3 > 0) {
                    readBits = ((1 << i4) - 1) | readBits;
                }
            } else if (i2 > 8) {
                readBits >>= i2 - 8;
            }
            iArr[i] = readBits;
            i++;
        }
    }

    public boolean isHomogenous(int i) {
        for (int i2 : this.bitsPerSample) {
            if (i2 != i) {
                return false;
            }
        }
        return true;
    }

    public abstract BufferedImage readImageData(Rectangle rectangle);

    public abstract void readImageData(ImageBuilder imageBuilder);

    public abstract TiffRasterData readRasterData(Rectangle rectangle);

    public void resetPredictor() {
        Arrays.fill(this.last, 0);
    }

    public void transferBlockToRaster(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6, int i7, int i8, float[] fArr) {
        int i9 = i - i5;
        int i10 = i2 - i6;
        int i11 = i9 + i3;
        int i12 = i10 + i4;
        if (i9 < 0) {
            i9 = 0;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > i7) {
            i11 = i7;
        }
        if (i12 > i8) {
            i12 = i8;
        }
        int i13 = (i9 + i5) - i;
        int i14 = (i10 + i6) - i2;
        if (i13 < 0) {
            i9 -= i13;
            i13 = 0;
        }
        if (i14 < 0) {
            i10 -= i14;
            i14 = 0;
        }
        int i15 = i11 - i9;
        int i16 = i12 - i10;
        if (i15 <= 0 || i16 <= 0) {
            return;
        }
        if (i15 > i3) {
            i15 = i3;
        }
        if (i16 > i4) {
            i16 = i4;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = ((i10 + i17) * i7) + i9;
            int i19 = ((i14 + i17) * i3) + i13;
            for (int i20 = 0; i20 < i15; i20++) {
                fArr[i18 + i20] = Float.intBitsToFloat(iArr[i19 + i20]);
            }
        }
    }

    public int[] unpackFloatingPointSamples(int i, int i2, int i3, byte[] bArr, int i4, int i5, ByteOrder byteOrder) {
        byte[] bArr2 = bArr;
        int i6 = (i5 / 8) * i3 * i2;
        int i7 = bArr2.length < i6 ? i6 / i3 : i2;
        int[] iArr = new int[i3 * i2];
        char c = ' ';
        if (i4 == 3) {
            if (i5 != 32) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "Imaging does not yet support floating-point data with predictor type 3 for ", " bits per sample"));
            }
            int i8 = i3 * 4;
            int i9 = 0;
            while (i9 < i7) {
                int i10 = i9 * i8;
                int i11 = i10 + i3;
                int i12 = i11 + i3;
                int i13 = i12 + i3;
                for (int i14 = 1; i14 < i8; i14++) {
                    int i15 = i10 + i14;
                    bArr2[i15] = (byte) (bArr2[i15] + bArr2[i15 - 1]);
                }
                int i16 = i9 * i3;
                int i17 = 0;
                while (i17 < i) {
                    iArr[i16] = (bArr[i13 + i17] & 255) | ((bArr2[i10 + i17] & 255) << 24) | ((bArr2[i11 + i17] & 255) << 16) | ((bArr2[i12 + i17] & 255) << 8);
                    i17++;
                    bArr2 = bArr;
                    i16++;
                }
                i9++;
                bArr2 = bArr;
            }
        } else if (i5 == 64) {
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < i7) {
                int i21 = 0;
                while (i21 < i3) {
                    long j = bArr[i19] & 255;
                    long j2 = bArr[i19 + 1] & 255;
                    long j3 = bArr[i19 + 2] & 255;
                    char c2 = c;
                    long j4 = bArr[i19 + 3] & 255;
                    int i22 = i18;
                    int i23 = i19;
                    long j5 = bArr[i19 + 4] & 255;
                    long j6 = bArr[i19 + 5] & 255;
                    int i24 = i23 + 7;
                    long j7 = bArr[i23 + 6] & 255;
                    int i25 = i23 + 8;
                    long j8 = bArr[i24] & 255;
                    iArr[i20] = Float.floatToRawIntBits((float) Double.longBitsToDouble(byteOrder == ByteOrder.LITTLE_ENDIAN ? (j8 << 56) | (j7 << 48) | (j6 << 40) | (j5 << c2) | (j4 << 24) | (j3 << 16) | (j2 << 8) | j : (j3 << 40) | (j << 56) | (j2 << 48) | (j4 << c2) | (j5 << 24) | (j6 << 16) | (j7 << 8) | j8));
                    i21++;
                    i18 = i22;
                    i20++;
                    i19 = i25;
                    c = c2;
                }
                i18++;
            }
        } else {
            if (i5 != 32) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "Imaging does not support floating-point samples with ", " bits per sample"));
            }
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < i7; i28++) {
                int i29 = 0;
                while (i29 < i3) {
                    int i30 = bArr[i26] & 255;
                    int i31 = bArr[i26 + 1] & 255;
                    int i32 = i26 + 3;
                    int i33 = bArr[i26 + 2] & 255;
                    i26 += 4;
                    int i34 = bArr[i32] & 255;
                    iArr[i27] = byteOrder == ByteOrder.LITTLE_ENDIAN ? (i31 << 8) | (i33 << 16) | (i34 << 24) | i30 : (i31 << 16) | (i30 << 24) | (i33 << 8) | i34;
                    i29++;
                    i27++;
                }
            }
        }
        return iArr;
    }
}
