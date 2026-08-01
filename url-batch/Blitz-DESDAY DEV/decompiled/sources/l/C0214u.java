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
public final class C0214u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3077b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0214u f3078c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3079a;

    public static synchronized C0214u a() {
        C0214u c0214u;
        synchronized (C0214u.class) {
            try {
                if (f3078c == null) {
                    d();
                }
                c0214u = f3078c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0214u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0214u.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0214u.class) {
            if (f3078c == null) {
                C0214u c0214u = new C0214u();
                f3078c = c0214u;
                c0214u.f3079a = N0.b();
                N0 n02 = f3078c.f3079a;
                C0212t c0212t = new C0212t();
                synchronized (n02) {
                    n02.f2914e = c0212t;
                }
            }
        }
    }

    public static void e(Drawable drawable, U0 u02, int[] iArr) {
        PorterDuff.Mode mode = N0.f2909f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = u02.f2941b;
        if (!z2 && !u02.f2940a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) u02.f2942c : null;
        PorterDuff.Mode mode2 = u02.f2940a ? (PorterDuff.Mode) u02.d : N0.f2909f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3079a.c(context, i);
    }
}
