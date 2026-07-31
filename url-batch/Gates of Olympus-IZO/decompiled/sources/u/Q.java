package u;

import D1.C0014b;
import android.os.Trace;
import j.C0505w;
import java.util.List;
import q1.C0773B;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0924F {

    /* renamed from: a, reason: collision with root package name */
    public final int f8034a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8035b;

    /* renamed from: c, reason: collision with root package name */
    public final S f8036c;

    /* renamed from: d, reason: collision with root package name */
    public r0.N f8037d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8038e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8039f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8040g;

    /* renamed from: h, reason: collision with root package name */
    public S.l f8041h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8042i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0014b f8043j;

    public Q(C0014b c0014b, int i3, long j3, S s3) {
        this.f8043j = c0014b;
        this.f8034a = i3;
        this.f8035b = j3;
        this.f8036c = s3;
    }

    @Override // u.InterfaceC0924F
    public final void a() {
        this.f8042i = true;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [Y1.c, Z1.j] */
    public final boolean b(C0933a c0933a) {
        S.l lVar;
        if (!c()) {
            return false;
        }
        Object d3 = ((InterfaceC0953v) ((C0951t) this.f8043j.f536b).f8091b.b()).d(this.f8034a);
        boolean z3 = this.f8037d != null;
        S s3 = this.f8036c;
        if (!z3) {
            long c3 = (d3 == null || s3.f8044a.b(d3) < 0) ? s3.f8046c : s3.f8044a.c(d3);
            long a3 = c0933a.a();
            if ((!this.f8042i || a3 <= 0) && c3 >= a3) {
                return true;
            }
            long nanoTime = System.nanoTime();
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                d();
                Trace.endSection();
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (d3 != null) {
                    C0505w c0505w = s3.f8044a;
                    int b2 = c0505w.b(d3);
                    s3.f8044a.e(S.a(s3, nanoTime2, b2 >= 0 ? c0505w.f5222c[b2] : 0L), d3);
                }
                s3.f8046c = S.a(s3, nanoTime2, s3.f8046c);
            } finally {
            }
        }
        if (!this.f8042i) {
            if (!this.f8040g) {
                if (c0933a.a() <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    r0.N n3 = this.f8037d;
                    if (n3 == null) {
                        throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                    }
                    Z1.t tVar = new Z1.t();
                    n3.c(new C0773B(tVar, 1));
                    List list = (List) tVar.f3480d;
                    if (list != null) {
                        lVar = new S.l();
                        lVar.f3217e = this;
                        lVar.f3215c = list;
                        lVar.f3216d = new List[list.size()];
                        if (list.isEmpty()) {
                            throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                        }
                    } else {
                        lVar = null;
                    }
                    this.f8041h = lVar;
                    this.f8040g = true;
                } finally {
                }
            }
            S.l lVar2 = this.f8041h;
            if (lVar2 != null) {
                List[] listArr = (List[]) lVar2.f3216d;
                int i3 = lVar2.f3213a;
                List list2 = (List) lVar2.f3215c;
                if (i3 < list2.size()) {
                    if (((Q) lVar2.f3217e).f8039f) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (lVar2.f3213a < list2.size()) {
                        try {
                            if (listArr[lVar2.f3213a] == null) {
                                if (c0933a.a() <= 0) {
                                    return true;
                                }
                                int i4 = lVar2.f3213a;
                                C0925G c0925g = (C0925G) list2.get(i4);
                                ?? r11 = c0925g.f8008a;
                                C0923E c0923e = new C0923E(c0925g);
                                r11.j(c0923e);
                                listArr[i4] = c0923e.f8006a;
                            }
                            List list3 = listArr[lVar2.f3213a];
                            Z1.i.c(list3);
                            while (lVar2.f3214b < list3.size()) {
                                if (((Q) list3.get(lVar2.f3214b)).b(c0933a)) {
                                    return true;
                                }
                                lVar2.f3214b++;
                            }
                            lVar2.f3214b = 0;
                            lVar2.f3213a++;
                        } finally {
                        }
                    }
                }
            }
        }
        if (!this.f8038e) {
            long j3 = this.f8035b;
            int i5 = (int) (3 & j3);
            int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
            if ((((int) (j3 >> 33)) & ((1 << (i6 + 13)) - 1)) - 1 != 0) {
                if ((((1 << (18 - i6)) - 1) & ((int) (j3 >> (i6 + 46)))) - 1 != 0) {
                    long c4 = (d3 == null || s3.f8045b.b(d3) < 0) ? s3.f8047d : s3.f8045b.c(d3);
                    long a4 = c0933a.a();
                    if ((!this.f8042i || a4 <= 0) && c4 >= a4) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j3);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (d3 != null) {
                            C0505w c0505w2 = s3.f8045b;
                            int b3 = c0505w2.b(d3);
                            s3.f8045b.e(S.a(s3, nanoTime4, b3 >= 0 ? c0505w2.f5222c[b3] : 0L), d3);
                        }
                        s3.f8047d = S.a(s3, nanoTime4, s3.f8047d);
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (!this.f8039f) {
            int a3 = ((InterfaceC0953v) ((C0951t) this.f8043j.f536b).f8091b.b()).a();
            int i3 = this.f8034a;
            if (i3 >= 0 && i3 < a3) {
                return true;
            }
        }
        return false;
    }

    @Override // u.InterfaceC0924F
    public final void cancel() {
        if (this.f8039f) {
            return;
        }
        this.f8039f = true;
        r0.N n3 = this.f8037d;
        if (n3 != null) {
            n3.a();
        }
        this.f8037d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f8037d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        C0014b c0014b = this.f8043j;
        InterfaceC0953v interfaceC0953v = (InterfaceC0953v) ((C0951t) c0014b.f536b).f8091b.b();
        int i3 = this.f8034a;
        Object c3 = interfaceC0953v.c(i3);
        this.f8037d = ((r0.P) c0014b.f537c).a().g(c3, ((C0951t) c0014b.f536b).a(c3, i3, interfaceC0953v.d(i3)));
    }

    public final void e(long j3) {
        if (this.f8039f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f8038e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f8038e = true;
        r0.N n3 = this.f8037d;
        if (n3 == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int b2 = n3.b();
        for (int i3 = 0; i3 < b2; i3++) {
            n3.d(j3, i3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f8034a);
        sb.append(", constraints = ");
        sb.append((Object) M0.a.k(this.f8035b));
        sb.append(", isComposed = ");
        sb.append(this.f8037d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f8038e);
        sb.append(", isCanceled = ");
        sb.append(this.f8039f);
        sb.append(" }");
        return sb.toString();
    }
}
