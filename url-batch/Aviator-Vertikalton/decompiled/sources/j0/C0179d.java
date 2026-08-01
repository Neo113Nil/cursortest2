package j0;

import android.view.ViewGroup;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2897a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2898b;

    public C0179d(ViewGroup viewGroup) {
        this.f2898b = viewGroup;
    }

    @Override // j0.n, j0.k
    public final void a(m mVar) {
        i1.m.o(this.f2898b, false);
        this.f2897a = true;
    }

    @Override // j0.n, j0.k
    public final void b() {
        i1.m.o(this.f2898b, false);
    }

    @Override // j0.k
    public final void d(m mVar) {
        if (!this.f2897a) {
            i1.m.o(this.f2898b, false);
        }
        mVar.x(this);
    }

    @Override // j0.n, j0.k
    public final void e() {
        i1.m.o(this.f2898b, true);
    }
}
