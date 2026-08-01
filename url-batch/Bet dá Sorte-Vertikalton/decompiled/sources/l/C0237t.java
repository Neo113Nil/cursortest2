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
public final class C0237t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3033b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0237t f3034c;

    /* renamed from: a, reason: collision with root package name */
    public L0 f3035a;

    public static synchronized C0237t a() {
        C0237t c0237t;
        synchronized (C0237t.class) {
            try {
                if (f3034c == null) {
                    d();
                }
                c0237t = f3034c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0237t;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0237t.class) {
            e2 = L0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0237t.class) {
            if (f3034c == null) {
                C0237t c0237t = new C0237t();
                f3034c = c0237t;
                c0237t.f3035a = L0.b();
                L0 l02 = f3034c.f3035a;
                C0235s c0235s = new C0235s();
                synchronized (l02) {
                    l02.f2871e = c0235s;
                }
            }
        }
    }

    public static void e(Drawable drawable, S0 s02, int[] iArr) {
        PorterDuff.Mode mode = L0.f2866f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = s02.f2899b;
        if (!z2 && !s02.f2898a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) s02.f2900c : null;
        PorterDuff.Mode mode2 = s02.f2898a ? (PorterDuff.Mode) s02.d : L0.f2866f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = L0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3035a.c(context, i);
    }
}
