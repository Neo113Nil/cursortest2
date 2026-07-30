package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.github.mikephil.charting.utils.i;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes4.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float adjustedWavelength;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedInnerCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = i.DOUBLE_EPSILON, to = 1.0d)
    private float totalTrackLengthFraction;
    private float trackLength;

    LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair, float f8, float f9, float f10, float f11) {
        int i8 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
        if (pathMeasure == this.activePathMeasure && i8 != this.cachedWavelength) {
            this.cachedWavelength = i8;
            invalidateCachedPaths();
        }
        path.rewind();
        float f12 = (-this.trackLength) / 2.0f;
        boolean hasWavyEffect = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator);
        if (hasWavyEffect) {
            float f13 = this.trackLength;
            float f14 = this.adjustedWavelength;
            float f15 = f13 / f14;
            float f16 = f11 / f15;
            float f17 = f15 / (f15 + 1.0f);
            f8 = (f8 + f16) * f17;
            f9 = (f9 + f16) * f17;
            f12 -= f11 * f14;
        }
        float length = f8 * pathMeasure.getLength();
        float length2 = f9 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setTranslate(f12, 0.0f);
        pathPoint.translate(f12, 0.0f);
        pathPoint2.translate(f12, 0.0f);
        if (hasWavyEffect) {
            float f18 = this.displayedAmplitude * f10;
            this.transform.postScale(1.0f, f18);
            pathPoint.scale(1.0f, f18);
            pathPoint2.scale(1.0f, f18);
        }
        path.transform(this.transform);
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, @ColorInt int i8, @Px int i9, @Px int i10, float f10, float f11, boolean z7) {
        float f12;
        float f13;
        float clamp = MathUtils.clamp(f8, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f9, 0.0f, 1.0f);
        float lerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp);
        float lerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp2);
        int clamp3 = (int) ((i9 * MathUtils.clamp(lerp, 0.0f, 0.01f)) / 0.01f);
        int clamp4 = (int) ((i10 * (1.0f - MathUtils.clamp(lerp2, 0.99f, 1.0f))) / 0.01f);
        float f14 = this.trackLength;
        int i11 = (int) ((lerp * f14) + clamp3);
        int i12 = (int) ((lerp2 * f14) - clamp4);
        float f15 = this.displayedCornerRadius;
        float f16 = this.displayedInnerCornerRadius;
        if (f15 != f16) {
            float max = Math.max(f15, f16);
            float f17 = this.trackLength;
            float f18 = max / f17;
            float lerp3 = com.google.android.material.math.MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, MathUtils.clamp(i11 / f17, 0.0f, f18) / f18);
            float f19 = this.displayedCornerRadius;
            float f20 = this.displayedInnerCornerRadius;
            float f21 = this.trackLength;
            f13 = com.google.android.material.math.MathUtils.lerp(f19, f20, MathUtils.clamp((f21 - i12) / f21, 0.0f, f18) / f18);
            f12 = lerp3;
        } else {
            f12 = f15;
            f13 = f12;
        }
        float f22 = (-this.trackLength) / 2.0f;
        boolean z8 = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z7 && f10 > 0.0f;
        if (i11 <= i12) {
            float f23 = i11 + f12;
            float f24 = i12 - f13;
            float f25 = f12 * 2.0f;
            float f26 = f13 * 2.0f;
            paint.setColor(i8);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.first).translate(f23 + f22, 0.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).translate(f22 + f24, 0.0f);
            if (i11 == 0 && f24 + f13 < f23 + f12) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f27 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint, f25, f27, f12, (DrawingDelegate.PathPoint) pair.second, f26, f27, f13, true);
                return;
            }
            if (f23 - f12 > f24 - f13) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair2 = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f28 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint2, f26, f28, f13, (DrawingDelegate.PathPoint) pair2.first, f25, f28, f12, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.spec).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z8) {
                PathMeasure pathMeasure = this.activePathMeasure;
                Path path = this.displayedActivePath;
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair3 = this.endPoints;
                float f29 = this.trackLength;
                calculateDisplayedPath(pathMeasure, path, pair3, f23 / f29, f24 / f29, f10, f11);
                canvas.drawPath(this.displayedActivePath, paint);
            } else {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair4 = this.endPoints;
                Object obj = pair4.first;
                float f30 = ((DrawingDelegate.PathPoint) obj).posVec[0];
                float f31 = ((DrawingDelegate.PathPoint) obj).posVec[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f30, f31, ((DrawingDelegate.PathPoint) obj2).posVec[0], ((DrawingDelegate.PathPoint) obj2).posVec[1], paint);
            }
            if (((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                return;
            }
            if (f23 > 0.0f && f12 > 0.0f) {
                drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.first, f25, this.displayedTrackThickness, f12);
            }
            if (f24 >= this.trackLength || f13 <= 0.0f) {
                return;
            }
            drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f26, this.displayedTrackThickness, f13);
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f8, float f9, float f10) {
        drawRoundedBlock(canvas, paint, pathPoint, f8, f9, f10, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f8, boolean z7, boolean z8) {
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - preferredHeight) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f9 = this.trackLength / 2.0f;
        float f10 = preferredHeight / 2.0f;
        canvas.clipRect(-f9, -f10, f9, f10);
        S s7 = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s7).trackThickness * f8;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s7).trackThickness / 2, ((LinearProgressIndicatorSpec) s7).getTrackCornerRadiusInPx()) * f8;
        S s8 = this.spec;
        this.displayedAmplitude = ((LinearProgressIndicatorSpec) s8).waveAmplitude * f8;
        this.displayedInnerCornerRadius = Math.min(((LinearProgressIndicatorSpec) s8).trackThickness / 2.0f, ((LinearProgressIndicatorSpec) s8).getTrackInnerCornerRadiusInPx()) * f8;
        if (z7 || z8) {
            if ((z7 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z8 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z7 || (z8 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f8)) / 2.0f);
            }
        }
        if (z8 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f8;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i8, i9);
        this.drawingDeterminateIndicator = false;
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize <= 0 || compositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(compositeARGBWithAlpha);
        S s7 = this.spec;
        DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.trackLength / 2.0f) - (((LinearProgressIndicatorSpec) s7).trackStopIndicatorPadding != null ? ((LinearProgressIndicatorSpec) s7).trackStopIndicatorPadding.floatValue() + (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize / 2.0f) : this.displayedTrackThickness / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        S s8 = this.spec;
        drawRoundedBlock(canvas, paint, pathPoint, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, (this.displayedCornerRadius * ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize) / this.displayedTrackThickness);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i8) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i8);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f8 = activeIndicator.startFraction;
        float f9 = activeIndicator.endFraction;
        int i9 = activeIndicator.gapSize;
        drawLine(canvas, paint, f8, f9, compositeARGBWithAlpha, i9, i9, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, int i8, int i9, @Px int i10) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i8, i9);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f8, f9, compositeARGBWithAlpha, i10, i10, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
        S s7 = this.spec;
        return ((LinearProgressIndicatorSpec) s7).trackThickness + (((LinearProgressIndicatorSpec) s7).waveAmplitude * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void invalidateCachedPaths() {
        this.cachedActivePath.rewind();
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            int i8 = this.drawingDeterminateIndicator ? ((LinearProgressIndicatorSpec) this.spec).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.spec).wavelengthIndeterminate;
            float f8 = this.trackLength;
            int i9 = (int) (f8 / i8);
            this.adjustedWavelength = f8 / i9;
            for (int i10 = 0; i10 <= i9; i10++) {
                int i11 = i10 * 2;
                float f9 = i11 + 1;
                this.cachedActivePath.cubicTo(i11 + 0.48f, 0.0f, f9 - 0.48f, 1.0f, f9, 1.0f);
                float f10 = i11 + 2;
                this.cachedActivePath.cubicTo(f9 + 0.48f, 1.0f, f10 - 0.48f, 0.0f, f10, 0.0f);
            }
            this.transform.reset();
            this.transform.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            this.transform.postTranslate(0.0f, 1.0f);
            this.cachedActivePath.transform(this.transform);
        } else {
            this.cachedActivePath.lineTo(this.trackLength, 0.0f);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f8, float f9, float f10, @Nullable DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2, float f11, float f12, float f13, boolean z7) {
        float f14;
        float f15;
        float f16;
        float min = Math.min(f9, this.displayedTrackThickness);
        float f17 = (-f8) / 2.0f;
        float f18 = (-min) / 2.0f;
        float f19 = f8 / 2.0f;
        float f20 = min / 2.0f;
        RectF rectF = new RectF(f17, f18, f19, f20);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float min2 = Math.min(f12, this.displayedTrackThickness);
            float min3 = Math.min(f11 / 2.0f, (f13 * min2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            if (z7) {
                float f21 = (pathPoint2.posVec[0] - min3) - (pathPoint.posVec[0] - f10);
                if (f21 > 0.0f) {
                    pathPoint2.translate((-f21) / 2.0f, 0.0f);
                    f16 = f11 + f21;
                } else {
                    f16 = f11;
                }
                rectF2.set(0.0f, f18, f19, f20);
                f14 = 2.0f;
            } else {
                float f22 = (pathPoint2.posVec[0] + min3) - (pathPoint.posVec[0] + f10);
                if (f22 < 0.0f) {
                    f14 = 2.0f;
                    pathPoint2.translate((-f22) / 2.0f, 0.0f);
                    f15 = f11 - f22;
                } else {
                    f14 = 2.0f;
                    f15 = f11;
                }
                rectF2.set(f17, f18, 0.0f, f20);
                f16 = f15;
            }
            RectF rectF3 = new RectF((-f16) / f14, (-min2) / f14, f16 / f14, min2 / f14);
            float[] fArr = pathPoint2.posVec;
            canvas.translate(fArr[0], fArr[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-vectorToCanvasRotation(pathPoint2.tanVec));
            float[] fArr2 = pathPoint2.posVec;
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = pathPoint.posVec;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            float[] fArr4 = pathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        canvas.restore();
    }
}
