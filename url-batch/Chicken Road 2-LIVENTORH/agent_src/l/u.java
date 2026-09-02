package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2465b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static u f2466c;

    /* renamed from: a, reason: collision with root package name */
    public m2 f2467a;

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            try {
                if (f2466c == null) {
                    d();
                }
                uVar = f2466c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        synchronized (u.class) {
            e4 = m2.e(i, mode);
        }
        return e4;
    }

    public static synchronized void d() {
        synchronized (u.class) {
            if (f2466c == null) {
                u uVar = new u();
                f2466c = uVar;
                uVar.f2467a = m2.b();
                m2 m2Var = f2466c.f2467a;
                t tVar = new t();
                synchronized (m2Var) {
                    m2Var.f2394e = tVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, t2 t2Var, int[] iArr) {
        PorterDuff.Mode mode = m2.f2388f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = t2Var.d;
        if (!z3 && !t2Var.f2464c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? t2Var.f2462a : null;
        PorterDuff.Mode mode2 = t2Var.f2464c ? t2Var.f2463b : m2.f2388f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = m2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f2467a.c(context, i);
    }
}
