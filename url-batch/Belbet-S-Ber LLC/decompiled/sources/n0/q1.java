package n0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class q1 extends p1 {

    /* renamed from: w, reason: collision with root package name */
    public static final v1 f2822w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2822w = v1.g(null, windowInsets);
    }

    public q1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
    }

    @Override // n0.o1, n0.k1, n0.s1
    public f0.c h(int i) {
        Insets insets;
        insets = this.f2797c.getInsets(u1.a(i));
        return f0.c.d(insets);
    }

    @Override // n0.o1, n0.k1, n0.s1
    public f0.c i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f2797c.getInsetsIgnoringVisibility(u1.a(i));
        return f0.c.d(insetsIgnoringVisibility);
    }

    @Override // n0.k1, n0.s1
    public void o(View view) {
    }
}
