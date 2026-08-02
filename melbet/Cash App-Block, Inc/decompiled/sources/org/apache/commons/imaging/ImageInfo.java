package org.apache.commons.imaging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class ImageInfo {
    private static final Logger LOGGER = Logger.getLogger(ImageInfo.class.getName());
    private final int bitsPerPixel;
    private final ColorType colorType;
    private final List<String> comments;
    private final CompressionAlgorithm compressionAlgorithm;

    /* renamed from: format, reason: collision with root package name */
    private final ImageFormat f1548format;
    private final String formatDetails;
    private final String formatName;
    private final int height;
    private final String mimeType;
    private final int numberOfImages;
    private final int physicalHeightDpi;
    private final float physicalHeightInch;
    private final int physicalWidthDpi;
    private final float physicalWidthInch;
    private final boolean progressive;
    private final boolean transparent;
    private final boolean usesPalette;
    private final int width;

    public enum ColorType {
        BW("Black and White"),
        GRAYSCALE("Grayscale"),
        RGB("RGB"),
        CMYK("CMYK"),
        YCbCr("YCbCr"),
        YCCK("YCCK"),
        YCC("YCC"),
        OTHER("Other"),
        UNKNOWN("Unknown");

        private String description;

        ColorType(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public enum CompressionAlgorithm {
        UNKNOWN("Unknown"),
        NONE("None"),
        LZW("LZW"),
        PACKBITS("PackBits"),
        JPEG("JPEG"),
        RLE("RLE: Run-Length Encoding"),
        ADAPTIVE_RLE("Adaptive RLE"),
        PSD("Photoshop"),
        PNG_FILTER("PNG Filter"),
        CCITT_GROUP_3("CCITT Group 3 1-Dimensional Modified Huffman run-length encoding."),
        CCITT_GROUP_4("CCITT Group 4"),
        CCITT_1D("CCITT 1D");

        private String description;

        CompressionAlgorithm(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public ImageInfo(String str, int i, List<String> list, ImageFormat imageFormat, String str2, int i2, String str3, int i3, int i4, float f, int i5, float f2, int i6, boolean z, boolean z2, boolean z3, ColorType colorType, CompressionAlgorithm compressionAlgorithm) {
        this.formatDetails = str;
        this.bitsPerPixel = i;
        this.comments = list;
        this.f1548format = imageFormat;
        this.formatName = str2;
        this.height = i2;
        this.mimeType = str3;
        this.numberOfImages = i3;
        this.physicalHeightDpi = i4;
        this.physicalHeightInch = f;
        this.physicalWidthDpi = i5;
        this.physicalWidthInch = f2;
        this.width = i6;
        this.progressive = z;
        this.transparent = z2;
        this.usesPalette = z3;
        this.colorType = colorType;
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public void dump() {
        LOGGER.fine(toString());
    }

    public int getBitsPerPixel() {
        return this.bitsPerPixel;
    }

    public ColorType getColorType() {
        return this.colorType;
    }

    public List<String> getComments() {
        return new ArrayList(this.comments);
    }

    public CompressionAlgorithm getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public ImageFormat getFormat() {
        return this.f1548format;
    }

    public String getFormatDetails() {
        return this.formatDetails;
    }

    public String getFormatName() {
        return this.formatName;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public int getNumberOfImages() {
        return this.numberOfImages;
    }

    public int getPhysicalHeightDpi() {
        return this.physicalHeightDpi;
    }

    public float getPhysicalHeightInch() {
        return this.physicalHeightInch;
    }

    public int getPhysicalWidthDpi() {
        return this.physicalWidthDpi;
    }

    public float getPhysicalWidthInch() {
        return this.physicalWidthInch;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isProgressive() {
        return this.progressive;
    }

    public boolean isTransparent() {
        return this.transparent;
    }

    public void toString(PrintWriter printWriter, String str) {
        printWriter.println("Format Details: " + this.formatDetails);
        StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Bits Per Pixel: "), this.bitsPerPixel, printWriter, "Comments: ");
        m.append(this.comments.size());
        printWriter.println(m.toString());
        for (int i = 0; i < this.comments.size(); i++) {
            printWriter.println("\t" + i + ": '" + this.comments.get(i) + "'");
        }
        printWriter.println("Format: " + this.f1548format.getName());
        printWriter.println("Format Name: " + this.formatName);
        printWriter.println("Compression Algorithm: " + this.compressionAlgorithm);
        StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Height: "), this.height, printWriter, "MimeType: ");
        m2.append(this.mimeType);
        printWriter.println(m2.toString());
        StringBuilder m3 = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Number Of Images: "), this.numberOfImages, printWriter, "Physical Height Dpi: "), this.physicalHeightDpi, printWriter, "Physical Height Inch: ");
        m3.append(this.physicalHeightInch);
        printWriter.println(m3.toString());
        StringBuilder m4 = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Physical Width Dpi: "), this.physicalWidthDpi, printWriter, "Physical Width Inch: ");
        m4.append(this.physicalWidthInch);
        printWriter.println(m4.toString());
        StringBuilder m5 = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Width: "), this.width, printWriter, "Is Progressive: ");
        m5.append(this.progressive);
        printWriter.println(m5.toString());
        printWriter.println("Is Transparent: " + this.transparent);
        printWriter.println("Color Type: " + this.colorType.toString());
        printWriter.println("Uses Palette: " + this.usesPalette);
        printWriter.flush();
    }

    public boolean usesPalette() {
        return this.usesPalette;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            toString(printWriter, "");
            printWriter.flush();
            return stringWriter.toString();
        } catch (Exception unused) {
            return "Image Data: Error";
        }
    }
}
