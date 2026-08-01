package j2;

import c2.g0;
import c2.i1;
import c2.x1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import s.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final d1.k f4980a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4981b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f4982c;

    /* renamed from: d, reason: collision with root package name */
    public final j f4983d;

    /* renamed from: e, reason: collision with root package name */
    public m f4984e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4985f;

    public m(d1.k kVar, boolean z10, g0 g0Var, j jVar) {
        this.f4980a = kVar;
        this.f4981b = z10;
        this.f4982c = g0Var;
        this.f4983d = jVar;
        this.f4985f = g0Var.f1550e;
    }

    public static /* synthetic */ List j(int i3, m mVar) {
        return mVar.i((i3 & 1) != 0 ? !mVar.f4981b : false, (i3 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final j1.c a(i1 i1Var) {
        c2.j jVar;
        m l10 = l();
        if (l10 == null) {
            return j1.c.f4915e;
        }
        d1.k kVar = (d1.k) l10.f4982c.S.g;
        if ((kVar.f3308r & 8) != 0) {
            loop0: while (kVar != null) {
                if ((kVar.f3307i & 8) != 0) {
                    jVar = kVar;
                    ?? r62 = 0;
                    while (jVar != 0) {
                        if (jVar instanceof x1) {
                            if (jVar.b()) {
                                break loop0;
                            }
                        } else if ((jVar.f3307i & 8) != 0 && (jVar instanceof c2.j)) {
                            d1.k kVar2 = jVar.D;
                            int i3 = 0;
                            jVar = jVar;
                            r62 = r62;
                            while (kVar2 != null) {
                                if ((kVar2.f3307i & 8) != 0) {
                                    i3++;
                                    r62 = r62;
                                    if (i3 == 1) {
                                        jVar = kVar2;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new o0.e(new d1.k[16]);
                                        }
                                        if (jVar != 0) {
                                            r62.b(jVar);
                                            jVar = 0;
                                        }
                                        r62.b(kVar2);
                                    }
                                }
                                kVar2 = kVar2.f3310t;
                                jVar = jVar;
                                r62 = r62;
                            }
                            if (i3 == 1) {
                            }
                        }
                        jVar = c2.k.e(r62);
                    }
                }
                if ((kVar.f3308r & 8) == 0) {
                    break;
                }
                kVar = kVar.f3310t;
            }
        }
        jVar = 0;
        x1 x1Var = (x1) jVar;
        i1 s3 = x1Var != null ? c2.k.s(x1Var, 8) : null;
        return s3 == null ? l10.a(i1Var) : s3.p(i1Var, true);
    }

    public final m b(g gVar, Function1 function1) {
        j jVar = new j();
        jVar.f4977i = false;
        jVar.f4978r = false;
        function1.invoke(jVar);
        m mVar = new m(new l(function1), false, new g0(this.f4985f + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        mVar.f4984e = this;
        return mVar;
    }

    public final void c(g0 g0Var, ArrayList arrayList) {
        o0.e v10 = g0Var.v();
        Object[] objArr = v10.f7317d;
        int i3 = v10.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if (g0Var2.E() && !g0Var2.f1549d0) {
                if (g0Var2.S.d(8)) {
                    arrayList.add(p.a(g0Var2, this.f4981b));
                } else {
                    c(g0Var2, arrayList);
                }
            }
        }
    }

    public final i1 d() {
        if (!o()) {
            x1 f3 = f();
            return f3 != null ? c2.k.s(f3, 8) : (c2.q) this.f4982c.S.f1493d;
        }
        m l10 = l();
        if (l10 != null) {
            return l10.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            m mVar = (m) arrayList.get(size2);
            if (mVar.p()) {
                arrayList2.add(mVar);
            } else if (!mVar.f4983d.f4978r) {
                mVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x1 f() {
        d1.k kVar;
        boolean z10;
        boolean z11 = this.f4983d.f4977i;
        Object obj = null;
        g0 g0Var = this.f4982c;
        if (!z11) {
            d1.k kVar2 = (d1.k) g0Var.S.g;
            if ((kVar2.f3308r & 8) != 0) {
                loop3: while (kVar2 != null) {
                    if ((kVar2.f3307i & 8) != 0) {
                        kVar = kVar2;
                        o0.e eVar = null;
                        while (kVar != null) {
                            if (kVar instanceof x1) {
                                if (((x1) kVar).b()) {
                                    obj = kVar;
                                }
                            } else if ((kVar.f3307i & 8) != 0 && (kVar instanceof c2.j)) {
                                int i3 = 0;
                                for (d1.k kVar3 = ((c2.j) kVar).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                    if ((kVar3.f3307i & 8) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar = kVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar != null) {
                                                eVar.b(kVar);
                                                kVar = null;
                                            }
                                            eVar.b(kVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar = c2.k.e(eVar);
                        }
                    }
                    if ((kVar2.f3308r & 8) == 0) {
                        break;
                    }
                    kVar2 = kVar2.f3310t;
                }
            }
            return (x1) obj;
        }
        d1.k kVar4 = (d1.k) g0Var.S.g;
        if ((kVar4.f3308r & 8) != 0) {
            kVar = null;
            while (kVar4 != null) {
                if ((kVar4.f3307i & 8) != 0) {
                    d1.k kVar5 = kVar4;
                    o0.e eVar2 = null;
                    while (kVar5 != null) {
                        if (kVar5 instanceof x1) {
                            x1 x1Var = (x1) kVar5;
                            if (x1Var.b()) {
                                if (x1Var.p()) {
                                    return x1Var;
                                }
                                if (kVar == null) {
                                    kVar = x1Var;
                                }
                            }
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10 && (kVar5.f3307i & 8) != 0 && (kVar5 instanceof c2.j)) {
                            int i10 = 0;
                            for (d1.k kVar6 = ((c2.j) kVar5).D; kVar6 != null; kVar6 = kVar6.f3310t) {
                                if ((kVar6.f3307i & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        kVar5 = kVar6;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar5 != null) {
                                            eVar2.b(kVar5);
                                            kVar5 = null;
                                        }
                                        eVar2.b(kVar6);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        kVar5 = c2.k.e(eVar2);
                    }
                }
                if ((kVar4.f3308r & 8) == 0) {
                    break;
                }
                kVar4 = kVar4.f3310t;
            }
            obj = kVar;
        }
        return (x1) obj;
    }

    public final j1.c g() {
        i1 d10 = d();
        if (d10 != null) {
            if (!d10.D0().B) {
                d10 = null;
            }
            if (d10 != null) {
                return a2.q.h(d10).p(d10, true);
            }
        }
        return j1.c.f4915e;
    }

    public final j1.c h() {
        i1 d10 = d();
        if (d10 != null) {
            if (!d10.D0().B) {
                d10 = null;
            }
            if (d10 != null) {
                return a2.q.f(d10, true);
            }
        }
        return j1.c.f4915e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f4983d.f4978r) {
            return j0.f5574d;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final j k() {
        boolean p4 = p();
        j jVar = this.f4983d;
        if (!p4) {
            return jVar;
        }
        j c10 = jVar.c();
        r(new ArrayList(), c10);
        return c10;
    }

    public final m l() {
        g0 g0Var;
        m mVar = this.f4984e;
        if (mVar != null) {
            return mVar;
        }
        g0 g0Var2 = this.f4982c;
        boolean z10 = this.f4981b;
        if (z10) {
            g0Var = g0Var2.s();
            while (g0Var != null) {
                j u2 = g0Var.u();
                if (u2 != null && u2.f4977i) {
                    break;
                }
                g0Var = g0Var.s();
            }
        }
        g0Var = null;
        if (g0Var == null) {
            g0 s3 = g0Var2.s();
            while (true) {
                if (s3 == null) {
                    g0Var = null;
                    break;
                }
                if (s3.S.d(8)) {
                    g0Var = s3;
                    break;
                }
                s3 = s3.s();
            }
        }
        if (g0Var == null) {
            return null;
        }
        return p.a(g0Var, z10);
    }

    public final j1.c m() {
        c2.i f3 = f();
        if (f3 == null) {
            return ((c2.q) this.f4982c.S.f1493d).Y0();
        }
        d1.k kVar = ((d1.k) f3).f3305d;
        Object g = this.f4983d.f4975d.g(i.f4952b);
        if (g == null) {
            g = null;
        }
        return c2.k.i(kVar, g != null, true);
    }

    public final j n() {
        return this.f4983d;
    }

    public final boolean o() {
        return this.f4984e != null;
    }

    public final boolean p() {
        return this.f4981b && this.f4983d.f4977i;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        g0 s3 = this.f4982c.s();
        while (true) {
            if (s3 == null) {
                s3 = null;
                break;
            }
            j u2 = s3.u();
            if (u2 != null && u2.f4977i) {
                break;
            }
            s3 = s3.s();
        }
        return s3 == null;
    }

    public final void r(ArrayList arrayList, j jVar) {
        if (this.f4983d.f4978r) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            m mVar = (m) arrayList.get(size2);
            if (!mVar.p()) {
                jVar.f(mVar.f4983d);
                mVar.r(arrayList, jVar);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z10) {
        if (o()) {
            return j0.f5574d;
        }
        c(this.f4982c, arrayList);
        if (z10) {
            j jVar = this.f4983d;
            h0 h0Var = jVar.f4975d;
            Object g = h0Var.g(q.f5014x);
            if (g == null) {
                g = null;
            }
            g gVar = (g) g;
            if (gVar != null && jVar.f4977i && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new a3.e(13, gVar)));
            }
            t tVar = q.f4993a;
            if (h0Var.c(tVar) && !arrayList.isEmpty() && jVar.f4977i) {
                Object g2 = h0Var.g(tVar);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new a3.e(14, str)));
                }
            }
        }
        return arrayList;
    }
}
