package l1;

import c7.m1;
import g0.s0;
import java.util.ArrayList;
import r1.l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends s0.n implements m2.b, l1 {

    /* renamed from: s, reason: collision with root package name */
    public Object f5788s;

    /* renamed from: t, reason: collision with root package name */
    public Object f5789t;

    /* renamed from: u, reason: collision with root package name */
    public q6.e f5790u;

    /* renamed from: v, reason: collision with root package name */
    public m1 f5791v;

    /* renamed from: z, reason: collision with root package name */
    public j f5795z;

    /* renamed from: w, reason: collision with root package name */
    public j f5792w = a0.f5772a;

    /* renamed from: x, reason: collision with root package name */
    public final i0.d f5793x = new i0.d(new c0[16]);

    /* renamed from: y, reason: collision with root package name */
    public final i0.d f5794y = new i0.d(new c0[16]);
    public long A = 0;

    public d0(Object obj, Object obj2, q6.e eVar) {
        this.f5788s = obj;
        this.f5789t = obj2;
        this.f5790u = eVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // r1.l1
    public final void A(j jVar, k kVar, long j8) {
        this.A = j8;
        if (kVar == k.f5815f) {
            this.f5792w = jVar;
        }
        h6.d dVar = null;
        if (this.f5791v == null) {
            this.f5791v = c7.a0.p(o0(), null, c7.y.f1759i, new f4.c(this, dVar, 4), 1);
        }
        B0(jVar, kVar);
        ?? r52 = jVar.f5812a;
        int size = r52.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                jVar = null;
                break;
            } else if (!t.c((v) r52.get(i7))) {
                break;
            } else {
                i7++;
            }
        }
        this.f5795z = jVar;
    }

    public final Object A0(q6.e eVar, h6.d dVar) {
        c7.h hVar = new c7.h(1, a8.m.A(dVar));
        hVar.r();
        c0 c0Var = new c0(this, hVar);
        synchronized (this.f5793x) {
            this.f5793x.b(c0Var);
            new h6.k(a8.m.A(a8.m.q(c0Var, c0Var, eVar)), i6.a.f4956f).resumeWith(d6.z.f2639a);
        }
        hVar.t(new c1.a(15, c0Var));
        return hVar.q();
    }

    public final void B0(j jVar, k kVar) {
        c7.h hVar;
        c7.h hVar2;
        synchronized (this.f5793x) {
            i0.d dVar = this.f5794y;
            dVar.c(dVar.f4842h, this.f5793x);
        }
        try {
            int ordinal = kVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i0.d dVar2 = this.f5794y;
                    int i7 = dVar2.f4842h;
                    if (i7 > 0) {
                        int i8 = i7 - 1;
                        Object[] objArr = dVar2.f4840f;
                        do {
                            c0 c0Var = (c0) objArr[i8];
                            if (kVar == c0Var.f5783i && (hVar2 = c0Var.f5782h) != null) {
                                c0Var.f5782h = null;
                                hVar2.resumeWith(jVar);
                            }
                            i8--;
                        } while (i8 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            i0.d dVar3 = this.f5794y;
            int i9 = dVar3.f4842h;
            if (i9 > 0) {
                Object[] objArr2 = dVar3.f4840f;
                int i10 = 0;
                do {
                    c0 c0Var2 = (c0) objArr2[i10];
                    if (kVar == c0Var2.f5783i && (hVar = c0Var2.f5782h) != null) {
                        c0Var2.f5782h = null;
                        hVar.resumeWith(jVar);
                    }
                    i10++;
                } while (i10 < i9);
            }
        } finally {
            this.f5794y.h();
        }
    }

    public final void C0() {
        m1 m1Var = this.f5791v;
        if (m1Var != null) {
            m1Var.p(new s0("Pointer input was reset", 2));
            this.f5791v = null;
        }
    }

    @Override // r1.l1
    public final void W() {
        C0();
    }

    @Override // m2.b
    public final float a() {
        return r1.f.t(this).f7735v.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // r1.l1
    public final void a0() {
        j jVar = this.f5795z;
        if (jVar == null) {
            return;
        }
        ?? r12 = jVar.f5812a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((v) r12.get(i7)).f5833d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    v vVar = (v) r12.get(i8);
                    long j8 = vVar.f5830a;
                    long j9 = vVar.f5832c;
                    long j10 = vVar.f5831b;
                    float f9 = vVar.f5834e;
                    boolean z8 = vVar.f5833d;
                    arrayList.add(new v(j8, j10, j9, false, f9, j10, j9, z8, z8, 1, 0L));
                }
                j jVar2 = new j(arrayList, null);
                this.f5792w = jVar2;
                B0(jVar2, k.f5815f);
                B0(jVar2, k.f5816g);
                B0(jVar2, k.f5817h);
                this.f5795z = null;
                return;
            }
        }
    }

    @Override // r1.l1
    public final void k() {
        C0();
    }

    @Override // m2.b
    public final float m() {
        return r1.f.t(this).f7735v.m();
    }

    @Override // s0.n
    public final void t0() {
        C0();
    }
}
