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
public final class C0260t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3467b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0260t f3468c;

    /* renamed from: a, reason: collision with root package name */
    public L0 f3469a;

    public static synchronized C0260t a() {
        C0260t c0260t;
        synchronized (C0260t.class) {
            try {
                if (f3468c == null) {
                    d();
                }
                c0260t = f3468c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0260t;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0260t.class) {
            e2 = L0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0260t.class) {
            if (f3468c == null) {
                C0260t c0260t = new C0260t();
                f3468c = c0260t;
                c0260t.f3469a = L0.b();
                L0 l02 = f3468c.f3469a;
                G1.h hVar = new G1.h();
                synchronized (l02) {
                    l02.f3309e = hVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, S0 s0, int[] iArr) {
        PorterDuff.Mode mode = L0.f3304f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = s0.f3337b;
        if (!z2 && !s0.f3336a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) s0.f3338c : null;
        PorterDuff.Mode mode2 = s0.f3336a ? (PorterDuff.Mode) s0.d : L0.f3304f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = L0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3469a.c(context, i);
    }
}
