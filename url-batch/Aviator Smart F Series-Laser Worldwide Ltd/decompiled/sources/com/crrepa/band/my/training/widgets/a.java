package com.crrepa.band.my.training.widgets;

import android.util.Log;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.utils.c;
import com.github.mikephil.charting.formatter.g;

/* loaded from: classes3.dex */
public class a extends g {
    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        Log.d("getAxisLabel", "=" + f8);
        return c.getPaceStrBySeconds((int) ((BandUnitSystemProvider.isImperialSystem() ? 2419.3547f : 1500.0f) - (f8 * 10.0f)));
    }
}
