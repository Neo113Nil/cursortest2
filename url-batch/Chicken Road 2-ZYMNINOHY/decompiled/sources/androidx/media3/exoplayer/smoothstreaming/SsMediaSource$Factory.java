package androidx.media3.exoplayer.smoothstreaming;

import N1.c;
import T.C0107z;
import Y.g;
import a0.C0144j;
import a2.i;
import d2.C0389g;
import e0.t;
import g0.f;
import java.util.List;
import o0.C1324c;
import q0.AbstractC1359a;
import q0.InterfaceC1352A;
import t0.C1427b;
import u0.p;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC1352A {

    /* renamed from: a, reason: collision with root package name */
    public final f f5105a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5106b;

    /* renamed from: c, reason: collision with root package name */
    public final C0144j f5107c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5108d;

    /* renamed from: e, reason: collision with root package name */
    public final C1427b f5109e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5110f;

    public SsMediaSource$Factory(g gVar) {
        f fVar = new f();
        fVar.f8836b = gVar;
        fVar.f8837c = new i(28);
        this.f5105a = fVar;
        this.f5106b = gVar;
        this.f5108d = new c();
        this.f5109e = new C1427b(1);
        this.f5110f = 30000L;
        this.f5107c = new C0144j(28, false);
        fVar.f8835a = true;
    }

    @Override // q0.InterfaceC1352A
    public final AbstractC1359a a(C0107z c0107z) {
        c0107z.f2900b.getClass();
        p tVar = new t(19);
        List list = c0107z.f2900b.f2895c;
        return new C1324c(c0107z, this.f5106b, !list.isEmpty() ? new C0389g(tVar, 8, list) : tVar, this.f5105a, this.f5107c, this.f5108d.b(c0107z), this.f5109e, this.f5110f);
    }

    @Override // q0.InterfaceC1352A
    public final void b(i iVar) {
        this.f5105a.f8837c = iVar;
    }

    @Override // q0.InterfaceC1352A
    public final void d(boolean z) {
        this.f5105a.f8835a = z;
    }
}
