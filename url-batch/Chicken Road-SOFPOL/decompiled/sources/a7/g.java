package a7;

import b6.e2;
import j0.n2;
import java.util.ArrayList;
import java.util.List;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f256e;

    public /* synthetic */ g(int i, Object obj) {
        this.f255d = i;
        this.f256e = obj;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        w1.g gVar;
        w1.g gVar2;
        List y7;
        long b8;
        long b9;
        l1.e eVar;
        long b10;
        boolean z3;
        int i = this.f255d;
        y0.j jVar = y0.j.f8705a;
        c6.m mVar = c6.m.f1757a;
        Object obj4 = this.f256e;
        switch (i) {
            case 0:
                ((a0.t) obj4).i((Throwable) obj);
                break;
            case 1:
                b6.a aVar = (b6.a) obj4;
                m0.s sVar = (m0.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (!sVar.N(intValue & 1, (intValue & 17) != 16)) {
                    sVar.Q();
                    break;
                } else {
                    y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 20);
                    float f6 = 16;
                    x.l0 a8 = x.k0.a(x.i.g(f6), y0.b.f8690n, sVar, 54);
                    int hashCode = Long.hashCode(sVar.T);
                    m0.o1 l3 = sVar.l();
                    y0.m a02 = r2.o.a0(sVar, g3);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    w1.g gVar3 = w1.h.f7678e;
                    m0.b.u(a8, sVar, gVar3);
                    w1.g gVar4 = w1.h.f7677d;
                    m0.b.u(l3, sVar, gVar4);
                    w1.g gVar5 = w1.h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        a0.q.n(hashCode, sVar, hashCode, gVar5);
                    }
                    w1.g gVar6 = w1.h.f7676c;
                    m0.b.u(a02, sVar, gVar6);
                    y0.m j7 = androidx.compose.foundation.layout.a.j(64);
                    boolean z7 = aVar.f1252f;
                    if (z7) {
                        sVar.V(1125492750);
                        u2 u2Var = j0.c0.f3599a;
                        gVar = gVar6;
                        y7 = s6.a.y(new f1.s(f1.s.b(((j0.b0) sVar.j(u2Var)).f3555a, 0.3f)), new f1.s(f1.s.b(((j0.b0) sVar.j(u2Var)).f3562f, 0.3f)));
                        sVar.p(false);
                        gVar2 = gVar3;
                    } else {
                        gVar = gVar6;
                        sVar.V(1125780926);
                        sVar.p(false);
                        long j8 = f1.s.f2699c;
                        gVar2 = gVar3;
                        y7 = s6.a.y(new f1.s(f1.s.b(j8, 0.2f)), new f1.s(f1.s.b(j8, 0.1f)));
                    }
                    y0.m a9 = androidx.compose.foundation.a.a(j7, new f1.b0(y7, 0L, 9187343241974906880L), d0.e.a(f6), 4);
                    u1.e0 d8 = x.k.d(y0.b.f8685h, false);
                    int hashCode2 = Long.hashCode(sVar.T);
                    m0.o1 l7 = sVar.l();
                    y0.m a03 = r2.o.a0(sVar, a9);
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    w1.g gVar7 = gVar2;
                    m0.b.u(d8, sVar, gVar7);
                    m0.b.u(l7, sVar, gVar4);
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar, hashCode2, gVar5);
                    }
                    w1.g gVar8 = gVar;
                    m0.b.u(a03, sVar, gVar8);
                    n2.b(aVar.f1250d, s6.a.D(jVar, z7 ? 1.0f : 0.7f), 0L, r2.o.Q(32), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262124);
                    sVar.p(true);
                    y0.m a10 = x.m0.a(x.m0.f8248a, jVar);
                    x.q a11 = x.o.a(x.i.g(4), y0.b.f8692p, sVar, 6);
                    int hashCode3 = Long.hashCode(sVar.T);
                    m0.o1 l8 = sVar.l();
                    y0.m a04 = r2.o.a0(sVar, a10);
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    m0.b.u(a11, sVar, gVar7);
                    m0.b.u(l8, sVar, gVar4);
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar, hashCode3, gVar5);
                    }
                    m0.b.u(a04, sVar, gVar8);
                    String str = aVar.f1248b;
                    long Q = r2.o.Q(18);
                    j2.k kVar = j2.k.f3997h;
                    if (z7) {
                        sVar.V(-57972285);
                        b8 = ((j0.b0) sVar.j(j0.c0.f3599a)).f3572q;
                        sVar.p(false);
                    } else {
                        sVar.V(-57883408);
                        b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3572q, 0.6f);
                        sVar.p(false);
                    }
                    n2.b(str, null, b8, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597440, 0, 262058);
                    String str2 = aVar.f1249c;
                    long Q2 = r2.o.Q(14);
                    if (z7) {
                        sVar.V(-57596720);
                        b9 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3572q, 0.7f);
                        sVar.p(false);
                    } else {
                        sVar.V(-57489584);
                        b9 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3572q, 0.4f);
                        sVar.p(false);
                    }
                    n2.b(str2, null, b9, Q2, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262122);
                    sVar.p(true);
                    if (z7) {
                        eVar = a.a.f6g;
                        if (eVar == null) {
                            l1.d dVar = new l1.d("Filled.CheckCircle");
                            int i8 = l1.y.f4827a;
                            f1.k0 k0Var = new f1.k0(f1.s.f2698b);
                            h4.k kVar2 = new h4.k(1);
                            kVar2.h(12.0f, 2.0f);
                            kVar2.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            kVar2.i(4.48f, 10.0f, 10.0f, 10.0f);
                            kVar2.i(10.0f, -4.48f, 10.0f, -10.0f);
                            l1.m mVar2 = new l1.m(17.52f, 2.0f, 12.0f, 2.0f);
                            ArrayList arrayList = kVar2.f3194a;
                            arrayList.add(mVar2);
                            kVar2.a();
                            kVar2.h(10.0f, 17.0f);
                            kVar2.g(-5.0f, -5.0f);
                            kVar2.g(1.41f, -1.41f);
                            kVar2.f(10.0f, 14.17f);
                            kVar2.g(7.59f, -7.59f);
                            kVar2.f(19.0f, 8.0f);
                            kVar2.g(-9.0f, 9.0f);
                            kVar2.a();
                            l1.d.a(dVar, arrayList, k0Var);
                            eVar = dVar.b();
                            a.a.f6g = eVar;
                        }
                    } else {
                        eVar = s6.a.f6733e;
                        if (eVar == null) {
                            l1.d dVar2 = new l1.d("Filled.Lock");
                            int i9 = l1.y.f4827a;
                            f1.k0 k0Var2 = new f1.k0(f1.s.f2698b);
                            h4.k kVar3 = new h4.k(1);
                            kVar3.h(18.0f, 8.0f);
                            kVar3.e(-1.0f);
                            kVar3.f(17.0f, 6.0f);
                            kVar3.c(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                            l1.m mVar3 = new l1.m(7.0f, 3.24f, 7.0f, 6.0f);
                            ArrayList arrayList2 = kVar3.f3194a;
                            arrayList2.add(mVar3);
                            kVar3.j(2.0f);
                            kVar3.f(6.0f, 8.0f);
                            kVar3.c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            kVar3.j(10.0f);
                            kVar3.c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            kVar3.e(12.0f);
                            kVar3.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            kVar3.f(20.0f, 10.0f);
                            kVar3.c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            kVar3.a();
                            kVar3.h(12.0f, 17.0f);
                            kVar3.c(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                            kVar3.i(0.9f, -2.0f, 2.0f, -2.0f);
                            kVar3.i(2.0f, 0.9f, 2.0f, 2.0f);
                            kVar3.i(-0.9f, 2.0f, -2.0f, 2.0f);
                            kVar3.a();
                            kVar3.h(15.1f, 8.0f);
                            kVar3.f(8.9f, 8.0f);
                            kVar3.f(8.9f, 6.0f);
                            kVar3.c(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                            kVar3.c(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                            kVar3.j(2.0f);
                            kVar3.a();
                            l1.d.a(dVar2, arrayList2, k0Var2);
                            l1.e b11 = dVar2.b();
                            s6.a.f6733e = b11;
                            eVar = b11;
                        }
                    }
                    l1.e eVar2 = eVar;
                    String str3 = z7 ? "Unlocked" : "Locked";
                    if (z7) {
                        sVar.V(1127727571);
                        sVar.p(false);
                        b10 = f1.p.c(4283215696L);
                    } else {
                        sVar.V(1127791214);
                        b10 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3572q, 0.3f);
                        sVar.p(false);
                    }
                    j0.u0.a(eVar2, str3, androidx.compose.foundation.layout.a.j(28), b10, sVar, 384, 0);
                    sVar.p(true);
                    break;
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                e2 e2Var = (e2) obj4;
                m0.s sVar2 = (m0.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (!sVar2.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                    sVar2.Q();
                    break;
                } else {
                    y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 12);
                    x.q a12 = x.o.a(x.i.g(4), y0.b.f8693q, sVar2, 54);
                    int hashCode4 = Long.hashCode(sVar2.T);
                    m0.o1 l9 = sVar2.l();
                    y0.m a05 = r2.o.a0(sVar2, g7);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a12, sVar2, w1.h.f7678e);
                    m0.b.u(l9, sVar2, w1.h.f7677d);
                    w1.g gVar9 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode4))) {
                        a0.q.n(hashCode4, sVar2, hashCode4, gVar9);
                    }
                    m0.b.u(a05, sVar2, w1.h.f7676c);
                    n2.b(e2Var.f1310b, null, 0L, r2.o.Q(32), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262126);
                    n2.b(e2Var.f1309a, null, ((j0.b0) sVar2.j(j0.c0.f3599a)).f3572q, r2.o.Q(12), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262058);
                    sVar2.p(true);
                    break;
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                b6.h hVar = (b6.h) obj4;
                m0.s sVar3 = (m0.s) obj2;
                ((Integer) obj3).getClass();
                q6.i.e((q.x) obj, "$this$AnimatedVisibility");
                x.q a13 = x.o.a(x.i.f8223c, y0.b.f8692p, sVar3, 0);
                int hashCode5 = Long.hashCode(sVar3.T);
                m0.o1 l10 = sVar3.l();
                y0.m a06 = r2.o.a0(sVar3, jVar);
                w1.i.f7684c.getClass();
                w1.y yVar3 = w1.h.f7675b;
                sVar3.Y();
                if (sVar3.S) {
                    sVar3.k(yVar3);
                } else {
                    sVar3.i0();
                }
                m0.b.u(a13, sVar3, w1.h.f7678e);
                m0.b.u(l10, sVar3, w1.h.f7677d);
                w1.g gVar10 = w1.h.f7679f;
                if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode5))) {
                    a0.q.n(hashCode5, sVar3, hashCode5, gVar10);
                }
                m0.b.u(a06, sVar3, w1.h.f7676c);
                u2 u2Var2 = j0.c0.f3599a;
                j0.m.e(androidx.compose.foundation.layout.a.h(jVar, 0.0f, 8, 1), 1, f1.s.b(((j0.b0) sVar3.j(u2Var2)).f3572q, 0.2f), sVar3, 54);
                n2.b(hVar.f1331c, null, f1.s.b(((j0.b0) sVar3.j(u2Var2)).f3572q, 0.9f), r2.o.Q(16), null, null, 0L, null, r2.o.Q(24), 0, false, 0, 0, null, sVar3, 24576, 48, 260074);
                sVar3.p(true);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                b6.x0 x0Var = (b6.x0) obj4;
                m0.s sVar4 = (m0.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (!sVar4.N(intValue3 & 1, (intValue3 & 17) != 16)) {
                    sVar4.Q();
                    break;
                } else {
                    y0.m g8 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 16);
                    x.l0 a14 = x.k0.a(x.i.f8225e, y0.b.f8690n, sVar4, 54);
                    int hashCode6 = Long.hashCode(sVar4.T);
                    m0.o1 l11 = sVar4.l();
                    y0.m a07 = r2.o.a0(sVar4, g8);
                    w1.i.f7684c.getClass();
                    w1.y yVar4 = w1.h.f7675b;
                    sVar4.Y();
                    if (sVar4.S) {
                        sVar4.k(yVar4);
                    } else {
                        sVar4.i0();
                    }
                    w1.g gVar11 = w1.h.f7678e;
                    m0.b.u(a14, sVar4, gVar11);
                    w1.g gVar12 = w1.h.f7677d;
                    m0.b.u(l11, sVar4, gVar12);
                    w1.g gVar13 = w1.h.f7679f;
                    if (sVar4.S || !q6.i.a(sVar4.K(), Integer.valueOf(hashCode6))) {
                        a0.q.n(hashCode6, sVar4, hashCode6, gVar13);
                    }
                    w1.g gVar14 = w1.h.f7676c;
                    m0.b.u(a07, sVar4, gVar14);
                    x.g gVar15 = x.i.f8223c;
                    x.q a15 = x.o.a(gVar15, y0.b.f8692p, sVar4, 0);
                    int hashCode7 = Long.hashCode(sVar4.T);
                    m0.o1 l12 = sVar4.l();
                    y0.m a08 = r2.o.a0(sVar4, jVar);
                    sVar4.Y();
                    if (sVar4.S) {
                        sVar4.k(yVar4);
                    } else {
                        sVar4.i0();
                    }
                    m0.b.u(a15, sVar4, gVar11);
                    m0.b.u(l12, sVar4, gVar12);
                    if (sVar4.S || !q6.i.a(sVar4.K(), Integer.valueOf(hashCode7))) {
                        a0.q.n(hashCode7, sVar4, hashCode7, gVar13);
                    }
                    m0.b.u(a08, sVar4, gVar14);
                    int i10 = x0Var.f1499a;
                    int i11 = x0Var.f1506h;
                    long Q3 = r2.o.Q(20);
                    j2.k kVar4 = j2.k.f3997h;
                    u2 u2Var3 = j0.c0.f3599a;
                    n2.b("Level " + i10 + "/20", null, ((j0.b0) sVar4.j(u2Var3)).f3570o, Q3, null, kVar4, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597440, 0, 262058);
                    n2.b(x0Var.f1501c.size() + " items left", null, f1.s.b(((j0.b0) sVar4.j(u2Var3)).f3570o, 0.7f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 24576, 0, 262122);
                    sVar4.p(true);
                    x.q a16 = x.o.a(gVar15, y0.b.f8694r, sVar4, 48);
                    int hashCode8 = Long.hashCode(sVar4.T);
                    m0.o1 l13 = sVar4.l();
                    y0.m a09 = r2.o.a0(sVar4, jVar);
                    sVar4.Y();
                    if (sVar4.S) {
                        sVar4.k(yVar4);
                    } else {
                        sVar4.i0();
                    }
                    m0.b.u(a16, sVar4, gVar11);
                    m0.b.u(l13, sVar4, gVar12);
                    if (sVar4.S || !q6.i.a(sVar4.K(), Integer.valueOf(hashCode8))) {
                        a0.q.n(hashCode8, sVar4, hashCode8, gVar13);
                    }
                    m0.b.u(a09, sVar4, gVar14);
                    n2.b(a0.q.h("✓ ", x0Var.i), null, f1.p.c(4283215696L), r2.o.Q(14), null, kVar4, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597824, 0, 262058);
                    if (i11 > 0) {
                        sVar4.V(1506437868);
                        n2.b("✗ " + i11, null, f1.p.c(4294198070L), r2.o.Q(14), null, kVar4, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597824, 0, 262058);
                        z3 = false;
                    } else {
                        z3 = false;
                        sVar4.V(1499695058);
                    }
                    sVar4.p(z3);
                    sVar4.p(true);
                    sVar4.p(true);
                    break;
                }
            case 5:
                b6.l1 l1Var = (b6.l1) obj4;
                m0.s sVar5 = (m0.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (!sVar5.N(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sVar5.Q();
                    break;
                } else {
                    n2.b(l1Var.f1378a, androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 24), ((j0.b0) sVar5.j(j0.c0.f3599a)).f3572q, r2.o.Q(20), null, j2.k.f3997h, 0L, new q2.k(3), 0L, 0, false, 0, 0, null, sVar5, 1597488, 0, 261032);
                    break;
                }
            case 6:
                i7.c cVar = (i7.c) obj4;
                i7.c.f3468g.set(cVar, null);
                cVar.f(null);
                break;
            default:
                ((i7.g) obj4).b();
                break;
        }
        return mVar;
    }

    public /* synthetic */ g(i7.c cVar, i7.b bVar) {
        this.f255d = 6;
        this.f256e = cVar;
    }
}
