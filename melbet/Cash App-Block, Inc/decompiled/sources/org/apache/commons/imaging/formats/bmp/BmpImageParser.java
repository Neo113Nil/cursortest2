package org.apache.commons.imaging.formats.bmp;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.bmp.BmpHeaderInfo;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;

/* loaded from: classes9.dex */
public class BmpImageParser extends ImageParser {
    private static final int BITMAP_FILE_HEADER_SIZE = 14;
    private static final int BITMAP_INFO_HEADER_SIZE = 40;
    private static final int BI_BITFIELDS = 3;
    private static final int BI_RGB = 0;
    private static final int BI_RLE4 = 2;
    private static final int BI_RLE8 = 1;
    private static final Logger LOGGER = Logger.getLogger(BmpImageParser.class.getName());
    private static final String DEFAULT_EXTENSION = ".bmp";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};
    private static final byte[] BMP_HEADER_SIGNATURE = {66, 77};

    public BmpImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    private String getBmpTypeDescription(int i, int i2) {
        return (i == 66 && i2 == 77) ? "Windows 3.1x, 95, NT," : (i == 66 && i2 == 65) ? "OS/2 Bitmap Array" : (i == 67 && i2 == 73) ? "OS/2 Color Icon" : (i == 67 && i2 == 80) ? "OS/2 Color Pointer" : (i == 73 && i2 == 67) ? "OS/2 Icon" : (i == 80 && i2 == 84) ? "OS/2 Pointer" : "Unknown";
    }

    private byte[] getRLEBytes(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        while (!z) {
            int readByte = BinaryFunctions.readByte("RLE a", inputStream, "BMP: Bad RLE") & 255;
            byteArrayOutputStream.write(readByte);
            int readByte2 = BinaryFunctions.readByte("RLE b", inputStream, "BMP: Bad RLE") & 255;
            byteArrayOutputStream.write(readByte2);
            if (readByte == 0 && readByte2 != 0) {
                if (readByte2 == 1) {
                    z = true;
                } else if (readByte2 != 2) {
                    int i2 = readByte2 / i;
                    if (readByte2 % i > 0) {
                        i2++;
                    }
                    if (i2 % 2 != 0) {
                        i2++;
                    }
                    byteArrayOutputStream.write(BinaryFunctions.readBytes("bytes", inputStream, i2, "RLE: Absolute Mode"));
                } else {
                    byteArrayOutputStream.write(BinaryFunctions.readByte("RLE c", inputStream, "BMP: Bad RLE") & 255);
                    byteArrayOutputStream.write(BinaryFunctions.readByte("RLE d", inputStream, "BMP: Bad RLE") & 255);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private BmpHeaderInfo readBmpHeaderInfo(InputStream inputStream, FormatCompliance formatCompliance) {
        int read4Bytes;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        BmpHeaderInfo.ColorSpace colorSpace;
        byte b;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        byte readByte = BinaryFunctions.readByte("Identifier1", inputStream, "Not a Valid BMP File");
        byte readByte2 = BinaryFunctions.readByte("Identifier2", inputStream, "Not a Valid BMP File");
        if (formatCompliance != null) {
            formatCompliance.compareBytes("Signature", BMP_HEADER_SIGNATURE, new byte[]{readByte, readByte2});
        }
        int read4Bytes2 = BinaryFunctions.read4Bytes("File Size", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes3 = BinaryFunctions.read4Bytes("Reserved", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes4 = BinaryFunctions.read4Bytes("Bitmap Data Offset", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes5 = BinaryFunctions.read4Bytes("Bitmap Header Size", inputStream, "Not a Valid BMP File", getByteOrder());
        BmpHeaderInfo.ColorSpace colorSpace2 = new BmpHeaderInfo.ColorSpace();
        colorSpace2.red = new BmpHeaderInfo.ColorSpaceCoordinate();
        colorSpace2.green = new BmpHeaderInfo.ColorSpaceCoordinate();
        colorSpace2.blue = new BmpHeaderInfo.ColorSpaceCoordinate();
        if (read4Bytes5 < 40) {
            f$$ExternalSyntheticLambda0.m("Invalid/unsupported BMP file");
            return null;
        }
        int read4Bytes6 = BinaryFunctions.read4Bytes("Width", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes7 = BinaryFunctions.read4Bytes("Height", inputStream, "Not a Valid BMP File", getByteOrder());
        int read2Bytes = BinaryFunctions.read2Bytes("Planes", inputStream, "Not a Valid BMP File", getByteOrder());
        int read2Bytes2 = BinaryFunctions.read2Bytes("Bits Per Pixel", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes8 = BinaryFunctions.read4Bytes("Compression", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes9 = BinaryFunctions.read4Bytes("Bitmap Data Size", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes10 = BinaryFunctions.read4Bytes("HResolution", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes11 = BinaryFunctions.read4Bytes("VResolution", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes12 = BinaryFunctions.read4Bytes("ColorsUsed", inputStream, "Not a Valid BMP File", getByteOrder());
        int read4Bytes13 = BinaryFunctions.read4Bytes("ColorsImportant", inputStream, "Not a Valid BMP File", getByteOrder());
        if (read4Bytes5 >= 52 || read4Bytes8 == 3) {
            int read4Bytes14 = BinaryFunctions.read4Bytes("RedMask", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes15 = BinaryFunctions.read4Bytes("GreenMask", inputStream, "Not a Valid BMP File", getByteOrder());
            read4Bytes = BinaryFunctions.read4Bytes("BlueMask", inputStream, "Not a Valid BMP File", getByteOrder());
            i = read4Bytes14;
            i2 = read4Bytes15;
        } else {
            i = 0;
            i2 = 0;
            read4Bytes = 0;
        }
        if (read4Bytes5 >= 56) {
            i3 = i;
            i4 = BinaryFunctions.read4Bytes("AlphaMask", inputStream, "Not a Valid BMP File", getByteOrder());
        } else {
            i3 = i;
            i4 = 0;
        }
        if (read4Bytes5 >= 108) {
            i5 = i4;
            int read4Bytes16 = BinaryFunctions.read4Bytes("ColorSpaceType", inputStream, "Not a Valid BMP File", getByteOrder());
            i6 = read4Bytes8;
            colorSpace2.red.x = BinaryFunctions.read4Bytes("ColorSpaceRedX", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.red.y = BinaryFunctions.read4Bytes("ColorSpaceRedY", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.red.z = BinaryFunctions.read4Bytes("ColorSpaceRedZ", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.green.x = BinaryFunctions.read4Bytes("ColorSpaceGreenX", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.green.y = BinaryFunctions.read4Bytes("ColorSpaceGreenY", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.green.z = BinaryFunctions.read4Bytes("ColorSpaceGreenZ", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.blue.x = BinaryFunctions.read4Bytes("ColorSpaceBlueX", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.blue.y = BinaryFunctions.read4Bytes("ColorSpaceBlueY", inputStream, "Not a Valid BMP File", getByteOrder());
            colorSpace2.blue.z = BinaryFunctions.read4Bytes("ColorSpaceBlueZ", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes17 = BinaryFunctions.read4Bytes("GammaRed", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes18 = BinaryFunctions.read4Bytes("GammaGreen", inputStream, "Not a Valid BMP File", getByteOrder());
            i9 = BinaryFunctions.read4Bytes("GammaBlue", inputStream, "Not a Valid BMP File", getByteOrder());
            i7 = read4Bytes16;
            i10 = read4Bytes18;
            i8 = read4Bytes17;
        } else {
            i5 = i4;
            i6 = read4Bytes8;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (read4Bytes5 >= 124) {
            i11 = i8;
            int read4Bytes19 = BinaryFunctions.read4Bytes("Intent", inputStream, "Not a Valid BMP File", getByteOrder());
            int read4Bytes20 = BinaryFunctions.read4Bytes("ProfileData", inputStream, "Not a Valid BMP File", getByteOrder());
            i14 = BinaryFunctions.read4Bytes("ProfileSize", inputStream, "Not a Valid BMP File", getByteOrder());
            i15 = BinaryFunctions.read4Bytes("Reserved", inputStream, "Not a Valid BMP File", getByteOrder());
            i12 = read4Bytes19;
            i13 = read4Bytes20;
        } else {
            i11 = i8;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        int i42 = i15;
        if (LOGGER.isLoggable(Level.FINE)) {
            debugNumber("identifier1", readByte, 1);
            debugNumber("identifier2", readByte2, 1);
            debugNumber("fileSize", read4Bytes2, 4);
            debugNumber("reserved", read4Bytes3, 4);
            debugNumber("bitmapDataOffset", read4Bytes4, 4);
            debugNumber("bitmapHeaderSize", read4Bytes5, 4);
            debugNumber("width", read4Bytes6, 4);
            debugNumber("height", read4Bytes7, 4);
            i16 = read2Bytes;
            debugNumber("planes", i16, 2);
            debugNumber("bitsPerPixel", read2Bytes2, 2);
            i17 = i6;
            int i43 = 4;
            debugNumber("compression", i17, 4);
            debugNumber("bitmapDataSize", read4Bytes9, 4);
            debugNumber("hResolution", read4Bytes10, 4);
            debugNumber("vResolution", read4Bytes11, 4);
            debugNumber("colorsUsed", read4Bytes12, 4);
            debugNumber("colorsImportant", read4Bytes13, 4);
            if (read4Bytes5 >= 52 || i17 == 3) {
                i35 = read4Bytes13;
                debugNumber("redMask", i3, 4);
                int i44 = i2;
                debugNumber("greenMask", i44, 4);
                i36 = i44;
                i37 = read4Bytes;
                debugNumber("blueMask", i37, 4);
            } else {
                i35 = read4Bytes13;
                i36 = i2;
                i37 = read4Bytes;
            }
            if (read4Bytes5 >= 56) {
                i38 = i37;
                i39 = i5;
                debugNumber("alphaMask", i39, 4);
            } else {
                i38 = i37;
                i39 = i5;
            }
            if (read4Bytes5 >= 108) {
                debugNumber("colorSpaceType", i7, 4);
                i40 = i7;
                debugNumber("colorSpace.red.x", colorSpace2.red.x, 1);
                debugNumber("colorSpace.red.y", colorSpace2.red.y, 1);
                debugNumber("colorSpace.red.z", colorSpace2.red.z, 1);
                debugNumber("colorSpace.green.x", colorSpace2.green.x, 1);
                debugNumber("colorSpace.green.y", colorSpace2.green.y, 1);
                debugNumber("colorSpace.green.z", colorSpace2.green.z, 1);
                debugNumber("colorSpace.blue.x", colorSpace2.blue.x, 1);
                debugNumber("colorSpace.blue.y", colorSpace2.blue.y, 1);
                debugNumber("colorSpace.blue.z", colorSpace2.blue.z, 1);
                i43 = 4;
                debugNumber("gammaRed", i11, 4);
                int i45 = i10;
                debugNumber("gammaGreen", i45, 4);
                i41 = i45;
                i18 = i9;
                debugNumber("gammaBlue", i18, 4);
            } else {
                i40 = i7;
                i18 = i9;
                i41 = i10;
            }
            if (read4Bytes5 >= 124) {
                debugNumber("intent", i12, i43);
                debugNumber("profileData", i13, i43);
                debugNumber("profileSize", i14, i43);
                i19 = i12;
                i20 = i42;
                debugNumber("reservedV5", i20, i43);
            } else {
                i19 = i12;
                i20 = i42;
            }
            readByte = readByte;
            i23 = read4Bytes11;
            i28 = i3;
            i29 = i41;
            i22 = read4Bytes10;
            i25 = i35;
            i30 = i38;
            i27 = i40;
            colorSpace = colorSpace2;
            i33 = read4Bytes7;
            i34 = read4Bytes2;
            i21 = read4Bytes9;
            i24 = read4Bytes12;
            i26 = i36;
            i31 = i39;
            b = readByte2;
            i32 = i14;
        } else {
            i16 = read2Bytes;
            int i46 = i2;
            i17 = i6;
            int i47 = i7;
            int i48 = i5;
            i18 = i9;
            i19 = i12;
            i20 = i42;
            i21 = read4Bytes9;
            i22 = read4Bytes10;
            i23 = read4Bytes11;
            i24 = read4Bytes12;
            i25 = read4Bytes13;
            i26 = i46;
            i27 = i47;
            i28 = i3;
            i29 = i10;
            i30 = read4Bytes;
            i31 = i48;
            colorSpace = colorSpace2;
            b = readByte2;
            i32 = i14;
            i33 = read4Bytes7;
            i34 = read4Bytes2;
        }
        return new BmpHeaderInfo(readByte, b, i34, read4Bytes3, read4Bytes4, read4Bytes5, read4Bytes6, i33, i16, read2Bytes2, i17, i21, i22, i23, i24, i25, i28, i26, i30, i31, i27, colorSpace, i11, i29, i18, i19, i13, i32, i20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r2.bitsPerPixel <= 8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r3 = r3 * 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0060, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a1, code lost:
    
        if (r2.bitsPerPixel <= 8) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[LOOP:0: B:33:0x0100->B:35:0x0104, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BmpImageContents readImageContents(InputStream inputStream, FormatCompliance formatCompliance) {
        int i;
        int i2;
        boolean z;
        int m;
        Logger logger;
        Level level;
        int i3;
        int i4;
        PixelParser pixelParserRgb;
        BmpHeaderInfo readBmpHeaderInfo = readBmpHeaderInfo(inputStream, formatCompliance);
        int i5 = readBmpHeaderInfo.colorsUsed;
        if (i5 == 0) {
            i5 = 1 << readBmpHeaderInfo.bitsPerPixel;
        }
        Logger logger2 = LOGGER;
        Level level2 = Level.FINE;
        if (logger2.isLoggable(level2)) {
            debugNumber("ColorsUsed", readBmpHeaderInfo.colorsUsed, 4);
            debugNumber("BitsPerPixel", readBmpHeaderInfo.bitsPerPixel, 4);
            debugNumber("ColorTableSize", i5, 4);
            debugNumber("bhi.colorsUsed", readBmpHeaderInfo.colorsUsed, 4);
            debugNumber("Compression", readBmpHeaderInfo.compression, 4);
        }
        int i6 = readBmpHeaderInfo.compression;
        if (i6 != 0) {
            if (i6 == 1) {
                if (logger2.isLoggable(level2)) {
                    logger2.fine("Compression: BI_RLE8");
                }
                i = i5 * 4;
                z = true;
                i2 = 1;
            } else if (i6 == 2) {
                if (logger2.isLoggable(level2)) {
                    logger2.fine("Compression: BI_RLE4");
                }
                i = i5 * 4;
                z = true;
                i2 = 2;
            } else {
                if (i6 != 3) {
                    throw new ImageReadException("BMP: Unknown Compression: " + readBmpHeaderInfo.compression);
                }
                if (logger2.isLoggable(level2)) {
                    logger2.fine("Compression: BI_BITFIELDS");
                }
            }
            byte[] readBytes = i <= 0 ? BinaryFunctions.readBytes("ColorTable", inputStream, i, "Not a Valid BMP File") : null;
            if (logger2.isLoggable(level2)) {
                debugNumber("paletteLength", i, 4);
                StringBuilder sb = new StringBuilder("ColorTable: ");
                sb.append(readBytes == null ? "null" : Integer.toString(readBytes.length));
                logger2.fine(sb.toString());
            }
            m = Recorder$$ExternalSyntheticOutline1.m(readBmpHeaderInfo.bitsPerPixel, readBmpHeaderInfo.width, 7, 8);
            if (logger2.isLoggable(level2)) {
                int i7 = readBmpHeaderInfo.width;
                int i8 = readBmpHeaderInfo.height * i7;
                debugNumber("bhi.Width", i7, 4);
                debugNumber("bhi.Height", readBmpHeaderInfo.height, 4);
                debugNumber("ImageLineLength", m, 4);
                debugNumber("PixelCount", i8, 4);
            }
            while (m % 4 != 0) {
                m++;
            }
            int i9 = readBmpHeaderInfo.bitmapHeaderSize;
            int i10 = i9 + 14 + ((i9 == 40 || readBmpHeaderInfo.compression != 3) ? 0 : 12);
            int i11 = i10 + i;
            logger = LOGGER;
            level = Level.FINE;
            if (logger.isLoggable(level)) {
                i3 = m;
            } else {
                i3 = m;
                debugNumber("bhi.BitmapDataOffset", readBmpHeaderInfo.bitmapDataOffset, 4);
                debugNumber("expectedDataOffset", i11, 4);
            }
            i4 = readBmpHeaderInfo.bitmapDataOffset - i11;
            if (i4 >= 0) {
                StringBuilder sb2 = new StringBuilder("BMP has invalid image data offset: ");
                Recorder$$ExternalSyntheticOutline1.m105m(readBmpHeaderInfo.bitmapDataOffset, i11, " (expected: ", ", paletteLength: ", sb2);
                throw new ImageReadException(Recorder$$ExternalSyntheticOutline1.m(i, i10, ", headerSize: ", ")", sb2));
            }
            if (i4 > 0) {
                BinaryFunctions.readBytes("BitmapDataOffset", inputStream, i4, "Not a Valid BMP File");
            }
            int i12 = readBmpHeaderInfo.height * i3;
            if (logger.isLoggable(level)) {
                debugNumber("imageDataSize", i12, 4);
            }
            byte[] rLEBytes = z ? getRLEBytes(inputStream, i2) : BinaryFunctions.readBytes("ImageData", inputStream, i12, "Not a Valid BMP File");
            if (logger.isLoggable(level)) {
                debugNumber("ImageData.length", rLEBytes.length, 4);
            }
            int i13 = readBmpHeaderInfo.compression;
            if (i13 == 0) {
                pixelParserRgb = new PixelParserRgb(readBmpHeaderInfo, readBytes, rLEBytes);
            } else if (i13 == 1 || i13 == 2) {
                pixelParserRgb = new PixelParserRle(readBmpHeaderInfo, readBytes, rLEBytes);
            } else {
                if (i13 != 3) {
                    throw new ImageReadException("BMP: Unknown Compression: " + readBmpHeaderInfo.compression);
                }
                pixelParserRgb = new PixelParserBitFields(readBmpHeaderInfo, readBytes, rLEBytes);
            }
            return new BmpImageContents(readBmpHeaderInfo, readBytes, rLEBytes, pixelParserRgb);
        }
        if (logger2.isLoggable(level2)) {
            logger2.fine("Compression: BI_RGB");
        }
        z = false;
        i2 = 0;
        if (i <= 0) {
        }
        if (logger2.isLoggable(level2)) {
        }
        m = Recorder$$ExternalSyntheticOutline1.m(readBmpHeaderInfo.bitsPerPixel, readBmpHeaderInfo.width, 7, 8);
        if (logger2.isLoggable(level2)) {
        }
        while (m % 4 != 0) {
        }
        int i92 = readBmpHeaderInfo.bitmapHeaderSize;
        int i102 = i92 + 14 + ((i92 == 40 || readBmpHeaderInfo.compression != 3) ? 0 : 12);
        int i112 = i102 + i;
        logger = LOGGER;
        level = Level.FINE;
        if (logger.isLoggable(level)) {
        }
        i4 = readBmpHeaderInfo.bitmapDataOffset - i112;
        if (i4 >= 0) {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        printWriter.println("bmp.dumpImageFile");
        getImageInfo(byteSource, (Map<String, Object>) null).toString(printWriter, "");
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.BMP};
    }

    public BufferedImage getBufferedImage(InputStream inputStream, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.BUFFERED_IMAGE_FACTORY)) {
            hashMap.remove(ImagingConstants.BUFFERED_IMAGE_FACTORY);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageReadException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        BmpImageContents readImageContents = readImageContents(inputStream, FormatCompliance.getDefault());
        if (readImageContents == null) {
            f$$ExternalSyntheticLambda0.m("Couldn't read BMP Data");
            return null;
        }
        BmpHeaderInfo bmpHeaderInfo = readImageContents.bhi;
        int i = bmpHeaderInfo.width;
        int i2 = bmpHeaderInfo.height;
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("width: " + i);
            logger.fine("height: " + i2);
            StringBuilder sb = new StringBuilder("width*height: ");
            int i3 = i * i2;
            sb.append(i3);
            logger.fine(sb.toString());
            logger.fine("width*height*4: " + (i3 * 4));
        }
        PixelParser pixelParser = readImageContents.pixelParser;
        ImageBuilder imageBuilder = new ImageBuilder(i, i2, true);
        pixelParser.processImage(imageBuilder);
        return imageBuilder.getBufferedImage();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public FormatCompliance getFormatCompliance(ByteSource byteSource) {
        FormatCompliance formatCompliance = new FormatCompliance(byteSource.getDescription());
        InputStream inputStream = byteSource.getInputStream();
        try {
            readImageContents(inputStream, formatCompliance);
            if (inputStream != null) {
                inputStream.close();
            }
            return formatCompliance;
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

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new ImageReadException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        InputStream inputStream = byteSource.getInputStream();
        try {
            BmpImageContents readImageContents = readImageContents(inputStream, FormatCompliance.getDefault());
            if (inputStream != null) {
                inputStream.close();
            }
            if (readImageContents == null) {
                f$$ExternalSyntheticLambda0.m("Couldn't read BMP Data");
                return null;
            }
            BmpHeaderInfo bmpHeaderInfo = readImageContents.bhi;
            byte[] bArr = readImageContents.colorTable;
            if (bmpHeaderInfo == null) {
                f$$ExternalSyntheticLambda0.m("BMP: couldn't read header");
                return null;
            }
            int i = bmpHeaderInfo.height;
            int i2 = bmpHeaderInfo.width;
            ArrayList arrayList = new ArrayList();
            int i3 = bmpHeaderInfo.bitsPerPixel;
            ImageFormats imageFormats = ImageFormats.BMP;
            int i4 = (int) (bmpHeaderInfo.hResolution * 0.0254d);
            float f = (float) (i2 / i4);
            int i5 = (int) (bmpHeaderInfo.vResolution * 0.0254d);
            float f2 = (float) (i / i5);
            StringBuilder sb = new StringBuilder("Bmp (");
            sb.append((char) bmpHeaderInfo.identifier1);
            sb.append((char) bmpHeaderInfo.identifier2);
            sb.append(": ");
            return new ImageInfo(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, getBmpTypeDescription(bmpHeaderInfo.identifier1, bmpHeaderInfo.identifier2), ")"), i3, arrayList, imageFormats, "BMP Windows Bitmap", i, "image/x-ms-bmp", -1, i5, f2, i4, f, i2, false, false, bArr != null, ImageInfo.ColorType.RGB, ImageInfo.CompressionAlgorithm.RLE);
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new ImageReadException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        BmpHeaderInfo readBmpHeaderInfo = readBmpHeaderInfo(byteSource);
        if (readBmpHeaderInfo != null) {
            return new Dimension(readBmpHeaderInfo.width, readBmpHeaderInfo.height);
        }
        f$$ExternalSyntheticLambda0.m("BMP: couldn't read header");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Bmp-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        PixelDensity pixelDensity = hashMap.containsKey(ImagingConstants.PARAM_KEY_PIXEL_DENSITY) ? (PixelDensity) hashMap.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY) : null;
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        SimplePalette makeExactRgbPaletteSimple = new PaletteFactory().makeExactRgbPaletteSimple(bufferedImage, 256);
        BmpWriter bmpWriterRgb = makeExactRgbPaletteSimple == null ? new BmpWriterRgb() : new BmpWriterPalette(makeExactRgbPaletteSimple);
        byte[] imageData = bmpWriterRgb.getImageData(bufferedImage);
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(outputStream, ByteOrder.LITTLE_ENDIAN);
        outputStream.write(66);
        outputStream.write(77);
        binaryOutputStream.write4Bytes((bmpWriterRgb.getPaletteSize() * 4) + 54 + imageData.length);
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes((bmpWriterRgb.getPaletteSize() * 4) + 54);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        binaryOutputStream.write4Bytes(40);
        binaryOutputStream.write4Bytes(width);
        binaryOutputStream.write4Bytes(height);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(bmpWriterRgb.getBitsPerPixel());
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(imageData.length);
        binaryOutputStream.write4Bytes(pixelDensity != null ? (int) Math.round(pixelDensity.horizontalDensityMetres()) : 0);
        binaryOutputStream.write4Bytes(pixelDensity != null ? (int) Math.round(pixelDensity.verticalDensityMetres()) : 0);
        if (makeExactRgbPaletteSimple == null) {
            binaryOutputStream.write4Bytes(0);
        } else {
            binaryOutputStream.write4Bytes(makeExactRgbPaletteSimple.length());
        }
        binaryOutputStream.write4Bytes(0);
        bmpWriterRgb.writePalette(binaryOutputStream);
        binaryOutputStream.write(imageData);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            BufferedImage bufferedImage = getBufferedImage(inputStream, map);
            if (inputStream != null) {
                inputStream.close();
            }
            return bufferedImage;
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

    private BmpHeaderInfo readBmpHeaderInfo(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            BmpHeaderInfo readBmpHeaderInfo = readBmpHeaderInfo(inputStream, null);
            if (inputStream != null) {
                inputStream.close();
            }
            return readBmpHeaderInfo;
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
