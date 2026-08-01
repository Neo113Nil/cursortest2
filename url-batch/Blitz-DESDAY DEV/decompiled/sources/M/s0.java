package M;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class s0 extends r0 {

    /* renamed from: q, reason: collision with root package name */
    public static final v0 f588q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f588q = v0.g(null, windowInsets);
    }

    public s0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    @Override // M.o0, M.t0
    public final void d(View view) {
    }

    @Override // M.o0, M.t0
    public E.c f(int i) {
        Insets insets;
        insets = this.f578c.getInsets(u0.a(i));
        return E.c.c(insets);
    }
}
