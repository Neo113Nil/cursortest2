package s;

import android.os.Trace;
import java.util.List;
import p1.t0;
import p1.v0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 implements x {

    /* renamed from: f, reason: collision with root package name */
    public final int f8012f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8013g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f8014h;

    /* renamed from: i, reason: collision with root package name */
    public t0 f8015i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8016j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8017k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8018l;

    /* renamed from: m, reason: collision with root package name */
    public q0.j f8019m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b1.b f8021o;

    public h0(b1.b bVar, int i7, long j8, i0 i0Var) {
        this.f8021o = bVar;
        this.f8012f = i7;
        this.f8013g = j8;
        this.f8014h = i0Var;
    }

    @Override // s.x
    public final void a() {
        this.f8020n = true;
    }

    public final boolean b(o5.f fVar) {
        q0.j jVar;
        if (c()) {
            Object b9 = ((r.h) ((p) this.f8021o.f1230g).f8047b.a()).b(this.f8012f);
            t0 t0Var = this.f8015i;
            i0 i0Var = this.f8014h;
            if (t0Var == null) {
                long c4 = (b9 == null || i0Var.f8022a.b(b9) < 0) ? i0Var.f8024c : i0Var.f8022a.c(b9);
                long a3 = fVar.a();
                if ((!this.f8020n || a3 <= 0) && c4 >= a3) {
                    return true;
                }
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (b9 != null) {
                        i.w wVar = i0Var.f8022a;
                        int b10 = wVar.b(b9);
                        i0Var.f8022a.e(i0.a(i0Var, nanoTime2, b10 >= 0 ? wVar.f4808c[b10] : 0L), b9);
                    }
                    i0Var.f8024c = i0.a(i0Var, nanoTime2, i0Var.f8024c);
                } finally {
                }
            }
            if (!this.f8020n) {
                if (!this.f8018l) {
                    if (fVar.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        t0 t0Var2 = this.f8015i;
                        if (t0Var2 == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        r6.v vVar = new r6.v();
                        t0Var2.c(new l1.m(vVar, 1, (byte) 0));
                        List list = (List) vVar.f7968f;
                        if (list != null) {
                            jVar = new q0.j();
                            jVar.f7411e = this;
                            jVar.f7409c = list;
                            jVar.f7410d = new List[list.size()];
                            if (list.isEmpty()) {
                                throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                            }
                        } else {
                            jVar = null;
                        }
                        this.f8019m = jVar;
                        this.f8018l = true;
                    } finally {
                    }
                }
                q0.j jVar2 = this.f8019m;
                if (jVar2 != null) {
                    List[] listArr = (List[]) jVar2.f7410d;
                    int i7 = jVar2.f7407a;
                    List list2 = (List) jVar2.f7409c;
                    if (i7 < list2.size()) {
                        if (((h0) jVar2.f7411e).f8017k) {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (jVar2.f7407a < list2.size()) {
                            try {
                                if (listArr[jVar2.f7407a] == null) {
                                    if (fVar.a() <= 0) {
                                        return true;
                                    }
                                    int i8 = jVar2.f7407a;
                                    y yVar = (y) list2.get(i8);
                                    r.o oVar = yVar.f8070a;
                                    w wVar2 = new w(yVar);
                                    oVar.f(wVar2);
                                    listArr[i8] = wVar2.f8068a;
                                }
                                List list3 = listArr[jVar2.f7407a];
                                r6.k.c(list3);
                                while (jVar2.f7408b < list3.size()) {
                                    if (((h0) list3.get(jVar2.f7408b)).b(fVar)) {
                                        return true;
                                    }
                                    jVar2.f7408b++;
                                }
                                jVar2.f7408b = 0;
                                jVar2.f7407a++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            }
            if (!this.f8016j) {
                long j8 = this.f8013g;
                int i9 = (int) (3 & j8);
                int i10 = (((i9 & 2) >> 1) * 3) + ((i9 & 1) << 1);
                if ((((int) (j8 >> 33)) & ((1 << (i10 + 13)) - 1)) - 1 != 0) {
                    if ((((1 << (18 - i10)) - 1) & ((int) (j8 >> (i10 + 46)))) - 1 != 0) {
                        long c6 = (b9 == null || i0Var.f8023b.b(b9) < 0) ? i0Var.f8025d : i0Var.f8023b.c(b9);
                        long a9 = fVar.a();
                        if ((!this.f8020n || a9 <= 0) && c6 >= a9) {
                            return true;
                        }
                        long nanoTime3 = System.nanoTime();
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            e(j8);
                            Trace.endSection();
                            long nanoTime4 = System.nanoTime() - nanoTime3;
                            if (b9 != null) {
                                i.w wVar3 = i0Var.f8023b;
                                int b11 = wVar3.b(b9);
                                i0Var.f8023b.e(i0.a(i0Var, nanoTime4, b11 >= 0 ? wVar3.f4808c[b11] : 0L), b9);
                            }
                            i0Var.f8025d = i0.a(i0Var, nanoTime4, i0Var.f8025d);
                            return false;
                        } finally {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.f8017k) {
            return false;
        }
        int c4 = ((r.h) ((p) this.f8021o.f1230g).f8047b.a()).c();
        int i7 = this.f8012f;
        return i7 >= 0 && i7 < c4;
    }

    @Override // s.x
    public final void cancel() {
        if (this.f8017k) {
            return;
        }
        this.f8017k = true;
        t0 t0Var = this.f8015i;
        if (t0Var != null) {
            t0Var.a();
        }
        this.f8015i = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f8015i != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        b1.b bVar = this.f8021o;
        r.h hVar = (r.h) ((p) bVar.f1230g).f8047b.a();
        int i7 = this.f8012f;
        Object d8 = hVar.d(i7);
        this.f8015i = ((v0) bVar.f1231h).a().g(d8, ((p) bVar.f1230g).a(d8, i7, hVar.b(i7)));
    }

    public final void e(long j8) {
        if (this.f8017k) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f8016j) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f8016j = true;
        t0 t0Var = this.f8015i;
        if (t0Var == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int b9 = t0Var.b();
        for (int i7 = 0; i7 < b9; i7++) {
            t0Var.d(j8, i7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f8012f);
        sb.append(", constraints = ");
        sb.append((Object) m2.a.k(this.f8013g));
        sb.append(", isComposed = ");
        sb.append(this.f8015i != null);
        sb.append(", isMeasured = ");
        sb.append(this.f8016j);
        sb.append(", isCanceled = ");
        sb.append(this.f8017k);
        sb.append(" }");
        return sb.toString();
    }
}
