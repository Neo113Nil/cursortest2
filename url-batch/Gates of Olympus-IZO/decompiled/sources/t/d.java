package t;

import t0.D;
import u.InterfaceC0945m;

/* loaded from: classes.dex */
public final class d implements InterfaceC0945m {

    /* renamed from: a, reason: collision with root package name */
    public final y f7576a;

    public d(y yVar) {
        this.f7576a = yVar;
    }

    @Override // u.InterfaceC0945m
    public final int a() {
        return this.f7576a.g().f7638j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // u.InterfaceC0945m
    public final int b() {
        return ((q) M1.l.s0(this.f7576a.g().f7635g)).f7643a;
    }

    @Override // u.InterfaceC0945m
    public final int c() {
        return this.f7576a.f7689b.f7452b.g();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // u.InterfaceC0945m
    public final boolean d() {
        return !this.f7576a.g().f7635g.isEmpty();
    }

    @Override // u.InterfaceC0945m
    public final void e() {
        D d3 = this.f7576a.f7695h;
        if (d3 != null) {
            d3.k();
        }
    }
}
