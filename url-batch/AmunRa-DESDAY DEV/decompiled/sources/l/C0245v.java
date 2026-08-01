package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3151b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0245v f3152c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3153a;

    public static synchronized C0245v a() {
        C0245v c0245v;
        synchronized (C0245v.class) {
            try {
                if (f3152c == null) {
                    d();
                }
                c0245v = f3152c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0245v;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0245v.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0245v.class) {
            if (f3152c == null) {
                C0245v c0245v = new C0245v();
                f3152c = c0245v;
                c0245v.f3153a = N0.b();
                N0 n0 = f3152c.f3153a;
                C0243u c0243u = new C0243u();
                synchronized (n0) {
                    n0.f2987e = c0243u;
                }
            }
        }
    }

    public static void e(Drawable drawable, k1.h hVar, int[] iArr) {
        PorterDuff.Mode mode = N0.f2982f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = hVar.f2803b;
        if (!z2 && !hVar.f2802a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) hVar.f2804c : null;
        PorterDuff.Mode mode2 = hVar.f2802a ? (PorterDuff.Mode) hVar.d : N0.f2982f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3153a.c(context, i);
    }
}
