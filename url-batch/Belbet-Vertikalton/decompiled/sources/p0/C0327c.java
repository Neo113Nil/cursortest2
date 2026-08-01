package p0;

import android.view.ViewGroup;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327c extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3811a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3812b;

    public C0327c(ViewGroup viewGroup) {
        this.f3812b = viewGroup;
    }

    @Override // p0.n, p0.k
    public final void a() {
        H1.d.h0(this.f3812b, false);
    }

    @Override // p0.k
    public final void c(m mVar) {
        if (!this.f3811a) {
            H1.d.h0(this.f3812b, false);
        }
        mVar.x(this);
    }

    @Override // p0.n, p0.k
    public final void e() {
        H1.d.h0(this.f3812b, true);
    }

    @Override // p0.n, p0.k
    public final void f(m mVar) {
        H1.d.h0(this.f3812b, false);
        this.f3811a = true;
    }
}
