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
public final class C0245u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3057b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0245u f3058c;

    /* renamed from: a, reason: collision with root package name */
    public M0 f3059a;

    public static synchronized C0245u a() {
        C0245u c0245u;
        synchronized (C0245u.class) {
            try {
                if (f3058c == null) {
                    d();
                }
                c0245u = f3058c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0245u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0245u.class) {
            e2 = M0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0245u.class) {
            if (f3058c == null) {
                C0245u c0245u = new C0245u();
                f3058c = c0245u;
                c0245u.f3059a = M0.b();
                M0 m02 = f3058c.f3059a;
                C0243t c0243t = new C0243t();
                synchronized (m02) {
                    m02.f2892e = c0243t;
                }
            }
        }
    }

    public static void e(Drawable drawable, T0 t02, int[] iArr) {
        PorterDuff.Mode mode = M0.f2887f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = t02.f2920b;
        if (!z2 && !t02.f2919a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) t02.f2921c : null;
        PorterDuff.Mode mode2 = t02.f2919a ? (PorterDuff.Mode) t02.d : M0.f2887f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = M0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3059a.c(context, i);
    }
}
