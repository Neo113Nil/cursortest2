package a0;

import T.C0097o;
import T.U;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import q0.C1353B;
import q0.C1362d;
import q0.C1375q;
import q0.C1378u;
import t0.C1426a;
import t0.C1427b;
import t0.C1428c;
import t0.C1435j;
import v2.AbstractC1478z;
import v2.C1467n;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3988a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3989b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.b0[] f3990c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3991d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3992e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3993f;

    /* renamed from: g, reason: collision with root package name */
    public U f3994g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3995h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f3996i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0135a[] f3997j;

    /* renamed from: k, reason: collision with root package name */
    public final t0.w f3998k;

    /* renamed from: l, reason: collision with root package name */
    public final f0 f3999l;

    /* renamed from: m, reason: collision with root package name */
    public T f4000m;
    public q0.j0 n;
    public t0.x o;

    /* renamed from: p, reason: collision with root package name */
    public long f4001p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q0.d] */
    public T(AbstractC0135a[] abstractC0135aArr, long j4, t0.w wVar, B1.j jVar, f0 f0Var, U u4, t0.x xVar) {
        this.f3997j = abstractC0135aArr;
        this.f4001p = j4;
        this.f3998k = wVar;
        this.f3999l = f0Var;
        C1353B c1353b = u4.f4002a;
        this.f3989b = c1353b.f14812a;
        this.f3994g = u4;
        this.n = q0.j0.f15033d;
        this.o = xVar;
        this.f3990c = new q0.b0[abstractC0135aArr.length];
        this.f3996i = new boolean[abstractC0135aArr.length];
        long j5 = u4.f4003b;
        long j6 = u4.f4005d;
        boolean z = u4.f4007f;
        f0Var.getClass();
        Object obj = c1353b.f14812a;
        int i4 = l0.f4182k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C1353B a3 = c1353b.a(pair.second);
        e0 e0Var = (e0) f0Var.f4113d.get(obj2);
        e0Var.getClass();
        f0Var.f4116g.add(e0Var);
        d0 d0Var = (d0) f0Var.f4115f.get(e0Var);
        if (d0Var != null) {
            d0Var.f4085a.e(d0Var.f4086b);
        }
        e0Var.f4103c.add(a3);
        C1378u b4 = e0Var.f4101a.b(a3, jVar, j5);
        f0Var.f4112c.put(b4, e0Var);
        f0Var.c();
        this.f3988a = j6 != -9223372036854775807L ? new C1362d(b4, !z, 0L, j6) : b4;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, q0.z] */
    public final long a(t0.x xVar, long j4, boolean z, boolean[] zArr) {
        AbstractC0135a[] abstractC0135aArr;
        q0.b0[] b0VarArr;
        int i4 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 >= xVar.f15384a) {
                break;
            }
            if (z || !xVar.a(this.o, i4)) {
                z4 = false;
            }
            this.f3996i[i4] = z4;
            i4++;
        }
        int i5 = 0;
        while (true) {
            abstractC0135aArr = this.f3997j;
            int length = abstractC0135aArr.length;
            b0VarArr = this.f3990c;
            if (i5 >= length) {
                break;
            }
            if (abstractC0135aArr[i5].f4038b == -2) {
                b0VarArr[i5] = null;
            }
            i5++;
        }
        b();
        this.o = xVar;
        c();
        long d4 = this.f3988a.d(xVar.f15386c, this.f3996i, this.f3990c, zArr, j4);
        for (int i6 = 0; i6 < abstractC0135aArr.length; i6++) {
            if (abstractC0135aArr[i6].f4038b == -2 && this.o.b(i6)) {
                b0VarArr[i6] = new C1375q();
            }
        }
        this.f3993f = false;
        for (int i7 = 0; i7 < b0VarArr.length; i7++) {
            if (b0VarArr[i7] != null) {
                AbstractC0124a.t(xVar.b(i7));
                if (abstractC0135aArr[i7].f4038b != -2) {
                    this.f3993f = true;
                }
            } else {
                AbstractC0124a.t(xVar.f15386c[i7] == null);
            }
        }
        return d4;
    }

    public final void b() {
        if (this.f4000m != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            t0.x xVar = this.o;
            if (i4 >= xVar.f15384a) {
                return;
            }
            boolean b4 = xVar.b(i4);
            t0.t tVar = this.o.f15386c[i4];
            if (b4 && tVar != null) {
                tVar.i();
            }
            i4++;
        }
    }

    public final void c() {
        if (this.f4000m != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            t0.x xVar = this.o;
            if (i4 >= xVar.f15384a) {
                return;
            }
            boolean b4 = xVar.b(i4);
            t0.t tVar = this.o.f15386c[i4];
            if (b4 && tVar != null) {
                tVar.g();
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, q0.d0] */
    public final long d() {
        if (!this.f3992e) {
            return this.f3994g.f4003b;
        }
        long u4 = this.f3993f ? this.f3988a.u() : Long.MIN_VALUE;
        return u4 == Long.MIN_VALUE ? this.f3994g.f4006e : u4;
    }

    public final long e() {
        return this.f3994g.f4003b + this.f4001p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, q0.z] */
    public final void f(float f4, T.T t4, boolean z) {
        this.f3992e = true;
        this.n = this.f3988a.t();
        t0.x j4 = j(f4, t4, z);
        U u4 = this.f3994g;
        long j5 = u4.f4003b;
        long j6 = u4.f4006e;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, j6 - 1);
        }
        long a3 = a(j4, j5, false, new boolean[this.f3997j.length]);
        long j7 = this.f4001p;
        U u5 = this.f3994g;
        this.f4001p = (u5.f4003b - a3) + j7;
        this.f3994g = u5.b(a3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, q0.d0] */
    public final boolean g() {
        if (this.f3992e) {
            return !this.f3993f || this.f3988a.u() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f3992e) {
            return g() || d() - this.f3994g.f4003b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q0.z] */
    public final void i() {
        b();
        ?? r02 = this.f3988a;
        try {
            boolean z = r02 instanceof C1362d;
            f0 f0Var = this.f3999l;
            if (z) {
                f0Var.f(((C1362d) r02).f14984a);
            } else {
                f0Var.f(r02);
            }
        } catch (RuntimeException e4) {
            AbstractC0108a.f("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final t0.x j(float f4, T.T t4, boolean z) {
        final t0.l lVar;
        final boolean z4;
        final String str;
        T.U u4;
        Pair pair;
        Object obj;
        long j4;
        boolean z5;
        boolean z6;
        v2.a0 a0Var;
        t0.t c1428c;
        u0.d dVar;
        int i4;
        int[] iArr;
        T.U u5;
        int i5;
        int[] iArr2;
        int[][] iArr3;
        int[] iArr4;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr5;
        t0.w wVar = this.f3998k;
        AbstractC0135a[] abstractC0135aArr = this.f3997j;
        q0.j0 j0Var = this.n;
        wVar.getClass();
        int i6 = 1;
        int[] iArr6 = new int[abstractC0135aArr.length + 1];
        int length = abstractC0135aArr.length + 1;
        T.U[][] uArr = new T.U[length][];
        int[][][] iArr7 = new int[abstractC0135aArr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = j0Var.f15034a;
            uArr[i7] = new T.U[i8];
            iArr7[i7] = new int[i8][];
        }
        int length2 = abstractC0135aArr.length;
        final int[] iArr8 = new int[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            iArr8[i9] = abstractC0135aArr[i9].E();
        }
        int i10 = 0;
        while (i10 < j0Var.f15034a) {
            T.U a3 = j0Var.a(i10);
            int i11 = a3.f2707c == 5 ? i6 : 0;
            int length3 = abstractC0135aArr.length;
            int i12 = i6;
            int i13 = 0;
            int i14 = 0;
            while (i14 < abstractC0135aArr.length) {
                AbstractC0135a abstractC0135a = abstractC0135aArr[i14];
                t0.w wVar2 = wVar;
                q0.j0 j0Var2 = j0Var;
                int i15 = i6;
                int i16 = 0;
                for (int i17 = 0; i17 < a3.f2705a; i17++) {
                    i16 = Math.max(i16, abstractC0135a.D(a3.f2708d[i17]) & 7);
                }
                int i18 = iArr6[i14] == 0 ? i15 : 0;
                if (i16 > i13 || (i16 == i13 && i11 != 0 && i12 == 0 && i18 != 0)) {
                    i13 = i16;
                    i12 = i18;
                    length3 = i14;
                }
                i14++;
                i6 = i15;
                wVar = wVar2;
                j0Var = j0Var2;
            }
            t0.w wVar3 = wVar;
            q0.j0 j0Var3 = j0Var;
            int i19 = i6;
            if (length3 == abstractC0135aArr.length) {
                iArr5 = new int[a3.f2705a];
            } else {
                AbstractC0135a abstractC0135a2 = abstractC0135aArr[length3];
                int[] iArr9 = new int[a3.f2705a];
                for (int i20 = 0; i20 < a3.f2705a; i20++) {
                    iArr9[i20] = abstractC0135a2.D(a3.f2708d[i20]);
                }
                iArr5 = iArr9;
            }
            int i21 = iArr6[length3];
            uArr[length3][i21] = a3;
            iArr7[length3][i21] = iArr5;
            iArr6[length3] = i21 + 1;
            i10++;
            i6 = i19;
            wVar = wVar3;
            j0Var = j0Var3;
        }
        t0.w wVar4 = wVar;
        int i22 = i6;
        int i23 = 0;
        int i24 = 7;
        q0.j0[] j0VarArr = new q0.j0[abstractC0135aArr.length];
        String[] strArr = new String[abstractC0135aArr.length];
        int[] iArr10 = new int[abstractC0135aArr.length];
        for (int i25 = 0; i25 < abstractC0135aArr.length; i25++) {
            int i26 = iArr6[i25];
            j0VarArr[i25] = new q0.j0((T.U[]) W.J.O(i26, uArr[i25]));
            iArr7[i25] = (int[][]) W.J.O(i26, iArr7[i25]);
            strArr[i25] = abstractC0135aArr[i25].k();
            iArr10[i25] = abstractC0135aArr[i25].f4038b;
        }
        t0.v vVar = new t0.v(iArr10, j0VarArr, iArr8, iArr7, new q0.j0((T.U[]) W.J.O(iArr6[abstractC0135aArr.length], uArr[abstractC0135aArr.length])));
        final t0.r rVar = (t0.r) wVar4;
        synchronized (rVar.f15366c) {
            rVar.f15370g = Thread.currentThread();
            lVar = rVar.f15369f;
        }
        if (rVar.f15373j == null && (context = rVar.f15367d) != null) {
            rVar.f15373j = Boolean.valueOf(W.J.K(context));
        }
        if (lVar.f15327A && Build.VERSION.SDK_INT >= 32 && rVar.f15371h == null) {
            rVar.f15371h = new U.b(rVar.f15367d, rVar, rVar.f15373j);
        }
        int i27 = vVar.f15376a;
        Context context2 = rVar.f15367d;
        t0.s[] sVarArr = new t0.s[i27];
        int i28 = 0;
        while (true) {
            if (i28 >= vVar.f15376a) {
                z4 = 0;
                break;
            }
            if (2 == iArr10[i28] && j0VarArr[i28].f15034a > 0) {
                z4 = i22;
                break;
            }
            i28++;
        }
        Pair g4 = t0.r.g(i22, vVar, iArr7, new t0.o() { // from class: t0.f
            @Override // t0.o
            public final a0 a(int i29, U u6, int[] iArr11) {
                r rVar2 = r.this;
                rVar2.getClass();
                l lVar2 = lVar;
                C1432g c1432g = new C1432g(rVar2, lVar2);
                int i30 = iArr8[i29];
                F j5 = I.j();
                for (int i31 = 0; i31 < u6.f2705a; i31++) {
                    j5.b(new C1433h(i29, u6, i31, lVar2, iArr11[i31], z4, c1432g, i30));
                }
                return j5.f();
            }
        }, new B.c(11));
        if (g4 != null) {
            sVarArr[((Integer) g4.second).intValue()] = (t0.s) g4.first;
        }
        if (g4 == null) {
            str = null;
        } else {
            t0.s sVar = (t0.s) g4.first;
            str = sVar.f15374a.f2708d[sVar.f15375b[0]].f2859d;
        }
        lVar.f2746q.getClass();
        final Point w4 = (!lVar.f2738g || context2 == null) ? null : W.J.w(context2);
        Pair g5 = t0.r.g(2, vVar, iArr7, new t0.o() { // from class: t0.e
            /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
            @Override // t0.o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final a0 a(int i29, U u6, int[] iArr11) {
                int i30;
                int i31;
                int i32;
                int i33;
                Point point;
                int i34;
                int i35;
                U u7 = u6;
                int i36 = iArr8[i29];
                l lVar2 = l.this;
                Point point2 = w4;
                int i37 = point2 != null ? point2.x : lVar2.f2736e;
                int i38 = point2 != null ? point2.y : lVar2.f2737f;
                boolean z7 = lVar2.f2739h;
                if (i37 == Integer.MAX_VALUE || i38 == Integer.MAX_VALUE) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    int i39 = Integer.MAX_VALUE;
                    for (int i40 = 0; i40 < u7.f2705a; i40++) {
                        C0097o c0097o = u7.f2708d[i40];
                        int i41 = c0097o.f2874u;
                        int i42 = c0097o.v;
                        if (i41 > 0 && i42 > 0) {
                            if (z7) {
                                if ((i41 > i42) != (i37 > i38)) {
                                    i33 = i38;
                                    i32 = i37;
                                    int i43 = i41 * i32;
                                    int i44 = i42 * i33;
                                    point = i43 < i44 ? new Point(i33, J.g(i44, i41)) : new Point(J.g(i43, i42), i32);
                                    i34 = c0097o.f2874u;
                                    i35 = i34 * i42;
                                    if (i34 >= ((int) (point.x * 0.98f)) && i42 >= ((int) (point.y * 0.98f)) && i35 < i39) {
                                        i39 = i35;
                                    }
                                }
                            }
                            i32 = i38;
                            i33 = i37;
                            int i432 = i41 * i32;
                            int i442 = i42 * i33;
                            if (i432 < i442) {
                            }
                            i34 = c0097o.f2874u;
                            i35 = i34 * i42;
                            if (i34 >= ((int) (point.x * 0.98f))) {
                                i39 = i35;
                            }
                        }
                    }
                    i30 = i39;
                }
                F j5 = I.j();
                int i45 = 0;
                while (i45 < u7.f2705a) {
                    C0097o c0097o2 = u7.f2708d[i45];
                    int i46 = c0097o2.f2874u;
                    int i47 = (i46 == -1 || (i31 = c0097o2.v) == -1) ? -1 : i46 * i31;
                    j5.b(new q(i29, u7, i45, lVar2, iArr11[i45], str, i36, i30 == Integer.MAX_VALUE || (i47 != -1 && i47 <= i30)));
                    i45++;
                    u7 = u6;
                }
                return j5.f();
            }
        }, new B.c(10));
        int i29 = 4;
        if (g5 == null) {
            u4 = null;
            pair = t0.r.g(4, vVar, iArr7, new io.appmetrica.analytics.flutter.pigeon.a(6, lVar), new B.c(9));
        } else {
            u4 = null;
            pair = null;
        }
        if (pair != null) {
            sVarArr[((Integer) pair.second).intValue()] = (t0.s) pair.first;
        } else if (g5 != null) {
            sVarArr[((Integer) g5.second).intValue()] = (t0.s) g5.first;
        }
        if (!lVar.f2749t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            obj = u4;
        } else {
            String str2 = W.J.f3263a;
            obj = locale.toLanguageTag();
        }
        int i30 = 3;
        Pair g6 = t0.r.g(3, vVar, iArr7, new Q1.b(lVar, str, obj, i24), new B.c(12));
        if (g6 != null) {
            sVarArr[((Integer) g6.second).intValue()] = (t0.s) g6.first;
        }
        int i31 = 0;
        while (i31 < i27) {
            int i32 = iArr10[i31];
            if (i32 == 2 || i32 == 1 || i32 == i30 || i32 == i29) {
                i5 = i31;
                iArr2 = iArr10;
            } else {
                q0.j0 j0Var4 = j0VarArr[i31];
                int[][] iArr11 = iArr7[i31];
                int i33 = i23;
                int i34 = i33;
                T.U u6 = u4;
                T.U u7 = u6;
                while (i33 < j0Var4.f15034a) {
                    T.U a4 = j0Var4.a(i33);
                    int[] iArr12 = iArr11[i33];
                    int i35 = i31;
                    q0.j0 j0Var5 = j0Var4;
                    C1435j c1435j = u7;
                    int i36 = i34;
                    T.U u8 = u6;
                    int i37 = i23;
                    while (i37 < a4.f2705a) {
                        int i38 = i37;
                        if (AbstractC0135a.n(iArr12[i37], lVar.f15328B)) {
                            iArr3 = iArr11;
                            C1435j c1435j2 = new C1435j(a4.f2708d[i38], iArr12[i38]);
                            if (c1435j != 0) {
                                iArr4 = iArr10;
                                if (AbstractC1478z.f15691a.c(c1435j2.f15317b, c1435j.f15317b).c(c1435j2.f15316a, c1435j.f15316a).e() <= 0) {
                                }
                            } else {
                                iArr4 = iArr10;
                            }
                            c1435j = c1435j2;
                            u8 = a4;
                            i36 = i38;
                        } else {
                            iArr3 = iArr11;
                            iArr4 = iArr10;
                        }
                        i37 = i38 + 1;
                        iArr11 = iArr3;
                        iArr10 = iArr4;
                        c1435j = c1435j;
                    }
                    i33++;
                    u6 = u8;
                    i34 = i36;
                    j0Var4 = j0Var5;
                    u7 = c1435j;
                    i31 = i35;
                }
                i5 = i31;
                iArr2 = iArr10;
                sVarArr[i5] = u6 == null ? u4 : new t0.s(i23, u6, new int[]{i34});
            }
            i31 = i5 + 1;
            iArr10 = iArr2;
            i23 = 0;
            i30 = 3;
            i29 = 4;
        }
        int i39 = vVar.f15376a;
        q0.j0[] j0VarArr2 = vVar.f15378c;
        HashMap hashMap = new HashMap();
        for (int i40 = 0; i40 < i39; i40++) {
            t0.r.c(j0VarArr2[i40], lVar, hashMap);
        }
        t0.r.c(vVar.f15381f, lVar, hashMap);
        for (int i41 = 0; i41 < i39; i41++) {
            T.V v = (T.V) hashMap.get(Integer.valueOf(vVar.f15377b[i41]));
            if (v != null) {
                T.U u9 = v.f2710a;
                v2.I i42 = v.f2711b;
                sVarArr[i41] = (i42.isEmpty() || j0VarArr2[i41].b(u9) == -1) ? u4 : new t0.s(0, u9, O3.d.F(i42));
            }
        }
        int i43 = vVar.f15376a;
        for (int i44 = 0; i44 < i43; i44++) {
            q0.j0 j0Var6 = vVar.f15378c[i44];
            Map map = (Map) lVar.f15330D.get(i44);
            if (map != null && map.containsKey(j0Var6)) {
                Map map2 = (Map) lVar.f15330D.get(i44);
                if (map2 != null && map2.get(j0Var6) != null) {
                    throw new ClassCastException();
                }
                sVarArr[i44] = u4;
            }
        }
        for (int i45 = 0; i45 < i27; i45++) {
            int i46 = vVar.f15377b[i45];
            if (lVar.f15331E.get(i45) || lVar.v.contains(Integer.valueOf(i46))) {
                sVarArr[i45] = u4;
            }
        }
        C1427b c1427b = rVar.f15368e;
        u0.d dVar2 = rVar.f15383b;
        dVar2.getClass();
        c1427b.getClass();
        ArrayList arrayList = new ArrayList();
        int i47 = 0;
        while (i47 < sVarArr.length) {
            t0.s sVar2 = sVarArr[i47];
            if (sVar2 == 0 || sVar2.f15375b.length <= 1) {
                u5 = u4;
                arrayList.add(u5);
            } else {
                v2.F j5 = v2.I.j();
                j5.b(new C1426a(0L, 0L));
                arrayList.add(j5);
                u5 = u4;
            }
            i47++;
            u4 = u5;
        }
        int length4 = sVarArr.length;
        long[][] jArr = new long[length4][];
        int i48 = 0;
        while (true) {
            j4 = -1;
            if (i48 >= sVarArr.length) {
                break;
            }
            t0.s sVar3 = sVarArr[i48];
            if (sVar3 == 0) {
                jArr[i48] = new long[0];
            } else {
                int[] iArr13 = sVar3.f15375b;
                jArr[i48] = new long[iArr13.length];
                int i49 = 0;
                while (i49 < iArr13.length) {
                    int i50 = i49;
                    long j6 = sVar3.f15374a.f2708d[iArr13[i49]].f2865j;
                    long[] jArr2 = jArr[i48];
                    if (j6 == -1) {
                        j6 = 0;
                    }
                    jArr2[i50] = j6;
                    i49 = i50 + 1;
                }
                Arrays.sort(jArr[i48]);
            }
            i48++;
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i51 = 0; i51 < length4; i51++) {
            long[] jArr4 = jArr[i51];
            jArr3[i51] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C1428c.v(arrayList, jArr3);
        v2.r.d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(v2.Y.f15597b);
        v2.V v4 = new v2.V();
        v2.W w5 = new v2.W(treeMap);
        w5.f15596f = v4;
        int i52 = 0;
        while (i52 < length4) {
            long[] jArr5 = jArr[i52];
            long j7 = j4;
            if (jArr5.length <= 1) {
                dVar = dVar2;
                i4 = length4;
                iArr = iArr14;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                dVar = dVar2;
                int i53 = 0;
                while (true) {
                    long[] jArr6 = jArr[i52];
                    i4 = length4;
                    double d4 = 0.0d;
                    if (i53 >= jArr6.length) {
                        break;
                    }
                    int[] iArr15 = iArr14;
                    long j8 = jArr6[i53];
                    if (j8 != j7) {
                        d4 = Math.log(j8);
                    }
                    dArr[i53] = d4;
                    i53++;
                    length4 = i4;
                    iArr14 = iArr15;
                }
                iArr = iArr14;
                int i54 = length5 - 1;
                double d5 = dArr[i54] - dArr[0];
                int i55 = 0;
                while (i55 < i54) {
                    double d6 = dArr[i55];
                    int i56 = i55 + 1;
                    Double valueOf = Double.valueOf(d5 == 0.0d ? 1.0d : (((d6 + dArr[i56]) * 0.5d) - dArr[0]) / d5);
                    Integer valueOf2 = Integer.valueOf(i52);
                    double d7 = d5;
                    Map map3 = w5.f15594d;
                    Collection collection = (Collection) map3.get(valueOf);
                    if (collection == null) {
                        Collection g7 = w5.g();
                        if (!g7.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        w5.f15595e++;
                        map3.put(valueOf, g7);
                    } else if (collection.add(valueOf2)) {
                        w5.f15595e++;
                    }
                    i55 = i56;
                    d5 = d7;
                }
            }
            i52++;
            length4 = i4;
            iArr14 = iArr;
            j4 = j7;
            dVar2 = dVar;
        }
        u0.d dVar3 = dVar2;
        int[] iArr16 = iArr14;
        Collection collection2 = w5.f15663b;
        if (collection2 == null) {
            collection2 = new C1467n(0, w5);
            w5.f15663b = collection2;
        }
        v2.I k4 = v2.I.k(collection2);
        for (int i57 = 0; i57 < k4.size(); i57++) {
            int intValue = ((Integer) k4.get(i57)).intValue();
            int i58 = iArr16[intValue] + 1;
            iArr16[intValue] = i58;
            jArr3[intValue] = jArr[intValue][i58];
            C1428c.v(arrayList, jArr3);
        }
        for (int i59 = 0; i59 < sVarArr.length; i59++) {
            if (arrayList.get(i59) != null) {
                jArr3[i59] = jArr3[i59] * 2;
            }
        }
        C1428c.v(arrayList, jArr3);
        v2.F j9 = v2.I.j();
        for (int i60 = 0; i60 < arrayList.size(); i60++) {
            v2.F f5 = (v2.F) arrayList.get(i60);
            j9.b(f5 == null ? v2.a0.f15605e : f5.f());
        }
        v2.a0 f6 = j9.f();
        t0.t[] tVarArr = new t0.t[sVarArr.length];
        for (int i61 = 0; i61 < sVarArr.length; i61++) {
            t0.s sVar4 = sVarArr[i61];
            if (sVar4 != 0) {
                int[] iArr17 = sVar4.f15375b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        c1428c = new t0.u(sVar4.f15374a, new int[]{iArr17[0]});
                    } else {
                        long j10 = 25000;
                        c1428c = new C1428c(sVar4.f15374a, iArr17, dVar3, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, j10, j10, (v2.I) f6.get(i61));
                    }
                    tVarArr[i61] = c1428c;
                }
            }
        }
        m0[] m0VarArr = new m0[i27];
        for (int i62 = 0; i62 < i27; i62++) {
            m0VarArr[i62] = (lVar.f15331E.get(i62) || lVar.v.contains(Integer.valueOf(vVar.f15377b[i62])) || (vVar.f15377b[i62] != -2 && tVarArr[i62] == null)) ? null : m0.f4194c;
        }
        lVar.f2746q.getClass();
        Pair create = Pair.create(m0VarArr, tVarArr);
        t0.t[] tVarArr2 = (t0.t[]) create.second;
        List[] listArr = new List[tVarArr2.length];
        for (int i63 = 0; i63 < tVarArr2.length; i63++) {
            t0.t tVar = tVarArr2[i63];
            if (tVar != null) {
                a0Var = v2.I.o(tVar);
            } else {
                v2.G g8 = v2.I.f15571b;
                a0Var = v2.a0.f15605e;
            }
            listArr[i63] = a0Var;
        }
        v2.F f7 = new v2.F(4);
        int i64 = 0;
        while (true) {
            int i65 = vVar.f15376a;
            q0.j0[] j0VarArr3 = vVar.f15378c;
            if (i64 >= i65) {
                break;
            }
            q0.j0 j0Var7 = j0VarArr3[i64];
            List list = listArr[i64];
            int i66 = 0;
            while (i66 < j0Var7.f15034a) {
                T.U a5 = j0Var7.a(i66);
                int i67 = j0VarArr3[i64].a(i66).f2705a;
                int[] iArr18 = new int[i67];
                int i68 = 0;
                int i69 = 0;
                while (i68 < i67) {
                    List[] listArr2 = listArr;
                    if ((vVar.f15380e[i64][i66][i68] & 7) == 4) {
                        iArr18[i69] = i68;
                        i69++;
                    }
                    i68++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr18, i69);
                q0.j0 j0Var8 = j0Var7;
                int i70 = 16;
                String str3 = null;
                int i71 = 0;
                boolean z7 = false;
                int i72 = 0;
                while (i71 < copyOf.length) {
                    String str4 = j0VarArr3[i64].a(i66).f2708d[copyOf[i71]].n;
                    int i73 = i72 + 1;
                    if (i72 == 0) {
                        str3 = str4;
                    } else {
                        z7 = (!Objects.equals(str3, str4)) | z7;
                    }
                    i70 = Math.min(i70, vVar.f15380e[i64][i66][i71] & 24);
                    i71++;
                    i72 = i73;
                }
                if (z7) {
                    i70 = Math.min(i70, vVar.f15379d[i64]);
                }
                boolean z8 = i70 != 0;
                int i74 = a5.f2705a;
                int[] iArr19 = new int[i74];
                boolean[] zArr = new boolean[i74];
                for (int i75 = 0; i75 < a5.f2705a; i75++) {
                    iArr19[i75] = vVar.f15380e[i64][i66][i75] & 7;
                    int i76 = 0;
                    while (true) {
                        if (i76 >= list.size()) {
                            z6 = false;
                            break;
                        }
                        t0.t tVar2 = (t0.t) list.get(i76);
                        if (tVar2.c().equals(a5) && tVar2.u(i75) != -1) {
                            z6 = true;
                            break;
                        }
                        i76++;
                    }
                    zArr[i75] = z6;
                }
                f7.b(new T.Z(a5, z8, iArr19, zArr));
                i66++;
                listArr = listArr3;
                j0Var7 = j0Var8;
            }
            i64++;
        }
        q0.j0 j0Var9 = vVar.f15381f;
        for (int i77 = 0; i77 < j0Var9.f15034a; i77++) {
            T.U a6 = j0Var9.a(i77);
            int[] iArr20 = new int[a6.f2705a];
            Arrays.fill(iArr20, 0);
            f7.b(new T.Z(a6, false, iArr20, new boolean[a6.f2705a]));
        }
        t0.x xVar = new t0.x((m0[]) create.first, (t0.t[]) create.second, new T.a0(f7.f()), vVar);
        for (int i78 = 0; i78 < xVar.f15384a; i78++) {
            if (xVar.b(i78)) {
                if (xVar.f15386c[i78] == null && this.f3997j[i78].f4038b != -2) {
                    z5 = false;
                    AbstractC0124a.t(z5);
                }
                z5 = true;
                AbstractC0124a.t(z5);
            } else {
                AbstractC0124a.t(xVar.f15386c[i78] == null);
            }
        }
        for (t0.t tVar3 : xVar.f15386c) {
            if (tVar3 != null) {
                tVar3.p(f4);
                tVar3.e(z);
            }
        }
        return xVar;
    }

    public final void k() {
        Object obj = this.f3988a;
        if (obj instanceof C1362d) {
            long j4 = this.f3994g.f4005d;
            if (j4 == -9223372036854775807L) {
                j4 = Long.MIN_VALUE;
            }
            C1362d c1362d = (C1362d) obj;
            c1362d.f14989f = 0L;
            c1362d.f14990g = j4;
        }
    }
}
