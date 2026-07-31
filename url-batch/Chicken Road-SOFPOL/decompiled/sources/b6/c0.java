package b6;

import androidx.lifecycle.o;
import androidx.lifecycle.u;
import c.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import m0.t2;
import q6.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1285g;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i) {
        this.f1282d = i;
        this.f1283e = obj;
        this.f1284f = obj2;
        this.f1285g = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f1282d) {
            case 0:
                List list = (List) this.f1283e;
                m0.z0 z0Var = (m0.z0) this.f1284f;
                m0.z0 z0Var2 = (m0.z0) this.f1285g;
                z.f fVar = (z.f) obj;
                q6.i.e(fVar, "$this$LazyRow");
                fVar.a(list.size(), new f0(0, list), new u0.c(802480018, true, new g0(list, z0Var, z0Var2)));
                break;
            case 1:
                final w wVar = (w) this.f1283e;
                final o4.t tVar = (o4.t) this.f1284f;
                final t2 t2Var = (t2) this.f1285g;
                o4.r rVar = (o4.r) obj;
                q6.i.e(rVar, "$this$NavHost");
                final int i = 0;
                m.a.k(rVar, x1.f1507d.f1525a, new u0.c(929301775, true, new p6.g() { // from class: b6.e1
                    @Override // p6.g
                    public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                        switch (i) {
                            case 0:
                                o4.t tVar2 = (o4.t) tVar;
                                m0.s sVar = (m0.s) obj4;
                                q6.i.e((q.k) obj2, "$this$composable");
                                q6.i.e((o4.d) obj3, "it");
                                boolean h8 = sVar.h(tVar2);
                                Object K = sVar.K();
                                m0.v0 v0Var = m0.n.f5019a;
                                if (h8 || K == v0Var) {
                                    K = new d1(tVar2, 0);
                                    sVar.f0(K);
                                }
                                p6.a aVar = (p6.a) K;
                                boolean h9 = sVar.h(tVar2);
                                Object K2 = sVar.K();
                                if (h9 || K2 == v0Var) {
                                    K2 = new d1(tVar2, 1);
                                    sVar.f0(K2);
                                }
                                p6.a aVar2 = (p6.a) K2;
                                boolean h10 = sVar.h(tVar2);
                                Object K3 = sVar.K();
                                if (h10 || K3 == v0Var) {
                                    K3 = new d1(tVar2, 2);
                                    sVar.f0(K3);
                                }
                                p6.a aVar3 = (p6.a) K3;
                                boolean h11 = sVar.h(tVar2);
                                Object K4 = sVar.K();
                                if (h11 || K4 == v0Var) {
                                    K4 = new d1(tVar2, 3);
                                    sVar.f0(K4);
                                }
                                k.m(wVar, aVar, aVar2, aVar3, (p6.a) K4, null, sVar, 0);
                                break;
                            default:
                                t2 t2Var2 = (t2) tVar;
                                q6.i.e((q.k) obj2, "$this$composable");
                                q6.i.e((o4.d) obj3, "it");
                                int intValue = ((Number) t2Var2.getValue()).intValue();
                                k.k(wVar, intValue, null, (m0.s) obj4, 0);
                                break;
                        }
                        return c6.m.f1757a;
                    }
                }));
                final int i8 = 1;
                m.a.k(rVar, w1.f1496d.f1525a, new u0.c(-594800954, true, new p6.g() { // from class: b6.e1
                    @Override // p6.g
                    public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                        switch (i8) {
                            case 0:
                                o4.t tVar2 = (o4.t) t2Var;
                                m0.s sVar = (m0.s) obj4;
                                q6.i.e((q.k) obj2, "$this$composable");
                                q6.i.e((o4.d) obj3, "it");
                                boolean h8 = sVar.h(tVar2);
                                Object K = sVar.K();
                                m0.v0 v0Var = m0.n.f5019a;
                                if (h8 || K == v0Var) {
                                    K = new d1(tVar2, 0);
                                    sVar.f0(K);
                                }
                                p6.a aVar = (p6.a) K;
                                boolean h9 = sVar.h(tVar2);
                                Object K2 = sVar.K();
                                if (h9 || K2 == v0Var) {
                                    K2 = new d1(tVar2, 1);
                                    sVar.f0(K2);
                                }
                                p6.a aVar2 = (p6.a) K2;
                                boolean h10 = sVar.h(tVar2);
                                Object K3 = sVar.K();
                                if (h10 || K3 == v0Var) {
                                    K3 = new d1(tVar2, 2);
                                    sVar.f0(K3);
                                }
                                p6.a aVar3 = (p6.a) K3;
                                boolean h11 = sVar.h(tVar2);
                                Object K4 = sVar.K();
                                if (h11 || K4 == v0Var) {
                                    K4 = new d1(tVar2, 3);
                                    sVar.f0(K4);
                                }
                                k.m(wVar, aVar, aVar2, aVar3, (p6.a) K4, null, sVar, 0);
                                break;
                            default:
                                t2 t2Var2 = (t2) t2Var;
                                q6.i.e((q.k) obj2, "$this$composable");
                                q6.i.e((o4.d) obj3, "it");
                                int intValue = ((Number) t2Var2.getValue()).intValue();
                                k.k(wVar, intValue, null, (m0.s) obj4, 0);
                                break;
                        }
                        return c6.m.f1757a;
                    }
                }));
                m.a.k(rVar, v1.f1482d.f1525a, k.i);
                m.a.k(rVar, y1.f1514d.f1525a, new u0.c(-464936376, true, new f1(0, wVar)));
                m.a.k(rVar, u1.f1472d.f1525a, new u0.c(1747479561, true, new f1(1, wVar)));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.z0 z0Var3 = (m0.z0) this.f1284f;
                m0.z0 z0Var4 = (m0.z0) this.f1285g;
                m0.z0 z0Var5 = (m0.z0) this.f1283e;
                h1.d dVar = (h1.d) obj;
                q6.i.e(dVar, "$this$Canvas");
                char c8 = ' ';
                z0Var3.setValue(Float.valueOf(Float.intBitsToFloat((int) (dVar.c() >> 32))));
                long j7 = 4294967295L;
                z0Var4.setValue(Float.valueOf(Float.intBitsToFloat((int) (dVar.c() & 4294967295L))));
                for (b2 b2Var : (List) z0Var5.getValue()) {
                    float f6 = b2Var.f1273a;
                    float f8 = b2Var.f1277e;
                    long floatToRawIntBits = (Float.floatToRawIntBits(b2Var.f1274b) & j7) | (Float.floatToRawIntBits(f6) << c8);
                    float f9 = b2Var.f1275c / 2.0f;
                    h1.d.w(dVar, f1.s.b(f1.s.f2700d, f8), f9, floatToRawIntBits, 120);
                    int i9 = 0;
                    while (i9 < 6) {
                        float f10 = 1.5f * f9;
                        double d8 = ((i9 * 360.0f) / 6) * 0.017453292f;
                        char c9 = c8;
                        long j8 = j7;
                        float cos = (((float) Math.cos(d8)) * f10) + Float.intBitsToFloat((int) (floatToRawIntBits >> c8));
                        float sin = (f10 * ((float) Math.sin(d8))) + Float.intBitsToFloat((int) (floatToRawIntBits & j8));
                        dVar.L(f1.s.b(f1.s.f2700d, 0.7f * f8), floatToRawIntBits, (Float.floatToRawIntBits(sin) & j8) | (Float.floatToRawIntBits(cos) << c9), 1.0f, (r19 & 16) != 0 ? 0 : 0);
                        i9++;
                        f8 = f8;
                        j7 = j8;
                        c8 = c9;
                    }
                }
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) this.f1283e;
                final j4.d dVar2 = (j4.d) this.f1284f;
                final p6.c cVar = (p6.c) this.f1285g;
                final q6.s sVar = new q6.s();
                androidx.lifecycle.s sVar2 = new androidx.lifecycle.s() { // from class: j4.a
                    @Override // androidx.lifecycle.s
                    public final void b(u uVar2, o oVar) {
                        int i10 = c.f4017a[oVar.ordinal()];
                        s sVar3 = sVar;
                        if (i10 == 1) {
                            sVar3.f6205d = cVar.i(d.this);
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            j jVar = (j) sVar3.f6205d;
                            if (jVar != null) {
                                jVar.a();
                            }
                            sVar3.f6205d = null;
                        }
                    }
                };
                uVar.g().a(sVar2);
                return new j4.b(uVar, sVar2, sVar, 0);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                w0.p pVar = (w0.p) this.f1283e;
                o4.d dVar3 = (o4.d) this.f1284f;
                p4.p pVar2 = (p4.p) this.f1285g;
                pVar.add(dVar3);
                return new j4.b(pVar2, dVar3, pVar, 1);
            case 5:
                u.g gVar = (u.g) this.f1283e;
                a7.s0 s0Var = (a7.s0) this.f1284f;
                u.c1 c1Var = (u.c1) this.f1285g;
                float floatValue = ((Float) obj).floatValue();
                float f11 = gVar.f6989t ? 1.0f : -1.0f;
                u.e1 e1Var = gVar.f6988s;
                long e8 = e1Var.e(e1Var.h(f11 * floatValue));
                u.e1 e1Var2 = c1Var.f6948a;
                float g3 = e1Var.g(e1Var.e(e1Var2.c(e1Var2.f6971k, e8, 1))) * f11;
                if (Math.abs(g3) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g3 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    s0Var.a(cancellationException);
                }
                return c6.m.f1757a;
            case 6:
                r1.d dVar4 = (r1.d) this.f1283e;
                r1.c cVar2 = dVar4.f6512b;
                r1.c cVar3 = dVar4.f6511a;
                q1.o oVar = (q1.o) this.f1284f;
                u.x0 x0Var = (u.x0) this.f1285g;
                m.a.h(dVar4, (q1.k) obj, 0L);
                q1.s sVar3 = (q1.s) oVar;
                sVar3.getClass();
                float a8 = w1.f.u(sVar3).A.a();
                long c10 = r2.r.c(a8, a8);
                if (r2.q.b(c10) <= 0.0f || r2.q.c(c10) <= 0.0f) {
                    t1.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) r2.q.f(c10)));
                }
                long c11 = r2.r.c(cVar3.b(r2.q.b(c10)), cVar2.b(r2.q.c(c10)));
                r1.a[] aVarArr = cVar3.f6506d;
                d6.l.L(aVarArr, 0, aVarArr.length);
                cVar3.f6507e = 0;
                r1.a[] aVarArr2 = cVar2.f6506d;
                d6.l.L(aVarArr2, 0, aVarArr2.length);
                cVar2.f6507e = 0;
                dVar4.f6513c = 0L;
                c7.c cVar4 = x0Var.f7124x;
                if (cVar4 != null) {
                    cVar4.t(new u.n(r2.r.c(Float.isNaN(r2.q.b(c11)) ? 0.0f : r2.q.b(c11), Float.isNaN(r2.q.c(c11)) ? 0.0f : r2.q.c(c11))));
                }
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                v0.d dVar5 = (v0.d) this.f1283e;
                v0.h hVar = (v0.h) this.f1285g;
                o.j0 j0Var = dVar5.f7436e;
                Object obj2 = this.f1284f;
                if (!j0Var.b(obj2)) {
                    dVar5.f7435d.remove(obj2);
                    j0Var.m(obj2, hVar);
                    return new j4.b(dVar5, obj2, hVar, 3);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                a0.t tVar2 = (a0.t) this.f1283e;
                c5.x xVar = (c5.x) this.f1284f;
                g2.v vVar = (g2.v) this.f1285g;
                Throwable th = (Throwable) obj;
                tVar2.i(th);
                c7.c cVar5 = (c7.c) xVar.f1739f;
                cVar5.f(th, false);
                while (true) {
                    Object s5 = cVar5.s();
                    if (s5 instanceof c7.i) {
                        s5 = null;
                    }
                    if (s5 == null) {
                        return c6.m.f1757a;
                    }
                    vVar.g(s5, th);
                }
            default:
                m0.z0 z0Var6 = (m0.z0) this.f1284f;
                ArrayList arrayList = (ArrayList) this.f1283e;
                u1.k0 k0Var = (u1.k0) obj;
                k0Var.f7227d = true;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((z.l) arrayList.get(i10)).b(k0Var);
                }
                ?? r22 = this.f1285g;
                int size2 = r22.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((z.l) r22.get(i11)).b(k0Var);
                }
                k0Var.f7227d = false;
                z0Var6.getValue();
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ c0(m0.z0 z0Var, ArrayList arrayList, List list, boolean z3) {
        this.f1282d = 9;
        this.f1284f = z0Var;
        this.f1283e = arrayList;
        this.f1285g = list;
    }

    public /* synthetic */ c0(m0.z0 z0Var, m0.z0 z0Var2, m0.z0 z0Var3) {
        this.f1282d = 2;
        this.f1284f = z0Var;
        this.f1285g = z0Var2;
        this.f1283e = z0Var3;
    }

    public /* synthetic */ c0(u.g gVar, u.l1 l1Var, a7.s0 s0Var, u.c1 c1Var) {
        this.f1282d = 5;
        this.f1283e = gVar;
        this.f1284f = s0Var;
        this.f1285g = c1Var;
    }
}
