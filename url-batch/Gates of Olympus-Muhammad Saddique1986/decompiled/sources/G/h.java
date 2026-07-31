package G;

import B.L;
import F.C0090d0;
import h1.C0496n;
import h1.C0501t;
import n.AbstractC0695v;
import t2.C1041L;
import t2.C1045P;
import t2.C1059l;
import t2.C1061n;
import t2.C1063p;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;
import u2.C1149a;

/* loaded from: classes.dex */
public final class h implements InterfaceC1053f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2002f;

    public /* synthetic */ h(Object obj, int i3, Object obj2) {
        this.f2000d = i3;
        this.f2001e = obj;
        this.f2002f = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    @Override // t2.InterfaceC1053f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        C1059l c1059l;
        W1.a aVar;
        int i3;
        Throwable th;
        u2.y yVar;
        h hVar;
        InterfaceC1054g interfaceC1054g2;
        H1.c cVar;
        C1061n c1061n;
        int i4;
        L l3;
        switch (this.f2000d) {
            case 0:
                Object d3 = ((InterfaceC1053f) this.f2001e).d(new L(interfaceC1054g, 3, (i) this.f2002f), dVar);
                return d3 == W1.a.f4608d ? d3 : R1.y.f4171a;
            case 1:
                Object d4 = ((H1.c) this.f2001e).d(new L(interfaceC1054g, 4, (K1.a) this.f2002f), dVar);
                return d4 == W1.a.f4608d ? d4 : R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof C1059l) {
                    c1059l = (C1059l) dVar;
                    int i5 = c1059l.f9036h;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c1059l.f9036h = i5 - Integer.MIN_VALUE;
                        Object obj = c1059l.f9035g;
                        aVar = W1.a.f4608d;
                        i3 = c1059l.f9036h;
                        R1.y yVar2 = R1.y.f4171a;
                        if (i3 != 0) {
                            R1.a.e(obj);
                            V1.i iVar = c1059l.f4642e;
                            f2.j.c(iVar);
                            u2.y yVar3 = new u2.y(interfaceC1054g, iVar);
                            try {
                                C0496n c0496n = (C0496n) this.f2001e;
                                c1059l.f9038j = this;
                                c1059l.f9039k = interfaceC1054g;
                                c1059l.f9040l = yVar3;
                                c1059l.f9036h = 1;
                                c0496n.h(yVar3, c1059l);
                                if (yVar2 == aVar) {
                                    return aVar;
                                }
                                hVar = this;
                                interfaceC1054g2 = interfaceC1054g;
                                yVar = yVar3;
                            } catch (Throwable th2) {
                                th = th2;
                                yVar = yVar3;
                                yVar.r();
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                R1.a.e(obj);
                                return yVar2;
                            }
                            yVar = c1059l.f9040l;
                            interfaceC1054g2 = c1059l.f9039k;
                            hVar = c1059l.f9038j;
                            try {
                                R1.a.e(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                yVar.r();
                                throw th;
                            }
                        }
                        yVar.r();
                        cVar = (H1.c) hVar.f2002f;
                        c1059l.f9038j = null;
                        c1059l.f9039k = null;
                        c1059l.f9040l = null;
                        c1059l.f9036h = 2;
                        if (cVar.d(interfaceC1054g2, c1059l) == aVar) {
                            return aVar;
                        }
                        return yVar2;
                    }
                }
                c1059l = new C1059l(this, dVar);
                Object obj2 = c1059l.f9035g;
                aVar = W1.a.f4608d;
                i3 = c1059l.f9036h;
                R1.y yVar22 = R1.y.f4171a;
                if (i3 != 0) {
                }
                yVar.r();
                cVar = (H1.c) hVar.f2002f;
                c1059l.f9038j = null;
                c1059l.f9039k = null;
                c1059l.f9040l = null;
                c1059l.f9036h = 2;
                if (cVar.d(interfaceC1054g2, c1059l) == aVar) {
                }
                return yVar22;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                Object d5 = ((u2.n) this.f2001e).d(new C0090d0(new f2.q(), interfaceC1054g, (C1041L) this.f2002f), dVar);
                return d5 == W1.a.f4608d ? d5 : R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                if (dVar instanceof C1061n) {
                    c1061n = (C1061n) dVar;
                    int i6 = c1061n.f9047h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c1061n.f9047h = i6 - Integer.MIN_VALUE;
                        Object obj3 = c1061n.f9046g;
                        W1.a aVar2 = W1.a.f4608d;
                        i4 = c1061n.f9047h;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l3 = c1061n.f9049j;
                            try {
                                R1.a.e(obj3);
                            } catch (C1149a e3) {
                                e = e3;
                            }
                            return R1.y.f4171a;
                        }
                        R1.a.e(obj3);
                        C1045P c1045p = (C1045P) this.f2001e;
                        L l4 = new L((C0501t) this.f2002f, 6, interfaceC1054g);
                        try {
                            c1061n.f9049j = l4;
                            c1061n.f9047h = 1;
                            c1045p.d(l4, c1061n);
                            return aVar2;
                        } catch (C1149a e4) {
                            e = e4;
                            l3 = l4;
                        }
                        if (e.f9676d != l3) {
                            throw e;
                        }
                        return R1.y.f4171a;
                    }
                }
                c1061n = new C1061n(this, dVar);
                Object obj32 = c1061n.f9046g;
                W1.a aVar22 = W1.a.f4608d;
                i4 = c1061n.f9047h;
                if (i4 == 0) {
                }
                if (e.f9676d != l3) {
                }
                return R1.y.f4171a;
            default:
                u2.s sVar = new u2.s((InterfaceC1053f[]) this.f2001e, new C1063p((V1.d) null, (Q1.e) this.f2002f), interfaceC1054g, null);
                u2.u uVar = new u2.u(dVar, dVar.t());
                Object l5 = AbstractC0695v.l(uVar, uVar, sVar);
                W1.a aVar3 = W1.a.f4608d;
                R1.y yVar4 = R1.y.f4171a;
                if (l5 != aVar3) {
                    l5 = yVar4;
                }
                return l5 == aVar3 ? l5 : yVar4;
        }
    }
}
