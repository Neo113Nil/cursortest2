package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class TwoSemicirclesView extends View {
    private Paint Jd;
    private final int Mxy;
    private Paint NB;
    private int icD;
    private final RectF pvs;
    private float sUS;
    private final int so;
    private int vG;
    private float yiw;

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sUS = -90.0f;
        this.yiw = 220.0f;
        this.so = Color.parseColor("#FFFFFF");
        this.Mxy = Color.parseColor("#C4C4C4");
        pvs();
        float f = this.yiw;
        this.pvs = new RectF(-f, -f, f, f);
    }

    private void pvs() {
        Paint paint = new Paint();
        this.Jd = paint;
        paint.setColor(this.so);
        this.Jd.setStyle(Paint.Style.STROKE);
        this.Jd.setStrokeWidth(4.0f);
        this.Jd.setAlpha(20);
        Paint paint2 = new Paint(this.Jd);
        this.NB = paint2;
        paint2.setColor(this.Mxy);
        this.NB.setAlpha(255);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.icD = i;
        this.vG = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.pvs;
        float f = this.yiw;
        rectF.set(-f, -f, f, f);
        canvas.translate(this.icD / 2, this.vG / 2);
        canvas.drawArc(this.pvs, this.sUS, 180.0f, false, this.Jd);
        canvas.drawArc(this.pvs, this.sUS + 180.0f, 180.0f, false, this.NB);
    }

    public void setCurrentStartAngle(float f) {
        this.sUS = f;
        postInvalidate();
    }

    public void setRadius(float f) {
        this.yiw = f;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.Jd = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.Jd;
    }

    public void setPaintTwo(Paint paint) {
        this.NB = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.NB;
    }
}
