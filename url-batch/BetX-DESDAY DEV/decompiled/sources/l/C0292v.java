package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3468b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0292v f3469c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3470a;

    public static synchronized C0292v a() {
        C0292v c0292v;
        synchronized (C0292v.class) {
            try {
                if (f3469c == null) {
                    d();
                }
                c0292v = f3469c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0292v;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0292v.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0292v.class) {
            if (f3469c == null) {
                C0292v c0292v = new C0292v();
                f3469c = c0292v;
                c0292v.f3470a = N0.b();
                N0 n02 = f3469c.f3470a;
                C0290u c0290u = new C0290u();
                synchronized (n02) {
                    n02.f3280e = c0290u;
                }
            }
        }
    }

    public static void e(Drawable drawable, i1.i iVar, int[] iArr) {
        PorterDuff.Mode mode = N0.f3274f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = iVar.f2682b;
        if (!z2 && !iVar.f2681a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) iVar.f2683c : null;
        PorterDuff.Mode mode2 = iVar.f2681a ? (PorterDuff.Mode) iVar.f2684d : N0.f3274f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3470a.c(context, i);
    }
}
