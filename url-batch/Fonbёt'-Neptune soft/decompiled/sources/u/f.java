package u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import w0.j;

/* loaded from: classes.dex */
public final class f extends Drawable implements Drawable.Callback, e, d {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3462k = PorterDuff.Mode.SRC_IN;

    /* renamed from: l, reason: collision with root package name */
    public static Method f3463l;

    /* renamed from: e, reason: collision with root package name */
    public int f3464e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3465f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3466g;

    /* renamed from: h, reason: collision with root package name */
    public g f3467h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3468i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3469j;

    public static void a() {
        if (f3463l == null) {
            try {
                f3463l = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3469j;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final g c() {
        g gVar = this.f3467h;
        g gVar2 = new g();
        gVar2.f3472c = null;
        gVar2.f3473d = f3462k;
        if (gVar != null) {
            gVar2.f3470a = gVar.f3470a;
            gVar2.f3471b = gVar.f3471b;
            gVar2.f3472c = gVar.f3472c;
            gVar2.f3473d = gVar.f3473d;
        }
        return gVar2;
    }

    public final boolean d(int[] iArr) {
        return i(iArr) || this.f3469j.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f3469j.draw(canvas);
    }

    public final void e(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final void f(ColorStateList colorStateList) {
        this.f3467h.f3472c = colorStateList;
        i(this.f3469j.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f3467h.f3473d = mode;
        i(this.f3469j.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        g gVar = this.f3467h;
        return changingConfigurations | (gVar != null ? gVar.getChangingConfigurations() : 0) | this.f3469j.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        g gVar = this.f3467h;
        if (gVar == null || gVar.f3471b == null) {
            return null;
        }
        gVar.f3470a = getChangingConfigurations();
        return this.f3467h;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3469j.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f3469j.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3469j.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3469j.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return j.a(this.f3469j);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f3469j.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f3469j.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3469j.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f3469j.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f3469j.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f3469j.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f3469j.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f3469j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3469j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            g gVar = this.f3467h;
            if (gVar != null) {
                gVar.f3471b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (!b()) {
            return false;
        }
        g gVar = this.f3467h;
        ColorStateList colorStateList = gVar.f3472c;
        PorterDuff.Mode mode = gVar.f3473d;
        if (colorStateList == null || mode == null) {
            this.f3466g = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f3466g || colorForState != this.f3464e || mode != this.f3465f) {
                setColorFilter(colorForState, mode);
                this.f3464e = colorForState;
                this.f3465f = mode;
                this.f3466g = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3469j.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f3469j;
        if (drawable == null || (method = f3463l) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e2) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        g gVar;
        ColorStateList colorStateList = (!b() || (gVar = this.f3467h) == null) ? null : gVar.f3472c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3469j.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3469j.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f3468i && super.mutate() == this) {
            this.f3467h = c();
            Drawable drawable = this.f3469j;
            if (drawable != null) {
                drawable.mutate();
            }
            g gVar = this.f3467h;
            if (gVar != null) {
                Drawable drawable2 = this.f3469j;
                gVar.f3471b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3468i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3469j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        Drawable drawable = this.f3469j;
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(drawable, i2);
        }
        if (!j.f3558b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                j.f3557a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            j.f3558b = true;
        }
        Method method = j.f3557a;
        if (method == null) {
            return false;
        }
        try {
            method.invoke(drawable, Integer.valueOf(i2));
            return true;
        } catch (Exception e3) {
            Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
            j.f3557a = null;
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.f3469j.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f3469j.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f3469j.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.f3469j.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3469j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f3469j.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f3469j.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        this.f3469j.setHotspot(f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f3469j.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        if (b()) {
            e(i2);
        } else {
            this.f3469j.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f3469j.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f3469j.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f3469j.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
