package T;

import android.graphics.Rect;
import android.view.View;
import f0.C0116w;
import f0.H;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public int f812a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f813b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f814c;

    public h(H h) {
        this.f812a = Integer.MIN_VALUE;
        this.f814c = new Rect();
        this.f813b = h;
    }

    public static h a(H h, int i) {
        if (i == 0) {
            return new C0116w(h, 0);
        }
        if (i == 1) {
            return new C0116w(h, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
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

    public int m() {
        if (Integer.MIN_VALUE == this.f812a) {
            return 0;
        }
        return l() - this.f812a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public h(j jVar) {
        this.f812a = 0;
        this.f814c = new e();
        this.f813b = jVar;
    }
}
