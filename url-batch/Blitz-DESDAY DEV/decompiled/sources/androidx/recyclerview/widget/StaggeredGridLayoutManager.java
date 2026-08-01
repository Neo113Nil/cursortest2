package androidx.recyclerview.widget;

import D.j;
import M.Q;
import N.i;
import O0.B;
import V.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.C0126m;
import h0.C0130q;
import h0.C0134v;
import h0.H;
import h0.I;
import h0.J;
import h0.O;
import h0.T;
import h0.U;
import h0.a0;
import h0.c0;
import h0.d0;
import h0.e0;
import h0.f0;
import h0.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends I implements T {

    /* renamed from: B, reason: collision with root package name */
    public final j f1682B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1683C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1684D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1685E;

    /* renamed from: F, reason: collision with root package name */
    public f0 f1686F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1687G;
    public final c0 H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1688I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1689J;

    /* renamed from: K, reason: collision with root package name */
    public final B f1690K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1691p;

    /* renamed from: q, reason: collision with root package name */
    public final g0[] f1692q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1693r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1694s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1695t;

    /* renamed from: u, reason: collision with root package name */
    public int f1696u;

    /* renamed from: v, reason: collision with root package name */
    public final C0130q f1697v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1698w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1700y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1699x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1701z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1681A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1691p = -1;
        this.f1698w = false;
        j jVar = new j(13, false);
        this.f1682B = jVar;
        this.f1683C = 2;
        this.f1687G = new Rect();
        this.H = new c0(this);
        this.f1688I = true;
        this.f1690K = new B(8, this);
        H I2 = I.I(context, attributeSet, i, i2);
        int i3 = I2.f2376a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1695t) {
            this.f1695t = i3;
            g gVar = this.f1693r;
            this.f1693r = this.f1694s;
            this.f1694s = gVar;
            l0();
        }
        int i4 = I2.f2377b;
        c(null);
        if (i4 != this.f1691p) {
            int[] iArr = (int[]) jVar.f133b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f134c = null;
            l0();
            this.f1691p = i4;
            this.f1700y = new BitSet(this.f1691p);
            this.f1692q = new g0[this.f1691p];
            for (int i5 = 0; i5 < this.f1691p; i5++) {
                this.f1692q[i5] = new g0(this, i5);
            }
            l0();
        }
        boolean z2 = I2.f2378c;
        c(null);
        f0 f0Var = this.f1686F;
        if (f0Var != null && f0Var.h != z2) {
            f0Var.h = z2;
        }
        this.f1698w = z2;
        l0();
        C0130q c0130q = new C0130q();
        c0130q.f2568a = true;
        c0130q.f2572f = 0;
        c0130q.f2573g = 0;
        this.f1697v = c0130q;
        this.f1693r = g.a(this, this.f1695t);
        this.f1694s = g.a(this, 1 - this.f1695t);
    }

    public static int d1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int A0(int i) {
        if (v() == 0) {
            return this.f1699x ? 1 : -1;
        }
        return (i < K0()) != this.f1699x ? -1 : 1;
    }

    public final boolean B0() {
        int K02;
        if (v() != 0 && this.f1683C != 0 && this.f2384g) {
            if (this.f1699x) {
                K02 = L0();
                K0();
            } else {
                K02 = K0();
                L0();
            }
            j jVar = this.f1682B;
            if (K02 == 0 && P0() != null) {
                int[] iArr = (int[]) jVar.f133b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                jVar.f134c = null;
                this.f2383f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int C0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1693r;
        boolean z2 = !this.f1688I;
        return a0.f(u2, gVar, H0(z2), G0(z2), this, this.f1688I);
    }

    public final int D0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1693r;
        boolean z2 = !this.f1688I;
        return a0.g(u2, gVar, H0(z2), G0(z2), this, this.f1688I, this.f1699x);
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1693r;
        boolean z2 = !this.f1688I;
        return a0.h(u2, gVar, H0(z2), G0(z2), this, this.f1688I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int F0(O o2, C0130q c0130q, U u2) {
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
        this.f1700y.set(0, this.f1691p, true);
        C0130q c0130q2 = this.f1697v;
        int i8 = c0130q2.i ? c0130q.f2571e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0130q.f2571e == 1 ? c0130q.f2573g + c0130q.f2569b : c0130q.f2572f - c0130q.f2569b;
        int i9 = c0130q.f2571e;
        for (int i10 = 0; i10 < this.f1691p; i10++) {
            if (!this.f1692q[i10].f2497a.isEmpty()) {
                c1(this.f1692q[i10], i9, i8);
            }
        }
        int g2 = this.f1699x ? this.f1693r.g() : this.f1693r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0130q.f2570c;
            if (((i11 < 0 || i11 >= u2.b()) ? i6 : i7) == 0 || (!c0130q2.i && this.f1700y.isEmpty())) {
                break;
            }
            View view = o2.i(c0130q.f2570c, Long.MAX_VALUE).f2430a;
            c0130q.f2570c += c0130q.d;
            d0 d0Var = (d0) view.getLayoutParams();
            int b2 = d0Var.f2391a.b();
            j jVar = this.f1682B;
            int[] iArr = (int[]) jVar.f133b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (T0(c0130q.f2571e)) {
                    i5 = this.f1691p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1691p;
                    i5 = i6;
                }
                g0 g0Var2 = null;
                if (c0130q.f2571e == i7) {
                    int k3 = this.f1693r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        g0 g0Var3 = this.f1692q[i5];
                        int f2 = g0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            g0Var2 = g0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1693r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        g0 g0Var4 = this.f1692q[i5];
                        int h2 = g0Var4.h(g3);
                        if (h2 > i14) {
                            g0Var2 = g0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                g0Var = g0Var2;
                jVar.u(b2);
                ((int[]) jVar.f133b)[b2] = g0Var.f2500e;
            } else {
                g0Var = this.f1692q[i12];
            }
            d0Var.f2472e = g0Var;
            if (c0130q.f2571e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1695t == 1) {
                i = 1;
                R0(view, I.w(r6, this.f1696u, this.f2387l, r6, ((ViewGroup.MarginLayoutParams) d0Var).width), I.w(true, this.f2390o, this.f2388m, D() + G(), ((ViewGroup.MarginLayoutParams) d0Var).height));
            } else {
                i = 1;
                R0(view, I.w(true, this.f2389n, this.f2387l, F() + E(), ((ViewGroup.MarginLayoutParams) d0Var).width), I.w(false, this.f1696u, this.f2388m, 0, ((ViewGroup.MarginLayoutParams) d0Var).height));
            }
            if (c0130q.f2571e == i) {
                c2 = g0Var.f(g2);
                h = this.f1693r.c(view) + c2;
            } else {
                h = g0Var.h(g2);
                c2 = h - this.f1693r.c(view);
            }
            if (c0130q.f2571e == 1) {
                g0 g0Var5 = d0Var.f2472e;
                g0Var5.getClass();
                d0 d0Var2 = (d0) view.getLayoutParams();
                d0Var2.f2472e = g0Var5;
                ArrayList arrayList = g0Var5.f2497a;
                arrayList.add(view);
                g0Var5.f2499c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    g0Var5.f2498b = Integer.MIN_VALUE;
                }
                if (d0Var2.f2391a.i() || d0Var2.f2391a.l()) {
                    g0Var5.d = g0Var5.f2501f.f1693r.c(view) + g0Var5.d;
                }
            } else {
                g0 g0Var6 = d0Var.f2472e;
                g0Var6.getClass();
                d0 d0Var3 = (d0) view.getLayoutParams();
                d0Var3.f2472e = g0Var6;
                ArrayList arrayList2 = g0Var6.f2497a;
                arrayList2.add(0, view);
                g0Var6.f2498b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    g0Var6.f2499c = Integer.MIN_VALUE;
                }
                if (d0Var3.f2391a.i() || d0Var3.f2391a.l()) {
                    g0Var6.d = g0Var6.f2501f.f1693r.c(view) + g0Var6.d;
                }
            }
            if (Q0() && this.f1695t == 1) {
                c3 = this.f1694s.g() - (((this.f1691p - 1) - g0Var.f2500e) * this.f1696u);
                k2 = c3 - this.f1694s.c(view);
            } else {
                k2 = this.f1694s.k() + (g0Var.f2500e * this.f1696u);
                c3 = this.f1694s.c(view) + k2;
            }
            if (this.f1695t == 1) {
                I.N(view, k2, c2, c3, h);
            } else {
                I.N(view, c2, k2, h, c3);
            }
            c1(g0Var, c0130q2.f2571e, i8);
            V0(o2, c0130q2);
            if (c0130q2.h && view.hasFocusable()) {
                i2 = 0;
                this.f1700y.set(g0Var.f2500e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            V0(o2, c0130q2);
        }
        int k4 = c0130q2.f2571e == -1 ? this.f1693r.k() - N0(this.f1693r.k()) : M0(this.f1693r.g()) - this.f1693r.g();
        return k4 > 0 ? Math.min(c0130q.f2569b, k4) : i15;
    }

    public final View G0(boolean z2) {
        int k2 = this.f1693r.k();
        int g2 = this.f1693r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1693r.e(u2);
            int b2 = this.f1693r.b(u2);
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

    public final View H0(boolean z2) {
        int k2 = this.f1693r.k();
        int g2 = this.f1693r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1693r.e(u2);
            if (this.f1693r.b(u2) > k2 && e2 < g2) {
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

    public final void I0(O o2, U u2, boolean z2) {
        int g2;
        int M02 = M0(Integer.MIN_VALUE);
        if (M02 != Integer.MIN_VALUE && (g2 = this.f1693r.g() - M02) > 0) {
            int i = g2 - (-Z0(-g2, o2, u2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1693r.p(i);
        }
    }

    @Override // h0.I
    public final int J(O o2, U u2) {
        return this.f1695t == 0 ? this.f1691p : super.J(o2, u2);
    }

    public final void J0(O o2, U u2, boolean z2) {
        int k2;
        int N02 = N0(Integer.MAX_VALUE);
        if (N02 != Integer.MAX_VALUE && (k2 = N02 - this.f1693r.k()) > 0) {
            int Z02 = k2 - Z0(k2, o2, u2);
            if (!z2 || Z02 <= 0) {
                return;
            }
            this.f1693r.p(-Z02);
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return I.H(u(0));
    }

    @Override // h0.I
    public final boolean L() {
        return this.f1683C != 0;
    }

    public final int L0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return I.H(u(v2 - 1));
    }

    public final int M0(int i) {
        int f2 = this.f1692q[0].f(i);
        for (int i2 = 1; i2 < this.f1691p; i2++) {
            int f3 = this.f1692q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public final int N0(int i) {
        int h = this.f1692q[0].h(i);
        for (int i2 = 1; i2 < this.f1691p; i2++) {
            int h2 = this.f1692q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // h0.I
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1691p; i2++) {
            g0 g0Var = this.f1692q[i2];
            int i3 = g0Var.f2498b;
            if (i3 != Integer.MIN_VALUE) {
                g0Var.f2498b = i3 + i;
            }
            int i4 = g0Var.f2499c;
            if (i4 != Integer.MIN_VALUE) {
                g0Var.f2499c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(int i, int i2, int i3) {
        int i4;
        int i5;
        j jVar;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int L02 = this.f1699x ? L0() : K0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1682B;
                iArr = (int[]) jVar.f133b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f134c;
                    if (arrayList != null) {
                        e0 e0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                e0 e0Var2 = (e0) ((ArrayList) jVar.f134c).get(size);
                                if (e0Var2.f2478a == i5) {
                                    e0Var = e0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (e0Var != null) {
                            ((ArrayList) jVar.f134c).remove(e0Var);
                        }
                        int size2 = ((ArrayList) jVar.f134c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((e0) ((ArrayList) jVar.f134c).get(i7)).f2478a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            e0 e0Var3 = (e0) ((ArrayList) jVar.f134c).get(i7);
                            ((ArrayList) jVar.f134c).remove(i7);
                            i6 = e0Var3.f2478a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f133b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f133b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f133b, i5, i6 + 1, -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    jVar.z(i, i2);
                } else if (i3 == 2) {
                    jVar.A(i, i2);
                } else if (i3 == 8) {
                    jVar.A(i, 1);
                    jVar.z(i2, 1);
                }
                if (i4 > L02) {
                    return;
                }
                if (i5 <= (this.f1699x ? K0() : L0())) {
                    l0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1682B;
        iArr = (int[]) jVar.f133b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f134c;
            if (arrayList != null) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > L02) {
        }
    }

    @Override // h0.I
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1691p; i2++) {
            g0 g0Var = this.f1692q[i2];
            int i3 = g0Var.f2498b;
            if (i3 != Integer.MIN_VALUE) {
                g0Var.f2498b = i3 + i;
            }
            int i4 = g0Var.f2499c;
            if (i4 != Integer.MIN_VALUE) {
                g0Var.f2499c = i4 + i;
            }
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
    public final View P0() {
        int v2 = v();
        int i = v2 - 1;
        BitSet bitSet = new BitSet(this.f1691p);
        bitSet.set(0, this.f1691p, true);
        char c2 = (this.f1695t == 1 && Q0()) ? (char) 1 : (char) 65535;
        if (this.f1699x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            d0 d0Var = (d0) u2.getLayoutParams();
            if (bitSet.get(d0Var.f2472e.f2500e)) {
                g0 g0Var = d0Var.f2472e;
                if (this.f1699x) {
                    int i3 = g0Var.f2499c;
                    if (i3 == Integer.MIN_VALUE) {
                        g0Var.a();
                        i3 = g0Var.f2499c;
                    }
                    if (i3 < this.f1693r.g()) {
                        ArrayList arrayList = g0Var.f2497a;
                        ((d0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(d0Var.f2472e.f2500e);
                } else {
                    int i4 = g0Var.f2498b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) g0Var.f2497a.get(0);
                        d0 d0Var2 = (d0) view.getLayoutParams();
                        g0Var.f2498b = g0Var.f2501f.f1693r.e(view);
                        d0Var2.getClass();
                        i4 = g0Var.f2498b;
                    }
                    if (i4 > this.f1693r.k()) {
                        ((d0) ((View) g0Var.f2497a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(d0Var.f2472e.f2500e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1699x) {
                    int b2 = this.f1693r.b(u2);
                    int b3 = this.f1693r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((d0Var.f2472e.f2500e - ((d0) u3.getLayoutParams()).f2472e.f2500e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1693r.e(u2);
                    int e3 = this.f1693r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((d0Var.f2472e.f2500e - ((d0) u3.getLayoutParams()).f2472e.f2500e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final boolean Q0() {
        return C() == 1;
    }

    @Override // h0.I
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2380b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1690K);
        }
        for (int i = 0; i < this.f1691p; i++) {
            this.f1692q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2380b;
        Rect rect = this.f1687G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        d0 d0Var = (d0) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) d0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) d0Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) d0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin + rect.bottom);
        if (u0(view, d1, d12, d0Var)) {
            view.measure(d1, d12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004f, code lost:
    
        if (r8.f1695t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0054, code lost:
    
        if (r8.f1695t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0061, code lost:
    
        if (Q0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
    
        if (Q0() == false) goto L46;
     */
    @Override // h0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, O o2, U u2) {
        View A2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView == null || (A2 = recyclerView.A(view)) == null || ((ArrayList) this.f2379a.d).contains(A2)) {
            A2 = null;
        }
        if (A2 == null) {
            return null;
        }
        Y0();
        if (i == 1) {
            if (this.f1695t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1695t != 1) {
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
        d0 d0Var = (d0) A2.getLayoutParams();
        d0Var.getClass();
        g0 g0Var = d0Var.f2472e;
        int L02 = i2 == 1 ? L0() : K0();
        b1(L02, u2);
        a1(i2);
        C0130q c0130q = this.f1697v;
        c0130q.f2570c = c0130q.d + L02;
        c0130q.f2569b = (int) (this.f1693r.l() * 0.33333334f);
        c0130q.h = true;
        c0130q.f2568a = false;
        F0(o2, c0130q, u2);
        this.f1684D = this.f1699x;
        View g2 = g0Var.g(L02, i2);
        if (g2 != null && g2 != A2) {
            return g2;
        }
        if (T0(i2)) {
            for (int i3 = this.f1691p - 1; i3 >= 0; i3--) {
                View g3 = this.f1692q[i3].g(L02, i2);
                if (g3 != null && g3 != A2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1691p; i4++) {
                View g4 = this.f1692q[i4].g(L02, i2);
                if (g4 != null && g4 != A2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1698w ^ true) == (i2 == -1);
        View q2 = q(z2 ? g0Var.c() : g0Var.d());
        if (q2 != null && q2 != A2) {
            return q2;
        }
        if (T0(i2)) {
            for (int i5 = this.f1691p - 1; i5 >= 0; i5--) {
                if (i5 != g0Var.f2500e) {
                    View q3 = q(z2 ? this.f1692q[i5].c() : this.f1692q[i5].d());
                    if (q3 != null && q3 != A2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1691p; i6++) {
                View q4 = q(z2 ? this.f1692q[i6].c() : this.f1692q[i6].d());
                if (q4 != null && q4 != A2) {
                    return q4;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x040a, code lost:
    
        if (B0() != false) goto L250;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(O o2, U u2, boolean z2) {
        f0 f0Var;
        int i;
        int i2;
        f0 f0Var2 = this.f1686F;
        c0 c0Var = this.H;
        if (!(f0Var2 == null && this.f1701z == -1) && u2.b() == 0) {
            g0(o2);
            c0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (c0Var.f2465e && this.f1701z == -1 && this.f1686F == null) ? false : true;
        j jVar = this.f1682B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0Var.f2467g;
        if (z4) {
            c0Var.a();
            f0 f0Var3 = this.f1686F;
            if (f0Var3 != null) {
                int i3 = f0Var3.f2487c;
                if (i3 > 0) {
                    if (i3 == this.f1691p) {
                        for (int i4 = 0; i4 < this.f1691p; i4++) {
                            this.f1692q[i4].b();
                            f0 f0Var4 = this.f1686F;
                            int i5 = f0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += f0Var4.i ? this.f1693r.g() : this.f1693r.k();
                            }
                            g0 g0Var = this.f1692q[i4];
                            g0Var.f2498b = i5;
                            g0Var.f2499c = i5;
                        }
                    } else {
                        f0Var3.d = null;
                        f0Var3.f2487c = 0;
                        f0Var3.f2488e = 0;
                        f0Var3.f2489f = null;
                        f0Var3.f2490g = null;
                        f0Var3.f2485a = f0Var3.f2486b;
                    }
                }
                f0 f0Var5 = this.f1686F;
                this.f1685E = f0Var5.f2491j;
                boolean z5 = f0Var5.h;
                c(null);
                f0 f0Var6 = this.f1686F;
                if (f0Var6 != null && f0Var6.h != z5) {
                    f0Var6.h = z5;
                }
                this.f1698w = z5;
                l0();
                Y0();
                f0 f0Var7 = this.f1686F;
                int i6 = f0Var7.f2485a;
                if (i6 != -1) {
                    this.f1701z = i6;
                    c0Var.f2464c = f0Var7.i;
                } else {
                    c0Var.f2464c = this.f1699x;
                }
                if (f0Var7.f2488e > 1) {
                    jVar.f133b = f0Var7.f2489f;
                    jVar.f134c = f0Var7.f2490g;
                }
            } else {
                Y0();
                c0Var.f2464c = this.f1699x;
            }
            if (!u2.f2417g && (i2 = this.f1701z) != -1) {
                if (i2 < 0 || i2 >= u2.b()) {
                    this.f1701z = -1;
                    this.f1681A = Integer.MIN_VALUE;
                } else {
                    f0 f0Var8 = this.f1686F;
                    if (f0Var8 == null || f0Var8.f2485a == -1 || f0Var8.f2487c < 1) {
                        View q2 = q(this.f1701z);
                        if (q2 != null) {
                            c0Var.f2462a = this.f1699x ? L0() : K0();
                            if (this.f1681A != Integer.MIN_VALUE) {
                                if (c0Var.f2464c) {
                                    c0Var.f2463b = (this.f1693r.g() - this.f1681A) - this.f1693r.b(q2);
                                } else {
                                    c0Var.f2463b = (this.f1693r.k() + this.f1681A) - this.f1693r.e(q2);
                                }
                            } else if (this.f1693r.c(q2) > this.f1693r.l()) {
                                c0Var.f2463b = c0Var.f2464c ? this.f1693r.g() : this.f1693r.k();
                            } else {
                                int e2 = this.f1693r.e(q2) - this.f1693r.k();
                                if (e2 < 0) {
                                    c0Var.f2463b = -e2;
                                } else {
                                    int g2 = this.f1693r.g() - this.f1693r.b(q2);
                                    if (g2 < 0) {
                                        c0Var.f2463b = g2;
                                    } else {
                                        c0Var.f2463b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1701z;
                            c0Var.f2462a = i7;
                            int i8 = this.f1681A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = A0(i7) == 1;
                                c0Var.f2464c = z6;
                                c0Var.f2463b = z6 ? staggeredGridLayoutManager.f1693r.g() : staggeredGridLayoutManager.f1693r.k();
                            } else if (c0Var.f2464c) {
                                c0Var.f2463b = staggeredGridLayoutManager.f1693r.g() - i8;
                            } else {
                                c0Var.f2463b = staggeredGridLayoutManager.f1693r.k() + i8;
                            }
                            c0Var.d = true;
                        }
                    } else {
                        c0Var.f2463b = Integer.MIN_VALUE;
                        c0Var.f2462a = this.f1701z;
                    }
                    c0Var.f2465e = true;
                }
            }
            if (this.f1684D) {
                int b2 = u2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = I.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                c0Var.f2462a = i;
                c0Var.f2463b = Integer.MIN_VALUE;
                c0Var.f2465e = true;
            } else {
                int b3 = u2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H = I.H(u(i9));
                    if (H >= 0 && H < b3) {
                        i = H;
                        break;
                    }
                }
                i = 0;
                c0Var.f2462a = i;
                c0Var.f2463b = Integer.MIN_VALUE;
                c0Var.f2465e = true;
            }
        }
        if (this.f1686F == null && this.f1701z == -1 && (c0Var.f2464c != this.f1684D || Q0() != this.f1685E)) {
            int[] iArr = (int[]) jVar.f133b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f134c = null;
            c0Var.d = true;
        }
        if (v() > 0 && ((f0Var = this.f1686F) == null || f0Var.f2487c < 1)) {
            if (c0Var.d) {
                for (int i10 = 0; i10 < this.f1691p; i10++) {
                    this.f1692q[i10].b();
                    int i11 = c0Var.f2463b;
                    if (i11 != Integer.MIN_VALUE) {
                        g0 g0Var2 = this.f1692q[i10];
                        g0Var2.f2498b = i11;
                        g0Var2.f2499c = i11;
                    }
                }
            } else if (z4 || c0Var.f2466f == null) {
                for (int i12 = 0; i12 < this.f1691p; i12++) {
                    g0 g0Var3 = this.f1692q[i12];
                    boolean z7 = this.f1699x;
                    int i13 = c0Var.f2463b;
                    int f2 = z7 ? g0Var3.f(Integer.MIN_VALUE) : g0Var3.h(Integer.MIN_VALUE);
                    g0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = g0Var3.f2501f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1693r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1693r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            g0Var3.f2499c = f2;
                            g0Var3.f2498b = f2;
                        }
                    }
                }
                g0[] g0VarArr = this.f1692q;
                int length = g0VarArr.length;
                int[] iArr2 = c0Var.f2466f;
                if (iArr2 == null || iArr2.length < length) {
                    c0Var.f2466f = new int[staggeredGridLayoutManager.f1692q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    c0Var.f2466f[i14] = g0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1691p; i15++) {
                    g0 g0Var4 = this.f1692q[i15];
                    g0Var4.b();
                    int i16 = c0Var.f2466f[i15];
                    g0Var4.f2498b = i16;
                    g0Var4.f2499c = i16;
                }
            }
        }
        p(o2);
        C0130q c0130q = this.f1697v;
        c0130q.f2568a = false;
        int l2 = this.f1694s.l();
        this.f1696u = l2 / this.f1691p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1694s.i());
        b1(c0Var.f2462a, u2);
        if (c0Var.f2464c) {
            a1(-1);
            F0(o2, c0130q, u2);
            a1(1);
            c0130q.f2570c = c0Var.f2462a + c0130q.d;
            F0(o2, c0130q, u2);
        } else {
            a1(1);
            F0(o2, c0130q, u2);
            a1(-1);
            c0130q.f2570c = c0Var.f2462a + c0130q.d;
            F0(o2, c0130q, u2);
        }
        if (this.f1694s.i() != 1073741824) {
            int v4 = v();
            float f3 = 0.0f;
            for (int i17 = 0; i17 < v4; i17++) {
                View u3 = u(i17);
                float c2 = this.f1694s.c(u3);
                if (c2 >= f3) {
                    ((d0) u3.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1696u;
            int round = Math.round(f3 * this.f1691p);
            if (this.f1694s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1694s.l());
            }
            this.f1696u = round / this.f1691p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1694s.i());
            if (this.f1696u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u4 = u(i19);
                    d0 d0Var = (d0) u4.getLayoutParams();
                    d0Var.getClass();
                    if (Q0() && this.f1695t == 1) {
                        int i20 = -((this.f1691p - 1) - d0Var.f2472e.f2500e);
                        u4.offsetLeftAndRight((this.f1696u * i20) - (i20 * i18));
                    } else {
                        int i21 = d0Var.f2472e.f2500e;
                        int i22 = this.f1696u * i21;
                        int i23 = i21 * i18;
                        if (this.f1695t == 1) {
                            u4.offsetLeftAndRight(i22 - i23);
                        } else {
                            u4.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1699x) {
                I0(o2, u2, true);
                J0(o2, u2, false);
            } else {
                J0(o2, u2, true);
                I0(o2, u2, false);
            }
        }
        if (z2 && !u2.f2417g && this.f1683C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.f2380b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1690K);
            }
        }
        z3 = false;
        if (u2.f2417g) {
            c0Var.a();
        }
        this.f1684D = c0Var.f2464c;
        this.f1685E = Q0();
        if (z3) {
            c0Var.a();
            S0(o2, u2, false);
        }
    }

    @Override // h0.I
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View H02 = H0(false);
            View G0 = G0(false);
            if (H02 == null || G0 == null) {
                return;
            }
            int H = I.H(H02);
            int H2 = I.H(G0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final boolean T0(int i) {
        if (this.f1695t == 0) {
            return (i == -1) != this.f1699x;
        }
        return ((i == -1) == this.f1699x) == Q0();
    }

    public final void U0(int i, U u2) {
        int K02;
        int i2;
        if (i > 0) {
            K02 = L0();
            i2 = 1;
        } else {
            K02 = K0();
            i2 = -1;
        }
        C0130q c0130q = this.f1697v;
        c0130q.f2568a = true;
        b1(K02, u2);
        a1(i2);
        c0130q.f2570c = K02 + c0130q.d;
        c0130q.f2569b = Math.abs(i);
    }

    @Override // h0.I
    public final void V(O o2, U u2, View view, N.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d0)) {
            U(view, jVar);
            return;
        }
        d0 d0Var = (d0) layoutParams;
        if (this.f1695t == 0) {
            g0 g0Var = d0Var.f2472e;
            jVar.h(i.a(false, g0Var == null ? -1 : g0Var.f2500e, 1, -1, -1));
        } else {
            g0 g0Var2 = d0Var.f2472e;
            jVar.h(i.a(false, -1, -1, g0Var2 == null ? -1 : g0Var2.f2500e, 1));
        }
    }

    public final void V0(O o2, C0130q c0130q) {
        if (!c0130q.f2568a || c0130q.i) {
            return;
        }
        if (c0130q.f2569b == 0) {
            if (c0130q.f2571e == -1) {
                W0(o2, c0130q.f2573g);
                return;
            } else {
                X0(o2, c0130q.f2572f);
                return;
            }
        }
        int i = 1;
        if (c0130q.f2571e == -1) {
            int i2 = c0130q.f2572f;
            int h = this.f1692q[0].h(i2);
            while (i < this.f1691p) {
                int h2 = this.f1692q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            W0(o2, i3 < 0 ? c0130q.f2573g : c0130q.f2573g - Math.min(i3, c0130q.f2569b));
            return;
        }
        int i4 = c0130q.f2573g;
        int f2 = this.f1692q[0].f(i4);
        while (i < this.f1691p) {
            int f3 = this.f1692q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - c0130q.f2573g;
        X0(o2, i5 < 0 ? c0130q.f2572f : Math.min(i5, c0130q.f2569b) + c0130q.f2572f);
    }

    @Override // h0.I
    public final void W(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void W0(O o2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1693r.e(u2) < i || this.f1693r.o(u2) < i) {
                return;
            }
            d0 d0Var = (d0) u2.getLayoutParams();
            d0Var.getClass();
            if (d0Var.f2472e.f2497a.size() == 1) {
                return;
            }
            g0 g0Var = d0Var.f2472e;
            ArrayList arrayList = g0Var.f2497a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            d0 d0Var2 = (d0) view.getLayoutParams();
            d0Var2.f2472e = null;
            if (d0Var2.f2391a.i() || d0Var2.f2391a.l()) {
                g0Var.d -= g0Var.f2501f.f1693r.c(view);
            }
            if (size == 1) {
                g0Var.f2498b = Integer.MIN_VALUE;
            }
            g0Var.f2499c = Integer.MIN_VALUE;
            i0(u2, o2);
        }
    }

    @Override // h0.I
    public final void X() {
        j jVar = this.f1682B;
        int[] iArr = (int[]) jVar.f133b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        jVar.f134c = null;
        l0();
    }

    public final void X0(O o2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1693r.b(u2) > i || this.f1693r.n(u2) > i) {
                return;
            }
            d0 d0Var = (d0) u2.getLayoutParams();
            d0Var.getClass();
            if (d0Var.f2472e.f2497a.size() == 1) {
                return;
            }
            g0 g0Var = d0Var.f2472e;
            ArrayList arrayList = g0Var.f2497a;
            View view = (View) arrayList.remove(0);
            d0 d0Var2 = (d0) view.getLayoutParams();
            d0Var2.f2472e = null;
            if (arrayList.size() == 0) {
                g0Var.f2499c = Integer.MIN_VALUE;
            }
            if (d0Var2.f2391a.i() || d0Var2.f2391a.l()) {
                g0Var.d -= g0Var.f2501f.f1693r.c(view);
            }
            g0Var.f2498b = Integer.MIN_VALUE;
            i0(u2, o2);
        }
    }

    @Override // h0.I
    public final void Y(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void Y0() {
        if (this.f1695t == 1 || !Q0()) {
            this.f1699x = this.f1698w;
        } else {
            this.f1699x = !this.f1698w;
        }
    }

    @Override // h0.I
    public final void Z(int i, int i2) {
        O0(i, i2, 2);
    }

    public final int Z0(int i, O o2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, u2);
        C0130q c0130q = this.f1697v;
        int F02 = F0(o2, c0130q, u2);
        if (c0130q.f2569b >= F02) {
            i = i < 0 ? -F02 : F02;
        }
        this.f1693r.p(-i);
        this.f1684D = this.f1699x;
        c0130q.f2569b = 0;
        V0(o2, c0130q);
        return i;
    }

    @Override // h0.T
    public final PointF a(int i) {
        int A02 = A0(i);
        PointF pointF = new PointF();
        if (A02 == 0) {
            return null;
        }
        if (this.f1695t == 0) {
            pointF.x = A02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = A02;
        }
        return pointF;
    }

    @Override // h0.I
    public final void a0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void a1(int i) {
        C0130q c0130q = this.f1697v;
        c0130q.f2571e = i;
        c0130q.d = this.f1699x != (i == -1) ? -1 : 1;
    }

    @Override // h0.I
    public final void b0(O o2, U u2) {
        S0(o2, u2, true);
    }

    public final void b1(int i, U u2) {
        int i2;
        int i3;
        int i4;
        C0130q c0130q = this.f1697v;
        boolean z2 = false;
        c0130q.f2569b = 0;
        c0130q.f2570c = i;
        C0134v c0134v = this.f2382e;
        if (!(c0134v != null && c0134v.f2596e) || (i4 = u2.f2412a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1699x == (i4 < i)) {
                i2 = this.f1693r.l();
                i3 = 0;
            } else {
                i3 = this.f1693r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2380b;
        if (recyclerView == null || !recyclerView.f1652g) {
            c0130q.f2573g = this.f1693r.f() + i2;
            c0130q.f2572f = -i3;
        } else {
            c0130q.f2572f = this.f1693r.k() - i3;
            c0130q.f2573g = this.f1693r.g() + i2;
        }
        c0130q.h = false;
        c0130q.f2568a = true;
        if (this.f1693r.i() == 0 && this.f1693r.f() == 0) {
            z2 = true;
        }
        c0130q.i = z2;
    }

    @Override // h0.I
    public final void c(String str) {
        if (this.f1686F == null) {
            super.c(str);
        }
    }

    @Override // h0.I
    public final void c0(U u2) {
        this.f1701z = -1;
        this.f1681A = Integer.MIN_VALUE;
        this.f1686F = null;
        this.H.a();
    }

    public final void c1(g0 g0Var, int i, int i2) {
        int i3 = g0Var.d;
        int i4 = g0Var.f2500e;
        if (i != -1) {
            int i5 = g0Var.f2499c;
            if (i5 == Integer.MIN_VALUE) {
                g0Var.a();
                i5 = g0Var.f2499c;
            }
            if (i5 - i3 >= i2) {
                this.f1700y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = g0Var.f2498b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) g0Var.f2497a.get(0);
            d0 d0Var = (d0) view.getLayoutParams();
            g0Var.f2498b = g0Var.f2501f.f1693r.e(view);
            d0Var.getClass();
            i6 = g0Var.f2498b;
        }
        if (i6 + i3 <= i2) {
            this.f1700y.set(i4, false);
        }
    }

    @Override // h0.I
    public final boolean d() {
        return this.f1695t == 0;
    }

    @Override // h0.I
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof f0) {
            this.f1686F = (f0) parcelable;
            l0();
        }
    }

    @Override // h0.I
    public final boolean e() {
        return this.f1695t == 1;
    }

    @Override // h0.I
    public final Parcelable e0() {
        int h;
        int k2;
        int[] iArr;
        f0 f0Var = this.f1686F;
        if (f0Var != null) {
            f0 f0Var2 = new f0();
            f0Var2.f2487c = f0Var.f2487c;
            f0Var2.f2485a = f0Var.f2485a;
            f0Var2.f2486b = f0Var.f2486b;
            f0Var2.d = f0Var.d;
            f0Var2.f2488e = f0Var.f2488e;
            f0Var2.f2489f = f0Var.f2489f;
            f0Var2.h = f0Var.h;
            f0Var2.i = f0Var.i;
            f0Var2.f2491j = f0Var.f2491j;
            f0Var2.f2490g = f0Var.f2490g;
            return f0Var2;
        }
        f0 f0Var3 = new f0();
        f0Var3.h = this.f1698w;
        f0Var3.i = this.f1684D;
        f0Var3.f2491j = this.f1685E;
        j jVar = this.f1682B;
        if (jVar == null || (iArr = (int[]) jVar.f133b) == null) {
            f0Var3.f2488e = 0;
        } else {
            f0Var3.f2489f = iArr;
            f0Var3.f2488e = iArr.length;
            f0Var3.f2490g = (ArrayList) jVar.f134c;
        }
        if (v() > 0) {
            f0Var3.f2485a = this.f1684D ? L0() : K0();
            View G0 = this.f1699x ? G0(true) : H0(true);
            f0Var3.f2486b = G0 != null ? I.H(G0) : -1;
            int i = this.f1691p;
            f0Var3.f2487c = i;
            f0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1691p; i2++) {
                if (this.f1684D) {
                    h = this.f1692q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1693r.g();
                        h -= k2;
                        f0Var3.d[i2] = h;
                    } else {
                        f0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f1692q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1693r.k();
                        h -= k2;
                        f0Var3.d[i2] = h;
                    } else {
                        f0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            f0Var3.f2485a = -1;
            f0Var3.f2486b = -1;
            f0Var3.f2487c = 0;
        }
        return f0Var3;
    }

    @Override // h0.I
    public final boolean f(J j2) {
        return j2 instanceof d0;
    }

    @Override // h0.I
    public final void f0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // h0.I
    public final void h(int i, int i2, U u2, C0126m c0126m) {
        C0130q c0130q;
        int f2;
        int i3;
        if (this.f1695t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, u2);
        int[] iArr = this.f1689J;
        if (iArr == null || iArr.length < this.f1691p) {
            this.f1689J = new int[this.f1691p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1691p;
            c0130q = this.f1697v;
            if (i4 >= i6) {
                break;
            }
            if (c0130q.d == -1) {
                f2 = c0130q.f2572f;
                i3 = this.f1692q[i4].h(f2);
            } else {
                f2 = this.f1692q[i4].f(c0130q.f2573g);
                i3 = c0130q.f2573g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1689J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1689J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0130q.f2570c;
            if (i9 < 0 || i9 >= u2.b()) {
                return;
            }
            c0126m.a(c0130q.f2570c, this.f1689J[i8]);
            c0130q.f2570c += c0130q.d;
        }
    }

    @Override // h0.I
    public final int j(U u2) {
        return C0(u2);
    }

    @Override // h0.I
    public final int k(U u2) {
        return D0(u2);
    }

    @Override // h0.I
    public final int l(U u2) {
        return E0(u2);
    }

    @Override // h0.I
    public final int m(U u2) {
        return C0(u2);
    }

    @Override // h0.I
    public final int m0(int i, O o2, U u2) {
        return Z0(i, o2, u2);
    }

    @Override // h0.I
    public final int n(U u2) {
        return D0(u2);
    }

    @Override // h0.I
    public final void n0(int i) {
        f0 f0Var = this.f1686F;
        if (f0Var != null && f0Var.f2485a != i) {
            f0Var.d = null;
            f0Var.f2487c = 0;
            f0Var.f2485a = -1;
            f0Var.f2486b = -1;
        }
        this.f1701z = i;
        this.f1681A = Integer.MIN_VALUE;
        l0();
    }

    @Override // h0.I
    public final int o(U u2) {
        return E0(u2);
    }

    @Override // h0.I
    public final int o0(int i, O o2, U u2) {
        return Z0(i, o2, u2);
    }

    @Override // h0.I
    public final J r() {
        return this.f1695t == 0 ? new d0(-2, -1) : new d0(-1, -2);
    }

    @Override // h0.I
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1691p;
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1695t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2380b;
            WeakHashMap weakHashMap = Q.f513a;
            g3 = I.g(i2, height, recyclerView.getMinimumHeight());
            g2 = I.g(i, (this.f1696u * i3) + F2, this.f2380b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f2380b;
            WeakHashMap weakHashMap2 = Q.f513a;
            g2 = I.g(i, width, recyclerView2.getMinimumWidth());
            g3 = I.g(i2, (this.f1696u * i3) + D2, this.f2380b.getMinimumHeight());
        }
        this.f2380b.setMeasuredDimension(g2, g3);
    }

    @Override // h0.I
    public final J s(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    @Override // h0.I
    public final J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d0((ViewGroup.MarginLayoutParams) layoutParams) : new d0(layoutParams);
    }

    @Override // h0.I
    public final int x(O o2, U u2) {
        return this.f1695t == 1 ? this.f1691p : super.x(o2, u2);
    }

    @Override // h0.I
    public final void x0(RecyclerView recyclerView, int i) {
        C0134v c0134v = new C0134v(recyclerView.getContext());
        c0134v.f2593a = i;
        y0(c0134v);
    }

    @Override // h0.I
    public final boolean z0() {
        return this.f1686F == null;
    }
}
