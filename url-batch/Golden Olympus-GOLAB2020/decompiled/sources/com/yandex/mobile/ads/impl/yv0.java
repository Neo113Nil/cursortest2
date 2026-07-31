package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;

/* loaded from: classes3.dex */
final class yv0 {

    /* renamed from: a, reason: collision with root package name */
    public final xv0 f35326a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35327b;

    /* renamed from: c, reason: collision with root package name */
    public final ft1[] f35328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35330e;

    /* renamed from: f, reason: collision with root package name */
    public aw0 f35331f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35332g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f35333h;

    /* renamed from: i, reason: collision with root package name */
    private final to1[] f35334i;

    /* renamed from: j, reason: collision with root package name */
    private final u52 f35335j;

    /* renamed from: k, reason: collision with root package name */
    private final gw0 f35336k;

    /* renamed from: l, reason: collision with root package name */
    private yv0 f35337l;

    /* renamed from: m, reason: collision with root package name */
    private o52 f35338m;

    /* renamed from: n, reason: collision with root package name */
    private v52 f35339n;

    /* renamed from: o, reason: collision with root package name */
    private long f35340o;

    public yv0(to1[] to1VarArr, long j4, u52 u52Var, InterfaceC2250tc interfaceC2250tc, gw0 gw0Var, aw0 aw0Var, v52 v52Var) {
        this.f35334i = to1VarArr;
        this.f35340o = j4;
        this.f35335j = u52Var;
        this.f35336k = gw0Var;
        dw0.b bVar = aw0Var.f23497a;
        this.f35327b = bVar.f35792a;
        this.f35331f = aw0Var;
        this.f35338m = o52.f29910e;
        this.f35339n = v52Var;
        this.f35328c = new ft1[to1VarArr.length];
        this.f35333h = new boolean[to1VarArr.length];
        this.f35326a = a(bVar, gw0Var, interfaceC2250tc, aw0Var.f23498b, aw0Var.f23500d);
    }

