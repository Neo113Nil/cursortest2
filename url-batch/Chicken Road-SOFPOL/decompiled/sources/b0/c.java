package b0;

import a0.t0;
import a7.e0;
import a7.u;
import b6.b2;
import b6.k1;
import b6.n;
import b6.w;
import b6.x;
import b6.x0;
import c6.m;
import c7.q;
import d7.g;
import d7.k;
import d7.p0;
import g6.h;
import i6.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import l.r;
import m0.h1;
import m0.q1;
import m0.q2;
import m0.r2;
import m0.w0;
import m0.x1;
import m0.z0;
import o.k0;
import r.l1;
import r.o1;
import r.s0;
import r2.o;
import t.j0;
import t.m0;
import t.n0;
import t.v;
import u.c1;
import u.e1;
import u.l0;
import u.z;
import v.j;
import v.l;
import w0.s;
import w1.d1;
import x.v0;
import x1.i1;
import y3.b0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1033h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1034j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1035k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1036l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, g6.c cVar, int i) {
        super(2, cVar);
        this.f1033h = i;
        this.f1036l = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1033h) {
            case 0:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 1:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 5:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 6:
                return ((c) l((g6.c) obj2, (q1) obj)).p(m.f1757a);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((c) l((g6.c) obj2, (q1) obj)).p(m.f1757a);
            case v0.f8304b /* 9 */:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case v0.f8306d /* 10 */:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 11:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 12:
                return ((c) l((g6.c) obj2, (l0) obj)).p(m.f1757a);
            case 13:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 14:
                return ((c) l((g6.c) obj2, (c1) obj)).p(m.f1757a);
            case v0.f8308f /* 15 */:
                return ((c) l((g6.c) obj2, (l0) obj)).p(m.f1757a);
            case 16:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 17:
                return ((c) l((g6.c) obj2, (g) obj)).p(m.f1757a);
            default:
                return ((c) l((g6.c) obj2, (u) obj)).p(m.f1757a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [i6.i, p6.e] */
    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1033h) {
            case 0:
                return new c((f) this.f1034j, (d1) this.f1035k, (a2.b) this.f1036l, cVar, 0);
            case 1:
                return new c((x0) this.f1034j, (w) this.f1035k, (z0) this.f1036l, cVar, 1);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new c((w) this.f1034j, (k1) this.f1035k, (z0) this.f1036l, cVar, 2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new c((z0) this.f1034j, (z0) this.f1035k, (z0) this.f1036l, cVar, 3);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                c cVar2 = new c((g) this.f1035k, (e7.e) this.f1036l, cVar, 4);
                cVar2.f1034j = obj;
                return cVar2;
            case 5:
                c cVar3 = new c((x1) this.f1035k, (w0) this.f1036l, cVar, 5);
                cVar3.f1034j = obj;
                return cVar3;
            case 6:
                c cVar4 = new c((h) this.f1035k, (d7.f) this.f1036l, cVar, 6);
                cVar4.f1034j = obj;
                return cVar4;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new c((s0) this.f1034j, (z0) this.f1035k, (m0.d1) this.f1036l, cVar, 7);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                c cVar5 = new c((l1) this.f1035k, (z0) this.f1036l, cVar, 8);
                cVar5.f1034j = obj;
                return cVar5;
            case v0.f8304b /* 9 */:
                return new c((s0) this.f1036l, cVar, 9);
            case v0.f8306d /* 10 */:
                return new c((j) this.f1034j, (l) this.f1035k, (t.u) this.f1036l, cVar, 10);
            case 11:
                return new c((j) this.f1034j, (v.h) this.f1035k, (e0) this.f1036l, cVar, 11);
            case 12:
                c cVar6 = new c((r) this.f1035k, (p6.e) this.f1036l, cVar, 12);
                cVar6.f1034j = obj;
                return cVar6;
            case 13:
                return new c((r) this.f1034j, (j0) this.f1035k, (p6.e) this.f1036l, cVar, 13);
            case 14:
                c cVar7 = new c((z) this.f1035k, (e1) this.f1036l, cVar, 14);
                cVar7.f1034j = obj;
                return cVar7;
            case v0.f8308f /* 15 */:
                c cVar8 = new c((e1) this.f1035k, (p6.e) this.f1036l, cVar, 15);
                cVar8.f1034j = obj;
                return cVar8;
            case 16:
                return new c((c7.c) this.f1036l, cVar, 16);
            case 17:
                c cVar9 = new c((b0) this.f1036l, cVar, 17);
                cVar9.f1035k = obj;
                return cVar9;
            default:
                c cVar10 = new c((b0) this.f1035k, (p6.e) this.f1036l, cVar);
                cVar10.f1034j = obj;
                return cVar10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:351:0x0658, code lost:
    
        if (a7.x.c(500, r14) == r1) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0764, code lost:
    
        if (r15 == r2) goto L372;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:85:0x019e, B:86:0x01c8, B:88:0x01d0, B:89:0x01de, B:96:0x01ec, B:98:0x01bb, B:102:0x01ef, B:105:0x01f4, B:106:0x01f5, B:113:0x01b5, B:91:0x01df, B:93:0x01e5), top: B:81:0x0192, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r15v58, types: [c6.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [c7.q] */
    /* JADX WARN: Type inference failed for: r7v10, types: [i6.i, p6.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01c5 -> B:80:0x01c8). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        Object obj2;
        i7.c cVar;
        c7.c cVar2;
        c7.b bVar;
        g gVar;
        y3.s0 s0Var;
        switch (this.f1033h) {
            case 0:
                m mVar = m.f1757a;
                f fVar = (f) this.f1034j;
                h6.a aVar = h6.a.f3204d;
                int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                u.g gVar2 = fVar.f1044r;
                b bVar2 = new b(fVar, (d1) this.f1035k, (a2.b) this.f1036l);
                this.i = 1;
                gVar2.getClass();
                e1.c cVar3 = (e1.c) bVar2.b();
                if (cVar3 != null && !gVar2.t0(cVar3, gVar2.f6994y)) {
                    a7.h hVar = new a7.h(1, m.a.G(this));
                    hVar.t();
                    u.f fVar2 = new u.f(bVar2, hVar);
                    a0.l lVar = gVar2.f6990u;
                    o0.e eVar = lVar.f112a;
                    e1.c cVar4 = (e1.c) bVar2.b();
                    if (cVar4 == null) {
                        hVar.k(mVar);
                    } else {
                        hVar.v(new a0.v0(18, lVar, fVar2));
                        v6.d u02 = o.u0(0, eVar.f5580f);
                        int i8 = u02.f7492d;
                        int i9 = u02.f7493e;
                        if (i8 <= i9) {
                            while (true) {
                                e1.c cVar5 = (e1.c) ((u.f) eVar.f5578d[i9]).f6974a.b();
                                if (cVar5 != null) {
                                    e1.c c8 = cVar4.c(cVar5);
                                    if (c8.equals(cVar4)) {
                                        eVar.a(i9 + 1, fVar2);
                                    } else if (!c8.equals(cVar5)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i10 = eVar.f5580f - 1;
                                        if (i10 <= i9) {
                                            while (true) {
                                                ((u.f) eVar.f5578d[i9]).f6975b.m(cancellationException);
                                                if (i10 != i9) {
                                                    i10++;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i9 != i8) {
                                    i9--;
                                }
                            }
                        }
                        eVar.a(0, fVar2);
                        if (!gVar2.f6995z) {
                            gVar2.u0();
                        }
                    }
                    obj2 = hVar.s();
                    break;
                }
                obj2 = mVar;
                return obj2 == aVar ? aVar : mVar;
            case 1:
                m mVar2 = m.f1757a;
                h6.a aVar2 = h6.a.f3204d;
                int i11 = this.i;
                if (i11 == 0) {
                    s6.a.K(obj);
                    this.i = 1;
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        return mVar2;
                    }
                    s6.a.K(obj);
                }
                ((z0) this.f1036l).setValue(Boolean.TRUE);
                int i12 = ((x0) this.f1034j).f1499a;
                if (i12 >= 20) {
                    return mVar2;
                }
                w wVar = (w) this.f1035k;
                this.i = 2;
                Object h8 = x.a(wVar.f1488a).h(new b4.b(new n(i12 + 1, 0, null), null, 1), this);
                if (h8 != aVar2) {
                    h8 = mVar2;
                }
                if (h8 != aVar2) {
                    return mVar2;
                }
                return aVar2;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m mVar3 = m.f1757a;
                h6.a aVar3 = h6.a.f3204d;
                int i13 = this.i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar3;
                }
                s6.a.K(obj);
                w wVar2 = (w) this.f1034j;
                int i14 = ((k1) this.f1035k).f1372a;
                int intValue = ((Number) ((z0) this.f1036l).getValue()).intValue();
                this.i = 1;
                Object h9 = x.a(wVar2.f1488a).h(new b4.b(new t0(i14, intValue, (g6.c) null), null, 1), this);
                if (h9 != aVar3) {
                    h9 = mVar3;
                }
                return h9 == aVar3 ? aVar3 : mVar3;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                h6.a aVar4 = h6.a.f3204d;
                int i15 = this.i;
                if (i15 == 0) {
                    s6.a.K(obj);
                    this.i = 1;
                    if (a7.x.c(16L, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                z0 z0Var = (z0) this.f1034j;
                List<b2> list = (List) z0Var.getValue();
                z0 z0Var2 = (z0) this.f1035k;
                z0 z0Var3 = (z0) this.f1036l;
                ArrayList arrayList = new ArrayList(d6.n.M(list, 10));
                for (b2 b2Var : list) {
                    float f6 = b2Var.f1274b + b2Var.f1276d;
                    arrayList.add(f6 > ((Number) z0Var2.getValue()).floatValue() + ((float) 50) ? b2.a(b2Var, ((Number) z0Var3.getValue()).floatValue() * t6.e.f6924d.a(), -50.0f, 28) : b2.a(b2Var, 0.0f, f6, 29));
                }
                z0Var.setValue(arrayList);
                return m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                m mVar4 = m.f1757a;
                h6.a aVar5 = h6.a.f3204d;
                int i16 = this.i;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar4;
                }
                s6.a.K(obj);
                u uVar = (u) this.f1034j;
                g gVar3 = (g) this.f1035k;
                q g3 = ((e7.e) this.f1036l).g(uVar);
                this.i = 1;
                Object g7 = d7.e0.g(gVar3, g3, true, this);
                if (g7 != aVar5) {
                    g7 = mVar4;
                }
                return g7 == aVar5 ? aVar5 : mVar4;
            case 5:
                h6.a aVar6 = h6.a.f3204d;
                int i17 = this.i;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return m.f1757a;
                }
                s6.a.K(obj);
                u uVar2 = (u) this.f1034j;
                x1 x1Var = (x1) this.f1035k;
                w0 w0Var = (w0) this.f1036l;
                this.i = 1;
                x1Var.d(uVar2, w0Var, this);
                return aVar6;
            case 6:
                d7.f fVar3 = (d7.f) this.f1036l;
                h hVar2 = (h) this.f1035k;
                h6.a aVar7 = h6.a.f3204d;
                int i18 = this.i;
                if (i18 == 0) {
                    s6.a.K(obj);
                    q1 q1Var = (q1) this.f1034j;
                    if (q6.i.a(hVar2, g6.i.f3046d)) {
                        q2 q2Var = new q2(q1Var, 0);
                        this.i = 1;
                        if (fVar3.c(q2Var, this) == aVar7) {
                            return aVar7;
                        }
                    } else {
                        d dVar = new d(fVar3, q1Var, null, 8);
                        this.i = 2;
                        if (a7.x.u(hVar2, dVar, this) == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i18 != 1 && i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                z0 z0Var4 = (z0) this.f1035k;
                h6.a aVar8 = h6.a.f3204d;
                int i19 = this.i;
                if (i19 == 0) {
                    s6.a.K(obj);
                    if (((List) z0Var4.getValue()).size() > 1) {
                        o4.d dVar2 = (o4.d) ((List) z0Var4.getValue()).get(((List) z0Var4.getValue()).size() - 2);
                        s0 s0Var2 = (s0) this.f1034j;
                        float g8 = ((m0.d1) this.f1036l).g();
                        this.i = 1;
                        if (s0Var2.n(g8, dVar2, this) == aVar8) {
                            return aVar8;
                        }
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                l1 l1Var = (l1) this.f1035k;
                h6.a aVar9 = h6.a.f3204d;
                int i20 = this.i;
                if (i20 == 0) {
                    s6.a.K(obj);
                    q1 q1Var2 = (q1) this.f1034j;
                    d7.z zVar = new d7.z(new r2(new d1.o(7, l1Var), null));
                    d7.o oVar = new d7.o(q1Var2, l1Var, (z0) this.f1036l, 3);
                    this.i = 1;
                    if (zVar.c(oVar, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case v0.f8304b /* 9 */:
                s0 s0Var3 = (s0) this.f1036l;
                h6.a aVar10 = h6.a.f3204d;
                int i21 = this.i;
                if (i21 == 0) {
                    s6.a.K(obj);
                    ((s) o1.f6383b.getValue()).b(s0Var3, o1.f6382a, s0Var3.f6423g);
                    i7.c cVar6 = s0Var3.f6425j;
                    this.f1034j = cVar6;
                    this.f1035k = s0Var3;
                    this.i = 1;
                    if (cVar6.d(this) == aVar10) {
                        return aVar10;
                    }
                    cVar = cVar6;
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var3 = (s0) this.f1035k;
                    cVar = (i7.c) this.f1034j;
                    s6.a.K(obj);
                }
                try {
                    s0Var3.f6420d = s0Var3.f6418b.getValue();
                    a7.h hVar3 = s0Var3.i;
                    if (hVar3 != null) {
                        hVar3.k(s0Var3.f6418b.getValue());
                    }
                    s0Var3.i = null;
                    cVar.f(null);
                    return m.f1757a;
                } catch (Throwable th) {
                    cVar.f(null);
                    throw th;
                }
            case v0.f8306d /* 10 */:
                l lVar2 = (l) this.f1035k;
                h6.a aVar11 = h6.a.f3204d;
                int i22 = this.i;
                if (i22 == 0) {
                    s6.a.K(obj);
                    long j7 = v.f6875a;
                    this.i = 1;
                    if (a7.x.c(j7, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        ((t.u) this.f1036l).C = lVar2;
                        return m.f1757a;
                    }
                    s6.a.K(obj);
                }
                j jVar = (j) this.f1034j;
                this.i = 2;
                if (jVar.b(lVar2, this) == aVar11) {
                    return aVar11;
                }
                ((t.u) this.f1036l).C = lVar2;
                return m.f1757a;
            case 11:
                h6.a aVar12 = h6.a.f3204d;
                int i23 = this.i;
                if (i23 == 0) {
                    s6.a.K(obj);
                    j jVar2 = (j) this.f1034j;
                    v.h hVar4 = (v.h) this.f1035k;
                    this.i = 1;
                    if (jVar2.b(hVar4, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                e0 e0Var = (e0) this.f1036l;
                if (e0Var != null) {
                    e0Var.a();
                }
                return m.f1757a;
            case 12:
                h1 h1Var = (h1) ((r) this.f1035k).f4396d;
                h6.a aVar13 = h6.a.f3204d;
                int i24 = this.i;
                try {
                    if (i24 == 0) {
                        s6.a.K(obj);
                        l0 l0Var = (l0) this.f1034j;
                        h1Var.setValue(Boolean.TRUE);
                        p6.e eVar2 = (p6.e) this.f1036l;
                        this.i = 1;
                        if (eVar2.g(l0Var, this) == aVar13) {
                            return aVar13;
                        }
                    } else {
                        if (i24 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                    }
                    h1Var.setValue(Boolean.FALSE);
                    return m.f1757a;
                } catch (Throwable th2) {
                    h1Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case 13:
                h6.a aVar14 = h6.a.f3204d;
                int i25 = this.i;
                if (i25 == 0) {
                    s6.a.K(obj);
                    r rVar = (r) this.f1034j;
                    n0 n0Var = (n0) rVar.f4395c;
                    u.j jVar3 = (u.j) rVar.f4394b;
                    j0 j0Var = (j0) this.f1035k;
                    c cVar7 = new c(rVar, (p6.e) this.f1036l, null, 12);
                    this.i = 1;
                    n0Var.getClass();
                    if (a7.x.b(new m0(j0Var, n0Var, cVar7, jVar3, null), this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case 14:
                h6.a aVar15 = h6.a.f3204d;
                int i26 = this.i;
                if (i26 == 0) {
                    s6.a.K(obj);
                    c1 c1Var = (c1) this.f1034j;
                    z zVar2 = (z) this.f1035k;
                    a0.v0 v0Var = new a0.v0(19, c1Var, (e1) this.f1036l);
                    this.i = 1;
                    if (zVar2.g(v0Var, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case v0.f8308f /* 15 */:
                h6.a aVar16 = h6.a.f3204d;
                int i27 = this.i;
                if (i27 == 0) {
                    s6.a.K(obj);
                    l0 l0Var2 = (l0) this.f1034j;
                    e1 e1Var = (e1) this.f1035k;
                    e1Var.f6971k = l0Var2;
                    p6.e eVar3 = (p6.e) this.f1036l;
                    c1 c1Var2 = e1Var.f6972l;
                    this.i = 1;
                    if (eVar3.g(c1Var2, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return m.f1757a;
            case 16:
                h6.a aVar17 = h6.a.f3204d;
                int i28 = this.i;
                try {
                    if (i28 == 0) {
                        s6.a.K(obj);
                        cVar2 = (c7.c) this.f1036l;
                        bVar = new c7.b(cVar2);
                        this.f1034j = cVar2;
                        this.f1035k = bVar;
                        this.i = 1;
                        obj = bVar.b(this);
                        cVar2 = cVar2;
                        if (obj == aVar17) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i28 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (c7.b) this.f1035k;
                        ?? r42 = (q) this.f1034j;
                        s6.a.K(obj);
                        cVar2 = r42;
                        if (((Boolean) obj).booleanValue()) {
                            boolean z3 = false;
                            i1.f8457b.set(false);
                            synchronized (w0.m.f7537c) {
                                k0 k0Var = w0.m.f7543j.f7505h;
                                if (k0Var != null && k0Var.h()) {
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                w0.m.a();
                            }
                            this.f1034j = cVar2;
                            this.f1035k = bVar;
                            this.i = 1;
                            obj = bVar.b(this);
                            cVar2 = cVar2;
                            if (obj == aVar17) {
                                return aVar17;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                cVar2.a(null);
                                return m.f1757a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CancellationException cancellationException2 = th3 instanceof CancellationException ? th3 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th3);
                        }
                        cVar2.a(cancellationException2);
                        throw th4;
                    }
                }
                break;
            case 17:
                m mVar5 = m.f1757a;
                b0 b0Var = (b0) this.f1036l;
                h6.a aVar18 = h6.a.f3204d;
                int i29 = this.i;
                int i30 = 2;
                g6.c cVar8 = null;
                if (i29 == 0) {
                    s6.a.K(obj);
                    g gVar4 = (g) this.f1035k;
                    this.f1035k = gVar4;
                    this.i = 1;
                    Object u7 = a7.x.u(b0Var.f8841e.h(), new y3.l(b0Var, cVar8, 2), this);
                    if (u7 != aVar18) {
                        gVar = gVar4;
                        obj = u7;
                    }
                    return aVar18;
                }
                if (i29 != 1) {
                    if (i29 != 2) {
                        if (i29 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        return mVar5;
                    }
                    s0Var = (y3.c) this.f1034j;
                    gVar = (g) this.f1035k;
                    s6.a.K(obj);
                    k kVar = new k(new d7.z(new d7.m(new d7.m(2, new d7.m(0, new y3.l(b0Var, cVar8, 0), (d7.n0) b0Var.f8845j.f6119e), new b6.m(i30, 3, cVar8)), new y3.m(s0Var, null))), new y3.n(b0Var, (g6.c) null));
                    this.f1035k = null;
                    this.f1034j = null;
                    this.i = 3;
                    if (!(gVar instanceof p0)) {
                        throw ((p0) gVar).f2411d;
                    }
                    Object c9 = kVar.c(gVar, this);
                    if (c9 != aVar18) {
                        c9 = mVar5;
                    }
                    if (c9 != aVar18) {
                        return mVar5;
                    }
                    return aVar18;
                }
                gVar = (g) this.f1035k;
                s6.a.K(obj);
                y3.s0 s0Var4 = (y3.s0) obj;
                if (!(s0Var4 instanceof y3.c)) {
                    if (s0Var4 instanceof y3.t0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (s0Var4 instanceof y3.n0) {
                        throw ((y3.n0) s0Var4).f8912b;
                    }
                    if (s0Var4 instanceof y3.k0) {
                        return mVar5;
                    }
                    if (s0Var4 instanceof y3.m0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    throw new a5.c();
                }
                y3.c cVar9 = (y3.c) s0Var4;
                Object obj3 = cVar9.f8850b;
                this.f1035k = gVar;
                this.f1034j = cVar9;
                this.i = 2;
                if (gVar.a(obj3, this) != aVar18) {
                    s0Var = s0Var4;
                    k kVar2 = new k(new d7.z(new d7.m(new d7.m(2, new d7.m(0, new y3.l(b0Var, cVar8, 0), (d7.n0) b0Var.f8845j.f6119e), new b6.m(i30, 3, cVar8)), new y3.m(s0Var, null))), new y3.n(b0Var, (g6.c) null));
                    this.f1035k = null;
                    this.f1034j = null;
                    this.i = 3;
                    if (!(gVar instanceof p0)) {
                    }
                }
                return aVar18;
            default:
                b0 b0Var2 = (b0) this.f1035k;
                h6.a aVar19 = h6.a.f3204d;
                int i31 = this.i;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return obj;
                }
                s6.a.K(obj);
                u uVar3 = (u) this.f1034j;
                a7.m mVar6 = new a7.m(true);
                g6.c cVar10 = null;
                mVar6.P(null);
                y3.s0 i32 = b0Var2.f8845j.i();
                if (i32 instanceof y3.c) {
                    i32 = new y3.m0(((y3.c) i32).f8939a);
                }
                y3.l0 l0Var3 = new y3.l0((i) this.f1036l, mVar6, i32, uVar3.h());
                c5.x xVar = b0Var2.f8849n;
                Object t3 = ((c7.c) xVar.f1739f).t(l0Var3);
                if (t3 instanceof c7.h) {
                    Throwable th5 = ((c7.h) t3).f1798a;
                    if (th5 == null) {
                        throw new c7.m("Channel was closed normally");
                    }
                    throw th5;
                }
                if (t3 instanceof c7.i) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((q3.k) xVar.f1740g).f6119e).getAndIncrement() == 0) {
                    a7.x.n((u) xVar.f1737d, null, new d(xVar, cVar10, 20), 3);
                }
                this.i = 1;
                Object f02 = mVar6.f0(this);
                return f02 == aVar19 ? aVar19 : f02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, g6.c cVar, int i) {
        super(2, cVar);
        this.f1033h = i;
        this.f1035k = obj;
        this.f1036l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, g6.c cVar, int i) {
        super(2, cVar);
        this.f1033h = i;
        this.f1034j = obj;
        this.f1035k = obj2;
        this.f1036l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(b0 b0Var, p6.e eVar, g6.c cVar) {
        super(2, cVar);
        this.f1033h = 18;
        this.f1035k = b0Var;
        this.f1036l = (i) eVar;
    }
}
