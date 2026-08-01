package U;

import android.graphics.Rect;
import android.view.View;
import g0.C0158w;
import g0.H;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1086b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1087c;

    public g(H h) {
        this.f1085a = Integer.MIN_VALUE;
        this.f1087c = new Rect();
        this.f1086b = h;
    }

    public static g a(H h, int i) {
        if (i == 0) {
            return new C0158w(h, 0);
        }
        if (i == 1) {
            return new C0158w(h, 1);
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
        if (Integer.MIN_VALUE == this.f1085a) {
            return 0;
        }
        return l() - this.f1085a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f1085a = 0;
        this.f1087c = new d();
        this.f1086b = iVar;
    }
}
