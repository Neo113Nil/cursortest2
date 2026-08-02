package B2;

import b2.C0195i;
import l2.l;
import n0.C1148j;
import t2.C1196f;
import t2.InterfaceC1195e;
import t2.p0;
import y2.t;

/* loaded from: classes.dex */
public final class c implements InterfaceC1195e, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1196f f170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f171b;

    public c(d dVar, C1196f c1196f) {
        this.f171b = dVar;
        this.f170a = c1196f;
    }

    @Override // t2.p0
    public final void a(t tVar, int i3) {
        this.f170a.a(tVar, i3);
    }

    @Override // t2.InterfaceC1195e
    public final C1148j d(Object obj, l lVar) {
        d dVar = this.f171b;
        b bVar = new b(dVar, 1, this);
        C1148j d3 = this.f170a.d((C0195i) obj, bVar);
        if (d3 != null) {
            d.f172g.set(dVar, null);
        }
        return d3;
    }

    @Override // d2.InterfaceC0300c
    public final void f(Object obj) {
        this.f170a.f(obj);
    }

    @Override // d2.InterfaceC0300c
    public final d2.h getContext() {
        return this.f170a.f10418e;
    }

    @Override // t2.InterfaceC1195e
    public final void m(Object obj) {
        this.f170a.m(obj);
    }
}
