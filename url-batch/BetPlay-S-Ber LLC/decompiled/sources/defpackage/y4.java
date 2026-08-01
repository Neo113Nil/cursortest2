package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class y4 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static y4 c;
    public s00 a;

    public static synchronized y4 a() {
        y4 y4Var;
        synchronized (y4.class) {
            try {
                if (c == null) {
                    d();
                }
                y4Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y4Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (y4.class) {
            e = s00.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (y4.class) {
            if (c == null) {
                y4 y4Var = new y4();
                c = y4Var;
                y4Var.a = s00.b();
                s00 s00Var = c.a;
                x4 x4Var = new x4();
                synchronized (s00Var) {
                    s00Var.e = x4Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, gc gcVar, int[] iArr) {
        PorterDuff.Mode mode = s00.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = gcVar.b;
        if (!z && !gcVar.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) gcVar.c : null;
        PorterDuff.Mode mode2 = gcVar.a ? (PorterDuff.Mode) gcVar.d : s00.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = s00.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
