package a1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: a1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379O extends C0378N {

    /* renamed from: q, reason: collision with root package name */
    public static final C0383T f4867q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4867q = C0383T.b(null, windowInsets);
    }

    public C0379O(C0383T c0383t, WindowInsets windowInsets) {
        super(c0383t, windowInsets);
    }

    @Override // a1.AbstractC0375K, a1.C0380P
    public final void d(View view) {
    }

    @Override // a1.AbstractC0375K, a1.C0380P
    public V0.c f(int i2) {
        Insets insets;
        insets = this.f4858c.getInsets(AbstractC0382S.a(i2));
        return V0.c.c(insets);
    }

    @Override // a1.AbstractC0375K, a1.C0380P
    public V0.c g(int i2) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f4858c.getInsetsIgnoringVisibility(AbstractC0382S.a(i2));
        return V0.c.c(insetsIgnoringVisibility);
    }

    @Override // a1.AbstractC0375K, a1.C0380P
    public boolean o(int i2) {
        boolean isVisible;
        isVisible = this.f4858c.isVisible(AbstractC0382S.a(i2));
        return isVisible;
    }
}
