package U;

import android.graphics.Rect;
import android.view.View;
import g0.C0138y;
import g0.L;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f843a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f844b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f845c;

    public g(L l2) {
        this.f843a = Integer.MIN_VALUE;
        this.f845c = new Rect();
        this.f844b = l2;
    }

    public static g a(L l2, int i) {
        if (i == 0) {
            return new C0138y(l2, 0);
        }
        if (i == 1) {
            return new C0138y(l2, 1);
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
        if (Integer.MIN_VALUE == this.f843a) {
            return 0;
        }
        return l() - this.f843a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f843a = 0;
        this.f845c = new d();
        this.f844b = iVar;
    }
}
