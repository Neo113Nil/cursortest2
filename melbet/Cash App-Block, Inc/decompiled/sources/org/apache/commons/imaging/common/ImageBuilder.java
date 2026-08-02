package org.apache.commons.imaging.common;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.RasterFormatException;
import java.awt.image.WritableRaster;
import java.util.Properties;

/* loaded from: classes9.dex */
public class ImageBuilder {
    private final int[] data;
    private final boolean hasAlpha;
    private final int height;
    private final int width;

    public ImageBuilder(int i, int i2, boolean z) {
        if (i <= 0) {
            throw new RasterFormatException("zero or negative width value");
        }
        if (i2 <= 0) {
            throw new RasterFormatException("zero or negative height value");
        }
        this.data = new int[i * i2];
        this.width = i;
        this.height = i2;
        this.hasAlpha = z;
    }

    private BufferedImage makeBufferedImage(int[] iArr, int i, int i2, boolean z) {
        WritableRaster createPackedRaster;
        ColorModel colorModel;
        DataBufferInt dataBufferInt = new DataBufferInt(iArr, i * i2);
        if (z) {
            ColorModel directColorModel = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
            createPackedRaster = Raster.createPackedRaster(dataBufferInt, i, i2, i, new int[]{16711680, 65280, 255, -16777216}, (Point) null);
            colorModel = directColorModel;
        } else {
            ColorModel directColorModel2 = new DirectColorModel(24, 16711680, 65280, 255);
            createPackedRaster = Raster.createPackedRaster(dataBufferInt, i, i2, i, new int[]{16711680, 65280, 255}, (Point) null);
            colorModel = directColorModel2;
        }
        return new BufferedImage(colorModel, createPackedRaster, colorModel.isAlphaPremultiplied(), new Properties());
    }

    public BufferedImage getBufferedImage() {
        return makeBufferedImage(this.data, this.width, this.height, this.hasAlpha);
    }

    public int getHeight() {
        return this.height;
    }

    public int getRGB(int i, int i2) {
        return this.data[(i2 * this.width) + i];
    }

    public BufferedImage getSubimage(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i3 <= 0) {
            throw new RasterFormatException("negative or zero subimage width");
        }
        if (i4 <= 0) {
            throw new RasterFormatException("negative or zero subimage height");
        }
        if (i < 0 || i >= (i5 = this.width)) {
            throw new RasterFormatException("subimage x is outside raster");
        }
        if (i + i3 > i5) {
            throw new RasterFormatException("subimage (x+width) is outside raster");
        }
        if (i2 < 0 || i2 >= (i6 = this.height)) {
            throw new RasterFormatException("subimage y is outside raster");
        }
        if (i2 + i4 > i6) {
            throw new RasterFormatException("subimage (y+height) is outside raster");
        }
        int[] iArr = new int[i3 * i4];
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            System.arraycopy(this.data, ((i8 + i2) * this.width) + i, iArr, i7, i3);
            i7 += i3;
        }
        return makeBufferedImage(iArr, i3, i4, this.hasAlpha);
    }

    public int getWidth() {
        return this.width;
    }

    public void setRGB(int i, int i2, int i3) {
        this.data[(i2 * this.width) + i] = i3;
    }
}
