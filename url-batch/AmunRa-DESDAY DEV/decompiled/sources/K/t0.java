package K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class t0 extends s0 {

    /* renamed from: q, reason: collision with root package name */
    public static final w0 f441q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f441q = w0.g(null, windowInsets);
    }

    public t0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }

    @Override // K.p0, K.u0
    public final void d(View view) {
    }

    @Override // K.p0, K.u0
    public C.c f(int i) {
        Insets insets;
        insets = this.f431c.getInsets(v0.a(i));
        return C.c.c(insets);
    }
}
