package androidx.media3.exoplayer.dash;

import E1.X;
import L3.h;
import N1.c;
import T.C0107z;
import Y.g;
import a0.C0144j;
import a2.i;
import d2.C0389g;
import e0.C0395e;
import java.util.List;
import q0.AbstractC1359a;
import q0.InterfaceC1352A;
import t0.C1427b;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements InterfaceC1352A {

    /* renamed from: a, reason: collision with root package name */
    public final h f5085a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5086b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5087c;

    /* renamed from: d, reason: collision with root package name */
    public final C0144j f5088d;

    /* renamed from: e, reason: collision with root package name */
    public final C1427b f5089e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5090f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5091g;

    public DashMediaSource$Factory(g gVar) {
        h hVar = new h(gVar);
        this.f5085a = hVar;
        this.f5086b = gVar;
        this.f5087c = new c();
        this.f5089e = new C1427b(1);
        this.f5090f = 30000L;
        this.f5091g = 5000000L;
        this.f5088d = new C0144j(28, false);
        ((X) hVar.f1681c).f555a = true;
    }

    @Override // q0.InterfaceC1352A
    public final AbstractC1359a a(C0107z c0107z) {
        c0107z.f2900b.getClass();
        C0395e c0395e = new C0395e();
        List list = c0107z.f2900b.f2895c;
        return new d0.h(c0107z, this.f5086b, !list.isEmpty() ? new C0389g(c0395e, 8, list) : c0395e, this.f5085a, this.f5088d, this.f5087c.b(c0107z), this.f5089e, this.f5090f, this.f5091g);
    }

    @Override // q0.InterfaceC1352A
    public final void b(i iVar) {
        X x4 = (X) this.f5085a.f1681c;
        x4.getClass();
        x4.f556b = iVar;
    }

    @Override // q0.InterfaceC1352A
    public final void c() {
        ((X) this.f5085a.f1681c).getClass();
    }

    @Override // q0.InterfaceC1352A
    public final void d(boolean z) {
        ((X) this.f5085a.f1681c).f555a = z;
    }
}
