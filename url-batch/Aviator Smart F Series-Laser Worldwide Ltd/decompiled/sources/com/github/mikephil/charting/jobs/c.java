package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public class c extends b {
    private static com.github.mikephil.charting.utils.f pool = com.github.mikephil.charting.utils.f.create(8, new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));
    protected Matrix mOnAnimationUpdateMatrixBuffer;
    protected float xAxisRange;
    protected YAxis yAxis;
    protected float zoomCenterX;
    protected float zoomCenterY;
    protected float zoomOriginX;
    protected float zoomOriginY;

    @SuppressLint({"NewApi"})
    public c(j jVar, View view, g gVar, YAxis yAxis, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, long j8) {
        super(jVar, f9, f10, gVar, view, f11, f12, j8);
        this.mOnAnimationUpdateMatrixBuffer = new Matrix();
        this.zoomCenterX = f13;
        this.zoomCenterY = f14;
        this.zoomOriginX = f15;
        this.zoomOriginY = f16;
        this.animator.addListener(this);
        this.yAxis = yAxis;
        this.xAxisRange = f8;
    }

    public static c getInstance(j jVar, View view, g gVar, YAxis yAxis, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, long j8) {
        c cVar = (c) pool.get();
        cVar.mViewPortHandler = jVar;
        cVar.xValue = f9;
        cVar.yValue = f10;
        cVar.mTrans = gVar;
        cVar.view = view;
        cVar.xOrigin = f11;
        cVar.yOrigin = f12;
        cVar.yAxis = yAxis;
        cVar.xAxisRange = f8;
        cVar.resetAnimator();
        cVar.animator.setDuration(j8);
        return cVar;
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.view).calculateOffsets();
        this.view.postInvalidate();
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f8 = this.xOrigin;
        float f9 = this.xValue - f8;
        float f10 = this.phase;
        float f11 = f8 + (f9 * f10);
        float f12 = this.yOrigin;
        float f13 = f12 + ((this.yValue - f12) * f10);
        Matrix matrix = this.mOnAnimationUpdateMatrixBuffer;
        this.mViewPortHandler.setZoom(f11, f13, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        float scaleY = this.yAxis.mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = this.xAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        float f14 = this.zoomOriginX;
        float f15 = (this.zoomCenterX - (scaleX / 2.0f)) - f14;
        float f16 = this.phase;
        fArr[0] = f14 + (f15 * f16);
        float f17 = this.zoomOriginY;
        fArr[1] = f17 + (((this.zoomCenterY + (scaleY / 2.0f)) - f17) * f16);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, true);
    }

    @Override // com.github.mikephil.charting.jobs.b
    public void recycleSelf() {
    }
}
