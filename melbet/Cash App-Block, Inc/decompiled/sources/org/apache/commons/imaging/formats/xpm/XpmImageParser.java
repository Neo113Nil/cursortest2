package org.apache.commons.imaging.formats.xpm;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
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
import org.apache.commons.imaging.palette.ColorGroup$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.palette.PaletteFactory;
import org.apache.commons.imaging.palette.SimplePalette;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public class XpmImageParser extends ImageParser {
    private static Map<String, Integer> colorNames;
    private static final String DEFAULT_EXTENSION = ".xpm";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};
    private static final char[] WRITE_PALETTE = {' ', '.', 'X', 'o', 'O', '+', '@', '#', '$', '%', '&', '*', '=', '-', ';', ':', '>', ',', '<', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'M', 'N', 'B', 'V', 'C', Matrix.MATRIX_TYPE_ZERO, 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'P', 'I', Matrix.MATRIX_TYPE_RANDOM_UT, 'Y', 'T', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'E', 'W', 'Q', '!', '~', '^', '/', '(', ')', '_', '`', '\'', ']', '[', '{', '}', '|'};

    public static class PaletteEntry {
        int colorArgb;
        int gray4LevelArgb;
        int grayArgb;
        boolean haveColor;
        boolean haveGray;
        boolean haveGray4Level;
        boolean haveMono;
        int index;
        int monoArgb;

        private PaletteEntry() {
            this.haveColor = false;
            this.haveGray = false;
            this.haveGray4Level = false;
            this.haveMono = false;
        }

        public int getBestARGB() {
            if (this.haveColor) {
                return this.colorArgb;
            }
            if (this.haveGray) {
                return this.grayArgb;
            }
            if (this.haveGray4Level) {
                return this.gray4LevelArgb;
            }
            if (this.haveMono) {
                return this.monoArgb;
            }
            return 0;
        }
    }

    public static class XpmHeader {
        int height;
        int numCharsPerPixel;
        int numColors;
        Map<Object, PaletteEntry> palette = new HashMap();
        int width;
        int xHotSpot;
        boolean xpmExt;
        int yHotSpot;

        public XpmHeader(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this.xHotSpot = -1;
            this.yHotSpot = -1;
            this.width = i;
            this.height = i2;
            this.numColors = i3;
            this.numCharsPerPixel = i4;
            this.xHotSpot = i5;
            this.yHotSpot = i6;
            this.xpmExt = z;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("XpmHeader");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Width: "), this.width, printWriter, "Height: "), this.height, printWriter, "NumColors: "), this.numColors, printWriter, "NumCharsPerPixel: ");
            m.append(this.numCharsPerPixel);
            printWriter.println(m.toString());
            if (this.xHotSpot != -1 && this.yHotSpot != -1) {
                StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("X hotspot: "), this.xHotSpot, printWriter, "Y hotspot: ");
                m2.append(this.yHotSpot);
                printWriter.println(m2.toString());
            }
            printWriter.println("XpmExt: " + this.xpmExt);
        }
    }

    public static class XpmParseResult {
        BasicCParser cParser;
        XpmHeader xpmHeader;

        private XpmParseResult() {
        }
    }

    private static void loadColorNames() {
        synchronized (XpmImageParser.class) {
            if (colorNames != null) {
                return;
            }
            try {
                InputStream resourceAsStream = XpmImageParser.class.getResourceAsStream("rgb.txt");
                if (resourceAsStream == null) {
                    throw new ImageReadException("Couldn't find rgb.txt in our resources");
                }
                HashMap hashMap = new HashMap();
                InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream, StandardCharsets.US_ASCII);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                bufferedReader.close();
                                inputStreamReader.close();
                                colorNames = hashMap;
                                return;
                            } else if (readLine.charAt(0) != '!') {
                                try {
                                    int parseInt = Integer.parseInt(readLine.substring(0, 3).trim());
                                    int parseInt2 = Integer.parseInt(readLine.substring(4, 7).trim());
                                    hashMap.put(readLine.substring(11).trim().toLowerCase(Locale.ENGLISH), Integer.valueOf((parseInt << 16) | (-16777216) | (parseInt2 << 8) | Integer.parseInt(readLine.substring(8, 11).trim())));
                                } catch (NumberFormatException e) {
                                    throw new ImageReadException("Couldn't parse color in rgb.txt", e);
                                }
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                throw new ImageReadException("Could not parse rgb.txt", e2);
            }
        }
    }

    private int parseColor(String str) {
        if (str.charAt(0) != '#') {
            if (str.charAt(0) == '%') {
                f$$ExternalSyntheticLambda0.m("HSV colors are not implemented even in the XPM specification!");
                return 0;
            }
            if ("None".equals(str)) {
                return 0;
            }
            loadColorNames();
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (colorNames.containsKey(lowerCase)) {
                return colorNames.get(lowerCase).intValue();
            }
            return 0;
        }
        String substring = str.substring(1);
        if (substring.length() == 3) {
            return (Integer.parseInt(substring.substring(0, 1), 16) << 20) | (-16777216) | (Integer.parseInt(substring.substring(1, 2), 16) << 12) | (Integer.parseInt(substring.substring(2, 3), 16) << 4);
        }
        if (substring.length() == 6) {
            return Integer.parseInt(substring, 16) | (-16777216);
        }
        if (substring.length() == 9) {
            return (Integer.parseInt(substring.substring(0, 1), 16) << 16) | (-16777216) | (Integer.parseInt(substring.substring(3, 4), 16) << 8) | Integer.parseInt(substring.substring(6, 7), 16);
        }
        if (substring.length() == 12) {
            return (Integer.parseInt(substring.substring(0, 1), 16) << 16) | (-16777216) | (Integer.parseInt(substring.substring(4, 5), 16) << 8) | Integer.parseInt(substring.substring(8, 9), 16);
        }
        if (substring.length() != 24) {
            return 0;
        }
        return (Integer.parseInt(substring.substring(0, 1), 16) << 16) | (-16777216) | (Integer.parseInt(substring.substring(8, 9), 16) << 8) | Integer.parseInt(substring.substring(16, 17), 16);
    }

    private boolean parseNextString(BasicCParser basicCParser, StringBuilder sb) {
        String nextToken;
        sb.setLength(0);
        String nextToken2 = basicCParser.nextToken();
        if (nextToken2.charAt(0) != '\"') {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no string found where expected");
            return false;
        }
        BasicCParser.unescapeString(sb, nextToken2);
        while (true) {
            nextToken = basicCParser.nextToken();
            if (nextToken.charAt(0) != '\"') {
                break;
            }
            BasicCParser.unescapeString(sb, nextToken);
        }
        if (",".equals(nextToken)) {
            return true;
        }
        if ("}".equals(nextToken)) {
            return false;
        }
        f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no ',' or '}' found where expected");
        return false;
    }

    private void parsePaletteEntries(XpmHeader xpmHeader, BasicCParser basicCParser) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < xpmHeader.numColors; i++) {
            sb.setLength(0);
            if (!parseNextString(basicCParser, sb)) {
                f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, file ended while reading palette");
                return;
            }
            String substring = sb.substring(0, xpmHeader.numCharsPerPixel);
            String[] strArr = BasicCParser.tokenizeRow(sb.substring(xpmHeader.numCharsPerPixel));
            PaletteEntry paletteEntry = new PaletteEntry();
            paletteEntry.index = i;
            StringBuilder sb2 = new StringBuilder();
            int i2 = PKIFailureInfo.systemUnavail;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str = strArr[i3];
                if ((i2 < i3 - 1 && "m".equals(str)) || "g4".equals(str) || "g".equals(str) || "c".equals(str) || "s".equals(str)) {
                    if (i2 >= 0) {
                        String str2 = strArr[i2];
                        String sb3 = sb2.toString();
                        sb2.setLength(0);
                        populatePaletteEntry(paletteEntry, str2, sb3);
                    }
                    i2 = i3;
                } else {
                    if (i2 < 0) {
                        break;
                    }
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(str);
                }
            }
            if (i2 >= 0 && sb2.length() > 0) {
                String str3 = strArr[i2];
                String sb4 = sb2.toString();
                sb2.setLength(0);
                populatePaletteEntry(paletteEntry, str3, sb4);
            }
            xpmHeader.palette.put(substring, paletteEntry);
        }
    }

    private XpmHeader parseXpmHeader(BasicCParser basicCParser) {
        if (!"static".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no 'static' token");
            return null;
        }
        if (!"char".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no 'char' token");
            return null;
        }
        if (!Marker.ANY_MARKER.equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no '*' token");
            return null;
        }
        String nextToken = basicCParser.nextToken();
        if (nextToken == null) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no variable name");
            return null;
        }
        if (nextToken.charAt(0) != '_' && !Character.isLetter(nextToken.charAt(0))) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, variable name doesn't start with letter or underscore");
            return null;
        }
        for (int i = 0; i < nextToken.length(); i++) {
            char charAt = nextToken.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, variable name contains non-letter non-digit non-underscore");
                return null;
            }
        }
        if (!"[".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no '[' token");
            return null;
        }
        if (!"]".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no ']' token");
            return null;
        }
        if (!"=".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no '=' token");
            return null;
        }
        if (!"{".equals(basicCParser.nextToken())) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, no '{' token");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (!parseNextString(basicCParser, sb)) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, file too short");
            return null;
        }
        XpmHeader parseXpmValuesSection = parseXpmValuesSection(sb.toString());
        parsePaletteEntries(parseXpmValuesSection, basicCParser);
        return parseXpmValuesSection;
    }

    private XpmHeader parseXpmValuesSection(String str) {
        int i;
        int i2;
        boolean z;
        String[] strArr = BasicCParser.tokenizeRow(str);
        if (strArr.length < 4 || strArr.length > 7) {
            f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, <Values> section has incorrect tokens");
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[0]);
            int parseInt2 = Integer.parseInt(strArr[1]);
            int parseInt3 = Integer.parseInt(strArr[2]);
            int parseInt4 = Integer.parseInt(strArr[3]);
            if (strArr.length >= 6) {
                int parseInt5 = Integer.parseInt(strArr[4]);
                i = Integer.parseInt(strArr[5]);
                i2 = parseInt5;
            } else {
                i = -1;
                i2 = -1;
            }
            if (strArr.length != 5 && strArr.length != 7) {
                z = false;
                return new XpmHeader(parseInt, parseInt2, parseInt3, parseInt4, i2, i, z);
            }
            if (!"XPMEXT".equals(strArr[strArr.length - 1])) {
                throw new ImageReadException("Parsing XPM file failed, can't parse <Values> section XPMEXT");
            }
            z = true;
            return new XpmHeader(parseInt, parseInt2, parseInt3, parseInt4, i2, i, z);
        } catch (NumberFormatException e) {
            throw new ImageReadException("Parsing XPM file failed, error parsing <Values> section", e);
        }
    }

    private String pixelsForIndex(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 *= WRITE_PALETTE.length;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i / i3;
            i -= i6 * i3;
            char[] cArr = WRITE_PALETTE;
            i3 /= cArr.length;
            sb.append(cArr[i6]);
        }
        return sb.toString();
    }

    private void populatePaletteEntry(PaletteEntry paletteEntry, String str, String str2) {
        if ("m".equals(str)) {
            paletteEntry.monoArgb = parseColor(str2);
            paletteEntry.haveMono = true;
            return;
        }
        if ("g4".equals(str)) {
            paletteEntry.gray4LevelArgb = parseColor(str2);
            paletteEntry.haveGray4Level = true;
            return;
        }
        if ("g".equals(str)) {
            paletteEntry.grayArgb = parseColor(str2);
            paletteEntry.haveGray = true;
        } else if ("s".equals(str)) {
            paletteEntry.colorArgb = parseColor(str2);
            paletteEntry.haveColor = true;
        } else if ("c".equals(str)) {
            paletteEntry.colorArgb = parseColor(str2);
            paletteEntry.haveColor = true;
        }
    }

    private String randomName() {
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

    private XpmHeader readXpmHeader(ByteSource byteSource) {
        return parseXpmHeader(byteSource).xpmHeader;
    }

    private BufferedImage readXpmImage(XpmHeader xpmHeader, BasicCParser basicCParser) {
        WritableRaster createPackedRaster;
        char c;
        IndexColorModel indexColorModel;
        int size = xpmHeader.palette.size();
        Map<Object, PaletteEntry> map = xpmHeader.palette;
        BufferedImage bufferedImage = null;
        if (size <= 256) {
            int[] iArr = new int[map.size()];
            Iterator<Map.Entry<Object, PaletteEntry>> it = xpmHeader.palette.entrySet().iterator();
            while (it.hasNext()) {
                PaletteEntry value = it.next().getValue();
                iArr[value.index] = value.getBestARGB();
            }
            indexColorModel = new IndexColorModel(8, xpmHeader.palette.size(), iArr, 0, true, -1, 0);
            createPackedRaster = Raster.createInterleavedRaster(0, xpmHeader.width, xpmHeader.height, 1, (Point) null);
            c = '\b';
        } else if (map.size() <= 65536) {
            int[] iArr2 = new int[xpmHeader.palette.size()];
            Iterator<Map.Entry<Object, PaletteEntry>> it2 = xpmHeader.palette.entrySet().iterator();
            while (it2.hasNext()) {
                PaletteEntry value2 = it2.next().getValue();
                iArr2[value2.index] = value2.getBestARGB();
            }
            indexColorModel = new IndexColorModel(16, xpmHeader.palette.size(), iArr2, 0, true, -1, 1);
            createPackedRaster = Raster.createInterleavedRaster(1, xpmHeader.width, xpmHeader.height, 1, (Point) null);
            c = 16;
        } else {
            IndexColorModel directColorModel = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
            createPackedRaster = Raster.createPackedRaster(3, xpmHeader.width, xpmHeader.height, new int[]{16711680, 65280, 255, -16777216}, (Point) null);
            c = ' ';
            indexColorModel = directColorModel;
        }
        BufferedImage bufferedImage2 = new BufferedImage(indexColorModel, createPackedRaster, indexColorModel.isAlphaPremultiplied(), new Properties());
        DataBuffer dataBuffer = createPackedRaster.getDataBuffer();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i < xpmHeader.height; i++) {
            sb.setLength(0);
            z = parseNextString(basicCParser, sb);
            if (i < xpmHeader.height - 1 && !z) {
                f$$ExternalSyntheticLambda0.m("Parsing XPM file failed, insufficient image rows in file");
                return bufferedImage;
            }
            int i2 = xpmHeader.width * i;
            int i3 = 0;
            while (i3 < xpmHeader.width) {
                int i4 = xpmHeader.numCharsPerPixel;
                BufferedImage bufferedImage3 = bufferedImage;
                int i5 = i3 + 1;
                String substring = sb.substring(i3 * i4, i4 * i5);
                PaletteEntry paletteEntry = xpmHeader.palette.get(substring);
                if (paletteEntry == null) {
                    throw new ImageReadException(Recorder$$ExternalSyntheticOutline2.m("No palette entry was defined for ", substring));
                }
                if (c <= 16) {
                    dataBuffer.setElem(i3 + i2, paletteEntry.index);
                } else {
                    dataBuffer.setElem(i3 + i2, paletteEntry.getBestARGB());
                }
                bufferedImage = bufferedImage3;
                i3 = i5;
            }
        }
        BufferedImage bufferedImage4 = bufferedImage;
        while (z) {
            sb.setLength(0);
            z = parseNextString(basicCParser, sb);
        }
        if (";".equals(basicCParser.nextToken())) {
            return bufferedImage2;
        }
        f$$ExternalSyntheticLambda0.m("Last token wasn't ';'");
        return bufferedImage4;
    }

    private String toColor(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.length() >= 6) {
            return "#".concat(hexString);
        }
        char[] cArr = new char[6 - hexString.length()];
        Arrays.fill(cArr, '0');
        return "#" + new String(cArr) + hexString;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        readXpmHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.XPM};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        XpmParseResult parseXpmHeader = parseXpmHeader(byteSource);
        return readXpmImage(parseXpmHeader.xpmHeader, parseXpmHeader.cParser);
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
        XpmHeader readXpmHeader = readXpmHeader(byteSource);
        ImageInfo.ColorType colorType = ImageInfo.ColorType.BW;
        Iterator<Map.Entry<Object, PaletteEntry>> it = readXpmHeader.palette.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            PaletteEntry value = it.next().getValue();
            if ((value.getBestARGB() & (-16777216)) != -16777216) {
                z = true;
            }
            if (value.haveColor) {
                colorType = ImageInfo.ColorType.RGB;
            } else if (colorType != ImageInfo.ColorType.RGB && (value.haveGray || value.haveGray4Level)) {
                colorType = ImageInfo.ColorType.GRAYSCALE;
            }
        }
        return new ImageInfo("XPM version 3", readXpmHeader.numCharsPerPixel * 8, new ArrayList(), ImageFormats.XPM, "X PixMap", readXpmHeader.height, "image/x-xpixmap", 1, 0, RecyclerView.DECELERATION_RATE, 0, RecyclerView.DECELERATION_RATE, readXpmHeader.width, false, z, true, colorType, ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        XpmHeader readXpmHeader = readXpmHeader(byteSource);
        return new Dimension(readXpmHeader.width, readXpmHeader.height);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "X PixMap";
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
        PaletteFactory paletteFactory = new PaletteFactory();
        int i = 1;
        boolean hasTransparency = paletteFactory.hasTransparency(bufferedImage, 1);
        int length = WRITE_PALETTE.length;
        SimplePalette simplePalette = null;
        while (simplePalette == null) {
            simplePalette = paletteFactory.makeExactRgbPaletteSimple(bufferedImage, hasTransparency ? length - 1 : length);
            char[] cArr = WRITE_PALETTE;
            int i2 = i + 1;
            long j = i2;
            if (cArr.length * length > 2147483647L) {
                ColorGroup$$ExternalSyntheticBUOutline0.m("Xpm: Can't write images with more than Integer.MAX_VALUE colors.");
                return;
            } else if (j > 2147483647L) {
                ColorGroup$$ExternalSyntheticBUOutline0.m("Xpm: Can't write images with more than Integer.MAX_VALUE chars per pixel.");
                return;
            } else if (simplePalette == null) {
                length *= cArr.length;
                i = i2;
            }
        }
        int length2 = simplePalette.length();
        if (hasTransparency) {
            length2++;
        }
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write("/* XPM */\n".getBytes(charset));
        outputStream.write(("static char *" + randomName() + "[] = {\n").getBytes(charset));
        StringBuilder sb = new StringBuilder("\"");
        sb.append(bufferedImage.getWidth());
        sb.append(" ");
        Recorder$$ExternalSyntheticOutline1.m105m(bufferedImage.getHeight(), length2, " ", " ", sb);
        sb.append(i);
        sb.append("\",\n");
        outputStream.write(sb.toString().getBytes(charset));
        int i3 = 0;
        while (i3 < length2) {
            outputStream.write(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("\""), pixelsForIndex(i3, i), " c ", i3 < simplePalette.length() ? toColor(simplePalette.getEntry(i3)) : "None", "\",\n").getBytes(StandardCharsets.US_ASCII));
            i3++;
        }
        String str = "";
        int i4 = 0;
        while (i4 < bufferedImage.getHeight()) {
            Charset charset2 = StandardCharsets.US_ASCII;
            outputStream.write(str.getBytes(charset2));
            outputStream.write("\"".getBytes(charset2));
            for (int i5 = 0; i5 < bufferedImage.getWidth(); i5++) {
                int rgb = bufferedImage.getRGB(i5, i4);
                outputStream.write((((-16777216) & rgb) == 0 ? pixelsForIndex(simplePalette.length(), i) : pixelsForIndex(simplePalette.getPaletteIndex(rgb & 16777215), i)).getBytes(StandardCharsets.US_ASCII));
            }
            outputStream.write("\"".getBytes(StandardCharsets.US_ASCII));
            i4++;
            str = ",\n";
        }
        outputStream.write("\n};\n".getBytes(StandardCharsets.US_ASCII));
    }

    private XpmParseResult parseXpmHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            StringBuilder sb = new StringBuilder();
            ByteArrayOutputStream preprocess = BasicCParser.preprocess(inputStream, sb, null);
            if ("XPM".equals(sb.toString().trim())) {
                XpmParseResult xpmParseResult = new XpmParseResult();
                BasicCParser basicCParser = new BasicCParser(new ByteArrayInputStream(preprocess.toByteArray()));
                xpmParseResult.cParser = basicCParser;
                xpmParseResult.xpmHeader = parseXpmHeader(basicCParser);
                if (inputStream != null) {
                    inputStream.close();
                }
                return xpmParseResult;
            }
            throw new ImageReadException("Parsing XPM file failed, signature isn't '/* XPM */'");
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
