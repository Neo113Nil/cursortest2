package org.apache.commons.imaging.formats.pcx;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

/* loaded from: classes9.dex */
class PcxWriter {
    private int bitDepthWanted;

    /* renamed from: encoding, reason: collision with root package name */
    private int f1553encoding;
    private PixelDensity pixelDensity;
    private int planesWanted;
    private final RleWriter rleWriter;

    public PcxWriter(Map<String, Object> map) {
        Object remove;
        Object remove2;
        Object remove3;
        Object remove4;
        this.bitDepthWanted = -1;
        this.planesWanted = -1;
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        this.f1553encoding = 1;
        if (hashMap.containsKey(PcxConstants.PARAM_KEY_PCX_COMPRESSION) && (remove4 = hashMap.remove(PcxConstants.PARAM_KEY_PCX_COMPRESSION)) != null) {
            if (!(remove4 instanceof Number)) {
                throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Invalid compression parameter: ", remove4));
            }
            if (((Number) remove4).intValue() == 0) {
                this.f1553encoding = 0;
            }
        }
        if (this.f1553encoding == 0) {
            this.rleWriter = new RleWriter(false);
        } else {
            this.rleWriter = new RleWriter(true);
        }
        if (hashMap.containsKey(PcxConstants.PARAM_KEY_PCX_BIT_DEPTH) && (remove3 = hashMap.remove(PcxConstants.PARAM_KEY_PCX_BIT_DEPTH)) != null) {
            if (!(remove3 instanceof Number)) {
                throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Invalid bit depth parameter: ", remove3));
            }
            this.bitDepthWanted = ((Number) remove3).intValue();
        }
        if (hashMap.containsKey(PcxConstants.PARAM_KEY_PCX_PLANES) && (remove2 = hashMap.remove(PcxConstants.PARAM_KEY_PCX_PLANES)) != null) {
            if (!(remove2 instanceof Number)) {
                throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Invalid planes parameter: ", remove2));
            }
            this.planesWanted = ((Number) remove2).intValue();
        }
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_PIXEL_DENSITY) && (remove = hashMap.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY)) != null) {
            if (!(remove instanceof PixelDensity)) {
                ColorGroup$$ExternalSyntheticBUOutline0.m("Invalid pixel density parameter");
                throw null;
            }
            this.pixelDensity = (PixelDensity) remove;
        }
        if (this.pixelDensity == null) {
            this.pixelDensity = PixelDensity.createFromPixelsPerInch(72.0d, 72.0d);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
    }

    private void writePixels(BufferedImage bufferedImage, int i, int i2, int i3, SimplePalette simplePalette, BinaryOutputStream binaryOutputStream) {
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i3];
        byte[][] bArr5 = {bArr, bArr2, bArr3, bArr4};
        byte b = 0;
        int i4 = 0;
        while (i4 < bufferedImage.getHeight()) {
            for (int i5 = b; i5 < i2; i5++) {
                Arrays.fill(bArr5[i5], b);
            }
            if (i == 1 && i2 == 1) {
                for (int i6 = b; i6 < bufferedImage.getWidth(); i6++) {
                    int i7 = i6 >>> 3;
                    bArr[i7] = (byte) (bArr[i7] | (((bufferedImage.getRGB(i6, i4) & 16777215) == 0 ? 0 : 1) << (7 - (i6 & 7))));
                }
            } else {
                char c = 2;
                if (i == 1 && i2 == 2) {
                    int i8 = 0;
                    while (i8 < bufferedImage.getWidth()) {
                        int paletteIndex = simplePalette.getPaletteIndex(bufferedImage.getRGB(i8, i4) & 16777215);
                        int i9 = i8 >>> 3;
                        int i10 = 7 - (i8 & 7);
                        bArr[i9] = (byte) (bArr[i9] | ((paletteIndex & 1) << i10));
                        bArr2[i9] = (byte) (bArr2[i9] | (((paletteIndex & 2) >> 1) << i10));
                        i8++;
                        c = c;
                    }
                } else if (i == 1 && i2 == 3) {
                    for (int i11 = 0; i11 < bufferedImage.getWidth(); i11++) {
                        int paletteIndex2 = simplePalette.getPaletteIndex(bufferedImage.getRGB(i11, i4) & 16777215);
                        int i12 = i11 >>> 3;
                        int i13 = 7 - (i11 & 7);
                        bArr[i12] = (byte) (bArr[i12] | ((paletteIndex2 & 1) << i13));
                        bArr2[i12] = (byte) (bArr2[i12] | (((paletteIndex2 & 2) >> 1) << i13));
                        bArr3[i12] = (byte) (bArr3[i12] | (((paletteIndex2 & 4) >> 2) << i13));
                    }
                } else if (i == 1 && i2 == 4) {
                    for (int i14 = 0; i14 < bufferedImage.getWidth(); i14++) {
                        int paletteIndex3 = simplePalette.getPaletteIndex(bufferedImage.getRGB(i14, i4) & 16777215);
                        int i15 = i14 >>> 3;
                        int i16 = 7 - (i14 & 7);
                        bArr[i15] = (byte) (bArr[i15] | ((paletteIndex3 & 1) << i16));
                        bArr2[i15] = (byte) (bArr2[i15] | (((paletteIndex3 & 2) >> 1) << i16));
                        bArr3[i15] = (byte) (bArr3[i15] | (((paletteIndex3 & 4) >> 2) << i16));
                        bArr4[i15] = (byte) (bArr4[i15] | (((paletteIndex3 & 8) >> 3) << i16));
                    }
                } else if (i == 2 && i2 == 1) {
                    for (int i17 = 0; i17 < bufferedImage.getWidth(); i17++) {
                        int i18 = i17 >>> 2;
                        bArr[i18] = (byte) ((simplePalette.getPaletteIndex(bufferedImage.getRGB(i17, i4) & 16777215) << ((3 - (i17 & 3)) * 2)) | bArr[i18]);
                    }
                } else if (i == 4 && i2 == 1) {
                    for (int i19 = 0; i19 < bufferedImage.getWidth(); i19++) {
                        int i20 = i19 >>> 1;
                        bArr[i20] = (byte) (bArr[i20] | (simplePalette.getPaletteIndex(bufferedImage.getRGB(i19, i4) & 16777215) << ((1 - (i19 & 1)) * 4)));
                    }
                } else {
                    int i21 = 8;
                    if (i == 8) {
                        if (i2 == 1) {
                            for (int i22 = 0; i22 < bufferedImage.getWidth(); i22++) {
                                bArr[i22] = (byte) simplePalette.getPaletteIndex(bufferedImage.getRGB(i22, i4) & 16777215);
                            }
                        } else {
                            i21 = 8;
                        }
                    }
                    if (i == i21 && i2 == 3) {
                        for (int i23 = 0; i23 < bufferedImage.getWidth(); i23++) {
                            int rgb = bufferedImage.getRGB(i23, i4);
                            bArr[i23] = (byte) (rgb >>> 16);
                            bArr2[i23] = (byte) (rgb >>> 8);
                            bArr3[i23] = (byte) rgb;
                        }
                    }
                }
            }
            for (int i24 = 0; i24 < i2; i24++) {
                this.rleWriter.write(binaryOutputStream, bArr5[i24]);
            }
            i4++;
            b = 0;
        }
        this.rleWriter.flush(binaryOutputStream);
    }

    private void writePixels32(BufferedImage bufferedImage, int i, BinaryOutputStream binaryOutputStream) {
        int width = bufferedImage.getWidth();
        int[] iArr = new int[width];
        byte[] bArr = new byte[i * 4];
        int i2 = 0;
        while (i2 < bufferedImage.getHeight()) {
            BufferedImage bufferedImage2 = bufferedImage;
            bufferedImage2.getRGB(0, i2, bufferedImage.getWidth(), 1, iArr, 0, bufferedImage.getWidth());
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = i3 * 4;
                int i5 = iArr[i3];
                bArr[i4] = (byte) i5;
                bArr[i4 + 1] = (byte) (i5 >> 8);
                bArr[i4 + 2] = (byte) (i5 >> 16);
                bArr[i4 + 3] = 0;
            }
            this.rleWriter.write(binaryOutputStream, bArr);
            i2++;
            bufferedImage = bufferedImage2;
        }
        this.rleWriter.flush(binaryOutputStream);
    }

    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int entry;
        int entry2;
        SimplePalette makeExactRgbPaletteSimple = new PaletteFactory().makeExactRgbPaletteSimple(bufferedImage, 256);
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(outputStream, ByteOrder.LITTLE_ENDIAN);
        char c = 2;
        if (makeExactRgbPaletteSimple != null && (i5 = this.bitDepthWanted) != 24 && i5 != 32) {
            if (makeExactRgbPaletteSimple.length() > 16 || this.bitDepthWanted == 8) {
                i2 = 8;
            } else {
                i2 = 4;
                if (makeExactRgbPaletteSimple.length() <= 8 && this.bitDepthWanted != 4) {
                    if (makeExactRgbPaletteSimple.length() > 4 || this.bitDepthWanted == 3) {
                        i = 3;
                    } else {
                        if (makeExactRgbPaletteSimple.length() <= 2 && this.bitDepthWanted != 2) {
                            boolean z = makeExactRgbPaletteSimple.length() < 1 || (entry2 = makeExactRgbPaletteSimple.getEntry(0)) == 0 || entry2 == 16777215;
                            if (makeExactRgbPaletteSimple.length() == 2 && (entry = makeExactRgbPaletteSimple.getEntry(1)) != 0 && entry != 16777215) {
                                z = false;
                            }
                            if (z) {
                                i = 1;
                                i2 = 1;
                            }
                        } else if (this.planesWanted != 2) {
                            i2 = 2;
                        }
                        i = 2;
                    }
                    i2 = 1;
                } else if (this.planesWanted != 1) {
                    i = 4;
                    i2 = 1;
                }
            }
            i = 1;
        } else if (this.bitDepthWanted == 32) {
            i2 = 32;
            i = 1;
        } else {
            i = 3;
            i2 = 8;
        }
        int m = Recorder$$ExternalSyntheticOutline1.m(i2, bufferedImage.getWidth(), 7, 8);
        if (m % 2 != 0) {
            m++;
        }
        byte[] bArr = new byte[48];
        int i6 = 0;
        for (int i7 = 16; i6 < i7; i7 = 16) {
            int entry3 = i6 < makeExactRgbPaletteSimple.length() ? makeExactRgbPaletteSimple.getEntry(i6) : 0;
            int i8 = i6 * 3;
            bArr[i8] = (byte) ((entry3 >> 16) & 255);
            bArr[i8 + 1] = (byte) ((entry3 >> 8) & 255);
            bArr[i8 + 2] = (byte) (entry3 & 255);
            i6++;
            c = c;
        }
        binaryOutputStream.write(10);
        binaryOutputStream.write((i2 == 1 && i == 1) ? 3 : 5);
        binaryOutputStream.write(this.f1553encoding);
        binaryOutputStream.write(i2);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(bufferedImage.getWidth() - 1);
        binaryOutputStream.write2Bytes(bufferedImage.getHeight() - 1);
        binaryOutputStream.write2Bytes((short) Math.round(this.pixelDensity.horizontalDensityInches()));
        binaryOutputStream.write2Bytes((short) Math.round(this.pixelDensity.verticalDensityInches()));
        binaryOutputStream.write(bArr);
        binaryOutputStream.write(0);
        binaryOutputStream.write(i);
        binaryOutputStream.write2Bytes(m);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write(new byte[54]);
        if (i2 == 32) {
            writePixels32(bufferedImage, m, binaryOutputStream);
            i3 = i;
            i4 = i2;
        } else {
            i3 = i;
            i4 = i2;
            writePixels(bufferedImage, i4, i3, m, makeExactRgbPaletteSimple, binaryOutputStream);
        }
        if (i4 == 8 && i3 == 1) {
            binaryOutputStream.write(12);
            int i9 = 0;
            while (i9 < 256) {
                int entry4 = i9 < makeExactRgbPaletteSimple.length() ? makeExactRgbPaletteSimple.getEntry(i9) : 0;
                binaryOutputStream.write((entry4 >> 16) & 255);
                binaryOutputStream.write((entry4 >> 8) & 255);
                binaryOutputStream.write(entry4 & 255);
                i9++;
            }
        }
    }
}
