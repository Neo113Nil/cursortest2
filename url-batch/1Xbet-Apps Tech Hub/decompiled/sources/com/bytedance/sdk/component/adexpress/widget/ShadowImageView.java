package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class ShadowImageView extends ImageView {
    private RectF icD;
    private Paint pvs;

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.icD.right == getMeasuredWidth() && this.icD.bottom == getMeasuredHeight()) {
            return;
        }
        this.icD.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.icD;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.icD.bottom / 2.0f, this.pvs);
        super.onDraw(canvas);
    }
}
