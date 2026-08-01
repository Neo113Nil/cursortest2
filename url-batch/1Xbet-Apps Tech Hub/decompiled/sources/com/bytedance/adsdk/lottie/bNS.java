package com.bytedance.adsdk.lottie;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14.java */
/* loaded from: classes.dex */
class bNS implements Interpolator {
    private final float[] icD;
    private final float[] pvs;

    bNS(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.pvs = new float[i];
        this.icD = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, null);
            this.pvs[i2] = fArr[0];
            this.icD[i2] = fArr[1];
        }
    }

    bNS(float f, float f2, float f3, float f4) {
        this(pvs(f, f2, f3, f4));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.pvs.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.pvs[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.pvs;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.icD[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.icD;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    private static Path pvs(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
