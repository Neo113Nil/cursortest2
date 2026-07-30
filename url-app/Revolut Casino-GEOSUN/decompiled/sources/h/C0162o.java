package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: h.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2247b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0162o f2248c;

    /* renamed from: a, reason: collision with root package name */
    public O f2249a;

    public static synchronized void b() {
        synchronized (C0162o.class) {
            if (f2248c == null) {
                C0162o c0162o = new C0162o();
                f2248c = c0162o;
                c0162o.f2249a = O.b();
                O o2 = f2248c.f2249a;
                d0.d dVar = new d0.d();
                synchronized (o2) {
                    o2.f2137e = dVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, j0 j0Var, int[] iArr) {
        PorterDuff.Mode mode = O.f2130f;
        if (AbstractC0171y.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = j0Var.f2224d;
        if (!z2 && !j0Var.f2223c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? j0Var.f2221a : null;
        PorterDuff.Mode mode2 = j0Var.f2223c ? j0Var.f2222b : O.f2130f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = O.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f2249a.c(context, i2);
    }
}
