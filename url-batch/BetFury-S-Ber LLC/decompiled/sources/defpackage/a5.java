package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a5 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static a5 c;
    public p90 a;

    public static synchronized a5 a() {
        a5 a5Var;
        synchronized (a5.class) {
            try {
                if (c == null) {
                    d();
                }
                a5Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a5Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (a5.class) {
            e = p90.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (a5.class) {
            if (c == null) {
                a5 a5Var = new a5();
                c = a5Var;
                a5Var.a = p90.b();
                p90 p90Var = c.a;
                z4 z4Var = new z4();
                synchronized (p90Var) {
                    p90Var.e = z4Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, me meVar, int[] iArr) {
        PorterDuff.Mode mode = p90.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = meVar.b;
        if (!z && !meVar.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) meVar.c : null;
        PorterDuff.Mode mode2 = meVar.a ? (PorterDuff.Mode) meVar.d : p90.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = p90.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
