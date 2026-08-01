package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class hh {
    public int a;
    public final Object b;
    public final Object c;

    public hh(xy xyVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = xyVar;
    }

    public static hh a(xy xyVar, int i) {
        if (i == 0) {
            return new mw(xyVar, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new mw(xyVar, i2);
        }
        t8.k("invalid orientation");
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

    public hh(jh jhVar) {
        this.a = 0;
        this.c = new ke();
        this.b = jhVar;
    }
}
