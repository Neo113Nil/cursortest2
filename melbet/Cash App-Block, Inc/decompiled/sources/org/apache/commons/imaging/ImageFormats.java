package org.apache.commons.imaging;

/* loaded from: classes9.dex */
public enum ImageFormats implements ImageFormat {
    UNKNOWN,
    BMP,
    DCX,
    GIF,
    ICNS,
    ICO,
    JBIG2,
    JPEG,
    PAM,
    PSD,
    PBM,
    PGM,
    PNM,
    PPM,
    PCX,
    PNG,
    RGBE,
    TGA,
    TIFF,
    WBMP,
    XBM,
    XPM;

    @Override // org.apache.commons.imaging.ImageFormat
    public String getExtension() {
        return name();
    }

    @Override // org.apache.commons.imaging.ImageFormat
    public String getName() {
        return name();
    }
}
