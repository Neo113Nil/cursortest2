package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: l.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253p0 extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f3446a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3447b;

    public final void a(Canvas canvas) {
        this.f3446a.draw(canvas);
    }

    public final void b(float f2, float f3) {
        D.a.e(this.f3446a, f2, f3);
    }

    public final void c(int i, int i2, int i3, int i4) {
        D.a.f(this.f3446a, i, i2, i3, i4);
    }

    public final boolean d(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f3446a.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f3447b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f3446a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3446a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3446a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3446a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f3446a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f3446a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3446a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f3446a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f3446a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f3446a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3446a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f3446a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3446a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3446a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f3446a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3446a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f3446a.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f3446a.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3446a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f3446a.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f3446a.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        if (this.f3447b) {
            b(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f3447b) {
            c(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f3447b) {
            return this.f3446a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        D.a.g(this.f3446a, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        D.a.h(this.f3446a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        D.a.i(this.f3446a, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f3447b) {
            return d(z2, z3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
