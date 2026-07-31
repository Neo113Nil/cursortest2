package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class cn extends com.bytedance.sdk.openadsdk.core.hhw.zg {
    private RectF fs;
    private Paint zmn;
    private int zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zg, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public cn(Context context) {
        this(context, null);
    }

    public cn(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cn(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zn = 0;
        zmn();
    }

    private void zmn() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.zmn.setColor(Color.parseColor("#99333333"));
        this.zmn.setAntiAlias(true);
        this.zmn.setStrokeWidth(0.0f);
        this.fs = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zg, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.zn = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.fs.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.fs.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.fs;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.zmn);
        canvas.translate((this.fs.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
