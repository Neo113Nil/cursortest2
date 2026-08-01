package n0;

import android.view.ViewGroup;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3137a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3138b;

    public C0261d(ViewGroup viewGroup) {
        this.f3138b = viewGroup;
    }

    @Override // n0.n, n0.k
    public final void a() {
        h0.g.p(this.f3138b, false);
    }

    @Override // n0.k
    public final void b(m mVar) {
        if (!this.f3137a) {
            h0.g.p(this.f3138b, false);
        }
        mVar.x(this);
    }

    @Override // n0.n, n0.k
    public final void c() {
        h0.g.p(this.f3138b, true);
    }

    @Override // n0.n, n0.k
    public final void f(m mVar) {
        h0.g.p(this.f3138b, false);
        this.f3137a = true;
    }
}
