package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2991b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0234t f2992c;

    /* renamed from: a, reason: collision with root package name */
    public M0 f2993a;

    public static synchronized C0234t a() {
        C0234t c0234t;
        synchronized (C0234t.class) {
            try {
                if (f2992c == null) {
                    d();
                }
                c0234t = f2992c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0234t;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0234t.class) {
            e2 = M0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0234t.class) {
            if (f2992c == null) {
                C0234t c0234t = new C0234t();
                f2992c = c0234t;
                c0234t.f2993a = M0.b();
                M0 m02 = f2992c.f2993a;
                C0232s c0232s = new C0232s();
                synchronized (m02) {
                    m02.f2833e = c0232s;
                }
            }
        }
    }

    public static void e(Drawable drawable, T0 t02, int[] iArr) {
        PorterDuff.Mode mode = M0.f2828f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = t02.f2860b;
        if (!z2 && !t02.f2859a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) t02.f2861c : null;
        PorterDuff.Mode mode2 = t02.f2859a ? (PorterDuff.Mode) t02.d : M0.f2828f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = M0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f2993a.c(context, i);
    }
}
