package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class qi implements ch, jh {

    /* renamed from: p, reason: collision with root package name */
    public static final eh f10688p = new oi();

    /* renamed from: q, reason: collision with root package name */
    private static final int f10689q = zm.g("qt  ");

    /* renamed from: e, reason: collision with root package name */
    private int f10694e;

    /* renamed from: f, reason: collision with root package name */
    private int f10695f;

    /* renamed from: g, reason: collision with root package name */
    private long f10696g;

    /* renamed from: h, reason: collision with root package name */
    private int f10697h;

    /* renamed from: i, reason: collision with root package name */
    private rm f10698i;

    /* renamed from: j, reason: collision with root package name */
    private int f10699j;

    /* renamed from: k, reason: collision with root package name */
    private int f10700k;

    /* renamed from: l, reason: collision with root package name */
    private dh f10701l;

    /* renamed from: m, reason: collision with root package name */
    private pi[] f10702m;

    /* renamed from: n, reason: collision with root package name */
    private long f10703n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10704o;

    /* renamed from: c, reason: collision with root package name */
    private final rm f10692c = new rm(16);

    /* renamed from: d, reason: collision with root package name */
    private final Stack<yh> f10693d = new Stack<>();

    /* renamed from: a, reason: collision with root package name */
    private final rm f10690a = new rm(pm.f10272a);

    /* renamed from: b, reason: collision with root package name */
    private final rm f10691b = new rm(4);

    private final void g() {
        this.f10694e = 0;
        this.f10697h = 0;
    }

    private final void h(long j7) {
        mj mjVar;
        gh ghVar;
        mj mjVar2;
        si a7;
        while (!this.f10693d.isEmpty() && this.f10693d.peek().P0 == j7) {
            yh pop = this.f10693d.pop();
            if (pop.f2825a == ai.C) {
                ArrayList arrayList = new ArrayList();
                gh ghVar2 = new gh();
                zh e7 = pop.e(ai.A0);
                if (e7 != null) {
                    mjVar = hi.c(e7, this.f10704o);
                    if (mjVar != null) {
                        ghVar2.b(mjVar);
                    }
                } else {
                    mjVar = null;
                }
                long j8 = -9223372036854775807L;
                long j9 = Long.MAX_VALUE;
                int i7 = 0;
                while (i7 < pop.R0.size()) {
                    yh yhVar = pop.R0.get(i7);
                    if (yhVar.f2825a == ai.E && (a7 = hi.a(yhVar, pop.e(ai.D), -9223372036854775807L, null, this.f10704o)) != null) {
                        wi b7 = hi.b(a7, yhVar.d(ai.F).d(ai.G).d(ai.H), ghVar2);
                        if (b7.f13828a != 0) {
                            pi piVar = new pi(a7, b7, this.f10701l.c(i7, a7.f11829b));
                            xe i8 = a7.f11833f.i(b7.f13831d + 30);
                            if (a7.f11829b == 1) {
                                if (ghVar2.a()) {
                                    i8 = i8.h(ghVar2.f5644a, ghVar2.f5645b);
                                }
                                if (mjVar != null) {
                                    i8 = i8.j(mjVar);
                                }
                            }
                            piVar.f10240c.b(i8);
                            ghVar = ghVar2;
                            mjVar2 = mjVar;
                            long max = Math.max(j8, a7.f11832e);
                            arrayList.add(piVar);
                            long j10 = b7.f13829b[0];
                            if (j10 < j9) {
                                j8 = max;
                                j9 = j10;
                            } else {
                                j8 = max;
                            }
                            i7++;
                            ghVar2 = ghVar;
                            mjVar = mjVar2;
                        }
                    }
                    ghVar = ghVar2;
                    mjVar2 = mjVar;
                    i7++;
                    ghVar2 = ghVar;
                    mjVar = mjVar2;
                }
                this.f10703n = j8;
                this.f10702m = (pi[]) arrayList.toArray(new pi[arrayList.size()]);
                this.f10701l.a();
                this.f10701l.b(this);
                this.f10693d.clear();
                this.f10694e = 2;
            } else if (!this.f10693d.isEmpty()) {
                this.f10693d.peek().f(pop);
            }
        }
        if (this.f10694e != 2) {
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.jh
    public final long a(long j7) {
        long j8 = Long.MAX_VALUE;
        for (pi piVar : this.f10702m) {
            wi wiVar = piVar.f10239b;
            int a7 = wiVar.a(j7);
            if (a7 == -1) {
                a7 = wiVar.b(j7);
            }
            long j9 = wiVar.f13829b[a7];
            if (j9 < j8) {
                j8 = j9;
            }
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void b(long j7, long j8) {
        this.f10693d.clear();
        this.f10697h = 0;
        this.f10699j = 0;
        this.f10700k = 0;
        if (j7 == 0) {
            g();
            return;
        }
        pi[] piVarArr = this.f10702m;
        if (piVarArr != null) {
            for (pi piVar : piVarArr) {
                wi wiVar = piVar.f10239b;
                int a7 = wiVar.a(j8);
                if (a7 == -1) {
                    a7 = wiVar.b(j8);
                }
                piVar.f10241d = a7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jh
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final boolean d(bh bhVar) {
        return ri.b(bhVar);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final int e(bh bhVar, hh hhVar) {
        pi[] piVarArr;
        boolean z6;
        boolean z7;
        while (true) {
            int i7 = this.f10694e;
            if (i7 == 0) {
                if (this.f10697h == 0) {
                    if (!bhVar.h(this.f10692c.f11225a, 0, 8, true)) {
                        return -1;
                    }
                    this.f10697h = 8;
                    this.f10692c.v(0);
                    this.f10696g = this.f10692c.m();
                    this.f10695f = this.f10692c.e();
                }
                if (this.f10696g == 1) {
                    bhVar.h(this.f10692c.f11225a, 8, 8, false);
                    this.f10697h += 8;
                    this.f10696g = this.f10692c.n();
                }
                int i8 = this.f10695f;
                if (i8 == ai.C || i8 == ai.E || i8 == ai.F || i8 == ai.G || i8 == ai.H || i8 == ai.Q) {
                    long d7 = (bhVar.d() + this.f10696g) - this.f10697h;
                    this.f10693d.add(new yh(this.f10695f, d7));
                    if (this.f10696g == this.f10697h) {
                        h(d7);
                    } else {
                        g();
                    }
                } else {
                    if (i8 == ai.S || i8 == ai.D || i8 == ai.T || i8 == ai.U || i8 == ai.f2798m0 || i8 == ai.f2800n0 || i8 == ai.f2802o0 || i8 == ai.R || i8 == ai.f2804p0 || i8 == ai.f2806q0 || i8 == ai.f2808r0 || i8 == ai.f2810s0 || i8 == ai.f2812t0 || i8 == ai.P || i8 == ai.f2775b || i8 == ai.A0) {
                        jm.e(this.f10697h == 8);
                        jm.e(this.f10696g <= 2147483647L);
                        rm rmVar = new rm((int) this.f10696g);
                        this.f10698i = rmVar;
                        System.arraycopy(this.f10692c.f11225a, 0, rmVar.f11225a, 0, 8);
                    } else {
                        this.f10698i = null;
                    }
                    this.f10694e = 1;
                }
            } else {
                if (i7 != 1) {
                    long j7 = Long.MAX_VALUE;
                    int i9 = 0;
                    int i10 = -1;
                    while (true) {
                        piVarArr = this.f10702m;
                        if (i9 >= piVarArr.length) {
                            break;
                        }
                        pi piVar = piVarArr[i9];
                        int i11 = piVar.f10241d;
                        wi wiVar = piVar.f10239b;
                        if (i11 != wiVar.f13828a) {
                            long j8 = wiVar.f13829b[i11];
                            if (j8 < j7) {
                                i10 = i9;
                                j7 = j8;
                            }
                        }
                        i9++;
                    }
                    if (i10 == -1) {
                        return -1;
                    }
                    pi piVar2 = piVarArr[i10];
                    lh lhVar = piVar2.f10240c;
                    int i12 = piVar2.f10241d;
                    wi wiVar2 = piVar2.f10239b;
                    long j9 = wiVar2.f13829b[i12];
                    int i13 = wiVar2.f13830c[i12];
                    if (piVar2.f10238a.f11834g == 1) {
                        j9 += 8;
                        i13 -= 8;
                    }
                    long d8 = (j9 - bhVar.d()) + this.f10699j;
                    if (d8 < 0 || d8 >= 262144) {
                        hhVar.f6243a = j9;
                        return 1;
                    }
                    int i14 = (int) d8;
                    boolean z8 = false;
                    bhVar.i(i14, false);
                    int i15 = piVar2.f10238a.f11838k;
                    if (i15 == 0) {
                        while (true) {
                            int i16 = this.f10699j;
                            if (i16 >= i13) {
                                break;
                            }
                            int d9 = lhVar.d(bhVar, i13 - i16, false);
                            this.f10699j += d9;
                            this.f10700k -= d9;
                        }
                    } else {
                        byte[] bArr = this.f10691b.f11225a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i17 = 4 - i15;
                        while (this.f10699j < i13) {
                            int i18 = this.f10700k;
                            if (i18 == 0) {
                                bhVar.h(this.f10691b.f11225a, i17, i15, z8);
                                this.f10691b.v(z8 ? 1 : 0);
                                this.f10700k = this.f10691b.i();
                                this.f10690a.v(z8 ? 1 : 0);
                                lhVar.c(this.f10690a, 4);
                                this.f10699j += 4;
                                i13 += i17;
                            } else {
                                int d10 = lhVar.d(bhVar, i18, z8);
                                this.f10699j += d10;
                                this.f10700k -= d10;
                                z8 = false;
                            }
                        }
                    }
                    int i19 = i13;
                    wi wiVar3 = piVar2.f10239b;
                    lhVar.a(wiVar3.f13832e[i12], wiVar3.f13833f[i12], i19, 0, null);
                    piVar2.f10241d++;
                    this.f10699j = 0;
                    this.f10700k = 0;
                    return 0;
                }
                long j10 = this.f10696g - this.f10697h;
                long d11 = bhVar.d() + j10;
                rm rmVar2 = this.f10698i;
                if (rmVar2 != null) {
                    bhVar.h(rmVar2.f11225a, this.f10697h, (int) j10, false);
                    if (this.f10695f == ai.f2775b) {
                        rm rmVar3 = this.f10698i;
                        rmVar3.v(8);
                        if (rmVar3.e() != f10689q) {
                            rmVar3.w(4);
                            while (rmVar3.a() > 0) {
                                if (rmVar3.e() == f10689q) {
                                }
                            }
                            z7 = false;
                            this.f10704o = z7;
                        }
                        z7 = true;
                        this.f10704o = z7;
                    } else if (!this.f10693d.isEmpty()) {
                        this.f10693d.peek().g(new zh(this.f10695f, this.f10698i));
                    }
                } else if (j10 < 262144) {
                    bhVar.i((int) j10, false);
                } else {
                    hhVar.f6243a = bhVar.d() + j10;
                    z6 = true;
                    h(d11);
                    if (z6 && this.f10694e != 2) {
                        return 1;
                    }
                }
                z6 = false;
                h(d11);
                if (z6) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void f(dh dhVar) {
        this.f10701l = dhVar;
    }

    @Override // com.google.android.gms.internal.ads.jh
    public final long zza() {
        return this.f10703n;
    }
}
