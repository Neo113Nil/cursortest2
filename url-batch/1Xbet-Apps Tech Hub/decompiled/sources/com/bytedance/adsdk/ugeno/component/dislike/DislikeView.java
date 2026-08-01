package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.adsdk.ugeno.icD;

/* loaded from: classes.dex */
public class DislikeView extends View {
    private RectF Jd;
    private int Mxy;
    private Paint NB;
    private int icD;
    private icD pvs;
    private Paint sUS;
    private Paint so;
    private int vG;
    private float yiw;

    public DislikeView(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        Paint paint = new Paint();
        this.NB = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.so = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.sUS = paint3;
        paint3.setAntiAlias(true);
        setBackgroundColor(0);
    }

    public void setRadius(float f) {
        this.yiw = f;
    }

    public void setDislikeColor(int i) {
        this.so.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.so.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.NB.setStyle(Paint.Style.STROKE);
        this.NB.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.NB.setStrokeWidth(i);
        this.Mxy = i;
    }

    public void setBgColor(int i) {
        this.sUS.setStyle(Paint.Style.FILL);
        this.sUS.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundColor(0);
        RectF rectF = this.Jd;
        float f = this.yiw;
        canvas.drawRoundRect(rectF, f, f, this.sUS);
        RectF rectF2 = this.Jd;
        float f2 = this.yiw;
        canvas.drawRoundRect(rectF2, f2, f2, this.NB);
        int i = this.icD;
        int i2 = this.vG;
        canvas.drawLine(i * 0.3f, i2 * 0.3f, i * 0.7f, i2 * 0.7f, this.so);
        int i3 = this.icD;
        int i4 = this.vG;
        canvas.drawLine(i3 * 0.7f, i4 * 0.3f, i3 * 0.3f, i4 * 0.7f, this.so);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.icD = i;
        this.vG = i2;
        int i5 = this.Mxy;
        this.Jd = new RectF(i5, i5, this.icD - i5, this.vG - i5);
    }

    public void pvs(com.bytedance.adsdk.ugeno.component.icD icd) {
        this.pvs = icd;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.yiw();
        }
    }
}
