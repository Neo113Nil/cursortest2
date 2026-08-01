package U;

import android.graphics.Rect;
import android.view.View;
import g0.C0139x;
import g0.J;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f852a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f853b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f854c;

    public g(J j2) {
        this.f852a = Integer.MIN_VALUE;
        this.f854c = new Rect();
        this.f853b = j2;
    }

    public static g a(J j2, int i) {
        if (i == 0) {
            return new C0139x(j2, 0);
        }
        if (i == 1) {
            return new C0139x(j2, 1);
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
        if (Integer.MIN_VALUE == this.f852a) {
            return 0;
        }
        return l() - this.f852a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f852a = 0;
        this.f854c = new d();
        this.f853b = iVar;
    }
}
