package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.github.mikephil.charting.utils.i;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;

/* loaded from: classes4.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH = 0.5522848f;
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float adjustedWavelength;
    private final RectF arcBounds;
    private float cachedAmplitude;
    private float cachedRadius;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    private final Pair<DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint, DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
    private float totalTrackLengthFraction;

    CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcBounds = new RectF();
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void appendCubicPerHalfCycle(@NonNull Path path, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint2) {
        float f8 = (this.adjustedWavelength / 2.0f) * 0.48f;
        DrawingDelegate.PathPoint pathPoint3 = new DrawingDelegate.PathPoint(this, pathPoint);
        DrawingDelegate.PathPoint pathPoint4 = new DrawingDelegate.PathPoint(this, pathPoint2);
        pathPoint3.moveAlong(f8);
        pathPoint4.moveAlong(-f8);
        float[] fArr = pathPoint3.posVec;
        float f9 = fArr[0];
        float f10 = fArr[1];
        float[] fArr2 = pathPoint4.posVec;
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float[] fArr3 = pathPoint2.posVec;
        path.cubicTo(f9, f10, f11, f12, fArr3[0], fArr3[1]);
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint, DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint> pair, float f8, float f9, float f10, float f11) {
        float f12 = this.displayedAmplitude * f10;
        int i8 = this.drawingDeterminateIndicator ? ((CircularProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        float f13 = this.adjustedRadius;
        if (f13 != this.cachedRadius || (pathMeasure == this.activePathMeasure && (f12 != this.cachedAmplitude || i8 != this.cachedWavelength))) {
            this.cachedAmplitude = f12;
            this.cachedWavelength = i8;
            this.cachedRadius = f13;
            invalidateCachedPaths();
        }
        path.rewind();
        float f14 = 0.0f;
        float clamp = MathUtils.clamp(f9, 0.0f, 1.0f);
        if (((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            float f15 = f11 / ((float) ((this.adjustedRadius * 6.283185307179586d) / this.adjustedWavelength));
            f8 += f15;
            f14 = 0.0f - (f15 * 360.0f);
        }
        float f16 = f8 % 1.0f;
        float length = (pathMeasure.getLength() * f16) / 2.0f;
        float length2 = ((f16 + clamp) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setRotate(f14);
        pathPoint.rotate(f14);
        pathPoint2.rotate(f14);
        path.transform(this.transform);
    }

    private void createWavyPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, float f8) {
        path.rewind();
        float length = pathMeasure.getLength();
        int max = Math.max(3, (int) ((length / (this.drawingDeterminateIndicator ? ((CircularProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.spec).wavelengthIndeterminate)) / 2.0f)) * 2;
        this.adjustedWavelength = length / max;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < max; i8++) {
            DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            float f9 = i8;
            pathMeasure.getPosTan(this.adjustedWavelength * f9, pathPoint.posVec, pathPoint.tanVec);
            DrawingDelegate.PathPoint pathPoint2 = new DrawingDelegate.PathPoint();
            float f10 = this.adjustedWavelength;
            pathMeasure.getPosTan((f9 * f10) + (f10 / 2.0f), pathPoint2.posVec, pathPoint2.tanVec);
            arrayList.add(pathPoint);
            pathPoint2.moveAcross(f8 * 2.0f);
            arrayList.add(pathPoint2);
        }
        arrayList.add((DrawingDelegate.PathPoint) arrayList.get(0));
        DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) arrayList.get(0);
        float[] fArr = pathPoint3.posVec;
        int i9 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i9 < arrayList.size()) {
            DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) arrayList.get(i9);
            appendCubicPerHalfCycle(path, pathPoint3, pathPoint4);
            i9++;
            pathPoint3 = pathPoint4;
        }
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, @ColorInt int i8, @Px int i9, @Px int i10, float f10, float f11, boolean z7) {
        float f12 = f9 >= f8 ? f9 - f8 : (f9 + 1.0f) - f8;
        float f13 = f8 % 1.0f;
        if (f13 < 0.0f) {
            f13 += 1.0f;
        }
        float f14 = f13;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f15 = f14 + f12;
            if (f15 > 1.0f) {
                drawArc(canvas, paint, f14, 1.0f, i8, i9, 0, f10, f11, z7);
                drawArc(canvas, paint, 1.0f, f15, i8, 0, i10, f10, f11, z7);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        float f16 = f12 - 0.99f;
        if (f16 >= 0.0f) {
            float f17 = ((f16 * degrees) / 180.0f) / ROUND_CAP_RAMP_DOWN_THRESHHOLD;
            f12 += f17;
            if (!z7) {
                f14 -= f17 / 2.0f;
            }
        }
        float lerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f14);
        float lerp2 = com.google.android.material.math.MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f12);
        float degrees2 = (float) Math.toDegrees(i9 / this.adjustedRadius);
        float degrees3 = ((lerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i10 / this.adjustedRadius));
        float f18 = (lerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z8 = ((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z7 && f10 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i8);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f19 = this.displayedCornerRadius * 2.0f;
        float f20 = degrees * 2.0f;
        if (degrees3 < f20) {
            float f21 = degrees3 / f20;
            float f22 = f18 + (degrees * f21);
            DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            if (z8) {
                float length = ((f22 / 360.0f) * this.activePathMeasure.getLength()) / 2.0f;
                float f23 = this.displayedAmplitude * f10;
                float f24 = this.adjustedRadius;
                if (f24 != this.cachedRadius || f23 != this.cachedAmplitude) {
                    this.cachedAmplitude = f23;
                    this.cachedRadius = f24;
                    invalidateCachedPaths();
                }
                this.activePathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
            } else {
                pathPoint.rotate(f22 + 90.0f);
                pathPoint.moveAcross(-this.adjustedRadius);
            }
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, pathPoint, f19, this.displayedTrackThickness, f21);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f25 = f18 + degrees;
        float f26 = degrees3 - f20;
        ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
        ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
        if (z8) {
            calculateDisplayedPath(this.activePathMeasure, this.displayedActivePath, this.endPoints, f25 / 360.0f, f26 / 360.0f, f10, f11);
            canvas.drawPath(this.displayedActivePath, paint);
        } else {
            ((DrawingDelegate.PathPoint) this.endPoints.first).rotate(f25 + 90.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.first).moveAcross(-this.adjustedRadius);
            ((DrawingDelegate.PathPoint) this.endPoints.second).rotate(f25 + f26 + 90.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).moveAcross(-this.adjustedRadius);
            RectF rectF = this.arcBounds;
            float f27 = this.adjustedRadius;
            rectF.set(-f27, -f27, f27, f27);
            canvas.drawArc(this.arcBounds, f25, f26, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.spec).useStrokeCap() || this.displayedCornerRadius <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.first, f19, this.displayedTrackThickness);
        drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f19, this.displayedTrackThickness);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, float f8, float f9) {
        drawRoundedBlock(canvas, paint, pathPoint, f8, f9, 1.0f);
    }

    private int getSize() {
        S s7 = this.spec;
        return ((CircularProgressIndicatorSpec) s7).indicatorSize + (((CircularProgressIndicatorSpec) s7).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f8, boolean z7, boolean z8) {
        float width = rect.width() / getPreferredWidth();
        float height = rect.height() / getPreferredHeight();
        S s7 = this.spec;
        float f9 = (((CircularProgressIndicatorSpec) s7).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s7).indicatorInset;
        canvas.translate((f9 * width) + rect.left, (f9 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f10 = -f9;
        canvas.clipRect(f10, f10, f9, f9);
        S s8 = this.spec;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s8).trackThickness * f8;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s8).trackThickness / 2, ((CircularProgressIndicatorSpec) s8).getTrackCornerRadiusInPx()) * f8;
        S s9 = this.spec;
        this.displayedAmplitude = ((CircularProgressIndicatorSpec) s9).waveAmplitude * f8;
        float f11 = (((CircularProgressIndicatorSpec) s9).indicatorSize - ((CircularProgressIndicatorSpec) s9).trackThickness) / 2.0f;
        this.adjustedRadius = f11;
        if (z7 || z8) {
            float f12 = ((1.0f - f8) * ((CircularProgressIndicatorSpec) s9).trackThickness) / 2.0f;
            if ((z7 && ((CircularProgressIndicatorSpec) s9).showAnimationBehavior == 2) || (z8 && ((CircularProgressIndicatorSpec) s9).hideAnimationBehavior == 1)) {
                this.adjustedRadius = f11 + f12;
            } else if ((z7 && ((CircularProgressIndicatorSpec) s9).showAnimationBehavior == 1) || (z8 && ((CircularProgressIndicatorSpec) s9).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f11 - f12;
            }
        }
        if (z8 && ((CircularProgressIndicatorSpec) s9).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f8;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i8) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i8);
        canvas.save();
        canvas.rotate(activeIndicator.rotationDegree);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f8 = activeIndicator.startFraction;
        float f9 = activeIndicator.endFraction;
        int i9 = activeIndicator.gapSize;
        drawArc(canvas, paint, f8, f9, compositeARGBWithAlpha, i9, i9, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9, int i10) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i8, i9);
        this.drawingDeterminateIndicator = false;
        drawArc(canvas, paint, f8, f9, compositeARGBWithAlpha, i10, i10, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        this.cachedActivePath.moveTo(1.0f, 0.0f);
        for (int i8 = 0; i8 < 2; i8++) {
            this.cachedActivePath.cubicTo(1.0f, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, 1.0f, 0.0f, 1.0f);
            this.cachedActivePath.cubicTo(-0.5522848f, 1.0f, -1.0f, QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, -1.0f, 0.0f);
            this.cachedActivePath.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.cachedActivePath.cubicTo(QUARTER_CIRCLE_CONTROL_HANDLE_LENGTH, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.transform.reset();
        Matrix matrix = this.transform;
        float f8 = this.adjustedRadius;
        matrix.setScale(f8, f8);
        this.cachedActivePath.transform(this.transform);
        if (((CircularProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            this.activePathMeasure.setPath(this.cachedActivePath, false);
            createWavyPath(this.activePathMeasure, this.cachedActivePath, this.cachedAmplitude);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<CircularProgressIndicatorSpec>.PathPoint pathPoint, float f8, float f9, float f10) {
        float min = Math.min(f9, this.displayedTrackThickness);
        float f11 = f8 / 2.0f;
        float min2 = Math.min(f11, (this.displayedCornerRadius * min) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f8) / 2.0f, (-min) / 2.0f, f11, min / 2.0f);
        canvas.save();
        float[] fArr = pathPoint.posVec;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
        canvas.scale(f10, f10);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
