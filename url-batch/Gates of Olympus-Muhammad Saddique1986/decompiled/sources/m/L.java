package m;

import I.C0143d;
import I.C0148f0;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class L extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public y2.c f6630h;

    /* renamed from: i, reason: collision with root package name */
    public U f6631i;

    /* renamed from: j, reason: collision with root package name */
    public int f6632j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f6633k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6634l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0 f6635m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0640z f6636n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(V1.d dVar, Object obj, InterfaceC0640z interfaceC0640z, U u3, l0 l0Var) {
        super(2, dVar);
        this.f6633k = u3;
        this.f6634l = obj;
        this.f6635m = l0Var;
        this.f6636n = interfaceC0640z;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((L) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        l0 l0Var = this.f6635m;
        return new L(dVar, this.f6634l, this.f6636n, this.f6633k, l0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9 A[RETURN] */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        y2.c cVar;
        U u3;
        Object k3;
        W1.a aVar;
        x0 x0Var;
        C0629n c0629n;
        float f3;
        L l3 = this;
        W1.a aVar2 = W1.a.f4608d;
        int i3 = l3.f6632j;
        R1.y yVar = R1.y.f4171a;
        Object obj2 = l3.f6634l;
        U u4 = l3.f6633k;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                Object value = u4.f6672b.getValue();
                if (!f2.j.a(obj2, value)) {
                    U.f(u4);
                    u4.o(0.0f);
                    l0 l0Var = l3.f6635m;
                    l0Var.q(obj2);
                    l0Var.o(0L);
                    u4.c(value);
                    u4.f6672b.setValue(obj2);
                }
                cVar = u4.f6680j;
                l3.f6630h = cVar;
                l3.f6631i = u4;
                l3.f6632j = 1;
                if (cVar.c(null, l3) == aVar2) {
                    return aVar2;
                }
                u3 = u4;
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        R1.a.e(obj);
                        l3.f6632j = 3;
                        if (U.j(u4, l3) == aVar2) {
                            return aVar2;
                        }
                        if (!f2.j.a(u4.f6673c.getValue(), obj2)) {
                        }
                        return yVar;
                    }
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj);
                            f3 = 0.0f;
                            u4.o(f3);
                            return yVar;
                        }
                        R1.a.e(obj);
                        aVar = aVar2;
                        u4.c(obj2);
                        l3.f6632j = 5;
                        if (U.i(u4, l3) == aVar) {
                            return aVar;
                        }
                        f3 = 0.0f;
                        u4.o(f3);
                        return yVar;
                    }
                    R1.a.e(obj);
                    if (!f2.j.a(u4.f6673c.getValue(), obj2)) {
                        C0148f0 c0148f0 = u4.f6678h;
                        if (c0148f0.g() < 1.0f) {
                            C0614J c0614j = u4.f6684n;
                            InterfaceC0640z interfaceC0640z = l3.f6636n;
                            if (interfaceC0640z != null) {
                                u0 u0Var = v0.f6899a;
                                x0Var = interfaceC0640z.e();
                            } else {
                                x0Var = null;
                            }
                            if (c0614j == null || !f2.j.a(x0Var, c0614j.f6621b)) {
                                x0 x0Var2 = c0614j != null ? c0614j.f6621b : null;
                                C0629n c0629n2 = U.f6671s;
                                C0629n c0629n3 = U.f6670r;
                                if (x0Var2 != null) {
                                    long j3 = c0614j.f6620a;
                                    C0629n c0629n4 = c0614j.f6625f;
                                    c0629n3 = (C0629n) x0Var2.d(j3, c0614j.f6624e, c0629n2, c0629n4 == null ? c0629n3 : c0629n4);
                                } else if (c0614j != null && c0614j.f6620a != 0) {
                                    long j4 = c0614j.f6626g;
                                    if (j4 == Long.MIN_VALUE) {
                                        j4 = u4.f6676f;
                                    }
                                    float f4 = j4 / 1.0E9f;
                                    if (f4 > 0.0f) {
                                        c0629n = new C0629n(1.0f / f4);
                                        if (c0614j == null) {
                                            c0614j = new C0614J();
                                        }
                                        c0614j.f6621b = x0Var;
                                        c0614j.f6622c = false;
                                        c0614j.f6623d = c0148f0.g();
                                        float g3 = c0148f0.g();
                                        C0629n c0629n5 = c0614j.f6624e;
                                        c0629n5.e(g3, 0);
                                        long j5 = u4.f6676f;
                                        c0614j.f6626g = j5;
                                        aVar = aVar2;
                                        c0614j.f6620a = 0L;
                                        c0614j.f6625f = c0629n;
                                        c0614j.f6627h = x0Var == null ? x0Var.g(c0629n5, c0629n2, c0629n) : AbstractC0508a.R((1.0d - c0148f0.g()) * j5);
                                        u4.f6684n = c0614j;
                                    }
                                }
                                c0629n = c0629n3;
                                if (c0614j == null) {
                                }
                                c0614j.f6621b = x0Var;
                                c0614j.f6622c = false;
                                c0614j.f6623d = c0148f0.g();
                                float g32 = c0148f0.g();
                                C0629n c0629n52 = c0614j.f6624e;
                                c0629n52.e(g32, 0);
                                long j52 = u4.f6676f;
                                c0614j.f6626g = j52;
                                aVar = aVar2;
                                c0614j.f6620a = 0L;
                                c0614j.f6625f = c0629n;
                                c0614j.f6627h = x0Var == null ? x0Var.g(c0629n52, c0629n2, c0629n) : AbstractC0508a.R((1.0d - c0148f0.g()) * j52);
                                u4.f6684n = c0614j;
                            } else {
                                aVar = aVar2;
                                l3.f6630h = null;
                                l3.f6631i = null;
                                l3.f6632j = 4;
                                if (U.h(u4, l3) == aVar) {
                                    return aVar;
                                }
                                u4.c(obj2);
                                l3.f6632j = 5;
                                if (U.i(u4, l3) == aVar) {
                                }
                            }
                        } else {
                            aVar = aVar2;
                        }
                        l3 = this;
                        l3.f6630h = null;
                        l3.f6631i = null;
                        l3.f6632j = 4;
                        if (U.h(u4, l3) == aVar) {
                        }
                        u4.c(obj2);
                        l3.f6632j = 5;
                        if (U.i(u4, l3) == aVar) {
                        }
                    }
                    return yVar;
                }
                u3 = l3.f6631i;
                cVar = l3.f6630h;
                R1.a.e(obj);
            }
            Object obj3 = u3.f6674d;
            cVar.e(null);
            if (!f2.j.a(obj2, obj3)) {
                l3.f6630h = null;
                l3.f6631i = null;
                l3.f6632j = 2;
                if (u4.f6682l != Long.MIN_VALUE ? (k3 = u4.k(l3)) != aVar2 : (k3 = C0143d.F(t()).n(u4.f6685o, l3)) != aVar2) {
                    k3 = yVar;
                }
                if (k3 == aVar2) {
                    return aVar2;
                }
                l3.f6632j = 3;
                if (U.j(u4, l3) == aVar2) {
                }
            }
            if (!f2.j.a(u4.f6673c.getValue(), obj2)) {
            }
            return yVar;
        } catch (Throwable th) {
            cVar.e(null);
            throw th;
        }
    }
}
