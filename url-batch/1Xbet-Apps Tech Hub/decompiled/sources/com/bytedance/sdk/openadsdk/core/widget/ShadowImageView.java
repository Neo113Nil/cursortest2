package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

/* loaded from: classes2.dex */
public class ShadowImageView extends PAGImageView {
    private RectF icD;
    private Paint pvs;

    public ShadowImageView(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.pvs.setColor(Color.parseColor("#99333333"));
        this.pvs.setAntiAlias(true);
        this.pvs.setStrokeWidth(0.0f);
        this.icD = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGImageView, android.widget.ImageView, android.view.View
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
