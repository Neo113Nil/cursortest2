package p1;

import android.view.ViewGroup;

/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347d extends r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14741a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f14742b;

    public C1347d(ViewGroup viewGroup) {
        this.f14742b = viewGroup;
    }

    @Override // p1.p
    public final void a(q qVar) {
        if (!this.f14741a) {
            O3.l.v(this.f14742b, false);
        }
        qVar.w(this);
    }

    @Override // p1.r, p1.p
    public final void b() {
        O3.l.v(this.f14742b, false);
    }

    @Override // p1.r, p1.p
    public final void c() {
        O3.l.v(this.f14742b, false);
        this.f14741a = true;
    }

    @Override // p1.r, p1.p
    public final void d() {
        O3.l.v(this.f14742b, true);
    }
}
