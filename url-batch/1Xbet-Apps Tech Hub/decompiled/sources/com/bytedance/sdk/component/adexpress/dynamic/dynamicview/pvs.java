package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: BitmapCoverDrawable.java */
/* loaded from: classes.dex */
public class pvs extends icD {
    private final Bitmap vG;
    private final Rect icD = new Rect();
    private final Paint Jd = new Paint(1);

    public pvs(Bitmap bitmap, icD icd) {
        this.vG = bitmap;
        if (icd != null) {
            this.pvs = icd.pvs;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        int width = rect.width();
        int width2 = this.vG.getWidth();
        int height2 = this.vG.getHeight();
        this.icD.set(0, 0, width2, height2);
        if (height2 >= height && width2 >= width) {
            if (width2 > width) {
                this.icD.left = (width2 - width) / 2;
                Rect rect2 = this.icD;
                rect2.right = rect2.left + width;
            }
            if (height2 > height) {
                this.icD.top = (height2 - height) / 2;
                Rect rect3 = this.icD;
                rect3.bottom = rect3.top + height;
                return;
            }
            return;
        }
        float f = height;
        float f2 = f * 1.0f;
        float f3 = height2;
        float f4 = f2 / f3;
        float f5 = width;
        float f6 = 1.0f * f5;
        float f7 = width2;
        if (Math.max(f4, f6 / f7) > f4) {
            int i = (int) ((f2 / f5) * f7);
            this.icD.top = (height2 - i) / 2;
            Rect rect4 = this.icD;
            rect4.bottom = rect4.top + i;
            return;
        }
        int i2 = (int) ((f6 / f) * f3);
        this.icD.left = (width2 - i2) / 2;
        Rect rect5 = this.icD;
        rect5.right = rect5.left + i2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.icD
    protected void pvs(Canvas canvas) {
        canvas.drawBitmap(this.vG, this.icD, getBounds(), this.Jd);
    }
}
