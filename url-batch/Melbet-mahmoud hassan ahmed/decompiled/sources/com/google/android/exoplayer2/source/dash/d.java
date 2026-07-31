package com.google.android.exoplayer2.source.dash;

import o2.m0;
import r0.s1;
import r0.t1;
import t1.q0;
import u0.g;
import x1.f;

/* loaded from: classes.dex */
final class d implements q0 {

    /* renamed from: f, reason: collision with root package name */
    private final s1 f2306f;

    /* renamed from: h, reason: collision with root package name */
    private long[] f2308h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2309i;

    /* renamed from: j, reason: collision with root package name */
    private f f2310j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2311k;

    /* renamed from: l, reason: collision with root package name */
    private int f2312l;

    /* renamed from: g, reason: collision with root package name */
    private final l1.c f2307g = new l1.c();

    /* renamed from: m, reason: collision with root package name */
    private long f2313m = -9223372036854775807L;

    public d(f fVar, s1 s1Var, boolean z6) {
        this.f2306f = s1Var;
        this.f2310j = fVar;
        this.f2308h = fVar.f23122b;
        e(fVar, z6);
    }

    public String a() {
        return this.f2310j.a();
    }

    @Override // t1.q0
    public void b() {
    }

    public void c(long j7) {
        int e7 = m0.e(this.f2308h, j7, true, false);
        this.f2312l = e7;
        if (!(this.f2309i && e7 == this.f2308h.length)) {
            j7 = -9223372036854775807L;
        }
        this.f2313m = j7;
    }

    @Override // t1.q0
    public int d(long j7) {
        int max = Math.max(this.f2312l, m0.e(this.f2308h, j7, true, false));
        int i7 = max - this.f2312l;
        this.f2312l = max;
        return i7;
    }

    public void e(f fVar, boolean z6) {
        int i7 = this.f2312l;
        long j7 = i7 == 0 ? -9223372036854775807L : this.f2308h[i7 - 1];
        this.f2309i = z6;
        this.f2310j = fVar;
        long[] jArr = fVar.f23122b;
        this.f2308h = jArr;
        long j8 = this.f2313m;
        if (j8 != -9223372036854775807L) {
            c(j8);
        } else if (j7 != -9223372036854775807L) {
            this.f2312l = m0.e(jArr, j7, false, false);
        }
    }

    @Override // t1.q0
    public boolean i() {
        return true;
    }

    @Override // t1.q0
    public int j(t1 t1Var, g gVar, int i7) {
        int i8 = this.f2312l;
        boolean z6 = i8 == this.f2308h.length;
        if (z6 && !this.f2309i) {
            gVar.p(4);
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f2311k) {
            t1Var.f21040b = this.f2306f;
            this.f2311k = true;
            return -5;
        }
        if (z6) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f2312l = i8 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] a7 = this.f2307g.a(this.f2310j.f23121a[i8]);
            gVar.r(a7.length);
            gVar.f22411h.put(a7);
        }
        gVar.f22413j = this.f2308h[i8];
        gVar.p(1);
        return -4;
    }
}
