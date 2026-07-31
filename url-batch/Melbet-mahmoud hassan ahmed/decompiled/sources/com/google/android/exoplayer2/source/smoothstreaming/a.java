package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import b2.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import e1.o;
import e1.p;
import java.io.IOException;
import java.util.List;
import m2.b0;
import m2.t;
import n2.g0;
import n2.i0;
import n2.l;
import n2.p0;
import r0.j3;
import r0.s1;
import v1.e;
import v1.f;
import v1.g;
import v1.h;
import v1.k;
import v1.n;

/* loaded from: classes.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f2380a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2381b;

    /* renamed from: c, reason: collision with root package name */
    private final g[] f2382c;

    /* renamed from: d, reason: collision with root package name */
    private final l f2383d;

    /* renamed from: e, reason: collision with root package name */
    private t f2384e;

    /* renamed from: f, reason: collision with root package name */
    private b2.a f2385f;

    /* renamed from: g, reason: collision with root package name */
    private int f2386g;

    /* renamed from: h, reason: collision with root package name */
    private IOException f2387h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0046a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final l.a f2388a;

        public C0046a(l.a aVar) {
            this.f2388a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(i0 i0Var, b2.a aVar, int i7, t tVar, p0 p0Var) {
            l a7 = this.f2388a.a();
            if (p0Var != null) {
                a7.d(p0Var);
            }
            return new a(i0Var, aVar, i7, tVar, a7);
        }
    }

    private static final class b extends v1.b {

        /* renamed from: e, reason: collision with root package name */
        private final a.b f2389e;

        /* renamed from: f, reason: collision with root package name */
        private final int f2390f;

        public b(a.b bVar, int i7, int i8) {
            super(i8, bVar.f1650k - 1);
            this.f2389e = bVar;
            this.f2390f = i7;
        }

        @Override // v1.o
        public long a() {
            return b() + this.f2389e.c((int) d());
        }

        @Override // v1.o
        public long b() {
            c();
            return this.f2389e.e((int) d());
        }
    }

    public a(i0 i0Var, b2.a aVar, int i7, t tVar, l lVar) {
        this.f2380a = i0Var;
        this.f2385f = aVar;
        this.f2381b = i7;
        this.f2384e = tVar;
        this.f2383d = lVar;
        a.b bVar = aVar.f1634f[i7];
        this.f2382c = new g[tVar.length()];
        int i8 = 0;
        while (i8 < this.f2382c.length) {
            int b7 = tVar.b(i8);
            s1 s1Var = bVar.f1649j[b7];
            p[] pVarArr = s1Var.f20959t != null ? ((a.C0037a) o2.a.e(aVar.f1633e)).f1639c : null;
            int i9 = bVar.f1640a;
            int i10 = i8;
            this.f2382c[i10] = new e(new e1.g(3, null, new o(b7, i9, bVar.f1642c, -9223372036854775807L, aVar.f1635g, s1Var, 0, pVarArr, i9 == 2 ? 4 : 0, null, null)), bVar.f1640a, s1Var);
            i8 = i10 + 1;
        }
    }

    private static n l(s1 s1Var, l lVar, Uri uri, int i7, long j7, long j8, long j9, int i8, Object obj, g gVar) {
        return new k(lVar, new n2.p(uri), s1Var, i8, obj, j7, j8, j9, -9223372036854775807L, i7, 1, j7, gVar);
    }

    private long m(long j7) {
        b2.a aVar = this.f2385f;
        if (!aVar.f1632d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f1634f[this.f2381b];
        int i7 = bVar.f1650k - 1;
        return (bVar.e(i7) + bVar.c(i7)) - j7;
    }

    @Override // v1.j
    public void a() {
        for (g gVar : this.f2382c) {
            gVar.a();
        }
    }

    @Override // v1.j
    public void b() {
        IOException iOException = this.f2387h;
        if (iOException != null) {
            throw iOException;
        }
        this.f2380a.b();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(t tVar) {
        this.f2384e = tVar;
    }

    @Override // v1.j
    public void d(f fVar) {
    }

    @Override // v1.j
    public boolean e(long j7, f fVar, List<? extends n> list) {
        if (this.f2387h != null) {
            return false;
        }
        return this.f2384e.n(j7, fVar, list);
    }

    @Override // v1.j
    public long f(long j7, j3 j3Var) {
        a.b bVar = this.f2385f.f1634f[this.f2381b];
        int d7 = bVar.d(j7);
        long e7 = bVar.e(d7);
        return j3Var.a(j7, e7, (e7 >= j7 || d7 >= bVar.f1650k + (-1)) ? e7 : bVar.e(d7 + 1));
    }

    @Override // v1.j
    public int g(long j7, List<? extends n> list) {
        return (this.f2387h != null || this.f2384e.length() < 2) ? list.size() : this.f2384e.l(j7, list);
    }

    @Override // v1.j
    public final void h(long j7, long j8, List<? extends n> list, h hVar) {
        int g7;
        long j9 = j8;
        if (this.f2387h != null) {
            return;
        }
        a.b bVar = this.f2385f.f1634f[this.f2381b];
        if (bVar.f1650k == 0) {
            hVar.f22757b = !r4.f1632d;
            return;
        }
        if (list.isEmpty()) {
            g7 = bVar.d(j9);
        } else {
            g7 = (int) (list.get(list.size() - 1).g() - this.f2386g);
            if (g7 < 0) {
                this.f2387h = new t1.b();
                return;
            }
        }
        if (g7 >= bVar.f1650k) {
            hVar.f22757b = !this.f2385f.f1632d;
            return;
        }
        long j10 = j9 - j7;
        long m7 = m(j7);
        int length = this.f2384e.length();
        v1.o[] oVarArr = new v1.o[length];
        for (int i7 = 0; i7 < length; i7++) {
            oVarArr[i7] = new b(bVar, this.f2384e.b(i7), g7);
        }
        this.f2384e.m(j7, j10, m7, list, oVarArr);
        long e7 = bVar.e(g7);
        long c7 = e7 + bVar.c(g7);
        if (!list.isEmpty()) {
            j9 = -9223372036854775807L;
        }
        long j11 = j9;
        int i8 = g7 + this.f2386g;
        int r7 = this.f2384e.r();
        hVar.f22756a = l(this.f2384e.p(), this.f2383d, bVar.a(this.f2384e.b(r7), g7), i8, e7, c7, j11, this.f2384e.q(), this.f2384e.t(), this.f2382c[r7]);
    }

    @Override // v1.j
    public boolean i(f fVar, boolean z6, g0.c cVar, g0 g0Var) {
        g0.b b7 = g0Var.b(b0.c(this.f2384e), cVar);
        if (z6 && b7 != null && b7.f19422a == 2) {
            t tVar = this.f2384e;
            if (tVar.h(tVar.d(fVar.f22750d), b7.f19423b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void j(b2.a aVar) {
        a.b[] bVarArr = this.f2385f.f1634f;
        int i7 = this.f2381b;
        a.b bVar = bVarArr[i7];
        int i8 = bVar.f1650k;
        a.b bVar2 = aVar.f1634f[i7];
        if (i8 != 0 && bVar2.f1650k != 0) {
            int i9 = i8 - 1;
            long e7 = bVar.e(i9) + bVar.c(i9);
            long e8 = bVar2.e(0);
            if (e7 > e8) {
                this.f2386g += bVar.d(e8);
                this.f2385f = aVar;
            }
        }
        this.f2386g += i8;
        this.f2385f = aVar;
    }
}
