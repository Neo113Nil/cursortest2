package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.w30;
import com.yandex.mobile.ads.impl.x30;

/* loaded from: classes3.dex */
public final class et1 implements p52 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f25428A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f25429B;

    /* renamed from: a, reason: collision with root package name */
    private final dt1 f25430a;

    /* renamed from: d, reason: collision with root package name */
    private final x30 f25433d;

    /* renamed from: e, reason: collision with root package name */
    private final w30.a f25434e;

    /* renamed from: f, reason: collision with root package name */
    private c f25435f;

    /* renamed from: g, reason: collision with root package name */
    private yb0 f25436g;

    /* renamed from: h, reason: collision with root package name */
    private v30 f25437h;

    /* renamed from: p, reason: collision with root package name */
    private int f25445p;

    /* renamed from: q, reason: collision with root package name */
    private int f25446q;

    /* renamed from: r, reason: collision with root package name */
    private int f25447r;

    /* renamed from: s, reason: collision with root package name */
    private int f25448s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f25452w;

    /* renamed from: z, reason: collision with root package name */
    private yb0 f25455z;

    /* renamed from: b, reason: collision with root package name */
    private final a f25431b = new a();

    /* renamed from: i, reason: collision with root package name */
    private int f25438i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int[] f25439j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f25440k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f25443n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f25442m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f25441l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private p52.a[] f25444o = new p52.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final e12<b> f25432c = new e12<>(new lr() { // from class: com.yandex.mobile.ads.impl.W1
        @Override // com.yandex.mobile.ads.impl.lr
        public final void accept(Object obj) {
            et1.a((et1.b) obj);
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private long f25449t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f25450u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f25451v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f25454y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f25453x = true;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f25456a;

        /* renamed from: b, reason: collision with root package name */
        public long f25457b;

        /* renamed from: c, reason: collision with root package name */
        public p52.a f25458c;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final yb0 f25459a;

        /* renamed from: b, reason: collision with root package name */
        public final x30.b f25460b;

        private b(yb0 yb0Var, x30.b bVar) {
            this.f25459a = yb0Var;
            this.f25460b = bVar;
        }
    }

    public interface c {
    }

    protected et1(InterfaceC2250tc interfaceC2250tc, x30 x30Var, w30.a aVar) {
        this.f25433d = x30Var;
        this.f25434e = aVar;
        this.f25430a = new dt1(interfaceC2250tc);
    }

    private synchronized void a(long j4, int i4, long j5, int i5, p52.a aVar) {
        try {
            int i6 = this.f25445p;
            if (i6 > 0) {
                if (this.f25440k[c(i6 - 1)] + this.f25441l[r0] > j5) {
                    throw new IllegalArgumentException();
                }
            }
            this.f25452w = (536870912 & i4) != 0;
            this.f25451v = Math.max(this.f25451v, j4);
            int c4 = c(this.f25445p);
            this.f25443n[c4] = j4;
            this.f25440k[c4] = j5;
            this.f25441l[c4] = i5;
            this.f25442m[c4] = i4;
            this.f25444o[c4] = aVar;
            this.f25439j[c4] = 0;
            if (this.f25432c.c() || !this.f25432c.b().f25459a.equals(this.f25455z)) {
                x30 x30Var = this.f25433d;
                x30.b a4 = x30Var != null ? x30Var.a(this.f25434e, this.f25455z) : x30.b.f34371a;
                e12<b> e12Var = this.f25432c;
                int i7 = this.f25446q + this.f25445p;
                yb0 yb0Var = this.f25455z;
                yb0Var.getClass();
                e12Var.a(i7, new b(yb0Var, a4));
            }
            int i8 = this.f25445p + 1;
            this.f25445p = i8;
            int i9 = this.f25438i;
            if (i8 == i9) {
                int i10 = i9 + 1000;
                int[] iArr = new int[i10];
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                p52.a[] aVarArr = new p52.a[i10];
                int i11 = this.f25447r;
                int i12 = i9 - i11;
                System.arraycopy(this.f25440k, i11, jArr, 0, i12);
                System.arraycopy(this.f25443n, this.f25447r, jArr2, 0, i12);
                System.arraycopy(this.f25442m, this.f25447r, iArr2, 0, i12);
                System.arraycopy(this.f25441l, this.f25447r, iArr3, 0, i12);
                System.arraycopy(this.f25444o, this.f25447r, aVarArr, 0, i12);
                System.arraycopy(this.f25439j, this.f25447r, iArr, 0, i12);
                int i13 = this.f25447r;
                System.arraycopy(this.f25440k, 0, jArr, i12, i13);
                System.arraycopy(this.f25443n, 0, jArr2, i12, i13);
                System.arraycopy(this.f25442m, 0, iArr2, i12, i13);
                System.arraycopy(this.f25441l, 0, iArr3, i12, i13);
                System.arraycopy(this.f25444o, 0, aVarArr, i12, i13);
                System.arraycopy(this.f25439j, 0, iArr, i12, i13);
                this.f25440k = jArr;
                this.f25443n = jArr2;
                this.f25442m = iArr2;
                this.f25441l = iArr3;
                this.f25444o = aVarArr;
                this.f25439j = iArr;
                this.f25447r = 0;
                this.f25438i = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void j() {
        this.f25448s = 0;
        this.f25430a.c();
    }

    public final int c() {
        return this.f25446q + this.f25448s;
    }

    public final synchronized yb0 d() {
        return this.f25454y ? null : this.f25455z;
    }

    public final int e() {
        return this.f25446q + this.f25445p;
    }

    public final synchronized boolean f() {
        return this.f25452w;
    }

    public final void g() {
        v30 v30Var = this.f25437h;
        if (v30Var == null || v30Var.getState() != 1) {
            return;
        }
        v30.a error = this.f25437h.getError();
        error.getClass();
        throw error;
    }

    public final void h() {
        a();
        v30 v30Var = this.f25437h;
        if (v30Var != null) {
            v30Var.a(this.f25434e);
            this.f25437h = null;
            this.f25436g = null;
        }
    }

    public final void i() {
        b(true);
        v30 v30Var = this.f25437h;
        if (v30Var != null) {
            v30Var.a(this.f25434e);
            this.f25437h = null;
            this.f25436g = null;
        }
    }

    private int c(int i4) {
        int i5 = this.f25447r + i4;
        int i6 = this.f25438i;
        return i5 < i6 ? i5 : i5 - i6;
    }

    public final synchronized long b() {
        return this.f25451v;
    }

    public final synchronized void d(int i4) {
        if (i4 >= 0) {
            int i5 = this.f25448s + i4;
            if (i5 <= this.f25445p) {
                this.f25448s = i5;
            }
        }
        throw new IllegalArgumentException();
    }

    private long b(int i4) {
        long j4 = Long.MIN_VALUE;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int c4 = c(i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = Math.max(j4, this.f25443n[c4]);
            if ((this.f25442m[c4] & 1) != 0) {
                return j4;
            }
            c4--;
            if (c4 == -1) {
                c4 = this.f25438i - 1;
            }
        }
        return j4;
    }

    public final void b(boolean z4) {
        this.f25430a.b();
        this.f25445p = 0;
        this.f25446q = 0;
        this.f25447r = 0;
        this.f25448s = 0;
        this.f25453x = true;
        this.f25449t = Long.MIN_VALUE;
        this.f25450u = Long.MIN_VALUE;
        this.f25451v = Long.MIN_VALUE;
        this.f25452w = false;
        this.f25432c.a();
        if (z4) {
            this.f25455z = null;
            this.f25454y = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final void b(int i4, sf1 sf1Var) {
        this.f25430a.a(i4, sf1Var);
    }

    public final synchronized boolean b(long j4, boolean z4) {
        try {
            try {
                j();
                int c4 = c(this.f25448s);
                int i4 = this.f25448s;
                int i5 = this.f25445p;
                if (i4 != i5 && j4 >= this.f25443n[c4]) {
                    if (j4 <= this.f25451v || z4) {
                        int a4 = a(c4, i5 - i4, j4, true);
                        if (a4 == -1) {
                            return false;
                        }
                        this.f25449t = j4;
                        this.f25448s += a4;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private long a(int i4) {
        this.f25450u = Math.max(this.f25450u, b(i4));
        this.f25445p -= i4;
        int i5 = this.f25446q + i4;
        this.f25446q = i5;
        int i6 = this.f25447r + i4;
        this.f25447r = i6;
        int i7 = this.f25438i;
        if (i6 >= i7) {
            this.f25447r = i6 - i7;
        }
        int i8 = this.f25448s - i4;
        this.f25448s = i8;
        if (i8 < 0) {
            this.f25448s = 0;
        }
        this.f25432c.a(i5);
        if (this.f25445p == 0) {
            int i9 = this.f25447r;
            if (i9 == 0) {
                i9 = this.f25438i;
            }
            return this.f25440k[i9 - 1] + this.f25441l[r6];
        }
        return this.f25440k[this.f25447r];
    }

    public final void a(long j4, boolean z4, boolean z5) {
        Throwable th;
        dt1 dt1Var = this.f25430a;
        synchronized (this) {
            try {
                int i4 = this.f25445p;
                long j5 = -1;
                if (i4 != 0) {
                    long[] jArr = this.f25443n;
                    int i5 = this.f25447r;
                    if (j4 >= jArr[i5]) {
                        if (z5) {
                            try {
                                int i6 = this.f25448s;
                                if (i6 != i4) {
                                    i4 = i6 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        try {
                            int a4 = a(i5, i4, j4, z4);
                            if (a4 != -1) {
                                j5 = a(a4);
                            }
                            dt1Var.a(j5);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                }
                dt1Var.a(j5);
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void a() {
        long a4;
        dt1 dt1Var = this.f25430a;
        synchronized (this) {
            int i4 = this.f25445p;
            a4 = i4 == 0 ? -1L : a(i4);
        }
        dt1Var.a(a4);
    }

    private int a(int i4, int i5, long j4, boolean z4) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j5 = this.f25443n[i4];
            if (j5 > j4) {
                break;
            }
            if (!z4 || (this.f25442m[i4] & 1) != 0) {
                if (j5 == j4) {
                    return i7;
                }
                i6 = i7;
            }
            i4++;
            if (i4 == this.f25438i) {
                i4 = 0;
            }
        }
        return i6;
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final void a(yb0 yb0Var) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            try {
                this.f25454y = false;
                if (!u82.a(yb0Var, this.f25455z)) {
                    if (!this.f25432c.c() && this.f25432c.b().f25459a.equals(yb0Var)) {
                        this.f25455z = this.f25432c.b().f25459a;
                    } else {
                        this.f25455z = yb0Var;
                    }
                    yb0 yb0Var2 = this.f25455z;
                    this.f25428A = i01.a(yb0Var2.f34991m, yb0Var2.f34988j);
                    this.f25429B = false;
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f25435f;
        if (cVar == null || !z4) {
            return;
        }
        ((yl1) cVar).h();
    }

    public final synchronized int a(long j4, boolean z4) {
        try {
            try {
                int c4 = c(this.f25448s);
                int i4 = this.f25448s;
                int i5 = this.f25445p;
                if (i4 == i5 || j4 < this.f25443n[c4]) {
                    return 0;
                }
                if (j4 > this.f25451v && z4) {
                    return i5 - i4;
                }
                int a4 = a(c4, i5 - i4, j4, true);
                if (a4 == -1) {
                    return 0;
                }
                return a4;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized boolean a(boolean z4) {
        yb0 yb0Var;
        int i4 = this.f25448s;
        boolean z5 = false;
        if (i4 != this.f25445p) {
            if (this.f25432c.b(this.f25446q + i4).f25459a != this.f25436g) {
                return true;
            }
            int c4 = c(this.f25448s);
            v30 v30Var = this.f25437h;
            if (v30Var == null || v30Var.getState() == 4 || ((this.f25442m[c4] & 1073741824) == 0 && this.f25437h.playClearSamplesWithoutKeys())) {
                z5 = true;
            }
            return z5;
        }
        if (z4 || this.f25452w || ((yb0Var = this.f25455z) != null && yb0Var != this.f25436g)) {
            z5 = true;
        }
        return z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
        bVar.f25460b.release();
    }

    private void a(yb0 yb0Var, zb0 zb0Var) {
        yb0 yb0Var2 = this.f25436g;
        boolean z4 = yb0Var2 == null;
        u30 u30Var = z4 ? null : yb0Var2.f34994p;
        this.f25436g = yb0Var;
        u30 u30Var2 = yb0Var.f34994p;
        x30 x30Var = this.f25433d;
        zb0Var.f35541b = x30Var != null ? yb0Var.a(x30Var.a(yb0Var)) : yb0Var;
        zb0Var.f35540a = this.f25437h;
        if (this.f25433d == null) {
            return;
        }
        if (z4 || !u82.a(u30Var, u30Var2)) {
            v30 v30Var = this.f25437h;
            v30 b4 = this.f25433d.b(this.f25434e, yb0Var);
            this.f25437h = b4;
            zb0Var.f35540a = b4;
            if (v30Var != null) {
                v30Var.a(this.f25434e);
            }
        }
    }

    public final int a(zb0 zb0Var, gy gyVar, int i4, boolean z4) {
        int i5;
        boolean z5 = (i4 & 2) != 0;
        a aVar = this.f25431b;
        synchronized (this) {
            try {
                gyVar.f26357e = false;
                int i6 = this.f25448s;
                i5 = -5;
                if (i6 != this.f25445p) {
                    yb0 yb0Var = this.f25432c.b(this.f25446q + i6).f25459a;
                    if (!z5 && yb0Var == this.f25436g) {
                        int c4 = c(this.f25448s);
                        v30 v30Var = this.f25437h;
                        if (v30Var != null && v30Var.getState() != 4 && ((this.f25442m[c4] & 1073741824) != 0 || !this.f25437h.playClearSamplesWithoutKeys())) {
                            gyVar.f26357e = true;
                            i5 = -3;
                        }
                        gyVar.d(this.f25442m[c4]);
                        long j4 = this.f25443n[c4];
                        gyVar.f26358f = j4;
                        if (j4 < this.f25449t) {
                            gyVar.b(Integer.MIN_VALUE);
                        }
                        aVar.f25456a = this.f25441l[c4];
                        aVar.f25457b = this.f25440k[c4];
                        aVar.f25458c = this.f25444o[c4];
                        i5 = -4;
                    }
                    a(yb0Var, zb0Var);
                } else {
                    if (!z4 && !this.f25452w) {
                        yb0 yb0Var2 = this.f25455z;
                        if (yb0Var2 == null || (!z5 && yb0Var2 == this.f25436g)) {
                            i5 = -3;
                        } else {
                            a(yb0Var2, zb0Var);
                        }
                    }
                    gyVar.d(4);
                    i5 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i5 == -4 && !gyVar.f()) {
            boolean z6 = (i4 & 1) != 0;
            if ((i4 & 4) == 0) {
                if (z6) {
                    this.f25430a.a(gyVar, this.f25431b);
                } else {
                    this.f25430a.b(gyVar, this.f25431b);
                }
            }
            if (!z6) {
                this.f25448s++;
            }
        }
        return i5;
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final int a(fv fvVar, int i4, boolean z4) {
        return this.f25430a.a(fvVar, i4, z4);
    }

    @Override // com.yandex.mobile.ads.impl.p52
    public final void a(long j4, int i4, int i5, int i6, p52.a aVar) {
        int i7 = i4 & 1;
        boolean z4 = i7 != 0;
        if (this.f25453x) {
            if (!z4) {
                return;
            } else {
                this.f25453x = false;
            }
        }
        if (this.f25428A) {
            if (j4 < this.f25449t) {
                return;
            }
            if (i7 == 0) {
                if (!this.f25429B) {
                    ms0.d("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f25455z);
                    this.f25429B = true;
                }
                i4 |= 1;
            }
        }
        a(j4, i4, (this.f25430a.a() - i5) - i6, i5, aVar);
    }

    public final void a(long j4) {
        this.f25449t = j4;
    }

    public final void a(c cVar) {
        this.f25435f = cVar;
    }
}
