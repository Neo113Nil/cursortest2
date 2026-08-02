package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hx {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static hx b;
    private ls c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b2;
        synchronized (hx.class) {
            b2 = ls.b(i, mode);
        }
        return b2;
    }

    public static synchronized hx d() {
        hx hxVar;
        synchronized (hx.class) {
            if (b == null) {
                f();
            }
            hxVar = b;
        }
        return hxVar;
    }

    public static synchronized void f() {
        synchronized (hx.class) {
            if (b == null) {
                hx hxVar = new hx();
                b = hxVar;
                hxVar.c = ls.e();
                b.c.h(new car());
            }
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
