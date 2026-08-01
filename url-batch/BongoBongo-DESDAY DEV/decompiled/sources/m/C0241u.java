package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3186b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0241u f3187c;

    /* renamed from: a, reason: collision with root package name */
    public Q0 f3188a;

    public static synchronized C0241u a() {
        C0241u c0241u;
        synchronized (C0241u.class) {
            try {
                if (f3187c == null) {
                    d();
                }
                c0241u = f3187c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0241u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0241u.class) {
            e2 = Q0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0241u.class) {
            if (f3187c == null) {
                C0241u c0241u = new C0241u();
                f3187c = c0241u;
                c0241u.f3188a = Q0.b();
                Q0 q02 = f3187c.f3188a;
                C0239t c0239t = new C0239t();
                synchronized (q02) {
                    q02.f2987e = c0239t;
                }
            }
        }
    }

    public static void e(Drawable drawable, Z0 z02, int[] iArr) {
        PorterDuff.Mode mode = Q0.f2981f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = z02.f3063b;
        if (!z2 && !z02.f3062a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) z02.f3064c : null;
        PorterDuff.Mode mode2 = z02.f3062a ? (PorterDuff.Mode) z02.d : Q0.f2981f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = Q0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3188a.c(context, i);
    }
}
