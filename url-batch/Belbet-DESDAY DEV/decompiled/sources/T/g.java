package T;

import android.graphics.Rect;
import android.view.View;
import f0.C0105w;
import f0.I;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f721b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f722c;

    public g(I i) {
        this.f720a = Integer.MIN_VALUE;
        this.f722c = new Rect();
        this.f721b = i;
    }

    public static g a(I i, int i2) {
        if (i2 == 0) {
            return new C0105w(i, 0);
        }
        if (i2 == 1) {
            return new C0105w(i, 1);
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
        if (Integer.MIN_VALUE == this.f720a) {
            return 0;
        }
        return l() - this.f720a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f720a = 0;
        this.f722c = new d();
        this.f721b = iVar;
    }
}
