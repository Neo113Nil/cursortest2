package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7993a = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int f8001j;

    /* renamed from: k, reason: collision with root package name */
    private int f8002k;

    /* renamed from: l, reason: collision with root package name */
    private int f8003l;

    /* renamed from: m, reason: collision with root package name */
    private int f8004m;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.exoplayer.m f8009r;

    /* renamed from: s, reason: collision with root package name */
    private int f8010s;

    /* renamed from: b, reason: collision with root package name */
    private int f7994b = 1000;

    /* renamed from: c, reason: collision with root package name */
    private int[] f7995c = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    private long[] f7996d = new long[1000];

    /* renamed from: g, reason: collision with root package name */
    private long[] f7999g = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    private int[] f7998f = new int[1000];

    /* renamed from: e, reason: collision with root package name */
    private int[] f7997e = new int[1000];

    /* renamed from: h, reason: collision with root package name */
    private m.a[] f8000h = new m.a[1000];
    private com.anythink.basead.exoplayer.m[] i = new com.anythink.basead.exoplayer.m[1000];

    /* renamed from: n, reason: collision with root package name */
    private long f8005n = Long.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    private long f8006o = Long.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8008q = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8007p = true;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8011a;

        /* renamed from: b, reason: collision with root package name */
        public long f8012b;

        /* renamed from: c, reason: collision with root package name */
        public m.a f8013c;
    }

    public final void a() {
        this.f8001j = 0;
        this.f8002k = 0;
        this.f8003l = 0;
        this.f8004m = 0;
        this.f8007p = true;
        this.f8005n = Long.MIN_VALUE;
        this.f8006o = Long.MIN_VALUE;
    }

    public final int b() {
        return this.f8002k + this.f8001j;
    }

    public final int c() {
        return this.f8002k;
    }

    public final int d() {
        return this.f8002k + this.f8004m;
    }

    public final int e() {
        return f() ? this.f7995c[f(this.f8004m)] : this.f8010s;
    }

    public final synchronized boolean f() {
        return this.f8004m != this.f8001j;
    }

    public final synchronized com.anythink.basead.exoplayer.m g() {
        if (this.f8008q) {
            return null;
        }
        return this.f8009r;
    }

    public final synchronized long h() {
        return this.f8006o;
    }

    public final synchronized long i() {
        if (this.f8001j == 0) {
            return Long.MIN_VALUE;
        }
        return this.f7999g[this.f8003l];
    }

    public final synchronized void j() {
        this.f8004m = 0;
    }

    public final synchronized int k() {
        int i;
        int i4 = this.f8001j;
        i = i4 - this.f8004m;
        this.f8004m = i4;
        return i;
    }

    public final synchronized long l() {
        int i = this.f8004m;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    public final synchronized long m() {
        int i = this.f8001j;
        if (i == 0) {
            return -1L;
        }
        return d(i);
    }

    private long d(int i) {
        this.f8005n = Math.max(this.f8005n, e(i));
        int i4 = this.f8001j - i;
        this.f8001j = i4;
        this.f8002k += i;
        int i9 = this.f8003l + i;
        this.f8003l = i9;
        int i10 = this.f7994b;
        if (i9 >= i10) {
            this.f8003l = i9 - i10;
        }
        int i11 = this.f8004m - i;
        this.f8004m = i11;
        if (i11 < 0) {
            this.f8004m = 0;
        }
        if (i4 != 0) {
            return this.f7996d[this.f8003l];
        }
        int i12 = this.f8003l;
        if (i12 != 0) {
            i10 = i12;
        }
        return this.f7996d[i10 - 1] + this.f7997e[r2];
    }

    private int f(int i) {
        int i4 = this.f8003l + i;
        int i9 = this.f7994b;
        return i4 < i9 ? i4 : i4 - i9;
    }

    public final void b(int i) {
        this.f8010s = i;
    }

    public final synchronized boolean c(int i) {
        int i4 = this.f8002k;
        if (i4 > i || i > this.f8001j + i4) {
            return false;
        }
        this.f8004m = i - i4;
        return true;
    }

    private synchronized void b(long j9) {
        this.f8006o = Math.max(this.f8006o, j9);
    }

    private long e(int i) {
        long j9 = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int f6 = f(i - 1);
        for (int i4 = 0; i4 < i; i4++) {
            j9 = Math.max(j9, this.f7999g[f6]);
            if ((this.f7998f[f6] & 1) != 0) {
                break;
            }
            f6--;
            if (f6 == -1) {
                f6 = this.f7994b - 1;
            }
        }
        return j9;
    }

    public final long a(int i) {
        int b9 = b() - i;
        C0544a.a(b9 >= 0 && b9 <= this.f8001j - this.f8004m);
        int i4 = this.f8001j - b9;
        this.f8001j = i4;
        this.f8006o = Math.max(this.f8005n, e(i4));
        int i9 = this.f8001j;
        if (i9 == 0) {
            return 0L;
        }
        return this.f7996d[f(i9 - 1)] + this.f7997e[r6];
    }

    public final synchronized int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8, boolean z9, com.anythink.basead.exoplayer.m mVar, a aVar) {
        if (!f()) {
            if (z9) {
                eVar.a(4);
                return -4;
            }
            com.anythink.basead.exoplayer.m mVar2 = this.f8009r;
            if (mVar2 == null || (!z8 && mVar2 == mVar)) {
                return -3;
            }
            nVar.f8840a = mVar2;
            return -5;
        }
        int f6 = f(this.f8004m);
        if (!z8 && this.i[f6] == mVar) {
            if (eVar.f()) {
                return -3;
            }
            eVar.f6900f = this.f7999g[f6];
            eVar.a(this.f7998f[f6]);
            aVar.f8011a = this.f7997e[f6];
            aVar.f8012b = this.f7996d[f6];
            aVar.f8013c = this.f8000h[f6];
            this.f8004m++;
            return -4;
        }
        nVar.f8840a = this.i[f6];
        return -5;
    }

    public final synchronized int a(long j9, boolean z8) {
        try {
            try {
                int f6 = f(this.f8004m);
                if (!f() || j9 < this.f7999g[f6] || (j9 > this.f8006o && !z8)) {
                    return -1;
                }
                int a9 = a(f6, this.f8001j - this.f8004m, j9, true);
                if (a9 == -1) {
                    return -1;
                }
                this.f8004m += a9;
                return a9;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized long a(long j9, boolean z8, boolean z9) {
        Throwable th;
        try {
            try {
                int i = this.f8001j;
                if (i != 0) {
                    long[] jArr = this.f7999g;
                    int i4 = this.f8003l;
                    if (j9 >= jArr[i4]) {
                        if (z9) {
                            try {
                                int i9 = this.f8004m;
                                if (i9 != i) {
                                    i = i9 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int a9 = a(i4, i, j9, z8);
                        if (a9 == -1) {
                            return -1L;
                        }
                        return d(a9);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized boolean a(com.anythink.basead.exoplayer.m mVar) {
        if (mVar == null) {
            this.f8008q = true;
            return false;
        }
        this.f8008q = false;
        if (com.anythink.basead.exoplayer.k.af.a(mVar, this.f8009r)) {
            return false;
        }
        this.f8009r = mVar;
        return true;
    }

    public final synchronized void a(long j9, int i, long j10, int i4, m.a aVar) {
        try {
            if (this.f8007p) {
                if ((i & 1) == 0) {
                    return;
                } else {
                    this.f8007p = false;
                }
            }
            C0544a.b(!this.f8008q);
            b(j9);
            int f6 = f(this.f8001j);
            this.f7999g[f6] = j9;
            long[] jArr = this.f7996d;
            jArr[f6] = j10;
            this.f7997e[f6] = i4;
            this.f7998f[f6] = i;
            this.f8000h[f6] = aVar;
            this.i[f6] = this.f8009r;
            this.f7995c[f6] = this.f8010s;
            int i9 = this.f8001j + 1;
            this.f8001j = i9;
            int i10 = this.f7994b;
            if (i9 == i10) {
                int i11 = i10 + 1000;
                int[] iArr = new int[i11];
                long[] jArr2 = new long[i11];
                long[] jArr3 = new long[i11];
                int[] iArr2 = new int[i11];
                int[] iArr3 = new int[i11];
                m.a[] aVarArr = new m.a[i11];
                com.anythink.basead.exoplayer.m[] mVarArr = new com.anythink.basead.exoplayer.m[i11];
                int i12 = this.f8003l;
                int i13 = i10 - i12;
                System.arraycopy(jArr, i12, jArr2, 0, i13);
                System.arraycopy(this.f7999g, this.f8003l, jArr3, 0, i13);
                System.arraycopy(this.f7998f, this.f8003l, iArr2, 0, i13);
                System.arraycopy(this.f7997e, this.f8003l, iArr3, 0, i13);
                System.arraycopy(this.f8000h, this.f8003l, aVarArr, 0, i13);
                System.arraycopy(this.i, this.f8003l, mVarArr, 0, i13);
                System.arraycopy(this.f7995c, this.f8003l, iArr, 0, i13);
                int i14 = this.f8003l;
                System.arraycopy(this.f7996d, 0, jArr2, i13, i14);
                System.arraycopy(this.f7999g, 0, jArr3, i13, i14);
                System.arraycopy(this.f7998f, 0, iArr2, i13, i14);
                System.arraycopy(this.f7997e, 0, iArr3, i13, i14);
                System.arraycopy(this.f8000h, 0, aVarArr, i13, i14);
                System.arraycopy(this.i, 0, mVarArr, i13, i14);
                System.arraycopy(this.f7995c, 0, iArr, i13, i14);
                this.f7996d = jArr2;
                this.f7999g = jArr3;
                this.f7998f = iArr2;
                this.f7997e = iArr3;
                this.f8000h = aVarArr;
                this.i = mVarArr;
                this.f7995c = iArr;
                this.f8003l = 0;
                this.f8001j = this.f7994b;
                this.f7994b = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(long j9) {
        if (this.f8001j == 0) {
            return j9 > this.f8005n;
        }
        if (Math.max(this.f8005n, e(this.f8004m)) >= j9) {
            return false;
        }
        int i = this.f8001j;
        int f6 = f(i - 1);
        while (i > this.f8004m && this.f7999g[f6] >= j9) {
            i--;
            f6--;
            if (f6 == -1) {
                f6 = this.f7994b - 1;
            }
        }
        a(this.f8002k + i);
        return true;
    }

    private int a(int i, int i4, long j9, boolean z8) {
        int i9 = -1;
        for (int i10 = 0; i10 < i4 && this.f7999g[i] <= j9; i10++) {
            if (!z8 || (this.f7998f[i] & 1) != 0) {
                i9 = i10;
            }
            i++;
            if (i == this.f7994b) {
                i = 0;
            }
        }
        return i9;
    }
}
