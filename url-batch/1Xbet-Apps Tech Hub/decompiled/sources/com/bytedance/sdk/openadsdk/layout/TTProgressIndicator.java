package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes2.dex */
public class TTProgressIndicator extends View {
    private float icD;
    private final Paint pvs;
    private float vG;

    public TTProgressIndicator(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setProgress(float f) {
        this.vG = getWidth() * f;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.icD = (1.0f * f) / 2.0f;
        this.pvs.setStrokeWidth(f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.vG;
        if (f > 0.0f) {
            float f2 = this.icD;
            canvas.drawLine(0.0f, f2, f, f2, this.pvs);
        }
    }
}
