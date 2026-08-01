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
public final class C0265v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3056b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0265v f3057c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3058a;

    public static synchronized C0265v a() {
        C0265v c0265v;
        synchronized (C0265v.class) {
            try {
                if (f3057c == null) {
                    d();
                }
                c0265v = f3057c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0265v;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0265v.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0265v.class) {
            if (f3057c == null) {
                C0265v c0265v = new C0265v();
                f3057c = c0265v;
                c0265v.f3058a = N0.b();
                N0 n02 = f3057c.f3058a;
                C0263u c0263u = new C0263u();
                synchronized (n02) {
                    n02.f2892e = c0263u;
                }
            }
        }
    }

    public static void e(Drawable drawable, i1.g gVar, int[] iArr) {
        PorterDuff.Mode mode = N0.f2887f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = gVar.f2427b;
        if (!z2 && !gVar.f2426a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) gVar.f2428c : null;
        PorterDuff.Mode mode2 = gVar.f2426a ? (PorterDuff.Mode) gVar.d : N0.f2887f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3058a.c(context, i);
    }
}
