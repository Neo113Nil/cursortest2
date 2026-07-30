package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.view.View;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public class a extends b {
    private static com.github.mikephil.charting.utils.f pool;

    static {
        com.github.mikephil.charting.utils.f create = com.github.mikephil.charting.utils.f.create(4, new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public a(j jVar, float f8, float f9, g gVar, View view, float f10, float f11, long j8) {
        super(jVar, f8, f9, gVar, view, f10, f11, j8);
    }

    public static a getInstance(j jVar, float f8, float f9, g gVar, View view, float f10, float f11, long j8) {
        a aVar = (a) pool.get();
        aVar.mViewPortHandler = jVar;
        aVar.xValue = f8;
        aVar.yValue = f9;
        aVar.mTrans = gVar;
        aVar.view = view;
        aVar.xOrigin = f10;
        aVar.yOrigin = f11;
        aVar.animator.setDuration(j8);
        return aVar;
    }

    public static void recycleInstance(a aVar) {
        pool.recycle(aVar);
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override // com.github.mikephil.charting.jobs.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.pts;
        float f8 = this.xOrigin;
        float f9 = this.xValue - f8;
        float f10 = this.phase;
        fArr[0] = f8 + (f9 * f10);
        float f11 = this.yOrigin;
        fArr[1] = f11 + ((this.yValue - f11) * f10);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
    }

    @Override // com.github.mikephil.charting.jobs.b
    public void recycleSelf() {
        recycleInstance(this);
    }
}
