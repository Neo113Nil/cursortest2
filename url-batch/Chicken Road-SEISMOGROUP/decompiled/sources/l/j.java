package l;

import android.view.WindowInsets;
import h.C0037a;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: m, reason: collision with root package name */
    public C0037a f970m;

    public j(q qVar, WindowInsets windowInsets) {
        super(qVar, windowInsets);
        this.f970m = null;
    }

    @Override // l.o
    public q b() {
        return q.a(null, this.f965c.consumeStableInsets());
    }

    @Override // l.o
    public q c() {
        return q.a(null, this.f965c.consumeSystemWindowInsets());
    }

    @Override // l.o
    public final C0037a g() {
        if (this.f970m == null) {
            WindowInsets windowInsets = this.f965c;
            this.f970m = C0037a.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f970m;
    }

    @Override // l.o
    public boolean k() {
        return this.f965c.isConsumed();
    }

    @Override // l.o
    public void p(C0037a c0037a) {
        this.f970m = c0037a;
    }
}
