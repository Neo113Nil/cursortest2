package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3715b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0302u f3716c;

    /* renamed from: a, reason: collision with root package name */
    public P0 f3717a;

    public static synchronized C0302u a() {
        C0302u c0302u;
        synchronized (C0302u.class) {
            try {
                if (f3716c == null) {
                    d();
                }
                c0302u = f3716c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0302u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (C0302u.class) {
            e = P0.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (C0302u.class) {
            if (f3716c == null) {
                C0302u c0302u = new C0302u();
                f3716c = c0302u;
                c0302u.f3717a = P0.b();
                P0 p02 = f3716c.f3717a;
                G1.h hVar = new G1.h();
                synchronized (p02) {
                    p02.e = hVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, Y0 y02, int[] iArr) {
        PorterDuff.Mode mode = P0.f3503f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = y02.f3590b;
        if (!z2 && !y02.f3589a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) y02.f3591c : null;
        PorterDuff.Mode mode2 = y02.f3589a ? (PorterDuff.Mode) y02.f3592d : P0.f3503f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = P0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3717a.c(context, i);
    }
}
