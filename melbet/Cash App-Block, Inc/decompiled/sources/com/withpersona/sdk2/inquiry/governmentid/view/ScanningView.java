package com.withpersona.sdk2.inquiry.governmentid.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;

/* loaded from: classes4.dex */
public final class ScanningView extends View {
    public float animationRotation;
    public final ValueAnimator animator;
    public int borderColor;
    public float cornerRadius;
    public SweepGradient gradient;
    public final Matrix gradientMatrix;
    public int highlightColor;
    public boolean isScanningAnimationEnabled;
    public final Paint paint;
    public Path path;

    public static void $r8$lambda$eSCIYGun8qb3KF0R7SE_0OtQgOI(ScanningView scanningView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction() * 360.0f;
        if (scanningView.animationRotation == animatedFraction) {
            return;
        }
        scanningView.animationRotation = animatedFraction;
        scanningView.updateMatrix();
    }

    public ScanningView(Context context) {
        super(context);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) ExtensionsKt.getDpToPx(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        context2.getClass();
        this.highlightColor = ResToolsKt.getColorFromAttr$default(context2, R.attr.colorPrimary);
        this.borderColor = -1;
        this.gradient = generateGradient();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = generatePath();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setDuration(4000L);
        ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 18));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        this.animator = ofFloat;
    }

    public final SweepGradient generateGradient() {
        boolean z = this.isScanningAnimationEnabled;
        int i = this.borderColor;
        return new SweepGradient(0.5f, 0.5f, z ? new int[]{i, i, this.highlightColor} : new int[]{i, i, i}, new float[]{RecyclerView.DECELERATION_RATE, 0.5f, 1.0f});
    }

    public final Path generatePath() {
        Path path = new Path();
        float strokeWidth = this.paint.getStrokeWidth();
        float f = strokeWidth / 2.0f;
        if (getMeasuredWidth() > strokeWidth && getMeasuredHeight() > strokeWidth) {
            float measuredWidth = getMeasuredWidth() - f;
            float measuredHeight = getMeasuredHeight() - f;
            float f2 = this.cornerRadius;
            path.addRoundRect(f, f, measuredWidth, measuredHeight, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, Path.Direction.CW);
        }
        return path;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.path = generatePath();
        invalidate();
        updateMatrix();
    }

    public final void setBorderColor(int i) {
        if (this.borderColor == i) {
            return;
        }
        this.borderColor = i;
        updateGradient();
    }

    public final void setCornerRadius(float f) {
        if (this.cornerRadius == f) {
            return;
        }
        this.cornerRadius = f;
        this.path = generatePath();
        invalidate();
    }

    public final void setHighlightColor(int i) {
        if (this.highlightColor == i) {
            return;
        }
        this.highlightColor = i;
        updateGradient();
    }

    public final void setScanningAnimationEnabled(boolean z) {
        if (this.isScanningAnimationEnabled == z) {
            return;
        }
        this.isScanningAnimationEnabled = z;
        updateGradient();
    }

    public final void setStrokeWidth(float f) {
        Paint paint = this.paint;
        if (paint.getStrokeWidth() == f) {
            return;
        }
        paint.setStrokeWidth(f);
        invalidate();
    }

    public final void updateGradient() {
        SweepGradient generateGradient = generateGradient();
        this.gradient = generateGradient;
        this.paint.setShader(generateGradient);
        updateMatrix();
        invalidate();
    }

    public final void updateMatrix() {
        int max = Integer.max(getMeasuredWidth(), getMeasuredHeight());
        float f = this.animationRotation;
        Matrix matrix = this.gradientMatrix;
        matrix.setRotate(f, 0.5f, 0.5f);
        float f2 = max;
        matrix.postScale(f2, f2);
        matrix.postTranslate((r0 - max) / 2.0f, (r1 - max) / 2.0f);
        this.gradient.setLocalMatrix(matrix);
        invalidate();
    }

    public ScanningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) ExtensionsKt.getDpToPx(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        context2.getClass();
        this.highlightColor = ResToolsKt.getColorFromAttr$default(context2, R.attr.colorPrimary);
        this.borderColor = -1;
        this.gradient = generateGradient();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = generatePath();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setDuration(4000L);
        ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 18));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        this.animator = ofFloat;
    }

    public ScanningView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) ExtensionsKt.getDpToPx(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        context2.getClass();
        this.highlightColor = ResToolsKt.getColorFromAttr$default(context2, R.attr.colorPrimary);
        this.borderColor = -1;
        this.gradient = generateGradient();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = generatePath();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setDuration(4000L);
        ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 18));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        this.animator = ofFloat;
    }
}
