package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class DislikeView extends View {
    private Paint Jd;
    private Paint NB;
    private int icD;
    private int pvs;
    private int sUS;
    private int so;
    private final RectF vG;
    private Paint yiw;

    public DislikeView(Context context) {
        super(context);
        this.vG = new RectF();
        pvs();
    }

    private void pvs() {
        Paint paint = new Paint();
        this.Jd = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.yiw = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.NB = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.sUS = i;
    }

    public void setDislikeColor(int i) {
        this.yiw.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.yiw.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.Jd.setStyle(Paint.Style.STROKE);
        this.Jd.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.Jd.setStrokeWidth(i);
        this.so = i;
    }

    public void setBgColor(int i) {
        this.NB.setStyle(Paint.Style.FILL);
        this.NB.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.vG;
        int i = this.sUS;
        canvas.drawRoundRect(rectF, i, i, this.NB);
        RectF rectF2 = this.vG;
        int i2 = this.sUS;
        canvas.drawRoundRect(rectF2, i2, i2, this.Jd);
        int i3 = this.pvs;
        int i4 = this.icD;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.yiw);
        int i5 = this.pvs;
        int i6 = this.icD;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.yiw);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.pvs = i;
        this.icD = i2;
        RectF rectF = this.vG;
        int i5 = this.so;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }
}
