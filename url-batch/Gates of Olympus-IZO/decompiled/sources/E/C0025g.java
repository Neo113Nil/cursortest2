package E;

import I.C0094f0;
import I.InterfaceC0088c0;
import b.C0242b;
import b0.C0288u;
import e1.C0370t;
import h1.C0438i;
import k2.InterfaceC0550w;
import n2.C0709o;
import n2.C0712r;
import n2.InterfaceC0701g;
import o2.C0752a;
import t0.AbstractC0898f;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025g implements InterfaceC0701g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f655f;

    public /* synthetic */ C0025g(Object obj, int i3, Object obj2) {
        this.f653d = i3;
        this.f655f = obj;
        this.f654e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Type inference failed for: r14v46, types: [R1.i, Y1.e] */
    @Override // n2.InterfaceC0701g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, P1.d dVar) {
        G.c cVar;
        int i3;
        q.h hVar;
        C0709o c0709o;
        int i4;
        boolean z3;
        Object obj2;
        Object obj3;
        C0025g c0025g;
        C0712r c0712r;
        Object obj4;
        int i5;
        C0025g c0025g2;
        switch (this.f653d) {
            case 0:
                q.h hVar2 = (q.h) obj;
                boolean z4 = hVar2 instanceof q.l;
                C0019a c0019a = (C0019a) this.f655f;
                if (z4) {
                    q.l lVar = (q.l) hVar2;
                    s sVar = c0019a.f638k;
                    if (sVar == null) {
                        sVar = D.a(c0019a.f637j);
                        c0019a.f638k = sVar;
                        Z1.i.c(sVar);
                    }
                    v a3 = sVar.a(c0019a);
                    a3.b(lVar, c0019a.f633f, c0019a.f641n, c0019a.f642o, ((C0288u) c0019a.f635h.getValue()).f4298a, ((C0027i) c0019a.f636i.getValue()).f663d, c0019a.p);
                    c0019a.f639l.setValue(a3);
                } else if (hVar2 instanceof q.m) {
                    q.l lVar2 = ((q.m) hVar2).f6820a;
                    v vVar = (v) c0019a.f639l.getValue();
                    if (vVar != null) {
                        vVar.d();
                    }
                } else if (hVar2 instanceof q.k) {
                    q.l lVar3 = ((q.k) hVar2).f6818a;
                    v vVar2 = (v) c0019a.f639l.getValue();
                    if (vVar2 != null) {
                        vVar2.d();
                    }
                } else {
                    c0019a.f632e.c(hVar2, (InterfaceC0550w) this.f654e);
                }
                return L1.z.f2729a;
            case 1:
                q.h hVar3 = (q.h) obj;
                boolean z5 = hVar3 instanceof q.n;
                z zVar = (z) this.f655f;
                if (!z5) {
                    G g3 = zVar.f717v;
                    if (g3 == null) {
                        g3 = new G(zVar.f713r, zVar.f716u);
                        AbstractC0898f.m(zVar);
                        zVar.f717v = g3;
                    }
                    g3.c(hVar3, (InterfaceC0550w) this.f654e);
                } else if (zVar.f720y) {
                    zVar.x0((q.n) hVar3);
                } else {
                    zVar.f721z.a(hVar3);
                }
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof G.c) {
                    cVar = (G.c) dVar;
                    int i6 = cVar.f1510e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        cVar.f1510e = i6 - Integer.MIN_VALUE;
                        Object obj5 = cVar.f1509d;
                        Q1.a aVar = Q1.a.f3113d;
                        i3 = cVar.f1510e;
                        if (i3 != 0) {
                            I2.l.Q(obj5);
                            q.h hVar4 = (q.h) obj;
                            boolean z6 = hVar4 instanceof q.l;
                            G.e eVar = (G.e) this.f654e;
                            if (z6) {
                                eVar.getClass();
                                q.l lVar4 = new q.l(a0.c.g(((q.l) hVar4).f6819a, eVar.f1515a));
                                eVar.f1516b.put(hVar4, lVar4);
                                hVar = lVar4;
                            } else if (hVar4 instanceof q.k) {
                                q.k kVar = (q.k) hVar4;
                                q.l lVar5 = (q.l) eVar.f1516b.remove(kVar.f6818a);
                                hVar = kVar;
                                if (lVar5 != null) {
                                    hVar = new q.k(lVar5);
                                }
                            } else {
                                boolean z7 = hVar4 instanceof q.m;
                                hVar = hVar4;
                                if (z7) {
                                    q.m mVar = (q.m) hVar4;
                                    q.l lVar6 = (q.l) eVar.f1516b.remove(mVar.f6820a);
                                    hVar = mVar;
                                    if (lVar6 != null) {
                                        hVar = new q.m(lVar6);
                                    }
                                }
                            }
                            cVar.f1510e = 1;
                            if (((InterfaceC0701g) this.f655f).emit(hVar, cVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            I2.l.Q(obj5);
                        }
                        return L1.z.f2729a;
                    }
                }
                cVar = new G.c(this, dVar);
                Object obj52 = cVar.f1509d;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = cVar.f1510e;
                if (i3 != 0) {
                }
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof C0709o) {
                    c0709o = (C0709o) dVar;
                    int i7 = c0709o.f6369f;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0709o.f6369f = i7 - Integer.MIN_VALUE;
                        Object obj6 = c0709o.f6368e;
                        Q1.a aVar3 = Q1.a.f3113d;
                        i4 = c0709o.f6369f;
                        z3 = true;
                        if (i4 != 0) {
                            I2.l.Q(obj6);
                            c0709o.f6367d = this;
                            c0709o.f6371h = obj;
                            c0709o.f6369f = 1;
                            Object g4 = ((C0370t) this.f655f).g(obj, c0709o);
                            if (g4 == aVar3) {
                                return aVar3;
                            }
                            obj2 = g4;
                            obj3 = obj;
                            c0025g = this;
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0025g = c0709o.f6367d;
                                I2.l.Q(obj6);
                                if (z3) {
                                    return L1.z.f2729a;
                                }
                                throw new C0752a(c0025g);
                            }
                            Object obj7 = c0709o.f6371h;
                            C0025g c0025g3 = c0709o.f6367d;
                            I2.l.Q(obj6);
                            obj3 = obj7;
                            c0025g = c0025g3;
                            obj2 = obj6;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z3 = false;
                        } else {
                            InterfaceC0701g interfaceC0701g = (InterfaceC0701g) c0025g.f654e;
                            c0709o.f6367d = c0025g;
                            c0709o.f6371h = null;
                            c0709o.f6369f = 2;
                            if (interfaceC0701g.emit(obj3, c0709o) == aVar3) {
                                return aVar3;
                            }
                        }
                        if (z3) {
                        }
                    }
                }
                c0709o = new C0709o(this, dVar);
                Object obj62 = c0709o.f6368e;
                Q1.a aVar32 = Q1.a.f3113d;
                i4 = c0709o.f6369f;
                z3 = true;
                if (i4 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z3) {
                }
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                if (dVar instanceof C0712r) {
                    c0712r = (C0712r) dVar;
                    int i8 = c0712r.f6379f;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0712r.f6379f = i8 - Integer.MIN_VALUE;
                        obj4 = c0712r.f6378e;
                        Q1.a aVar4 = Q1.a.f3113d;
                        i5 = c0712r.f6379f;
                        if (i5 != 0) {
                            I2.l.Q(obj4);
                            c0712r.f6377d = this;
                            c0712r.f6381h = obj;
                            c0712r.f6379f = 1;
                            obj4 = ((R1.i) this.f655f).g(obj, c0712r);
                            if (obj4 == aVar4) {
                                return aVar4;
                            }
                            c0025g2 = this;
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0712r.f6381h;
                            c0025g2 = c0712r.f6377d;
                            I2.l.Q(obj4);
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return L1.z.f2729a;
                        }
                        ((Z1.t) c0025g2.f654e).f3480d = obj;
                        throw new C0752a(c0025g2);
                    }
                }
                c0712r = new C0712r(this, dVar);
                obj4 = c0712r.f6378e;
                Q1.a aVar42 = Q1.a.f3113d;
                i5 = c0712r.f6379f;
                if (i5 != 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
            default:
                ((InterfaceC0088c0) this.f655f).setValue(Boolean.TRUE);
                ((C0094f0) this.f654e).h(((C0242b) obj).f4148c);
                return L1.z.f2729a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0025g(Y1.e eVar, Z1.t tVar) {
        this.f653d = 4;
        this.f655f = (R1.i) eVar;
        this.f654e = tVar;
    }
}
