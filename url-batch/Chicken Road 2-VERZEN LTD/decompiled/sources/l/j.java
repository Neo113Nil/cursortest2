package l;

import android.view.WindowInsets;
import h.C0039a;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: m, reason: collision with root package name */
    public C0039a f917m;

    public j(q qVar, WindowInsets windowInsets) {
        super(qVar, windowInsets);
        this.f917m = null;
    }

    @Override // l.o
    public q b() {
        return q.a(null, this.f912c.consumeStableInsets());
    }

    @Override // l.o
    public q c() {
        return q.a(null, this.f912c.consumeSystemWindowInsets());
    }

    @Override // l.o
    public final C0039a g() {
        if (this.f917m == null) {
            WindowInsets windowInsets = this.f912c;
            this.f917m = C0039a.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f917m;
    }

    @Override // l.o
    public boolean k() {
        return this.f912c.isConsumed();
    }

    @Override // l.o
    public void p(C0039a c0039a) {
        this.f917m = c0039a;
    }
}
