package com.youappi.sdk.ui.subviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public class OptOutClippingLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    Path f9480a;

    /* renamed from: b, reason: collision with root package name */
    private int f9481b;

    public OptOutClippingLayout(Context context) {
        this(context, null);
    }

    public OptOutClippingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OptOutClippingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9481b = 0;
    }

    private void a(int i, int i2) {
        this.f9480a = new Path();
        this.f9480a.arcTo(new RectF(-this.f9481b, 0.0f, this.f9481b, i2), -90.0f, 180.0f, true);
        this.f9480a.lineTo(getWidth(), getHeight());
        this.f9480a.lineTo(getWidth(), 0.0f);
        this.f9480a.lineTo(0.0f, 0.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.clipPath(this.f9480a);
        super.onDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 1073741824 && mode == 1073741824) {
            a(size, size2);
        }
    }

    public void setRadius(int i) {
        this.f9481b = i;
    }
}
