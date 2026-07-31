package f0;

import d6.u;
import g2.a0;
import g2.i0;
import g2.q;
import q6.i;
import r2.l;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f2591a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f2592b;

    /* renamed from: c, reason: collision with root package name */
    public j2.d f2593c;

    /* renamed from: d, reason: collision with root package name */
    public int f2594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2595e;

    /* renamed from: f, reason: collision with root package name */
    public int f2596f;

    /* renamed from: g, reason: collision with root package name */
    public int f2597g;
    public r2.c i;

    /* renamed from: j, reason: collision with root package name */
    public g2.a f2599j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2600k;

    /* renamed from: l, reason: collision with root package name */
    public long f2601l;

    /* renamed from: m, reason: collision with root package name */
    public b f2602m;

    /* renamed from: n, reason: collision with root package name */
    public q f2603n;

    /* renamed from: o, reason: collision with root package name */
    public l f2604o;

    /* renamed from: q, reason: collision with root package name */
    public long f2606q;

    /* renamed from: h, reason: collision with root package name */
    public long f2598h = a.f2579a;

    /* renamed from: p, reason: collision with root package name */
    public long f2605p = r2.b.g(0, 0, 0, 0);

    public d(String str, i0 i0Var, j2.d dVar, int i, boolean z3, int i8, int i9) {
        this.f2591a = str;
        this.f2592b = i0Var;
        this.f2593c = dVar;
        this.f2594d = i;
        this.f2595e = z3;
        this.f2596f = i8;
        this.f2597g = i9;
        long j7 = 0;
        this.f2601l = (j7 & 4294967295L) | (j7 << 32);
    }

    public final boolean a(long j7, l lVar) {
        long j8;
        q qVar;
        int i;
        this.f2606q = (this.f2606q << 2) | 3;
        boolean z3 = true;
        if (this.f2597g > 1) {
            i0 i0Var = this.f2592b;
            b bVar = this.f2602m;
            r2.c cVar = this.i;
            i.b(cVar);
            j2.d dVar = this.f2593c;
            if ((bVar == null || lVar != bVar.f2582a || !a0.e(i0Var, lVar).equals(bVar.f2583b) || cVar.b() != bVar.f2584c.f6515d || dVar != bVar.f2585d) && ((bVar = b.f2581h) == null || lVar != bVar.f2582a || !a0.e(i0Var, lVar).equals(bVar.f2583b) || cVar.b() != bVar.f2584c.f6515d || dVar != bVar.f2585d)) {
                bVar = new b(lVar, a0.e(i0Var, lVar), new r2.d(cVar.b(), cVar.i()), dVar);
                b.f2581h = bVar;
            }
            this.f2602m = bVar;
            int i8 = this.f2597g;
            r2.d dVar2 = bVar.f2584c;
            float f6 = bVar.f2588g;
            float f8 = bVar.f2587f;
            if (Float.isNaN(f6) || Float.isNaN(f8)) {
                float b8 = a0.a(c.f2589a, bVar.f2586e, r2.b.b(0, 0, 15), dVar2, bVar.f2585d, 1).b();
                f8 = a0.a(c.f2590b, bVar.f2586e, r2.b.b(0, 0, 15), dVar2, bVar.f2585d, 2).b() - b8;
                bVar.f2588g = b8;
                bVar.f2587f = f8;
                f6 = b8;
            }
            if (i8 != 1) {
                int round = Math.round((f8 * (i8 - 1)) + f6);
                i = round >= 0 ? round : 0;
                int g3 = r2.a.g(j7);
                if (i > g3) {
                    i = g3;
                }
            } else {
                i = r2.a.i(j7);
            }
            j8 = r2.b.a(r2.a.j(j7), r2.a.h(j7), i, r2.a.g(j7));
        } else {
            j8 = j7;
        }
        g2.a aVar = this.f2599j;
        boolean z7 = false;
        if (aVar != null && (qVar = this.f2603n) != null && !qVar.a() && lVar == this.f2604o && (r2.a.b(j8, this.f2605p) || (r2.a.h(j8) == r2.a.h(this.f2605p) && r2.a.j(j8) == r2.a.j(this.f2605p) && r2.a.g(j8) >= aVar.b() && !aVar.f2897d.f3106d))) {
            if (!r2.a.b(j8, this.f2605p)) {
                g2.a aVar2 = this.f2599j;
                i.b(aVar2);
                this.f2601l = r2.b.d(j8, (s6.a.i(Math.min(aVar2.f2894a.i.c(), aVar2.c())) << 32) | (s6.a.i(aVar2.b()) & 4294967295L));
                if (this.f2594d == 3 || (((int) (r12 >> 32)) >= aVar2.c() && ((int) (4294967295L & r12)) >= aVar2.b())) {
                    z3 = false;
                }
                this.f2600k = z3;
                this.f2605p = j8;
            }
            return false;
        }
        q qVar2 = this.f2603n;
        if (qVar2 == null || lVar != this.f2604o || qVar2.a()) {
            this.f2604o = lVar;
            String str = this.f2591a;
            i0 e8 = a0.e(this.f2592b, lVar);
            r2.c cVar2 = this.i;
            i.b(cVar2);
            j2.d dVar3 = this.f2593c;
            u uVar = u.f2326d;
            qVar2 = new n2.c(str, e8, uVar, uVar, dVar3, cVar2);
        }
        this.f2603n = qVar2;
        boolean z8 = this.f2595e;
        int i9 = this.f2594d;
        float b9 = qVar2.b();
        int h8 = ((z8 || i9 == 2 || i9 == 4 || i9 == 5) && r2.a.d(j8)) ? r2.a.h(j8) : Integer.MAX_VALUE;
        if (r2.a.j(j8) != h8) {
            h8 = o.t(s6.a.i(b9), r2.a.j(j8), h8);
        }
        long v7 = m.a.v(0, h8, 0, r2.a.g(j8));
        boolean z9 = this.f2595e;
        int i10 = this.f2594d;
        int i11 = this.f2596f;
        g2.a aVar3 = new g2.a((n2.c) qVar2, ((z9 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10, v7);
        this.f2605p = j8;
        this.f2601l = r2.b.d(j8, (s6.a.i(aVar3.b()) & 4294967295L) | (s6.a.i(aVar3.c()) << 32));
        if (this.f2594d != 3 && (((int) (r1 >> 32)) < aVar3.c() || ((int) (r1 & 4294967295L)) < aVar3.b())) {
            z7 = true;
        }
        this.f2600k = z7;
        this.f2599j = aVar3;
        return true;
    }

    public final void b() {
        this.f2599j = null;
        this.f2603n = null;
        this.f2604o = null;
        this.f2605p = r2.b.g(0, 0, 0, 0);
        long j7 = 0;
        this.f2601l = (j7 & 4294967295L) | (j7 << 32);
        this.f2600k = false;
    }

    public final void c(r2.c cVar) {
        long j7;
        r2.c cVar2 = this.i;
        if (cVar != null) {
            int i = a.f2580b;
            j7 = a.a(cVar.b(), cVar.i());
        } else {
            j7 = a.f2579a;
        }
        if (cVar2 == null) {
            this.i = cVar;
            this.f2598h = j7;
        } else if (cVar == null || this.f2598h != j7) {
            this.i = cVar;
            this.f2598h = j7;
            this.f2606q = (this.f2606q << 2) | 1;
            b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f2599j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.f2598h));
        sb.append(", history=");
        sb.append(this.f2606q);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
