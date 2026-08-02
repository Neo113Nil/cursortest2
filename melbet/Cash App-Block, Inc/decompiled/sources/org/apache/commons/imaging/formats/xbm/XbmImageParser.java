package org.apache.commons.imaging.formats.xbm;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BasicCParser;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class XbmImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".xbm";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    public static class XbmHeader {
        int height;
        int width;
        int xHot;
        int yHot;

        public XbmHeader(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.xHot = i3;
            this.yHot = i4;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("XbmHeader");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Width: "), this.width, printWriter, "Height: ");
            m.append(this.height);
            printWriter.println(m.toString());
            if (this.xHot == -1 || this.yHot == -1) {
                return;
            }
            StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("X hot: "), this.xHot, printWriter, "Y hot: ");
            m2.append(this.yHot);
            printWriter.println(m2.toString());
        }
    }

    public static class XbmParseResult {
        BasicCParser cParser;
        XbmHeader xbmHeader;

        private XbmParseResult() {
        }
    }

    private static int parseCIntegerLiteral(String str) {
        if (!str.startsWith("0")) {
            return Integer.parseInt(str);
        }
        if (str.length() >= 2) {
            return (str.charAt(1) == 'x' || str.charAt(1) == 'X') ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str.substring(1), 8);
        }
        return 0;
    }

    private XbmParseResult parseXbmHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            HashMap hashMap = new HashMap();
            ByteArrayOutputStream preprocess = BasicCParser.preprocess(inputStream, null, hashMap);
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (str.endsWith("_width")) {
                    i = parseCIntegerLiteral((String) entry.getValue());
                } else if (str.endsWith("_height")) {
                    i2 = parseCIntegerLiteral((String) entry.getValue());
                } else if (str.endsWith("_x_hot")) {
                    i3 = parseCIntegerLiteral((String) entry.getValue());
                } else if (str.endsWith("_y_hot")) {
                    i4 = parseCIntegerLiteral((String) entry.getValue());
                }
            }
            if (i == -1) {
                throw new ImageReadException("width not found");
            }
            if (i2 == -1) {
                throw new ImageReadException("height not found");
            }
            XbmParseResult xbmParseResult = new XbmParseResult();
            xbmParseResult.cParser = new BasicCParser(new ByteArrayInputStream(preprocess.toByteArray()));
            xbmParseResult.xbmHeader = new XbmHeader(i, i2, i3, i4);
            if (inputStream != null) {
                inputStream.close();
            }
            return xbmParseResult;
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

    private static String randomName() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder("a");
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        for (int i = 56; i >= 0; i -= 8) {
            sb.append(Integer.toHexString((int) (255 & (mostSignificantBits >> i))));
        }
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        for (int i2 = 56; i2 >= 0; i2 -= 8) {
            sb.append(Integer.toHexString((int) ((leastSignificantBits >> i2) & 255)));
        }
        return sb.toString();
    }

    private XbmHeader readXbmHeader(ByteSource byteSource) {
        return parseXbmHeader(byteSource).xbmHeader;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BufferedImage readXbmImage(XbmHeader xbmHeader, BasicCParser basicCParser) {
        int i;
        int i2;
        int i3;
        String nextToken;
        if (!"static".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no 'static' token");
            return null;
        }
        String nextToken2 = basicCParser.nextToken();
        if (nextToken2 == null) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no 'unsigned' or 'char' or 'short' token");
            return null;
        }
        if ("unsigned".equals(nextToken2)) {
            nextToken2 = basicCParser.nextToken();
        }
        if ("char".equals(nextToken2)) {
            i = 4;
            i2 = 8;
        } else {
            if (!"short".equals(nextToken2)) {
                f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no 'char' or 'short' token");
                return null;
            }
            i = 6;
            i2 = 16;
        }
        String nextToken3 = basicCParser.nextToken();
        if (nextToken3 == null) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no variable name");
            return null;
        }
        if (nextToken3.charAt(0) != '_' && !Character.isLetter(nextToken3.charAt(0))) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, variable name doesn't start with letter or underscore");
            return null;
        }
        for (int i4 = 0; i4 < nextToken3.length(); i4++) {
            char charAt = nextToken3.charAt(i4);
            if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, variable name contains non-letter non-digit non-underscore");
                return null;
            }
        }
        if (!"[".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no '[' token");
            return null;
        }
        if (!"]".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no ']' token");
            return null;
        }
        if (!"=".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no '=' token");
            return null;
        }
        if (!"{".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, no '{' token");
            return null;
        }
        int i5 = ((xbmHeader.width + 7) / 8) * xbmHeader.height;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < xbmHeader.height; i7++) {
            for (int i8 = 0; i8 < xbmHeader.width; i8 += i2) {
                String nextToken4 = basicCParser.nextToken();
                if (nextToken4 == null || !nextToken4.startsWith("0x")) {
                    f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, hex value missing");
                    return null;
                }
                if (nextToken4.length() > i) {
                    f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, hex value too long");
                    return null;
                }
                int reverse = Integer.reverse(Integer.parseInt(nextToken4.substring(2), 16)) >>> (32 - i2);
                if (i2 == 16) {
                    i3 = i6 + 1;
                    bArr[i6] = (byte) (reverse >>> 8);
                    if (i8 + 8 < xbmHeader.width) {
                        i6 += 2;
                        bArr[i3] = (byte) reverse;
                        nextToken = basicCParser.nextToken();
                        if (nextToken != null) {
                            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, premature end of file");
                            return null;
                        }
                        if (!",".equals(nextToken) && (i6 < i5 || !"}".equals(nextToken))) {
                            f$$ExternalSyntheticLambda0.m("Parsing XBM file failed, punctuation error");
                            return null;
                        }
                    }
                } else {
                    i3 = i6 + 1;
                    bArr[i6] = (byte) reverse;
                }
                i6 = i3;
                nextToken = basicCParser.nextToken();
                if (nextToken != null) {
                }
            }
        }
        IndexColorModel indexColorModel = new IndexColorModel(1, 2, new int[]{16777215, 0}, 0, false, -1, 0);
        return new BufferedImage(indexColorModel, Raster.createPackedRaster(new DataBufferByte(bArr, i5), xbmHeader.width, xbmHeader.height, 1, (Point) null), indexColorModel.isAlphaPremultiplied(), new Properties());
    }

    private static String toPrettyHex(int i) {
        String hexString = Integer.toHexString(i & 255);
        return hexString.length() == 2 ? "0x".concat(hexString) : "0x0".concat(hexString);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        readXbmHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.XBM};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        XbmParseResult parseXbmHeader = parseXbmHeader(byteSource);
        return readXbmImage(parseXbmHeader.xbmHeader, parseXbmHeader.cParser);
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
        XbmHeader readXbmHeader = readXbmHeader(byteSource);
        return new ImageInfo("XBM", 1, new ArrayList(), ImageFormats.XBM, "X BitMap", readXbmHeader.height, "image/x-xbitmap", 1, 0, RecyclerView.DECELERATION_RATE, 0, RecyclerView.DECELERATION_RATE, readXbmHeader.width, false, false, false, ImageInfo.ColorType.BW, ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        XbmHeader readXbmHeader = readXbmHeader(byteSource);
        return new Dimension(readXbmHeader.width, readXbmHeader.height);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "X BitMap";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        String randomName = randomName();
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(bufferedImage.getWidth(), "\n", JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("#define ", randomName, "_width "));
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write(m.getBytes(charset));
        outputStream.write(("#define " + randomName + "_height " + bufferedImage.getHeight() + "\n").getBytes(charset));
        StringBuilder sb = new StringBuilder("static unsigned char ");
        sb.append(randomName);
        sb.append("_bits[] = {");
        outputStream.write(sb.toString().getBytes(charset));
        String str = "\n  ";
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < bufferedImage.getHeight(); i4++) {
            for (int i5 = 0; i5 < bufferedImage.getWidth(); i5++) {
                int rgb = bufferedImage.getRGB(i5, i4);
                i |= (((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3 > 127 ? 0 : 1) << i2;
                i2++;
                if (i2 == 8) {
                    Charset charset2 = StandardCharsets.US_ASCII;
                    outputStream.write(str.getBytes(charset2));
                    if (i3 == 12) {
                        outputStream.write("\n  ".getBytes(charset2));
                        i3 = 0;
                    }
                    outputStream.write(toPrettyHex(i).getBytes(charset2));
                    i3++;
                    i = 0;
                    i2 = 0;
                    str = ",";
                }
            }
            if (i2 != 0) {
                Charset charset3 = StandardCharsets.US_ASCII;
                outputStream.write(str.getBytes(charset3));
                if (i3 == 12) {
                    outputStream.write("\n  ".getBytes(charset3));
                    i3 = 0;
                }
                outputStream.write(toPrettyHex(i).getBytes(charset3));
                i3++;
                i = 0;
                i2 = 0;
                str = ",";
            }
        }
        outputStream.write("\n};\n".getBytes(StandardCharsets.US_ASCII));
    }
}
