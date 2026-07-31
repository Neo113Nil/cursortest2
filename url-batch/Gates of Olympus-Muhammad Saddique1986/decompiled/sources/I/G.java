package I;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class G implements A0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0424c f2682d;

    /* renamed from: e, reason: collision with root package name */
    public H f2683e;

    public G(InterfaceC0424c interfaceC0424c) {
        this.f2682d = interfaceC0424c;
    }

    @Override // I.A0
    public final void a() {
        H h3 = this.f2683e;
        if (h3 != null) {
            h3.a();
        }
        this.f2683e = null;
    }

    @Override // I.A0
    public final void b() {
        this.f2683e = (H) this.f2682d.n(C0143d.f2802h);
    }

    @Override // I.A0
    public final void c() {
    }
}
