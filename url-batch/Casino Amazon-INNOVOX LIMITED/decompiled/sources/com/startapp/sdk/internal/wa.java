package com.startapp.sdk.internal;

import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class wa extends ShapeDrawable {
    public wa(RoundRectShape roundRectShape) {
        super(roundRectShape);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void onDraw(Shape shape, Canvas canvas, Paint paint) {
        paint.setColor(-11363070);
        paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
        super.onDraw(shape, canvas, paint);
    }
}
