package org.apache.commons.imaging;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.awt.Dimension;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.icc.IccProfileInfo;
import org.apache.commons.imaging.icc.IccProfileParser;

/* loaded from: classes9.dex */
public final class Imaging {
    private static final int[] MAGIC_NUMBERS_GIF = {71, 73};
    private static final int[] MAGIC_NUMBERS_PNG = {EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 80};
    private static final int[] MAGIC_NUMBERS_JPEG = {255, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE};
    private static final int[] MAGIC_NUMBERS_BMP = {66, 77};
    private static final int[] MAGIC_NUMBERS_TIFF_MOTOROLA = {77, 77};
    private static final int[] MAGIC_NUMBERS_TIFF_INTEL = {73, 73};
    private static final int[] MAGIC_NUMBERS_PAM = {80, 55};
    private static final int[] MAGIC_NUMBERS_PSD = {56, 66};
    private static final int[] MAGIC_NUMBERS_PBM_A = {80, 49};
    private static final int[] MAGIC_NUMBERS_PBM_B = {80, 52};
    private static final int[] MAGIC_NUMBERS_PGM_A = {80, 50};
    private static final int[] MAGIC_NUMBERS_PGM_B = {80, 53};
    private static final int[] MAGIC_NUMBERS_PPM_A = {80, 51};
    private static final int[] MAGIC_NUMBERS_PPM_B = {80, 54};
    private static final int[] MAGIC_NUMBERS_JBIG2_1 = {151, 74};
    private static final int[] MAGIC_NUMBERS_JBIG2_2 = {66, 50};
    private static final int[] MAGIC_NUMBERS_ICNS = {105, 99};
    private static final int[] MAGIC_NUMBERS_DCX = {EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 104};
    private static final int[] MAGIC_NUMBERS_RGBE = {35, 63};

    private Imaging() {
    }

