package org.apache.commons.imaging.formats.png;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.formats.png.PngText;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.palette.Palette;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
class PngWriter {

    public static class ImageHeader {
        public final byte bitDepth;
        public final byte compressionMethod;
        public final byte filterMethod;
        public final int height;
        public final InterlaceMethod interlaceMethod;
        public final PngColorType pngColorType;
        public final int width;

        public ImageHeader(int i, int i2, byte b, PngColorType pngColorType, byte b2, byte b3, InterlaceMethod interlaceMethod) {
            this.width = i;
            this.height = i2;
            this.bitDepth = b;
            this.pngColorType = pngColorType;
            this.compressionMethod = b2;
            this.filterMethod = b3;
            this.interlaceMethod = interlaceMethod;
        }
    }

    private byte[] deflate(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private byte getBitDepth(PngColorType pngColorType, Map<String, Object> map) {
        Object obj = map.get(PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        byte byteValue = obj instanceof Number ? ((Number) obj).byteValue() : (byte) 8;
        if (pngColorType.isBitDepthAllowed(byteValue)) {
            return byteValue;
        }
        return (byte) 8;
    }

    private boolean isValidISO_8859_1(String str) {
        Charset charset = StandardCharsets.ISO_8859_1;
        return str.equals(new String(str.getBytes(charset), charset));
    }

    private void writeChunk(OutputStream outputStream, ChunkType chunkType, byte[] bArr) {
        writeInt(outputStream, bArr == null ? 0 : bArr.length);
        outputStream.write(chunkType.f1554array);
        if (bArr != null) {
            outputStream.write(bArr);
        }
        PngCrc pngCrc = new PngCrc();
        byte[] bArr2 = chunkType.f1554array;
        long start_partial_crc = pngCrc.start_partial_crc(bArr2, bArr2.length);
        if (bArr != null) {
            start_partial_crc = pngCrc.continue_partial_crc(start_partial_crc, bArr, bArr.length);
        }
        writeInt(outputStream, (int) pngCrc.finish_partial_crc(start_partial_crc));
    }

    private void writeChunkIDAT(OutputStream outputStream, byte[] bArr) {
        writeChunk(outputStream, ChunkType.IDAT, bArr);
    }

    private void writeChunkIEND(OutputStream outputStream) {
        writeChunk(outputStream, ChunkType.IEND, null);
    }

    private void writeChunkIHDR(OutputStream outputStream, ImageHeader imageHeader) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeInt(byteArrayOutputStream, imageHeader.width);
        writeInt(byteArrayOutputStream, imageHeader.height);
        byteArrayOutputStream.write(imageHeader.bitDepth & 255);
        byteArrayOutputStream.write(imageHeader.pngColorType.getValue() & 255);
        byteArrayOutputStream.write(imageHeader.compressionMethod & 255);
        byteArrayOutputStream.write(imageHeader.filterMethod & 255);
        byteArrayOutputStream.write(imageHeader.interlaceMethod.ordinal() & 255);
        writeChunk(outputStream, ChunkType.IHDR, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkPHYS(OutputStream outputStream, int i, int i2, byte b) {
        writeChunk(outputStream, ChunkType.pHYs, new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255), b});
    }

    private void writeChunkPLTE(OutputStream outputStream, Palette palette) {
        int length = palette.length();
        byte[] bArr = new byte[length * 3];
        for (int i = 0; i < length; i++) {
            int entry = palette.getEntry(i);
            int i2 = i * 3;
            bArr[i2] = (byte) ((entry >> 16) & 255);
            bArr[i2 + 1] = (byte) ((entry >> 8) & 255);
            bArr[i2 + 2] = (byte) (entry & 255);
        }
        writeChunk(outputStream, ChunkType.PLTE, bArr);
    }

    private void writeChunkSCAL(OutputStream outputStream, double d, double d2, byte b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b);
        String valueOf = String.valueOf(d);
        Charset charset = StandardCharsets.ISO_8859_1;
        byteArrayOutputStream.write(valueOf.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(String.valueOf(d2).getBytes(charset));
        writeChunk(outputStream, ChunkType.sCAL, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkTRNS(OutputStream outputStream, Palette palette) {
        int length = palette.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((palette.getEntry(i) >> 24) & 255);
        }
        writeChunk(outputStream, ChunkType.tRNS, bArr);
    }

    private void writeChunkXmpiTXt(OutputStream outputStream, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(PngConstants.XMP_KEYWORD.getBytes(StandardCharsets.ISO_8859_1));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        Charset charset = StandardCharsets.UTF_8;
        byteArrayOutputStream.write(PngConstants.XMP_KEYWORD.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(deflate(str.getBytes(charset)));
        writeChunk(outputStream, ChunkType.iTXt, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkiTXt(OutputStream outputStream, PngText.Itxt itxt) {
        if (!isValidISO_8859_1(itxt.keyword)) {
            throw new ImageWriteException("Png tEXt chunk keyword is not ISO-8859-1: " + itxt.keyword);
        }
        if (!isValidISO_8859_1(itxt.languageTag)) {
            throw new ImageWriteException("Png tEXt chunk language tag is not ISO-8859-1: " + itxt.languageTag);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = itxt.keyword;
        Charset charset = StandardCharsets.ISO_8859_1;
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(itxt.languageTag.getBytes(charset));
        byteArrayOutputStream.write(0);
        String str2 = itxt.translatedKeyword;
        Charset charset2 = StandardCharsets.UTF_8;
        byteArrayOutputStream.write(str2.getBytes(charset2));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(deflate(itxt.text.getBytes(charset2)));
        writeChunk(outputStream, ChunkType.iTXt, byteArrayOutputStream.toByteArray());
    }

    private void writeChunktEXt(OutputStream outputStream, PngText.Text text) {
        if (!isValidISO_8859_1(text.keyword)) {
            throw new ImageWriteException("Png tEXt chunk keyword is not ISO-8859-1: " + text.keyword);
        }
        if (!isValidISO_8859_1(text.text)) {
            throw new ImageWriteException("Png tEXt chunk text is not ISO-8859-1: " + text.text);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = text.keyword;
        Charset charset = StandardCharsets.ISO_8859_1;
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(text.text.getBytes(charset));
        writeChunk(outputStream, ChunkType.tEXt, byteArrayOutputStream.toByteArray());
    }

    private void writeChunkzTXt(OutputStream outputStream, PngText.Ztxt ztxt) {
        if (!isValidISO_8859_1(ztxt.keyword)) {
            throw new ImageWriteException("Png zTXt chunk keyword is not ISO-8859-1: " + ztxt.keyword);
        }
        if (!isValidISO_8859_1(ztxt.text)) {
            throw new ImageWriteException("Png zTXt chunk text is not ISO-8859-1: " + ztxt.text);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = ztxt.keyword;
        Charset charset = StandardCharsets.ISO_8859_1;
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(deflate(ztxt.text.getBytes(charset)));
        writeChunk(outputStream, ChunkType.zTXt, byteArrayOutputStream.toByteArray());
    }

    private void writeInt(OutputStream outputStream, int i) {
        outputStream.write((i >> 24) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write(i & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        PngColorType colorType;
        boolean z;
        PngColorType pngColorType;
        PngColorType pngColorType2;
        Palette palette;
        Object obj;
        byte b;
        Object obj2;
        Palette palette2;
        byte b2;
        byte b3;
        int i;
        byte[] byteArray;
        int i2;
        byte[] byteArray2;
        PngWriter pngWriter = this;
        OutputStream outputStream2 = outputStream;
        HashMap hashMap = new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        HashMap hashMap2 = new HashMap(hashMap);
        if (hashMap.containsKey(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR)) {
            hashMap.remove(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR);
        }
        if (hashMap.containsKey(PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR)) {
            hashMap.remove(PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR);
        }
        if (hashMap.containsKey(PngConstants.PARAM_KEY_PNG_BIT_DEPTH)) {
            hashMap.remove(PngConstants.PARAM_KEY_PNG_BIT_DEPTH);
        }
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_XMP_XML);
        }
        if (hashMap.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
            hashMap.remove(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS);
        }
        int intValue = hashMap.containsKey(PngConstants.PARAM_KEY_PNG_COMPRESSION_LEVEL) ? ((Integer) hashMap.remove(PngConstants.PARAM_KEY_PNG_COMPRESSION_LEVEL)).intValue() : -1;
        hashMap.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        hashMap.remove(PngConstants.PARAM_KEY_PHYSICAL_SCALE);
        hashMap.remove(PngConstants.PARAM_KEY_PNG_COMPRESSION_LEVEL);
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        boolean hasTransparency = new PaletteFactory().hasTransparency(bufferedImage);
        Debug.debug("hasAlpha: " + hasTransparency);
        boolean isGrayscale = new PaletteFactory().isGrayscale(bufferedImage);
        Debug.debug("isGrayscale: " + isGrayscale);
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(hashMap2.get(PngConstants.PARAM_KEY_PNG_FORCE_INDEXED_COLOR));
        boolean equals2 = bool.equals(hashMap2.get(PngConstants.PARAM_KEY_PNG_FORCE_TRUE_COLOR));
        if (equals && equals2) {
            ColorGroup$$ExternalSyntheticBUOutline0.m("Params: Cannot force both indexed and true color modes");
            return;
        }
        if (equals) {
            colorType = PngColorType.INDEXED_COLOR;
        } else {
            if (equals2) {
                colorType = hasTransparency ? PngColorType.TRUE_COLOR_WITH_ALPHA : PngColorType.TRUE_COLOR;
                z = false;
                Debug.debug("colorType: " + colorType);
                byte bitDepth = pngWriter.getBitDepth(colorType, hashMap2);
                Debug.debug("bitDepth: " + ((int) bitDepth));
                pngColorType = PngColorType.INDEXED_COLOR;
                pngColorType2 = colorType;
                Debug.debug("sampleDepth: " + ((int) (colorType != pngColorType ? (byte) 8 : bitDepth)));
                PngConstants.PNG_SIGNATURE.writeTo(outputStream2);
                pngWriter.writeChunkIHDR(outputStream2, new ImageHeader(width, height, bitDepth, pngColorType2, (byte) 0, (byte) 0, InterlaceMethod.NONE));
                if (pngColorType2 != pngColorType) {
                    PaletteFactory paletteFactory = new PaletteFactory();
                    if (hasTransparency) {
                        palette = paletteFactory.makeQuantizedRgbaPalette(bufferedImage, hasTransparency, 256);
                        pngWriter.writeChunkPLTE(outputStream2, palette);
                        pngWriter.writeChunkTRNS(outputStream2, palette);
                    } else {
                        palette = paletteFactory.makeQuantizedRgbPalette(bufferedImage, 256);
                        pngWriter.writeChunkPLTE(outputStream2, palette);
                    }
                } else {
                    palette = null;
                }
                obj = hashMap2.get(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
                if (obj instanceof PixelDensity) {
                    PixelDensity pixelDensity = (PixelDensity) obj;
                    if (!pixelDensity.isUnitless()) {
                        b = 1;
                        pngWriter.writeChunkPHYS(outputStream2, (int) Math.round(pixelDensity.horizontalDensityMetres()), (int) Math.round(pixelDensity.verticalDensityMetres()), (byte) 1);
                        obj2 = hashMap2.get(PngConstants.PARAM_KEY_PHYSICAL_SCALE);
                        if (obj2 instanceof PhysicalScale) {
                            PhysicalScale physicalScale = (PhysicalScale) obj2;
                            Palette palette3 = palette;
                            b2 = 0;
                            double horizontalUnitsPerPixel = physicalScale.getHorizontalUnitsPerPixel();
                            double verticalUnitsPerPixel = physicalScale.getVerticalUnitsPerPixel();
                            if (physicalScale.isInMeters()) {
                                palette2 = palette3;
                                b3 = b;
                            } else {
                                b3 = b;
                                b = 2;
                                palette2 = palette3;
                            }
                            pngWriter.writeChunkSCAL(outputStream2, horizontalUnitsPerPixel, verticalUnitsPerPixel, b);
                        } else {
                            palette2 = palette;
                            b2 = 0;
                            b3 = b;
                        }
                        if (hashMap2.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
                            pngWriter.writeChunkXmpiTXt(outputStream2, (String) hashMap2.get(ImagingConstants.PARAM_KEY_XMP_XML));
                        }
                        if (hashMap2.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
                            for (PngText pngText : (List) hashMap2.get(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
                                if (pngText instanceof PngText.Text) {
                                    pngWriter.writeChunktEXt(outputStream2, (PngText.Text) pngText);
                                } else if (pngText instanceof PngText.Ztxt) {
                                    pngWriter.writeChunkzTXt(outputStream2, (PngText.Ztxt) pngText);
                                } else {
                                    if (!(pngText instanceof PngText.Itxt)) {
                                        throw new ImageWriteException("Unknown text to embed in PNG: " + pngText);
                                    }
                                    pngWriter.writeChunkiTXt(outputStream2, (PngText.Itxt) pngText);
                                }
                            }
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte b4 = (pngColorType2 != PngColorType.GREYSCALE_WITH_ALPHA || pngColorType2 == PngColorType.TRUE_COLOR_WITH_ALPHA) ? b3 : b2;
                        int[] iArr = new int[width];
                        i = b2;
                        while (i < height) {
                            PngWriter pngWriter2 = pngWriter;
                            bufferedImage.getRGB(0, i, width, 1, iArr, 0, width);
                            byteArrayOutputStream.write(FilterType.NONE.ordinal());
                            for (int i3 = b2; i3 < width; i3++) {
                                int i4 = iArr[i3];
                                if (palette2 != null) {
                                    byteArrayOutputStream.write(palette2.getPaletteIndex(i4) & 255);
                                } else {
                                    int i5 = (i4 >> 24) & 255;
                                    int i6 = (i4 >> 16) & 255;
                                    int i7 = (i4 >> 8) & 255;
                                    int i8 = i4 & 255;
                                    if (z) {
                                        byteArrayOutputStream.write(((i6 + i7) + i8) / 3);
                                    } else {
                                        byteArrayOutputStream.write(i6);
                                        byteArrayOutputStream.write(i7);
                                        byteArrayOutputStream.write(i8);
                                    }
                                    if (b4 != 0) {
                                        byteArrayOutputStream.write(i5);
                                    }
                                }
                            }
                            i++;
                            pngWriter = pngWriter2;
                            outputStream2 = outputStream;
                        }
                        PngWriter pngWriter3 = pngWriter;
                        OutputStream outputStream3 = outputStream2;
                        byteArray = byteArrayOutputStream.toByteArray();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream2, new Deflater(intValue), PKIFailureInfo.transactionIdInUse);
                        i2 = b2;
                        while (i2 < byteArray.length) {
                            int length = byteArray.length;
                            int i9 = i2 + PKIFailureInfo.transactionIdInUse;
                            deflaterOutputStream.write(byteArray, i2, Math.min(length, i9) - i2);
                            deflaterOutputStream.flush();
                            byteArrayOutputStream2.flush();
                            byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream2.reset();
                            if (byteArray3.length > 0) {
                                pngWriter3.writeChunkIDAT(outputStream3, byteArray3);
                            }
                            i2 = i9;
                        }
                        deflaterOutputStream.finish();
                        byteArray2 = byteArrayOutputStream2.toByteArray();
                        if (byteArray2.length > 0) {
                            pngWriter3.writeChunkIDAT(outputStream3, byteArray2);
                        }
                        pngWriter3.writeChunkIEND(outputStream3);
                        outputStream3.close();
                    }
                    pngWriter.writeChunkPHYS(outputStream2, (int) Math.round(pixelDensity.getRawHorizontalDensity()), (int) Math.round(pixelDensity.getRawVerticalDensity()), (byte) 0);
                }
                b = 1;
                obj2 = hashMap2.get(PngConstants.PARAM_KEY_PHYSICAL_SCALE);
                if (obj2 instanceof PhysicalScale) {
                }
                if (hashMap2.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
                }
                if (hashMap2.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
                }
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                if (pngColorType2 != PngColorType.GREYSCALE_WITH_ALPHA) {
                }
                int[] iArr2 = new int[width];
                i = b2;
                while (i < height) {
                }
                PngWriter pngWriter32 = pngWriter;
                OutputStream outputStream32 = outputStream2;
                byteArray = byteArrayOutputStream3.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
                DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream22, new Deflater(intValue), PKIFailureInfo.transactionIdInUse);
                i2 = b2;
                while (i2 < byteArray.length) {
                }
                deflaterOutputStream2.finish();
                byteArray2 = byteArrayOutputStream22.toByteArray();
                if (byteArray2.length > 0) {
                }
                pngWriter32.writeChunkIEND(outputStream32);
                outputStream32.close();
            }
            colorType = PngColorType.getColorType(hasTransparency, isGrayscale);
        }
        z = isGrayscale;
        Debug.debug("colorType: " + colorType);
        byte bitDepth2 = pngWriter.getBitDepth(colorType, hashMap2);
        Debug.debug("bitDepth: " + ((int) bitDepth2));
        pngColorType = PngColorType.INDEXED_COLOR;
        if (colorType != pngColorType) {
        }
        pngColorType2 = colorType;
        Debug.debug("sampleDepth: " + ((int) (colorType != pngColorType ? (byte) 8 : bitDepth2)));
        PngConstants.PNG_SIGNATURE.writeTo(outputStream2);
        pngWriter.writeChunkIHDR(outputStream2, new ImageHeader(width, height, bitDepth2, pngColorType2, (byte) 0, (byte) 0, InterlaceMethod.NONE));
        if (pngColorType2 != pngColorType) {
        }
        obj = hashMap2.get(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (obj instanceof PixelDensity) {
        }
        b = 1;
        obj2 = hashMap2.get(PngConstants.PARAM_KEY_PHYSICAL_SCALE);
        if (obj2 instanceof PhysicalScale) {
        }
        if (hashMap2.containsKey(ImagingConstants.PARAM_KEY_XMP_XML)) {
        }
        if (hashMap2.containsKey(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS)) {
        }
        ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
        if (pngColorType2 != PngColorType.GREYSCALE_WITH_ALPHA) {
        }
        int[] iArr22 = new int[width];
        i = b2;
        while (i < height) {
        }
        PngWriter pngWriter322 = pngWriter;
        OutputStream outputStream322 = outputStream2;
        byteArray = byteArrayOutputStream32.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream222 = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream22 = new DeflaterOutputStream(byteArrayOutputStream222, new Deflater(intValue), PKIFailureInfo.transactionIdInUse);
        i2 = b2;
        while (i2 < byteArray.length) {
        }
        deflaterOutputStream22.finish();
        byteArray2 = byteArrayOutputStream222.toByteArray();
        if (byteArray2.length > 0) {
        }
        pngWriter322.writeChunkIEND(outputStream322);
        outputStream322.close();
    }
}
