package L;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class w0 extends v0 {

    /* renamed from: q, reason: collision with root package name */
    public static final z0 f582q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f582q = z0.g(null, windowInsets);
    }

    public w0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
    }

    @Override // L.s0, L.x0
    public final void d(View view) {
    }

    @Override // L.s0, L.x0
    public D.c f(int i) {
        Insets insets;
        insets = this.f570c.getInsets(y0.a(i));
        return D.c.c(insets);
    }
}
