package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public class TTCornersWebView extends WebView {
    private int Jd;
    private final float[] NB;
    private int icD;
    private int pvs;
    private int vG;

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.pvs = getMeasuredWidth();
        this.icD = getMeasuredHeight();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        this.vG = getScrollX();
        this.Jd = getScrollY();
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, this.Jd, this.vG + this.pvs, r2 + this.icD), this.NB, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
