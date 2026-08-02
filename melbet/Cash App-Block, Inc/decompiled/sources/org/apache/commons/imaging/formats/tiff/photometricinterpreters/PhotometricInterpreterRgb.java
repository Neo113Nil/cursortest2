package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
public class PhotometricInterpreterRgb extends PhotometricInterpreter {
    public PhotometricInterpreterRgb(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(ImageBuilder imageBuilder, int[] iArr, int i, int i2) {
        imageBuilder.setRGB(i, i2, (iArr[0] << 16) | (-16777216) | (iArr[1] << 8) | iArr[2]);
    }
}
