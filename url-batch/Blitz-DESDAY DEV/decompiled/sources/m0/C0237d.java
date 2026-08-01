package m0;

import android.view.ViewGroup;
import m.C0227a;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3141a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3142b;

    public C0237d(ViewGroup viewGroup) {
        this.f3142b = viewGroup;
    }

    @Override // m0.n, m0.k
    public final void a() {
        C0227a.q(this.f3142b, false);
    }

    @Override // m0.k
    public final void c(m mVar) {
        if (!this.f3141a) {
            C0227a.q(this.f3142b, false);
        }
        mVar.x(this);
    }

    @Override // m0.n, m0.k
    public final void d() {
        C0227a.q(this.f3142b, true);
    }

    @Override // m0.n, m0.k
    public final void f(m mVar) {
        C0227a.q(this.f3142b, false);
        this.f3141a = true;
    }
}
