package org.apache.commons.imaging.formats.pnm;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes9.dex */
class PamWriter implements PnmWriter {
    @Override // org.apache.commons.imaging.formats.pnm.PnmWriter
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        outputStream.write(80);
        outputStream.write(55);
        outputStream.write(10);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(width, "WIDTH ");
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write(m.getBytes(charset));
        outputStream.write(10);
        outputStream.write(("HEIGHT " + height).getBytes(charset));
        outputStream.write(10);
        outputStream.write("DEPTH 4".getBytes(charset));
        outputStream.write(10);
        outputStream.write("MAXVAL 255".getBytes(charset));
        outputStream.write(10);
        outputStream.write("TUPLTYPE RGB_ALPHA".getBytes(charset));
        outputStream.write(10);
        outputStream.write("ENDHDR".getBytes(charset));
        outputStream.write(10);
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                outputStream.write((byte) ((rgb >> 16) & 255));
                outputStream.write((byte) ((rgb >> 8) & 255));
                outputStream.write((byte) (rgb & 255));
                outputStream.write((byte) ((rgb >> 24) & 255));
            }
        }
    }
}
