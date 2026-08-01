package k1;

import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2307a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2308b;

    public d(ViewGroup viewGroup) {
        this.f2308b = viewGroup;
    }

    @Override // k1.o, k1.l
    public final void a(n nVar) {
        b4.l.h0(this.f2308b, false);
        this.f2307a = true;
    }

    @Override // k1.o, k1.l
    public final void c() {
        b4.l.h0(this.f2308b, false);
    }

    @Override // k1.l
    public final void d(n nVar) {
        if (!this.f2307a) {
            b4.l.h0(this.f2308b, false);
        }
        nVar.x(this);
    }

    @Override // k1.o, k1.l
    public final void e() {
        b4.l.h0(this.f2308b, true);
    }
}
