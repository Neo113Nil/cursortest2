package K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class u0 extends t0 {

    /* renamed from: q, reason: collision with root package name */
    public static final x0 f463q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f463q = x0.g(null, windowInsets);
    }

    public u0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var, windowInsets);
    }

    @Override // K.q0, K.v0
    public final void d(View view) {
    }

    @Override // K.q0, K.v0
    public C.d f(int i) {
        Insets insets;
        insets = this.f452c.getInsets(w0.a(i));
        return C.d.c(insets);
    }
}
