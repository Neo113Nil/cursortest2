package M;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class q0 extends p0 {

    /* renamed from: q, reason: collision with root package name */
    public static final t0 f786q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f786q = t0.g(null, windowInsets);
    }

    public q0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
    }

    @Override // M.m0, M.r0
    public final void d(View view) {
    }

    @Override // M.m0, M.r0
    public E.c f(int i) {
        Insets insets;
        insets = this.f776c.getInsets(s0.a(i));
        return E.c.c(insets);
    }
}
