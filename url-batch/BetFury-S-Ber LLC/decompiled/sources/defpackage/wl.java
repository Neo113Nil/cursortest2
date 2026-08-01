package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class wl {
    public int a;
    public final Object b;
    public final Object c;

    public wl(h80 h80Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = h80Var;
    }

    public static wl a(h80 h80Var, int i) {
        if (i == 0) {
            return new g50(h80Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new g50(h80Var, i2);
        }
        s9.k("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public wl(yl ylVar) {
        this.a = 0;
        this.c = new hi();
        this.b = ylVar;
    }
}
