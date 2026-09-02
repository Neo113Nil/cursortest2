package n0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m1 extends l1 {

    /* renamed from: s, reason: collision with root package name */
    public static final q1 f2763s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2763s = q1.g(null, windowInsets);
    }

    public m1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var, windowInsets);
    }

    @Override // n0.k1, n0.g1, n0.n1
    public f0.c f(int i) {
        Insets insets;
        insets = this.f2739c.getInsets(p1.a(i));
        return f0.c.d(insets);
    }

    @Override // n0.k1, n0.g1, n0.n1
    public f0.c g(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f2739c.getInsetsIgnoringVisibility(p1.a(i));
        return f0.c.d(insetsIgnoringVisibility);
    }
}
