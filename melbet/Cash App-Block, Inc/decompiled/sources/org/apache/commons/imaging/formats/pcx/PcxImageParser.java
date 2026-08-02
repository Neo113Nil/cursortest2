package org.apache.commons.imaging.formats.pcx;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class PcxImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".pcx";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".pcc"};

    public static class PcxHeader {
        public static final int ENCODING_RLE = 1;
        public static final int ENCODING_UNCOMPRESSED = 0;
        public static final int PALETTE_INFO_COLOR = 1;
        public static final int PALETTE_INFO_GRAYSCALE = 2;
        public final int bitsPerPixel;
        public final int bytesPerLine;
        public final int[] colormap;

        /* renamed from: encoding, reason: collision with root package name */
        public final int f1552encoding;
        public final int hDpi;
        public final int hScreenSize;
        public final int manufacturer;
        public final int nPlanes;
        public final int paletteInfo;
        public final int reserved;
        public final int vDpi;
        public final int vScreenSize;
        public final int version;
        public final int xMax;
        public final int xMin;
        public final int yMax;
        public final int yMin;

        public PcxHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.manufacturer = i;
            this.version = i2;
            this.f1552encoding = i3;
            this.bitsPerPixel = i4;
            this.xMin = i5;
            this.yMin = i6;
            this.xMax = i7;
            this.yMax = i8;
            this.hDpi = i9;
            this.vDpi = i10;
            this.colormap = iArr;
            this.reserved = i11;
            this.nPlanes = i12;
            this.bytesPerLine = i13;
            this.paletteInfo = i14;
            this.hScreenSize = i15;
            this.vScreenSize = i16;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("PcxHeader");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Manufacturer: "), this.manufacturer, printWriter, "Version: "), this.version, printWriter, "Encoding: "), this.f1552encoding, printWriter, "BitsPerPixel: "), this.bitsPerPixel, printWriter, "xMin: "), this.xMin, printWriter, "yMin: "), this.yMin, printWriter, "xMax: "), this.xMax, printWriter, "yMax: "), this.yMax, printWriter, "hDpi: "), this.hDpi, printWriter, "vDpi: ");
            m.append(this.vDpi);
            printWriter.println(m.toString());
            printWriter.print("ColorMap: ");
            for (int i = 0; i < this.colormap.length; i++) {
                if (i > 0) {
                    printWriter.print(",");
                }
                printWriter.print("(" + ((this.colormap[i] >> 16) & 255) + "," + ((this.colormap[i] >> 8) & 255) + "," + (this.colormap[i] & 255) + ")");
            }
            printWriter.println();
            StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Reserved: "), this.reserved, printWriter, "nPlanes: "), this.nPlanes, printWriter, "BytesPerLine: "), this.bytesPerLine, printWriter, "PaletteInfo: "), this.paletteInfo, printWriter, "hScreenSize: "), this.hScreenSize, printWriter, "vScreenSize: ");
            m2.append(this.vScreenSize);
            printWriter.println(m2.toString());
            printWriter.println();
        }
    }

    public PcxImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    private int[] read256ColorPalette(InputStream inputStream) {
        byte[] readBytes = BinaryFunctions.readBytes("Palette", inputStream, 769, "Error reading palette");
        if (readBytes[0] != 12) {
            return null;
        }
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i * 3;
            iArr[i] = (readBytes[i2 + 3] & 255) | ((readBytes[i2 + 1] & 255) << 16) | ((readBytes[i2 + 2] & 255) << 8);
        }
        return iArr;
    }

    private int[] read256ColorPaletteFromEndOfFile(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            BinaryFunctions.skipBytes(inputStream, (int) (byteSource.getLength() - 769));
            int[] read256ColorPalette = read256ColorPalette(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return read256ColorPalette;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private BufferedImage readImage(PcxHeader pcxHeader, InputStream inputStream, ByteSource byteSource) {
        RleReader rleReader;
        int[] iArr;
        byte b;
        boolean z = true;
        int i = (pcxHeader.xMax - pcxHeader.xMin) + 1;
        if (i < 0) {
            f$$ExternalSyntheticLambda0.m("Image width is negative");
            return null;
        }
        int i2 = (pcxHeader.yMax - pcxHeader.yMin) + 1;
        if (i2 < 0) {
            f$$ExternalSyntheticLambda0.m("Image height is negative");
            return null;
        }
        int i3 = pcxHeader.nPlanes;
        if (i3 <= 0 || 4 < i3) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(pcxHeader.nPlanes, " planes", new StringBuilder("Unsupported/invalid image with ")));
        }
        int i4 = pcxHeader.f1552encoding;
        byte b2 = 0;
        if (i4 == 0) {
            rleReader = new RleReader(false);
        } else {
            if (i4 != 1) {
                throw new ImageReadException("Unsupported/invalid image encoding " + pcxHeader.f1552encoding);
            }
            rleReader = new RleReader(true);
        }
        RleReader rleReader2 = rleReader;
        int i5 = pcxHeader.bytesPerLine;
        int i6 = pcxHeader.nPlanes;
        byte[] bArr = new byte[i5 * i6];
        int i7 = pcxHeader.bitsPerPixel;
        int i8 = 8;
        if ((i7 == 1 || i7 == 2 || i7 == 4 || i7 == 8) && i6 == 1) {
            int m = Recorder$$ExternalSyntheticOutline1.m(i, i7, 7, 8);
            int i9 = i2 * m;
            byte[] bArr2 = new byte[i9];
            for (int i10 = 0; i10 < i2; i10++) {
                rleReader2.read(inputStream, bArr);
                System.arraycopy(bArr, 0, bArr2, i10 * m, m);
            }
            DataBufferByte dataBufferByte = new DataBufferByte(bArr2, i9);
            int i11 = pcxHeader.bitsPerPixel;
            if (i11 == 1) {
                iArr = new int[]{0, 16777215};
            } else if (i11 == 8) {
                int[] read256ColorPalette = read256ColorPalette(inputStream);
                iArr = read256ColorPalette == null ? read256ColorPaletteFromEndOfFile(byteSource) : read256ColorPalette;
                if (iArr == null) {
                    f$$ExternalSyntheticLambda0.m("No 256 color palette found in image that needs it");
                    return null;
                }
            } else {
                iArr = pcxHeader.colormap;
            }
            int[] iArr2 = iArr;
            int i12 = pcxHeader.bitsPerPixel;
            WritableRaster createInterleavedRaster = i12 == 8 ? Raster.createInterleavedRaster(dataBufferByte, i, i2, m, 1, new int[]{0}, (Point) null) : Raster.createPackedRaster(dataBufferByte, i, i2, i12, (Point) null);
            int i13 = pcxHeader.bitsPerPixel;
            IndexColorModel indexColorModel = new IndexColorModel(i13, 1 << i13, iArr2, 0, false, -1, 0);
            return new BufferedImage(indexColorModel, createInterleavedRaster, indexColorModel.isAlphaPremultiplied(), new Properties());
        }
        if (i7 == 1 && 2 <= i6 && i6 <= 4) {
            int i14 = pcxHeader.nPlanes;
            BufferedImage bufferedImage = new BufferedImage(i, i2, 12, new IndexColorModel(i14, 1 << i14, pcxHeader.colormap, 0, false, -1, 0));
            byte[] bArr3 = new byte[i];
            int i15 = 0;
            while (i15 < i2) {
                rleReader2.read(inputStream, bArr);
                Arrays.fill(bArr3, b2);
                int i16 = b2;
                int i17 = i16;
                while (i16 < pcxHeader.nPlanes) {
                    int i18 = b2;
                    while (i18 < pcxHeader.bytesPerLine) {
                        int i19 = i17 + 1;
                        int i20 = bArr[i17] & 255;
                        boolean z2 = z;
                        int i21 = b2;
                        while (true) {
                            if (i21 >= i8) {
                                b = b2;
                                break;
                            }
                            b = b2;
                            int i22 = (i18 * 8) + i21;
                            if (i22 < i) {
                                bArr3[i22] = (byte) (bArr3[i22] | ((byte) (((i20 >> (7 - i21)) & 1) << i16)));
                                i21++;
                                b2 = b;
                                i8 = 8;
                            }
                        }
                        i18++;
                        i17 = i19;
                        z = z2;
                        b2 = b;
                        i8 = 8;
                    }
                    i16++;
                    i8 = 8;
                }
                int i23 = i;
                bufferedImage.getRaster().setDataElements(0, i15, i23, 1, bArr3);
                i = i23;
                i15++;
                i8 = 8;
            }
            return bufferedImage;
        }
        int i24 = 0;
        if (i7 == 8 && i6 == 3) {
            int i25 = i * i2;
            byte[][] bArr4 = {new byte[i25], new byte[i25], new byte[i25]};
            int i26 = 0;
            while (i26 < i2) {
                rleReader2.read(inputStream, bArr);
                int i27 = i26 * i;
                System.arraycopy(bArr, i24, bArr4[i24], i27, i);
                System.arraycopy(bArr, pcxHeader.bytesPerLine, bArr4[1], i27, i);
                System.arraycopy(bArr, pcxHeader.bytesPerLine * 2, bArr4[2], i27, i);
                i26++;
                i24 = 0;
            }
            WritableRaster createBandedRaster = Raster.createBandedRaster(new DataBufferByte(bArr4, bArr4[0].length), i, i2, i, new int[]{0, 1, 2}, new int[]{0, 0, 0}, (Point) null);
            ComponentColorModel componentColorModel = new ComponentColorModel(ColorSpace.getInstance(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), false, false, 1, 0);
            return new BufferedImage(componentColorModel, createBandedRaster, componentColorModel.isAlphaPremultiplied(), new Properties());
        }
        if ((i7 != 24 || i6 != 1) && (i7 != 32 || i6 != 1)) {
            throw new ImageReadException("Invalid/unsupported image with bitsPerPixel " + pcxHeader.bitsPerPixel + " and planes " + pcxHeader.nPlanes);
        }
        int i28 = i * 3;
        int i29 = i28 * i2;
        byte[] bArr5 = new byte[i29];
        for (int i30 = 0; i30 < i2; i30++) {
            rleReader2.read(inputStream, bArr);
            if (pcxHeader.bitsPerPixel == 24) {
                System.arraycopy(bArr, 0, bArr5, i30 * i28, i28);
            } else {
                for (int i31 = 0; i31 < i; i31++) {
                    int i32 = (i31 * 3) + (i30 * i28);
                    int i33 = i31 * 4;
                    bArr5[i32] = bArr[i33];
                    bArr5[i32 + 1] = bArr[i33 + 1];
                    bArr5[i32 + 2] = bArr[i33 + 2];
                }
            }
        }
        WritableRaster createInterleavedRaster2 = Raster.createInterleavedRaster(new DataBufferByte(bArr5, i29), i, i2, i28, 3, new int[]{2, 1, 0}, (Point) null);
        ComponentColorModel componentColorModel2 = new ComponentColorModel(ColorSpace.getInstance(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), false, false, 1, 0);
        return new BufferedImage(componentColorModel2, createInterleavedRaster2, componentColorModel2.isAlphaPremultiplied(), new Properties());
    }

    private PcxHeader readPcxHeader(InputStream inputStream, boolean z) {
        byte[] readBytes = BinaryFunctions.readBytes("PcxHeader", inputStream, 128, "Not a Valid PCX File");
        int i = 0;
        int i2 = readBytes[0] & 255;
        int i3 = readBytes[1] & 255;
        int i4 = readBytes[2] & 255;
        int i5 = readBytes[3] & 255;
        int uInt16 = ByteConversions.toUInt16(readBytes, 4, getByteOrder());
        int uInt162 = ByteConversions.toUInt16(readBytes, 6, getByteOrder());
        char c = '\b';
        int uInt163 = ByteConversions.toUInt16(readBytes, 8, getByteOrder());
        int uInt164 = ByteConversions.toUInt16(readBytes, 10, getByteOrder());
        int uInt165 = ByteConversions.toUInt16(readBytes, 12, getByteOrder());
        int uInt166 = ByteConversions.toUInt16(readBytes, 14, getByteOrder());
        int[] iArr = new int[16];
        for (int i6 = 16; i < i6; i6 = 16) {
            int i7 = i * 3;
            iArr[i] = ((readBytes[i7 + 16] & 255) << i6) | (-16777216) | ((readBytes[i7 + 17] & 255) << 8) | (readBytes[i7 + 18] & 255);
            i++;
            c = c;
        }
        int i8 = readBytes[64] & 255;
        int i9 = readBytes[65] & 255;
        int uInt167 = ByteConversions.toUInt16(readBytes, 66, getByteOrder());
        int uInt168 = ByteConversions.toUInt16(readBytes, 68, getByteOrder());
        int uInt169 = ByteConversions.toUInt16(readBytes, 70, getByteOrder());
        int uInt1610 = ByteConversions.toUInt16(readBytes, 72, getByteOrder());
        if (i2 != 10) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Not a Valid PCX File: manufacturer is "));
        }
        if (!z || uInt167 % 2 == 0) {
            return new PcxHeader(i2, i3, i4, i5, uInt16, uInt162, uInt163, uInt164, uInt165, uInt166, iArr, i8, i9, uInt167, uInt168, uInt169, uInt1610);
        }
        f$$ExternalSyntheticLambda0.m("Not a Valid PCX File: bytesPerLine is odd");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        readPcxHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.PCX};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        Object obj = (map == null ? new HashMap() : new HashMap(map)).get(ImagingConstants.PARAM_KEY_STRICT);
        boolean booleanValue = obj != null ? ((Boolean) obj).booleanValue() : false;
        InputStream inputStream = byteSource.getInputStream();
        try {
            BufferedImage readImage = readImage(readPcxHeader(inputStream, booleanValue), inputStream, byteSource);
            if (inputStream != null) {
                inputStream.close();
            }
            return readImage;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        PcxHeader readPcxHeader = readPcxHeader(byteSource);
        Dimension imageSize = getImageSize(byteSource, map);
        return new ImageInfo("PCX", readPcxHeader.bitsPerPixel * readPcxHeader.nPlanes, new ArrayList(), ImageFormats.PCX, "ZSoft PCX Image", imageSize.height, "image/x-pcx", 1, readPcxHeader.vDpi, Math.round(imageSize.getHeight() / readPcxHeader.vDpi), readPcxHeader.hDpi, Math.round(imageSize.getWidth() / readPcxHeader.hDpi), imageSize.width, false, false, (readPcxHeader.nPlanes == 3 && readPcxHeader.bitsPerPixel == 8) ? false : true, ImageInfo.ColorType.RGB, readPcxHeader.f1552encoding == 1 ? ImageInfo.CompressionAlgorithm.RLE : ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        PcxHeader readPcxHeader = readPcxHeader(byteSource);
        int i = (readPcxHeader.xMax - readPcxHeader.xMin) + 1;
        if (i < 0) {
            f$$ExternalSyntheticLambda0.m("Image width is negative");
            return null;
        }
        int i2 = (readPcxHeader.yMax - readPcxHeader.yMin) + 1;
        if (i2 >= 0) {
            return new Dimension(i, i2);
        }
        f$$ExternalSyntheticLambda0.m("Image height is negative");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Pcx-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        new PcxWriter(map).writeImage(bufferedImage, outputStream);
    }

    private PcxHeader readPcxHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            PcxHeader readPcxHeader = readPcxHeader(inputStream, false);
            if (inputStream != null) {
                inputStream.close();
            }
            return readPcxHeader;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
