package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class rt extends com.bytedance.sdk.openadsdk.core.hhw.fb {
    private RectF fs;
    private Paint zmn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public rt(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.zmn.setColor(Color.parseColor("#99333333"));
        this.zmn.setAntiAlias(true);
        this.zmn.setStrokeWidth(0.0f);
        this.fs = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.fs.right == getMeasuredWidth() && this.fs.bottom == getMeasuredHeight()) {
            return;
        }
        this.fs.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.fs;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.zmn);
        super.onDraw(canvas);
    }
}