    private static boolean compareBytePair(int[] iArr, int[] iArr2) {
        if (iArr.length == 2 || iArr2.length == 2) {
            return iArr[0] == iArr2[0] && iArr[1] == iArr2[1];
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1("Invalid Byte Pair.");
        return false;
    }

    public static String dumpImageFile(byte[] bArr) {
        return dumpImageFile(new ByteSourceArray(bArr));
    }

    public static List<BufferedImage> getAllBufferedImages(InputStream inputStream, String str) {
        return getAllBufferedImages(new ByteSourceInputStream(inputStream, str));
    }

    public static BufferedImage getBufferedImage(InputStream inputStream, Map<String, Object> map) {
        return getBufferedImage(new ByteSourceInputStream(inputStream, (map == null || !map.containsKey(ImagingConstants.PARAM_KEY_FILENAME)) ? null : (String) map.get(ImagingConstants.PARAM_KEY_FILENAME)), map);
    }

    public static FormatCompliance getFormatCompliance(byte[] bArr) {
        return getFormatCompliance(new ByteSourceArray(bArr));
    }

    public static ICC_Profile getICCProfile(ByteSource byteSource, Map<String, Object> map) {
        IccProfileInfo iCCProfileInfo;
        byte[] iCCProfileBytes = getICCProfileBytes(byteSource, map);
        if (iCCProfileBytes == null || (iCCProfileInfo = new IccProfileParser().getICCProfileInfo(iCCProfileBytes)) == null || iCCProfileInfo.issRGB()) {
            return null;
        }
        return ICC_Profile.getInstance(iCCProfileBytes);
    }

    public static byte[] getICCProfileBytes(byte[] bArr, Map<String, Object> map) {
        return getICCProfileBytes(new ByteSourceArray(bArr), map);
    }

    public static ImageInfo getImageInfo(String str, byte[] bArr) {
        return getImageInfo(new ByteSourceArray(str, bArr), (Map<String, Object>) null);
    }

    private static ImageParser getImageParser(ByteSource byteSource) {
        ImageFormat guessFormat = guessFormat(byteSource);
        if (!guessFormat.equals(ImageFormats.UNKNOWN)) {
            for (ImageParser imageParser : ImageParser.getAllImageParsers()) {
                if (imageParser.canAcceptType(guessFormat)) {
                    return imageParser;
                }
            }
        }
        String fileName = byteSource.getFileName();
        if (fileName != null) {
            for (ImageParser imageParser2 : ImageParser.getAllImageParsers()) {
                if (imageParser2.canAcceptExtension(fileName)) {
                    return imageParser2;
                }
            }
        }
        f$$ExternalSyntheticLambda0.m("Can't parse this format.");
        return null;
    }

    public static Dimension getImageSize(InputStream inputStream, String str, Map<String, Object> map) {
        return getImageSize(new ByteSourceInputStream(inputStream, str), map);
    }

    public static ImageMetadata getMetadata(byte[] bArr, Map<String, Object> map) {
        return getMetadata(new ByteSourceArray(bArr), map);
    }

    public static String getXmpXml(ByteSource byteSource, Map<String, Object> map) {
        Object imageParser = getImageParser(byteSource);
        if (imageParser instanceof XmpEmbeddable) {
            return ((XmpEmbeddable) imageParser).getXmpXml(byteSource, map);
        }
        return null;
    }

    public static ImageFormat guessFormat(ByteSource byteSource) {
        if (byteSource == null) {
            return ImageFormats.UNKNOWN;
        }
        InputStream inputStream = byteSource.getInputStream();
        try {
            int read = inputStream.read();
            int read2 = inputStream.read();
            if (read < 0 || read2 < 0) {
                throw new ImageReadException("Couldn't read magic numbers to guess format.");
            }
            int[] iArr = {read & 255, read2 & 255};
            if (compareBytePair(MAGIC_NUMBERS_GIF, iArr)) {
                ImageFormats imageFormats = ImageFormats.GIF;
                inputStream.close();
                return imageFormats;
            }
            if (compareBytePair(MAGIC_NUMBERS_PNG, iArr)) {
                ImageFormats imageFormats2 = ImageFormats.PNG;
                inputStream.close();
                return imageFormats2;
            }
            if (compareBytePair(MAGIC_NUMBERS_JPEG, iArr)) {
                ImageFormats imageFormats3 = ImageFormats.JPEG;
                inputStream.close();
                return imageFormats3;
            }
            if (compareBytePair(MAGIC_NUMBERS_BMP, iArr)) {
                ImageFormats imageFormats4 = ImageFormats.BMP;
                inputStream.close();
                return imageFormats4;
            }
            if (compareBytePair(MAGIC_NUMBERS_TIFF_MOTOROLA, iArr)) {
                ImageFormats imageFormats5 = ImageFormats.TIFF;
                inputStream.close();
                return imageFormats5;
            }
            if (compareBytePair(MAGIC_NUMBERS_TIFF_INTEL, iArr)) {
                ImageFormats imageFormats6 = ImageFormats.TIFF;
                inputStream.close();
                return imageFormats6;
            }
            if (compareBytePair(MAGIC_NUMBERS_PSD, iArr)) {
                ImageFormats imageFormats7 = ImageFormats.PSD;
                inputStream.close();
                return imageFormats7;
            }
            if (compareBytePair(MAGIC_NUMBERS_PAM, iArr)) {
                ImageFormats imageFormats8 = ImageFormats.PAM;
                inputStream.close();
                return imageFormats8;
            }
            if (compareBytePair(MAGIC_NUMBERS_PBM_A, iArr)) {
                ImageFormats imageFormats9 = ImageFormats.PBM;
                inputStream.close();
                return imageFormats9;
            }
            if (compareBytePair(MAGIC_NUMBERS_PBM_B, iArr)) {
                ImageFormats imageFormats10 = ImageFormats.PBM;
                inputStream.close();
                return imageFormats10;
            }
            if (compareBytePair(MAGIC_NUMBERS_PGM_A, iArr)) {
                ImageFormats imageFormats11 = ImageFormats.PGM;
                inputStream.close();
                return imageFormats11;
            }
            if (compareBytePair(MAGIC_NUMBERS_PGM_B, iArr)) {
                ImageFormats imageFormats12 = ImageFormats.PGM;
                inputStream.close();
                return imageFormats12;
            }
            if (compareBytePair(MAGIC_NUMBERS_PPM_A, iArr)) {
                ImageFormats imageFormats13 = ImageFormats.PPM;
                inputStream.close();
                return imageFormats13;
            }
            if (compareBytePair(MAGIC_NUMBERS_PPM_B, iArr)) {
                ImageFormats imageFormats14 = ImageFormats.PPM;
                inputStream.close();
                return imageFormats14;
            }
            if (compareBytePair(MAGIC_NUMBERS_JBIG2_1, iArr)) {
                int read3 = inputStream.read();
                int read4 = inputStream.read();
                if (read3 < 0 || read4 < 0) {
                    throw new ImageReadException("Couldn't read magic numbers to guess format.");
                }
                if (compareBytePair(MAGIC_NUMBERS_JBIG2_2, new int[]{read3 & 255, read4 & 255})) {
                    ImageFormats imageFormats15 = ImageFormats.JBIG2;
                    inputStream.close();
                    return imageFormats15;
                }
            } else {
                if (compareBytePair(MAGIC_NUMBERS_ICNS, iArr)) {
                    ImageFormats imageFormats16 = ImageFormats.ICNS;
                    inputStream.close();
                    return imageFormats16;
                }
                if (compareBytePair(MAGIC_NUMBERS_DCX, iArr)) {
                    ImageFormats imageFormats17 = ImageFormats.DCX;
                    inputStream.close();
                    return imageFormats17;
                }
                if (compareBytePair(MAGIC_NUMBERS_RGBE, iArr)) {
                    ImageFormats imageFormats18 = ImageFormats.RGBE;
                    inputStream.close();
                    return imageFormats18;
                }
            }
            ImageFormats imageFormats19 = ImageFormats.UNKNOWN;
            inputStream.close();
            return imageFormats19;
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

    public static boolean hasImageFileExtension(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        for (ImageParser imageParser : ImageParser.getAllImageParsers()) {
            for (String str2 : imageParser.getAcceptedExtensions()) {
                if (lowerCase.endsWith(str2.toLowerCase(Locale.ENGLISH))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void writeImage(BufferedImage bufferedImage, OutputStream outputStream, ImageFormat imageFormat, Map<String, Object> map) {
        ImageParser imageParser;
        ImageParser[] allImageParsers = ImageParser.getAllImageParsers();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(ImagingConstants.PARAM_KEY_FORMAT, imageFormat);
        int length = allImageParsers.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                imageParser = null;
                break;
            }
            imageParser = allImageParsers[i];
            if (imageParser.canAcceptType(imageFormat)) {
                break;
            } else {
                i++;
            }
        }
        if (imageParser != null) {
            imageParser.writeImage(bufferedImage, outputStream, map);
        } else {
            throw new ImageWriteException("Unknown Format: " + imageFormat);
        }
    }

    public static byte[] writeImageToBytes(BufferedImage bufferedImage, ImageFormat imageFormat, Map<String, Object> map) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeImage(bufferedImage, byteArrayOutputStream, imageFormat, map);
        return byteArrayOutputStream.toByteArray();
    }

    public static String dumpImageFile(File file) {
        return dumpImageFile(new ByteSourceFile(file));
    }

    public static List<BufferedImage> getAllBufferedImages(byte[] bArr) {
        return getAllBufferedImages(new ByteSourceArray(bArr));
    }

    public static FormatCompliance getFormatCompliance(File file) {
        return getFormatCompliance(new ByteSourceFile(file));
    }

    public static byte[] getICCProfileBytes(byte[] bArr) {
        return getICCProfileBytes(bArr, (Map<String, Object>) null);
    }

    public static Dimension getImageSize(InputStream inputStream, String str) {
        return getImageSize(inputStream, str, null);
    }

    public static ImageMetadata getMetadata(byte[] bArr) {
        return getMetadata(bArr, (Map<String, Object>) null);
    }

    private static String dumpImageFile(ByteSource byteSource) {
        return getImageParser(byteSource).dumpImageFile(byteSource);
    }

    public static List<BufferedImage> getAllBufferedImages(File file) {
        return getAllBufferedImages(new ByteSourceFile(file));
    }

    private static FormatCompliance getFormatCompliance(ByteSource byteSource) {
        return getImageParser(byteSource).getFormatCompliance(byteSource);
    }

    public static byte[] getICCProfileBytes(File file) {
        return getICCProfileBytes(file, (Map<String, Object>) null);
    }

    public static ImageInfo getImageInfo(String str, byte[] bArr, Map<String, Object> map) {
        return getImageInfo(new ByteSourceArray(str, bArr), map);
    }

    public static Dimension getImageSize(byte[] bArr) {
        return getImageSize(bArr, (Map<String, Object>) null);
    }

    public static ImageMetadata getMetadata(InputStream inputStream, String str) {
        return getMetadata(inputStream, str, null);
    }

    private static List<BufferedImage> getAllBufferedImages(ByteSource byteSource) {
        return getImageParser(byteSource).getAllBufferedImages(byteSource);
    }

    public static byte[] getICCProfileBytes(File file, Map<String, Object> map) {
        return getICCProfileBytes(new ByteSourceFile(file), map);
    }

    public static ImageInfo getImageInfo(InputStream inputStream, String str) {
        return getImageInfo(new ByteSourceInputStream(inputStream, str), (Map<String, Object>) null);
    }

    public static Dimension getImageSize(byte[] bArr, Map<String, Object> map) {
        return getImageSize(new ByteSourceArray(bArr), map);
    }

    public static ImageMetadata getMetadata(InputStream inputStream, String str, Map<String, Object> map) {
        return getMetadata(new ByteSourceInputStream(inputStream, str), map);
    }

    private static byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return getImageParser(byteSource).getICCProfileBytes(byteSource, map);
    }

    public static ImageInfo getImageInfo(InputStream inputStream, String str, Map<String, Object> map) {
        return getImageInfo(new ByteSourceInputStream(inputStream, str), map);
    }

    public static Dimension getImageSize(File file) {
        return getImageSize(file, (Map<String, Object>) null);
    }

    public static ImageMetadata getMetadata(File file) {
        return getMetadata(file, (Map<String, Object>) null);
    }

    public static ImageInfo getImageInfo(byte[] bArr) {
        return getImageInfo(new ByteSourceArray(bArr), (Map<String, Object>) null);
    }

    public static Dimension getImageSize(File file, Map<String, Object> map) {
        return getImageSize(new ByteSourceFile(file), map);
    }

    public static ImageMetadata getMetadata(File file, Map<String, Object> map) {
        return getMetadata(new ByteSourceFile(file), map);
    }

    public static ImageInfo getImageInfo(byte[] bArr, Map<String, Object> map) {
        return getImageInfo(new ByteSourceArray(bArr), map);
    }

    public static Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        return getImageParser(byteSource).getImageSize(byteSource, map);
    }

    private static ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return getImageParser(byteSource).getMetadata(byteSource, map);
    }

    public static ImageInfo getImageInfo(File file, Map<String, Object> map) {
        return getImageInfo(new ByteSourceFile(file), map);
    }

    public static ImageInfo getImageInfo(File file) {
        return getImageInfo(file, (Map<String, Object>) null);
    }

    public static String getXmpXml(InputStream inputStream, String str, Map<String, Object> map) {
        return getXmpXml(new ByteSourceInputStream(inputStream, str), map);
    }

    private static ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        return getImageParser(byteSource).getImageInfo(byteSource, map);
    }

