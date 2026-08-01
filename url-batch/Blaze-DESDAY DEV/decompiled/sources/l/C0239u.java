package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3021b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0239u f3022c;

    /* renamed from: a, reason: collision with root package name */
    public M0 f3023a;

    public static synchronized C0239u a() {
        C0239u c0239u;
        synchronized (C0239u.class) {
            try {
                if (f3022c == null) {
                    d();
                }
                c0239u = f3022c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0239u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0239u.class) {
            e2 = M0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0239u.class) {
            if (f3022c == null) {
                C0239u c0239u = new C0239u();
                f3022c = c0239u;
                c0239u.f3023a = M0.b();
                M0 m02 = f3022c.f3023a;
                C0237t c0237t = new C0237t();
                synchronized (m02) {
                    m02.f2856e = c0237t;
                }
            }
        }
    }

    public static void e(Drawable drawable, T0 t02, int[] iArr) {
        PorterDuff.Mode mode = M0.f2851f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = t02.f2884b;
        if (!z2 && !t02.f2883a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) t02.f2885c : null;
        PorterDuff.Mode mode2 = t02.f2883a ? (PorterDuff.Mode) t02.d : M0.f2851f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = M0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3023a.c(context, i);
    }
}
