package org.apache.commons.imaging.formats.bmp;

/* loaded from: classes9.dex */
class BmpImageContents {
    final BmpHeaderInfo bhi;
    final byte[] colorTable;
    final byte[] imageData;
    final PixelParser pixelParser;

    public BmpImageContents(BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2, PixelParser pixelParser) {
        this.bhi = bmpHeaderInfo;
        this.colorTable = bArr;
        this.imageData = bArr2;
        this.pixelParser = pixelParser;
    }
}
