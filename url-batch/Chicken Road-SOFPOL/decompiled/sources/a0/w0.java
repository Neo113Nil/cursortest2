package a0;

import j0.n2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m0.o1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166d;

    public /* synthetic */ w0(int i) {
        this.f166d = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        g2.g gVar;
        Object a8;
        int i = this.f166d;
        c6.m mVar = c6.m.f1757a;
        switch (i) {
            case 0:
                Map d8 = ((y0) obj2).d();
                if (d8.isEmpty()) {
                    return null;
                }
                return d8;
            case 1:
                return ((g6.h) obj).c((g6.f) obj2);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((g6.h) obj).c((g6.f) obj2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    y0.c cVar = y0.b.f8693q;
                    y0.j jVar = y0.j.f8705a;
                    y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                    x.q a9 = x.o.a(x.i.f8223c, cVar, sVar, 48);
                    int hashCode = Long.hashCode(sVar.T);
                    o1 l3 = sVar.l();
                    y0.m a02 = r2.o.a0(sVar, d9);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    m0.b.u(a9, sVar, w1.h.f7678e);
                    m0.b.u(l3, sVar, w1.h.f7677d);
                    w1.g gVar2 = w1.h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        q.n(hashCode, sVar, hashCode, gVar2);
                    }
                    m0.b.u(a02, sVar, w1.h.f7676c);
                    n2.b("🎉", null, 0L, r2.o.Q(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24582, 0, 262126);
                    x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, 8));
                    n2.b("Level Complete!", null, 0L, r2.o.Q(24), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262062);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                return mVar;
            case 5:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    l1.e eVar = a.a.f5f;
                    if (eVar == null) {
                        l1.d dVar = new l1.d("Filled.ArrowBack");
                        int i8 = l1.y.f4827a;
                        f1.k0 k0Var = new f1.k0(f1.s.f2698b);
                        h4.k kVar = new h4.k(1);
                        kVar.h(20.0f, 11.0f);
                        l1.j jVar2 = new l1.j(7.83f);
                        ArrayList arrayList = kVar.f3194a;
                        arrayList.add(jVar2);
                        kVar.g(5.59f, -5.59f);
                        kVar.f(12.0f, 4.0f);
                        kVar.g(-8.0f, 8.0f);
                        kVar.g(8.0f, 8.0f);
                        kVar.g(1.41f, -1.41f);
                        kVar.f(7.83f, 13.0f);
                        arrayList.add(new l1.j(20.0f));
                        kVar.j(-2.0f);
                        kVar.a();
                        l1.d.a(dVar, arrayList, k0Var);
                        eVar = dVar.b();
                        a.a.f5f = eVar;
                    }
                    j0.u0.a(eVar, "Previous", null, ((j0.b0) sVar2.j(j0.c0.f3599a)).f3570o, sVar2, 48, 4);
                } else {
                    sVar2.Q();
                }
                return mVar;
            case 6:
                ((Integer) obj2).getClass();
                b6.k.o((m0.s) obj, m0.b.w(1));
                return mVar;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                b6.k.u((m0.s) obj, m0.b.w(1));
                return mVar;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj2).getClass();
                b6.k.i((m0.s) obj, m0.b.w(1));
                return mVar;
            case x.v0.f8304b /* 9 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case x.v0.f8306d /* 10 */:
                g6.f fVar = (g6.f) obj2;
                if (!(fVar instanceof a7.k1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue3 = num != null ? num.intValue() : 1;
                return intValue3 == 0 ? fVar : Integer.valueOf(intValue3 + 1);
            case 11:
                a7.k1 k1Var = (a7.k1) obj;
                g6.f fVar2 = (g6.f) obj2;
                if (k1Var != null) {
                    return k1Var;
                }
                if (fVar2 instanceof a7.k1) {
                    return (a7.k1) fVar2;
                }
                return null;
            case 12:
                return (f7.v) obj;
            case 13:
                g2.e eVar2 = (g2.e) obj2;
                return s6.a.f(eVar2.f2928e, g2.z.a(eVar2.f2927d, g2.z.f3010a, (v0.b) obj));
            case 14:
                return Integer.valueOf(((q2.l) obj2).f6058a);
            case x.v0.f8308f /* 15 */:
                q2.p pVar = (q2.p) obj2;
                return s6.a.f(Float.valueOf(pVar.f6062a), Float.valueOf(pVar.f6063b));
            case 16:
                v0.b bVar = (v0.b) obj;
                q2.q qVar = (q2.q) obj2;
                r2.n nVar = new r2.n(qVar.f6065a);
                g2.y yVar2 = g2.z.f3025q;
                return s6.a.f(g2.z.a(nVar, yVar2, bVar), g2.z.a(new r2.n(qVar.f6066b), yVar2, bVar));
            case 17:
                return Integer.valueOf(((j2.k) obj2).f3998d);
            case 18:
                g2.j jVar3 = (g2.j) obj2;
                return s6.a.f(jVar3.f2967a, g2.z.a(jVar3.f2968b, g2.z.i, (v0.b) obj));
            case 19:
                return Float.valueOf(((q2.a) obj2).f6037a);
            case 20:
                v0.b bVar2 = (v0.b) obj;
                List list = (List) obj2;
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList2.add(g2.z.a((g2.c) list.get(i9), g2.z.f3011b, bVar2));
                }
                return arrayList2;
            case 21:
                g2.h0 h0Var = (g2.h0) obj2;
                return s6.a.f(Integer.valueOf((int) (h0Var.f2960a >> 32)), Integer.valueOf((int) (h0Var.f2960a & 4294967295L)));
            case 22:
                v0.b bVar3 = (v0.b) obj;
                f1.h0 h0Var2 = (f1.h0) obj2;
                return s6.a.f(g2.z.a(new f1.s(h0Var2.f2664a), g2.z.f3024p, bVar3), g2.z.a(new e1.b(h0Var2.f2665b), g2.z.f3026r, bVar3), Float.valueOf(h0Var2.f2666c));
            case 23:
                r2.n nVar2 = (r2.n) obj2;
                return nVar2 != null ? r2.n.a(nVar2.f6535a, r2.n.f6534c) : false ? Boolean.FALSE : s6.a.f(Float.valueOf(r2.n.c(nVar2.f6535a)), new r2.p(r2.n.b(nVar2.f6535a)));
            case 24:
                e1.b bVar4 = (e1.b) obj2;
                return bVar4 != null ? e1.b.b(bVar4.f2455a, 9205357640488583168L) : false ? Boolean.FALSE : s6.a.f(Float.valueOf(Float.intBitsToFloat((int) (bVar4.f2455a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar4.f2455a & 4294967295L))));
            case 25:
                v0.b bVar5 = (v0.b) obj;
                List list2 = ((m2.b) obj2).f5218d;
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList3.add(g2.z.a((m2.a) list2.get(i10), g2.z.f3028t, bVar5));
                }
                return arrayList3;
            case 26:
                return ((m2.a) obj2).f5216a.toLanguageTag();
            case 27:
                q2.i iVar = (q2.i) obj2;
                return s6.a.f(new q2.f(iVar.f6050a), new q2.h(iVar.f6051b), new q2.g());
            case 28:
                v0.b bVar6 = (v0.b) obj;
                g2.c cVar2 = (g2.c) obj2;
                Object obj3 = cVar2.f2917a;
                if (obj3 instanceof g2.r) {
                    gVar = g2.g.f2947d;
                } else if (obj3 instanceof g2.b0) {
                    gVar = g2.g.f2948e;
                } else if (obj3 instanceof g2.k0) {
                    gVar = g2.g.f2949f;
                } else if (obj3 instanceof g2.j0) {
                    gVar = g2.g.f2950g;
                } else if (obj3 instanceof g2.j) {
                    gVar = g2.g.f2951h;
                } else if (obj3 instanceof g2.i) {
                    gVar = g2.g.i;
                } else {
                    if (!(obj3 instanceof g2.d0)) {
                        throw new UnsupportedOperationException();
                    }
                    gVar = g2.g.f2952j;
                }
                switch (gVar.ordinal()) {
                    case 0:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        a8 = g2.z.a((g2.r) obj3, g2.z.f3016g, bVar6);
                        break;
                    case 1:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        a8 = g2.z.a((g2.b0) obj3, g2.z.f3017h, bVar6);
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        a8 = g2.z.a((g2.k0) obj3, g2.z.f3012c, bVar6);
                        break;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        a8 = g2.z.a((g2.j0) obj3, g2.z.f3013d, bVar6);
                        break;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        a8 = g2.z.a((g2.j) obj3, g2.z.f3014e, bVar6);
                        break;
                    case 5:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        a8 = g2.z.a((g2.i) obj3, g2.z.f3015f, bVar6);
                        break;
                    case 6:
                        q6.i.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        a8 = ((g2.d0) obj3).f2926a;
                        break;
                    default:
                        throw new a5.c();
                }
                return s6.a.f(gVar, a8, Integer.valueOf(cVar2.f2918b), Integer.valueOf(cVar2.f2919c), cVar2.f2920d);
            default:
                g2.i iVar2 = (g2.i) obj2;
                return s6.a.f(iVar2.f2961a, g2.z.a(iVar2.f2962b, g2.z.i, (v0.b) obj));
        }
    }

    public /* synthetic */ w0(int i, int i8) {
        this.f166d = i8;
    }
}
