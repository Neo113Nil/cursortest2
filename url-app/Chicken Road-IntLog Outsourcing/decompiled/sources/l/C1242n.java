package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242n {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f10908b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1242n f10909c;

    /* renamed from: a, reason: collision with root package name */
    public M f10910a;

    public static synchronized void b() {
        synchronized (C1242n.class) {
            if (f10909c == null) {
                C1242n c1242n = new C1242n();
                f10909c = c1242n;
                c1242n.f10910a = M.b();
                M m6 = f10909c.f10910a;
                M0.e eVar = new M0.e(5);
                synchronized (m6) {
                    m6.f10804e = eVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, T4.h hVar, int[] iArr) {
        PorterDuff.Mode mode = M.f10797f;
        if (AbstractC1250w.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = hVar.f2877b;
        if (!z && !hVar.f2876a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) hVar.f2878c : null;
        PorterDuff.Mode mode2 = hVar.f2876a ? (PorterDuff.Mode) hVar.f2879d : M.f10797f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = M.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f10910a.c(context, i2);
    }
}
