package org.apache.commons.imaging.formats.pnm;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
abstract class FileInfo {
    final int height;
    final boolean rawbits;
    final int width;

    public FileInfo(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.rawbits = z;
    }

    public static int readSample(InputStream inputStream, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read = inputStream.read();
            if (read < 0) {
                a$$ExternalSyntheticBUOutline0.m$4("PNM: Unexpected EOF");
                return 0;
            }
            i2 = (i2 << 8) | read;
        }
        return i2;
    }

    public static int scaleSample(int i, float f, int i2) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$4("Negative pixel values are invalid in PNM files");
            return 0;
        }
        if (i > i2) {
            i = 0;
        }
        return (int) (((i * f) / i2) + 0.5f);
    }

    public abstract int getBitDepth();

    public abstract ImageInfo.ColorType getColorType();

    public abstract ImageFormat getImageType();

    public abstract String getImageTypeDescription();

    public abstract String getMIMEType();

    public abstract int getNumComponents();

    public abstract int getRGB(InputStream inputStream);

    public abstract int getRGB(WhiteSpaceReader whiteSpaceReader);

    public abstract boolean hasAlpha();

    public void newline() {
    }

    public void readImage(ImageBuilder imageBuilder, InputStream inputStream) {
        if (this.rawbits) {
            for (int i = 0; i < this.height; i++) {
                for (int i2 = 0; i2 < this.width; i2++) {
                    imageBuilder.setRGB(i2, i, getRGB(inputStream));
                }
                newline();
            }
            return;
        }
        WhiteSpaceReader whiteSpaceReader = new WhiteSpaceReader(inputStream);
        for (int i3 = 0; i3 < this.height; i3++) {
            for (int i4 = 0; i4 < this.width; i4++) {
                imageBuilder.setRGB(i4, i3, getRGB(whiteSpaceReader));
            }
            newline();
        }
    }
}
