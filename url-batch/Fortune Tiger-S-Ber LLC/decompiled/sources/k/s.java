package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2640b = PorterDuff.Mode.SRC_IN;
    public static s c;

    /* renamed from: a, reason: collision with root package name */
    public j2 f2641a;

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            try {
                if (c == null) {
                    d();
                }
                sVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public static synchronized PorterDuffColorFilter c(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        synchronized (s.class) {
            e4 = j2.e(i4, mode);
        }
        return e4;
    }

    public static synchronized void d() {
        synchronized (s.class) {
            if (c == null) {
                s sVar = new s();
                c = sVar;
                sVar.f2641a = j2.b();
                j2 j2Var = c.f2641a;
                j3.g gVar = new j3.g();
                synchronized (j2Var) {
                    j2Var.f2566e = gVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, c3.g gVar, int[] iArr) {
        PorterDuff.Mode mode = j2.f2562f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = gVar.f1048b;
        if (!z3 && !gVar.f1047a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? (ColorStateList) gVar.c : null;
        PorterDuff.Mode mode2 = gVar.f1047a ? (PorterDuff.Mode) gVar.f1049d : j2.f2562f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = j2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i4) {
        return this.f2641a.c(context, i4);
    }
}
