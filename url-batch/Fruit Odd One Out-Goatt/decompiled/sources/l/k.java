package l;

import android.view.WindowInsets;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class k extends j {
    public h.a m;

    public k(r rVar, WindowInsets windowInsets) {
        super(rVar, windowInsets);
        this.m = null;
    }

    @Override // l.p
    public r b() {
        return r.a(this.f748c.consumeStableInsets());
    }

    @Override // l.p
    public r c() {
        return r.a(this.f748c.consumeSystemWindowInsets());
    }

    @Override // l.p
    public final h.a g() {
        if (this.m == null) {
            WindowInsets windowInsets = this.f748c;
            this.m = h.a.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // l.p
    public boolean k() {
        return this.f748c.isConsumed();
    }

    @Override // l.p
    public void p(h.a aVar) {
        this.m = aVar;
    }
}
