package com.github.mikephil.charting.data;

import android.graphics.Color;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class d extends DataSet implements v4.b {
    protected int mHighLightColor;

    public d(List<Entry> list, String str) {
        super(list, str);
        this.mHighLightColor = Color.rgb(255, 187, 115);
    }

    protected void copy(d dVar) {
        super.copy((DataSet) dVar);
        dVar.mHighLightColor = this.mHighLightColor;
    }

    @Override // v4.b
    public int getHighLightColor() {
        return this.mHighLightColor;
    }

    public void setHighLightColor(int i8) {
        this.mHighLightColor = i8;
    }
}
