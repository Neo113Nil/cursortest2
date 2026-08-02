package org.apache.commons.imaging.formats.ico;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class IcoImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".ico";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".cur"};

    public static class BitmapHeader {
        public final int bitCount;
        public final int colorsImportant;
        public final int colorsUsed;
        public final int compression;
        public final int height;
        public final int planes;
        public final int size;
        public final int sizeImage;
        public final int width;
        public final int xPelsPerMeter;
        public final int yPelsPerMeter;

        public BitmapHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.size = i;
            this.width = i2;
            this.height = i3;
            this.planes = i4;
            this.bitCount = i5;
            this.compression = i6;
            this.sizeImage = i7;
            this.xPelsPerMeter = i8;
            this.yPelsPerMeter = i9;
            this.colorsUsed = i10;
            this.colorsImportant = i11;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("BitmapHeader");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Size: "), this.size, printWriter, "Width: "), this.width, printWriter, "Height: "), this.height, printWriter, "Planes: "), this.planes, printWriter, "BitCount: "), this.bitCount, printWriter, "Compression: "), this.compression, printWriter, "SizeImage: "), this.sizeImage, printWriter, "XPelsPerMeter: "), this.xPelsPerMeter, printWriter, "YPelsPerMeter: "), this.yPelsPerMeter, printWriter, "ColorsUsed: "), this.colorsUsed, printWriter, "ColorsImportant: ");
            m.append(this.colorsImportant);
            printWriter.println(m.toString());
        }
    }

    public static class BitmapIconData extends IconData {
        public final BufferedImage bufferedImage;
        public final BitmapHeader header;

        public BitmapIconData(IconInfo iconInfo, BitmapHeader bitmapHeader, BufferedImage bufferedImage) {
            super(iconInfo);
            this.header = bitmapHeader;
            this.bufferedImage = bufferedImage;
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        public void dumpSubclass(PrintWriter printWriter) {
            printWriter.println("BitmapIconData");
            this.header.dump(printWriter);
            printWriter.println();
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        public BufferedImage readBufferedImage() {
            return this.bufferedImage;
        }
    }

    public static class FileHeader {
        public final int iconCount;
        public final int iconType;
        public final int reserved;

        public FileHeader(int i, int i2, int i3) {
            this.reserved = i;
            this.iconType = i2;
            this.iconCount = i3;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("FileHeader");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Reserved: "), this.reserved, printWriter, "IconType: "), this.iconType, printWriter, "IconCount: ");
            m.append(this.iconCount);
            printWriter.println(m.toString());
            printWriter.println();
        }
    }

    public static abstract class IconData {
        public final IconInfo iconInfo;

        public IconData(IconInfo iconInfo) {
            this.iconInfo = iconInfo;
        }

        public void dump(PrintWriter printWriter) {
            this.iconInfo.dump(printWriter);
            printWriter.println();
            dumpSubclass(printWriter);
        }

        public abstract void dumpSubclass(PrintWriter printWriter);

        public abstract BufferedImage readBufferedImage();
    }

    public static class IconInfo {
        public final int bitCount;
        public final byte colorCount;
        public final byte height;
        public final int imageOffset;
        public final int imageSize;
        public final int planes;
        public final byte reserved;
        public final byte width;

        public IconInfo(byte b, byte b2, byte b3, byte b4, int i, int i2, int i3, int i4) {
            this.width = b;
            this.height = b2;
            this.colorCount = b3;
            this.reserved = b4;
            this.planes = i;
            this.bitCount = i2;
            this.imageSize = i3;
            this.imageOffset = i4;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("IconInfo");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Width: "), this.width, printWriter, "Height: "), this.height, printWriter, "ColorCount: "), this.colorCount, printWriter, "Reserved: "), this.reserved, printWriter, "Planes: "), this.planes, printWriter, "BitCount: "), this.bitCount, printWriter, "ImageSize: "), this.imageSize, printWriter, "ImageOffset: ");
            m.append(this.imageOffset);
            printWriter.println(m.toString());
        }
    }

    public static class ImageContents {
        public final FileHeader fileHeader;
        public final IconData[] iconDatas;

        public ImageContents(FileHeader fileHeader, IconData[] iconDataArr) {
            this.fileHeader = fileHeader;
            this.iconDatas = iconDataArr;
        }
    }

    public static class PNGIconData extends IconData {
        public final BufferedImage bufferedImage;

        public PNGIconData(IconInfo iconInfo, BufferedImage bufferedImage) {
            super(iconInfo);
            this.bufferedImage = bufferedImage;
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        public void dumpSubclass(PrintWriter printWriter) {
            printWriter.println("PNGIconData");
            printWriter.println();
        }

        @Override // org.apache.commons.imaging.formats.ico.IcoImageParser.IconData
        public BufferedImage readBufferedImage() {
            return this.bufferedImage;
        }
    }

    public IcoImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    private IconData readBitmapIconData(byte[] bArr, IconInfo iconInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        int read4Bytes = BinaryFunctions.read4Bytes("size", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes2 = BinaryFunctions.read4Bytes("width", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes3 = BinaryFunctions.read4Bytes("height", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes = BinaryFunctions.read2Bytes("planes", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes2 = BinaryFunctions.read2Bytes("bitCount", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes4 = BinaryFunctions.read4Bytes("compression", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes5 = BinaryFunctions.read4Bytes("sizeImage", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes6 = BinaryFunctions.read4Bytes("xPelsPerMeter", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes7 = BinaryFunctions.read4Bytes("yPelsPerMeter", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes8 = BinaryFunctions.read4Bytes("colorsUsed", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        int read4Bytes9 = BinaryFunctions.read4Bytes("ColorsImportant", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        if (read4Bytes4 == 3) {
            i4 = BinaryFunctions.read4Bytes("redMask", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
            i3 = BinaryFunctions.read4Bytes("greenMask", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
            i = read4Bytes4;
            i2 = BinaryFunctions.read4Bytes("blueMask", byteArrayInputStream, "Not a Valid ICO File", getByteOrder());
        } else {
            i = read4Bytes4;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i12 = i2;
        byte[] readBytes = BinaryFunctions.readBytes("RestOfFile", byteArrayInputStream, byteArrayInputStream.available());
        if (read4Bytes != 40) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read4Bytes, "Not a Valid ICO File: Wrong bitmap header size "));
        }
        if (read2Bytes != 1) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read2Bytes, "Not a Valid ICO File: Planes can't be "));
        }
        if (i == 0 && read2Bytes2 == 32) {
            str = "Not a Valid ICO File";
            i5 = 16711680;
            i6 = -16777216;
            i = 3;
            i7 = 65280;
            i8 = 255;
        } else {
            str = "Not a Valid ICO File";
            i5 = i4;
            i6 = 0;
            i7 = i3;
            i8 = i12;
        }
        int i13 = i6;
        int i14 = i7;
        int i15 = i;
        BitmapHeader bitmapHeader = new BitmapHeader(read4Bytes, read4Bytes2, read4Bytes3, read2Bytes, read2Bytes2, i15, read4Bytes5, read4Bytes6, read4Bytes7, read4Bytes8, read4Bytes9);
        int i16 = (((read4Bytes8 != 0 || read2Bytes2 > 8) ? read4Bytes8 : 1 << read2Bytes2) * 4) + 70;
        int length = readBytes.length + 70;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i17 = i8;
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(byteArrayOutputStream, ByteOrder.LITTLE_ENDIAN);
        try {
            binaryOutputStream.write(66);
            binaryOutputStream.write(77);
            binaryOutputStream.write4Bytes(length);
            binaryOutputStream.write4Bytes(0);
            binaryOutputStream.write4Bytes(i16);
            binaryOutputStream.write4Bytes(56);
            binaryOutputStream.write4Bytes(read4Bytes2);
            binaryOutputStream.write4Bytes(read4Bytes3 / 2);
            binaryOutputStream.write2Bytes(read2Bytes);
            binaryOutputStream.write2Bytes(read2Bytes2);
            binaryOutputStream.write4Bytes(i15);
            binaryOutputStream.write4Bytes(read4Bytes5);
            binaryOutputStream.write4Bytes(read4Bytes6);
            binaryOutputStream.write4Bytes(read4Bytes7);
            binaryOutputStream.write4Bytes(read4Bytes8);
            binaryOutputStream.write4Bytes(read4Bytes9);
            binaryOutputStream.write4Bytes(i5);
            binaryOutputStream.write4Bytes(i14);
            binaryOutputStream.write4Bytes(i17);
            binaryOutputStream.write4Bytes(i13);
            binaryOutputStream.write(readBytes);
            binaryOutputStream.flush();
            binaryOutputStream.close();
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            byte[] bArr2 = null;
            BufferedImage bufferedImage = new BmpImageParser().getBufferedImage(byteArrayInputStream2, (Map<String, Object>) null);
            int i18 = (read4Bytes2 + 7) / 8;
            int i19 = i18 % 4;
            if (i19 != 0) {
                i18 = (4 - i19) + i18;
            }
            try {
                bArr2 = BinaryFunctions.readBytes("transparency_map", byteArrayInputStream2, (read4Bytes3 / 2) * i18, str);
                i9 = 32;
            } catch (IOException e) {
                i9 = 32;
                if (read2Bytes2 != 32) {
                    throw e;
                }
            }
            if (read2Bytes2 == i9) {
                z = true;
                for (int i20 = 0; z && i20 < bufferedImage.getHeight(); i20++) {
                    int i21 = 0;
                    while (true) {
                        if (i21 >= bufferedImage.getWidth()) {
                            break;
                        }
                        if ((bufferedImage.getRGB(i21, i20) & (-16777216)) != 0) {
                            z = false;
                            break;
                        }
                        i21++;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
                for (int i22 = 0; i22 < bufferedImage2.getHeight(); i22++) {
                    for (int i23 = 0; i23 < bufferedImage2.getWidth(); i23++) {
                        if (bArr2 != null) {
                            i10 = 255;
                            if ((((bArr2[(i23 / 8) + (((bufferedImage.getHeight() - i22) - 1) * i18)] & 255) >> (7 - (i23 % 8))) & 1) != 0) {
                                i11 = 0;
                                bufferedImage2.setRGB(i23, i22, (i11 << 24) | (16777215 & bufferedImage.getRGB(i23, i22)));
                            }
                        } else {
                            i10 = 255;
                        }
                        i11 = i10;
                        bufferedImage2.setRGB(i23, i22, (i11 << 24) | (16777215 & bufferedImage.getRGB(i23, i22)));
                    }
                }
                bufferedImage = bufferedImage2;
            }
            return new BitmapIconData(iconInfo, bitmapHeader, bufferedImage);
        } finally {
        }
    }

    private FileHeader readFileHeader(InputStream inputStream) {
        int read2Bytes = BinaryFunctions.read2Bytes("Reserved", inputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes2 = BinaryFunctions.read2Bytes("IconType", inputStream, "Not a Valid ICO File", getByteOrder());
        int read2Bytes3 = BinaryFunctions.read2Bytes("IconCount", inputStream, "Not a Valid ICO File", getByteOrder());
        if (read2Bytes != 0) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read2Bytes, "Not a Valid ICO File: reserved is "));
        }
        if (read2Bytes2 == 1 || read2Bytes2 == 2) {
            return new FileHeader(read2Bytes, read2Bytes2, read2Bytes3);
        }
        throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read2Bytes2, "Not a Valid ICO File: icon type is "));
    }

    private IconData readIconData(byte[] bArr, IconInfo iconInfo) {
        return Imaging.guessFormat(bArr).equals(ImageFormats.PNG) ? new PNGIconData(iconInfo, Imaging.getBufferedImage(bArr)) : readBitmapIconData(bArr, iconInfo);
    }

    private IconInfo readIconInfo(InputStream inputStream) {
        return new IconInfo(BinaryFunctions.readByte("Width", inputStream, "Not a Valid ICO File"), BinaryFunctions.readByte("Height", inputStream, "Not a Valid ICO File"), BinaryFunctions.readByte("ColorCount", inputStream, "Not a Valid ICO File"), BinaryFunctions.readByte("Reserved", inputStream, "Not a Valid ICO File"), BinaryFunctions.read2Bytes("Planes", inputStream, "Not a Valid ICO File", getByteOrder()), BinaryFunctions.read2Bytes("BitCount", inputStream, "Not a Valid ICO File", getByteOrder()), BinaryFunctions.read4Bytes("ImageSize", inputStream, "Not a Valid ICO File", getByteOrder()), BinaryFunctions.read4Bytes("ImageOffset", inputStream, "Not a Valid ICO File", getByteOrder()));
    }

    private ImageContents readImage(ByteSource byteSource) {
        int i;
        InputStream inputStream = byteSource.getInputStream();
        try {
            FileHeader readFileHeader = readFileHeader(inputStream);
            IconInfo[] iconInfoArr = new IconInfo[readFileHeader.iconCount];
            int i2 = 0;
            while (true) {
                i = readFileHeader.iconCount;
                if (i2 >= i) {
                    break;
                }
                iconInfoArr[i2] = readIconInfo(inputStream);
                i2++;
            }
            IconData[] iconDataArr = new IconData[i];
            for (int i3 = 0; i3 < readFileHeader.iconCount; i3++) {
                IconInfo iconInfo = iconInfoArr[i3];
                iconDataArr[i3] = readIconData(byteSource.getBlock(iconInfo.imageOffset, iconInfo.imageSize), iconInfoArr[i3]);
            }
            ImageContents imageContents = new ImageContents(readFileHeader, iconDataArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return imageContents;
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
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        ImageContents readImage = readImage(byteSource);
        readImage.fileHeader.dump(printWriter);
        for (IconData iconData : readImage.iconDatas) {
            iconData.dump(printWriter);
        }
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.ICO};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource) {
        ImageContents readImage = readImage(byteSource);
        FileHeader fileHeader = readImage.fileHeader;
        ArrayList arrayList = new ArrayList(fileHeader.iconCount);
        for (int i = 0; i < fileHeader.iconCount; i++) {
            arrayList.add(readImage.iconDatas[i].readBufferedImage());
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        ImageContents readImage = readImage(byteSource);
        if (readImage.fileHeader.iconCount > 0) {
            return readImage.iconDatas[0].readBufferedImage();
        }
        f$$ExternalSyntheticLambda0.m("No icons in ICO file");
        return null;
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
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "ico-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        int i;
        int i2;
        int round;
        int i3;
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        PixelDensity pixelDensity = (PixelDensity) hashMap.remove(ImagingConstants.PARAM_KEY_PIXEL_DENSITY);
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        PaletteFactory paletteFactory = new PaletteFactory();
        SimplePalette makeExactRgbPaletteSimple = paletteFactory.makeExactRgbPaletteSimple(bufferedImage, 256);
        int i4 = makeExactRgbPaletteSimple == null ? paletteFactory.hasTransparency(bufferedImage) ? 32 : 24 : makeExactRgbPaletteSimple.length() <= 2 ? 1 : makeExactRgbPaletteSimple.length() <= 16 ? 4 : 8;
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(outputStream, ByteOrder.LITTLE_ENDIAN);
        int m = Recorder$$ExternalSyntheticOutline1.m(i4, bufferedImage.getWidth(), 7, 8);
        int i5 = m % 4;
        if (i5 != 0) {
            m += 4 - i5;
        }
        int width = (bufferedImage.getWidth() + 7) / 8;
        int i6 = width % 4;
        if (i6 != 0) {
            width += 4 - i6;
        }
        int height = (bufferedImage.getHeight() * width) + (bufferedImage.getHeight() * m) + ((i4 <= 8 ? 1 << i4 : 0) * 4) + 40;
        binaryOutputStream.write2Bytes(0);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(1);
        int width2 = bufferedImage.getWidth();
        int height2 = bufferedImage.getHeight();
        if (width2 > 255 || height2 > 255) {
            width2 = 0;
            height2 = 0;
        }
        binaryOutputStream.write(width2);
        binaryOutputStream.write(height2);
        binaryOutputStream.write(i4 >= 8 ? 0 : 1 << i4);
        binaryOutputStream.write(0);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(i4);
        binaryOutputStream.write4Bytes(height);
        binaryOutputStream.write4Bytes(22);
        binaryOutputStream.write4Bytes(40);
        binaryOutputStream.write4Bytes(bufferedImage.getWidth());
        binaryOutputStream.write4Bytes(bufferedImage.getHeight() * 2);
        binaryOutputStream.write2Bytes(1);
        binaryOutputStream.write2Bytes(i4);
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(0);
        if (pixelDensity == null) {
            i = 8;
            i2 = 1;
            round = 0;
        } else {
            i = 8;
            i2 = 1;
            round = (int) Math.round(pixelDensity.horizontalDensityMetres());
        }
        binaryOutputStream.write4Bytes(round);
        binaryOutputStream.write4Bytes(pixelDensity == null ? 0 : (int) Math.round(pixelDensity.horizontalDensityMetres()));
        binaryOutputStream.write4Bytes(0);
        binaryOutputStream.write4Bytes(0);
        if (makeExactRgbPaletteSimple != null) {
            for (int i7 = 0; i7 < (i2 << i4); i7++) {
                if (i7 < makeExactRgbPaletteSimple.length()) {
                    binaryOutputStream.write3Bytes(makeExactRgbPaletteSimple.getEntry(i7));
                    binaryOutputStream.write(0);
                } else {
                    binaryOutputStream.write4Bytes(0);
                }
            }
        }
        int width3 = m - (((bufferedImage.getWidth() * i4) + 7) / 8);
        int height3 = bufferedImage.getHeight() - i2;
        int i8 = 0;
        int i9 = 0;
        while (height3 >= 0) {
            int i10 = 0;
            while (i10 < bufferedImage.getWidth()) {
                int rgb = bufferedImage.getRGB(i10, height3);
                if (makeExactRgbPaletteSimple != null) {
                    i3 = i2;
                    int i11 = i;
                    if (i4 < i11) {
                        i8 = (i8 << i4) | makeExactRgbPaletteSimple.getPaletteIndex(rgb & 16777215);
                        i9 += i4;
                        if (i9 >= i11) {
                            binaryOutputStream.write(i8 & 255);
                            i8 = 0;
                            i9 = 0;
                        }
                    } else if (i4 == i11) {
                        binaryOutputStream.write(makeExactRgbPaletteSimple.getPaletteIndex(rgb & 16777215) & 255);
                    }
                } else if (i4 == 24) {
                    binaryOutputStream.write3Bytes(rgb);
                    i3 = i2;
                } else {
                    if (i4 == 32) {
                        binaryOutputStream.write4Bytes(rgb);
                    }
                    i3 = i2;
                }
                i10++;
                i2 = i3;
                i = 8;
            }
            int i12 = i2;
            if (i9 > 0) {
                binaryOutputStream.write((i8 << (8 - i9)) & 255);
                i8 = 0;
                i9 = 0;
            }
            for (int i13 = 0; i13 < width3; i13++) {
                binaryOutputStream.write(0);
            }
            height3--;
            i2 = i12;
            i = 8;
        }
        int width4 = width - ((bufferedImage.getWidth() + 7) / 8);
        for (int height4 = bufferedImage.getHeight() - 1; height4 >= 0; height4--) {
            for (int i14 = 0; i14 < bufferedImage.getWidth(); i14++) {
                int i15 = i8 << 1;
                if (((bufferedImage.getRGB(i14, height4) >> 24) & 255) == 0) {
                    i15 |= 1;
                }
                i9++;
                if (i9 >= 8) {
                    binaryOutputStream.write(i15 & 255);
                    i8 = 0;
                    i9 = 0;
                } else {
                    i8 = i15;
                }
            }
            if (i9 > 0) {
                binaryOutputStream.write((i8 << (8 - i9)) & 255);
                i8 = 0;
                i9 = 0;
            }
            for (int i16 = 0; i16 < width4; i16++) {
                binaryOutputStream.write(0);
            }
        }
        binaryOutputStream.close();
    }
}
