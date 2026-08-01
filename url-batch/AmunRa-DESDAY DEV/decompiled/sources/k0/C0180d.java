package k0;

import android.view.ViewGroup;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2694a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2695b;

    public C0180d(ViewGroup viewGroup) {
        this.f2695b = viewGroup;
    }

    @Override // k0.n, k0.k
    public final void a() {
        s1.l.h0(this.f2695b, false);
    }

    @Override // k0.k
    public final void b(m mVar) {
        if (!this.f2694a) {
            s1.l.h0(this.f2695b, false);
        }
        mVar.x(this);
    }

    @Override // k0.n, k0.k
    public final void c() {
        s1.l.h0(this.f2695b, true);
    }

    @Override // k0.n, k0.k
    public final void e(m mVar) {
        s1.l.h0(this.f2695b, false);
        this.f2694a = true;
    }
}
