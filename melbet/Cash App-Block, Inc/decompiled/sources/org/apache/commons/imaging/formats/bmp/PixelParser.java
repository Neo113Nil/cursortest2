package org.apache.commons.imaging.formats.bmp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
abstract class PixelParser {
    final BmpHeaderInfo bhi;
    final byte[] colorTable;
    final byte[] imageData;
    final InputStream is;

    public PixelParser(BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        this.bhi = bmpHeaderInfo;
        this.colorTable = bArr;
        this.imageData = bArr2;
        this.is = new ByteArrayInputStream(bArr2);
    }

    public int getColorTableRGB(int i) {
        int i2 = i * 4;
        byte[] bArr = this.colorTable;
        return ((bArr[i2 + 2] & 255) << 16) | (-16777216) | ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public abstract void processImage(ImageBuilder imageBuilder);
}
