package org.apache.commons.imaging.formats.bmp;

import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
abstract class PixelParserSimple extends PixelParser {
    public PixelParserSimple(BmpHeaderInfo bmpHeaderInfo, byte[] bArr, byte[] bArr2) {
        super(bmpHeaderInfo, bArr, bArr2);
    }

    public abstract int getNextRGB();

    public abstract void newline();

    @Override // org.apache.commons.imaging.formats.bmp.PixelParser
    public void processImage(ImageBuilder imageBuilder) {
        for (int i = this.bhi.height - 1; i >= 0; i--) {
            for (int i2 = 0; i2 < this.bhi.width; i2++) {
                imageBuilder.setRGB(i2, i, getNextRGB());
            }
            newline();
        }
    }
}
