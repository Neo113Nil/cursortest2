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
public final class C0239t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3048b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0239t f3049c;

    /* renamed from: a, reason: collision with root package name */
    public L0 f3050a;

    public static synchronized C0239t a() {
        C0239t c0239t;
        synchronized (C0239t.class) {
            try {
                if (f3049c == null) {
                    d();
                }
                c0239t = f3049c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0239t;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0239t.class) {
            e2 = L0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0239t.class) {
            if (f3049c == null) {
                C0239t c0239t = new C0239t();
                f3049c = c0239t;
                c0239t.f3050a = L0.b();
                L0 l02 = f3049c.f3050a;
                C0237s c0237s = new C0237s();
                synchronized (l02) {
                    l02.f2886e = c0237s;
                }
            }
        }
    }

    public static void e(Drawable drawable, S0 s02, int[] iArr) {
        PorterDuff.Mode mode = L0.f2881f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = s02.d;
        if (!z2 && !s02.f2915c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? s02.f2913a : null;
        PorterDuff.Mode mode2 = s02.f2915c ? s02.f2914b : L0.f2881f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = L0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3050a.c(context, i);
    }
}
