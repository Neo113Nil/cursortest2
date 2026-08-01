package K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class w0 extends v0 {

    /* renamed from: q, reason: collision with root package name */
    public static final z0 f512q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f512q = z0.g(null, windowInsets);
    }

    public w0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
    }

    @Override // K.s0, K.x0
    public final void d(View view) {
    }

    @Override // K.s0, K.x0
    public C.c f(int i) {
        Insets insets;
        insets = this.f500c.getInsets(y0.a(i));
        return C.c.c(insets);
    }
}
