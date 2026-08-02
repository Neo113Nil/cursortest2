package org.apache.commons.imaging.formats.png;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;

/* loaded from: classes9.dex */
class ScanExpediterInterlaced extends ScanExpediter {
    private static final int[] STARTING_ROW = {0, 0, 4, 0, 2, 0, 1};
    private static final int[] STARTING_COL = {0, 4, 0, 2, 0, 1, 0};
    private static final int[] ROW_INCREMENT = {8, 8, 8, 4, 4, 2, 2};
    private static final int[] COL_INCREMENT = {8, 8, 4, 4, 2, 2, 1};

    public ScanExpediterInterlaced(int i, int i2, InputStream inputStream, BufferedImage bufferedImage, PngColorType pngColorType, int i3, int i4, PngChunkPlte pngChunkPlte, GammaCorrection gammaCorrection, TransparencyFilter transparencyFilter) {
        super(i, i2, inputStream, bufferedImage, pngColorType, i3, i4, pngChunkPlte, gammaCorrection, transparencyFilter);
    }

    private void visit(int i, int i2, BufferedImage bufferedImage, BitParser bitParser, int i3) {
        bufferedImage.setRGB(i, i2, getRGB(bitParser, i3));
    }

    @Override // org.apache.commons.imaging.formats.png.ScanExpediter
    public void drive() {
        for (int i = 1; i <= 7; i++) {
            int i2 = i - 1;
            byte[] bArr = null;
            int i3 = STARTING_ROW[i2];
            while (i3 < this.height) {
                int i4 = STARTING_COL[i2];
                int i5 = this.width;
                if (i4 < i5) {
                    bArr = this.getNextScanline(this.is, this.getBitsToBytesRoundingUp(this.bitsPerPixel * ((((i5 - i4) - 1) / COL_INCREMENT[i2]) + 1)), bArr, this.bytesPerPixel);
                    BitParser bitParser = new BitParser(bArr, this.bitsPerPixel, this.bitDepth);
                    int i6 = i4;
                    int i7 = 0;
                    while (i6 < this.width) {
                        ScanExpediterInterlaced scanExpediterInterlaced = this;
                        scanExpediterInterlaced.visit(i6, i3, this.bi, bitParser, i7);
                        i6 += COL_INCREMENT[i2];
                        i7++;
                        this = scanExpediterInterlaced;
                    }
                }
                i3 += ROW_INCREMENT[i2];
                this = this;
            }
        }
    }
}