    public static String getXmpXml(byte[] bArr) {
        return getXmpXml(bArr, (Map<String, Object>) null);
    }

    public static String getXmpXml(byte[] bArr, Map<String, Object> map) {
        return getXmpXml(new ByteSourceArray(bArr), map);
    }

    public static String getXmpXml(File file) {
        return getXmpXml(file, (Map<String, Object>) null);
    }

    public static String getXmpXml(File file, Map<String, Object> map) {
        return getXmpXml(new ByteSourceFile(file), map);
    }

    public static String getXmpXml(InputStream inputStream, String str) {
        return getXmpXml(inputStream, str, null);
    }

    public static BufferedImage getBufferedImage(InputStream inputStream) {
        return getBufferedImage(inputStream, (Map<String, Object>) null);
    }

    public static BufferedImage getBufferedImage(byte[] bArr) {
        return getBufferedImage(new ByteSourceArray(bArr), (Map<String, Object>) null);
    }

    public static BufferedImage getBufferedImage(byte[] bArr, Map<String, Object> map) {
        return getBufferedImage(new ByteSourceArray(bArr), map);
    }

    public static BufferedImage getBufferedImage(File file) {
        return getBufferedImage(new ByteSourceFile(file), (Map<String, Object>) null);
    }

    public static BufferedImage getBufferedImage(File file, Map<String, Object> map) {
        return getBufferedImage(new ByteSourceFile(file), map);
    }

