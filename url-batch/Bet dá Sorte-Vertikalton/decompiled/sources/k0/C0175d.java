package k0;

import android.view.ViewGroup;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2740a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2741b;

    public C0175d(ViewGroup viewGroup) {
        this.f2741b = viewGroup;
    }

    @Override // k0.n, k0.k
    public final void a() {
        w.r(this.f2741b, false);
    }

    @Override // k0.k
    public final void b(m mVar) {
        if (!this.f2740a) {
            w.r(this.f2741b, false);
        }
        mVar.x(this);
    }

    @Override // k0.n, k0.k
    public final void c() {
        w.r(this.f2741b, true);
    }

    @Override // k0.n, k0.k
    public final void e(m mVar) {
        w.r(this.f2741b, false);
        this.f2740a = true;
    }
}
