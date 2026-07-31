package h1;

import e2.InterfaceC0426e;
import q2.m0;
import t2.InterfaceC1054g;

/* renamed from: h1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496n extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0 f6180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0496n(m0 m0Var, V1.d dVar) {
        super(2, dVar);
        this.f6180h = m0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0496n c0496n = (C0496n) o((V1.d) obj2, (InterfaceC1054g) obj);
        R1.y yVar = R1.y.f4171a;
        c0496n.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0496n(this.f6180h, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        this.f6180h.h();
        return R1.y.f4171a;
    }
}
