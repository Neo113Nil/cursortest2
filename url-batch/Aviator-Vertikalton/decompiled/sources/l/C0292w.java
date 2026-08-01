package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292w {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3469b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0292w f3470c;

    /* renamed from: a, reason: collision with root package name */
    public O0 f3471a;

    public static synchronized C0292w a() {
        C0292w c0292w;
        synchronized (C0292w.class) {
            try {
                if (f3470c == null) {
                    d();
                }
                c0292w = f3470c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0292w;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0292w.class) {
            e2 = O0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0292w.class) {
            if (f3470c == null) {
                C0292w c0292w = new C0292w();
                f3470c = c0292w;
                c0292w.f3471a = O0.b();
                O0 o02 = f3470c.f3471a;
                C0290v c0290v = new C0290v();
                synchronized (o02) {
                    o02.f3280e = c0290v;
                }
            }
        }
    }

    public static void e(Drawable drawable, i1.i iVar, int[] iArr) {
        PorterDuff.Mode mode = O0.f3274f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = iVar.f2678b;
        if (!z2 && !iVar.f2677a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) iVar.f2679c : null;
        PorterDuff.Mode mode2 = iVar.f2677a ? (PorterDuff.Mode) iVar.f2680d : O0.f3274f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = O0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3471a.c(context, i);
    }
}
