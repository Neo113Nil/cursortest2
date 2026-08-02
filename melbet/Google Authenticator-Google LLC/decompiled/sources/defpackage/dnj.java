package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dnj extends Drawable {
    public Bitmap a;
    private final Paint b = new Paint(6);
    private final Rect c;
    private final Rect d;
    private final int e;
    private final int f;

    public dnj(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        this.a = bitmap;
        this.e = i3;
        this.f = i4;
        int i6 = i5 * i2;
        this.c = new Rect(0, i6, i, i2 + i6);
        this.d = new Rect(0, 0, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.c, this.d, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap = this.a;
        return (bitmap == null || bitmap.hasAlpha() || this.b.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.b;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
