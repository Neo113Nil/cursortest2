package b1;

import a0.g1;
import a0.s0;
import a4.i;
import a7.h;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.CancellationSignal;
import c6.m;
import d2.n;
import d2.s;
import d2.u;
import f1.g0;
import f1.i0;
import f1.j0;
import f1.p;
import f1.q;
import java.util.List;
import java.util.Map;
import l1.t;
import m0.z0;
import o.l;
import q1.r;
import q6.j;
import q6.o;
import w1.d1;
import w1.w1;
import x.v0;
import x1.i1;
import x1.j1;
import y0.k;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1053f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj) {
        super(1);
        this.f1052e = i;
        this.f1053f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [u1.l0, w1.a] */
    @Override // p6.c
    public final Object i(Object obj) {
        int i = this.f1052e;
        w1 w1Var = w1.f7818e;
        w1 w1Var2 = w1.f7817d;
        int i8 = 1;
        m mVar = m.f1757a;
        Object obj2 = this.f1053f;
        switch (i) {
            case 0:
                g gVar = (g) obj;
                if (!gVar.f8718q) {
                    return w1Var;
                }
                if (gVar.f1059s != null) {
                    t1.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gVar.f1059s = null;
                o oVar = (o) obj2;
                oVar.f6201d = oVar.f6201d;
                return w1Var2;
            case 1:
                g gVar2 = (g) obj;
                if (!gVar2.f8706d.f8718q) {
                    return w1Var;
                }
                g gVar3 = gVar2.f1059s;
                if (gVar3 != null) {
                    e eVar = new e(i8, (b) obj2);
                    if (eVar.i(gVar3) == w1Var2) {
                        w1.f.y(gVar3, eVar);
                    }
                }
                gVar2.f1059s = null;
                gVar2.f1058r = null;
                return w1Var2;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return mVar;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                u.a((d2.j) obj, ((d2.g) obj2).f2122a);
                return mVar;
            case i.LONG_FIELD_NUMBER /* 4 */:
                w6.d[] dVarArr = u.f2215a;
                ((d2.j) obj).e(s.f2188a, s6.a.x((String) obj2));
                return mVar;
            case 5:
                ((List) obj).add((Float) ((s0) obj2).b());
                return true;
            case 6:
                g0 g0Var = (g0) obj;
                j0 j0Var = (j0) obj2;
                g0Var.d(j0Var.f2672r);
                g0Var.e(j0Var.f2673s);
                g0Var.a(j0Var.f2674t);
                float f6 = j0Var.f2675u;
                if (g0Var.f2648h != f6) {
                    g0Var.f2644d |= 32;
                    g0Var.f2648h = f6;
                }
                float f8 = j0Var.f2676v;
                if (g0Var.f2650k != f8) {
                    g0Var.f2644d |= 2048;
                    g0Var.f2650k = f8;
                }
                g0Var.f(j0Var.f2677w);
                i0 i0Var = j0Var.f2678x;
                if (!q6.i.a(g0Var.f2652m, i0Var)) {
                    g0Var.f2644d |= 8192;
                    g0Var.f2652m = i0Var;
                }
                boolean z3 = j0Var.f2679y;
                if (g0Var.f2653n != z3) {
                    g0Var.f2644d |= 16384;
                    g0Var.f2653n = z3;
                }
                long j7 = j0Var.f2680z;
                if (!f1.s.c(g0Var.i, j7)) {
                    g0Var.f2644d |= 64;
                    g0Var.i = j7;
                }
                long j8 = j0Var.A;
                if (!f1.s.c(g0Var.f2649j, j8)) {
                    g0Var.f2644d |= 128;
                    g0Var.f2649j = j8;
                }
                int i9 = j0Var.B;
                if (g0Var.f2657r != i9) {
                    g0Var.f2644d |= 524288;
                    g0Var.f2657r = i9;
                }
                return mVar;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                h1.d dVar = (h1.d) obj;
                i1.b bVar = (i1.b) obj2;
                f1.j jVar = bVar.f3304l;
                if (bVar.f3306n && bVar.f3315w && jVar != null) {
                    g1 y7 = dVar.y();
                    long u7 = y7.u();
                    y7.m().h();
                    try {
                        ((g1) ((b) y7.f84b).f1050e).m().g(jVar);
                        bVar.c(dVar);
                    } finally {
                        y7.m().f();
                        y7.M(u7);
                    }
                } else {
                    bVar.c(dVar);
                }
                return mVar;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                t tVar = (t) obj;
                l1.b bVar2 = (l1.b) obj2;
                bVar2.g(tVar);
                p6.c cVar = bVar2.i;
                if (cVar != null) {
                    cVar.i(tVar);
                }
                return mVar;
            case v0.f8304b /* 9 */:
                return Boolean.valueOf(q6.i.a(obj, obj2));
            case v0.f8306d /* 10 */:
                r.o oVar2 = (r.o) obj;
                float f9 = oVar2.f6373b;
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                float f10 = oVar2.f6374c;
                if (f10 < -0.5f) {
                    f10 = -0.5f;
                }
                if (f10 > 0.5f) {
                    f10 = 0.5f;
                }
                float f11 = oVar2.f6375d;
                float f12 = f11 >= -0.5f ? f11 : -0.5f;
                float f13 = f12 <= 0.5f ? f12 : 0.5f;
                float f14 = oVar2.f6372a;
                float f15 = f14 >= 0.0f ? f14 : 0.0f;
                return new f1.s(f1.s.a(p.a(f9, f10, f13, f15 <= 1.0f ? f15 : 1.0f, g1.d.f2843x), (g1.c) obj2));
            case 11:
                Throwable th = (Throwable) obj;
                r rVar = (r) obj2;
                h hVar = rVar.f6025f;
                if (hVar != null) {
                    hVar.m(th);
                }
                rVar.f6025f = null;
                return mVar;
            case 12:
                w1.a aVar = (w1.a) obj;
                w1.g0 g0Var2 = (w1.g0) obj2;
                if (aVar.A()) {
                    if (aVar.a().f7666b) {
                        aVar.q();
                    }
                    for (Map.Entry entry : aVar.a().f7671g.entrySet()) {
                        w1.g0.a(g0Var2, (u1.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.m());
                    }
                    d1 d1Var = aVar.m().f7616t;
                    q6.i.b(d1Var);
                    while (!d1Var.equals(g0Var2.f7665a.m())) {
                        for (u1.a aVar2 : g0Var2.b(d1Var).keySet()) {
                            w1.g0.a(g0Var2, aVar2, g0Var2.c(d1Var, aVar2), d1Var);
                        }
                        d1Var = d1Var.f7616t;
                        q6.i.b(d1Var);
                    }
                }
                return mVar;
            case 13:
                ((o0.e) obj2).b((k) obj);
                return Boolean.TRUE;
            case 14:
                return Boolean.valueOf(((l) obj2).a(((n) obj).f2162g));
            case v0.f8308f /* 15 */:
                return Boolean.valueOf(x1.g0.c((n) obj, (Resources) obj2));
            case 16:
                ((z0) obj2).setValue(new Configuration((Configuration) obj));
                return mVar;
            case 17:
                return new a0.u(4, (x1.d1) obj2);
            case 18:
                if (i1.f8457b.compareAndSet(false, true)) {
                    ((c7.c) obj2).t(mVar);
                }
                return mVar;
            default:
                h1.d dVar2 = (h1.d) obj;
                q m7 = dVar2.y().m();
                p6.e eVar2 = ((j1) obj2).f8468g;
                if (eVar2 != null) {
                    eVar2.g(m7, (i1.b) dVar2.y().f85c);
                }
                return mVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, g gVar, o oVar) {
        super(1);
        this.f1052e = 0;
        this.f1053f = oVar;
    }
}
