package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;

/* renamed from: j.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240p {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3024b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0240p f3025c;

    /* renamed from: a, reason: collision with root package name */
    public S f3026a;

    public static synchronized void b() {
        synchronized (C0240p.class) {
            if (f3025c == null) {
                C0240p c0240p = new C0240p();
                f3025c = c0240p;
                c0240p.f3026a = S.d();
                f3025c.f3026a.k(new C0239o());
            }
        }
    }

    public static void c(Drawable drawable, l0 l0Var, int[] iArr) {
        PorterDuff.Mode mode = S.f2904h;
        if (A.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = l0Var.f3003d;
        if (z2 || l0Var.f3002c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z2 ? l0Var.f3000a : null;
            PorterDuff.Mode mode2 = l0Var.f3002c ? l0Var.f3001b : S.f2904h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = S.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable a(Context context, int i2) {
        return this.f3026a.f(context, i2);
    }
}
