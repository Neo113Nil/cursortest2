package org.apache.commons.imaging.formats.pnm;

import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes9.dex */
class PgmWriter implements PnmWriter {
    private final boolean rawbits;

    public PgmWriter(boolean z) {
        this.rawbits = z;
    }

    @Override // org.apache.commons.imaging.formats.pnm.PnmWriter
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        outputStream.write(80);
        outputStream.write(this.rawbits ? 53 : 50);
        outputStream.write(32);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        String num = Integer.toString(width);
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write(num.getBytes(charset));
        outputStream.write(32);
        outputStream.write(Integer.toString(height).getBytes(charset));
        outputStream.write(32);
        outputStream.write(Integer.toString(255).getBytes(charset));
        outputStream.write(10);
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                int i3 = ((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3;
                if (this.rawbits) {
                    outputStream.write((byte) i3);
                } else {
                    outputStream.write(Integer.toString(i3).getBytes(StandardCharsets.US_ASCII));
                    outputStream.write(32);
                }
            }
        }
    }
}
