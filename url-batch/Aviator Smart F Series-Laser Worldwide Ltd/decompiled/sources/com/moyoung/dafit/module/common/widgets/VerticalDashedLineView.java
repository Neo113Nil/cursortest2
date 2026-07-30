package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class VerticalDashedLineView extends View {
    private Paint paint;

    public VerticalDashedLineView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-7829368);
        this.paint.setStrokeWidth(5.0f);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f));
        this.paint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        canvas.drawLine(width, 0.0f, width, getHeight(), this.paint);
    }

    public VerticalDashedLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
