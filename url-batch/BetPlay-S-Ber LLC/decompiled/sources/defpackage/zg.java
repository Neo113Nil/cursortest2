package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class zg {
    public int a;
    public final Object b;
    public final Object c;

    public zg(nz nzVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = nzVar;
    }

    public static zg a(nz nzVar, int i) {
        if (i == 0) {
            return new yw(nzVar, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new yw(nzVar, i2);
        }
        o8.j("invalid orientation");
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

    public zg(bh bhVar) {
        this.a = 0;
        this.c = new le();
        this.b = bhVar;
    }
}
