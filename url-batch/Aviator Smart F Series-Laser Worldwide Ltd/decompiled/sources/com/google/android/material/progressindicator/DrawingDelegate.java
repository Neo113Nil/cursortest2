package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.github.mikephil.charting.utils.i;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.Arrays;

/* loaded from: classes4.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    static final float WAVE_SMOOTHNESS = 0.48f;
    final PathMeasure activePathMeasure;
    final Path cachedActivePath;
    final Path displayedActivePath;
    S spec;
    final Matrix transform;

    protected static class ActiveIndicator {

        @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
        float amplitudeFraction = 1.0f;

        @ColorInt
        int color;

        @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
        float endFraction;

        @Px
        int gapSize;
        boolean isDeterminate;

        @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
        float phaseFraction;
        float rotationDegree;

        @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
        float startFraction;

        protected ActiveIndicator() {
        }
    }

    public DrawingDelegate(S s7) {
        Path path = new Path();
        this.cachedActivePath = path;
        this.displayedActivePath = new Path();
        this.activePathMeasure = new PathMeasure(path, false);
        this.spec = s7;
        this.transform = new Matrix();
    }

    abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f8, boolean z7, boolean z8);

    abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9);

    abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i8);

    abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9, @Px int i10);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    abstract void invalidateCachedPaths();

    void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f8, boolean z7, boolean z8) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f8, z7, z8);
    }

    float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    protected class PathPoint {
        float[] posVec;
        float[] tanVec;
        final Matrix transform;

        public PathPoint() {
            this.posVec = new float[2];
            this.tanVec = new float[]{1.0f, 0.0f};
            this.transform = new Matrix();
        }

        float distance(DrawingDelegate<S>.PathPoint pathPoint) {
            float f8 = pathPoint.posVec[0];
            float[] fArr = this.posVec;
            return (float) Math.hypot(f8 - fArr[0], r5[1] - fArr[1]);
        }

        void moveAcross(float f8) {
            float[] fArr = this.tanVec;
            float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            double d8 = f8;
            double d9 = atan2;
            this.posVec[0] = (float) (r2[0] + (Math.cos(d9) * d8));
            this.posVec[1] = (float) (r14[1] + (d8 * Math.sin(d9)));
        }

        void moveAlong(float f8) {
            float[] fArr = this.tanVec;
            float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
            double d8 = f8;
            double d9 = atan2;
            this.posVec[0] = (float) (r2[0] + (Math.cos(d9) * d8));
            this.posVec[1] = (float) (r14[1] + (d8 * Math.sin(d9)));
        }

        public void reset() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.transform.reset();
        }

        public void rotate(float f8) {
            this.transform.reset();
            this.transform.setRotate(f8);
            this.transform.mapPoints(this.posVec);
            this.transform.mapPoints(this.tanVec);
        }

        void scale(float f8, float f9) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f8;
            fArr[1] = fArr[1] * f9;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f8;
            fArr2[1] = fArr2[1] * f9;
        }

        void translate(float f8, float f9) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f8;
            fArr[1] = fArr[1] + f9;
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.posVec, pathPoint.tanVec);
        }

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.transform = new Matrix();
        }
    }
}
