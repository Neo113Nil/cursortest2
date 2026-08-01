package androidx.recyclerview.widget;

import C0.i;
import K.Q;
import U.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.C0149m;
import g0.C0153q;
import g0.C0157v;
import g0.G;
import g0.H;
import g0.I;
import g0.N;
import g0.T;
import g0.U;
import g0.c0;
import g0.d0;
import g0.e0;
import g0.f0;
import g0.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import u0.C0385x;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends H implements T {

    /* renamed from: B, reason: collision with root package name */
    public final C0385x f2013B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2014C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2015D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2016E;
    public f0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f2017G;

    /* renamed from: H, reason: collision with root package name */
    public final c0 f2018H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f2019I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f2020J;

    /* renamed from: K, reason: collision with root package name */
    public final i f2021K;

    /* renamed from: p, reason: collision with root package name */
    public final int f2022p;

    /* renamed from: q, reason: collision with root package name */
    public final g0[] f2023q;

    /* renamed from: r, reason: collision with root package name */
    public final g f2024r;

    /* renamed from: s, reason: collision with root package name */
    public final g f2025s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2026t;

    /* renamed from: u, reason: collision with root package name */
    public int f2027u;

    /* renamed from: v, reason: collision with root package name */
    public final C0153q f2028v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2029w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f2031y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2030x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2032z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f2012A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2022p = -1;
        this.f2029w = false;
        C0385x c0385x = new C0385x(7);
        this.f2013B = c0385x;
        this.f2014C = 2;
        this.f2017G = new Rect();
        this.f2018H = new c0(this);
        this.f2019I = true;
        this.f2021K = new i(10, this);
        G I2 = H.I(context, attributeSet, i, i2);
        int i3 = I2.f2721a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f2026t) {
            this.f2026t = i3;
            g gVar = this.f2024r;
            this.f2024r = this.f2025s;
            this.f2025s = gVar;
            n0();
        }
        int i4 = I2.f2722b;
        c(null);
        if (i4 != this.f2022p) {
            c0385x.d();
            n0();
            this.f2022p = i4;
            this.f2031y = new BitSet(this.f2022p);
            this.f2023q = new g0[this.f2022p];
            for (int i5 = 0; i5 < this.f2022p; i5++) {
                this.f2023q[i5] = new g0(this, i5);
            }
            n0();
        }
        boolean z2 = I2.f2723c;
        c(null);
        f0 f0Var = this.F;
        if (f0Var != null && f0Var.h != z2) {
            f0Var.h = z2;
        }
        this.f2029w = z2;
        n0();
        C0153q c0153q = new C0153q();
        c0153q.f2913a = true;
        c0153q.f2917f = 0;
        c0153q.f2918g = 0;
        this.f2028v = c0153q;
        this.f2024r = g.a(this, this.f2026t);
        this.f2025s = g.a(this, 1 - this.f2026t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // g0.H
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.f2030x ? 1 : -1;
        }
        return (i < M0()) != this.f2030x ? -1 : 1;
    }

    public final boolean D0() {
        int M0;
        if (v() != 0 && this.f2014C != 0 && this.f2729g) {
            if (this.f2030x) {
                M0 = N0();
                M0();
            } else {
                M0 = M0();
                N0();
            }
            C0385x c0385x = this.f2013B;
            if (M0 == 0 && R0() != null) {
                c0385x.d();
                this.f2728f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2024r;
        boolean z2 = !this.f2019I;
        return b1.g.f(u2, gVar, J0(z2), I0(z2), this, this.f2019I);
    }

    public final int F0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2024r;
        boolean z2 = !this.f2019I;
        return b1.g.g(u2, gVar, J0(z2), I0(z2), this, this.f2019I, this.f2030x);
    }

    public final int G0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2024r;
        boolean z2 = !this.f2019I;
        return b1.g.h(u2, gVar, J0(z2), I0(z2), this, this.f2019I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(N n2, C0153q c0153q, U u2) {
        g0 g0Var;
        ?? r6;
        int i;
        int h;
        int c2;
        int k2;
        int c3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f2031y.set(0, this.f2022p, true);
        C0153q c0153q2 = this.f2028v;
        int i8 = c0153q2.i ? c0153q.f2916e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0153q.f2916e == 1 ? c0153q.f2918g + c0153q.f2914b : c0153q.f2917f - c0153q.f2914b;
        int i9 = c0153q.f2916e;
        for (int i10 = 0; i10 < this.f2022p; i10++) {
            if (!this.f2023q[i10].f2842a.isEmpty()) {
                e1(this.f2023q[i10], i9, i8);
            }
        }
        int g2 = this.f2030x ? this.f2024r.g() : this.f2024r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0153q.f2915c;
            if (((i11 < 0 || i11 >= u2.b()) ? i6 : i7) == 0 || (!c0153q2.i && this.f2031y.isEmpty())) {
                break;
            }
            View view = n2.k(c0153q.f2915c, Long.MAX_VALUE).f2777a;
            c0153q.f2915c += c0153q.d;
            d0 d0Var = (d0) view.getLayoutParams();
            int b2 = d0Var.f2736a.b();
            C0385x c0385x = this.f2013B;
            int[] iArr = (int[]) c0385x.f4231b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (V0(c0153q.f2916e)) {
                    i5 = this.f2022p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f2022p;
                    i5 = i6;
                }
                g0 g0Var2 = null;
                if (c0153q.f2916e == i7) {
                    int k3 = this.f2024r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        g0 g0Var3 = this.f2023q[i5];
                        int f2 = g0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            g0Var2 = g0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f2024r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        g0 g0Var4 = this.f2023q[i5];
                        int h2 = g0Var4.h(g3);
                        if (h2 > i14) {
                            g0Var2 = g0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                g0Var = g0Var2;
                c0385x.t(b2);
                ((int[]) c0385x.f4231b)[b2] = g0Var.f2845e;
            } else {
                g0Var = this.f2023q[i12];
            }
            d0Var.f2817e = g0Var;
            if (c0153q.f2916e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f2026t == 1) {
                i = 1;
                T0(view, H.w(r6, this.f2027u, this.f2732l, r6, ((ViewGroup.MarginLayoutParams) d0Var).width), H.w(true, this.f2735o, this.f2733m, D() + G(), ((ViewGroup.MarginLayoutParams) d0Var).height));
            } else {
                i = 1;
                T0(view, H.w(true, this.f2734n, this.f2732l, F() + E(), ((ViewGroup.MarginLayoutParams) d0Var).width), H.w(false, this.f2027u, this.f2733m, 0, ((ViewGroup.MarginLayoutParams) d0Var).height));
            }
            if (c0153q.f2916e == i) {
                c2 = g0Var.f(g2);
                h = this.f2024r.c(view) + c2;
            } else {
                h = g0Var.h(g2);
                c2 = h - this.f2024r.c(view);
            }
            if (c0153q.f2916e == 1) {
                g0 g0Var5 = d0Var.f2817e;
                g0Var5.getClass();
                d0 d0Var2 = (d0) view.getLayoutParams();
                d0Var2.f2817e = g0Var5;
                ArrayList arrayList = g0Var5.f2842a;
                arrayList.add(view);
                g0Var5.f2844c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    g0Var5.f2843b = Integer.MIN_VALUE;
                }
                if (d0Var2.f2736a.i() || d0Var2.f2736a.l()) {
                    g0Var5.d = g0Var5.f2846f.f2024r.c(view) + g0Var5.d;
                }
            } else {
                g0 g0Var6 = d0Var.f2817e;
                g0Var6.getClass();
                d0 d0Var3 = (d0) view.getLayoutParams();
                d0Var3.f2817e = g0Var6;
                ArrayList arrayList2 = g0Var6.f2842a;
                arrayList2.add(0, view);
                g0Var6.f2843b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    g0Var6.f2844c = Integer.MIN_VALUE;
                }
                if (d0Var3.f2736a.i() || d0Var3.f2736a.l()) {
                    g0Var6.d = g0Var6.f2846f.f2024r.c(view) + g0Var6.d;
                }
            }
            if (S0() && this.f2026t == 1) {
                c3 = this.f2025s.g() - (((this.f2022p - 1) - g0Var.f2845e) * this.f2027u);
                k2 = c3 - this.f2025s.c(view);
            } else {
                k2 = this.f2025s.k() + (g0Var.f2845e * this.f2027u);
                c3 = this.f2025s.c(view) + k2;
            }
            if (this.f2026t == 1) {
                H.N(view, k2, c2, c3, h);
            } else {
                H.N(view, c2, k2, h, c3);
            }
            e1(g0Var, c0153q2.f2916e, i8);
            X0(n2, c0153q2);
            if (c0153q2.h && view.hasFocusable()) {
                i2 = 0;
                this.f2031y.set(g0Var.f2845e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            X0(n2, c0153q2);
        }
        int k4 = c0153q2.f2916e == -1 ? this.f2024r.k() - P0(this.f2024r.k()) : O0(this.f2024r.g()) - this.f2024r.g();
        return k4 > 0 ? Math.min(c0153q.f2914b, k4) : i15;
    }

    public final View I0(boolean z2) {
        int k2 = this.f2024r.k();
        int g2 = this.f2024r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f2024r.e(u2);
            int b2 = this.f2024r.b(u2);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View J0(boolean z2) {
        int k2 = this.f2024r.k();
        int g2 = this.f2024r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f2024r.e(u2);
            if (this.f2024r.b(u2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void K0(N n2, U u2, boolean z2) {
        int g2;
        int O02 = O0(Integer.MIN_VALUE);
        if (O02 != Integer.MIN_VALUE && (g2 = this.f2024r.g() - O02) > 0) {
            int i = g2 - (-b1(-g2, n2, u2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f2024r.p(i);
        }
    }

    @Override // g0.H
    public final boolean L() {
        return this.f2014C != 0;
    }

    public final void L0(N n2, U u2, boolean z2) {
        int k2;
        int P02 = P0(Integer.MAX_VALUE);
        if (P02 != Integer.MAX_VALUE && (k2 = P02 - this.f2024r.k()) > 0) {
            int b12 = k2 - b1(k2, n2, u2);
            if (!z2 || b12 <= 0) {
                return;
            }
            this.f2024r.p(-b12);
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return H.H(u(0));
    }

    public final int N0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return H.H(u(v2 - 1));
    }

    @Override // g0.H
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f2022p; i2++) {
            g0 g0Var = this.f2023q[i2];
            int i3 = g0Var.f2843b;
            if (i3 != Integer.MIN_VALUE) {
                g0Var.f2843b = i3 + i;
            }
            int i4 = g0Var.f2844c;
            if (i4 != Integer.MIN_VALUE) {
                g0Var.f2844c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int f2 = this.f2023q[0].f(i);
        for (int i2 = 1; i2 < this.f2022p; i2++) {
            int f3 = this.f2023q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // g0.H
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f2022p; i2++) {
            g0 g0Var = this.f2023q[i2];
            int i3 = g0Var.f2843b;
            if (i3 != Integer.MIN_VALUE) {
                g0Var.f2843b = i3 + i;
            }
            int i4 = g0Var.f2844c;
            if (i4 != Integer.MIN_VALUE) {
                g0Var.f2844c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int h = this.f2023q[0].h(i);
        for (int i2 = 1; i2 < this.f2022p; i2++) {
            int h2 = this.f2023q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // g0.H
    public final void Q() {
        this.f2013B.d();
        for (int i = 0; i < this.f2022p; i++) {
            this.f2023q[i].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(int i, int i2, int i3) {
        int i4;
        int i5;
        C0385x c0385x;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int N02 = this.f2030x ? N0() : M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                c0385x = this.f2013B;
                iArr = (int[]) c0385x.f4231b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) c0385x.f4232c;
                    if (arrayList != null) {
                        e0 e0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                e0 e0Var2 = (e0) ((ArrayList) c0385x.f4232c).get(size);
                                if (e0Var2.f2823a == i5) {
                                    e0Var = e0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (e0Var != null) {
                            ((ArrayList) c0385x.f4232c).remove(e0Var);
                        }
                        int size2 = ((ArrayList) c0385x.f4232c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((e0) ((ArrayList) c0385x.f4232c).get(i7)).f2823a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            e0 e0Var3 = (e0) ((ArrayList) c0385x.f4232c).get(i7);
                            ((ArrayList) c0385x.f4232c).remove(i7);
                            i6 = e0Var3.f2823a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) c0385x.f4231b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) c0385x.f4231b).length;
                            } else {
                                Arrays.fill((int[]) c0385x.f4231b, i5, Math.min(i6 + 1, ((int[]) c0385x.f4231b).length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    c0385x.v(i, i2);
                } else if (i3 == 2) {
                    c0385x.w(i, i2);
                } else if (i3 == 8) {
                    c0385x.w(i, 1);
                    c0385x.v(i2, 1);
                }
                if (i4 > N02) {
                    return;
                }
                if (i5 <= (this.f2030x ? M0() : N0())) {
                    n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        c0385x = this.f2013B;
        iArr = (int[]) c0385x.f4231b;
        if (iArr != null) {
            arrayList = (ArrayList) c0385x.f4232c;
            if (arrayList != null) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > N02) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R0() {
        int v2 = v();
        int i = v2 - 1;
        BitSet bitSet = new BitSet(this.f2022p);
        bitSet.set(0, this.f2022p, true);
        char c2 = (this.f2026t == 1 && S0()) ? (char) 1 : (char) 65535;
        if (this.f2030x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            d0 d0Var = (d0) u2.getLayoutParams();
            if (bitSet.get(d0Var.f2817e.f2845e)) {
                g0 g0Var = d0Var.f2817e;
                if (this.f2030x) {
                    int i3 = g0Var.f2844c;
                    if (i3 == Integer.MIN_VALUE) {
                        g0Var.a();
                        i3 = g0Var.f2844c;
                    }
                    if (i3 < this.f2024r.g()) {
                        ArrayList arrayList = g0Var.f2842a;
                        ((d0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(d0Var.f2817e.f2845e);
                } else {
                    int i4 = g0Var.f2843b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) g0Var.f2842a.get(0);
                        d0 d0Var2 = (d0) view.getLayoutParams();
                        g0Var.f2843b = g0Var.f2846f.f2024r.e(view);
                        d0Var2.getClass();
                        i4 = g0Var.f2843b;
                    }
                    if (i4 > this.f2024r.k()) {
                        ((d0) ((View) g0Var.f2842a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(d0Var.f2817e.f2845e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f2030x) {
                    int b2 = this.f2024r.b(u2);
                    int b3 = this.f2024r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((d0Var.f2817e.f2845e - ((d0) u3.getLayoutParams()).f2817e.f2845e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f2024r.e(u2);
                    int e3 = this.f2024r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((d0Var.f2817e.f2845e - ((d0) u3.getLayoutParams()).f2817e.f2845e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // g0.H
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2725b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2021K);
        }
        for (int i = 0; i < this.f2022p; i++) {
            this.f2023q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f2026t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f2026t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (S0() == false) goto L46;
     */
    @Override // g0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, N n2, U u2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f2724a.f2800c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        a1();
        if (i == 1) {
            if (this.f2026t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f2026t != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        d0 d0Var = (d0) D2.getLayoutParams();
        d0Var.getClass();
        g0 g0Var = d0Var.f2817e;
        int N02 = i2 == 1 ? N0() : M0();
        d1(N02, u2);
        c1(i2);
        C0153q c0153q = this.f2028v;
        c0153q.f2915c = c0153q.d + N02;
        c0153q.f2914b = (int) (this.f2024r.l() * 0.33333334f);
        c0153q.h = true;
        c0153q.f2913a = false;
        H0(n2, c0153q, u2);
        this.f2015D = this.f2030x;
        View g2 = g0Var.g(N02, i2);
        if (g2 != null && g2 != D2) {
            return g2;
        }
        if (V0(i2)) {
            for (int i3 = this.f2022p - 1; i3 >= 0; i3--) {
                View g3 = this.f2023q[i3].g(N02, i2);
                if (g3 != null && g3 != D2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f2022p; i4++) {
                View g4 = this.f2023q[i4].g(N02, i2);
                if (g4 != null && g4 != D2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f2029w ^ true) == (i2 == -1);
        View q2 = q(z2 ? g0Var.c() : g0Var.d());
        if (q2 != null && q2 != D2) {
            return q2;
        }
        if (V0(i2)) {
            for (int i5 = this.f2022p - 1; i5 >= 0; i5--) {
                if (i5 != g0Var.f2845e) {
                    View q3 = q(z2 ? this.f2023q[i5].c() : this.f2023q[i5].d());
                    if (q3 != null && q3 != D2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2022p; i6++) {
                View q4 = q(z2 ? this.f2023q[i6].c() : this.f2023q[i6].d());
                if (q4 != null && q4 != D2) {
                    return q4;
                }
            }
        }
        return null;
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2725b;
        Rect rect = this.f2017G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        d0 d0Var = (d0) view.getLayoutParams();
        int f12 = f1(i, ((ViewGroup.MarginLayoutParams) d0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) d0Var).rightMargin + rect.right);
        int f13 = f1(i2, ((ViewGroup.MarginLayoutParams) d0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin + rect.bottom);
        if (w0(view, f12, f13, d0Var)) {
            view.measure(f12, f13);
        }
    }

    @Override // g0.H
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View J02 = J0(false);
            View I02 = I0(false);
            if (J02 == null || I02 == null) {
                return;
            }
            int H2 = H.H(J02);
            int H3 = H.H(I02);
            if (H2 < H3) {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H3);
            } else {
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0402, code lost:
    
        if (D0() != false) goto L247;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(N n2, U u2, boolean z2) {
        f0 f0Var;
        int i;
        int i2;
        f0 f0Var2 = this.F;
        c0 c0Var = this.f2018H;
        if (!(f0Var2 == null && this.f2032z == -1) && u2.b() == 0) {
            i0(n2);
            c0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (c0Var.f2810e && this.f2032z == -1 && this.F == null) ? false : true;
        C0385x c0385x = this.f2013B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0Var.f2812g;
        if (z4) {
            c0Var.a();
            f0 f0Var3 = this.F;
            if (f0Var3 != null) {
                int i3 = f0Var3.f2832c;
                if (i3 > 0) {
                    if (i3 == this.f2022p) {
                        for (int i4 = 0; i4 < this.f2022p; i4++) {
                            this.f2023q[i4].b();
                            f0 f0Var4 = this.F;
                            int i5 = f0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += f0Var4.i ? this.f2024r.g() : this.f2024r.k();
                            }
                            g0 g0Var = this.f2023q[i4];
                            g0Var.f2843b = i5;
                            g0Var.f2844c = i5;
                        }
                    } else {
                        f0Var3.d = null;
                        f0Var3.f2832c = 0;
                        f0Var3.f2833e = 0;
                        f0Var3.f2834f = null;
                        f0Var3.f2835g = null;
                        f0Var3.f2830a = f0Var3.f2831b;
                    }
                }
                f0 f0Var5 = this.F;
                this.f2016E = f0Var5.f2836j;
                boolean z5 = f0Var5.h;
                c(null);
                f0 f0Var6 = this.F;
                if (f0Var6 != null && f0Var6.h != z5) {
                    f0Var6.h = z5;
                }
                this.f2029w = z5;
                n0();
                a1();
                f0 f0Var7 = this.F;
                int i6 = f0Var7.f2830a;
                if (i6 != -1) {
                    this.f2032z = i6;
                    c0Var.f2809c = f0Var7.i;
                } else {
                    c0Var.f2809c = this.f2030x;
                }
                if (f0Var7.f2833e > 1) {
                    c0385x.f4231b = f0Var7.f2834f;
                    c0385x.f4232c = f0Var7.f2835g;
                }
            } else {
                a1();
                c0Var.f2809c = this.f2030x;
            }
            if (!u2.f2764g && (i2 = this.f2032z) != -1) {
                if (i2 < 0 || i2 >= u2.b()) {
                    this.f2032z = -1;
                    this.f2012A = Integer.MIN_VALUE;
                } else {
                    f0 f0Var8 = this.F;
                    if (f0Var8 == null || f0Var8.f2830a == -1 || f0Var8.f2832c < 1) {
                        View q2 = q(this.f2032z);
                        if (q2 != null) {
                            c0Var.f2807a = this.f2030x ? N0() : M0();
                            if (this.f2012A != Integer.MIN_VALUE) {
                                if (c0Var.f2809c) {
                                    c0Var.f2808b = (this.f2024r.g() - this.f2012A) - this.f2024r.b(q2);
                                } else {
                                    c0Var.f2808b = (this.f2024r.k() + this.f2012A) - this.f2024r.e(q2);
                                }
                            } else if (this.f2024r.c(q2) > this.f2024r.l()) {
                                c0Var.f2808b = c0Var.f2809c ? this.f2024r.g() : this.f2024r.k();
                            } else {
                                int e2 = this.f2024r.e(q2) - this.f2024r.k();
                                if (e2 < 0) {
                                    c0Var.f2808b = -e2;
                                } else {
                                    int g2 = this.f2024r.g() - this.f2024r.b(q2);
                                    if (g2 < 0) {
                                        c0Var.f2808b = g2;
                                    } else {
                                        c0Var.f2808b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f2032z;
                            c0Var.f2807a = i7;
                            int i8 = this.f2012A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = C0(i7) == 1;
                                c0Var.f2809c = z6;
                                c0Var.f2808b = z6 ? staggeredGridLayoutManager.f2024r.g() : staggeredGridLayoutManager.f2024r.k();
                            } else if (c0Var.f2809c) {
                                c0Var.f2808b = staggeredGridLayoutManager.f2024r.g() - i8;
                            } else {
                                c0Var.f2808b = staggeredGridLayoutManager.f2024r.k() + i8;
                            }
                            c0Var.d = true;
                        }
                    } else {
                        c0Var.f2808b = Integer.MIN_VALUE;
                        c0Var.f2807a = this.f2032z;
                    }
                    c0Var.f2810e = true;
                }
            }
            if (this.f2015D) {
                int b2 = u2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = H.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                c0Var.f2807a = i;
                c0Var.f2808b = Integer.MIN_VALUE;
                c0Var.f2810e = true;
            } else {
                int b3 = u2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H2 = H.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                c0Var.f2807a = i;
                c0Var.f2808b = Integer.MIN_VALUE;
                c0Var.f2810e = true;
            }
        }
        if (this.F == null && this.f2032z == -1 && (c0Var.f2809c != this.f2015D || S0() != this.f2016E)) {
            c0385x.d();
            c0Var.d = true;
        }
        if (v() > 0 && ((f0Var = this.F) == null || f0Var.f2832c < 1)) {
            if (c0Var.d) {
                for (int i10 = 0; i10 < this.f2022p; i10++) {
                    this.f2023q[i10].b();
                    int i11 = c0Var.f2808b;
                    if (i11 != Integer.MIN_VALUE) {
                        g0 g0Var2 = this.f2023q[i10];
                        g0Var2.f2843b = i11;
                        g0Var2.f2844c = i11;
                    }
                }
            } else if (z4 || c0Var.f2811f == null) {
                for (int i12 = 0; i12 < this.f2022p; i12++) {
                    g0 g0Var3 = this.f2023q[i12];
                    boolean z7 = this.f2030x;
                    int i13 = c0Var.f2808b;
                    int f2 = z7 ? g0Var3.f(Integer.MIN_VALUE) : g0Var3.h(Integer.MIN_VALUE);
                    g0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = g0Var3.f2846f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f2024r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f2024r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            g0Var3.f2844c = f2;
                            g0Var3.f2843b = f2;
                        }
                    }
                }
                g0[] g0VarArr = this.f2023q;
                int length = g0VarArr.length;
                int[] iArr = c0Var.f2811f;
                if (iArr == null || iArr.length < length) {
                    c0Var.f2811f = new int[staggeredGridLayoutManager.f2023q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    c0Var.f2811f[i14] = g0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f2022p; i15++) {
                    g0 g0Var4 = this.f2023q[i15];
                    g0Var4.b();
                    int i16 = c0Var.f2811f[i15];
                    g0Var4.f2843b = i16;
                    g0Var4.f2844c = i16;
                }
            }
        }
        p(n2);
        C0153q c0153q = this.f2028v;
        c0153q.f2913a = false;
        int l2 = this.f2025s.l();
        this.f2027u = l2 / this.f2022p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f2025s.i());
        d1(c0Var.f2807a, u2);
        if (c0Var.f2809c) {
            c1(-1);
            H0(n2, c0153q, u2);
            c1(1);
            c0153q.f2915c = c0Var.f2807a + c0153q.d;
            H0(n2, c0153q, u2);
        } else {
            c1(1);
            H0(n2, c0153q, u2);
            c1(-1);
            c0153q.f2915c = c0Var.f2807a + c0153q.d;
            H0(n2, c0153q, u2);
        }
        if (this.f2025s.i() != 1073741824) {
            int v4 = v();
            float f3 = RecyclerView.f1937A0;
            for (int i17 = 0; i17 < v4; i17++) {
                View u3 = u(i17);
                float c2 = this.f2025s.c(u3);
                if (c2 >= f3) {
                    ((d0) u3.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f2027u;
            int round = Math.round(f3 * this.f2022p);
            if (this.f2025s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2025s.l());
            }
            this.f2027u = round / this.f2022p;
            View.MeasureSpec.makeMeasureSpec(round, this.f2025s.i());
            if (this.f2027u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u4 = u(i19);
                    d0 d0Var = (d0) u4.getLayoutParams();
                    d0Var.getClass();
                    if (S0() && this.f2026t == 1) {
                        int i20 = -((this.f2022p - 1) - d0Var.f2817e.f2845e);
                        u4.offsetLeftAndRight((this.f2027u * i20) - (i20 * i18));
                    } else {
                        int i21 = d0Var.f2817e.f2845e;
                        int i22 = this.f2027u * i21;
                        int i23 = i21 * i18;
                        if (this.f2026t == 1) {
                            u4.offsetLeftAndRight(i22 - i23);
                        } else {
                            u4.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f2030x) {
                K0(n2, u2, true);
                L0(n2, u2, false);
            } else {
                L0(n2, u2, true);
                K0(n2, u2, false);
            }
        }
        if (z2 && !u2.f2764g && this.f2014C != 0 && v() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f2725b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2021K);
            }
        }
        z3 = false;
        if (u2.f2764g) {
            c0Var.a();
        }
        this.f2015D = c0Var.f2809c;
        this.f2016E = S0();
        if (z3) {
            c0Var.a();
            U0(n2, u2, false);
        }
    }

    public final boolean V0(int i) {
        if (this.f2026t == 0) {
            return (i == -1) != this.f2030x;
        }
        return ((i == -1) == this.f2030x) == S0();
    }

    public final void W0(int i, U u2) {
        int M0;
        int i2;
        if (i > 0) {
            M0 = N0();
            i2 = 1;
        } else {
            M0 = M0();
            i2 = -1;
        }
        C0153q c0153q = this.f2028v;
        c0153q.f2913a = true;
        d1(M0, u2);
        c1(i2);
        c0153q.f2915c = M0 + c0153q.d;
        c0153q.f2914b = Math.abs(i);
    }

    public final void X0(N n2, C0153q c0153q) {
        if (!c0153q.f2913a || c0153q.i) {
            return;
        }
        if (c0153q.f2914b == 0) {
            if (c0153q.f2916e == -1) {
                Y0(n2, c0153q.f2918g);
                return;
            } else {
                Z0(n2, c0153q.f2917f);
                return;
            }
        }
        int i = 1;
        if (c0153q.f2916e == -1) {
            int i2 = c0153q.f2917f;
            int h = this.f2023q[0].h(i2);
            while (i < this.f2022p) {
                int h2 = this.f2023q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            Y0(n2, i3 < 0 ? c0153q.f2918g : c0153q.f2918g - Math.min(i3, c0153q.f2914b));
            return;
        }
        int i4 = c0153q.f2918g;
        int f2 = this.f2023q[0].f(i4);
        while (i < this.f2022p) {
            int f3 = this.f2023q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - c0153q.f2918g;
        Z0(n2, i5 < 0 ? c0153q.f2917f : Math.min(i5, c0153q.f2914b) + c0153q.f2917f);
    }

    @Override // g0.H
    public final void Y(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Y0(N n2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f2024r.e(u2) < i || this.f2024r.o(u2) < i) {
                return;
            }
            d0 d0Var = (d0) u2.getLayoutParams();
            d0Var.getClass();
            if (d0Var.f2817e.f2842a.size() == 1) {
                return;
            }
            g0 g0Var = d0Var.f2817e;
            ArrayList arrayList = g0Var.f2842a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            d0 d0Var2 = (d0) view.getLayoutParams();
            d0Var2.f2817e = null;
            if (d0Var2.f2736a.i() || d0Var2.f2736a.l()) {
                g0Var.d -= g0Var.f2846f.f2024r.c(view);
            }
            if (size == 1) {
                g0Var.f2843b = Integer.MIN_VALUE;
            }
            g0Var.f2844c = Integer.MIN_VALUE;
            k0(u2, n2);
        }
    }

    @Override // g0.H
    public final void Z() {
        this.f2013B.d();
        n0();
    }

    public final void Z0(N n2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f2024r.b(u2) > i || this.f2024r.n(u2) > i) {
                return;
            }
            d0 d0Var = (d0) u2.getLayoutParams();
            d0Var.getClass();
            if (d0Var.f2817e.f2842a.size() == 1) {
                return;
            }
            g0 g0Var = d0Var.f2817e;
            ArrayList arrayList = g0Var.f2842a;
            View view = (View) arrayList.remove(0);
            d0 d0Var2 = (d0) view.getLayoutParams();
            d0Var2.f2817e = null;
            if (arrayList.size() == 0) {
                g0Var.f2844c = Integer.MIN_VALUE;
            }
            if (d0Var2.f2736a.i() || d0Var2.f2736a.l()) {
                g0Var.d -= g0Var.f2846f.f2024r.c(view);
            }
            g0Var.f2843b = Integer.MIN_VALUE;
            k0(u2, n2);
        }
    }

    @Override // g0.T
    public final PointF a(int i) {
        int C02 = C0(i);
        PointF pointF = new PointF();
        if (C02 == 0) {
            return null;
        }
        if (this.f2026t == 0) {
            pointF.x = C02;
            pointF.y = RecyclerView.f1937A0;
        } else {
            pointF.x = RecyclerView.f1937A0;
            pointF.y = C02;
        }
        return pointF;
    }

    @Override // g0.H
    public final void a0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void a1() {
        if (this.f2026t == 1 || !S0()) {
            this.f2030x = this.f2029w;
        } else {
            this.f2030x = !this.f2029w;
        }
    }

    @Override // g0.H
    public final void b0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final int b1(int i, N n2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, u2);
        C0153q c0153q = this.f2028v;
        int H0 = H0(n2, c0153q, u2);
        if (c0153q.f2914b >= H0) {
            i = i < 0 ? -H0 : H0;
        }
        this.f2024r.p(-i);
        this.f2015D = this.f2030x;
        c0153q.f2914b = 0;
        X0(n2, c0153q);
        return i;
    }

    @Override // g0.H
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // g0.H
    public final void c0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void c1(int i) {
        C0153q c0153q = this.f2028v;
        c0153q.f2916e = i;
        c0153q.d = this.f2030x != (i == -1) ? -1 : 1;
    }

    @Override // g0.H
    public final boolean d() {
        return this.f2026t == 0;
    }

    @Override // g0.H
    public final void d0(N n2, U u2) {
        U0(n2, u2, true);
    }

    public final void d1(int i, U u2) {
        int i2;
        int i3;
        int i4;
        C0153q c0153q = this.f2028v;
        boolean z2 = false;
        c0153q.f2914b = 0;
        c0153q.f2915c = i;
        C0157v c0157v = this.f2727e;
        if (!(c0157v != null && c0157v.f2941e) || (i4 = u2.f2759a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f2030x == (i4 < i)) {
                i2 = this.f2024r.l();
                i3 = 0;
            } else {
                i3 = this.f2024r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2725b;
        if (recyclerView == null || !recyclerView.h) {
            c0153q.f2918g = this.f2024r.f() + i2;
            c0153q.f2917f = -i3;
        } else {
            c0153q.f2917f = this.f2024r.k() - i3;
            c0153q.f2918g = this.f2024r.g() + i2;
        }
        c0153q.h = false;
        c0153q.f2913a = true;
        if (this.f2024r.i() == 0 && this.f2024r.f() == 0) {
            z2 = true;
        }
        c0153q.i = z2;
    }

    @Override // g0.H
    public final boolean e() {
        return this.f2026t == 1;
    }

    @Override // g0.H
    public final void e0(U u2) {
        this.f2032z = -1;
        this.f2012A = Integer.MIN_VALUE;
        this.F = null;
        this.f2018H.a();
    }

    public final void e1(g0 g0Var, int i, int i2) {
        int i3 = g0Var.d;
        int i4 = g0Var.f2845e;
        if (i != -1) {
            int i5 = g0Var.f2844c;
            if (i5 == Integer.MIN_VALUE) {
                g0Var.a();
                i5 = g0Var.f2844c;
            }
            if (i5 - i3 >= i2) {
                this.f2031y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = g0Var.f2843b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) g0Var.f2842a.get(0);
            d0 d0Var = (d0) view.getLayoutParams();
            g0Var.f2843b = g0Var.f2846f.f2024r.e(view);
            d0Var.getClass();
            i6 = g0Var.f2843b;
        }
        if (i6 + i3 <= i2) {
            this.f2031y.set(i4, false);
        }
    }

    @Override // g0.H
    public final boolean f(I i) {
        return i instanceof d0;
    }

    @Override // g0.H
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof f0) {
            f0 f0Var = (f0) parcelable;
            this.F = f0Var;
            if (this.f2032z != -1) {
                f0Var.d = null;
                f0Var.f2832c = 0;
                f0Var.f2830a = -1;
                f0Var.f2831b = -1;
                f0Var.d = null;
                f0Var.f2832c = 0;
                f0Var.f2833e = 0;
                f0Var.f2834f = null;
                f0Var.f2835g = null;
            }
            n0();
        }
    }

    @Override // g0.H
    public final Parcelable g0() {
        int h;
        int k2;
        int[] iArr;
        f0 f0Var = this.F;
        if (f0Var != null) {
            f0 f0Var2 = new f0();
            f0Var2.f2832c = f0Var.f2832c;
            f0Var2.f2830a = f0Var.f2830a;
            f0Var2.f2831b = f0Var.f2831b;
            f0Var2.d = f0Var.d;
            f0Var2.f2833e = f0Var.f2833e;
            f0Var2.f2834f = f0Var.f2834f;
            f0Var2.h = f0Var.h;
            f0Var2.i = f0Var.i;
            f0Var2.f2836j = f0Var.f2836j;
            f0Var2.f2835g = f0Var.f2835g;
            return f0Var2;
        }
        f0 f0Var3 = new f0();
        f0Var3.h = this.f2029w;
        f0Var3.i = this.f2015D;
        f0Var3.f2836j = this.f2016E;
        C0385x c0385x = this.f2013B;
        if (c0385x == null || (iArr = (int[]) c0385x.f4231b) == null) {
            f0Var3.f2833e = 0;
        } else {
            f0Var3.f2834f = iArr;
            f0Var3.f2833e = iArr.length;
            f0Var3.f2835g = (ArrayList) c0385x.f4232c;
        }
        if (v() > 0) {
            f0Var3.f2830a = this.f2015D ? N0() : M0();
            View I02 = this.f2030x ? I0(true) : J0(true);
            f0Var3.f2831b = I02 != null ? H.H(I02) : -1;
            int i = this.f2022p;
            f0Var3.f2832c = i;
            f0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f2022p; i2++) {
                if (this.f2015D) {
                    h = this.f2023q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f2024r.g();
                        h -= k2;
                        f0Var3.d[i2] = h;
                    } else {
                        f0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f2023q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f2024r.k();
                        h -= k2;
                        f0Var3.d[i2] = h;
                    } else {
                        f0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            f0Var3.f2830a = -1;
            f0Var3.f2831b = -1;
            f0Var3.f2832c = 0;
        }
        return f0Var3;
    }

    @Override // g0.H
    public final void h(int i, int i2, U u2, C0149m c0149m) {
        C0153q c0153q;
        int f2;
        int i3;
        if (this.f2026t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, u2);
        int[] iArr = this.f2020J;
        if (iArr == null || iArr.length < this.f2022p) {
            this.f2020J = new int[this.f2022p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f2022p;
            c0153q = this.f2028v;
            if (i4 >= i6) {
                break;
            }
            if (c0153q.d == -1) {
                f2 = c0153q.f2917f;
                i3 = this.f2023q[i4].h(f2);
            } else {
                f2 = this.f2023q[i4].f(c0153q.f2918g);
                i3 = c0153q.f2918g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f2020J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f2020J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0153q.f2915c;
            if (i9 < 0 || i9 >= u2.b()) {
                return;
            }
            c0149m.a(c0153q.f2915c, this.f2020J[i8]);
            c0153q.f2915c += c0153q.d;
        }
    }

    @Override // g0.H
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // g0.H
    public final int j(U u2) {
        return E0(u2);
    }

    @Override // g0.H
    public final int k(U u2) {
        return F0(u2);
    }

    @Override // g0.H
    public final int l(U u2) {
        return G0(u2);
    }

    @Override // g0.H
    public final int m(U u2) {
        return E0(u2);
    }

    @Override // g0.H
    public final int n(U u2) {
        return F0(u2);
    }

    @Override // g0.H
    public final int o(U u2) {
        return G0(u2);
    }

    @Override // g0.H
    public final int o0(int i, N n2, U u2) {
        return b1(i, n2, u2);
    }

    @Override // g0.H
    public final void p0(int i) {
        f0 f0Var = this.F;
        if (f0Var != null && f0Var.f2830a != i) {
            f0Var.d = null;
            f0Var.f2832c = 0;
            f0Var.f2830a = -1;
            f0Var.f2831b = -1;
        }
        this.f2032z = i;
        this.f2012A = Integer.MIN_VALUE;
        n0();
    }

    @Override // g0.H
    public final int q0(int i, N n2, U u2) {
        return b1(i, n2, u2);
    }

    @Override // g0.H
    public final I r() {
        return this.f2026t == 0 ? new d0(-2, -1) : new d0(-1, -2);
    }

    @Override // g0.H
    public final I s(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    @Override // g0.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d0((ViewGroup.MarginLayoutParams) layoutParams) : new d0(layoutParams);
    }

    @Override // g0.H
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f2022p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f2026t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2725b;
            WeakHashMap weakHashMap = Q.f578a;
            g3 = H.g(i2, height, recyclerView.getMinimumHeight());
            g2 = H.g(i, (this.f2027u * i3) + F, this.f2725b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2725b;
            WeakHashMap weakHashMap2 = Q.f578a;
            g2 = H.g(i, width, recyclerView2.getMinimumWidth());
            g3 = H.g(i2, (this.f2027u * i3) + D2, this.f2725b.getMinimumHeight());
        }
        this.f2725b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.H
    public final void z0(RecyclerView recyclerView, int i) {
        C0157v c0157v = new C0157v(recyclerView.getContext());
        c0157v.f2938a = i;
        A0(c0157v);
    }
}
