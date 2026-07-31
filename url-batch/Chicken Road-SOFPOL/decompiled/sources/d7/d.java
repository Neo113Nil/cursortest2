package d7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import r.q1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2347f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f2345d = i;
        this.f2347f = obj;
        this.f2346e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // d7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, g6.c cVar) {
        c cVar2;
        int i;
        q qVar;
        int i8;
        boolean z3;
        Object obj2;
        Object obj3;
        d dVar;
        t tVar;
        Object obj4;
        int i9;
        d dVar2;
        k0.f fVar;
        int i10;
        v.h hVar;
        switch (this.f2345d) {
            case 0:
                q6.s sVar = (q6.s) this.f2347f;
                if (cVar instanceof c) {
                    cVar2 = (c) cVar;
                    int i11 = cVar2.i;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        cVar2.i = i11 - Integer.MIN_VALUE;
                        Object obj5 = cVar2.f2337g;
                        i = cVar2.i;
                        c6.m mVar = c6.m.f1757a;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj5);
                            return mVar;
                        }
                        s6.a.K(obj5);
                        Object obj6 = sVar.f6205d;
                        if (obj6 != e7.c.f2544b && q6.i.a(obj6, obj)) {
                            return mVar;
                        }
                        sVar.f6205d = obj;
                        g gVar = (g) this.f2346e;
                        cVar2.i = 1;
                        Object a8 = gVar.a(obj, cVar2);
                        h6.a aVar = h6.a.f3204d;
                        return a8 == aVar ? aVar : mVar;
                    }
                }
                cVar2 = new c(this, cVar);
                Object obj52 = cVar2.f2337g;
                i = cVar2.i;
                c6.m mVar2 = c6.m.f1757a;
                if (i == 0) {
                }
                break;
            case 1:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i12 = qVar.i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        qVar.i = i12 - Integer.MIN_VALUE;
                        Object obj7 = qVar.f2413h;
                        i8 = qVar.i;
                        z3 = true;
                        h6.a aVar2 = h6.a.f3204d;
                        if (i8 != 0) {
                            s6.a.K(obj7);
                            b6.m mVar3 = (b6.m) this.f2347f;
                            qVar.f2412g = this;
                            qVar.f2415k = obj;
                            qVar.i = 1;
                            Object g3 = mVar3.g(obj, qVar);
                            if (g3 == aVar2) {
                                return aVar2;
                            }
                            obj2 = g3;
                            obj3 = obj;
                            dVar = this;
                        } else {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                dVar = qVar.f2412g;
                                s6.a.K(obj7);
                                if (z3) {
                                    return c6.m.f1757a;
                                }
                                throw new e7.a(dVar);
                            }
                            Object obj8 = qVar.f2415k;
                            d dVar3 = qVar.f2412g;
                            s6.a.K(obj7);
                            obj3 = obj8;
                            dVar = dVar3;
                            obj2 = obj7;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z3 = false;
                        } else {
                            g gVar2 = (g) dVar.f2346e;
                            qVar.f2412g = dVar;
                            qVar.f2415k = null;
                            qVar.i = 2;
                            if (gVar2.a(obj3, qVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        if (z3) {
                        }
                    }
                }
                qVar = new q(this, cVar);
                Object obj72 = qVar.f2413h;
                i8 = qVar.i;
                z3 = true;
                h6.a aVar22 = h6.a.f3204d;
                if (i8 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z3) {
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (cVar instanceof t) {
                    tVar = (t) cVar;
                    int i13 = tVar.i;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        tVar.i = i13 - Integer.MIN_VALUE;
                        obj4 = tVar.f2421h;
                        i9 = tVar.i;
                        if (i9 != 0) {
                            s6.a.K(obj4);
                            p6.e eVar = (p6.e) this.f2346e;
                            tVar.f2420g = this;
                            tVar.f2423k = obj;
                            tVar.i = 1;
                            obj4 = eVar.g(obj, tVar);
                            h6.a aVar3 = h6.a.f3204d;
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            dVar2 = this;
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = tVar.f2423k;
                            dVar2 = tVar.f2420g;
                            s6.a.K(obj4);
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return c6.m.f1757a;
                        }
                        ((q6.s) dVar2.f2347f).f6205d = obj;
                        throw new e7.a(dVar2);
                    }
                }
                tVar = new t(this, cVar);
                obj4 = tVar.f2421h;
                i9 = tVar.i;
                if (i9 != 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                v.h hVar2 = (v.h) obj;
                i0.a aVar4 = (i0.a) this.f2347f;
                if (!(hVar2 instanceof v.n)) {
                    a7.u uVar = (a7.u) this.f2346e;
                    i0.h hVar3 = aVar4.f3261w;
                    if (hVar3 == null) {
                        boolean z7 = aVar4.f3257s;
                        j0.l0 l0Var = aVar4.f3260v;
                        hVar3 = new i0.h();
                        hVar3.f3282a = z7;
                        hVar3.f3283b = l0Var;
                        hVar3.f3284c = new r.c(Float.valueOf(0.0f), r.d.f6262j, Float.valueOf(0.01f), 8);
                        hVar3.f3285d = new ArrayList();
                        w1.f.l(aVar4);
                        aVar4.f3261w = hVar3;
                    }
                    ArrayList arrayList = (ArrayList) hVar3.f3285d;
                    if (hVar2 instanceof v.f) {
                        arrayList.add(hVar2);
                    } else if (hVar2 instanceof v.g) {
                        arrayList.remove(((v.g) hVar2).f7418a);
                    } else if (hVar2 instanceof v.d) {
                        arrayList.add(hVar2);
                    } else if (hVar2 instanceof v.e) {
                        arrayList.remove(((v.e) hVar2).f7417a);
                    } else if (hVar2 instanceof v.b) {
                        arrayList.add(hVar2);
                    } else if (hVar2 instanceof v.c) {
                        arrayList.remove(((v.c) hVar2).f7416a);
                    } else if (hVar2 instanceof v.a) {
                        arrayList.remove(((v.a) hVar2).f7415a);
                    }
                    v.h hVar4 = (v.h) d6.m.Y(arrayList);
                    if (!q6.i.a((v.h) hVar3.f3286e, hVar4)) {
                        g6.c cVar3 = null;
                        if (hVar4 != null) {
                            ((j0.l0) hVar3.f3283b).b();
                            boolean z8 = hVar4 instanceof v.f;
                            float f6 = z8 ? 0.08f : hVar4 instanceof v.d ? 0.1f : hVar4 instanceof v.b ? 0.16f : 0.0f;
                            q1 q1Var = i0.f.f3277a;
                            if (!z8) {
                                if (hVar4 instanceof v.d) {
                                    q1Var = new q1(45, 0, r.u.f6438b);
                                } else if (hVar4 instanceof v.b) {
                                    q1Var = new q1(45, 0, r.u.f6438b);
                                }
                            }
                            a7.x.n(uVar, null, new i0.g(hVar3, f6, q1Var, (g6.c) null), 3);
                        } else {
                            v.h hVar5 = (v.h) hVar3.f3286e;
                            q1 q1Var2 = i0.f.f3277a;
                            if (!(hVar5 instanceof v.f) && !(hVar5 instanceof v.d) && (hVar5 instanceof v.b)) {
                                q1Var2 = new q1(150, 0, r.u.f6438b);
                            }
                            a7.x.n(uVar, null, new b0.d(hVar3, q1Var2, cVar3, 7), 3);
                        }
                        hVar3.f3286e = hVar4;
                    }
                } else if (aVar4.f3264z) {
                    aVar4.r0((v.n) hVar2);
                } else {
                    aVar4.A.a(hVar2);
                }
                return c6.m.f1757a;
            default:
                k0.g gVar3 = (k0.g) this.f2347f;
                LinkedHashMap linkedHashMap = gVar3.f4160b;
                if (cVar instanceof k0.f) {
                    fVar = (k0.f) cVar;
                    int i14 = fVar.f4158h;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        fVar.f4158h = i14 - Integer.MIN_VALUE;
                        Object obj9 = fVar.f4157g;
                        i10 = fVar.f4158h;
                        if (i10 != 0) {
                            s6.a.K(obj9);
                            g gVar4 = (g) this.f2346e;
                            v.h hVar6 = (v.h) obj;
                            if (hVar6 instanceof v.l) {
                                v.l lVar = new v.l(e1.b.d(((v.l) hVar6).f7421a, gVar3.f4159a));
                                linkedHashMap.put(hVar6, lVar);
                                hVar = lVar;
                            } else if (hVar6 instanceof v.k) {
                                v.k kVar = (v.k) hVar6;
                                v.l lVar2 = (v.l) linkedHashMap.remove(kVar.f7420a);
                                hVar = kVar;
                                if (lVar2 != null) {
                                    hVar = new v.k(lVar2);
                                }
                            } else {
                                boolean z9 = hVar6 instanceof v.m;
                                hVar = hVar6;
                                if (z9) {
                                    v.m mVar4 = (v.m) hVar6;
                                    v.l lVar3 = (v.l) linkedHashMap.remove(mVar4.f7422a);
                                    hVar = mVar4;
                                    if (lVar3 != null) {
                                        hVar = new v.m(lVar3);
                                    }
                                }
                            }
                            fVar.f4158h = 1;
                            Object a9 = gVar4.a(hVar, fVar);
                            h6.a aVar5 = h6.a.f3204d;
                            if (a9 == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj9);
                        }
                        return c6.m.f1757a;
                    }
                }
                fVar = new k0.f(this, cVar);
                Object obj92 = fVar.f4157g;
                i10 = fVar.f4158h;
                if (i10 != 0) {
                }
                return c6.m.f1757a;
        }
    }

    public /* synthetic */ d(int i, Object obj, Object obj2, boolean z3) {
        this.f2345d = i;
        this.f2346e = obj;
        this.f2347f = obj2;
    }

    public d(e eVar, q6.s sVar, g gVar) {
        this.f2345d = 0;
        this.f2347f = sVar;
        this.f2346e = gVar;
    }
}
