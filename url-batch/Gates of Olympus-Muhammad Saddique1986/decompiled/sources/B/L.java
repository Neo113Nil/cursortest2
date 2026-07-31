package B;

import E.C0073a;
import E.C0080h;
import I.C0148f0;
import I.InterfaceC0142c0;
import a0.C0238c;
import b.C0306b;
import b0.C0352v;
import e2.InterfaceC0426e;
import h1.C0501t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import m.C0619d;
import n2.AbstractC0730j;
import q.C0808d;
import q.C0809e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;
import t2.C1062o;
import t2.C1065r;
import t2.InterfaceC1054g;
import u2.C1149a;

/* loaded from: classes.dex */
public final class L implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f297f;

    public /* synthetic */ L(Object obj, int i3, Object obj2) {
        this.f295d = i3;
        this.f297f = obj;
        this.f296e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0158  */
    /* JADX WARN: Type inference failed for: r2v68, types: [X1.i, e2.e] */
    @Override // t2.InterfaceC1054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, V1.d dVar) {
        G.g gVar;
        int i3;
        q.i iVar;
        K1.c cVar;
        int i4;
        long j3;
        C1062o c1062o;
        Object obj2;
        int i5;
        L l3;
        L l4;
        C1065r c1065r;
        Object obj3;
        int i6;
        L l5;
        Object obj4 = obj;
        switch (this.f295d) {
            case 0:
                long j4 = ((C0238c) obj4).f4722a;
                C0619d c0619d = (C0619d) this.f297f;
                boolean D = l0.c.D(((C0238c) c0619d.d()).f4722a);
                R1.y yVar = R1.y.f4171a;
                if (D && l0.c.D(j4) && C0238c.e(((C0238c) c0619d.d()).f4722a) != C0238c.e(j4)) {
                    AbstractC0837y.r((InterfaceC0835w) this.f296e, null, null, new K(c0619d, j4, null), 3);
                    return yVar;
                }
                Object e3 = c0619d.e(dVar, new C0238c(j4));
                return e3 == W1.a.f4608d ? e3 : yVar;
            case 1:
                q.i iVar2 = (q.i) obj4;
                boolean z3 = iVar2 instanceof q.m;
                C0073a c0073a = (C0073a) this.f297f;
                if (z3) {
                    q.m mVar = (q.m) iVar2;
                    E.r rVar = c0073a.f939k;
                    if (rVar == null) {
                        rVar = E.C.a(c0073a.f938j);
                        c0073a.f939k = rVar;
                        f2.j.c(rVar);
                    }
                    E.u a3 = rVar.a(c0073a);
                    a3.b(mVar, c0073a.f934f, c0073a.f942n, c0073a.f943o, ((C0352v) c0073a.f936h.getValue()).f5441a, ((C0080h) c0073a.f937i.getValue()).f963d, c0073a.f944p);
                    c0073a.f940l.setValue(a3);
                } else if (iVar2 instanceof q.n) {
                    q.m mVar2 = ((q.n) iVar2).f7846a;
                    E.u uVar = (E.u) c0073a.f940l.getValue();
                    if (uVar != null) {
                        uVar.d();
                    }
                } else if (iVar2 instanceof q.l) {
                    q.m mVar3 = ((q.l) iVar2).f7844a;
                    E.u uVar2 = (E.u) c0073a.f940l.getValue();
                    if (uVar2 != null) {
                        uVar2.d();
                    }
                } else {
                    c0073a.f933e.c(iVar2, (InterfaceC0835w) this.f296e);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                q.i iVar3 = (q.i) obj4;
                boolean z4 = iVar3 instanceof q.o;
                E.y yVar2 = (E.y) this.f297f;
                if (!z4) {
                    E.F f3 = yVar2.f1017v;
                    if (f3 == null) {
                        f3 = new E.F(yVar2.f1016u, yVar2.f1013r);
                        AbstractC0993f.m(yVar2);
                        yVar2.f1017v = f3;
                    }
                    f3.c(iVar3, (InterfaceC0835w) this.f296e);
                } else if (yVar2.f1020y) {
                    yVar2.A0((q.o) iVar3);
                } else {
                    yVar2.f1021z.a(iVar3);
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof G.g) {
                    gVar = (G.g) dVar;
                    int i7 = gVar.f1998h;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        gVar.f1998h = i7 - Integer.MIN_VALUE;
                        Object obj5 = gVar.f1997g;
                        W1.a aVar = W1.a.f4608d;
                        i3 = gVar.f1998h;
                        if (i3 != 0) {
                            R1.a.e(obj5);
                            q.i iVar4 = (q.i) obj4;
                            boolean z5 = iVar4 instanceof q.m;
                            G.i iVar5 = (G.i) this.f296e;
                            if (z5) {
                                iVar5.getClass();
                                q.m mVar4 = new q.m(C0238c.g(((q.m) iVar4).f7845a, iVar5.f2003a));
                                iVar5.f2004b.put(iVar4, mVar4);
                                iVar = mVar4;
                            } else if (iVar4 instanceof q.l) {
                                q.l lVar = (q.l) iVar4;
                                q.m mVar5 = (q.m) iVar5.f2004b.remove(lVar.f7844a);
                                iVar = lVar;
                                if (mVar5 != null) {
                                    iVar = new q.l(mVar5);
                                }
                            } else {
                                boolean z6 = iVar4 instanceof q.n;
                                iVar = iVar4;
                                if (z6) {
                                    q.n nVar = (q.n) iVar4;
                                    q.m mVar6 = (q.m) iVar5.f2004b.remove(nVar.f7846a);
                                    iVar = nVar;
                                    if (mVar6 != null) {
                                        iVar = new q.n(mVar6);
                                    }
                                }
                            }
                            gVar.f1998h = 1;
                            if (((InterfaceC1054g) this.f297f).e(iVar, gVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj5);
                        }
                        return R1.y.f4171a;
                    }
                }
                gVar = new G.g(this, dVar);
                Object obj52 = gVar.f1997g;
                W1.a aVar2 = W1.a.f4608d;
                i3 = gVar.f1998h;
                if (i3 != 0) {
                }
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                if (dVar instanceof K1.c) {
                    cVar = (K1.c) dVar;
                    int i8 = cVar.f3259h;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        cVar.f3259h = i8 - Integer.MIN_VALUE;
                        Object obj6 = cVar.f3258g;
                        W1.a aVar3 = W1.a.f4608d;
                        i4 = cVar.f3259h;
                        if (i4 != 0) {
                            R1.a.e(obj6);
                            List<J1.d> list = (List) obj4;
                            ((K1.a) this.f296e).getClass();
                            long a4 = K1.a.a(false);
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(11, 0);
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(7, calendar.getFirstDayOfWeek());
                            long timeInMillis = calendar.getTimeInMillis();
                            long a5 = K1.a.a(true);
                            HashMap hashMap = new HashMap();
                            int i9 = 0;
                            int i10 = 0;
                            double d3 = 0.0d;
                            double d4 = 0.0d;
                            double d5 = 0.0d;
                            double d6 = 0.0d;
                            for (J1.d dVar2 : list) {
                                K1.c cVar2 = cVar;
                                double d7 = dVar2.f3179e;
                                d6 += d7;
                                long j5 = dVar2.f3181g;
                                if (j5 >= a4) {
                                    d3 += d7;
                                    i9++;
                                }
                                if (j5 >= timeInMillis) {
                                    d4 += d7;
                                }
                                if (j5 >= a5) {
                                    d5 += d7;
                                    i10++;
                                }
                                String str = dVar2.f3178d;
                                if (AbstractC0730j.K(str)) {
                                    str = "Other";
                                }
                                J1.e eVar = (J1.e) hashMap.get(str);
                                if (eVar == null) {
                                    j3 = a4;
                                    eVar = new J1.e(str, 0, 0.0d);
                                } else {
                                    j3 = a4;
                                }
                                hashMap.put(str, new J1.e(eVar.f3182a, eVar.f3183b + 1, eVar.f3184c + dVar2.f3179e));
                                cVar = cVar2;
                                a4 = j3;
                                timeInMillis = timeInMillis;
                            }
                            K1.c cVar3 = cVar;
                            double size = !list.isEmpty() ? d6 / list.size() : 0.0d;
                            Collection values = hashMap.values();
                            f2.j.e(values, "<get-values>(...)");
                            J1.c cVar4 = new J1.c(d3, d4, d5, d6, i9, i10, size, S1.l.W0(values, new K1.d(0)));
                            cVar3.f3259h = 1;
                            if (((InterfaceC1054g) this.f297f).e(cVar4, cVar3) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj6);
                        }
                        return R1.y.f4171a;
                    }
                }
                cVar = new K1.c(this, dVar);
                Object obj62 = cVar.f3258g;
                W1.a aVar32 = W1.a.f4608d;
                i4 = cVar.f3259h;
                if (i4 != 0) {
                }
                return R1.y.f4171a;
            case 5:
                q.i iVar6 = (q.i) obj4;
                boolean z7 = iVar6 instanceof C0808d;
                ArrayList arrayList = (ArrayList) this.f297f;
                if (z7) {
                    arrayList.add(iVar6);
                } else if (iVar6 instanceof C0809e) {
                    arrayList.remove(((C0809e) iVar6).f7838a);
                }
                ((InterfaceC0142c0) this.f296e).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return R1.y.f4171a;
            case 6:
                if (dVar instanceof C1062o) {
                    c1062o = (C1062o) dVar;
                    int i11 = c1062o.f9052i;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1062o.f9052i = i11 - Integer.MIN_VALUE;
                        obj2 = c1062o.f9051h;
                        W1.a aVar4 = W1.a.f4608d;
                        i5 = c1062o.f9052i;
                        boolean z8 = true;
                        if (i5 != 0) {
                            R1.a.e(obj2);
                            c1062o.f9050g = this;
                            c1062o.f9054k = obj4;
                            c1062o.f9052i = 1;
                            obj2 = ((C0501t) this.f297f).h(obj4, c1062o);
                            if (obj2 == aVar4) {
                                return aVar4;
                            }
                            l3 = this;
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                l4 = c1062o.f9050g;
                                R1.a.e(obj2);
                                l3 = l4;
                                if (z8) {
                                    return R1.y.f4171a;
                                }
                                throw new C1149a(l3);
                            }
                            obj4 = c1062o.f9054k;
                            l3 = c1062o.f9050g;
                            R1.a.e(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z8 = false;
                            if (z8) {
                            }
                        } else {
                            InterfaceC1054g interfaceC1054g = (InterfaceC1054g) l3.f296e;
                            c1062o.f9050g = l3;
                            c1062o.f9054k = null;
                            c1062o.f9052i = 2;
                            if (interfaceC1054g.e(obj4, c1062o) == aVar4) {
                                return aVar4;
                            }
                            l4 = l3;
                            l3 = l4;
                            if (z8) {
                            }
                        }
                    }
                }
                c1062o = new C1062o(this, dVar);
                obj2 = c1062o.f9051h;
                W1.a aVar42 = W1.a.f4608d;
                i5 = c1062o.f9052i;
                boolean z82 = true;
                if (i5 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                if (dVar instanceof C1065r) {
                    c1065r = (C1065r) dVar;
                    int i12 = c1065r.f9063i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c1065r.f9063i = i12 - Integer.MIN_VALUE;
                        obj3 = c1065r.f9062h;
                        W1.a aVar5 = W1.a.f4608d;
                        i6 = c1065r.f9063i;
                        if (i6 != 0) {
                            R1.a.e(obj3);
                            c1065r.f9061g = this;
                            c1065r.f9065k = obj4;
                            c1065r.f9063i = 1;
                            obj3 = ((X1.i) this.f297f).h(obj4, c1065r);
                            if (obj3 == aVar5) {
                                return aVar5;
                            }
                            l5 = this;
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj4 = c1065r.f9065k;
                            l5 = c1065r.f9061g;
                            R1.a.e(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return R1.y.f4171a;
                        }
                        ((f2.u) l5.f296e).f5832d = obj4;
                        throw new C1149a(l5);
                    }
                }
                c1065r = new C1065r(this, dVar);
                obj3 = c1065r.f9062h;
                W1.a aVar52 = W1.a.f4608d;
                i6 = c1065r.f9063i;
                if (i6 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            default:
                ((InterfaceC0142c0) this.f297f).setValue(Boolean.TRUE);
                ((C0148f0) this.f296e).h(((C0306b) obj4).f5283c);
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L(InterfaceC0426e interfaceC0426e, f2.u uVar) {
        this.f295d = 7;
        this.f297f = (X1.i) interfaceC0426e;
        this.f296e = uVar;
    }
}
