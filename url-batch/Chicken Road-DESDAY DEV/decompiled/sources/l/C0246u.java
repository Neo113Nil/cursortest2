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
public final class C0246u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3004b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0246u f3005c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3006a;

    public static synchronized C0246u a() {
        C0246u c0246u;
        synchronized (C0246u.class) {
            try {
                if (f3005c == null) {
                    d();
                }
                c0246u = f3005c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0246u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0246u.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0246u.class) {
            if (f3005c == null) {
                C0246u c0246u = new C0246u();
                f3005c = c0246u;
                c0246u.f3006a = N0.b();
                N0 n0 = f3005c.f3006a;
                C0244t c0244t = new C0244t();
                synchronized (n0) {
                    n0.f2841e = c0244t;
                }
            }
        }
    }

    public static void e(Drawable drawable, U0 u02, int[] iArr) {
        PorterDuff.Mode mode = N0.f2836f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = u02.f2868b;
        if (!z2 && !u02.f2867a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) u02.f2869c : null;
        PorterDuff.Mode mode2 = u02.f2867a ? (PorterDuff.Mode) u02.d : N0.f2836f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3006a.c(context, i);
    }
}
