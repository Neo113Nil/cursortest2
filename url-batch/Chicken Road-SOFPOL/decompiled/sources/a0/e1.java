package a0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e1 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f57a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f58b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.c f59c;

    /* renamed from: d, reason: collision with root package name */
    public r2.a f60d;

    /* renamed from: e, reason: collision with root package name */
    public u1.u0 f61e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f63g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65j;

    /* renamed from: k, reason: collision with root package name */
    public d1 f66k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f67l;

    /* renamed from: m, reason: collision with root package name */
    public long f68m;

    /* renamed from: n, reason: collision with root package name */
    public long f69n;

    /* renamed from: o, reason: collision with root package name */
    public long f70o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f1 f71p;

    public e1(f1 f1Var, int i, g1 g1Var, s1 s1Var) {
        this.f71p = f1Var;
        this.f57a = i;
        this.f58b = g1Var;
        this.f59c = s1Var;
        int i8 = z6.d.f9295b;
        this.f70o = System.nanoTime() - z6.d.f9294a;
    }

    @Override // a0.m0
    public final void a() {
        this.f67l = true;
    }

    public final void b() {
        u1.u0 u0Var = this.f61e;
        if (u0Var != null) {
            u0Var.a();
        }
        this.f61e = null;
        this.f66k = null;
    }

    public final boolean c(b bVar) {
        boolean d8;
        if (!this.f71p.f78a) {
            return false;
        }
        if (this.f67l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d8 = d(bVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d8 = d(bVar);
        }
        r2.o.s0("compose:lazy:prefetch:execute:item", -1L);
        return d8;
    }

    @Override // a0.m0
    public final void cancel() {
        if (this.f63g) {
            return;
        }
        this.f63g = true;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0157, code lost:
    
        if (e() == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0289 A[Catch: all -> 0x024f, LOOP:2: B:94:0x025d->B:104:0x0289, LOOP_END, TRY_ENTER, TryCatch #4 {all -> 0x024f, blocks: (B:82:0x01c2, B:84:0x01ca, B:86:0x01d0, B:89:0x01dc, B:91:0x01e8, B:92:0x024c, B:93:0x0256, B:94:0x025d, B:96:0x0265, B:101:0x0276, B:102:0x027b, B:104:0x0289, B:111:0x028f, B:113:0x01f2, B:115:0x0201, B:117:0x020c, B:122:0x021a, B:126:0x0239, B:127:0x0228, B:130:0x0240), top: B:81:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(b bVar) {
        boolean z3;
        List[] listArr;
        e1 e1Var;
        ?? r11;
        int i;
        List list;
        int i8;
        boolean z7;
        List[] listArr2;
        int i9 = this.f57a;
        long j7 = i9;
        r2.o.s0("compose:lazy:prefetch:execute:item", j7);
        f1 f1Var = this.f71p;
        z.h hVar = (z.h) ((x) f1Var.f79b).f168b.b();
        if (!this.f63g) {
            int c8 = hVar.c();
            if (i9 >= 0 && i9 < c8) {
                Object d8 = hVar.d(i9);
                Object obj = this.i;
                if (obj != null && !d8.equals(obj)) {
                    b();
                    return false;
                }
                Object b8 = hVar.b(i9);
                g1 g1Var = this.f58b;
                d dVar = (d) g1Var.f86d;
                if (g1Var.f85c != b8 || dVar == null) {
                    o.j0 j0Var = (o.j0) g1Var.f84b;
                    Object g3 = j0Var.g(b8);
                    Object obj2 = g3;
                    if (g3 == null) {
                        d dVar2 = new d();
                        dVar2.f39d = -1;
                        j0Var.m(b8, dVar2);
                        obj2 = dVar2;
                    }
                    dVar = (d) obj2;
                    g1Var.f85c = b8;
                    g1Var.f86d = dVar;
                }
                e();
                long a8 = bVar.a();
                this.f68m = a8;
                int i10 = z6.d.f9295b;
                this.f70o = System.nanoTime() - z6.d.f9294a;
                this.f69n = 0L;
                r2.o.s0("compose:lazy:prefetch:available_time_nanos", a8);
                boolean z8 = true;
                if (!e()) {
                    if (h(this.f68m, dVar.f36a)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            if (this.f61e != null) {
                                w.a.a("Request was already composed!");
                            }
                            p6.e a9 = ((x) f1Var.f79b).a(i9, d8, b8);
                            this.i = d8;
                            u1.a0 a10 = ((u1.w0) f1Var.f80c).a();
                            w1.f0 f0Var = a10.f7169d;
                            if (f0Var.G()) {
                                a10.e();
                                if (!a10.f7174j.c(d8)) {
                                    a10.f7179o.k(d8);
                                    o.j0 j0Var2 = a10.f7177m;
                                    Object g7 = j0Var2.g(d8);
                                    if (g7 == null) {
                                        g7 = a10.i(d8);
                                        if (g7 != null) {
                                            int i11 = ((o0.b) f0Var.n()).f5572d.i(g7);
                                            int i12 = ((o0.b) f0Var.n()).f5572d.f5580f;
                                            f0Var.f7652r = true;
                                            f0Var.K(i11, i12, 1);
                                            f0Var.f7652r = false;
                                            a10.f7182r++;
                                        } else {
                                            int i13 = ((o0.b) f0Var.n()).f5572d.f5580f;
                                            w1.f0 f0Var2 = new w1.f0(2);
                                            f0Var.f7652r = true;
                                            f0Var.z(i13, f0Var2);
                                            f0Var.f7652r = false;
                                            a10.f7182r++;
                                            g7 = f0Var2;
                                        }
                                        j0Var2.m(d8, g7);
                                    }
                                    a10.h((w1.f0) g7, d8, false, a9);
                                }
                            }
                            this.f61e = !f0Var.G() ? new u1.y() : new u1.z(a10, d8);
                            this.f64h = true;
                            Trace.endSection();
                            i();
                            dVar.f36a = d.a(this.f69n, dVar.f36a);
                        } finally {
                        }
                    }
                }
                if (!this.f65j) {
                    if (this.f68m > 0) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f66k = g();
                            this.f65j = true;
                        } finally {
                        }
                    }
                    return true;
                }
                d1 d1Var = this.f66k;
                if (d1Var != null) {
                    int i14 = dVar.f39d;
                    boolean z9 = this.f67l;
                    List[] listArr3 = d1Var.f46b;
                    int i15 = d1Var.f47c;
                    List list2 = d1Var.f45a;
                    if (i15 < list2.size()) {
                        if (d1Var.f50f.f63g) {
                            w.a.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                ((n0) list2.get(i16)).f120d = i14;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (d1Var.f47c < list2.size()) {
                                try {
                                    if (listArr3[d1Var.f47c] != null) {
                                        z3 = z9;
                                        listArr = listArr3;
                                        e1Var = null;
                                    } else {
                                        if (bVar.a() <= 0) {
                                            return z8;
                                        }
                                        int i17 = d1Var.f47c;
                                        n0 n0Var = (n0) list2.get(i17);
                                        z.m mVar = n0Var.f117a;
                                        if (mVar == null) {
                                            list = d6.u.f2326d;
                                            i = i17;
                                            z3 = z9;
                                            listArr = listArr3;
                                            e1Var = null;
                                        } else {
                                            int i18 = n0Var.f120d;
                                            ArrayList arrayList = new ArrayList();
                                            int i19 = mVar.f9070d;
                                            w0.f e8 = w0.q.e();
                                            i = i17;
                                            w0.q.k(e8, w0.q.h(e8), e8 != null ? e8.e() : null);
                                            if (i18 == -1) {
                                                i18 = 2;
                                            }
                                            int i20 = 0;
                                            while (i20 < i18) {
                                                int i21 = i19 + i20;
                                                f1 f1Var2 = n0Var.f119c;
                                                if (f1Var2 == null) {
                                                    i8 = i20;
                                                    z7 = z9;
                                                    listArr2 = listArr3;
                                                } else {
                                                    i8 = i20;
                                                    z7 = z9;
                                                    listArr2 = listArr3;
                                                    arrayList.add(new e1(f1Var2, i21, n0Var.f118b, null));
                                                }
                                                i20 = i8 + 1;
                                                z9 = z7;
                                                listArr3 = listArr2;
                                            }
                                            z3 = z9;
                                            listArr = listArr3;
                                            e1Var = null;
                                            n0Var.f122f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    List list3 = listArr[d1Var.f47c];
                                    q6.i.b(list3);
                                    while (d1Var.f48d < list3.size()) {
                                        e1 e1Var2 = (e1) list3.get(d1Var.f48d);
                                        if (z3) {
                                            e1 e1Var3 = e1Var2 != null ? e1Var2 : e1Var;
                                            if (e1Var3 != null) {
                                                r11 = 1;
                                                e1Var3.f67l = true;
                                                d1Var.f49e = r11;
                                                if (!e1Var2.c(bVar)) {
                                                    return r11;
                                                }
                                                d1Var.f48d += r11;
                                            }
                                        }
                                        r11 = 1;
                                        d1Var.f49e = r11;
                                        if (!e1Var2.c(bVar)) {
                                        }
                                    }
                                    d1Var.f48d = 0;
                                    d1Var.f47c++;
                                    z9 = z3;
                                    listArr3 = listArr;
                                    z8 = true;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                }
                d1 d1Var2 = this.f66k;
                if (d1Var2 != null && d1Var2.f49e) {
                    i();
                    r2.o.s0("compose:lazy:prefetch:execute:item", j7);
                    d1 d1Var3 = this.f66k;
                    if (d1Var3 != null) {
                        d1Var3.f49e = false;
                    }
                }
                r2.a aVar = this.f60d;
                if (!this.f62f && aVar != null) {
                    if (!h(this.f68m, dVar.f38c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        f(aVar.f6514a);
                        Trace.endSection();
                        i();
                        dVar.f38c = d.a(this.f69n, dVar.f38c);
                        p6.c cVar = this.f59c;
                        if (cVar != null) {
                            cVar.i(this);
                        }
                    } finally {
                    }
                }
                d1 d1Var4 = this.f66k;
                if (!this.f62f || !this.f65j || d1Var4 == null) {
                    return false;
                }
                List list4 = d1Var4.f45a;
                int size2 = list4.size();
                int i22 = Integer.MAX_VALUE;
                for (int i23 = 0; i23 < size2; i23++) {
                    i22 = Math.min(i22, ((n0) list4.get(i23)).f121e);
                }
                if (i22 == Integer.MAX_VALUE) {
                    i22 = 0;
                }
                int i24 = dVar.f39d;
                dVar.f39d = i24 == -1 ? i22 : ((i24 * 3) + i22) / 4;
                int size3 = list4.size();
                int i25 = Integer.MAX_VALUE;
                for (int i26 = 0; i26 < size3; i26++) {
                    i25 = Math.min(i25, ((n0) list4.get(i26)).f122f);
                }
                if (i25 == Integer.MAX_VALUE) {
                    i25 = 0;
                }
                if (i25 >= i22) {
                    return false;
                }
                dVar.f38c = 0L;
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        return this.f64h;
    }

    public final void f(long j7) {
        if (this.f63g) {
            w.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f62f) {
            w.a.a("Request was already measured!");
        }
        this.f62f = true;
        u1.u0 u0Var = this.f61e;
        if (u0Var == null) {
            w.a.b("performComposition() must be called before performMeasure()");
            throw new a5.c();
        }
        int b8 = u0Var.b();
        for (int i = 0; i < b8; i++) {
            u0Var.d(i, j7);
        }
    }

    public final d1 g() {
        u1.u0 u0Var = this.f61e;
        if (u0Var == null) {
            w.a.b("Should precompose before resolving nested prefetch states");
            throw new a5.c();
        }
        q6.s sVar = new q6.s();
        u0Var.c(new c1(sVar, 0));
        List list = (List) sVar.f6205d;
        if (list != null) {
            return new d1(this, list);
        }
        return null;
    }

    public final boolean h(long j7, long j8) {
        if (this.f67l) {
            j8 = 0;
        }
        return j7 > j8;
    }

    public final void i() {
        long r02;
        int i = z6.d.f9295b;
        long nanoTime = System.nanoTime() - z6.d.f9294a;
        long j7 = this.f70o;
        z6.c cVar = z6.c.NANOSECONDS;
        q6.i.e(cVar, "unit");
        long j8 = 0;
        if (((j7 - 1) | 1) != Long.MAX_VALUE) {
            if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
                r02 = nanoTime < 0 ? z6.a.f9287e : z6.a.f9286d;
            } else {
                long j9 = nanoTime - j7;
                if (((j9 ^ nanoTime) & (~(j9 ^ j7))) < 0) {
                    z6.c cVar2 = z6.c.MILLISECONDS;
                    if (cVar.compareTo(cVar2) < 0) {
                        long r7 = r2.r.r(1L, cVar2, cVar);
                        long j10 = (nanoTime / r7) - (j7 / r7);
                        long j11 = (nanoTime % r7) - (j7 % r7);
                        int i8 = z6.a.f9288f;
                        r02 = r2.o.r0(j10, cVar2);
                        long r03 = r2.o.r0(j11, cVar);
                        if (z6.a.b(r02)) {
                            if (z6.a.b(r03) && (r03 ^ r02) < 0) {
                                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                            }
                        } else if (z6.a.b(r03)) {
                            j8 = r03;
                        } else {
                            int i9 = ((int) r02) & 1;
                            if (i9 == (((int) r03) & 1)) {
                                long j12 = (r02 >> 1) + (r03 >> 1);
                                if (i9 == 0) {
                                    if (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) {
                                        j8 = r2.o.z(j12 / 1000000);
                                    } else {
                                        j8 = j12 << 1;
                                        int i10 = z6.b.f9289a;
                                    }
                                } else if (-4611686018426L > j12 || j12 >= 4611686018427L) {
                                    j8 = r2.o.z(r2.o.u(j12));
                                } else {
                                    j8 = (j12 * 1000000) << 1;
                                    int i11 = z6.b.f9289a;
                                }
                            } else {
                                j8 = i9 == 1 ? z6.a.a(r02 >> 1, r03 >> 1) : z6.a.a(r03 >> 1, r02 >> 1);
                            }
                        }
                    } else {
                        j8 = ((-((j9 < 0 ? z6.a.f9287e : z6.a.f9286d) >> 1)) << 1) + (((int) r3) & 1);
                        int i12 = z6.b.f9289a;
                    }
                } else {
                    j8 = r2.o.r0(j9, cVar);
                }
            }
            j8 = r02;
        } else if (nanoTime == j7) {
            int i13 = z6.a.f9288f;
        } else {
            j8 = ((-((j7 < 0 ? z6.a.f9287e : z6.a.f9286d) >> 1)) << 1) + (((int) r3) & 1);
            int i14 = z6.b.f9289a;
        }
        long j13 = j8 >> 1;
        int i15 = z6.a.f9288f;
        long j14 = (((int) j8) & 1) == 0 ? j13 : j13 > 9223372036854L ? Long.MAX_VALUE : j13 < -9223372036854L ? Long.MIN_VALUE : j13 * 1000000;
        this.f69n = j14;
        long j15 = this.f68m - j14;
        this.f68m = j15;
        this.f70o = nanoTime;
        r2.o.s0("compose:lazy:prefetch:available_time_nanos", j15);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f57a + ", constraints = " + this.f60d + ", isComposed = " + e() + ", isMeasured = " + this.f62f + ", isCanceled = " + this.f63g + " }";
    }
}
