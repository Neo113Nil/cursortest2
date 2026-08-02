package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import org.apache.commons.imaging.color.ColorConversions;
import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
public class PhotometricInterpreterCieLab extends PhotometricInterpreter {
    public PhotometricInterpreterCieLab(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(ImageBuilder imageBuilder, int[] iArr, int i, int i2) {
        imageBuilder.setRGB(i, i2, ColorConversions.convertCIELabtoARGBTest(iArr[0], (byte) iArr[1], (byte) iArr[2]));
    }
}