    public static ICC_Profile getICCProfile(byte[] bArr, Map<String, Object> map) {
        return getICCProfile(new ByteSourceArray(bArr), map);
    }

    private static BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        ImageParser imageParser = getImageParser(byteSource);
        if (map == null) {
            map = new HashMap<>();
        }
        return imageParser.getBufferedImage(byteSource, map);
    }

    public static ICC_Profile getICCProfile(InputStream inputStream, String str) {
        return getICCProfile(inputStream, str, null);
    }

    public static ICC_Profile getICCProfile(InputStream inputStream, String str, Map<String, Object> map) {
        return getICCProfile(new ByteSourceInputStream(inputStream, str), map);
    }

    public static ICC_Profile getICCProfile(File file) {
        return getICCProfile(file, (Map<String, Object>) null);
    }

    public static ICC_Profile getICCProfile(File file, Map<String, Object> map) {
        return getICCProfile(new ByteSourceFile(file), map);
    }

    public static ICC_Profile getICCProfile(byte[] bArr) {
        return getICCProfile(bArr, (Map<String, Object>) null);
    }

    public static boolean hasImageFileExtension(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        return hasImageFileExtension(file.getName());
    }

    public static void writeImage(BufferedImage bufferedImage, File file, ImageFormat imageFormat, Map<String, Object> map) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                writeImage(bufferedImage, bufferedOutputStream, imageFormat, map);
                bufferedOutputStream.close();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static ImageFormat guessFormat(File file) {
        return guessFormat(new ByteSourceFile(file));
    }

    public static ImageFormat guessFormat(byte[] bArr) {
        return guessFormat(new ByteSourceArray(bArr));
    }
}
