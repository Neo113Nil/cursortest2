package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class cyb extends View {
    private Drawable btk;
    private Drawable fb;
    private final boolean fs;
    private float hhw;
    private final Path zmn;
    private int zn;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public cyb(Context context) {
        this(context, false);
    }

    public cyb(Context context, boolean z) {
        super(context);
        this.zmn = new Path();
        this.fs = z;
        zmn();
    }

    private void zmn() {
        Context context = getContext();
        this.fb = doe.zn(context, this.fs ? "tt_star_thick_dark" : "tt_star_thick");
        this.btk = doe.zn(context, "tt_star");
    }

    public void zmn(double d, int i) {
        int zmn = (int) jy.zmn(getContext(), i, false);
        this.zn = zmn;
        this.fb.setBounds(0, 0, zmn, zmn);
        Drawable drawable = this.btk;
        int i2 = this.zn;
        drawable.setBounds(0, 0, i2, i2);
        this.hhw = ((float) d) / 5.0f;
        fs();
        requestLayout();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fs();
    }

    private void fs() {
        int width = getWidth();
        int height = getHeight();
        if (this.hhw <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.zmn.reset();
        this.zmn.addRect(new RectF(0.0f, 0.0f, width * this.hhw, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.zn * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.zn, 1073741824));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.zn <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.fb.draw(canvas);
            canvas.translate(this.zn, 0.0f);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.zmn);
        for (int i2 = 0; i2 < 5; i2++) {
            this.btk.draw(canvas);
            canvas.translate(this.zn, 0.0f);
        }
    }
}
