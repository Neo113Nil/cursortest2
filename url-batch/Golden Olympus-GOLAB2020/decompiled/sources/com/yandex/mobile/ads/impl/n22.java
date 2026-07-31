package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nb0;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
abstract class n22 {

    /* renamed from: b, reason: collision with root package name */
    private p52 f29368b;

    /* renamed from: c, reason: collision with root package name */
    private r70 f29369c;

    /* renamed from: d, reason: collision with root package name */
    private rd1 f29370d;

    /* renamed from: e, reason: collision with root package name */
    private long f29371e;

    /* renamed from: f, reason: collision with root package name */
    private long f29372f;

    /* renamed from: g, reason: collision with root package name */
    private long f29373g;

    /* renamed from: h, reason: collision with root package name */
    private int f29374h;

    /* renamed from: i, reason: collision with root package name */
    private int f29375i;

    /* renamed from: k, reason: collision with root package name */
    private long f29377k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29378l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29379m;

    /* renamed from: a, reason: collision with root package name */
    private final pd1 f29367a = new pd1();

    /* renamed from: j, reason: collision with root package name */
    private a f29376j = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        yb0 f29380a;

        /* renamed from: b, reason: collision with root package name */
        nb0.a f29381b;

        a() {
        }
    }

    private static final class b implements rd1 {
        @Override // com.yandex.mobile.ads.impl.rd1
        public final long a(lz lzVar) {
            return -1L;
        }

        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.rd1
        public final void a(long j4) {
        }

        @Override // com.yandex.mobile.ads.impl.rd1
        public final tw1 a() {
            return new tw1.b(-9223372036854775807L, 0L);
        }
    }

    protected final long a(long j4) {
        return (j4 * 1000000) / this.f29375i;
    }

    protected abstract long a(sf1 sf1Var);

    protected abstract boolean a(sf1 sf1Var, long j4, a aVar);

    protected final long b(long j4) {
        return (this.f29375i * j4) / 1000000;
    }

    protected void c(long j4) {
        this.f29373g = j4;
    }

    final void a(r70 r70Var, p52 p52Var) {
        this.f29369c = r70Var;
        this.f29368b = p52Var;
        a(true);
    }

    final int a(lz lzVar, hj1 hj1Var) {
        if (this.f29368b != null) {
            int i4 = u82.f32873a;
            int i5 = this.f29374h;
            if (i5 == 0) {
                while (this.f29367a.a(lzVar)) {
                    this.f29377k = lzVar.a() - this.f29372f;
                    if (a(this.f29367a.b(), this.f29372f, this.f29376j)) {
                        this.f29372f = lzVar.a();
                    } else {
                        yb0 yb0Var = this.f29376j.f29380a;
                        this.f29375i = yb0Var.f34973A;
                        if (!this.f29379m) {
                            this.f29368b.a(yb0Var);
                            this.f29379m = true;
                        }
                        nb0.a aVar = this.f29376j.f29381b;
                        if (aVar != null) {
                            this.f29370d = aVar;
                        } else if (lzVar.b() == -1) {
                            this.f29370d = new b();
                        } else {
                            qd1 a4 = this.f29367a.a();
                            this.f29370d = new yz(this, this.f29372f, lzVar.b(), a4.f30743d + a4.f30744e, a4.f30741b, (a4.f30740a & 4) != 0);
                        }
                        this.f29374h = 2;
                        this.f29367a.d();
                        return 0;
                    }
                }
                this.f29374h = 3;
                return -1;
            }
            if (i5 == 1) {
                lzVar.a((int) this.f29372f);
                this.f29374h = 2;
                return 0;
            }
            if (i5 != 2) {
                if (i5 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long a5 = this.f29370d.a(lzVar);
            if (a5 >= 0) {
                hj1Var.f26771a = a5;
                return 1;
            }
            if (a5 < -1) {
                c(-(a5 + 2));
            }
            if (!this.f29378l) {
                tw1 a6 = this.f29370d.a();
                if (a6 != null) {
                    this.f29369c.a(a6);
                    this.f29378l = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f29377k <= 0 && !this.f29367a.a(lzVar)) {
                this.f29374h = 3;
                return -1;
            }
            this.f29377k = 0L;
            sf1 b4 = this.f29367a.b();
            long a7 = a(b4);
            if (a7 >= 0) {
                long j4 = this.f29373g;
                if (j4 + a7 >= this.f29371e) {
                    long a8 = a(j4);
                    this.f29368b.a(b4.e(), b4);
                    this.f29368b.a(a8, 1, b4.e(), 0, null);
                    this.f29371e = -1L;
                }
            }
            this.f29373g += a7;
            return 0;
        }
        throw new IllegalStateException();
    }

    protected void a(boolean z4) {
        if (z4) {
            this.f29376j = new a();
            this.f29372f = 0L;
            this.f29374h = 0;
        } else {
            this.f29374h = 1;
        }
        this.f29371e = -1L;
        this.f29373g = 0L;
    }

    final void a(long j4, long j5) {
        this.f29367a.c();
        if (j4 == 0) {
            a(!this.f29378l);
            return;
        }
        if (this.f29374h != 0) {
            long b4 = b(j5);
            this.f29371e = b4;
            rd1 rd1Var = this.f29370d;
            int i4 = u82.f32873a;
            rd1Var.a(b4);
            this.f29374h = 2;
        }
    }
}
