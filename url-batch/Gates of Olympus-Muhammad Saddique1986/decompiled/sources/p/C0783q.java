package p;

import I.C0143d;
import I.C0156j0;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;

/* renamed from: p.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783q implements InterfaceC0778n0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2.k f7749a;

    /* renamed from: b, reason: collision with root package name */
    public final C0781p f7750b = new C0781p(this);

    /* renamed from: c, reason: collision with root package name */
    public final n.h0 f7751c = new n.h0();

    /* renamed from: d, reason: collision with root package name */
    public final C0156j0 f7752d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f7753e;

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f7754f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0783q(InterfaceC0424c interfaceC0424c) {
        this.f7749a = (f2.k) interfaceC0424c;
        Boolean bool = Boolean.FALSE;
        I.W w2 = I.W.f2783i;
        this.f7752d = C0143d.K(bool, w2);
        this.f7753e = C0143d.K(bool, w2);
        this.f7754f = C0143d.K(bool, w2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.c, f2.k] */
    @Override // p.InterfaceC0778n0
    public final float b(float f3) {
        return ((Number) this.f7749a.n(Float.valueOf(f3))).floatValue();
    }

    @Override // p.InterfaceC0778n0
    public final Object d(n.e0 e0Var, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        Object e3 = AbstractC0837y.e(new C0779o(this, e0Var, interfaceC0426e, null), cVar);
        return e3 == W1.a.f4608d ? e3 : R1.y.f4171a;
    }

    @Override // p.InterfaceC0778n0
    public final boolean e() {
        return ((Boolean) this.f7752d.getValue()).booleanValue();
    }
}
