package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class fs extends GradientDrawable {
    private final Paint fs;
    protected Path zmn;

    public fs() {
        this.zmn = new Path();
        Paint paint = new Paint(1);
        this.fs = paint;
        paint.setColor(-1);
    }

    public fs(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.zmn = new Path();
        Paint paint = new Paint(1);
        this.fs = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.zmn;
        if (path == null || path.isEmpty()) {
            zmn(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.fs, 31);
        zmn(canvas);
        this.fs.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.zmn, this.fs);
        this.fs.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    protected void zmn(Canvas canvas) {
        super.draw(canvas);
    }

    public void zmn(int i, int i2, int i3, int i4) {
        this.zmn.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }
}
