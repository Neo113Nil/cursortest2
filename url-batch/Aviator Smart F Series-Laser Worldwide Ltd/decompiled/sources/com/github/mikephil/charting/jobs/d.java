package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public class d extends e {
    private static com.github.mikephil.charting.utils.f pool;

    static {
        com.github.mikephil.charting.utils.f create = com.github.mikephil.charting.utils.f.create(2, new d(null, 0.0f, 0.0f, null, null));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public d(j jVar, float f8, float f9, g gVar, View view) {
        super(jVar, f8, f9, gVar, view);
    }

    public static d getInstance(j jVar, float f8, float f9, g gVar, View view) {
        d dVar = (d) pool.get();
        dVar.mViewPortHandler = jVar;
        dVar.xValue = f8;
        dVar.yValue = f9;
        dVar.mTrans = gVar;
        dVar.view = view;
        return dVar;
    }

    public static void recycleInstance(d dVar) {
        pool.recycle(dVar);
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new d(this.mViewPortHandler, this.xValue, this.yValue, this.mTrans, this.view);
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = this.pts;
        fArr[0] = this.xValue;
        fArr[1] = this.yValue;
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
        recycleInstance(this);
    }
}
