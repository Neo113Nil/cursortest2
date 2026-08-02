package e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import u.AbstractC0309a;
import w0.j;

/* loaded from: classes.dex */
public abstract class f extends Drawable implements Drawable.Callback {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f2162q = 0;

    /* renamed from: e, reason: collision with root package name */
    public b f2163e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f2164f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f2165g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f2166h;

    /* renamed from: i, reason: collision with root package name */
    public int f2167i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2168j;

    /* renamed from: k, reason: collision with root package name */
    public int f2169k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2170l;

    /* renamed from: m, reason: collision with root package name */
    public F.b f2171m;

    /* renamed from: n, reason: collision with root package name */
    public long f2172n;

    /* renamed from: o, reason: collision with root package name */
    public long f2173o;

    /* renamed from: p, reason: collision with root package name */
    public S.b f2174p;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        boolean z3;
        Drawable drawable;
        boolean z4 = true;
        this.f2168j = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f2165g;
        if (drawable2 != null) {
            long j2 = this.f2172n;
            if (j2 != 0) {
                if (j2 > uptimeMillis) {
                    drawable2.setAlpha(((255 - (((int) ((j2 - uptimeMillis) * 255)) / this.f2163e.f2149y)) * this.f2167i) / 255);
                    z3 = true;
                    drawable = this.f2166h;
                    if (drawable == null) {
                        long j3 = this.f2173o;
                        if (j3 != 0) {
                            if (j3 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j3 - uptimeMillis) * 255)) / this.f2163e.f2150z) * this.f2167i) / 255);
                                if (z2 && z4) {
                                    scheduleSelf(this.f2171m, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f2166h = null;
                            this.f2173o = 0L;
                        }
                    } else {
                        this.f2173o = 0L;
                    }
                    z4 = z3;
                    if (z2) {
                        return;
                    } else {
                        return;
                    }
                }
                drawable2.setAlpha(this.f2167i);
                this.f2172n = 0L;
            }
        } else {
            this.f2172n = 0L;
        }
        z3 = false;
        drawable = this.f2166h;
        if (drawable == null) {
        }
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f2163e;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i2 = bVar.f2133h;
        Drawable[] drawableArr = bVar.f2132g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i3].applyTheme(theme);
                bVar.f2130e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f2127b = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = bVar.f2128c;
            bVar.f2128c = i4;
            if (i5 != i4) {
                bVar.f2138m = false;
                bVar.f2135j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        int layoutDirection;
        if (this.f2174p == null) {
            this.f2174p = new S.b();
        }
        S.b bVar = this.f2174p;
        bVar.f997f = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f2163e.f2149y <= 0 && this.f2168j) {
                drawable.setAlpha(this.f2167i);
            }
            b bVar2 = this.f2163e;
            if (bVar2.f2119C) {
                drawable.setColorFilter(bVar2.f2118B);
            } else {
                if (bVar2.f2122F) {
                    AbstractC0309a.h(drawable, bVar2.f2120D);
                }
                b bVar3 = this.f2163e;
                if (bVar3.f2123G) {
                    AbstractC0309a.i(drawable, bVar3.f2121E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2163e.f2147w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                layoutDirection = getLayoutDirection();
                drawable.setLayoutDirection(layoutDirection);
            }
            drawable.setAutoMirrored(this.f2163e.f2117A);
            Rect rect = this.f2164f;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            S.b bVar4 = this.f2174p;
            Drawable.Callback callback = (Drawable.Callback) bVar4.f997f;
            bVar4.f997f = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            S.b bVar5 = this.f2174p;
            Drawable.Callback callback2 = (Drawable.Callback) bVar5.f997f;
            bVar5.f997f = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i2) {
        F.b bVar;
        if (i2 == this.f2169k) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f2163e.f2150z > 0) {
            Drawable drawable = this.f2166h;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f2165g;
            if (drawable2 != null) {
                this.f2166h = drawable2;
                this.f2173o = this.f2163e.f2150z + uptimeMillis;
            } else {
                this.f2166h = null;
                this.f2173o = 0L;
            }
        } else {
            Drawable drawable3 = this.f2165g;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            b bVar2 = this.f2163e;
            if (i2 < bVar2.f2133h) {
                Drawable d2 = bVar2.d(i2);
                this.f2165g = d2;
                this.f2169k = i2;
                if (d2 != null) {
                    int i3 = this.f2163e.f2149y;
                    if (i3 > 0) {
                        this.f2172n = uptimeMillis + i3;
                    }
                    b(d2);
                }
                if (this.f2172n == 0 || this.f2173o != 0) {
                    bVar = this.f2171m;
                    if (bVar != null) {
                        this.f2171m = new F.b(4, (e) this);
                    } else {
                        unscheduleSelf(bVar);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f2165g = null;
        this.f2169k = -1;
        if (this.f2172n == 0) {
        }
        bVar = this.f2171m;
        if (bVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f2163e.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2166h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2167i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2163e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        b bVar = this.f2163e;
        synchronized (bVar) {
            if (!bVar.f2146u) {
                bVar.c();
                z2 = true;
                bVar.f2146u = true;
                int i2 = bVar.f2133h;
                Drawable[] drawableArr = bVar.f2132g;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        bVar.v = true;
                        break;
                    }
                    if (drawableArr[i3].getConstantState() == null) {
                        bVar.v = false;
                        z2 = false;
                        break;
                    }
                    i3++;
                }
            } else {
                z2 = bVar.v;
            }
        }
        if (!z2) {
            return null;
        }
        this.f2163e.f2129d = getChangingConfigurations();
        return this.f2163e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f2165g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2164f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f2163e;
        if (bVar.f2137l) {
            if (!bVar.f2138m) {
                bVar.b();
            }
            return bVar.f2140o;
        }
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f2163e;
        if (bVar.f2137l) {
            if (!bVar.f2138m) {
                bVar.b();
            }
            return bVar.f2139n;
        }
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f2163e;
        if (bVar.f2137l) {
            if (!bVar.f2138m) {
                bVar.b();
            }
            return bVar.f2142q;
        }
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f2163e;
        if (bVar.f2137l) {
            if (!bVar.f2138m) {
                bVar.b();
            }
            return bVar.f2141p;
        }
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2165g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.f2163e;
        if (bVar.f2143r) {
            return bVar.f2144s;
        }
        bVar.c();
        int i2 = bVar.f2133h;
        Drawable[] drawableArr = bVar.f2132g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        bVar.f2144s = opacity;
        bVar.f2143r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f2163e;
        boolean z2 = false;
        Rect rect2 = null;
        if (!bVar.f2134i) {
            Rect rect3 = bVar.f2136k;
            if (rect3 != null || bVar.f2135j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i2 = bVar.f2133h;
                Drawable[] drawableArr = bVar.f2132g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                bVar.f2135j = true;
                bVar.f2136k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z2 = true;
            }
        } else {
            Drawable drawable = this.f2165g;
            z2 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f2163e.f2117A && j.a(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f2163e;
        if (bVar != null) {
            bVar.f2143r = false;
            bVar.f2145t = false;
        }
        if (drawable != this.f2165g || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f2163e.f2117A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f2166h;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2166h = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f2165g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2168j) {
                this.f2165g.setAlpha(this.f2167i);
            }
        }
        if (this.f2173o != 0) {
            this.f2173o = 0L;
            z2 = true;
        }
        if (this.f2172n != 0) {
            this.f2172n = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2170l && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.f2158t, eVar, null);
            bVar.f2125I = bVar.f2125I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f2170l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2166h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2165g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        b bVar = this.f2163e;
        int i3 = this.f2169k;
        int i4 = bVar.f2133h;
        Drawable[] drawableArr = bVar.f2132g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawable.setLayoutDirection(i2) : false;
                if (i5 == i3) {
                    z2 = layoutDirection;
                }
            }
        }
        bVar.f2148x = i2;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f2166h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2165g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f2165g || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f2168j && this.f2167i == i2) {
            return;
        }
        this.f2168j = true;
        this.f2167i = i2;
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            if (this.f2172n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        b bVar = this.f2163e;
        if (bVar.f2117A != z2) {
            bVar.f2117A = z2;
            Drawable drawable = this.f2165g;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f2163e;
        bVar.f2119C = true;
        if (bVar.f2118B != colorFilter) {
            bVar.f2118B = colorFilter;
            Drawable drawable = this.f2165g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        b bVar = this.f2163e;
        if (bVar.f2147w != z2) {
            bVar.f2147w = z2;
            Drawable drawable = this.f2165g;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            AbstractC0309a.e(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2164f;
        if (rect == null) {
            this.f2164f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2165g;
        if (drawable != null) {
            AbstractC0309a.f(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f2163e;
        bVar.f2122F = true;
        if (bVar.f2120D != colorStateList) {
            bVar.f2120D = colorStateList;
            AbstractC0309a.h(this.f2165g, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f2163e;
        bVar.f2123G = true;
        if (bVar.f2121E != mode) {
            bVar.f2121E = mode;
            AbstractC0309a.i(this.f2165g, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f2166h;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f2165g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2165g || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
