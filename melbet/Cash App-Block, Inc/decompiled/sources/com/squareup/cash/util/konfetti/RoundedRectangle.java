package com.squareup.cash.util.konfetti;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import nl.dionsegijn.konfetti.models.Shape;

/* loaded from: classes6.dex */
public final class RoundedRectangle implements Shape {
    public static final RoundedRectangle INSTANCE = new RoundedRectangle();

    @Override // nl.dionsegijn.konfetti.models.Shape
    public final void draw(Canvas canvas, Paint paint, float f) {
        canvas.getClass();
        paint.getClass();
        float f2 = 0.25f * f;
        float f3 = (f - f2) / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.drawRoundRect(RecyclerView.DECELERATION_RATE, f3, f, f3 + f2, f4, f4, paint);
    }
}
