package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC2250tc;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sy implements InterfaceC2250tc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32072a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32073b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f32074c;

    /* renamed from: d, reason: collision with root package name */
    private int f32075d;

    /* renamed from: e, reason: collision with root package name */
    private int f32076e;

    /* renamed from: f, reason: collision with root package name */
    private int f32077f;

    /* renamed from: g, reason: collision with root package name */
    private C2227sc[] f32078g;

    public sy() {
        this(0);
    }

    public final synchronized C2227sc a() {
        C2227sc c2227sc;
        try {
            int i4 = this.f32076e + 1;
            this.f32076e = i4;
            int i5 = this.f32077f;
            if (i5 > 0) {
                C2227sc[] c2227scArr = this.f32078g;
                int i6 = i5 - 1;
                this.f32077f = i6;
                c2227sc = c2227scArr[i6];
                c2227sc.getClass();
                this.f32078g[this.f32077f] = null;
            } else {
                C2227sc c2227sc2 = new C2227sc(0, new byte[this.f32073b]);
                C2227sc[] c2227scArr2 = this.f32078g;
                if (i4 > c2227scArr2.length) {
                    this.f32078g = (C2227sc[]) Arrays.copyOf(c2227scArr2, c2227scArr2.length * 2);
                }
                c2227sc = c2227sc2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2227sc;
    }

    public final int b() {
        return this.f32073b;
    }

    public final synchronized int c() {
        return this.f32076e * this.f32073b;
    }

    public final synchronized void d() {
        if (this.f32072a) {
            a(0);
        }
    }

    public final synchronized void e() {
        try {
            int i4 = this.f32075d;
            int i5 = this.f32073b;
            int i6 = u82.f32873a;
            int i7 = (((i4 + i5) - 1) / i5) - this.f32076e;
            int i8 = 0;
            int max = Math.max(0, i7);
            int i9 = this.f32077f;
            if (max >= i9) {
                return;
            }
            if (this.f32074c != null) {
                int i10 = i9 - 1;
                while (i8 <= i10) {
                    C2227sc c2227sc = this.f32078g[i8];
                    c2227sc.getClass();
                    if (c2227sc.f31677a == this.f32074c) {
                        i8++;
                    } else {
                        C2227sc c2227sc2 = this.f32078g[i10];
                        c2227sc2.getClass();
                        if (c2227sc2.f31677a != this.f32074c) {
                            i10--;
                        } else {
                            C2227sc[] c2227scArr = this.f32078g;
                            c2227scArr[i8] = c2227sc2;
                            c2227scArr[i10] = c2227sc;
                            i10--;
                            i8++;
                        }
                    }
                }
                max = Math.max(max, i8);
                if (max >= this.f32077f) {
                    return;
                }
            }
            Arrays.fill(this.f32078g, max, this.f32077f, (Object) null);
            this.f32077f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    public sy(int i4) {
        this.f32072a = true;
        this.f32073b = 65536;
        this.f32077f = 0;
        this.f32078g = new C2227sc[100];
        this.f32074c = null;
    }

    public final synchronized void a(C2227sc c2227sc) {
        C2227sc[] c2227scArr = this.f32078g;
        int i4 = this.f32077f;
        this.f32077f = i4 + 1;
        c2227scArr[i4] = c2227sc;
        this.f32076e--;
        notifyAll();
    }

    public final synchronized void a(InterfaceC2250tc.a aVar) {
        while (aVar != null) {
            try {
                C2227sc[] c2227scArr = this.f32078g;
                int i4 = this.f32077f;
                this.f32077f = i4 + 1;
                c2227scArr[i4] = aVar.a();
                this.f32076e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void a(int i4) {
        boolean z4 = i4 < this.f32075d;
        this.f32075d = i4;
        if (z4) {
            e();
        }
    }
}
