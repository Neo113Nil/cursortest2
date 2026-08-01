package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class TTRatingBar2 extends View {
    private static int icD = 0;
    private static int pvs = -1;
    private static int vG;
    private final Path Jd;
    private int NB;
    private Drawable sUS;
    private float so;
    private Drawable yiw;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Jd = new Path();
        pvs();
    }

    public TTRatingBar2(Context context) {
        super(context);
        this.Jd = new Path();
        pvs();
    }

    private void pvs() {
        Context context = getContext();
        if (pvs < 0) {
            int pvs2 = (int) Pj.pvs(context, 1.0f, false);
            pvs = pvs2;
            icD = pvs2;
            vG = (int) Pj.pvs(context, 3.0f, false);
        }
        this.sUS = uc.vG(context, "tt_star_thick");
        this.yiw = uc.vG(context, "tt_star");
    }

    public void pvs(double d, int i) {
        int pvs2 = (int) Pj.pvs(getContext(), i, false);
        this.NB = pvs2;
        this.sUS.setBounds(0, 0, pvs2, pvs2);
        Drawable drawable = this.yiw;
        int i2 = this.NB;
        drawable.setBounds(0, 0, i2, i2);
        this.so = ((float) d) / 5.0f;
        icD();
        requestLayout();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        icD();
    }

    private void icD() {
        int width = getWidth();
        int height = getHeight();
        if (this.so <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.Jd.reset();
        this.Jd.addRect(new RectF(0.0f, 0.0f, width * this.so, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.NB * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.NB, 1073741824));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.NB <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i = 0; i < 5; i++) {
            this.sUS.draw(canvas);
            canvas.translate(this.NB, 0.0f);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.Jd);
        for (int i2 = 0; i2 < 5; i2++) {
            this.yiw.draw(canvas);
            canvas.translate(this.NB, 0.0f);
        }
    }
}
