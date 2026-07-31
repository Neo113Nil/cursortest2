package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.util.Pair;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.x42;

/* loaded from: classes3.dex */
final class bw0 {

    /* renamed from: a, reason: collision with root package name */
    private final x42.b f23938a = new x42.b();

    /* renamed from: b, reason: collision with root package name */
    private final x42.d f23939b = new x42.d();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2296vc f23940c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f23941d;

    /* renamed from: e, reason: collision with root package name */
    private long f23942e;

    /* renamed from: f, reason: collision with root package name */
    private int f23943f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23944g;

    /* renamed from: h, reason: collision with root package name */
    private yv0 f23945h;

    /* renamed from: i, reason: collision with root package name */
    private yv0 f23946i;

    /* renamed from: j, reason: collision with root package name */
    private yv0 f23947j;

    /* renamed from: k, reason: collision with root package name */
    private int f23948k;

    /* renamed from: l, reason: collision with root package name */
    private Object f23949l;

    /* renamed from: m, reason: collision with root package name */
    private long f23950m;

    public bw0(InterfaceC2296vc interfaceC2296vc, Handler handler) {
        this.f23940c = interfaceC2296vc;
        this.f23941d = handler;
    }

    private void g() {
        int i4 = sj0.f31764d;
        final sj0.a aVar = new sj0.a();
        for (yv0 yv0Var = this.f23945h; yv0Var != null; yv0Var = yv0Var.b()) {
            aVar.b(yv0Var.f35331f.f23497a);
        }
        yv0 yv0Var2 = this.f23946i;
        final dw0.b bVar = yv0Var2 == null ? null : yv0Var2.f35331f.f23497a;
        this.f23941d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.C0
            @Override // java.lang.Runnable
            public final void run() {
                bw0.this.a(aVar, bVar);
            }
        });
    }

    public final yv0 b() {
        yv0 yv0Var = this.f23946i;
        if (yv0Var == null || yv0Var.b() == null) {
            throw new IllegalStateException();
        }
        this.f23946i = this.f23946i.b();
        g();
        return this.f23946i;
    }

    public final void c() {
        if (this.f23948k == 0) {
            return;
        }
        yv0 yv0Var = this.f23945h;
        if (yv0Var == null) {
            throw new IllegalStateException();
        }
        this.f23949l = yv0Var.f35327b;
        this.f23950m = yv0Var.f35331f.f23497a.f35795d;
        while (yv0Var != null) {
            yv0Var.g();
            yv0Var = yv0Var.b();
        }
        this.f23945h = null;
        this.f23947j = null;
        this.f23946i = null;
        this.f23948k = 0;
        g();
    }

    public final yv0 d() {
        return this.f23947j;
    }

    public final yv0 e() {
        return this.f23945h;
    }

    public final yv0 f() {
        return this.f23946i;
    }

    public final boolean h() {
        yv0 yv0Var = this.f23947j;
        if (yv0Var == null) {
            return true;
        }
        if (yv0Var.f35331f.f23505i || !yv0Var.f35329d) {
            return false;
        }
        return (!yv0Var.f35330e || yv0Var.f35326a.getBufferedPositionUs() == Long.MIN_VALUE) && this.f23947j.f35331f.f23501e != -9223372036854775807L && this.f23948k < 100;
    }

    public final yv0 a() {
        yv0 yv0Var = this.f23945h;
        if (yv0Var == null) {
            return null;
        }
        if (yv0Var == this.f23946i) {
            this.f23946i = yv0Var.b();
        }
        this.f23945h.g();
        int i4 = this.f23948k - 1;
        this.f23948k = i4;
        if (i4 == 0) {
            this.f23947j = null;
            yv0 yv0Var2 = this.f23945h;
            this.f23949l = yv0Var2.f35327b;
            this.f23950m = yv0Var2.f35331f.f23497a.f35795d;
        }
        this.f23945h = this.f23945h.b();
        g();
        return this.f23945h;
    }

    public final yv0 a(to1[] to1VarArr, u52 u52Var, InterfaceC2250tc interfaceC2250tc, gw0 gw0Var, aw0 aw0Var, v52 v52Var) {
        aw0 aw0Var2;
        long c4;
        yv0 yv0Var = this.f23947j;
        if (yv0Var == null) {
            c4 = 1000000000000L;
            aw0Var2 = aw0Var;
        } else {
            aw0Var2 = aw0Var;
            c4 = (yv0Var.c() + this.f23947j.f35331f.f23501e) - aw0Var2.f23498b;
        }
        yv0 yv0Var2 = new yv0(to1VarArr, c4, u52Var, interfaceC2250tc, gw0Var, aw0Var2, v52Var);
        yv0 yv0Var3 = this.f23947j;
        if (yv0Var3 != null) {
            yv0Var3.a(yv0Var2);
        } else {
            this.f23945h = yv0Var2;
            this.f23946i = yv0Var2;
        }
        this.f23949l = null;
        this.f23947j = yv0Var2;
        this.f23948k++;
        g();
        return yv0Var2;
    }

    private aw0 a(x42 x42Var, yv0 yv0Var, long j4) {
        long c4;
        x42 x42Var2;
        long c5;
        Object obj;
        long j5;
        aw0 aw0Var = yv0Var.f35331f;
        long c6 = (yv0Var.c() + aw0Var.f23501e) - j4;
        boolean z4 = false;
        if (aw0Var.f23503g) {
            long j6 = 0;
            int a4 = x42Var.a(x42Var.a(aw0Var.f23497a.f35792a), this.f23938a, this.f23939b, this.f23943f, this.f23944g);
            if (a4 == -1) {
                return null;
            }
            int i4 = x42Var.a(a4, this.f23938a, true).f34405d;
            Object obj2 = this.f23938a.f34404c;
            obj2.getClass();
            long j7 = aw0Var.f23497a.f35795d;
            if (x42Var.a(i4, this.f23939b, 0L).f34432p == a4) {
                Pair<Object, Long> a5 = x42Var.a(this.f23939b, this.f23938a, i4, -9223372036854775807L, Math.max(0L, c6));
                if (a5 == null) {
                    return null;
                }
                Object obj3 = a5.first;
                long longValue = ((Long) a5.second).longValue();
                yv0 b4 = yv0Var.b();
                if (b4 != null && b4.f35327b.equals(obj3)) {
                    j7 = b4.f35331f.f23497a.f35795d;
                } else {
                    j7 = this.f23942e;
                    this.f23942e = 1 + j7;
                }
                obj = obj3;
                j5 = longValue;
                j6 = -9223372036854775807L;
            } else {
                obj = obj2;
                j5 = 0;
            }
            dw0.b a6 = a(x42Var, obj, j5, j7, this.f23939b, this.f23938a);
            if (j6 != -9223372036854775807L && aw0Var.f23499c != -9223372036854775807L) {
                if (x42Var.a(aw0Var.f23497a.f35792a, this.f23938a).a() > 0) {
                    x42.b bVar = this.f23938a;
                    if (bVar.f(bVar.d())) {
                        z4 = true;
                    }
                }
                if (a6.a() && z4) {
                    j6 = aw0Var.f23499c;
                } else if (z4) {
                    j5 = aw0Var.f23499c;
                }
            }
            long j8 = j6;
            x42Var.a(a6.f35792a, this.f23938a);
            if (a6.a()) {
                return a(x42Var, a6.f35792a, a6.f35793b, a6.f35794c, j8, a6.f35795d);
            }
            return a(x42Var, a6.f35792a, j5, j8, a6.f35795d);
        }
        dw0.b bVar2 = aw0Var.f23497a;
        x42Var.a(bVar2.f35792a, this.f23938a);
        if (bVar2.a()) {
            int i5 = bVar2.f35793b;
            int a7 = this.f23938a.a(i5);
            if (a7 == -1) {
                return null;
            }
            int c7 = this.f23938a.c(i5, bVar2.f35794c);
            if (c7 < a7) {
                return a(x42Var, bVar2.f35792a, i5, c7, aw0Var.f23499c, bVar2.f35795d);
            }
            long j9 = aw0Var.f23499c;
            if (j9 == -9223372036854775807L) {
                x42.d dVar = this.f23939b;
                x42.b bVar3 = this.f23938a;
                Pair<Object, Long> a8 = x42Var.a(dVar, bVar3, bVar3.f34405d, -9223372036854775807L, Math.max(0L, c6));
                x42Var2 = x42Var;
                if (a8 == null) {
                    return null;
                }
                j9 = ((Long) a8.second).longValue();
            } else {
                x42Var2 = x42Var;
            }
            Object obj4 = bVar2.f35792a;
            int i6 = bVar2.f35793b;
            x42Var2.a(obj4, this.f23938a);
            long b5 = this.f23938a.b(i6);
            if (b5 == Long.MIN_VALUE) {
                c5 = this.f23938a.f34406e;
            } else {
                c5 = this.f23938a.c(i6) + b5;
            }
            return a(x42Var, bVar2.f35792a, Math.max(c5, j9), aw0Var.f23499c, bVar2.f35795d);
        }
        int d4 = this.f23938a.d(bVar2.f35796e);
        if (this.f23938a.f(bVar2.f35796e) && this.f23938a.b(bVar2.f35796e, d4) == 3) {
            z4 = true;
        }
        if (d4 != this.f23938a.a(bVar2.f35796e) && !z4) {
            return a(x42Var, bVar2.f35792a, bVar2.f35796e, d4, aw0Var.f23501e, bVar2.f35795d);
        }
        Object obj5 = bVar2.f35792a;
        int i7 = bVar2.f35796e;
        x42Var.a(obj5, this.f23938a);
        long b6 = this.f23938a.b(i7);
        if (b6 == Long.MIN_VALUE) {
            c4 = this.f23938a.f34406e;
        } else {
            c4 = this.f23938a.c(i7) + b6;
        }
        return a(x42Var, bVar2.f35792a, c4, aw0Var.f23501e, bVar2.f35795d);
    }

    private aw0 a(x42 x42Var, Object obj, int i4, int i5, long j4, long j5) {
        dw0.b bVar = new dw0.b(obj, i4, i5, j5);
        long a4 = x42Var.a(obj, this.f23938a).a(i4, i5);
        long b4 = i5 == this.f23938a.d(i4) ? this.f23938a.b() : 0L;
        boolean f4 = this.f23938a.f(i4);
        if (a4 != -9223372036854775807L && b4 >= a4) {
            b4 = Math.max(0L, a4 - 1);
        }
        return new aw0(bVar, b4, j4, -9223372036854775807L, a4, f4, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private aw0 a(x42 x42Var, Object obj, long j4, long j5, long j6) {
        boolean z4;
        boolean z5;
        long j7;
        long j8;
        long j9;
        long j10;
        x42Var.a(obj, this.f23938a);
        int a4 = this.f23938a.a(j4);
        int i4 = 1;
        if (a4 == -1) {
            if (this.f23938a.a() > 0) {
                x42.b bVar = this.f23938a;
                if (bVar.f(bVar.d())) {
                    z4 = true;
                }
            }
            z4 = false;
        } else {
            if (this.f23938a.f(a4)) {
                long b4 = this.f23938a.b(a4);
                x42.b bVar2 = this.f23938a;
                if (b4 == bVar2.f34406e && bVar2.e(a4)) {
                    z4 = true;
                    a4 = -1;
                }
            }
            z4 = false;
        }
        dw0.b bVar3 = new dw0.b(a4, j6, obj);
        boolean z6 = !bVar3.a() && a4 == -1;
        if (!bVar3.a() && a4 == -1) {
            if (x42Var.a(x42Var.a(obj, this.f23938a).f34405d, this.f23939b, 0L).f34433q == x42Var.a(obj)) {
                z5 = true;
                boolean a5 = a(x42Var, bVar3, z6);
                boolean z7 = a4 == -1 && this.f23938a.f(a4);
                if (a4 == -1) {
                    j8 = this.f23938a.b(a4);
                    j7 = -9223372036854775807L;
                } else if (z4) {
                    j7 = -9223372036854775807L;
                    j8 = this.f23938a.f34406e;
                } else {
                    j7 = -9223372036854775807L;
                    j8 = -9223372036854775807L;
                }
                j9 = (j8 != j7 || j8 == Long.MIN_VALUE) ? this.f23938a.f34406e : j8;
                if (j9 != j7 || j4 < j9) {
                    j10 = j4;
                } else {
                    if (!a5 && z4) {
                        i4 = 0;
                    }
                    j10 = Math.max(0L, j9 - i4);
                }
                return new aw0(bVar3, j10, j5, j8, j9, z7, z6, z5, a5);
            }
        }
        z5 = false;
        boolean a52 = a(x42Var, bVar3, z6);
        if (a4 == -1) {
        }
        if (a4 == -1) {
        }
        if (j8 != j7) {
        }
        if (j9 != j7) {
        }
        j10 = j4;
        return new aw0(bVar3, j10, j5, j8, j9, z7, z6, z5, a52);
    }

    public final aw0 a(long j4, rh1 rh1Var) {
        yv0 yv0Var = this.f23947j;
        if (yv0Var == null) {
            x42 x42Var = rh1Var.f31192a;
            dw0.b bVar = rh1Var.f31193b;
            long j5 = rh1Var.f31194c;
            long j6 = rh1Var.f31209r;
            x42Var.a(bVar.f35792a, this.f23938a);
            if (bVar.a()) {
                return a(x42Var, bVar.f35792a, bVar.f35793b, bVar.f35794c, j5, bVar.f35795d);
            }
            return a(x42Var, bVar.f35792a, j6, j5, bVar.f35795d);
        }
        return a(rh1Var.f31192a, yv0Var, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aw0 a(x42 x42Var, aw0 aw0Var) {
        boolean z4;
        long j4;
        int i4;
        dw0.b bVar = aw0Var.f23497a;
        boolean z5 = false;
        boolean z6 = !bVar.a() && bVar.f35796e == -1;
        if (!bVar.a() && bVar.f35796e == -1) {
            if (x42Var.a(x42Var.a(bVar.f35792a, this.f23938a).f34405d, this.f23939b, 0L).f34433q == x42Var.a(bVar.f35792a)) {
                z4 = true;
                boolean a4 = a(x42Var, bVar, z6);
                x42Var.a(aw0Var.f23497a.f35792a, this.f23938a);
                long b4 = (!bVar.a() || (i4 = bVar.f35796e) == -1) ? -9223372036854775807L : this.f23938a.b(i4);
                if (!bVar.a()) {
                    j4 = this.f23938a.a(bVar.f35793b, bVar.f35794c);
                } else {
                    j4 = (b4 == -9223372036854775807L || b4 == Long.MIN_VALUE) ? this.f23938a.f34406e : b4;
                }
                if (!bVar.a()) {
                    z5 = this.f23938a.f(bVar.f35793b);
                } else {
                    int i5 = bVar.f35796e;
                    if (i5 != -1 && this.f23938a.f(i5)) {
                        z5 = true;
                    }
                }
                return new aw0(bVar, aw0Var.f23498b, aw0Var.f23499c, b4, j4, z5, z6, z4, a4);
            }
        }
        z4 = false;
        boolean a42 = a(x42Var, bVar, z6);
        x42Var.a(aw0Var.f23497a.f35792a, this.f23938a);
        if (bVar.a()) {
        }
        if (!bVar.a()) {
        }
        if (!bVar.a()) {
        }
        return new aw0(bVar, aw0Var.f23498b, aw0Var.f23499c, b4, j4, z5, z6, z4, a42);
    }

    private boolean a(x42 x42Var, dw0.b bVar, boolean z4) {
        int a4 = x42Var.a(bVar.f35792a);
        return !x42Var.a(x42Var.a(a4, this.f23938a, false).f34405d, this.f23939b, 0L).f34426j && x42Var.a(a4, this.f23938a, this.f23939b, this.f23943f, this.f23944g) == -1 && z4;
    }

    public final boolean a(xv0 xv0Var) {
        yv0 yv0Var = this.f23947j;
        return yv0Var != null && yv0Var.f35326a == xv0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(sj0.a aVar, dw0.b bVar) {
        this.f23940c.a(aVar.a(), bVar);
    }

    public final void a(long j4) {
        yv0 yv0Var = this.f23947j;
        if (yv0Var != null) {
            yv0Var.b(j4);
        }
    }

    public final boolean a(yv0 yv0Var) {
        if (yv0Var != null) {
            boolean z4 = false;
            if (yv0Var.equals(this.f23947j)) {
                return false;
            }
            this.f23947j = yv0Var;
            while (yv0Var.b() != null) {
                yv0Var = yv0Var.b();
                if (yv0Var == this.f23946i) {
                    this.f23946i = this.f23945h;
                    z4 = true;
                }
                yv0Var.g();
                this.f23948k--;
            }
            this.f23947j.a((yv0) null);
            g();
            return z4;
        }
        throw new IllegalStateException();
    }

    private static dw0.b a(x42 x42Var, Object obj, long j4, long j5, x42.d dVar, x42.b bVar) {
        x42Var.a(obj, bVar);
        x42Var.a(bVar.f34405d, dVar, 0L);
        int a4 = x42Var.a(obj);
        while (bVar.f34406e == 0 && bVar.a() > 0 && bVar.f(bVar.d()) && bVar.b(0L) == -1) {
            int i4 = a4 + 1;
            if (a4 >= dVar.f34433q) {
                break;
            }
            x42Var.a(i4, bVar, true);
            obj = bVar.f34404c;
            obj.getClass();
            a4 = i4;
        }
        x42Var.a(obj, bVar);
        int b4 = bVar.b(j4);
        if (b4 == -1) {
            return new dw0.b(bVar.a(j4), j5, obj);
        }
        return new dw0.b(obj, b4, bVar.d(b4), j5);
    }

    public final dw0.b a(x42 x42Var, Object obj, long j4) {
        long j5;
        int a4;
        Object obj2 = obj;
        int i4 = x42Var.a(obj2, this.f23938a).f34405d;
        Object obj3 = this.f23949l;
        if (obj3 != null && (a4 = x42Var.a(obj3)) != -1 && x42Var.a(a4, this.f23938a, false).f34405d == i4) {
            j5 = this.f23950m;
        } else {
            yv0 yv0Var = this.f23945h;
            while (true) {
                if (yv0Var != null) {
                    if (yv0Var.f35327b.equals(obj2)) {
                        j5 = yv0Var.f35331f.f23497a.f35795d;
                        break;
                    }
                    yv0Var = yv0Var.b();
                } else {
                    yv0 yv0Var2 = this.f23945h;
                    while (true) {
                        if (yv0Var2 != null) {
                            int a5 = x42Var.a(yv0Var2.f35327b);
                            if (a5 != -1 && x42Var.a(a5, this.f23938a, false).f34405d == i4) {
                                j5 = yv0Var2.f35331f.f23497a.f35795d;
                                break;
                            }
                            yv0Var2 = yv0Var2.b();
                        } else {
                            j5 = this.f23942e;
                            this.f23942e = 1 + j5;
                            if (this.f23945h == null) {
                                this.f23949l = obj2;
                                this.f23950m = j5;
                            }
                        }
                    }
                }
            }
        }
        long j6 = j5;
        x42Var.a(obj2, this.f23938a);
        x42Var.a(this.f23938a.f34405d, this.f23939b, 0L);
        boolean z4 = false;
        for (int a6 = x42Var.a(obj); a6 >= this.f23939b.f34432p; a6--) {
            x42Var.a(a6, this.f23938a, true);
            boolean z5 = this.f23938a.a() > 0;
            z4 |= z5;
            x42.b bVar = this.f23938a;
            if (bVar.b(bVar.f34406e) != -1) {
                obj2 = this.f23938a.f34404c;
                obj2.getClass();
            }
            if (z4 && (!z5 || this.f23938a.f34406e != 0)) {
                break;
            }
        }
        return a(x42Var, obj2, j4, j6, this.f23939b, this.f23938a);
    }

    private boolean a(x42 x42Var) {
        x42 x42Var2;
        yv0 yv0Var = this.f23945h;
        if (yv0Var == null) {
            return true;
        }
        int a4 = x42Var.a(yv0Var.f35327b);
        while (true) {
            x42Var2 = x42Var;
            a4 = x42Var2.a(a4, this.f23938a, this.f23939b, this.f23943f, this.f23944g);
            while (yv0Var.b() != null && !yv0Var.f35331f.f23503g) {
                yv0Var = yv0Var.b();
            }
            yv0 b4 = yv0Var.b();
            if (a4 == -1 || b4 == null || x42Var2.a(b4.f35327b) != a4) {
                break;
            }
            yv0Var = b4;
            x42Var = x42Var2;
        }
        boolean a5 = a(yv0Var);
        yv0Var.f35331f = a(x42Var2, yv0Var.f35331f);
        return !a5;
    }

    public final boolean a(x42 x42Var, long j4, long j5) {
        aw0 aw0Var;
        aw0 aw0Var2;
        boolean z4;
        aw0 aw0Var3;
        x42 x42Var2 = x42Var;
        yv0 yv0Var = this.f23945h;
        yv0 yv0Var2 = null;
        while (yv0Var != null) {
            aw0 aw0Var4 = yv0Var.f35331f;
            if (yv0Var2 == null) {
                aw0Var = a(x42Var2, aw0Var4);
            } else {
                aw0 a4 = a(x42Var2, yv0Var2, j4);
                if (a4 == null) {
                    return !a(yv0Var2);
                }
                if (aw0Var4.f23498b != a4.f23498b || !aw0Var4.f23497a.equals(a4.f23497a)) {
                    return !a(yv0Var2);
                }
                aw0Var = a4;
            }
            long j6 = aw0Var4.f23499c;
            if (j6 == aw0Var.f23499c) {
                aw0Var2 = aw0Var;
                z4 = true;
                aw0Var3 = aw0Var4;
            } else {
                z4 = true;
                aw0Var3 = aw0Var4;
                aw0Var2 = new aw0(aw0Var.f23497a, aw0Var.f23498b, j6, aw0Var.f23500d, aw0Var.f23501e, aw0Var.f23502f, aw0Var.f23503g, aw0Var.f23504h, aw0Var.f23505i);
            }
            yv0Var.f35331f = aw0Var2;
            long j7 = aw0Var3.f23501e;
            long j8 = aw0Var.f23501e;
            if (j7 != -9223372036854775807L && j7 != j8) {
                xv0 xv0Var = yv0Var.f35326a;
                if (xv0Var instanceof vo) {
                    long j9 = aw0Var2.f23500d;
                    if (j9 == -9223372036854775807L) {
                        j9 = Long.MIN_VALUE;
                    }
                    ((vo) xv0Var).a(j9);
                }
                long j10 = aw0Var.f23501e;
                boolean z5 = (yv0Var != this.f23946i || yv0Var.f35331f.f23502f || (j5 != Long.MIN_VALUE && j5 < ((j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : yv0Var.d(j10)))) ? false : z4;
                if (a(yv0Var) || z5) {
                    return false;
                }
                return z4;
            }
            yv0Var2 = yv0Var;
            yv0Var = yv0Var.b();
            x42Var2 = x42Var;
        }
        return true;
    }

    public final boolean a(x42 x42Var, int i4) {
        this.f23943f = i4;
        return a(x42Var);
    }

    public final boolean a(x42 x42Var, boolean z4) {
        this.f23944g = z4;
        return a(x42Var);
    }
}
