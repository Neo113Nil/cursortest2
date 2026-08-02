package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
public abstract class PhotometricInterpreter {
    private final int[] bitsPerSample;
    protected final int height;
    protected final int predictor;
    protected final int samplesPerPixel;
    protected final int width;

    public PhotometricInterpreter(int i, int[] iArr, int i2, int i3, int i4) {
        this.samplesPerPixel = i;
        this.bitsPerSample = iArr;
        this.predictor = i2;
        this.width = i3;
        this.height = i4;
    }

    public int getBitsPerSample(int i) {
        return this.bitsPerSample[i];
    }

    public abstract void interpretPixel(ImageBuilder imageBuilder, int[] iArr, int i, int i2);
}
