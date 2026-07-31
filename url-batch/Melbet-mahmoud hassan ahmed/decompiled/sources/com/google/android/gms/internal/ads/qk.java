package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qk {

    /* renamed from: i, reason: collision with root package name */
    private int f10727i;

    /* renamed from: j, reason: collision with root package name */
    private int f10728j;

    /* renamed from: k, reason: collision with root package name */
    private int f10729k;

    /* renamed from: l, reason: collision with root package name */
    private int f10730l;

    /* renamed from: q, reason: collision with root package name */
    private xe f10735q;

    /* renamed from: a, reason: collision with root package name */
    private int f10719a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private int[] f10720b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    private long[] f10721c = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    private long[] f10724f = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    private int[] f10723e = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    private int[] f10722d = new int[1000];

    /* renamed from: g, reason: collision with root package name */
    private kh[] f10725g = new kh[1000];

    /* renamed from: h, reason: collision with root package name */
    private xe[] f10726h = new xe[1000];

    /* renamed from: m, reason: collision with root package name */
    private long f10731m = Long.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    private long f10732n = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10734p = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10733o = true;

    public final int a() {
        return this.f10728j + this.f10727i;
    }

    public final synchronized int b(ye yeVar, ug ugVar, boolean z6, boolean z7, xe xeVar, pk pkVar) {
        if (!l()) {
            if (z7) {
                ugVar.c(4);
                return -4;
            }
            xe xeVar2 = this.f10735q;
            if (xeVar2 == null || (!z6 && xeVar2 == xeVar)) {
                return -3;
            }
            yeVar.f14633a = xeVar2;
            return -5;
        }
        if (!z6) {
            xe[] xeVarArr = this.f10726h;
            int i7 = this.f10729k;
            if (xeVarArr[i7] == xeVar) {
                if (ugVar.f12780c == null) {
                    return -3;
                }
                ugVar.f12781d = this.f10724f[i7];
                ugVar.c(this.f10723e[i7]);
                int[] iArr = this.f10722d;
                int i8 = this.f10729k;
                pkVar.f10246a = iArr[i8];
                pkVar.f10247b = this.f10721c[i8];
                pkVar.f10249d = this.f10725g[i8];
                this.f10731m = Math.max(this.f10731m, ugVar.f12781d);
                int i9 = this.f10727i - 1;
                this.f10727i = i9;
                int i10 = this.f10729k + 1;
                this.f10729k = i10;
                this.f10728j++;
                if (i10 == this.f10719a) {
                    this.f10729k = 0;
                    i10 = 0;
                }
                pkVar.f10248c = i9 > 0 ? this.f10721c[i10] : pkVar.f10247b + pkVar.f10246a;
                return -4;
            }
        }
        yeVar.f14633a = this.f10726h[this.f10729k];
        return -5;
    }

    public final synchronized long c() {
        return Math.max(this.f10731m, this.f10732n);
    }

    public final synchronized long d() {
        if (!l()) {
            return -1L;
        }
        int i7 = this.f10729k;
        int i8 = this.f10727i;
        int i9 = i7 + i8;
        int i10 = this.f10719a;
        int i11 = (i9 - 1) % i10;
        this.f10729k = i9 % i10;
        this.f10728j += i8;
        this.f10727i = 0;
        return this.f10721c[i11] + this.f10722d[i11];
    }

    public final synchronized long e(long j7, boolean z6) {
        if (l()) {
            long[] jArr = this.f10724f;
            int i7 = this.f10729k;
            if (j7 >= jArr[i7]) {
                int i8 = 0;
                if (j7 > this.f10732n && !z6) {
                    return -1L;
                }
                int i9 = -1;
                while (i7 != this.f10730l && this.f10724f[i7] <= j7) {
                    if (1 == (this.f10723e[i7] & 1)) {
                        i9 = i8;
                    }
                    i7 = (i7 + 1) % this.f10719a;
                    i8++;
                }
                if (i9 == -1) {
                    return -1L;
                }
                int i10 = (this.f10729k + i9) % this.f10719a;
                this.f10729k = i10;
                this.f10728j += i9;
                this.f10727i -= i9;
                return this.f10721c[i10];
            }
        }
        return -1L;
    }

    public final synchronized xe f() {
        if (this.f10734p) {
            return null;
        }
        return this.f10735q;
    }

    public final void g() {
        this.f10728j = 0;
        this.f10729k = 0;
        this.f10730l = 0;
        this.f10727i = 0;
        this.f10733o = true;
    }

    public final synchronized void h(long j7, int i7, long j8, int i8, kh khVar) {
        if (this.f10733o) {
            if ((i7 & 1) == 0) {
                return;
            } else {
                this.f10733o = false;
            }
        }
        jm.e(!this.f10734p);
        i(j7);
        long[] jArr = this.f10724f;
        int i9 = this.f10730l;
        jArr[i9] = j7;
        long[] jArr2 = this.f10721c;
        jArr2[i9] = j8;
        this.f10722d[i9] = i8;
        this.f10723e[i9] = i7;
        this.f10725g[i9] = khVar;
        this.f10726h[i9] = this.f10735q;
        this.f10720b[i9] = 0;
        int i10 = this.f10727i + 1;
        this.f10727i = i10;
        int i11 = this.f10719a;
        if (i10 != i11) {
            int i12 = i9 + 1;
            this.f10730l = i12;
            if (i12 == i11) {
                this.f10730l = 0;
                return;
            }
            return;
        }
        int i13 = i11 + 1000;
        int[] iArr = new int[i13];
        long[] jArr3 = new long[i13];
        long[] jArr4 = new long[i13];
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        kh[] khVarArr = new kh[i13];
        xe[] xeVarArr = new xe[i13];
        int i14 = this.f10729k;
        int i15 = i11 - i14;
        System.arraycopy(jArr2, i14, jArr3, 0, i15);
        System.arraycopy(this.f10724f, this.f10729k, jArr4, 0, i15);
        System.arraycopy(this.f10723e, this.f10729k, iArr2, 0, i15);
        System.arraycopy(this.f10722d, this.f10729k, iArr3, 0, i15);
        System.arraycopy(this.f10725g, this.f10729k, khVarArr, 0, i15);
        System.arraycopy(this.f10726h, this.f10729k, xeVarArr, 0, i15);
        System.arraycopy(this.f10720b, this.f10729k, iArr, 0, i15);
        int i16 = this.f10729k;
        System.arraycopy(this.f10721c, 0, jArr3, i15, i16);
        System.arraycopy(this.f10724f, 0, jArr4, i15, i16);
        System.arraycopy(this.f10723e, 0, iArr2, i15, i16);
        System.arraycopy(this.f10722d, 0, iArr3, i15, i16);
        System.arraycopy(this.f10725g, 0, khVarArr, i15, i16);
        System.arraycopy(this.f10726h, 0, xeVarArr, i15, i16);
        System.arraycopy(this.f10720b, 0, iArr, i15, i16);
        this.f10721c = jArr3;
        this.f10724f = jArr4;
        this.f10723e = iArr2;
        this.f10722d = iArr3;
        this.f10725g = khVarArr;
        this.f10726h = xeVarArr;
        this.f10720b = iArr;
        this.f10729k = 0;
        int i17 = this.f10719a;
        this.f10730l = i17;
        this.f10727i = i17;
        this.f10719a = i13;
    }

    public final synchronized void i(long j7) {
        this.f10732n = Math.max(this.f10732n, j7);
    }

    public final void j() {
        this.f10731m = Long.MIN_VALUE;
        this.f10732n = Long.MIN_VALUE;
    }

    public final synchronized boolean k(xe xeVar) {
        if (xeVar == null) {
            this.f10734p = true;
            return false;
        }
        this.f10734p = false;
        if (zm.o(xeVar, this.f10735q)) {
            return false;
        }
        this.f10735q = xeVar;
        return true;
    }

    public final synchronized boolean l() {
        return this.f10727i != 0;
    }
}
