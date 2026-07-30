package com.google.maps.android.heatmaps;

import android.graphics.Color;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class Gradient {
    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int[] mColors;
    public float[] mStartPoints;

    private class ColorInterval {
        private final int color1;
        private final int color2;
        private final float duration;

        private ColorInterval(int i8, int i9, float f8) {
            this.color1 = i8;
            this.color2 = i9;
            this.duration = f8;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, ColorInterval> generateColorIntervals() {
        HashMap<Integer, ColorInterval> hashMap = new HashMap<>();
        if (this.mStartPoints[0] != 0.0f) {
            hashMap.put(0, new ColorInterval(Color.argb(0, Color.red(this.mColors[0]), Color.green(this.mColors[0]), Color.blue(this.mColors[0])), this.mColors[0], this.mColorMapSize * this.mStartPoints[0]));
        }
        for (int i8 = 1; i8 < this.mColors.length; i8++) {
            int i9 = i8 - 1;
            Integer valueOf = Integer.valueOf((int) (this.mColorMapSize * this.mStartPoints[i9]));
            int[] iArr = this.mColors;
            int i10 = iArr[i9];
            int i11 = iArr[i8];
            float f8 = this.mColorMapSize;
            float[] fArr = this.mStartPoints;
            hashMap.put(valueOf, new ColorInterval(i10, i11, (fArr[i8] - fArr[i9]) * f8));
        }
        float[] fArr2 = this.mStartPoints;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (this.mColorMapSize * fArr2[length]));
            int i12 = this.mColors[length];
            hashMap.put(valueOf2, new ColorInterval(i12, i12, this.mColorMapSize * (1.0f - this.mStartPoints[length])));
        }
        return hashMap;
    }

    static int interpolateColor(int i8, int i9, float f8) {
        int alpha = (int) (((Color.alpha(i9) - Color.alpha(i8)) * f8) + Color.alpha(i8));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i8), Color.green(i8), Color.blue(i8), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i9), Color.green(i9), Color.blue(i9), fArr2);
        float f9 = fArr[0];
        float f10 = fArr2[0];
        if (f9 - f10 > 180.0f) {
            fArr2[0] = f10 + 360.0f;
        } else if (f10 - f9 > 180.0f) {
            fArr[0] = f9 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr3[i10] = ((f11 - f12) * f8) + f12;
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    int[] generateColorMap(double d8) {
        HashMap<Integer, ColorInterval> generateColorIntervals = generateColorIntervals();
        int[] iArr = new int[this.mColorMapSize];
        ColorInterval colorInterval = generateColorIntervals.get(0);
        int i8 = 0;
        for (int i9 = 0; i9 < this.mColorMapSize; i9++) {
            if (generateColorIntervals.containsKey(Integer.valueOf(i9))) {
                colorInterval = generateColorIntervals.get(Integer.valueOf(i9));
                i8 = i9;
            }
            iArr[i9] = interpolateColor(colorInterval.color1, colorInterval.color2, (i9 - i8) / colorInterval.duration);
        }
        if (d8 != 1.0d) {
            for (int i10 = 0; i10 < this.mColorMapSize; i10++) {
                int i11 = iArr[i10];
                iArr[i10] = Color.argb((int) (Color.alpha(i11) * d8), Color.red(i11), Color.green(i11), Color.blue(i11));
            }
        }
        return iArr;
    }

    public Gradient(int[] iArr, float[] fArr, int i8) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i9 = 1; i9 < fArr.length; i9++) {
            if (fArr[i9] <= fArr[i9 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.mColorMapSize = i8;
        int[] iArr2 = new int[iArr.length];
        this.mColors = iArr2;
        this.mStartPoints = new float[fArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        System.arraycopy(fArr, 0, this.mStartPoints, 0, fArr.length);
    }
}
