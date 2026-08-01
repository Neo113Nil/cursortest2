package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2548b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static r f2549c;

    /* renamed from: a, reason: collision with root package name */
    public j2 f2550a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f2549c == null) {
                    d();
                }
                rVar = f2549c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        synchronized (r.class) {
            e4 = j2.e(i, mode);
        }
        return e4;
    }

    public static synchronized void d() {
        synchronized (r.class) {
            if (f2549c == null) {
                r rVar = new r();
                f2549c = rVar;
                rVar.f2550a = j2.b();
                j2 j2Var = f2549c.f2550a;
                a4.h hVar = new a4.h();
                synchronized (j2Var) {
                    j2Var.f2490e = hVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, q2 q2Var, int[] iArr) {
        PorterDuff.Mode mode = j2.f2485f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = q2Var.f2546b;
        if (!z4 && !q2Var.f2545a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) q2Var.f2547c : null;
        PorterDuff.Mode mode2 = q2Var.f2545a ? (PorterDuff.Mode) q2Var.d : j2.f2485f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = j2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f2550a.c(context, i);
    }
}
