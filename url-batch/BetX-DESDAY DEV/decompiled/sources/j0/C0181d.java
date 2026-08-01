package j0;

import android.view.ViewGroup;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2901a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2902b;

    public C0181d(ViewGroup viewGroup) {
        this.f2902b = viewGroup;
    }

    @Override // j0.n, j0.k
    public final void a(m mVar) {
        i1.m.o(this.f2902b, false);
        this.f2901a = true;
    }

    @Override // j0.n, j0.k
    public final void b() {
        i1.m.o(this.f2902b, false);
    }

    @Override // j0.k
    public final void d(m mVar) {
        if (!this.f2901a) {
            i1.m.o(this.f2902b, false);
        }
        mVar.x(this);
    }

    @Override // j0.n, j0.k
    public final void e() {
        i1.m.o(this.f2902b, true);
    }
}
