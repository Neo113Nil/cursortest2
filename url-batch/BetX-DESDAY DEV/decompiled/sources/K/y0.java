package K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class y0 extends x0 {

    /* renamed from: q, reason: collision with root package name */
    public static final B0 f518q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f518q = B0.g(null, windowInsets);
    }

    public y0(B0 b02, WindowInsets windowInsets) {
        super(b02, windowInsets);
    }

    @Override // K.u0, K.z0
    public final void d(View view) {
    }

    @Override // K.u0, K.z0
    public C.d f(int i) {
        Insets insets;
        insets = this.f506c.getInsets(A0.a(i));
        return C.d.c(insets);
    }
}
