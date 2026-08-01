package v;

import kotlin.jvm.functions.Function1;
import n0.j1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final g f9734a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f9735b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f9736c;

    /* renamed from: d, reason: collision with root package name */
    public final x f9737d;

    /* renamed from: e, reason: collision with root package name */
    public final l f9738e;

    /* renamed from: f, reason: collision with root package name */
    public final l f9739f;
    public final l g;

    /* renamed from: h, reason: collision with root package name */
    public final l f9740h;

    public b(Float f3, Float f10) {
        g gVar = new g(f3, null, 60);
        this.f9734a = gVar;
        this.f9735b = n0.h.r(Boolean.FALSE);
        this.f9736c = n0.h.r(f3);
        this.f9737d = new x();
        new j0(1500.0f, f10);
        l lVar = gVar.f9799i;
        boolean z10 = lVar instanceof h;
        l lVar2 = z10 ? c.f9750e : lVar instanceof i ? c.f9751f : lVar instanceof j ? c.g : c.f9752h;
        this.f9738e = lVar2;
        l lVar3 = z10 ? c.f9746a : lVar instanceof i ? c.f9747b : lVar instanceof j ? c.f9748c : c.f9749d;
        this.f9739f = lVar3;
        this.g = lVar2;
        this.f9740h = lVar3;
    }

    public static Object a(b bVar, Float f3, f fVar, nd.i iVar) {
        c6.s sVar = c.f9754k;
        bVar.getClass();
        Object invoke = ((Function1) sVar.f1869e).invoke(bVar.f9734a.f9799i);
        return x.a(bVar.f9737d, new a(bVar, invoke, new q0(fVar, sVar, bVar.f9734a.f9798e.getValue(), f3, (l) ((Function1) sVar.f1868d).invoke(invoke)), bVar.f9734a.f9800r, null), iVar);
    }
}
