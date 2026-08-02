package org.apache.commons.imaging.palette;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.awt.image.BufferedImage;

/* loaded from: classes9.dex */
public final class Dithering {
    private Dithering() {
    }

    private static int adjustPixel(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 255;
        int m$2 = Boxes$$ExternalSyntheticOutline1.m$2(i2, i6, 16, (i >> 24) & 255);
        int m$22 = Boxes$$ExternalSyntheticOutline1.m$2(i3, i6, 16, (i >> 16) & 255);
        int m$23 = Boxes$$ExternalSyntheticOutline1.m$2(i4, i6, 16, (i >> 8) & 255);
        int m$24 = Boxes$$ExternalSyntheticOutline1.m$2(i5, i6, 16, i & 255);
        if (m$2 < 0) {
            m$2 = 0;
        } else if (m$2 > 255) {
            m$2 = 255;
        }
        if (m$22 < 0) {
            m$22 = 0;
        } else if (m$22 > 255) {
            m$22 = 255;
        }
        if (m$23 < 0) {
            m$23 = 0;
        } else if (m$23 > 255) {
            m$23 = 255;
        }
        if (m$24 < 0) {
            i7 = 0;
        } else if (m$24 <= 255) {
            i7 = m$24;
        }
        return (m$2 << 24) | (m$22 << 16) | (m$23 << 8) | i7;
    }

    public static void applyFloydSteinbergDithering(BufferedImage bufferedImage, Palette palette) {
        for (int i = 0; i < bufferedImage.getHeight(); i++) {
            int i2 = 0;
            while (i2 < bufferedImage.getWidth()) {
                int rgb = bufferedImage.getRGB(i2, i);
                int entry = palette.getEntry(palette.getPaletteIndex(rgb));
                bufferedImage.setRGB(i2, i, entry);
                int i3 = ((rgb >> 24) & 255) - ((entry >> 24) & 255);
                int i4 = ((rgb >> 16) & 255) - ((entry >> 16) & 255);
                int i5 = ((rgb >> 8) & 255) - ((entry >> 8) & 255);
                int i6 = (rgb & 255) - (entry & 255);
                int i7 = i2 + 1;
                if (i7 < bufferedImage.getWidth()) {
                    bufferedImage.setRGB(i7, i, adjustPixel(bufferedImage.getRGB(i7, i), i3, i4, i5, i6, 7));
                    int i8 = i + 1;
                    if (i8 < bufferedImage.getHeight()) {
                        bufferedImage.setRGB(i7, i8, adjustPixel(bufferedImage.getRGB(i7, i8), i3, i4, i5, i6, 1));
                    }
                }
                int i9 = i + 1;
                if (i9 < bufferedImage.getHeight()) {
                    bufferedImage.setRGB(i2, i9, adjustPixel(bufferedImage.getRGB(i2, i9), i3, i4, i5, i6, 5));
                    int i10 = i2 - 1;
                    if (i10 >= 0) {
                        bufferedImage.setRGB(i10, i9, adjustPixel(bufferedImage.getRGB(i10, i9), i3, i4, i5, i6, 3));
                    }
                }
                i2 = i7;
            }
        }
    }
}
