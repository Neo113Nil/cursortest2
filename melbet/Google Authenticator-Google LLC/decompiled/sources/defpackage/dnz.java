package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnz extends dnu {
    public static final dmj a = dmj.a;
    public final float d;
    public float e;
    public ColorStateList f;
    private final Drawable g;
    private ColorStateList h;

    public dnz(Drawable drawable, float f) {
        this.g = drawable.mutate();
        this.d = f;
    }

    @Override // defpackage.dnu
    protected final Animator a(boolean z) {
        Integer valueOf;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
        ColorStateList colorStateList = this.h;
        if (colorStateList == null) {
            valueOf = null;
        } else {
            int[] iArr = dob.a;
            valueOf = Integer.valueOf(colorStateList.getDefaultColor());
        }
        Integer valueOf2 = colorStateList != null ? Integer.valueOf(dob.a(colorStateList)) : null;
        ColorStateList b = dob.b(colorStateList);
        ColorStateList c = dob.c(colorStateList);
        ofFloat.addUpdateListener(new fey(this, colorStateList, valueOf, valueOf2, 1));
        ofFloat.addListener(new dny(this, z, c, b));
        ofFloat.setInterpolator(dmk.a);
        ofFloat.setDuration(200L);
        return ofFloat;
    }

    @Override // defpackage.dnu
    public final void b(ColorStateList colorStateList) {
        this.h = colorStateList;
        this.f = dob.d(colorStateList, StateSet.stateSetMatches(dob.a, getState()));
        invalidateSelf();
    }

    @Override // defpackage.dnu
    public final void c(PorterDuff.Mode mode) {
        this.g.setTintMode(mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            Drawable drawable = this.g;
            drawable.setTintList(this.f);
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.rotate(this.e, exactCenterX, exactCenterY);
            drawable.draw(canvas);
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
        this.g.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g.setAlpha(i);
        invalidateSelf();
    }
}
