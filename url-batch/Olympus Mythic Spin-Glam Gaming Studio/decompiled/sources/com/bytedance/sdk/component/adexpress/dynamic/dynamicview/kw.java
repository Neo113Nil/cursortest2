package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class kw extends Drawable {
    private RectF fb;
    private int fs;
    private Paint zmn;
    private int zn;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public kw(int i, int i2) {
        this.zn = i;
        this.fs = i2;
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setColor(0);
        this.zmn.setAntiAlias(true);
        this.zmn.setShadowLayer(i2, 0.0f, 0.0f, -16777216);
        this.zmn.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.fs;
        this.fb = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.fb;
        int i = this.zn;
        canvas.drawRoundRect(rectF, i, i, this.zmn);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.zmn.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.zmn.setColorFilter(colorFilter);
    }
}
