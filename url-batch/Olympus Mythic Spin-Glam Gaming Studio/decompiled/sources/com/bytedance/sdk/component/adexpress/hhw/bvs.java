package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class bvs extends View {
    private Paint btk;
    private Paint fb;
    private int fs;
    private int hhw;
    private Paint nps;
    private int zg;
    private int zmn;
    private final RectF zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public bvs(Context context) {
        super(context);
        this.zn = new RectF();
        zmn();
    }

    private void zmn() {
        Paint paint = new Paint();
        this.fb = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.nps = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.btk = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.hhw = i;
    }

    public void setDislikeColor(int i) {
        this.nps.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.nps.setStrokeWidth(i);
    }

    public void setStrokeColor(int i) {
        this.fb.setStyle(Paint.Style.STROKE);
        this.fb.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.fb.setStrokeWidth(i);
        this.zg = i;
    }

    public void setBgColor(int i) {
        this.btk.setStyle(Paint.Style.FILL);
        this.btk.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.zn;
        int i = this.hhw;
        canvas.drawRoundRect(rectF, i, i, this.btk);
        RectF rectF2 = this.zn;
        int i2 = this.hhw;
        canvas.drawRoundRect(rectF2, i2, i2, this.fb);
        int i3 = this.zmn;
        int i4 = this.fs;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.nps);
        int i5 = this.zmn;
        int i6 = this.fs;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.nps);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.zmn = i;
        this.fs = i2;
        RectF rectF = this.zn;
        int i5 = this.zg;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }
}
