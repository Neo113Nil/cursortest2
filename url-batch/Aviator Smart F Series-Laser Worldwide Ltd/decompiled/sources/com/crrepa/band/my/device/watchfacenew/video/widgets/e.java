package com.crrepa.band.my.device.watchfacenew.video.widgets;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public class e {
    private final Matrix matrix = new Matrix();
    private float scaleFactor = 1.0f;
    private float translateX = 0.0f;
    private float translateY = 0.0f;

    public Rect calculateOriginalCoordinates(float f8, float f9, float f10, float f11) {
        Matrix matrix = new Matrix();
        this.matrix.reset();
        Matrix matrix2 = this.matrix;
        float f12 = this.scaleFactor;
        matrix2.postScale(f12, f12);
        this.matrix.postTranslate(this.translateX, this.translateY);
        if (!this.matrix.invert(matrix)) {
            throw new IllegalStateException("Failed to invert matrix");
        }
        matrix.mapPoints(new float[]{f8, f9});
        float f13 = f10 / 2.0f;
        float f14 = f11 / 2.0f;
        float[] fArr = {f8 - f13, f9 - f14};
        float[] fArr2 = {f8 + f13, f9 + f14};
        matrix.mapPoints(fArr);
        matrix.mapPoints(fArr2);
        return new Rect((int) Math.min(fArr[0], fArr2[0]), (int) Math.min(fArr[1], fArr2[1]), (int) Math.max(fArr[0], fArr2[0]), (int) Math.max(fArr[1], fArr2[1]));
    }

    public void updateMatrix(float f8, float f9, float f10) {
        this.scaleFactor = f8;
        this.translateX = f9;
        this.translateY = f10;
    }
}
