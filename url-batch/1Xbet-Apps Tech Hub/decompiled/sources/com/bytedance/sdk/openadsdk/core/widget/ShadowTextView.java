package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;

/* loaded from: classes2.dex */
public class ShadowTextView extends PAGTextView {
    private RectF icD;
    private Paint pvs;
    private int vG;

    public ShadowTextView(Context context) {
        this(context, null);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.vG = 0;
        pvs();
    }

    private void pvs() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pvs.setColor(Color.parseColor("#99333333"));
        this.pvs.setAntiAlias(true);
        this.pvs.setStrokeWidth(0.0f);
        this.icD = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.vG = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.icD.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.icD.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.icD;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.icD.bottom / 2.0f, this.pvs);
        canvas.translate((this.icD.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
