package org.apache.commons.imaging.formats.tiff.write;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.PackBits;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.common.ZlibDeflate;
import org.apache.commons.imaging.common.itu_t4.T4AndT6Compression;
import org.apache.commons.imaging.common.mylzw.MyLzwCompressor;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class TiffImageWriterBase {
    protected final ByteOrder byteOrder;

    public TiffImageWriterBase() {
        this.byteOrder = TiffConstants.DEFAULT_TIFF_BYTE_ORDER;
    }

    private void combineUserExifIntoFinalExif(TiffOutputSet tiffOutputSet, TiffOutputSet tiffOutputSet2) {
        List<TiffOutputDirectory> directories = tiffOutputSet2.getDirectories();
        Collections.sort(directories, TiffOutputDirectory.COMPARATOR);
        for (TiffOutputDirectory tiffOutputDirectory : tiffOutputSet.getDirectories()) {
            int binarySearch = Collections.binarySearch(directories, tiffOutputDirectory, TiffOutputDirectory.COMPARATOR);
            if (binarySearch < 0) {
                tiffOutputSet2.addDirectory(tiffOutputDirectory);
            } else {
                TiffOutputDirectory tiffOutputDirectory2 = directories.get(binarySearch);
                for (TiffOutputField tiffOutputField : tiffOutputDirectory.getFields()) {
                    if (tiffOutputDirectory2.findField(tiffOutputField.tagInfo) == null) {
                        tiffOutputDirectory2.add(tiffOutputField);
                    }
                }
            }
        }
    }

    private byte[][] getStrips(BufferedImage bufferedImage, int i, int i2, int i3) {
        char c;
        int i4 = i3;
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        boolean z = true;
        int m = Fragment$5$$ExternalSyntheticOutline0.m(height, i4, 1, i4);
        byte[][] bArr = new byte[m][];
        int i5 = height;
        int i6 = 0;
        while (i6 < m) {
            int min = Math.min(i4, i5);
            i5 -= min;
            char c2 = '\b';
            byte[] bArr2 = new byte[((((i2 * i) * width) + 7) / 8) * min];
            int i7 = i6 * i4;
            int i8 = i7 + i4;
            int i9 = 0;
            while (i7 < height && i7 < i8) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < width) {
                    int rgb = bufferedImage.getRGB(i10, i7);
                    int i13 = (rgb >> 16) & 255;
                    int i14 = (rgb >> 8) & 255;
                    int i15 = rgb & 255;
                    int i16 = width;
                    if (i2 == 1) {
                        int i17 = (((i13 + i14) + i15) / 3 > 127 ? 0 : 1) | (i12 << 1);
                        int i18 = i11 + 1;
                        if (i18 == 8) {
                            bArr2[i9] = (byte) i17;
                            i9++;
                            i11 = 0;
                            i12 = 0;
                        } else {
                            i12 = i17;
                            i11 = i18;
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                        bArr2[i9] = (byte) i13;
                        int i19 = i9 + 2;
                        bArr2[i9 + 1] = (byte) i14;
                        i9 += 3;
                        bArr2[i19] = (byte) i15;
                    }
                    i10++;
                    z = true;
                    c2 = c;
                    width = i16;
                }
                int i20 = width;
                boolean z2 = z;
                char c3 = c2;
                if (i11 > 0) {
                    bArr2[i9] = (byte) (i12 << (8 - i11));
                    i9++;
                }
                i7++;
                z = z2;
                c2 = c3;
                width = i20;
            }
            bArr[i6] = bArr2;
            i6++;
            i4 = i3;
            z = z;
            width = width;
        }
        return bArr;
    }

    public static int imageDataPaddingLength(int i) {
        return (4 - (i % 4)) % 4;
    }

    public TiffOutputSummary validateDirectories(TiffOutputSet tiffOutputSet) {
        List<TiffOutputDirectory> directories = tiffOutputSet.getDirectories();
        if (directories.isEmpty()) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("No directories.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        TiffOutputDirectory tiffOutputDirectory = null;
        TiffOutputDirectory tiffOutputDirectory2 = null;
        TiffOutputDirectory tiffOutputDirectory3 = null;
        TiffOutputField tiffOutputField = null;
        TiffOutputField tiffOutputField2 = null;
        TiffOutputField tiffOutputField3 = null;
        for (TiffOutputDirectory tiffOutputDirectory4 : directories) {
            int i = tiffOutputDirectory4.f1558type;
            hashMap.put(Integer.valueOf(i), tiffOutputDirectory4);
            if (i >= 0) {
                if (arrayList.contains(Integer.valueOf(i))) {
                    throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "More than one directory with index: ", "."));
                }
                arrayList.add(Integer.valueOf(i));
            } else if (i == -4) {
                if (tiffOutputDirectory != null) {
                    ColorGroup$$ExternalSyntheticBUOutline0.m("More than one Interoperability directory.");
                    return null;
                }
                tiffOutputDirectory = tiffOutputDirectory4;
            } else if (i != -3) {
                if (i != -2) {
                    throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown directory: "));
                }
                if (tiffOutputDirectory3 != null) {
                    ColorGroup$$ExternalSyntheticBUOutline0.m("More than one EXIF directory.");
                    return null;
                }
                tiffOutputDirectory3 = tiffOutputDirectory4;
            } else {
                if (tiffOutputDirectory2 != null) {
                    ColorGroup$$ExternalSyntheticBUOutline0.m("More than one GPS directory.");
                    return null;
                }
                tiffOutputDirectory2 = tiffOutputDirectory4;
            }
            HashSet hashSet = new HashSet();
            for (TiffOutputField tiffOutputField4 : tiffOutputDirectory4.getFields()) {
                if (hashSet.contains(Integer.valueOf(tiffOutputField4.tag))) {
                    throw new ImageWriteException("Tag (" + tiffOutputField4.tagInfo.getDescription() + ") appears twice in directory.");
                }
                hashSet.add(Integer.valueOf(tiffOutputField4.tag));
                int i2 = tiffOutputField4.tag;
                if (i2 == ExifTagConstants.EXIF_TAG_EXIF_OFFSET.tag) {
                    if (tiffOutputField2 != null) {
                        ColorGroup$$ExternalSyntheticBUOutline0.m("More than one Exif directory offset field.");
                        return null;
                    }
                    tiffOutputField2 = tiffOutputField4;
                } else if (i2 == ExifTagConstants.EXIF_TAG_INTEROP_OFFSET.tag) {
                    if (tiffOutputField != null) {
                        ColorGroup$$ExternalSyntheticBUOutline0.m("More than one Interoperability directory offset field.");
                        return null;
                    }
                    tiffOutputField = tiffOutputField4;
                } else if (i2 != ExifTagConstants.EXIF_TAG_GPSINFO.tag) {
                    continue;
                } else {
                    if (tiffOutputField3 != null) {
                        ColorGroup$$ExternalSyntheticBUOutline0.m("More than one GPS directory offset field.");
                        return null;
                    }
                    tiffOutputField3 = tiffOutputField4;
                }
            }
        }
        if (arrayList.isEmpty()) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Missing root directory.");
            return null;
        }
        Collections.sort(arrayList);
        int i3 = 0;
        TiffOutputDirectory tiffOutputDirectory5 = null;
        while (i3 < arrayList.size()) {
            Integer num = (Integer) arrayList.get(i3);
            if (num.intValue() != i3) {
                throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Missing directory: ", "."));
            }
            TiffOutputDirectory tiffOutputDirectory6 = (TiffOutputDirectory) hashMap.get(num);
            if (tiffOutputDirectory5 != null) {
                tiffOutputDirectory5.setNextDirectory(tiffOutputDirectory6);
            }
            i3++;
            tiffOutputDirectory5 = tiffOutputDirectory6;
        }
        TiffOutputDirectory tiffOutputDirectory7 = (TiffOutputDirectory) hashMap.get(0);
        TiffOutputSummary tiffOutputSummary = new TiffOutputSummary(this.byteOrder, tiffOutputDirectory7, hashMap);
        if (tiffOutputDirectory == null && tiffOutputField != null) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Output set has Interoperability Directory Offset field, but no Interoperability Directory");
            return null;
        }
        if (tiffOutputDirectory != null) {
            if (tiffOutputDirectory3 == null) {
                tiffOutputDirectory3 = tiffOutputSet.addExifDirectory();
            }
            if (tiffOutputField == null) {
                tiffOutputField = TiffOutputField.createOffsetField(ExifTagConstants.EXIF_TAG_INTEROP_OFFSET, this.byteOrder);
                tiffOutputDirectory3.add(tiffOutputField);
            }
            tiffOutputSummary.add(tiffOutputDirectory, tiffOutputField);
        }
        if (tiffOutputDirectory3 == null && tiffOutputField2 != null) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Output set has Exif Directory Offset field, but no Exif Directory");
            return null;
        }
        if (tiffOutputDirectory3 != null) {
            if (tiffOutputField2 == null) {
                tiffOutputField2 = TiffOutputField.createOffsetField(ExifTagConstants.EXIF_TAG_EXIF_OFFSET, this.byteOrder);
                tiffOutputDirectory7.add(tiffOutputField2);
            }
            tiffOutputSummary.add(tiffOutputDirectory3, tiffOutputField2);
        }
        if (tiffOutputDirectory2 == null && tiffOutputField3 != null) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Output set has GPS Directory Offset field, but no GPS Directory");
            return null;
        }
        if (tiffOutputDirectory2 != null) {
            if (tiffOutputField3 == null) {
                tiffOutputField3 = TiffOutputField.createOffsetField(ExifTagConstants.EXIF_TAG_GPSINFO, this.byteOrder);
                tiffOutputDirectory7.add(tiffOutputField3);
            }
            tiffOutputSummary.add(tiffOutputDirectory2, tiffOutputField3);
        }
        return tiffOutputSummary;
    }

    public abstract void write(OutputStream outputStream, TiffOutputSet tiffOutputSet);

    /* JADX WARN: Removed duplicated region for block: B:51:0x0207 A[LOOP:1: B:49:0x0204->B:51:0x0207, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        PixelDensity pixelDensity;
        short s;
        int intValue;
        int i6;
        PixelDensity pixelDensity2;
        int i7;
        HashMap hashMap = new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        String str = null;
        TiffOutputSet tiffOutputSet = hashMap.containsKey(ImagingConstants.PARAM_KEY_EXIF) ? (TiffOutputSet) hashMap.remove(ImagingConstants.PARAM_KEY_EXIF) : null;
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
            str = (String) hashMap.get(ImagingConstants.PARAM_KEY_XMP_XML);
            hashMap.remove(ImagingConstants.PARAM_KEY_XMP_XML);
        }
        PixelDensity pixelDensity3 = (PixelDensity) hashMap.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (pixelDensity3 == null) {
            pixelDensity3 = PixelDensity.createFromPixelsPerInch(72.0d, 72.0d);
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int i8 = 64000;
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_COMPRESSION)) {
            Object obj = hashMap.get(ImagingConstants.PARAM_KEY_COMPRESSION);
            if (obj == null) {
                i = 5;
            } else {
                if (!(obj instanceof Number)) {
                    throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Invalid compression parameter, must be numeric: ", obj));
                }
                i = ((Number) obj).intValue();
            }
            hashMap.remove(ImagingConstants.PARAM_KEY_COMPRESSION);
            if (hashMap.containsKey(TiffConstants.PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE)) {
                Object obj2 = hashMap.get(TiffConstants.PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE);
                if (!(obj2 instanceof Number)) {
                    throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Invalid compression block-size parameter: ", obj));
                }
                int intValue2 = ((Number) obj2).intValue();
                if (intValue2 < 8000) {
                    throw new ImageWriteException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue2, "Block size parameter ", " is less than 8000 minimum"));
                }
                i8 = intValue2 * 8;
                hashMap.remove(TiffConstants.PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE);
            }
        } else {
            i = 5;
        }
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap.remove(TiffConstants.PARAM_KEY_T4_OPTIONS);
        hashMap.remove(TiffConstants.PARAM_KEY_T6_OPTIONS);
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        if (i == 2 || i == 3 || i == 4) {
            i2 = 4;
            i3 = 1;
            i4 = 1;
            i5 = 0;
        } else {
            i4 = 8;
            i2 = 4;
            i3 = 3;
            i5 = 2;
        }
        int max = Math.max(1, i8 / ((width * i4) * i3));
        byte[][] strips = getStrips(bufferedImage, i3, i4, max);
        if (i != 2) {
            if (i == 3) {
                Integer num = (Integer) hashMap2.get(TiffConstants.PARAM_KEY_T4_OPTIONS);
                int intValue3 = num != null ? num.intValue() : 0;
                i6 = intValue3 & 7;
                boolean z = (intValue3 & 1) != 0;
                if ((intValue3 & 2) != 0) {
                    ColorGroup$$ExternalSyntheticBUOutline0.m("T.4 compression with the uncompressed mode extension is not yet supported");
                    return;
                }
                boolean z2 = (intValue3 & 4) != 0;
                s = 2;
                int i9 = 0;
                while (i9 < strips.length) {
                    if (z) {
                        byte[] bArr = strips[i9];
                        pixelDensity2 = pixelDensity3;
                        strips[i9] = T4AndT6Compression.compressT4_2D(bArr, width, bArr.length / ((width + 7) / 8), z2, max);
                    } else {
                        pixelDensity2 = pixelDensity3;
                        byte[] bArr2 = strips[i9];
                        strips[i9] = T4AndT6Compression.compressT4_1D(bArr2, width, bArr2.length / ((width + 7) / 8), z2);
                    }
                    i9++;
                    pixelDensity3 = pixelDensity2;
                }
                pixelDensity = pixelDensity3;
                intValue = 0;
            } else {
                pixelDensity = pixelDensity3;
                int i10 = i2;
                s = 2;
                if (i == i10) {
                    Integer num2 = (Integer) hashMap2.get(TiffConstants.PARAM_KEY_T6_OPTIONS);
                    intValue = i10 & (num2 != null ? num2.intValue() : 0);
                    for (int i11 = 0; i11 < strips.length; i11++) {
                        byte[] bArr3 = strips[i11];
                        strips[i11] = T4AndT6Compression.compressT6(bArr3, width, bArr3.length / ((width + 7) / 8));
                    }
                    i6 = 0;
                } else if (i == 32773) {
                    for (int i12 = 0; i12 < strips.length; i12++) {
                        strips[i12] = new PackBits().compress(strips[i12]);
                    }
                } else if (i == 5) {
                    for (int i13 = 0; i13 < strips.length; i13++) {
                        strips[i13] = new MyLzwCompressor(8, ByteOrder.BIG_ENDIAN, true).compress(strips[i13]);
                    }
                } else if (i == 8) {
                    for (int i14 = 0; i14 < strips.length; i14++) {
                        strips[i14] = ZlibDeflate.compress(strips[i14]);
                    }
                } else if (i != 1) {
                    ColorGroup$$ExternalSyntheticBUOutline0.m("Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits, Zlib Deflate and uncompressed supported).");
                    return;
                }
            }
            TiffElement.DataElement[] dataElementArr = new TiffElement.DataElement[strips.length];
            i7 = 0;
            while (i7 < strips.length) {
                byte[] bArr4 = strips[i7];
                TiffElement.DataElement[] dataElementArr2 = dataElementArr;
                dataElementArr2[i7] = new TiffImageData.Data(0L, bArr4.length, bArr4);
                i7++;
                dataElementArr = dataElementArr2;
                width = width;
                height = height;
            }
            int i15 = width;
            int i16 = height;
            TiffElement.DataElement[] dataElementArr3 = dataElementArr;
            TiffOutputSet tiffOutputSet2 = new TiffOutputSet(this.byteOrder);
            TiffOutputDirectory addRootDirectory = tiffOutputSet2.addRootDirectory();
            addRootDirectory.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, i15);
            addRootDirectory.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, i16);
            addRootDirectory.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) i5);
            addRootDirectory.add(TiffTagConstants.TIFF_TAG_COMPRESSION, (short) i);
            addRootDirectory.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) i3);
            if (i3 != 3) {
                TagInfoShorts tagInfoShorts = TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE;
                short s2 = (short) i4;
                short[] sArr = new short[3];
                sArr[0] = s2;
                sArr[1] = s2;
                sArr[s] = s2;
                addRootDirectory.add(tagInfoShorts, sArr);
            } else if (i3 == 1) {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, (short) i4);
            }
            addRootDirectory.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, max);
            if (!pixelDensity.isUnitless()) {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT, (short) 0);
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_XRESOLUTION, RationalNumber.valueOf(pixelDensity.getRawHorizontalDensity()));
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_YRESOLUTION, RationalNumber.valueOf(pixelDensity.getRawVerticalDensity()));
            } else if (pixelDensity.isInInches()) {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT, s);
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_XRESOLUTION, RationalNumber.valueOf(pixelDensity.horizontalDensityInches()));
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_YRESOLUTION, RationalNumber.valueOf(pixelDensity.verticalDensityInches()));
            } else {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT, (short) 1);
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_XRESOLUTION, RationalNumber.valueOf(pixelDensity.horizontalDensityCentimetres()));
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_YRESOLUTION, RationalNumber.valueOf(pixelDensity.verticalDensityCentimetres()));
            }
            if (i6 != 0) {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_T4_OPTIONS, i6);
            }
            if (intValue != 0) {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_T6_OPTIONS, intValue);
            }
            if (str != null) {
                addRootDirectory.add(TiffTagConstants.TIFF_TAG_XMP, str.getBytes(StandardCharsets.UTF_8));
            }
            addRootDirectory.setTiffImageData(new TiffImageData.Strips(dataElementArr3, max));
            if (tiffOutputSet != null) {
                combineUserExifIntoFinalExif(tiffOutputSet, tiffOutputSet2);
            }
            write(outputStream, tiffOutputSet2);
        }
        for (int i17 = 0; i17 < strips.length; i17++) {
            byte[] bArr5 = strips[i17];
            strips[i17] = T4AndT6Compression.compressModifiedHuffman(bArr5, width, bArr5.length / ((width + 7) / 8));
        }
        pixelDensity = pixelDensity3;
        s = 2;
        intValue = 0;
        i6 = 0;
        TiffElement.DataElement[] dataElementArr4 = new TiffElement.DataElement[strips.length];
        i7 = 0;
        while (i7 < strips.length) {
        }
        int i152 = width;
        int i162 = height;
        TiffElement.DataElement[] dataElementArr32 = dataElementArr4;
        TiffOutputSet tiffOutputSet22 = new TiffOutputSet(this.byteOrder);
        TiffOutputDirectory addRootDirectory2 = tiffOutputSet22.addRootDirectory();
        addRootDirectory2.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, i152);
        addRootDirectory2.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, i162);
        addRootDirectory2.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) i5);
        addRootDirectory2.add(TiffTagConstants.TIFF_TAG_COMPRESSION, (short) i);
        addRootDirectory2.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) i3);
        if (i3 != 3) {
        }
        addRootDirectory2.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, max);
        if (!pixelDensity.isUnitless()) {
        }
        if (i6 != 0) {
        }
        if (intValue != 0) {
        }
        if (str != null) {
        }
        addRootDirectory2.setTiffImageData(new TiffImageData.Strips(dataElementArr32, max));
        if (tiffOutputSet != null) {
        }
        write(outputStream, tiffOutputSet22);
    }

    public void writeImageFileHeader(BinaryOutputStream binaryOutputStream, long j) {
        if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
            binaryOutputStream.write(73);
            binaryOutputStream.write(73);
        } else {
            binaryOutputStream.write(77);
            binaryOutputStream.write(77);
        }
        binaryOutputStream.write2Bytes(42);
        binaryOutputStream.write4Bytes((int) j);
    }

    public TiffImageWriterBase(ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public void writeImageFileHeader(BinaryOutputStream binaryOutputStream) {
        writeImageFileHeader(binaryOutputStream, 8L);
    }
}