    public final long a(v52 v52Var, long j4, boolean z4, boolean[] zArr) {
        v52 v52Var2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 >= v52Var.f33511a) {
                break;
            }
            boolean[] zArr2 = this.f35333h;
            if (z4 || (v52Var2 = this.f35339n) == null || !u82.a(v52Var.f33512b[i5], v52Var2.f33512b[i5]) || !u82.a(v52Var.f33513c[i5], v52Var2.f33513c[i5])) {
                z5 = false;
            }
            zArr2[i5] = z5;
            i5++;
        }
        ft1[] ft1VarArr = this.f35328c;
        int i6 = 0;
        while (true) {
            to1[] to1VarArr = this.f35334i;
            if (i6 >= to1VarArr.length) {
                break;
            }
            if (((AbstractC1811ak) to1VarArr[i6]).m() == -2) {
                ft1VarArr[i6] = null;
            }
            i6++;
        }
        a();
        this.f35339n = v52Var;
        if (this.f35337l == null) {
            int i7 = 0;
            while (true) {
                v52 v52Var3 = this.f35339n;
                if (i7 >= v52Var3.f33511a) {
                    break;
                }
                boolean a4 = v52Var3.a(i7);
                x60 x60Var = this.f35339n.f33513c[i7];
                if (a4 && x60Var != null) {
                    x60Var.d();
                }
                i7++;
            }
        }
        long a5 = this.f35326a.a(v52Var.f33513c, this.f35333h, this.f35328c, zArr, j4);
        ft1[] ft1VarArr2 = this.f35328c;
        int i8 = 0;
        while (true) {
            to1[] to1VarArr2 = this.f35334i;
            if (i8 >= to1VarArr2.length) {
                break;
            }
            if (((AbstractC1811ak) to1VarArr2[i8]).m() == -2 && this.f35339n.a(i8)) {
                ft1VarArr2[i8] = new s40();
            }
            i8++;
        }
        this.f35330e = false;
        while (true) {
            ft1[] ft1VarArr3 = this.f35328c;
            if (i4 >= ft1VarArr3.length) {
                return a5;
            }
            if (ft1VarArr3[i4] != null) {
                if (!v52Var.a(i4)) {
                    throw new IllegalStateException();
                }
                if (((AbstractC1811ak) this.f35334i[i4]).m() != -2) {
                    this.f35330e = true;
                }
            } else if (v52Var.f33513c[i4] != null) {
                throw new IllegalStateException();
            }
            i4++;
        }
    }

    public final yv0 b() {
        return this.f35337l;
    }

    public final long c() {
        return this.f35340o;
    }

    public final long d() {
        return this.f35331f.f23498b + this.f35340o;
    }

    public final o52 e() {
        return this.f35338m;
    }

    public final v52 f() {
        return this.f35339n;
    }

    public final void g() {
        a();
        gw0 gw0Var = this.f35336k;
        xv0 xv0Var = this.f35326a;
        try {
            if (xv0Var instanceof vo) {
                gw0Var.a(((vo) xv0Var).f33699b);
            } else {
                gw0Var.a(xv0Var);
            }
        } catch (RuntimeException e4) {
            ms0.a("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public final void h() {
        this.f35340o = 1000000000000L;
    }

    public final void b(long j4) {
        if (this.f35337l != null) {
            throw new IllegalStateException();
        }
        if (this.f35329d) {
            this.f35326a.reevaluateBuffer(j4 - this.f35340o);
        }
    }

    public final long c(long j4) {
        return j4 - this.f35340o;
    }

    public final long d(long j4) {
        return j4 + this.f35340o;
    }

    public final v52 b(float f4, x42 x42Var) {
        v52 a4 = this.f35335j.a(this.f35334i, this.f35338m, this.f35331f.f23497a, x42Var);
        for (x60 x60Var : a4.f33513c) {
            if (x60Var != null) {
                x60Var.a(f4);
            }
        }
        return a4;
    }

    public final void a(v52 v52Var, long j4) {
        a(v52Var, j4, false, new boolean[this.f35334i.length]);
    }

    public final void a(long j4) {
        if (this.f35337l == null) {
            this.f35326a.continueLoading(j4 - this.f35340o);
            return;
        }
        throw new IllegalStateException();
    }

    private static xv0 a(dw0.b bVar, gw0 gw0Var, InterfaceC2250tc interfaceC2250tc, long j4, long j5) {
        qt0 a4 = gw0Var.a(bVar, interfaceC2250tc, j4);
        return j5 != -9223372036854775807L ? new vo(a4, true, 0L, j5) : a4;
    }

    private void a() {
        if (this.f35337l != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            v52 v52Var = this.f35339n;
            if (i4 >= v52Var.f33511a) {
                return;
            }
            boolean a4 = v52Var.a(i4);
            x60 x60Var = this.f35339n.f33513c[i4];
            if (a4 && x60Var != null) {
                x60Var.c();
            }
            i4++;
        }
    }

    public final void a(float f4, x42 x42Var) {
        this.f35329d = true;
        this.f35338m = this.f35326a.getTrackGroups();
        v52 b4 = b(f4, x42Var);
        aw0 aw0Var = this.f35331f;
        long j4 = aw0Var.f23498b;
        long j5 = aw0Var.f23501e;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        long a4 = a(b4, j4, false, new boolean[this.f35334i.length]);
        long j6 = this.f35340o;
        aw0 aw0Var2 = this.f35331f;
        long j7 = aw0Var2.f23498b;
        this.f35340o = (j7 - a4) + j6;
        if (a4 != j7) {
            aw0Var2 = new aw0(aw0Var2.f23497a, a4, aw0Var2.f23499c, aw0Var2.f23500d, aw0Var2.f23501e, aw0Var2.f23502f, aw0Var2.f23503g, aw0Var2.f23504h, aw0Var2.f23505i);
        }
        this.f35331f = aw0Var2;
    }

    public final void a(yv0 yv0Var) {
        if (yv0Var == this.f35337l) {
            return;
        }
        a();
        this.f35337l = yv0Var;
        if (yv0Var != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            v52 v52Var = this.f35339n;
            if (i4 >= v52Var.f33511a) {
                return;
            }
            boolean a4 = v52Var.a(i4);
            x60 x60Var = this.f35339n.f33513c[i4];
            if (a4 && x60Var != null) {
                x60Var.d();
            }
            i4++;
        }
    }
}
