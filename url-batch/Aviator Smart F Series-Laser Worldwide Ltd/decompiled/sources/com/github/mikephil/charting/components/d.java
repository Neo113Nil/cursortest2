package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;

/* loaded from: classes3.dex */
public interface d {
    void draw(Canvas canvas, float f8, float f9);

    com.github.mikephil.charting.utils.e getOffset();

    com.github.mikephil.charting.utils.e getOffsetForDrawingAtPoint(float f8, float f9);

    void refreshContent(Entry entry, com.github.mikephil.charting.highlight.d dVar);
}
