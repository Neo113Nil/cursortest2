package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;

/* loaded from: classes3.dex */
public abstract class e extends f.a implements Runnable {
    protected g mTrans;
    protected j mViewPortHandler;
    protected float[] pts = new float[2];
    protected View view;
    protected float xValue;
    protected float yValue;

    public e(j jVar, float f8, float f9, g gVar, View view) {
        this.mViewPortHandler = jVar;
        this.xValue = f8;
        this.yValue = f9;
        this.mTrans = gVar;
        this.view = view;
    }

    public float getXValue() {
        return this.xValue;
    }

    public float getYValue() {
        return this.yValue;
    }
}
