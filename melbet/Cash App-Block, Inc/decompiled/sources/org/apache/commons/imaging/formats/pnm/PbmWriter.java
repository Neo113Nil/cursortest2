package org.apache.commons.imaging.formats.pnm;

import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes9.dex */
class PbmWriter implements PnmWriter {
    private final boolean rawbits;

    public PbmWriter(boolean z) {
        this.rawbits = z;
    }

    @Override // org.apache.commons.imaging.formats.pnm.PnmWriter
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        outputStream.write(80);
        outputStream.write(this.rawbits ? 52 : 49);
        outputStream.write(32);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        String num = Integer.toString(width);
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write(num.getBytes(charset));
        outputStream.write(32);
        outputStream.write(Integer.toString(height).getBytes(charset));
        outputStream.write(10);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                int rgb = bufferedImage.getRGB(i4, i3);
                int i5 = ((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3 > 127 ? 0 : 1;
                if (this.rawbits) {
                    i = (i << 1) | i5;
                    i2++;
                    if (i2 >= 8) {
                        outputStream.write((byte) i);
                        i = 0;
                        i2 = 0;
                    }
                } else {
                    outputStream.write(Integer.toString(i5).getBytes(StandardCharsets.US_ASCII));
                    outputStream.write(32);
                }
            }
            if (this.rawbits && i2 > 0) {
                outputStream.write((byte) (i << (8 - i2)));
                i = 0;
                i2 = 0;
            }
        }
    }
}
