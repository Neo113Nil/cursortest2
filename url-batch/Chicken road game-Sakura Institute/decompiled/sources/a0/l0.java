package a0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f104g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f105h;

    public l0(f7.e eVar, r6.v vVar, f7.g gVar) {
        this.f103f = 4;
        this.f105h = vVar;
        this.f104g = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    @Override // f7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, h6.d dVar) {
        e0.d dVar2;
        int i7;
        p.h hVar;
        f7.d dVar3;
        int i8;
        f7.o oVar;
        int i9;
        boolean z8;
        Object obj2;
        Object obj3;
        l0 l0Var;
        f7.r rVar;
        Object obj4;
        int i10;
        l0 l0Var2;
        switch (this.f103f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j8 = ((y0.c) obj).f9778a;
                l.d dVar4 = (l.d) this.f105h;
                boolean h3 = u3.r.h(((y0.c) dVar4.d()).f9778a);
                d6.z zVar = d6.z.f2639a;
                if (h3 && u3.r.h(j8) && y0.c.e(((y0.c) dVar4.d()).f9778a) != y0.c.e(j8)) {
                    c7.a0.p((c7.x) this.f104g, null, null, new k0(dVar4, j8, (h6.d) null), 3);
                    return zVar;
                }
                Object e9 = dVar4.e(dVar, new y0.c(j8));
                return e9 == i6.a.f4956f ? e9 : zVar;
            case 1:
                p.h hVar2 = (p.h) obj;
                c0.a aVar = (c0.a) this.f105h;
                if (hVar2 instanceof p.l) {
                    p.l lVar = (p.l) hVar2;
                    c0.l lVar2 = aVar.f1444m;
                    if (lVar2 == null) {
                        lVar2 = c0.u.a(aVar.f1443l);
                        aVar.f1444m = lVar2;
                    }
                    c0.n a3 = lVar2.a(aVar);
                    a3.b(lVar, aVar.f1439h, aVar.f1447p, aVar.f1448q, ((z0.u) aVar.f1441j.getValue()).f10059a, ((c0.f) aVar.f1442k.getValue()).f1457d, aVar.f1449r);
                    aVar.f1445n.setValue(a3);
                } else if (hVar2 instanceof p.m) {
                    c0.n nVar = (c0.n) aVar.f1445n.getValue();
                    if (nVar != null) {
                        nVar.d();
                    }
                } else if (hVar2 instanceof p.k) {
                    c0.n nVar2 = (c0.n) aVar.f1445n.getValue();
                    if (nVar2 != null) {
                        nVar2.d();
                    }
                } else {
                    aVar.f1438g.b(hVar2, (c7.x) this.f104g);
                }
                return d6.z.f2639a;
            case 2:
                p.h hVar3 = (p.h) obj;
                c0.q qVar = (c0.q) this.f105h;
                if (!(hVar3 instanceof p.n)) {
                    c7.x xVar = (c7.x) this.f104g;
                    c0.w wVar = qVar.f1500x;
                    if (wVar == null) {
                        wVar = new c0.w(qVar.f1499w, qVar.f1496t);
                        r1.f.m(qVar);
                        qVar.f1500x = wVar;
                    }
                    wVar.b(hVar3, xVar);
                } else if (qVar.A) {
                    qVar.C0((p.n) hVar3);
                } else {
                    qVar.B.a(hVar3);
                }
                return d6.z.f2639a;
            case 3:
                e0.f fVar = (e0.f) this.f104g;
                LinkedHashMap linkedHashMap = fVar.f2680b;
                if (dVar instanceof e0.d) {
                    dVar2 = (e0.d) dVar;
                    int i11 = dVar2.f2674g;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        dVar2.f2674g = i11 - Integer.MIN_VALUE;
                        Object obj5 = dVar2.f2673f;
                        i7 = dVar2.f2674g;
                        if (i7 != 0) {
                            d6.a.e(obj5);
                            f7.g gVar = (f7.g) this.f105h;
                            p.h hVar4 = (p.h) obj;
                            if (hVar4 instanceof p.l) {
                                p.l lVar3 = new p.l(y0.c.g(((p.l) hVar4).f6978a, fVar.f2679a));
                                linkedHashMap.put(hVar4, lVar3);
                                hVar = lVar3;
                            } else if (hVar4 instanceof p.k) {
                                p.k kVar = (p.k) hVar4;
                                p.l lVar4 = (p.l) linkedHashMap.remove(kVar.f6977a);
                                hVar = kVar;
                                if (lVar4 != null) {
                                    hVar = new p.k(lVar4);
                                }
                            } else {
                                boolean z9 = hVar4 instanceof p.m;
                                hVar = hVar4;
                                if (z9) {
                                    p.m mVar = (p.m) hVar4;
                                    p.l lVar5 = (p.l) linkedHashMap.remove(mVar.f6979a);
                                    hVar = mVar;
                                    if (lVar5 != null) {
                                        hVar = new p.m(lVar5);
                                    }
                                }
                            }
                            dVar2.f2674g = 1;
                            Object k8 = gVar.k(hVar, dVar2);
                            i6.a aVar2 = i6.a.f4956f;
                            if (k8 == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj5);
                        }
                        return d6.z.f2639a;
                    }
                }
                dVar2 = new e0.d(this, dVar);
                Object obj52 = dVar2.f2673f;
                i7 = dVar2.f2674g;
                if (i7 != 0) {
                }
                return d6.z.f2639a;
            case 4:
                r6.v vVar = (r6.v) this.f105h;
                if (dVar instanceof f7.d) {
                    dVar3 = (f7.d) dVar;
                    int i12 = dVar3.f3452h;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dVar3.f3452h = i12 - Integer.MIN_VALUE;
                        Object obj6 = dVar3.f3450f;
                        i8 = dVar3.f3452h;
                        d6.z zVar2 = d6.z.f2639a;
                        if (i8 == 0) {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d6.a.e(obj6);
                            return zVar2;
                        }
                        d6.a.e(obj6);
                        Object obj7 = vVar.f7968f;
                        if (obj7 != g7.c.f4481b && r6.k.a(obj7, obj)) {
                            return zVar2;
                        }
                        vVar.f7968f = obj;
                        f7.g gVar2 = (f7.g) this.f104g;
                        dVar3.f3452h = 1;
                        Object k9 = gVar2.k(obj, dVar3);
                        i6.a aVar3 = i6.a.f4956f;
                        return k9 == aVar3 ? aVar3 : zVar2;
                    }
                }
                dVar3 = new f7.d(this, dVar);
                Object obj62 = dVar3.f3450f;
                i8 = dVar3.f3452h;
                d6.z zVar22 = d6.z.f2639a;
                if (i8 == 0) {
                }
                break;
            case 5:
                if (dVar instanceof f7.o) {
                    oVar = (f7.o) dVar;
                    int i13 = oVar.f3526h;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        oVar.f3526h = i13 - Integer.MIN_VALUE;
                        Object obj8 = oVar.f3525g;
                        i9 = oVar.f3526h;
                        z8 = true;
                        i6.a aVar4 = i6.a.f4956f;
                        if (i9 != 0) {
                            d6.a.e(obj8);
                            f7.m0 m0Var = (f7.m0) this.f105h;
                            oVar.f3524f = this;
                            oVar.f3528j = obj;
                            oVar.f3526h = 1;
                            Object d8 = m0Var.d(obj, oVar);
                            if (d8 == aVar4) {
                                return aVar4;
                            }
                            obj2 = d8;
                            obj3 = obj;
                            l0Var = this;
                        } else {
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                l0Var = oVar.f3524f;
                                d6.a.e(obj8);
                                if (z8) {
                                    return d6.z.f2639a;
                                }
                                throw new g7.a(l0Var);
                            }
                            Object obj9 = oVar.f3528j;
                            l0 l0Var3 = oVar.f3524f;
                            d6.a.e(obj8);
                            obj3 = obj9;
                            l0Var = l0Var3;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z8 = false;
                        } else {
                            f7.g gVar3 = (f7.g) l0Var.f104g;
                            oVar.f3524f = l0Var;
                            oVar.f3528j = null;
                            oVar.f3526h = 2;
                            if (gVar3.k(obj3, oVar) == aVar4) {
                                return aVar4;
                            }
                        }
                        if (z8) {
                        }
                    }
                }
                oVar = new f7.o(this, dVar);
                Object obj82 = oVar.f3525g;
                i9 = oVar.f3526h;
                z8 = true;
                i6.a aVar42 = i6.a.f4956f;
                if (i9 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z8) {
                }
            case 6:
                if (dVar instanceof f7.r) {
                    rVar = (f7.r) dVar;
                    int i14 = rVar.f3547h;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        rVar.f3547h = i14 - Integer.MIN_VALUE;
                        obj4 = rVar.f3546g;
                        i10 = rVar.f3547h;
                        if (i10 != 0) {
                            d6.a.e(obj4);
                            q6.e eVar = (q6.e) this.f105h;
                            rVar.f3545f = this;
                            rVar.f3549j = obj;
                            rVar.f3547h = 1;
                            obj4 = eVar.d(obj, rVar);
                            i6.a aVar5 = i6.a.f4956f;
                            if (obj4 == aVar5) {
                                return aVar5;
                            }
                            l0Var2 = this;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = rVar.f3549j;
                            l0Var2 = rVar.f3545f;
                            d6.a.e(obj4);
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return d6.z.f2639a;
                        }
                        ((r6.v) l0Var2.f104g).f7968f = obj;
                        throw new g7.a(l0Var2);
                    }
                }
                rVar = new f7.r(this, dVar);
                obj4 = rVar.f3546g;
                i10 = rVar.f3547h;
                if (i10 != 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                p.h hVar5 = (p.h) obj;
                ArrayList arrayList = (ArrayList) this.f105h;
                if (hVar5 instanceof p.d) {
                    arrayList.add(hVar5);
                } else if (hVar5 instanceof p.e) {
                    arrayList.remove(((p.e) hVar5).f6974a);
                }
                ((g0.z0) this.f104g).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return d6.z.f2639a;
            default:
                ((g0.z0) this.f105h).setValue(Boolean.TRUE);
                ((g0.c1) this.f104g).f(((b.b) obj).f1136c);
                return d6.z.f2639a;
        }
    }

    public /* synthetic */ l0(Object obj, int i7, Object obj2) {
        this.f103f = i7;
        this.f105h = obj;
        this.f104g = obj2;
    }
}
