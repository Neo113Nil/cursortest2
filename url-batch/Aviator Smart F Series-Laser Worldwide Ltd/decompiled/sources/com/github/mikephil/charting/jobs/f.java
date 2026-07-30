package com.github.mikephil.charting.jobs;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public class f extends e {
    private static com.github.mikephil.charting.utils.f pool;
    protected YAxis.AxisDependency axisDependency;
    protected Matrix mRunMatrixBuffer;
    protected float scaleX;
    protected float scaleY;

    static {
        com.github.mikephil.charting.utils.f create = com.github.mikephil.charting.utils.f.create(1, new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public f(j jVar, float f8, float f9, float f10, float f11, g gVar, YAxis.AxisDependency axisDependency, View view) {
        super(jVar, f10, f11, gVar, view);
        this.mRunMatrixBuffer = new Matrix();
        this.scaleX = f8;
        this.scaleY = f9;
        this.axisDependency = axisDependency;
    }

    public static f getInstance(j jVar, float f8, float f9, float f10, float f11, g gVar, YAxis.AxisDependency axisDependency, View view) {
        f fVar = (f) pool.get();
        fVar.xValue = f10;
        fVar.yValue = f11;
        fVar.scaleX = f8;
        fVar.scaleY = f9;
        fVar.mViewPortHandler = jVar;
        fVar.mTrans = gVar;
        fVar.axisDependency = axisDependency;
        fVar.view = view;
        return fVar;
    }

    public static void recycleInstance(f fVar) {
        pool.recycle(fVar);
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        Matrix matrix = this.mRunMatrixBuffer;
        this.mViewPortHandler.zoom(this.scaleX, this.scaleY, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        float scaleY = ((BarLineChartBase) this.view).getAxis(this.axisDependency).mAxisRange / this.mViewPortHandler.getScaleY();
        float scaleX = ((BarLineChartBase) this.view).getXAxis().mAxisRange / this.mViewPortHandler.getScaleX();
        float[] fArr = this.pts;
        fArr[0] = this.xValue - (scaleX / 2.0f);
        fArr[1] = this.yValue + (scaleY / 2.0f);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.translate(this.pts, matrix);
        this.mViewPortHandler.refresh(matrix, this.view, false);
        ((BarLineChartBase) this.view).calculateOffsets();
        this.view.postInvalidate();
        recycleInstance(this);
    }
}
