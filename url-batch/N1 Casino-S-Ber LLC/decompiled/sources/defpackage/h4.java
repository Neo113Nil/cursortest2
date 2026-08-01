package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h4 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static h4 c;
    public c00 a;

    public static synchronized h4 a() {
        h4 h4Var;
        synchronized (h4.class) {
            try {
                if (c == null) {
                    d();
                }
                h4Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h4Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (h4.class) {
            e = c00.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (h4.class) {
            if (c == null) {
                h4 h4Var = new h4();
                c = h4Var;
                h4Var.a = c00.b();
                c00 c00Var = c.a;
                n1 n1Var = new n1();
                synchronized (c00Var) {
                    c00Var.e = n1Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, cc ccVar, int[] iArr) {
        PorterDuff.Mode mode = c00.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = ccVar.b;
        if (!z && !ccVar.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) ccVar.c : null;
        PorterDuff.Mode mode2 = ccVar.a ? (PorterDuff.Mode) ccVar.d : c00.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = c00.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
