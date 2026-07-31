package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class qw3 extends lx3 {
    private int A;
    private long B;
    private final hw3 C;
    private l74 D;

    /* renamed from: b, reason: collision with root package name */
    final r84 f10861b;

    /* renamed from: c, reason: collision with root package name */
    final z60 f10862c;

    /* renamed from: d, reason: collision with root package name */
    private final xx3[] f10863d;

    /* renamed from: e, reason: collision with root package name */
    private final q84 f10864e;

    /* renamed from: f, reason: collision with root package name */
    private final h52 f10865f;

    /* renamed from: g, reason: collision with root package name */
    private final ax3 f10866g;

    /* renamed from: h, reason: collision with root package name */
    private final nb2<a80> f10867h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet<mm3> f10868i;

    /* renamed from: j, reason: collision with root package name */
    private final pf0 f10869j;

    /* renamed from: k, reason: collision with root package name */
    private final List<pw3> f10870k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f10871l;

    /* renamed from: m, reason: collision with root package name */
    private final e64 f10872m;

    /* renamed from: n, reason: collision with root package name */
    private final q04 f10873n;

    /* renamed from: o, reason: collision with root package name */
    private final Looper f10874o;

    /* renamed from: p, reason: collision with root package name */
    private final a94 f10875p;

    /* renamed from: q, reason: collision with root package name */
    private final xv1 f10876q;

    /* renamed from: r, reason: collision with root package name */
    private int f10877r;

    /* renamed from: s, reason: collision with root package name */
    private int f10878s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10879t;

    /* renamed from: u, reason: collision with root package name */
    private int f10880u;

    /* renamed from: v, reason: collision with root package name */
    private ay3 f10881v;

    /* renamed from: w, reason: collision with root package name */
    private z60 f10882w;

    /* renamed from: x, reason: collision with root package name */
    private fu f10883x;

    /* renamed from: y, reason: collision with root package name */
    private fu f10884y;

    /* renamed from: z, reason: collision with root package name */
    private rx3 f10885z;

    @SuppressLint({"HandlerLeak"})
    public qw3(xx3[] xx3VarArr, q84 q84Var, e64 e64Var, dx3 dx3Var, a94 a94Var, q04 q04Var, boolean z6, ay3 ay3Var, long j7, long j8, gg3 gg3Var, long j9, boolean z7, xv1 xv1Var, Looper looper, final ub0 ub0Var, z60 z60Var, byte[] bArr) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = n13.f8869e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = xx3VarArr.length;
        this.f10863d = xx3VarArr;
        Objects.requireNonNull(q84Var);
        this.f10864e = q84Var;
        this.f10872m = e64Var;
        this.f10875p = a94Var;
        this.f10873n = q04Var;
        this.f10871l = true;
        this.f10881v = ay3Var;
        this.f10874o = looper;
        this.f10876q = xv1Var;
        nb2<a80> nb2Var = new nb2<>(looper, xv1Var, new l92() { // from class: com.google.android.gms.internal.ads.gw3
            @Override // com.google.android.gms.internal.ads.l92
            public final void a(Object obj, yb4 yb4Var) {
            }
        });
        this.f10867h = nb2Var;
        this.f10868i = new CopyOnWriteArraySet<>();
        this.f10870k = new ArrayList();
        this.D = new l74(0);
        r84 r84Var = new r84(new zx3[2], new w74[2], pw0.f10395b, null, null);
        this.f10861b = r84Var;
        this.f10869j = new pf0();
        b50 b50Var = new b50();
        b50Var.c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19, 29);
        b50Var.d(28, true);
        b50Var.b(z60Var);
        z60 e7 = b50Var.e();
        this.f10862c = e7;
        b50 b50Var2 = new b50();
        b50Var2.b(e7);
        b50Var2.a(3);
        b50Var2.a(9);
        this.f10882w = b50Var2.e();
        fu fuVar = fu.f5219t;
        this.f10883x = fuVar;
        this.f10884y = fuVar;
        this.A = -1;
        this.f10865f = xv1Var.a(looper, null);
        hw3 hw3Var = new hw3(this);
        this.C = hw3Var;
        this.f10885z = rx3.h(r84Var);
        q04Var.Q(ub0Var, looper);
        nb2Var.b(q04Var);
        a94Var.b(new Handler(looper), q04Var);
        this.f10866g = new ax3(xx3VarArr, q84Var, r84Var, dx3Var, a94Var, 0, false, q04Var, ay3Var, gg3Var, 500L, false, looper, xv1Var, hw3Var, null);
    }

    private final long A(rx3 rx3Var) {
        if (rx3Var.f11546a.o()) {
            return nz3.c(this.B);
        }
        if (rx3Var.f11547b.b()) {
            return rx3Var.f11564s;
        }
        ei0 ei0Var = rx3Var.f11546a;
        s54 s54Var = rx3Var.f11547b;
        long j7 = rx3Var.f11564s;
        C(ei0Var, s54Var, j7);
        return j7;
    }

    private static long B(rx3 rx3Var) {
        hh0 hh0Var = new hh0();
        pf0 pf0Var = new pf0();
        rx3Var.f11546a.n(rx3Var.f11547b.f5772a, pf0Var);
        long j7 = rx3Var.f11548c;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j8 = rx3Var.f11546a.e(pf0Var.f10218c, hh0Var, 0L).f6258k;
        return 0L;
    }

    private final long C(ei0 ei0Var, s54 s54Var, long j7) {
        ei0Var.n(s54Var.f5772a, this.f10869j);
        return j7;
    }

    private final Pair<Object, Long> D(ei0 ei0Var, int i7, long j7) {
        if (ei0Var.o()) {
            this.A = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.B = j7;
            return null;
        }
        if (i7 == -1 || i7 >= ei0Var.c()) {
            i7 = ei0Var.g(false);
            long j8 = ei0Var.e(i7, this.f8121a, 0L).f6258k;
            j7 = nz3.d(0L);
        }
        return ei0Var.l(this.f8121a, this.f10869j, i7, nz3.c(j7));
    }

    private final rx3 E(rx3 rx3Var, ei0 ei0Var, Pair<Object, Long> pair) {
        long j7;
        rx3 b7;
        wu1.d(ei0Var.o() || pair != null);
        ei0 ei0Var2 = rx3Var.f11546a;
        rx3 g7 = rx3Var.g(ei0Var);
        if (ei0Var.o()) {
            s54 i7 = rx3.i();
            long c7 = nz3.c(this.B);
            rx3 a7 = g7.b(i7, c7, c7, c7, 0L, hm0.f6333d, this.f10861b, e73.w()).a(i7);
            a7.f11562q = a7.f11564s;
            return a7;
        }
        Object obj = g7.f11547b.f5772a;
        int i8 = n13.f8865a;
        boolean z6 = !obj.equals(pair.first);
        s54 s54Var = z6 ? new s54(pair.first) : g7.f11547b;
        long longValue = ((Long) pair.second).longValue();
        long c8 = nz3.c(i());
        if (!ei0Var2.o()) {
            ei0Var2.n(obj, this.f10869j);
        }
        if (z6 || longValue < c8) {
            wu1.f(!s54Var.b());
            rx3 a8 = g7.b(s54Var, longValue, longValue, longValue, 0L, z6 ? hm0.f6333d : g7.f11553h, z6 ? this.f10861b : g7.f11554i, z6 ? e73.w() : g7.f11555j).a(s54Var);
            a8.f11562q = longValue;
            return a8;
        }
        if (longValue == c8) {
            int a9 = ei0Var.a(g7.f11556k.f5772a);
            if (a9 != -1 && ei0Var.d(a9, this.f10869j, false).f10218c == ei0Var.n(s54Var.f5772a, this.f10869j).f10218c) {
                return g7;
            }
            ei0Var.n(s54Var.f5772a, this.f10869j);
            j7 = s54Var.b() ? this.f10869j.f(s54Var.f5773b, s54Var.f5774c) : this.f10869j.f10219d;
            b7 = g7.b(s54Var, g7.f11564s, g7.f11564s, g7.f11549d, j7 - g7.f11564s, g7.f11553h, g7.f11554i, g7.f11555j).a(s54Var);
        } else {
            wu1.f(!s54Var.b());
            long max = Math.max(0L, g7.f11563r - (longValue - c8));
            j7 = g7.f11562q;
            if (g7.f11556k.equals(g7.f11547b)) {
                j7 = longValue + max;
            }
            b7 = g7.b(s54Var, longValue, longValue, longValue, max, g7.f11553h, g7.f11554i, g7.f11555j);
        }
        b7.f11562q = j7;
        return b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0424, code lost:
    
        if (r4.e(e(), r40.f8121a, 0).f6254g != false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04bc A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void F(final rx3 rx3Var, final int i7, final int i8, boolean z6, boolean z7, final int i9, long j7, int i10) {
        Pair pair;
        int i11;
        final zo zoVar;
        boolean z8;
        boolean z9;
        z60 e7;
        int i12;
        Object obj;
        zo zoVar2;
        Object obj2;
        int i13;
        long j8;
        long j9;
        Object obj3;
        zo zoVar3;
        Object obj4;
        int i14;
        rx3 rx3Var2 = this.f10885z;
        this.f10885z = rx3Var;
        boolean z10 = !rx3Var2.f11546a.equals(rx3Var.f11546a);
        ei0 ei0Var = rx3Var2.f11546a;
        ei0 ei0Var2 = rx3Var.f11546a;
        if (ei0Var2.o() && ei0Var.o()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (ei0Var2.o() != ei0Var.o()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (ei0Var.e(ei0Var.n(rx3Var2.f11547b.f5772a, this.f10869j).f10218c, this.f8121a, 0L).f6248a.equals(ei0Var2.e(ei0Var2.n(rx3Var.f11547b.f5772a, this.f10869j).f10218c, this.f8121a, 0L).f6248a)) {
            pair = (z7 && i9 == 0 && rx3Var2.f11547b.f5775d < rx3Var.f11547b.f5775d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z7 && i9 == 0) {
                i11 = 1;
            } else if (z7 && i9 == 1) {
                i11 = 2;
            } else {
                if (!z10) {
                    throw new IllegalStateException();
                }
                i11 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        fu fuVar = this.f10883x;
        if (booleanValue) {
            zo zoVar4 = !rx3Var.f11546a.o() ? rx3Var.f11546a.e(rx3Var.f11546a.n(rx3Var.f11547b.f5772a, this.f10869j).f10218c, this.f8121a, 0L).f6249b : null;
            zoVar = zoVar4;
            fuVar = zoVar4 != null ? zoVar4.f15206e : fu.f5219t;
        } else {
            zoVar = null;
        }
        if (booleanValue || !rx3Var2.f11555j.equals(rx3Var.f11555j)) {
            ds a7 = fuVar.a();
            List<c91> list = rx3Var.f11555j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                c91 c91Var = list.get(i15);
                for (int i16 = 0; i16 < c91Var.a(); i16++) {
                    c91Var.c(i16).b(a7);
                }
            }
            fuVar = a7.B();
        }
        boolean z11 = !fuVar.equals(this.f10883x);
        this.f10883x = fuVar;
        if (!rx3Var2.f11546a.equals(rx3Var.f11546a)) {
            this.f10867h.d(0, new k82() { // from class: com.google.android.gms.internal.ads.bw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj5) {
                    rx3 rx3Var3 = rx3.this;
                    ((a80) obj5).f0(rx3Var3.f11546a, i7);
                }
            });
        }
        if (z7) {
            pf0 pf0Var = new pf0();
            if (rx3Var2.f11546a.o()) {
                z8 = booleanValue;
                i12 = i10;
                obj = null;
                zoVar2 = null;
                obj2 = null;
                i13 = -1;
            } else {
                Object obj5 = rx3Var2.f11547b.f5772a;
                rx3Var2.f11546a.n(obj5, pf0Var);
                int i17 = pf0Var.f10218c;
                int a8 = rx3Var2.f11546a.a(obj5);
                z8 = booleanValue;
                obj = rx3Var2.f11546a.e(i17, this.f8121a, 0L).f6248a;
                zoVar2 = this.f8121a.f6249b;
                obj2 = obj5;
                i12 = i17;
                i13 = a8;
            }
            if (i9 == 0) {
                j8 = pf0Var.f10219d;
                if (rx3Var2.f11547b.b()) {
                    s54 s54Var = rx3Var2.f11547b;
                    j8 = pf0Var.f(s54Var.f5773b, s54Var.f5774c);
                    j9 = B(rx3Var2);
                } else {
                    if (rx3Var2.f11547b.f5776e != -1 && this.f10885z.f11547b.b()) {
                        j8 = B(this.f10885z);
                    }
                    j9 = j8;
                }
            } else if (rx3Var2.f11547b.b()) {
                j8 = rx3Var2.f11564s;
                j9 = B(rx3Var2);
            } else {
                j8 = rx3Var2.f11564s;
                j9 = j8;
            }
            long d7 = nz3.d(j8);
            long d8 = nz3.d(j9);
            s54 s54Var2 = rx3Var2.f11547b;
            final ta0 ta0Var = new ta0(obj, i12, zoVar2, obj2, i13, d7, d8, s54Var2.f5773b, s54Var2.f5774c);
            int e8 = e();
            if (this.f10885z.f11546a.o()) {
                obj3 = null;
                zoVar3 = null;
                obj4 = null;
                i14 = -1;
            } else {
                rx3 rx3Var3 = this.f10885z;
                Object obj6 = rx3Var3.f11547b.f5772a;
                rx3Var3.f11546a.n(obj6, this.f10869j);
                i14 = this.f10885z.f11546a.a(obj6);
                obj4 = obj6;
                obj3 = this.f10885z.f11546a.e(e8, this.f8121a, 0L).f6248a;
                zoVar3 = this.f8121a.f6249b;
            }
            long d9 = nz3.d(j7);
            long d10 = this.f10885z.f11547b.b() ? nz3.d(B(this.f10885z)) : d9;
            s54 s54Var3 = this.f10885z.f11547b;
            final ta0 ta0Var2 = new ta0(obj3, e8, zoVar3, obj4, i14, d9, d10, s54Var3.f5773b, s54Var3.f5774c);
            this.f10867h.d(11, new k82() { // from class: com.google.android.gms.internal.ads.dw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    a80 a80Var = (a80) obj7;
                    a80Var.e0(ta0Var, ta0Var2, i9);
                }
            });
        } else {
            z8 = booleanValue;
        }
        if (z8) {
            this.f10867h.d(1, new k82() { // from class: com.google.android.gms.internal.ads.jw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).k0(zo.this, intValue);
                }
            });
        }
        if (rx3Var2.f11551f != rx3Var.f11551f) {
            this.f10867h.d(10, new k82() { // from class: com.google.android.gms.internal.ads.nw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ll3 ll3Var = rx3.this.f11551f;
                }
            });
            if (rx3Var.f11551f != null) {
                this.f10867h.d(10, new k82() { // from class: com.google.android.gms.internal.ads.ow3
                    @Override // com.google.android.gms.internal.ads.k82
                    public final void c(Object obj7) {
                        ((a80) obj7).n0(rx3.this.f11551f);
                    }
                });
            }
        }
        r84 r84Var = rx3Var2.f11554i;
        r84 r84Var2 = rx3Var.f11554i;
        if (r84Var != r84Var2) {
            this.f10864e.b(r84Var2.f11061d);
            final in0 in0Var = new in0(rx3Var.f11554i.f11062e, null);
            this.f10867h.d(2, new k82() { // from class: com.google.android.gms.internal.ads.cw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    rx3 rx3Var4 = rx3.this;
                    ((a80) obj7).l0(rx3Var4.f11553h, in0Var);
                }
            });
            this.f10867h.d(2, new k82() { // from class: com.google.android.gms.internal.ads.oo3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).h0(rx3.this.f11554i.f11060c);
                }
            });
        }
        if (z11) {
            final fu fuVar2 = this.f10883x;
            this.f10867h.d(14, new k82() { // from class: com.google.android.gms.internal.ads.lw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).j0(fu.this);
                }
            });
        }
        if (rx3Var2.f11552g != rx3Var.f11552g) {
            this.f10867h.d(3, new k82() { // from class: com.google.android.gms.internal.ads.pp3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).b0(rx3.this.f11552g);
                }
            });
        }
        if (rx3Var2.f11550e != rx3Var.f11550e || rx3Var2.f11557l != rx3Var.f11557l) {
            this.f10867h.d(-1, new k82() { // from class: com.google.android.gms.internal.ads.pq3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    rx3 rx3Var4 = rx3.this;
                    ((a80) obj7).g0(rx3Var4.f11557l, rx3Var4.f11550e);
                }
            });
        }
        if (rx3Var2.f11550e != rx3Var.f11550e) {
            this.f10867h.d(4, new k82() { // from class: com.google.android.gms.internal.ads.pr3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).O(rx3.this.f11550e);
                }
            });
        }
        if (rx3Var2.f11557l != rx3Var.f11557l) {
            this.f10867h.d(5, new k82() { // from class: com.google.android.gms.internal.ads.tv3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    rx3 rx3Var4 = rx3.this;
                    ((a80) obj7).d0(rx3Var4.f11557l, i8);
                }
            });
        }
        if (rx3Var2.f11558m != rx3Var.f11558m) {
            this.f10867h.d(6, new k82() { // from class: com.google.android.gms.internal.ads.qs3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).R(rx3.this.f11558m);
                }
            });
        }
        if (G(rx3Var2) != G(rx3Var)) {
            this.f10867h.d(7, new k82() { // from class: com.google.android.gms.internal.ads.rt3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).m0(qw3.G(rx3.this));
                }
            });
        }
        if (!rx3Var2.f11559n.equals(rx3Var.f11559n)) {
            this.f10867h.d(12, new k82() { // from class: com.google.android.gms.internal.ads.su3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).c0(rx3.this.f11559n);
                }
            });
        }
        if (z6) {
            this.f10867h.d(-1, new k82() { // from class: com.google.android.gms.internal.ads.fw3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj7) {
                    ((a80) obj7).o();
                }
            });
        }
        z60 z60Var = this.f10882w;
        z60 z60Var2 = this.f10862c;
        b50 b50Var = new b50();
        b50Var.b(z60Var2);
        b50Var.d(3, !l());
        b50Var.d(4, p() && !l());
        b50Var.d(5, g() && !l());
        b50Var.d(6, !this.f10885z.f11546a.o() && (g() || !m() || p()) && !l());
        b50Var.d(7, c() && !l());
        if (!this.f10885z.f11546a.o()) {
            if (!c()) {
                if (m()) {
                    ei0 ei0Var3 = this.f10885z.f11546a;
                    if (!ei0Var3.o()) {
                    }
                }
            }
            if (!l()) {
                z9 = true;
                b50Var.d(8, z9);
                b50Var.d(9, !l());
                b50Var.d(10, (p() || l()) ? false : true);
                b50Var.d(11, (p() || l()) ? false : true);
                e7 = b50Var.e();
                this.f10882w = e7;
                if (!e7.equals(z60Var)) {
                    this.f10867h.d(13, new k82() { // from class: com.google.android.gms.internal.ads.mw3
                        @Override // com.google.android.gms.internal.ads.k82
                        public final void c(Object obj7) {
                            qw3.this.q((a80) obj7);
                        }
                    });
                }
                this.f10867h.c();
                if (rx3Var2.f11560o != rx3Var.f11560o) {
                    Iterator<mm3> it = this.f10868i.iterator();
                    while (it.hasNext()) {
                        it.next().d(rx3Var.f11560o);
                    }
                }
                if (rx3Var2.f11561p == rx3Var.f11561p) {
                    Iterator<mm3> it2 = this.f10868i.iterator();
                    while (it2.hasNext()) {
                        it2.next().h(rx3Var.f11561p);
                    }
                    return;
                }
                return;
            }
        }
        z9 = false;
        b50Var.d(8, z9);
        b50Var.d(9, !l());
        b50Var.d(10, (p() || l()) ? false : true);
        b50Var.d(11, (p() || l()) ? false : true);
        e7 = b50Var.e();
        this.f10882w = e7;
        if (!e7.equals(z60Var)) {
        }
        this.f10867h.c();
        if (rx3Var2.f11560o != rx3Var.f11560o) {
        }
        if (rx3Var2.f11561p == rx3Var.f11561p) {
        }
    }

    private static boolean G(rx3 rx3Var) {
        return rx3Var.f11550e == 3 && rx3Var.f11557l && rx3Var.f11558m == 0;
    }

    private final int z() {
        if (this.f10885z.f11546a.o()) {
            return this.A;
        }
        rx3 rx3Var = this.f10885z;
        return rx3Var.f11546a.n(rx3Var.f11547b.f5772a, this.f10869j).f10218c;
    }

    public final int H() {
        return this.f10885z.f11550e;
    }

    public final int I() {
        int length = this.f10863d.length;
        return 2;
    }

    public final long J() {
        if (l()) {
            rx3 rx3Var = this.f10885z;
            return rx3Var.f11556k.equals(rx3Var.f11547b) ? nz3.d(this.f10885z.f11562q) : K();
        }
        if (this.f10885z.f11546a.o()) {
            return this.B;
        }
        rx3 rx3Var2 = this.f10885z;
        long j7 = 0;
        if (rx3Var2.f11556k.f5775d != rx3Var2.f11547b.f5775d) {
            return nz3.d(rx3Var2.f11546a.e(e(), this.f8121a, 0L).f6259l);
        }
        long j8 = rx3Var2.f11562q;
        if (this.f10885z.f11556k.b()) {
            rx3 rx3Var3 = this.f10885z;
            rx3Var3.f11546a.n(rx3Var3.f11556k.f5772a, this.f10869j).g(this.f10885z.f11556k.f5773b);
        } else {
            j7 = j8;
        }
        rx3 rx3Var4 = this.f10885z;
        C(rx3Var4.f11546a, rx3Var4.f11556k, j7);
        return nz3.d(j7);
    }

    public final long K() {
        long f7;
        if (l()) {
            rx3 rx3Var = this.f10885z;
            s54 s54Var = rx3Var.f11547b;
            rx3Var.f11546a.n(s54Var.f5772a, this.f10869j);
            f7 = this.f10869j.f(s54Var.f5773b, s54Var.f5774c);
        } else {
            ei0 ei0Var = this.f10885z.f11546a;
            if (ei0Var.o()) {
                return -9223372036854775807L;
            }
            f7 = ei0Var.e(e(), this.f8121a, 0L).f6259l;
        }
        return nz3.d(f7);
    }

    public final Looper L() {
        return this.f10874o;
    }

    public final ux3 M(tx3 tx3Var) {
        return new ux3(this.f10866g, tx3Var, this.f10885z.f11546a, e(), this.f10876q, this.f10866g.Q());
    }

    public final void N(mm3 mm3Var) {
        this.f10868i.add(mm3Var);
    }

    public final void O(a80 a80Var) {
        this.f10867h.b(a80Var);
    }

    final /* synthetic */ void P(yw3 yw3Var) {
        long j7;
        boolean z6;
        long j8;
        int i7 = this.f10877r - yw3Var.f14840c;
        this.f10877r = i7;
        boolean z7 = true;
        if (yw3Var.f14841d) {
            this.f10878s = yw3Var.f14842e;
            this.f10879t = true;
        }
        if (yw3Var.f14843f) {
            this.f10880u = yw3Var.f14844g;
        }
        if (i7 == 0) {
            ei0 ei0Var = yw3Var.f14839b.f11546a;
            if (!this.f10885z.f11546a.o() && ei0Var.o()) {
                this.A = -1;
                this.B = 0L;
            }
            if (!ei0Var.o()) {
                List<ei0> y6 = ((vx3) ei0Var).y();
                wu1.f(y6.size() == this.f10870k.size());
                for (int i8 = 0; i8 < y6.size(); i8++) {
                    this.f10870k.get(i8).f10405b = y6.get(i8);
                }
            }
            if (this.f10879t) {
                if (yw3Var.f14839b.f11547b.equals(this.f10885z.f11547b) && yw3Var.f14839b.f11549d == this.f10885z.f11564s) {
                    z7 = false;
                }
                if (z7) {
                    if (ei0Var.o() || yw3Var.f14839b.f11547b.b()) {
                        j8 = yw3Var.f14839b.f11549d;
                    } else {
                        rx3 rx3Var = yw3Var.f14839b;
                        s54 s54Var = rx3Var.f11547b;
                        j8 = rx3Var.f11549d;
                        C(ei0Var, s54Var, j8);
                    }
                    z6 = z7;
                    j7 = j8;
                } else {
                    j7 = -9223372036854775807L;
                    z6 = z7;
                }
            } else {
                j7 = -9223372036854775807L;
                z6 = false;
            }
            this.f10879t = false;
            F(yw3Var.f14839b, 1, this.f10880u, false, z6, this.f10878s, j7, -1);
        }
    }

    final /* synthetic */ void Q(final yw3 yw3Var) {
        this.f10865f.F(new Runnable() { // from class: com.google.android.gms.internal.ads.iw3
            @Override // java.lang.Runnable
            public final void run() {
                qw3.this.P(yw3Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final void a(int i7, long j7) {
        ei0 ei0Var = this.f10885z.f11546a;
        if (i7 < 0 || (!ei0Var.o() && i7 >= ei0Var.c())) {
            throw new d1(ei0Var, i7, j7);
        }
        this.f10877r++;
        if (l()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            yw3 yw3Var = new yw3(this.f10885z);
            yw3Var.a(1);
            this.C.f6445a.Q(yw3Var);
            return;
        }
        int i8 = this.f10885z.f11550e != 1 ? 2 : 1;
        int e7 = e();
        rx3 E = E(this.f10885z.f(i8), ei0Var, D(ei0Var, i7, j7));
        this.f10866g.W(ei0Var, i7, nz3.c(j7));
        F(E, 0, 1, true, true, 1, A(E), e7);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int b() {
        if (l()) {
            return this.f10885z.f11547b.f5773b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int d() {
        if (l()) {
            return this.f10885z.f11547b.f5774c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int e() {
        int z6 = z();
        if (z6 == -1) {
            return 0;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int f() {
        if (this.f10885z.f11546a.o()) {
            return 0;
        }
        rx3 rx3Var = this.f10885z;
        return rx3Var.f11546a.a(rx3Var.f11547b.f5772a);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final long i() {
        if (!l()) {
            return j();
        }
        rx3 rx3Var = this.f10885z;
        rx3Var.f11546a.n(rx3Var.f11547b.f5772a, this.f10869j);
        rx3 rx3Var2 = this.f10885z;
        if (rx3Var2.f11548c != -9223372036854775807L) {
            return nz3.d(0L) + nz3.d(this.f10885z.f11548c);
        }
        long j7 = rx3Var2.f11546a.e(e(), this.f8121a, 0L).f6258k;
        return nz3.d(0L);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final long j() {
        return nz3.d(A(this.f10885z));
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final long k() {
        return nz3.d(this.f10885z.f11563r);
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final boolean l() {
        return this.f10885z.f11547b.b();
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ub0
    public final ei0 o() {
        return this.f10885z.f11546a;
    }

    final /* synthetic */ void q(a80 a80Var) {
        a80Var.i0(this.f10882w);
    }

    public final void s() {
        rx3 rx3Var = this.f10885z;
        if (rx3Var.f11550e != 1) {
            return;
        }
        rx3 e7 = rx3Var.e(null);
        rx3 f7 = e7.f(true != e7.f11546a.o() ? 2 : 4);
        this.f10877r++;
        this.f10866g.V();
        F(f7, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void t() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = n13.f8869e;
        String a7 = v84.a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a7).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a7);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f10866g.Z()) {
            nb2<a80> nb2Var = this.f10867h;
            nb2Var.d(10, new k82() { // from class: com.google.android.gms.internal.ads.ew3
                @Override // com.google.android.gms.internal.ads.k82
                public final void c(Object obj) {
                    ((a80) obj).n0(ll3.d(new bx3(1), 1003));
                }
            });
            nb2Var.c();
        }
        this.f10867h.e();
        this.f10865f.H(null);
        q04 q04Var = this.f10873n;
        if (q04Var != null) {
            this.f10875p.c(q04Var);
        }
        rx3 f7 = this.f10885z.f(1);
        this.f10885z = f7;
        rx3 a8 = f7.a(f7.f11547b);
        this.f10885z = a8;
        a8.f11562q = a8.f11564s;
        this.f10885z.f11563r = 0L;
    }

    public final void u(List<v54> list, boolean z6) {
        z();
        j();
        this.f10877r++;
        if (!this.f10870k.isEmpty()) {
            int size = this.f10870k.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                this.f10870k.remove(i7);
            }
            this.D = this.D.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ox3 ox3Var = new ox3(list.get(i8), this.f10871l);
            arrayList.add(ox3Var);
            this.f10870k.add(i8, new pw3(ox3Var.f9877b, ox3Var.f9876a.F()));
        }
        this.D = this.D.g(0, arrayList.size());
        vx3 vx3Var = new vx3(this.f10870k, this.D, null);
        if (!vx3Var.o() && vx3Var.c() < 0) {
            throw new d1(vx3Var, -1, -9223372036854775807L);
        }
        int g7 = vx3Var.g(false);
        rx3 E = E(this.f10885z, vx3Var, D(vx3Var, g7, -9223372036854775807L));
        int i9 = E.f11550e;
        if (g7 != -1 && i9 != 1) {
            i9 = (vx3Var.o() || g7 >= vx3Var.c()) ? 4 : 2;
        }
        rx3 f7 = E.f(i9);
        this.f10866g.a0(arrayList, g7, nz3.c(-9223372036854775807L), this.D);
        F(f7, 0, 1, false, (this.f10885z.f11547b.f5772a.equals(f7.f11547b.f5772a) || this.f10885z.f11546a.o()) ? false : true, 4, A(f7), -1);
    }

    public final void v(boolean z6, int i7, int i8) {
        rx3 rx3Var = this.f10885z;
        if (rx3Var.f11557l == z6 && rx3Var.f11558m == i7) {
            return;
        }
        this.f10877r++;
        rx3 d7 = rx3Var.d(z6, i7);
        this.f10866g.X(z6, i7);
        F(d7, 0, i8, false, false, 5, -9223372036854775807L, -1);
    }

    public final void w(boolean z6, ll3 ll3Var) {
        rx3 rx3Var = this.f10885z;
        rx3 a7 = rx3Var.a(rx3Var.f11547b);
        a7.f11562q = a7.f11564s;
        a7.f11563r = 0L;
        rx3 f7 = a7.f(1);
        if (ll3Var != null) {
            f7 = f7.e(ll3Var);
        }
        rx3 rx3Var2 = f7;
        this.f10877r++;
        this.f10866g.Y();
        F(rx3Var2, 0, 1, false, rx3Var2.f11546a.o() && !this.f10885z.f11546a.o(), 4, A(rx3Var2), -1);
    }

    public final boolean x() {
        return this.f10885z.f11561p;
    }

    public final boolean y() {
        return this.f10885z.f11557l;
    }
}
