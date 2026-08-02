package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fis extends Drawable {
    private final Drawable a;
    private final Drawable b;
    private final float[] c;
    private float d;

    public fis(Drawable drawable, Drawable drawable2) {
        Drawable mutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new fir();
        this.a = mutate;
        Drawable mutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new fir();
        this.b = mutate2;
        int layoutDirection = drawable != null ? drawable.getLayoutDirection() : 3;
        int layoutDirection2 = drawable2 != null ? drawable2.getLayoutDirection() : 3;
        mutate.setLayoutDirection(layoutDirection);
        mutate2.setLayoutDirection(layoutDirection2);
        mutate2.setAlpha(0);
        this.c = new float[2];
    }

    public final void a(float f) {
        if (this.d != f) {
            this.d = f;
            float[] fArr = this.c;
            fhr.h(f, fArr);
            this.a.setAlpha((int) (fArr[0] * 255.0f));
            this.b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.a.isStateful() || this.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = this.d;
        Drawable drawable = this.a;
        if (f <= 0.5f) {
            drawable.setAlpha(i);
            this.b.setAlpha(0);
        } else {
            drawable.setAlpha(0);
            this.b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.a.setState(iArr) || this.b.setState(iArr);
    }
}
