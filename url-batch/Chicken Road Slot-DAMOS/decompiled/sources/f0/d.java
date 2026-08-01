package f0;

import kotlin.collections.j0;
import m2.h0;
import m2.o;
import m2.z;
import x2.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f4010a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f4011b;

    /* renamed from: c, reason: collision with root package name */
    public p2.h f4012c;

    /* renamed from: d, reason: collision with root package name */
    public int f4013d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4014e;

    /* renamed from: f, reason: collision with root package name */
    public int f4015f;
    public int g;

    /* renamed from: i, reason: collision with root package name */
    public x2.c f4017i;
    public m2.a j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4018k;

    /* renamed from: l, reason: collision with root package name */
    public long f4019l;

    /* renamed from: m, reason: collision with root package name */
    public b f4020m;

    /* renamed from: n, reason: collision with root package name */
    public o f4021n;

    /* renamed from: o, reason: collision with root package name */
    public l f4022o;

    /* renamed from: q, reason: collision with root package name */
    public long f4024q;

    /* renamed from: h, reason: collision with root package name */
    public long f4016h = a.f3999a;

    /* renamed from: p, reason: collision with root package name */
    public long f4023p = x2.b.g(0, 0, 0, 0);

    public d(String str, h0 h0Var, p2.h hVar, int i3, boolean z10, int i10, int i11) {
        this.f4010a = str;
        this.f4011b = h0Var;
        this.f4012c = hVar;
        this.f4013d = i3;
        this.f4014e = z10;
        this.f4015f = i10;
        this.g = i11;
        long j = 0;
        this.f4019l = (j & 4294967295L) | (j << 32);
    }

    public final boolean a(long j, l lVar) {
        long j3;
        o oVar;
        int i3;
        this.f4024q = (this.f4024q << 2) | 3;
        boolean z10 = true;
        if (this.g > 1) {
            h0 h0Var = this.f4011b;
            b bVar = this.f4020m;
            x2.c cVar = this.f4017i;
            cVar.getClass();
            p2.h hVar = this.f4012c;
            if ((bVar == null || lVar != bVar.f4002a || !z.e(h0Var, lVar).equals(bVar.f4003b) || cVar.g() != bVar.f4004c.f10317d || hVar != bVar.f4005d) && ((bVar = b.f4001h) == null || lVar != bVar.f4002a || !z.e(h0Var, lVar).equals(bVar.f4003b) || cVar.g() != bVar.f4004c.f10317d || hVar != bVar.f4005d)) {
                bVar = new b(lVar, z.e(h0Var, lVar), new x2.d(cVar.g(), cVar.d()), hVar);
                b.f4001h = bVar;
            }
            this.f4020m = bVar;
            int i10 = this.g;
            x2.d dVar = bVar.f4004c;
            float f3 = bVar.g;
            float f10 = bVar.f4007f;
            if (Float.isNaN(f3) || Float.isNaN(f10)) {
                float b10 = z.a(c.f4008a, bVar.f4006e, x2.b.b(0, 0, 15), dVar, bVar.f4005d, 1).b();
                f10 = z.a(c.f4009b, bVar.f4006e, x2.b.b(0, 0, 15), dVar, bVar.f4005d, 2).b() - b10;
                bVar.g = b10;
                bVar.f4007f = f10;
                f3 = b10;
            }
            if (i10 != 1) {
                int round = Math.round((f10 * (i10 - 1)) + f3);
                i3 = round >= 0 ? round : 0;
                int g = x2.a.g(j);
                if (i3 > g) {
                    i3 = g;
                }
            } else {
                i3 = x2.a.i(j);
            }
            j3 = x2.b.a(x2.a.j(j), x2.a.h(j), i3, x2.a.g(j));
        } else {
            j3 = j;
        }
        m2.a aVar = this.j;
        boolean z11 = false;
        if (aVar != null && (oVar = this.f4021n) != null && !oVar.b() && lVar == this.f4022o && (x2.a.b(j3, this.f4023p) || (x2.a.h(j3) == x2.a.h(this.f4023p) && x2.a.j(j3) == x2.a.j(this.f4023p) && x2.a.g(j3) >= aVar.b() && !aVar.f6419d.f7010d))) {
            if (!x2.a.b(j3, this.f4023p)) {
                m2.a aVar2 = this.j;
                aVar2.getClass();
                this.f4019l = x2.b.d(j3, (c6.f.k(Math.min(aVar2.f6416a.f9234w.c(), aVar2.c())) << 32) | (c6.f.k(aVar2.b()) & 4294967295L));
                if (this.f4013d == 3 || (((int) (r12 >> 32)) >= aVar2.c() && ((int) (4294967295L & r12)) >= aVar2.b())) {
                    z10 = false;
                }
                this.f4018k = z10;
                this.f4023p = j3;
            }
            return false;
        }
        o oVar2 = this.f4021n;
        if (oVar2 == null || lVar != this.f4022o || oVar2.b()) {
            this.f4022o = lVar;
            String str = this.f4010a;
            h0 e2 = z.e(this.f4011b, lVar);
            j0 j0Var = j0.f5574d;
            x2.c cVar2 = this.f4017i;
            cVar2.getClass();
            oVar2 = new t2.c(str, e2, j0Var, j0Var, this.f4012c, cVar2);
        }
        this.f4021n = oVar2;
        boolean z12 = this.f4014e;
        int i11 = this.f4013d;
        float h10 = oVar2.h();
        int h11 = ((z12 || i11 == 2 || i11 == 4 || i11 == 5) && x2.a.d(j3)) ? x2.a.h(j3) : Integer.MAX_VALUE;
        if (x2.a.j(j3) != h11) {
            h11 = be.f.c(c6.f.k(h10), x2.a.j(j3), h11);
        }
        long r9 = k7.e.r(0, h11, 0, x2.a.g(j3));
        boolean z13 = this.f4014e;
        int i12 = this.f4013d;
        int i13 = this.f4015f;
        m2.a aVar3 = new m2.a((t2.c) oVar2, ((z13 || !(i12 == 2 || i12 == 4 || i12 == 5)) && i13 >= 1) ? i13 : 1, i12, r9);
        this.f4023p = j3;
        this.f4019l = x2.b.d(j3, (c6.f.k(aVar3.b()) & 4294967295L) | (c6.f.k(aVar3.c()) << 32));
        if (this.f4013d != 3 && (((int) (r1 >> 32)) < aVar3.c() || ((int) (r1 & 4294967295L)) < aVar3.b())) {
            z11 = true;
        }
        this.f4018k = z11;
        this.j = aVar3;
        return true;
    }

    public final void b() {
        this.j = null;
        this.f4021n = null;
        this.f4022o = null;
        this.f4023p = x2.b.g(0, 0, 0, 0);
        long j = 0;
        this.f4019l = (j & 4294967295L) | (j << 32);
        this.f4018k = false;
    }

    public final void c(x2.c cVar) {
        long j;
        x2.c cVar2 = this.f4017i;
        if (cVar != null) {
            int i3 = a.f4000b;
            j = a.a(cVar.g(), cVar.d());
        } else {
            j = a.f3999a;
        }
        if (cVar2 == null) {
            this.f4017i = cVar;
            this.f4016h = j;
        } else if (cVar == null || this.f4016h != j) {
            this.f4017i = cVar;
            this.f4016h = j;
            this.f4024q = (this.f4024q << 2) | 1;
            b();
        }
    }

    public final void d(String str, h0 h0Var, p2.h hVar, int i3, boolean z10, int i10, int i11) {
        this.f4010a = str;
        this.f4011b = h0Var;
        this.f4012c = hVar;
        this.f4013d = i3;
        this.f4014e = z10;
        this.f4015f = i10;
        this.g = i11;
        this.f4024q = (this.f4024q << 2) | 2;
        b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f4016h));
        sb2.append(", history=");
        sb2.append(this.f4024q);
        sb2.append(", constraints=$)");
        return sb2.toString();
    }
}
