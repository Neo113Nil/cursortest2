package androidx.media3.exoplayer.hls;

import N1.c;
import T.C0107z;
import Y.g;
import a0.C0144j;
import a2.i;
import d2.C0389g;
import e0.t;
import g0.C0435c;
import g0.m;
import h0.C0447c;
import h0.s;
import java.util.List;
import q0.AbstractC1359a;
import q0.InterfaceC1352A;
import t0.C1427b;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC1352A {

    /* renamed from: a, reason: collision with root package name */
    public final t f5092a;

    /* renamed from: b, reason: collision with root package name */
    public C0435c f5093b;

    /* renamed from: c, reason: collision with root package name */
    public i f5094c;

    /* renamed from: h, reason: collision with root package name */
    public final c f5099h = new c();

    /* renamed from: e, reason: collision with root package name */
    public final C0144j f5096e = new C0144j(7, false);

    /* renamed from: f, reason: collision with root package name */
    public final b0.c f5097f = C0447c.o;

    /* renamed from: i, reason: collision with root package name */
    public final C1427b f5100i = new C1427b(1);

    /* renamed from: g, reason: collision with root package name */
    public final C0144j f5098g = new C0144j(28, false);

    /* renamed from: k, reason: collision with root package name */
    public final int f5102k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final long f5103l = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5101j = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5095d = true;

    public HlsMediaSource$Factory(g gVar) {
        this.f5092a = new t(gVar);
    }

    @Override // q0.InterfaceC1352A
    public final AbstractC1359a a(C0107z c0107z) {
        c0107z.f2900b.getClass();
        if (this.f5093b == null) {
            C0435c c0435c = new C0435c();
            c0435c.f8830a = new i(28);
            this.f5093b = c0435c;
        }
        i iVar = this.f5094c;
        if (iVar != null) {
            this.f5093b.f8830a = iVar;
        }
        C0435c c0435c2 = this.f5093b;
        c0435c2.f8831b = this.f5095d;
        List list = c0107z.f2900b.f2895c;
        boolean isEmpty = list.isEmpty();
        s sVar = this.f5096e;
        if (!isEmpty) {
            sVar = new C0389g(sVar, 4, list);
        }
        f0.i b4 = this.f5099h.b(c0107z);
        this.f5097f.getClass();
        t tVar = this.f5092a;
        C1427b c1427b = this.f5100i;
        return new m(c0107z, tVar, c0435c2, this.f5098g, b4, c1427b, new C0447c(tVar, c1427b, sVar), this.f5103l, this.f5101j, this.f5102k);
    }

    @Override // q0.InterfaceC1352A
    public final void b(i iVar) {
        this.f5094c = iVar;
    }

    @Override // q0.InterfaceC1352A
    public final void d(boolean z) {
        this.f5095d = z;
    }

    @Override // q0.InterfaceC1352A
    public final void c() {
    }
}
