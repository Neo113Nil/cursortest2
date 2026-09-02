package q0;

import T.C0107z;
import t0.C1427b;

/* loaded from: classes.dex */
public final class V implements InterfaceC1352A {

    /* renamed from: a, reason: collision with root package name */
    public final Y.g f14920a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.flutter.pigeon.a f14921b;

    /* renamed from: c, reason: collision with root package name */
    public final N1.c f14922c;

    /* renamed from: d, reason: collision with root package name */
    public final C1427b f14923d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14924e;

    public V(Y.g gVar, y0.l lVar) {
        io.appmetrica.analytics.flutter.pigeon.a aVar = new io.appmetrica.analytics.flutter.pigeon.a(5, lVar);
        N1.c cVar = new N1.c();
        C1427b c1427b = new C1427b(1);
        this.f14920a = gVar;
        this.f14921b = aVar;
        this.f14922c = cVar;
        this.f14923d = c1427b;
        this.f14924e = 1048576;
    }

    @Override // q0.InterfaceC1352A
    public final AbstractC1359a a(C0107z c0107z) {
        c0107z.f2900b.getClass();
        return new W(c0107z, this.f14920a, this.f14921b, this.f14922c.b(c0107z), this.f14923d, this.f14924e, null);
    }
}
