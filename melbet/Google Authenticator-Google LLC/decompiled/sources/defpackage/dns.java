package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dns extends dnu {
    public float a;
    private final Drawable d;
    private final Drawable e;
    private float f = 1.0f;

    public dns(Drawable drawable, Drawable drawable2) {
        this.d = drawable.mutate();
        this.e = drawable2.mutate();
    }

    @Override // defpackage.dnu
    protected final Animator a(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new mu(this, 5, null));
        ofFloat.setInterpolator(dmk.a);
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    @Override // defpackage.dnu
    public final void b(ColorStateList colorStateList) {
        this.d.setTintList(dob.c(colorStateList));
        this.e.setTintList(dob.b(colorStateList));
        invalidateSelf();
    }

    @Override // defpackage.dnu
    public final void c(PorterDuff.Mode mode) {
        this.d.setTintMode(mode);
        this.e.setTintMode(mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            float f = this.a;
            int round = Math.round((((1.0f - f) * 0.0f) + (f * 255.0f)) * this.f);
            float f2 = this.a;
            float f3 = (((1.0f - f2) * 255.0f) + (f2 * 0.0f)) * this.f;
            Drawable drawable = this.d;
            int round2 = Math.round(f3);
            drawable.setAlpha(round);
            Drawable drawable2 = this.e;
            drawable2.setAlpha(round2);
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            float f4 = this.a;
            canvas.rotate(((1.0f - f4) * 180.0f) + (f4 * 360.0f), exactCenterX, exactCenterY);
            drawable.draw(canvas);
            canvas.restore();
            canvas.save();
            float f5 = this.a;
            canvas.rotate(((1.0f - f5) * 0.0f) + (f5 * 180.0f), exactCenterX, exactCenterY);
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.d.setBounds(rect);
        this.e.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = i / 255.0f;
        if (this.f != f) {
            this.f = f;
            invalidateSelf();
        }
    }
}
