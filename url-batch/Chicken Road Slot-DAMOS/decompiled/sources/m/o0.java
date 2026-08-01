package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 extends Drawable implements Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public Drawable f6144d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6145e;

    public final void a(Canvas canvas) {
        this.f6144d.draw(canvas);
    }

    public final void b(float f3, float f10) {
        this.f6144d.setHotspot(f3, f10);
    }

    public final void c(int i3, int i10, int i11, int i12) {
        this.f6144d.setHotspotBounds(i3, i10, i11, i12);
    }

    public final boolean d(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f6144d.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f6145e) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f6144d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f6144d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6144d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6144d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f6144d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f6144d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f6144d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f6144d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f6144d.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f6144d.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f6144d.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f6144d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f6144d.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6144d.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f6144d.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f6144d.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        this.f6144d.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f6144d.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6144d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f6144d.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f6144d.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f10) {
        if (this.f6145e) {
            b(f3, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i10, int i11, int i12) {
        if (this.f6145e) {
            c(i3, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f6145e) {
            return this.f6144d.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        this.f6144d.setTint(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6144d.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6144d.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f6145e) {
            return d(z10, z11);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
