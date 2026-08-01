package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class ij {
    public int a;
    public final Object b;
    public final Object c;

    public ij(b20 b20Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = b20Var;
    }

    public static ij a(b20 b20Var, int i) {
        if (i == 0) {
            return new pz(b20Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new pz(b20Var, i2);
        }
        g9.i("invalid orientation");
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

    public ij(kj kjVar) {
        this.a = 0;
        this.c = new dg();
        this.b = kjVar;
    }
}
