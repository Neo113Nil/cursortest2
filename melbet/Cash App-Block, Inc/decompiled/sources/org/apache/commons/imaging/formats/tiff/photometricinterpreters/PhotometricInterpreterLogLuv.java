package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes9.dex */
public class PhotometricInterpreterLogLuv extends PhotometricInterpreter {

    public static class RgbValues {
        public int b;
        public int g;
        public int r;
    }

    public static class TristimulusValues {
        public float x;
        public float y;
        public float z;
    }

    public PhotometricInterpreterLogLuv(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    public RgbValues getRgbValues(TristimulusValues tristimulusValues) {
        float f = tristimulusValues.x / 100.0f;
        float f2 = tristimulusValues.y / 100.0f;
        float f3 = tristimulusValues.z / 100.0f;
        float f4 = ((-0.4986f) * f3) + ((-1.5372f) * f2) + (3.2406f * f);
        float f5 = (0.0415f * f3) + (1.8758f * f2) + ((-0.9689f) * f);
        float f6 = (f3 * 1.057f) + (f2 * (-0.204f)) + (f * 0.0557f);
        double d = f4;
        float pow = d > 0.0031308d ? (((float) Math.pow(d, 0.4166666666666667d)) * 1.055f) - 0.055f : f4 * 12.92f;
        double d2 = f5;
        float pow2 = d2 > 0.0031308d ? (((float) Math.pow(d2, 0.4166666666666667d)) * 1.055f) - 0.055f : f5 * 12.92f;
        double d3 = f6;
        float pow3 = d3 > 0.0031308d ? (((float) Math.pow(d3, 0.4166666666666667d)) * 1.055f) - 0.055f : f6 * 12.92f;
        RgbValues rgbValues = new RgbValues();
        rgbValues.r = (int) (pow * 255.0f);
        rgbValues.g = (int) (pow2 * 255.0f);
        rgbValues.b = (int) (pow3 * 255.0f);
        return rgbValues;
    }

    public TristimulusValues getTristimulusValues(int i, int i2, int i3) {
        float f = (((i * 100.0f) / 255.0f) + 16.0f) / 116.0f;
        float f2 = (i2 / 500.0f) + f;
        float f3 = f - (i3 / 200.0f);
        float pow = (float) Math.pow(f2, 3.0d);
        float pow2 = (float) Math.pow(f, 3.0d);
        float pow3 = (float) Math.pow(f3, 3.0d);
        if (pow2 <= 0.008856f) {
            pow2 = (f - 0.13793103f) / 7.787f;
        }
        if (pow <= 0.008856f) {
            pow = (f2 - 0.13793103f) / 7.787f;
        }
        if (pow3 <= 0.008856f) {
            pow3 = (f3 - 0.13793103f) / 7.787f;
        }
        TristimulusValues tristimulusValues = new TristimulusValues();
        tristimulusValues.x = pow * 95.047f;
        tristimulusValues.y = pow2 * 100.0f;
        tristimulusValues.z = pow3 * 108.883f;
        return tristimulusValues;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(ImageBuilder imageBuilder, int[] iArr, int i, int i2) {
        if (iArr == null || iArr.length != 3) {
            f$$ExternalSyntheticLambda0.m("Invalid length of bits per sample (expected 3).");
            return;
        }
        RgbValues rgbValues = getRgbValues(getTristimulusValues(iArr[0], (byte) iArr[1], (byte) iArr[2]));
        imageBuilder.setRGB(i, i2, Math.min(255, Math.max(0, rgbValues.b)) | (Math.min(255, Math.max(0, rgbValues.r)) << 16) | (-16777216) | (Math.min(255, Math.max(0, rgbValues.g)) << 8));
    }
}
