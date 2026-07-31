package D;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class V extends T {

    /* renamed from: q, reason: collision with root package name */
    public static final Y f268q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f268q = Y.c(windowInsets, null);
    }

    public V(Y y, WindowInsets windowInsets) {
        super(y, windowInsets);
    }

    @Override // D.P, D.W
    public boolean n(int i7) {
        boolean isVisible;
        isVisible = this.f259c.isVisible(X.a(i7));
        return isVisible;
    }

    @Override // D.P, D.W
    public final void d(View view) {
    }
}
