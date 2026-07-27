package a1;

import android.view.WindowInsets;

/* renamed from: a1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0376L extends AbstractC0375K {

    /* renamed from: m, reason: collision with root package name */
    public V0.c f4863m;

    public C0376L(C0383T c0383t, WindowInsets windowInsets) {
        super(c0383t, windowInsets);
        this.f4863m = null;
    }

    @Override // a1.C0380P
    public C0383T b() {
        return C0383T.b(null, this.f4858c.consumeStableInsets());
    }

    @Override // a1.C0380P
    public C0383T c() {
        return C0383T.b(null, this.f4858c.consumeSystemWindowInsets());
    }

    @Override // a1.C0380P
    public final V0.c i() {
        if (this.f4863m == null) {
            WindowInsets windowInsets = this.f4858c;
            this.f4863m = V0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4863m;
    }

    @Override // a1.C0380P
    public boolean m() {
        return this.f4858c.isConsumed();
    }

    @Override // a1.C0380P
    public void r(V0.c cVar) {
        this.f4863m = cVar;
    }
}
