package com.anythink.basead.exoplayer;

import android.util.Log;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
final class q {

    /* renamed from: l, reason: collision with root package name */
    private static final String f8844l = "MediaPeriodHolder";

    /* renamed from: a, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.h.r f8845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8846b;

    /* renamed from: c, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.h.y[] f8847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f8848d;

    /* renamed from: e, reason: collision with root package name */
    public long f8849e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8850f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8851g;

    /* renamed from: h, reason: collision with root package name */
    public r f8852h;
    public q i;

    /* renamed from: j, reason: collision with root package name */
    public af f8853j;

    /* renamed from: k, reason: collision with root package name */
    public com.anythink.basead.exoplayer.i.i f8854k;

    /* renamed from: m, reason: collision with root package name */
    private final z[] f8855m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.i.h f8856n;

    /* renamed from: o, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.h.s f8857o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.basead.exoplayer.i.i f8858p;

    public q(z[] zVarArr, long j9, com.anythink.basead.exoplayer.i.h hVar, com.anythink.basead.exoplayer.j.b bVar, com.anythink.basead.exoplayer.h.s sVar, Object obj, r rVar) {
        this.f8855m = zVarArr;
        this.f8849e = j9 - rVar.f8860b;
        this.f8856n = hVar;
        this.f8857o = sVar;
        this.f8846b = C0544a.a(obj);
        this.f8852h = rVar;
        this.f8847c = new com.anythink.basead.exoplayer.h.y[zVarArr.length];
        this.f8848d = new boolean[zVarArr.length];
        com.anythink.basead.exoplayer.h.r a9 = sVar.a(rVar.f8859a, bVar);
        long j10 = rVar.f8861c;
        this.f8845a = j10 != Long.MIN_VALUE ? new com.anythink.basead.exoplayer.h.d(a9, true, 0L, j10) : a9;
    }

    private long d() {
        return this.f8849e;
    }

    private long e() {
        return this.f8852h.f8863e;
    }

    public final boolean a() {
        if (this.f8850f) {
            return !this.f8851g || this.f8845a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final long b() {
        if (this.f8850f) {
            return this.f8845a.e();
        }
        return 0L;
    }

    public final void c() {
        a((com.anythink.basead.exoplayer.i.i) null);
        try {
            if (this.f8852h.f8861c != Long.MIN_VALUE) {
                this.f8857o.a(((com.anythink.basead.exoplayer.h.d) this.f8845a).f7750a);
            } else {
                this.f8857o.a(this.f8845a);
            }
        } catch (RuntimeException e6) {
            Log.e(f8844l, "Period release failed.", e6);
        }
    }

    private void b(float f6) {
        this.f8850f = true;
        this.f8853j = this.f8845a.b();
        a(f6);
        long b9 = b(this.f8852h.f8860b);
        long j9 = this.f8849e;
        r rVar = this.f8852h;
        this.f8849e = (rVar.f8860b - b9) + j9;
        this.f8852h = new r(rVar.f8859a, b9, rVar.f8861c, rVar.f8862d, rVar.f8863e, rVar.f8864f, rVar.f8865g);
    }

    private long d(long j9) {
        return j9 - this.f8849e;
    }

    private void e(long j9) {
        if (this.f8850f) {
            this.f8845a.a_(j9 - this.f8849e);
        }
    }

    public final long a(boolean z8) {
        if (!this.f8850f) {
            return this.f8852h.f8860b;
        }
        long d2 = this.f8845a.d();
        return (d2 == Long.MIN_VALUE && z8) ? this.f8852h.f8863e : d2;
    }

    private static void c(com.anythink.basead.exoplayer.i.i iVar) {
        for (int i = 0; i < iVar.f8138a; i++) {
            iVar.a(i);
            iVar.f8140c.a(i);
        }
    }

    public final boolean a(float f6) {
        com.anythink.basead.exoplayer.i.i a9 = this.f8856n.a(this.f8855m, this.f8853j);
        if (a9.a(this.f8858p)) {
            return false;
        }
        this.f8854k = a9;
        for (com.anythink.basead.exoplayer.i.f fVar : a9.f8140c.a()) {
            if (fVar != null) {
                fVar.a(f6);
            }
        }
        return true;
    }

    private long c(long j9) {
        return j9 + this.f8849e;
    }

    public final long b(long j9) {
        return a(j9, false, new boolean[this.f8855m.length]);
    }

    private static void b(com.anythink.basead.exoplayer.i.i iVar) {
        for (int i = 0; i < iVar.f8138a; i++) {
            boolean a9 = iVar.a(i);
            com.anythink.basead.exoplayer.i.f a10 = iVar.f8140c.a(i);
            if (a9 && a10 != null) {
                a10.a();
            }
        }
    }

    public final long a(long j9, boolean z8, boolean[] zArr) {
        int i = 0;
        while (true) {
            com.anythink.basead.exoplayer.i.i iVar = this.f8854k;
            boolean z9 = true;
            if (i >= iVar.f8138a) {
                break;
            }
            boolean[] zArr2 = this.f8848d;
            if (z8 || !iVar.a(this.f8858p, i)) {
                z9 = false;
            }
            zArr2[i] = z9;
            i++;
        }
        a(this.f8847c);
        a(this.f8854k);
        com.anythink.basead.exoplayer.i.g gVar = this.f8854k.f8140c;
        long a9 = this.f8845a.a(gVar.a(), this.f8848d, this.f8847c, zArr, j9);
        b(this.f8847c);
        this.f8851g = false;
        int i4 = 0;
        while (true) {
            com.anythink.basead.exoplayer.h.y[] yVarArr = this.f8847c;
            if (i4 >= yVarArr.length) {
                return a9;
            }
            if (yVarArr[i4] != null) {
                C0544a.b(this.f8854k.a(i4));
                if (this.f8855m[i4].a() != 5) {
                    this.f8851g = true;
                }
            } else {
                C0544a.b(gVar.a(i4) == null);
            }
            i4++;
        }
    }

    private void b(com.anythink.basead.exoplayer.h.y[] yVarArr) {
        int i = 0;
        while (true) {
            z[] zVarArr = this.f8855m;
            if (i >= zVarArr.length) {
                return;
            }
            if (zVarArr[i].a() == 5 && this.f8854k.a(i)) {
                yVarArr[i] = new com.anythink.basead.exoplayer.h.m();
            }
            i++;
        }
    }

    private void a(com.anythink.basead.exoplayer.i.i iVar) {
        com.anythink.basead.exoplayer.i.i iVar2 = this.f8858p;
        if (iVar2 != null) {
            c(iVar2);
        }
        this.f8858p = iVar;
        if (iVar != null) {
            b(iVar);
        }
    }

    private void a(com.anythink.basead.exoplayer.h.y[] yVarArr) {
        int i = 0;
        while (true) {
            z[] zVarArr = this.f8855m;
            if (i >= zVarArr.length) {
                return;
            }
            if (zVarArr[i].a() == 5) {
                yVarArr[i] = null;
            }
            i++;
        }
    }

    public final void a(long j9) {
        this.f8845a.c(j9 - this.f8849e);
    }
}
