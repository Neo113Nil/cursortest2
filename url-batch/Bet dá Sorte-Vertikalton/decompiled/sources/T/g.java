package T;

import android.graphics.Rect;
import android.view.View;
import f0.C0108w;
import f0.I;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f785a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f786b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f787c;

    public g(I i) {
        this.f785a = Integer.MIN_VALUE;
        this.f787c = new Rect();
        this.f786b = i;
    }

    public static g a(I i, int i2) {
        if (i2 == 0) {
            return new C0108w(i, 0);
        }
        if (i2 == 1) {
            return new C0108w(i, 1);
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
        if (Integer.MIN_VALUE == this.f785a) {
            return 0;
        }
        return l() - this.f785a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f785a = 0;
        this.f787c = new d();
        this.f786b = iVar;
    }
}
