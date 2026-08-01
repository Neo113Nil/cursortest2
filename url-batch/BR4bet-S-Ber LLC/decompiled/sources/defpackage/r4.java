package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r4 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static r4 c;
    public h30 a;

    public static synchronized r4 a() {
        r4 r4Var;
        synchronized (r4.class) {
            try {
                if (c == null) {
                    d();
                }
                r4Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r4Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (r4.class) {
            e = h30.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (r4.class) {
            if (c == null) {
                r4 r4Var = new r4();
                c = r4Var;
                r4Var.a = h30.b();
                h30 h30Var = c.a;
                o1 o1Var = new o1();
                synchronized (h30Var) {
                    h30Var.e = o1Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, cd cdVar, int[] iArr) {
        PorterDuff.Mode mode = h30.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = cdVar.b;
        if (!z && !cdVar.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) cdVar.c : null;
        PorterDuff.Mode mode2 = cdVar.a ? (PorterDuff.Mode) cdVar.d : h30.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = h30.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
