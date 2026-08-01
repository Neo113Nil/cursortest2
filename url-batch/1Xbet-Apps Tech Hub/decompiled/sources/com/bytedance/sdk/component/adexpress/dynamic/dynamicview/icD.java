package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* compiled from: CoverDrawable.java */
/* loaded from: classes.dex */
public class icD extends GradientDrawable {
    private final Paint icD;
    protected Path pvs;

    public icD() {
        this.pvs = new Path();
        Paint paint = new Paint(1);
        this.icD = paint;
        paint.setColor(-1);
    }

    public icD(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.pvs = new Path();
        Paint paint = new Paint(1);
        this.icD = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.pvs;
        if (path == null || path.isEmpty()) {
            pvs(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.icD, 31);
        pvs(canvas);
        this.icD.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.pvs, this.icD);
        this.icD.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    protected void pvs(Canvas canvas) {
        super.draw(canvas);
    }

    public void pvs(int i, int i2, int i3, int i4) {
        this.pvs.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }
}
