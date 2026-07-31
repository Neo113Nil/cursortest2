package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C1790a;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class mq0 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final String f29204a;

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f29205b;

    /* renamed from: c, reason: collision with root package name */
    private final rf1 f29206c;

    /* renamed from: d, reason: collision with root package name */
    private p52 f29207d;

    /* renamed from: e, reason: collision with root package name */
    private String f29208e;

    /* renamed from: f, reason: collision with root package name */
    private yb0 f29209f;

    /* renamed from: g, reason: collision with root package name */
    private int f29210g;

    /* renamed from: h, reason: collision with root package name */
    private int f29211h;

    /* renamed from: i, reason: collision with root package name */
    private int f29212i;

    /* renamed from: j, reason: collision with root package name */
    private int f29213j;

    /* renamed from: k, reason: collision with root package name */
    private long f29214k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29215l;

    /* renamed from: m, reason: collision with root package name */
    private int f29216m;

    /* renamed from: n, reason: collision with root package name */
    private int f29217n;

    /* renamed from: o, reason: collision with root package name */
    private int f29218o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f29219p;

    /* renamed from: q, reason: collision with root package name */
    private long f29220q;

    /* renamed from: r, reason: collision with root package name */
    private int f29221r;

    /* renamed from: s, reason: collision with root package name */
    private long f29222s;

    /* renamed from: t, reason: collision with root package name */
    private int f29223t;

    /* renamed from: u, reason: collision with root package name */
    private String f29224u;

    public mq0(String str) {
        this.f29204a = str;
        sf1 sf1Var = new sf1(1024);
        this.f29205b = sf1Var;
        this.f29206c = new rf1(sf1Var.c());
        this.f29214k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x019c, code lost:
    
        if (r17.f29215l == false) goto L89;
     */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        int i4;
        boolean f4;
        if (this.f29207d == null) {
            throw new IllegalStateException();
        }
        while (sf1Var.a() > 0) {
            int i5 = this.f29210g;
            if (i5 != 0) {
                if (i5 == 1) {
                    int t4 = sf1Var.t();
                    if ((t4 & 224) == 224) {
                        this.f29213j = t4;
                        this.f29210g = 2;
                    } else if (t4 != 86) {
                        this.f29210g = 0;
                    }
                } else if (i5 == 2) {
                    int t5 = ((this.f29213j & (-225)) << 8) | sf1Var.t();
                    this.f29212i = t5;
                    if (t5 > this.f29205b.c().length) {
                        this.f29205b.c(this.f29212i);
                        rf1 rf1Var = this.f29206c;
                        byte[] c4 = this.f29205b.c();
                        rf1Var.getClass();
                        rf1Var.a(c4.length, c4);
                    }
                    this.f29211h = 0;
                    this.f29210g = 3;
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(sf1Var.a(), this.f29212i - this.f29211h);
                    sf1Var.a(this.f29206c.f31172a, this.f29211h, min);
                    int i6 = this.f29211h + min;
                    this.f29211h = i6;
                    if (i6 == this.f29212i) {
                        this.f29206c.c(0);
                        rf1 rf1Var2 = this.f29206c;
                        if (!rf1Var2.f()) {
                            this.f29215l = true;
                            int b4 = rf1Var2.b(1);
                            int b5 = b4 == 1 ? rf1Var2.b(1) : 0;
                            this.f29216m = b5;
                            if (b5 != 0) {
                                throw wf1.a((String) null, (Exception) null);
                            }
                            if (b4 == 1) {
                                rf1Var2.b((rf1Var2.b(2) + 1) * 8);
                            }
                            if (!rf1Var2.f()) {
                                throw wf1.a((String) null, (Exception) null);
                            }
                            this.f29217n = rf1Var2.b(6);
                            int b6 = rf1Var2.b(4);
                            int b7 = rf1Var2.b(3);
                            if (b6 != 0 || b7 != 0) {
                                throw wf1.a((String) null, (Exception) null);
                            }
                            if (b4 == 0) {
                                int e4 = rf1Var2.e();
                                int b8 = rf1Var2.b();
                                C1790a.C0181a a4 = C1790a.a(rf1Var2, true);
                                this.f29224u = a4.f23104c;
                                this.f29221r = a4.f23102a;
                                this.f29223t = a4.f23103b;
                                int b9 = b8 - rf1Var2.b();
                                rf1Var2.c(e4);
                                byte[] bArr = new byte[(b9 + 7) / 8];
                                rf1Var2.a(bArr, b9);
                                yb0 a5 = new yb0.a().b(this.f29208e).e("audio/mp4a-latm").a(this.f29224u).c(this.f29223t).l(this.f29221r).a(Collections.singletonList(bArr)).d(this.f29204a).a();
                                if (!a5.equals(this.f29209f)) {
                                    this.f29209f = a5;
                                    this.f29222s = 1024000000 / a5.f34973A;
                                    this.f29207d.a(a5);
                                }
                            } else {
                                int b10 = rf1Var2.b();
                                C1790a.C0181a a6 = C1790a.a(rf1Var2, true);
                                this.f29224u = a6.f23104c;
                                this.f29221r = a6.f23102a;
                                this.f29223t = a6.f23103b;
                                rf1Var2.d(rf1Var2.b((rf1Var2.b(2) + 1) * 8) - (b10 - rf1Var2.b()));
                            }
                            int b11 = rf1Var2.b(3);
                            this.f29218o = b11;
                            if (b11 == 0) {
                                rf1Var2.d(8);
                            } else if (b11 == 1) {
                                rf1Var2.d(9);
                            } else if (b11 == 3 || b11 == 4 || b11 == 5) {
                                rf1Var2.d(6);
                            } else {
                                if (b11 != 6 && b11 != 7) {
                                    throw new IllegalStateException();
                                }
                                rf1Var2.d(1);
                            }
                            boolean f5 = rf1Var2.f();
                            this.f29219p = f5;
                            this.f29220q = 0L;
                            if (f5) {
                                if (b4 == 1) {
                                    this.f29220q = rf1Var2.b((rf1Var2.b(2) + 1) * 8);
                                } else {
                                    do {
                                        f4 = rf1Var2.f();
                                        this.f29220q = (this.f29220q << 8) + rf1Var2.b(8);
                                    } while (f4);
                                }
                            }
                            if (rf1Var2.f()) {
                                rf1Var2.d(8);
                            }
                        }
                        if (this.f29216m != 0) {
                            throw wf1.a((String) null, (Exception) null);
                        }
                        if (this.f29217n != 0) {
                            throw wf1.a((String) null, (Exception) null);
                        }
                        if (this.f29218o != 0) {
                            throw wf1.a((String) null, (Exception) null);
                        }
                        int i7 = 0;
                        while (true) {
                            int b12 = rf1Var2.b(8);
                            i4 = i7 + b12;
                            if (b12 != 255) {
                                break;
                            } else {
                                i7 = i4;
                            }
                        }
                        int e5 = rf1Var2.e();
                        if ((e5 & 7) == 0) {
                            this.f29205b.e(e5 >> 3);
                        } else {
                            rf1Var2.a(this.f29205b.c(), i4 * 8);
                            this.f29205b.e(0);
                        }
                        this.f29207d.a(i4, this.f29205b);
                        long j4 = this.f29214k;
                        if (j4 != -9223372036854775807L) {
                            this.f29207d.a(j4, 1, i4, 0, null);
                            this.f29214k += this.f29222s;
                        }
                        if (this.f29219p) {
                            rf1Var2.d((int) this.f29220q);
                        }
                        this.f29210g = 0;
                    } else {
                        continue;
                    }
                }
            } else if (sf1Var.t() == 86) {
                this.f29210g = 1;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f29207d = r70Var.a(dVar.c(), 1);
        this.f29208e = dVar.b();
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f29214k = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f29210g = 0;
        this.f29214k = -9223372036854775807L;
        this.f29215l = false;
    }
}
