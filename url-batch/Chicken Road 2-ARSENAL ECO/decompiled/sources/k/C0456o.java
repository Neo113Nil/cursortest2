package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456o {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f5070b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0456o f5071c;

    /* renamed from: a, reason: collision with root package name */
    public T f5072a;

    public static synchronized void b() {
        synchronized (C0456o.class) {
            if (f5071c == null) {
                C0456o c0456o = new C0456o();
                f5071c = c0456o;
                c0456o.f5072a = T.b();
                T t6 = f5071c.f5072a;
                D0.h hVar = new D0.h(4);
                synchronized (t6) {
                    t6.f4969e = hVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, X5.h hVar, int[] iArr) {
        PorterDuff.Mode mode = T.f4962f;
        if (AbstractC0441C.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z5 = hVar.f2937b;
        if (!z5 && !hVar.f2936a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z5 ? (ColorStateList) hVar.f2938c : null;
        PorterDuff.Mode mode2 = hVar.f2936a ? (PorterDuff.Mode) hVar.f2939d : T.f4962f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = T.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i7) {
        return this.f5072a.c(context, i7);
    }
}
