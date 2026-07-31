package com.bytedance.sdk.openadsdk.cn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class zmn extends View {
    private float fs;
    private final Paint zmn;
    private float zn;

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

    public zmn(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setProgress(float f) {
        this.zn = getWidth() * f;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.fs = (1.0f * f) / 2.0f;
        this.zmn.setStrokeWidth(f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.zn;
        if (f > 0.0f) {
            float f2 = this.fs;
            canvas.drawLine(0.0f, f2, f, f2, this.zmn);
        }
    }
}
