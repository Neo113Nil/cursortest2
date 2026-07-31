package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import e0.C0125d;

/* renamed from: i.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2275b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0168o f2276c;

    /* renamed from: a, reason: collision with root package name */
    public P f2277a;

    public static synchronized void b() {
        synchronized (C0168o.class) {
            if (f2276c == null) {
                C0168o c0168o = new C0168o();
                f2276c = c0168o;
                c0168o.f2277a = P.b();
                P p2 = f2276c.f2277a;
                C0125d c0125d = new C0125d(1);
                synchronized (p2) {
                    p2.f2168e = c0125d;
                }
            }
        }
    }

    public static void c(Drawable drawable, j0 j0Var, int[] iArr) {
        PorterDuff.Mode mode = P.f2161f;
        if (AbstractC0178z.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = j0Var.f2252d;
        if (!z2 && !j0Var.f2251c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? j0Var.f2249a : null;
        PorterDuff.Mode mode2 = j0Var.f2251c ? j0Var.f2250b : P.f2161f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = P.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f2277a.c(context, i2);
    }
}
