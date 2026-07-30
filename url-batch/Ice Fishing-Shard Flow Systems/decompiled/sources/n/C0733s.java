package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733s {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f6879b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0733s f6880c;

    /* renamed from: a, reason: collision with root package name */
    public Q0 f6881a;

    public static synchronized C0733s a() {
        C0733s c0733s;
        synchronized (C0733s.class) {
            try {
                if (f6880c == null) {
                    c();
                }
                c0733s = f6880c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0733s;
    }

    public static synchronized void c() {
        synchronized (C0733s.class) {
            if (f6880c == null) {
                C0733s c0733s = new C0733s();
                f6880c = c0733s;
                c0733s.f6881a = Q0.b();
                Q0 q02 = f6880c.f6881a;
                D6.z zVar = new D6.z(6);
                synchronized (q02) {
                    q02.f6697e = zVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, D6.i iVar, int[] iArr) {
        PorterDuff.Mode mode = Q0.f6690f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0731q0.f6868a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z7 = iVar.f514b;
        if (!z7 && !iVar.f513a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z7 ? (ColorStateList) iVar.f515c : null;
        PorterDuff.Mode mode2 = iVar.f513a ? (PorterDuff.Mode) iVar.f516d : Q0.f6690f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = Q0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f6881a.c(context, i2);
    }
}
