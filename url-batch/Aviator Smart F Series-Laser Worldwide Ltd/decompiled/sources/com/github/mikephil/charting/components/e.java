package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.Legend;

/* loaded from: classes3.dex */
public class e {
    public Legend.LegendForm form;
    public int formColor;
    public DashPathEffect formLineDashEffect;
    public float formLineWidth;
    public float formSize;
    public String label;

    public e() {
        this.form = Legend.LegendForm.DEFAULT;
        this.formSize = Float.NaN;
        this.formLineWidth = Float.NaN;
        this.formLineDashEffect = null;
        this.formColor = com.github.mikephil.charting.utils.a.COLOR_NONE;
    }

    public e(String str, Legend.LegendForm legendForm, float f8, float f9, DashPathEffect dashPathEffect, int i8) {
        Legend.LegendForm legendForm2 = Legend.LegendForm.NONE;
        this.label = str;
        this.form = legendForm;
        this.formSize = f8;
        this.formLineWidth = f9;
        this.formLineDashEffect = dashPathEffect;
        this.formColor = i8;
    }
}
