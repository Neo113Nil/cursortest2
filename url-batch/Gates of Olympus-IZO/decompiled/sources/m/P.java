package m;

import I.C0089d;
import I.C0094f0;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class P extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public s2.c f5613e;

    /* renamed from: f, reason: collision with root package name */
    public Z f5614f;

    /* renamed from: g, reason: collision with root package name */
    public int f5615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Z f5616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5617i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f5618j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0615z f5619k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(P1.d dVar, Object obj, InterfaceC0615z interfaceC0615z, Z z3, s0 s0Var) {
        super(2, dVar);
        this.f5616h = z3;
        this.f5617i = obj;
        this.f5618j = s0Var;
        this.f5619k = interfaceC0615z;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        s0 s0Var = this.f5618j;
        return new P(dVar, this.f5617i, this.f5619k, this.f5616h, s0Var);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((P) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9 A[RETURN] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s2.c cVar;
        Z z3;
        Object k3;
        Q1.a aVar;
        B0 b02;
        C0604n c0604n;
        float f3;
        P p = this;
        Q1.a aVar2 = Q1.a.f3113d;
        int i3 = p.f5615g;
        L1.z zVar = L1.z.f2729a;
        Object obj2 = p.f5617i;
        Z z4 = p.f5616h;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                Object value = z4.f5660b.getValue();
                if (!Z1.i.a(obj2, value)) {
                    Z.f(z4);
                    z4.o(0.0f);
                    s0 s0Var = p.f5618j;
                    s0Var.q(obj2);
                    s0Var.o(0L);
                    z4.c(value);
                    z4.f5660b.setValue(obj2);
                }
                cVar = z4.f5668j;
                p.f5613e = cVar;
                p.f5614f = z4;
                p.f5615g = 1;
                if (cVar.c(null, p) == aVar2) {
                    return aVar2;
                }
                z3 = z4;
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        I2.l.Q(obj);
                        p.f5615g = 3;
                        if (Z.j(z4, p) == aVar2) {
                            return aVar2;
                        }
                        if (!Z1.i.a(z4.f5661c.getValue(), obj2)) {
                        }
                        return zVar;
                    }
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            I2.l.Q(obj);
                            f3 = 0.0f;
                            z4.o(f3);
                            return zVar;
                        }
                        I2.l.Q(obj);
                        aVar = aVar2;
                        z4.c(obj2);
                        p.f5615g = 5;
                        if (Z.i(z4, p) == aVar) {
                            return aVar;
                        }
                        f3 = 0.0f;
                        z4.o(f3);
                        return zVar;
                    }
                    I2.l.Q(obj);
                    if (!Z1.i.a(z4.f5661c.getValue(), obj2)) {
                        C0094f0 c0094f0 = z4.f5666h;
                        if (c0094f0.g() < 1.0f) {
                            N n3 = z4.f5672n;
                            InterfaceC0615z interfaceC0615z = p.f5619k;
                            if (interfaceC0615z != null) {
                                y0 y0Var = z0.f5885a;
                                b02 = interfaceC0615z.e();
                            } else {
                                b02 = null;
                            }
                            if (n3 == null || !Z1.i.a(b02, n3.f5604b)) {
                                B0 b03 = n3 != null ? n3.f5604b : null;
                                C0604n c0604n2 = Z.f5659s;
                                C0604n c0604n3 = Z.f5658r;
                                if (b03 != null) {
                                    long j3 = n3.f5603a;
                                    C0604n c0604n4 = n3.f5608f;
                                    c0604n3 = (C0604n) b03.b(j3, n3.f5607e, c0604n2, c0604n4 == null ? c0604n3 : c0604n4);
                                } else if (n3 != null && n3.f5603a != 0) {
                                    long j4 = n3.f5609g;
                                    if (j4 == Long.MIN_VALUE) {
                                        j4 = z4.f5664f;
                                    }
                                    float f4 = j4 / 1.0E9f;
                                    if (f4 > 0.0f) {
                                        c0604n = new C0604n(1.0f / f4);
                                        if (n3 == null) {
                                            n3 = new N();
                                        }
                                        n3.f5604b = b02;
                                        n3.f5605c = false;
                                        n3.f5606d = c0094f0.g();
                                        float g3 = c0094f0.g();
                                        C0604n c0604n5 = n3.f5607e;
                                        c0604n5.e(g3, 0);
                                        long j5 = z4.f5664f;
                                        n3.f5609g = j5;
                                        aVar = aVar2;
                                        n3.f5603a = 0L;
                                        n3.f5608f = c0604n;
                                        n3.f5610h = b02 == null ? b02.d(c0604n5, c0604n2, c0604n) : M1.B.N((1.0d - c0094f0.g()) * j5);
                                        z4.f5672n = n3;
                                    }
                                }
                                c0604n = c0604n3;
                                if (n3 == null) {
                                }
                                n3.f5604b = b02;
                                n3.f5605c = false;
                                n3.f5606d = c0094f0.g();
                                float g32 = c0094f0.g();
                                C0604n c0604n52 = n3.f5607e;
                                c0604n52.e(g32, 0);
                                long j52 = z4.f5664f;
                                n3.f5609g = j52;
                                aVar = aVar2;
                                n3.f5603a = 0L;
                                n3.f5608f = c0604n;
                                n3.f5610h = b02 == null ? b02.d(c0604n52, c0604n2, c0604n) : M1.B.N((1.0d - c0094f0.g()) * j52);
                                z4.f5672n = n3;
                            } else {
                                aVar = aVar2;
                                p.f5613e = null;
                                p.f5614f = null;
                                p.f5615g = 4;
                                if (Z.h(z4, p) == aVar) {
                                    return aVar;
                                }
                                z4.c(obj2);
                                p.f5615g = 5;
                                if (Z.i(z4, p) == aVar) {
                                }
                            }
                        } else {
                            aVar = aVar2;
                        }
                        p = this;
                        p.f5613e = null;
                        p.f5614f = null;
                        p.f5615g = 4;
                        if (Z.h(z4, p) == aVar) {
                        }
                        z4.c(obj2);
                        p.f5615g = 5;
                        if (Z.i(z4, p) == aVar) {
                        }
                    }
                    return zVar;
                }
                z3 = p.f5614f;
                cVar = p.f5613e;
                I2.l.Q(obj);
            }
            Object obj3 = z3.f5662d;
            cVar.e(null);
            if (!Z1.i.a(obj2, obj3)) {
                p.f5613e = null;
                p.f5614f = null;
                p.f5615g = 2;
                if (z4.f5670l != Long.MIN_VALUE ? (k3 = z4.k(p)) != aVar2 : (k3 = C0089d.F(getContext()).j(z4.f5673o, p)) != aVar2) {
                    k3 = zVar;
                }
                if (k3 == aVar2) {
                    return aVar2;
                }
                p.f5615g = 3;
                if (Z.j(z4, p) == aVar2) {
                }
            }
            if (!Z1.i.a(z4.f5661c.getValue(), obj2)) {
            }
            return zVar;
        } catch (Throwable th) {
            cVar.e(null);
            throw th;
        }
    }
}
