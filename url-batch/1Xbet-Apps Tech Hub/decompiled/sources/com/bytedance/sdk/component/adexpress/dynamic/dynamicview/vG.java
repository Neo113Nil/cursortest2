package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* compiled from: DynamicShadowDrawable.java */
/* loaded from: classes.dex */
public class vG extends Drawable {
    private RectF Jd;
    private int icD;
    private Paint pvs;
    private int vG;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public vG(int i, int i2) {
        this.vG = i;
        this.icD = i2;
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setColor(0);
        this.pvs.setAntiAlias(true);
        this.pvs.setShadowLayer(i2, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.pvs.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.icD;
        this.Jd = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.Jd;
        int i = this.vG;
        canvas.drawRoundRect(rectF, i, i, this.pvs);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.pvs.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.pvs.setColorFilter(colorFilter);
    }
}
