package androidx.recyclerview.widget;

import B.j;
import K.T;
import M0.B;
import U.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.C0129o;
import g0.C0132s;
import g0.C0137x;
import g0.K;
import g0.L;
import g0.M;
import g0.S;
import g0.X;
import g0.Y;
import g0.g0;
import g0.h0;
import g0.i0;
import g0.j0;
import g0.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import w1.d;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends L implements X {

    /* renamed from: B, reason: collision with root package name */
    public final j f1605B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1606C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1607D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1608E;
    public j0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1609G;

    /* renamed from: H, reason: collision with root package name */
    public final g0 f1610H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1611I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1612J;

    /* renamed from: K, reason: collision with root package name */
    public final B f1613K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1614p;

    /* renamed from: q, reason: collision with root package name */
    public final k0[] f1615q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1616r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1617s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1618t;

    /* renamed from: u, reason: collision with root package name */
    public int f1619u;

    /* renamed from: v, reason: collision with root package name */
    public final C0132s f1620v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1621w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1623y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1622x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1624z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1604A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1614p = -1;
        this.f1621w = false;
        j jVar = new j(13, false);
        this.f1605B = jVar;
        this.f1606C = 2;
        this.f1609G = new Rect();
        this.f1610H = new g0(this);
        this.f1611I = true;
        this.f1613K = new B(7, this);
        K I2 = L.I(context, attributeSet, i, i2);
        int i3 = I2.f2272a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1618t) {
            this.f1618t = i3;
            g gVar = this.f1616r;
            this.f1616r = this.f1617s;
            this.f1617s = gVar;
            n0();
        }
        int i4 = I2.f2273b;
        c(null);
        if (i4 != this.f1614p) {
            jVar.b();
            n0();
            this.f1614p = i4;
            this.f1623y = new BitSet(this.f1614p);
            this.f1615q = new k0[this.f1614p];
            for (int i5 = 0; i5 < this.f1614p; i5++) {
                this.f1615q[i5] = new k0(this, i5);
            }
            n0();
        }
        boolean z2 = I2.f2274c;
        c(null);
        j0 j0Var = this.F;
        if (j0Var != null && j0Var.h != z2) {
            j0Var.h = z2;
        }
        this.f1621w = z2;
        n0();
        C0132s c0132s = new C0132s();
        c0132s.f2472a = true;
        c0132s.f2476f = 0;
        c0132s.f2477g = 0;
        this.f1620v = c0132s;
        this.f1616r = g.a(this, this.f1618t);
        this.f1617s = g.a(this, 1 - this.f1618t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // g0.L
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.f1622x ? 1 : -1;
        }
        return (i < M0()) != this.f1622x ? -1 : 1;
    }

    public final boolean D0() {
        int M02;
        if (v() != 0 && this.f1606C != 0 && this.f2280g) {
            if (this.f1622x) {
                M02 = N0();
                M0();
            } else {
                M02 = M0();
                N0();
            }
            j jVar = this.f1605B;
            if (M02 == 0 && R0() != null) {
                jVar.b();
                this.f2279f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(Y y2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1616r;
        boolean z2 = !this.f1611I;
        return d.q(y2, gVar, J0(z2), I0(z2), this, this.f1611I);
    }

    public final int F0(Y y2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1616r;
        boolean z2 = !this.f1611I;
        return d.r(y2, gVar, J0(z2), I0(z2), this, this.f1611I, this.f1622x);
    }

    public final int G0(Y y2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1616r;
        boolean z2 = !this.f1611I;
        return d.s(y2, gVar, J0(z2), I0(z2), this, this.f1611I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(S s2, C0132s c0132s, Y y2) {
        k0 k0Var;
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
        this.f1623y.set(0, this.f1614p, true);
        C0132s c0132s2 = this.f1620v;
        int i8 = c0132s2.i ? c0132s.f2475e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0132s.f2475e == 1 ? c0132s.f2477g + c0132s.f2473b : c0132s.f2476f - c0132s.f2473b;
        int i9 = c0132s.f2475e;
        for (int i10 = 0; i10 < this.f1614p; i10++) {
            if (!this.f1615q[i10].f2416a.isEmpty()) {
                e1(this.f1615q[i10], i9, i8);
            }
        }
        int g2 = this.f1622x ? this.f1616r.g() : this.f1616r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0132s.f2474c;
            if (((i11 < 0 || i11 >= y2.b()) ? i6 : i7) == 0 || (!c0132s2.i && this.f1623y.isEmpty())) {
                break;
            }
            View view = s2.k(c0132s.f2474c, Long.MAX_VALUE).f2339a;
            c0132s.f2474c += c0132s.d;
            h0 h0Var = (h0) view.getLayoutParams();
            int c4 = h0Var.f2287a.c();
            j jVar = this.f1605B;
            int[] iArr = (int[]) jVar.f31b;
            int i12 = (iArr == null || c4 >= iArr.length) ? -1 : iArr[c4];
            if (i12 == -1) {
                if (V0(c0132s.f2475e)) {
                    i5 = this.f1614p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1614p;
                    i5 = i6;
                }
                k0 k0Var2 = null;
                if (c0132s.f2475e == i7) {
                    int k3 = this.f1616r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        k0 k0Var3 = this.f1615q[i5];
                        int f2 = k0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            k0Var2 = k0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1616r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        k0 k0Var4 = this.f1615q[i5];
                        int h2 = k0Var4.h(g3);
                        if (h2 > i14) {
                            k0Var2 = k0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                k0Var = k0Var2;
                jVar.u(c4);
                ((int[]) jVar.f31b)[c4] = k0Var.f2419e;
            } else {
                k0Var = this.f1615q[i12];
            }
            h0Var.f2385e = k0Var;
            if (c0132s.f2475e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1618t == 1) {
                i = 1;
                T0(view, L.w(r6, this.f1619u, this.f2283l, r6, ((ViewGroup.MarginLayoutParams) h0Var).width), L.w(true, this.f2286o, this.f2284m, D() + G(), ((ViewGroup.MarginLayoutParams) h0Var).height));
            } else {
                i = 1;
                T0(view, L.w(true, this.f2285n, this.f2283l, F() + E(), ((ViewGroup.MarginLayoutParams) h0Var).width), L.w(false, this.f1619u, this.f2284m, 0, ((ViewGroup.MarginLayoutParams) h0Var).height));
            }
            if (c0132s.f2475e == i) {
                c2 = k0Var.f(g2);
                h = this.f1616r.c(view) + c2;
            } else {
                h = k0Var.h(g2);
                c2 = h - this.f1616r.c(view);
            }
            if (c0132s.f2475e == 1) {
                k0 k0Var5 = h0Var.f2385e;
                k0Var5.getClass();
                h0 h0Var2 = (h0) view.getLayoutParams();
                h0Var2.f2385e = k0Var5;
                ArrayList arrayList = k0Var5.f2416a;
                arrayList.add(view);
                k0Var5.f2418c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    k0Var5.f2417b = Integer.MIN_VALUE;
                }
                if (h0Var2.f2287a.j() || h0Var2.f2287a.m()) {
                    k0Var5.d = k0Var5.f2420f.f1616r.c(view) + k0Var5.d;
                }
            } else {
                k0 k0Var6 = h0Var.f2385e;
                k0Var6.getClass();
                h0 h0Var3 = (h0) view.getLayoutParams();
                h0Var3.f2385e = k0Var6;
                ArrayList arrayList2 = k0Var6.f2416a;
                arrayList2.add(0, view);
                k0Var6.f2417b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    k0Var6.f2418c = Integer.MIN_VALUE;
                }
                if (h0Var3.f2287a.j() || h0Var3.f2287a.m()) {
                    k0Var6.d = k0Var6.f2420f.f1616r.c(view) + k0Var6.d;
                }
            }
            if (S0() && this.f1618t == 1) {
                c3 = this.f1617s.g() - (((this.f1614p - 1) - k0Var.f2419e) * this.f1619u);
                k2 = c3 - this.f1617s.c(view);
            } else {
                k2 = this.f1617s.k() + (k0Var.f2419e * this.f1619u);
                c3 = this.f1617s.c(view) + k2;
            }
            if (this.f1618t == 1) {
                L.N(view, k2, c2, c3, h);
            } else {
                L.N(view, c2, k2, h, c3);
            }
            e1(k0Var, c0132s2.f2475e, i8);
            X0(s2, c0132s2);
            if (c0132s2.h && view.hasFocusable()) {
                i2 = 0;
                this.f1623y.set(k0Var.f2419e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            X0(s2, c0132s2);
        }
        int k4 = c0132s2.f2475e == -1 ? this.f1616r.k() - P0(this.f1616r.k()) : O0(this.f1616r.g()) - this.f1616r.g();
        return k4 > 0 ? Math.min(c0132s.f2473b, k4) : i15;
    }

    public final View I0(boolean z2) {
        int k2 = this.f1616r.k();
        int g2 = this.f1616r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1616r.e(u2);
            int b2 = this.f1616r.b(u2);
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
        int k2 = this.f1616r.k();
        int g2 = this.f1616r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1616r.e(u2);
            if (this.f1616r.b(u2) > k2 && e2 < g2) {
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

    public final void K0(S s2, Y y2, boolean z2) {
        int g2;
        int O02 = O0(Integer.MIN_VALUE);
        if (O02 != Integer.MIN_VALUE && (g2 = this.f1616r.g() - O02) > 0) {
            int i = g2 - (-b1(-g2, s2, y2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1616r.p(i);
        }
    }

    @Override // g0.L
    public final boolean L() {
        return this.f1606C != 0;
    }

    public final void L0(S s2, Y y2, boolean z2) {
        int k2;
        int P02 = P0(Integer.MAX_VALUE);
        if (P02 != Integer.MAX_VALUE && (k2 = P02 - this.f1616r.k()) > 0) {
            int b1 = k2 - b1(k2, s2, y2);
            if (!z2 || b1 <= 0) {
                return;
            }
            this.f1616r.p(-b1);
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return L.H(u(0));
    }

    public final int N0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return L.H(u(v2 - 1));
    }

    @Override // g0.L
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1614p; i2++) {
            k0 k0Var = this.f1615q[i2];
            int i3 = k0Var.f2417b;
            if (i3 != Integer.MIN_VALUE) {
                k0Var.f2417b = i3 + i;
            }
            int i4 = k0Var.f2418c;
            if (i4 != Integer.MIN_VALUE) {
                k0Var.f2418c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int f2 = this.f1615q[0].f(i);
        for (int i2 = 1; i2 < this.f1614p; i2++) {
            int f3 = this.f1615q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // g0.L
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1614p; i2++) {
            k0 k0Var = this.f1615q[i2];
            int i3 = k0Var.f2417b;
            if (i3 != Integer.MIN_VALUE) {
                k0Var.f2417b = i3 + i;
            }
            int i4 = k0Var.f2418c;
            if (i4 != Integer.MIN_VALUE) {
                k0Var.f2418c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int h = this.f1615q[0].h(i);
        for (int i2 = 1; i2 < this.f1614p; i2++) {
            int h2 = this.f1615q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // g0.L
    public final void Q() {
        this.f1605B.b();
        for (int i = 0; i < this.f1614p; i++) {
            this.f1615q[i].b();
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
        j jVar;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int N02 = this.f1622x ? N0() : M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1605B;
                iArr = (int[]) jVar.f31b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f32c;
                    if (arrayList != null) {
                        i0 i0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                i0 i0Var2 = (i0) ((ArrayList) jVar.f32c).get(size);
                                if (i0Var2.f2391a == i5) {
                                    i0Var = i0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (i0Var != null) {
                            ((ArrayList) jVar.f32c).remove(i0Var);
                        }
                        int size2 = ((ArrayList) jVar.f32c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((i0) ((ArrayList) jVar.f32c).get(i7)).f2391a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            i0 i0Var3 = (i0) ((ArrayList) jVar.f32c).get(i7);
                            ((ArrayList) jVar.f32c).remove(i7);
                            i6 = i0Var3.f2391a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f31b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f31b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f31b, i5, Math.min(i6 + 1, ((int[]) jVar.f31b).length), -1);
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
                if (i4 > N02) {
                    return;
                }
                if (i5 <= (this.f1622x ? M0() : N0())) {
                    n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1605B;
        iArr = (int[]) jVar.f31b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f32c;
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
        BitSet bitSet = new BitSet(this.f1614p);
        bitSet.set(0, this.f1614p, true);
        char c2 = (this.f1618t == 1 && S0()) ? (char) 1 : (char) 65535;
        if (this.f1622x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            h0 h0Var = (h0) u2.getLayoutParams();
            if (bitSet.get(h0Var.f2385e.f2419e)) {
                k0 k0Var = h0Var.f2385e;
                if (this.f1622x) {
                    int i3 = k0Var.f2418c;
                    if (i3 == Integer.MIN_VALUE) {
                        k0Var.a();
                        i3 = k0Var.f2418c;
                    }
                    if (i3 < this.f1616r.g()) {
                        ArrayList arrayList = k0Var.f2416a;
                        ((h0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(h0Var.f2385e.f2419e);
                } else {
                    int i4 = k0Var.f2417b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) k0Var.f2416a.get(0);
                        h0 h0Var2 = (h0) view.getLayoutParams();
                        k0Var.f2417b = k0Var.f2420f.f1616r.e(view);
                        h0Var2.getClass();
                        i4 = k0Var.f2417b;
                    }
                    if (i4 > this.f1616r.k()) {
                        ((h0) ((View) k0Var.f2416a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(h0Var.f2385e.f2419e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1622x) {
                    int b2 = this.f1616r.b(u2);
                    int b3 = this.f1616r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((h0Var.f2385e.f2419e - ((h0) u3.getLayoutParams()).f2385e.f2419e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1616r.e(u2);
                    int e3 = this.f1616r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((h0Var.f2385e.f2419e - ((h0) u3.getLayoutParams()).f2385e.f2419e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // g0.L
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2276b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1613K);
        }
        for (int i = 0; i < this.f1614p; i++) {
            this.f1615q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f1618t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f1618t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (S0() == false) goto L46;
     */
    @Override // g0.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, S s2, Y y2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f2275a.f2357c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        a1();
        if (i == 1) {
            if (this.f1618t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1618t != 1) {
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
        h0 h0Var = (h0) D2.getLayoutParams();
        h0Var.getClass();
        k0 k0Var = h0Var.f2385e;
        int N02 = i2 == 1 ? N0() : M0();
        d1(N02, y2);
        c1(i2);
        C0132s c0132s = this.f1620v;
        c0132s.f2474c = c0132s.d + N02;
        c0132s.f2473b = (int) (this.f1616r.l() * 0.33333334f);
        c0132s.h = true;
        c0132s.f2472a = false;
        H0(s2, c0132s, y2);
        this.f1607D = this.f1622x;
        View g2 = k0Var.g(N02, i2);
        if (g2 != null && g2 != D2) {
            return g2;
        }
        if (V0(i2)) {
            for (int i3 = this.f1614p - 1; i3 >= 0; i3--) {
                View g3 = this.f1615q[i3].g(N02, i2);
                if (g3 != null && g3 != D2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1614p; i4++) {
                View g4 = this.f1615q[i4].g(N02, i2);
                if (g4 != null && g4 != D2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1621w ^ true) == (i2 == -1);
        View q2 = q(z2 ? k0Var.c() : k0Var.d());
        if (q2 != null && q2 != D2) {
            return q2;
        }
        if (V0(i2)) {
            for (int i5 = this.f1614p - 1; i5 >= 0; i5--) {
                if (i5 != k0Var.f2419e) {
                    View q3 = q(z2 ? this.f1615q[i5].c() : this.f1615q[i5].d());
                    if (q3 != null && q3 != D2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1614p; i6++) {
                View q4 = q(z2 ? this.f1615q[i6].c() : this.f1615q[i6].d());
                if (q4 != null && q4 != D2) {
                    return q4;
                }
            }
        }
        return null;
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2276b;
        Rect rect = this.f1609G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        h0 h0Var = (h0) view.getLayoutParams();
        int f12 = f1(i, ((ViewGroup.MarginLayoutParams) h0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) h0Var).rightMargin + rect.right);
        int f13 = f1(i2, ((ViewGroup.MarginLayoutParams) h0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) h0Var).bottomMargin + rect.bottom);
        if (w0(view, f12, f13, h0Var)) {
            view.measure(f12, f13);
        }
    }

    @Override // g0.L
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View J02 = J0(false);
            View I02 = I0(false);
            if (J02 == null || I02 == null) {
                return;
            }
            int H2 = L.H(J02);
            int H3 = L.H(I02);
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
    public final void U0(S s2, Y y2, boolean z2) {
        j0 j0Var;
        int i;
        int i2;
        j0 j0Var2 = this.F;
        g0 g0Var = this.f1610H;
        if (!(j0Var2 == null && this.f1624z == -1) && y2.b() == 0) {
            i0(s2);
            g0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (g0Var.f2378e && this.f1624z == -1 && this.F == null) ? false : true;
        j jVar = this.f1605B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = g0Var.f2380g;
        if (z4) {
            g0Var.a();
            j0 j0Var3 = this.F;
            if (j0Var3 != null) {
                int i3 = j0Var3.f2400c;
                if (i3 > 0) {
                    if (i3 == this.f1614p) {
                        for (int i4 = 0; i4 < this.f1614p; i4++) {
                            this.f1615q[i4].b();
                            j0 j0Var4 = this.F;
                            int i5 = j0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += j0Var4.i ? this.f1616r.g() : this.f1616r.k();
                            }
                            k0 k0Var = this.f1615q[i4];
                            k0Var.f2417b = i5;
                            k0Var.f2418c = i5;
                        }
                    } else {
                        j0Var3.d = null;
                        j0Var3.f2400c = 0;
                        j0Var3.f2401e = 0;
                        j0Var3.f2402f = null;
                        j0Var3.f2403g = null;
                        j0Var3.f2398a = j0Var3.f2399b;
                    }
                }
                j0 j0Var5 = this.F;
                this.f1608E = j0Var5.f2404j;
                boolean z5 = j0Var5.h;
                c(null);
                j0 j0Var6 = this.F;
                if (j0Var6 != null && j0Var6.h != z5) {
                    j0Var6.h = z5;
                }
                this.f1621w = z5;
                n0();
                a1();
                j0 j0Var7 = this.F;
                int i6 = j0Var7.f2398a;
                if (i6 != -1) {
                    this.f1624z = i6;
                    g0Var.f2377c = j0Var7.i;
                } else {
                    g0Var.f2377c = this.f1622x;
                }
                if (j0Var7.f2401e > 1) {
                    jVar.f31b = j0Var7.f2402f;
                    jVar.f32c = j0Var7.f2403g;
                }
            } else {
                a1();
                g0Var.f2377c = this.f1622x;
            }
            if (!y2.f2315g && (i2 = this.f1624z) != -1) {
                if (i2 < 0 || i2 >= y2.b()) {
                    this.f1624z = -1;
                    this.f1604A = Integer.MIN_VALUE;
                } else {
                    j0 j0Var8 = this.F;
                    if (j0Var8 == null || j0Var8.f2398a == -1 || j0Var8.f2400c < 1) {
                        View q2 = q(this.f1624z);
                        if (q2 != null) {
                            g0Var.f2375a = this.f1622x ? N0() : M0();
                            if (this.f1604A != Integer.MIN_VALUE) {
                                if (g0Var.f2377c) {
                                    g0Var.f2376b = (this.f1616r.g() - this.f1604A) - this.f1616r.b(q2);
                                } else {
                                    g0Var.f2376b = (this.f1616r.k() + this.f1604A) - this.f1616r.e(q2);
                                }
                            } else if (this.f1616r.c(q2) > this.f1616r.l()) {
                                g0Var.f2376b = g0Var.f2377c ? this.f1616r.g() : this.f1616r.k();
                            } else {
                                int e2 = this.f1616r.e(q2) - this.f1616r.k();
                                if (e2 < 0) {
                                    g0Var.f2376b = -e2;
                                } else {
                                    int g2 = this.f1616r.g() - this.f1616r.b(q2);
                                    if (g2 < 0) {
                                        g0Var.f2376b = g2;
                                    } else {
                                        g0Var.f2376b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1624z;
                            g0Var.f2375a = i7;
                            int i8 = this.f1604A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = C0(i7) == 1;
                                g0Var.f2377c = z6;
                                g0Var.f2376b = z6 ? staggeredGridLayoutManager.f1616r.g() : staggeredGridLayoutManager.f1616r.k();
                            } else if (g0Var.f2377c) {
                                g0Var.f2376b = staggeredGridLayoutManager.f1616r.g() - i8;
                            } else {
                                g0Var.f2376b = staggeredGridLayoutManager.f1616r.k() + i8;
                            }
                            g0Var.d = true;
                        }
                    } else {
                        g0Var.f2376b = Integer.MIN_VALUE;
                        g0Var.f2375a = this.f1624z;
                    }
                    g0Var.f2378e = true;
                }
            }
            if (this.f1607D) {
                int b2 = y2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = L.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                g0Var.f2375a = i;
                g0Var.f2376b = Integer.MIN_VALUE;
                g0Var.f2378e = true;
            } else {
                int b3 = y2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H2 = L.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                g0Var.f2375a = i;
                g0Var.f2376b = Integer.MIN_VALUE;
                g0Var.f2378e = true;
            }
        }
        if (this.F == null && this.f1624z == -1 && (g0Var.f2377c != this.f1607D || S0() != this.f1608E)) {
            jVar.b();
            g0Var.d = true;
        }
        if (v() > 0 && ((j0Var = this.F) == null || j0Var.f2400c < 1)) {
            if (g0Var.d) {
                for (int i10 = 0; i10 < this.f1614p; i10++) {
                    this.f1615q[i10].b();
                    int i11 = g0Var.f2376b;
                    if (i11 != Integer.MIN_VALUE) {
                        k0 k0Var2 = this.f1615q[i10];
                        k0Var2.f2417b = i11;
                        k0Var2.f2418c = i11;
                    }
                }
            } else if (z4 || g0Var.f2379f == null) {
                for (int i12 = 0; i12 < this.f1614p; i12++) {
                    k0 k0Var3 = this.f1615q[i12];
                    boolean z7 = this.f1622x;
                    int i13 = g0Var.f2376b;
                    int f2 = z7 ? k0Var3.f(Integer.MIN_VALUE) : k0Var3.h(Integer.MIN_VALUE);
                    k0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = k0Var3.f2420f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1616r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1616r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            k0Var3.f2418c = f2;
                            k0Var3.f2417b = f2;
                        }
                    }
                }
                k0[] k0VarArr = this.f1615q;
                int length = k0VarArr.length;
                int[] iArr = g0Var.f2379f;
                if (iArr == null || iArr.length < length) {
                    g0Var.f2379f = new int[staggeredGridLayoutManager.f1615q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    g0Var.f2379f[i14] = k0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1614p; i15++) {
                    k0 k0Var4 = this.f1615q[i15];
                    k0Var4.b();
                    int i16 = g0Var.f2379f[i15];
                    k0Var4.f2417b = i16;
                    k0Var4.f2418c = i16;
                }
            }
        }
        p(s2);
        C0132s c0132s = this.f1620v;
        c0132s.f2472a = false;
        int l2 = this.f1617s.l();
        this.f1619u = l2 / this.f1614p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1617s.i());
        d1(g0Var.f2375a, y2);
        if (g0Var.f2377c) {
            c1(-1);
            H0(s2, c0132s, y2);
            c1(1);
            c0132s.f2474c = g0Var.f2375a + c0132s.d;
            H0(s2, c0132s, y2);
        } else {
            c1(1);
            H0(s2, c0132s, y2);
            c1(-1);
            c0132s.f2474c = g0Var.f2375a + c0132s.d;
            H0(s2, c0132s, y2);
        }
        if (this.f1617s.i() != 1073741824) {
            int v4 = v();
            float f3 = RecyclerView.f1530C0;
            for (int i17 = 0; i17 < v4; i17++) {
                View u2 = u(i17);
                float c2 = this.f1617s.c(u2);
                if (c2 >= f3) {
                    ((h0) u2.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1619u;
            int round = Math.round(f3 * this.f1614p);
            if (this.f1617s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1617s.l());
            }
            this.f1619u = round / this.f1614p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1617s.i());
            if (this.f1619u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u3 = u(i19);
                    h0 h0Var = (h0) u3.getLayoutParams();
                    h0Var.getClass();
                    if (S0() && this.f1618t == 1) {
                        int i20 = -((this.f1614p - 1) - h0Var.f2385e.f2419e);
                        u3.offsetLeftAndRight((this.f1619u * i20) - (i20 * i18));
                    } else {
                        int i21 = h0Var.f2385e.f2419e;
                        int i22 = this.f1619u * i21;
                        int i23 = i21 * i18;
                        if (this.f1618t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1622x) {
                K0(s2, y2, true);
                L0(s2, y2, false);
            } else {
                L0(s2, y2, true);
                K0(s2, y2, false);
            }
        }
        if (z2 && !y2.f2315g && this.f1606C != 0 && v() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f2276b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1613K);
            }
        }
        z3 = false;
        if (y2.f2315g) {
            g0Var.a();
        }
        this.f1607D = g0Var.f2377c;
        this.f1608E = S0();
        if (z3) {
            g0Var.a();
            U0(s2, y2, false);
        }
    }

    public final boolean V0(int i) {
        if (this.f1618t == 0) {
            return (i == -1) != this.f1622x;
        }
        return ((i == -1) == this.f1622x) == S0();
    }

    public final void W0(int i, Y y2) {
        int M02;
        int i2;
        if (i > 0) {
            M02 = N0();
            i2 = 1;
        } else {
            M02 = M0();
            i2 = -1;
        }
        C0132s c0132s = this.f1620v;
        c0132s.f2472a = true;
        d1(M02, y2);
        c1(i2);
        c0132s.f2474c = M02 + c0132s.d;
        c0132s.f2473b = Math.abs(i);
    }

    public final void X0(S s2, C0132s c0132s) {
        if (!c0132s.f2472a || c0132s.i) {
            return;
        }
        if (c0132s.f2473b == 0) {
            if (c0132s.f2475e == -1) {
                Y0(s2, c0132s.f2477g);
                return;
            } else {
                Z0(s2, c0132s.f2476f);
                return;
            }
        }
        int i = 1;
        if (c0132s.f2475e == -1) {
            int i2 = c0132s.f2476f;
            int h = this.f1615q[0].h(i2);
            while (i < this.f1614p) {
                int h2 = this.f1615q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            Y0(s2, i3 < 0 ? c0132s.f2477g : c0132s.f2477g - Math.min(i3, c0132s.f2473b));
            return;
        }
        int i4 = c0132s.f2477g;
        int f2 = this.f1615q[0].f(i4);
        while (i < this.f1614p) {
            int f3 = this.f1615q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - c0132s.f2477g;
        Z0(s2, i5 < 0 ? c0132s.f2476f : Math.min(i5, c0132s.f2473b) + c0132s.f2476f);
    }

    @Override // g0.L
    public final void Y(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Y0(S s2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1616r.e(u2) < i || this.f1616r.o(u2) < i) {
                return;
            }
            h0 h0Var = (h0) u2.getLayoutParams();
            h0Var.getClass();
            if (h0Var.f2385e.f2416a.size() == 1) {
                return;
            }
            k0 k0Var = h0Var.f2385e;
            ArrayList arrayList = k0Var.f2416a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            h0 h0Var2 = (h0) view.getLayoutParams();
            h0Var2.f2385e = null;
            if (h0Var2.f2287a.j() || h0Var2.f2287a.m()) {
                k0Var.d -= k0Var.f2420f.f1616r.c(view);
            }
            if (size == 1) {
                k0Var.f2417b = Integer.MIN_VALUE;
            }
            k0Var.f2418c = Integer.MIN_VALUE;
            k0(u2, s2);
        }
    }

    @Override // g0.L
    public final void Z() {
        this.f1605B.b();
        n0();
    }

    public final void Z0(S s2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1616r.b(u2) > i || this.f1616r.n(u2) > i) {
                return;
            }
            h0 h0Var = (h0) u2.getLayoutParams();
            h0Var.getClass();
            if (h0Var.f2385e.f2416a.size() == 1) {
                return;
            }
            k0 k0Var = h0Var.f2385e;
            ArrayList arrayList = k0Var.f2416a;
            View view = (View) arrayList.remove(0);
            h0 h0Var2 = (h0) view.getLayoutParams();
            h0Var2.f2385e = null;
            if (arrayList.size() == 0) {
                k0Var.f2418c = Integer.MIN_VALUE;
            }
            if (h0Var2.f2287a.j() || h0Var2.f2287a.m()) {
                k0Var.d -= k0Var.f2420f.f1616r.c(view);
            }
            k0Var.f2417b = Integer.MIN_VALUE;
            k0(u2, s2);
        }
    }

    @Override // g0.X
    public final PointF a(int i) {
        int C02 = C0(i);
        PointF pointF = new PointF();
        if (C02 == 0) {
            return null;
        }
        if (this.f1618t == 0) {
            pointF.x = C02;
            pointF.y = RecyclerView.f1530C0;
        } else {
            pointF.x = RecyclerView.f1530C0;
            pointF.y = C02;
        }
        return pointF;
    }

    @Override // g0.L
    public final void a0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void a1() {
        if (this.f1618t == 1 || !S0()) {
            this.f1622x = this.f1621w;
        } else {
            this.f1622x = !this.f1621w;
        }
    }

    @Override // g0.L
    public final void b0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final int b1(int i, S s2, Y y2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, y2);
        C0132s c0132s = this.f1620v;
        int H02 = H0(s2, c0132s, y2);
        if (c0132s.f2473b >= H02) {
            i = i < 0 ? -H02 : H02;
        }
        this.f1616r.p(-i);
        this.f1607D = this.f1622x;
        c0132s.f2473b = 0;
        X0(s2, c0132s);
        return i;
    }

    @Override // g0.L
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // g0.L
    public final void c0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void c1(int i) {
        C0132s c0132s = this.f1620v;
        c0132s.f2475e = i;
        c0132s.d = this.f1622x != (i == -1) ? -1 : 1;
    }

    @Override // g0.L
    public final boolean d() {
        return this.f1618t == 0;
    }

    @Override // g0.L
    public final void d0(S s2, Y y2) {
        U0(s2, y2, true);
    }

    public final void d1(int i, Y y2) {
        int i2;
        int i3;
        int i4;
        C0132s c0132s = this.f1620v;
        boolean z2 = false;
        c0132s.f2473b = 0;
        c0132s.f2474c = i;
        C0137x c0137x = this.f2278e;
        if (!(c0137x != null && c0137x.f2500e) || (i4 = y2.f2310a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1622x == (i4 < i)) {
                i2 = this.f1616r.l();
                i3 = 0;
            } else {
                i3 = this.f1616r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2276b;
        if (recyclerView == null || !recyclerView.h) {
            c0132s.f2477g = this.f1616r.f() + i2;
            c0132s.f2476f = -i3;
        } else {
            c0132s.f2476f = this.f1616r.k() - i3;
            c0132s.f2477g = this.f1616r.g() + i2;
        }
        c0132s.h = false;
        c0132s.f2472a = true;
        if (this.f1616r.i() == 0 && this.f1616r.f() == 0) {
            z2 = true;
        }
        c0132s.i = z2;
    }

    @Override // g0.L
    public final boolean e() {
        return this.f1618t == 1;
    }

    @Override // g0.L
    public final void e0(Y y2) {
        this.f1624z = -1;
        this.f1604A = Integer.MIN_VALUE;
        this.F = null;
        this.f1610H.a();
    }

    public final void e1(k0 k0Var, int i, int i2) {
        int i3 = k0Var.d;
        int i4 = k0Var.f2419e;
        if (i != -1) {
            int i5 = k0Var.f2418c;
            if (i5 == Integer.MIN_VALUE) {
                k0Var.a();
                i5 = k0Var.f2418c;
            }
            if (i5 - i3 >= i2) {
                this.f1623y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = k0Var.f2417b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) k0Var.f2416a.get(0);
            h0 h0Var = (h0) view.getLayoutParams();
            k0Var.f2417b = k0Var.f2420f.f1616r.e(view);
            h0Var.getClass();
            i6 = k0Var.f2417b;
        }
        if (i6 + i3 <= i2) {
            this.f1623y.set(i4, false);
        }
    }

    @Override // g0.L
    public final boolean f(M m2) {
        return m2 instanceof h0;
    }

    @Override // g0.L
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof j0) {
            j0 j0Var = (j0) parcelable;
            this.F = j0Var;
            if (this.f1624z != -1) {
                j0Var.d = null;
                j0Var.f2400c = 0;
                j0Var.f2398a = -1;
                j0Var.f2399b = -1;
                j0Var.d = null;
                j0Var.f2400c = 0;
                j0Var.f2401e = 0;
                j0Var.f2402f = null;
                j0Var.f2403g = null;
            }
            n0();
        }
    }

    @Override // g0.L
    public final Parcelable g0() {
        int h;
        int k2;
        int[] iArr;
        j0 j0Var = this.F;
        if (j0Var != null) {
            j0 j0Var2 = new j0();
            j0Var2.f2400c = j0Var.f2400c;
            j0Var2.f2398a = j0Var.f2398a;
            j0Var2.f2399b = j0Var.f2399b;
            j0Var2.d = j0Var.d;
            j0Var2.f2401e = j0Var.f2401e;
            j0Var2.f2402f = j0Var.f2402f;
            j0Var2.h = j0Var.h;
            j0Var2.i = j0Var.i;
            j0Var2.f2404j = j0Var.f2404j;
            j0Var2.f2403g = j0Var.f2403g;
            return j0Var2;
        }
        j0 j0Var3 = new j0();
        j0Var3.h = this.f1621w;
        j0Var3.i = this.f1607D;
        j0Var3.f2404j = this.f1608E;
        j jVar = this.f1605B;
        if (jVar == null || (iArr = (int[]) jVar.f31b) == null) {
            j0Var3.f2401e = 0;
        } else {
            j0Var3.f2402f = iArr;
            j0Var3.f2401e = iArr.length;
            j0Var3.f2403g = (ArrayList) jVar.f32c;
        }
        if (v() > 0) {
            j0Var3.f2398a = this.f1607D ? N0() : M0();
            View I02 = this.f1622x ? I0(true) : J0(true);
            j0Var3.f2399b = I02 != null ? L.H(I02) : -1;
            int i = this.f1614p;
            j0Var3.f2400c = i;
            j0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1614p; i2++) {
                if (this.f1607D) {
                    h = this.f1615q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1616r.g();
                        h -= k2;
                        j0Var3.d[i2] = h;
                    } else {
                        j0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f1615q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1616r.k();
                        h -= k2;
                        j0Var3.d[i2] = h;
                    } else {
                        j0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            j0Var3.f2398a = -1;
            j0Var3.f2399b = -1;
            j0Var3.f2400c = 0;
        }
        return j0Var3;
    }

    @Override // g0.L
    public final void h(int i, int i2, Y y2, C0129o c0129o) {
        C0132s c0132s;
        int f2;
        int i3;
        if (this.f1618t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, y2);
        int[] iArr = this.f1612J;
        if (iArr == null || iArr.length < this.f1614p) {
            this.f1612J = new int[this.f1614p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1614p;
            c0132s = this.f1620v;
            if (i4 >= i6) {
                break;
            }
            if (c0132s.d == -1) {
                f2 = c0132s.f2476f;
                i3 = this.f1615q[i4].h(f2);
            } else {
                f2 = this.f1615q[i4].f(c0132s.f2477g);
                i3 = c0132s.f2477g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1612J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1612J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0132s.f2474c;
            if (i9 < 0 || i9 >= y2.b()) {
                return;
            }
            c0129o.a(c0132s.f2474c, this.f1612J[i8]);
            c0132s.f2474c += c0132s.d;
        }
    }

    @Override // g0.L
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // g0.L
    public final int j(Y y2) {
        return E0(y2);
    }

    @Override // g0.L
    public final int k(Y y2) {
        return F0(y2);
    }

    @Override // g0.L
    public final int l(Y y2) {
        return G0(y2);
    }

    @Override // g0.L
    public final int m(Y y2) {
        return E0(y2);
    }

    @Override // g0.L
    public final int n(Y y2) {
        return F0(y2);
    }

    @Override // g0.L
    public final int o(Y y2) {
        return G0(y2);
    }

    @Override // g0.L
    public final int o0(int i, S s2, Y y2) {
        return b1(i, s2, y2);
    }

    @Override // g0.L
    public final void p0(int i) {
        j0 j0Var = this.F;
        if (j0Var != null && j0Var.f2398a != i) {
            j0Var.d = null;
            j0Var.f2400c = 0;
            j0Var.f2398a = -1;
            j0Var.f2399b = -1;
        }
        this.f1624z = i;
        this.f1604A = Integer.MIN_VALUE;
        n0();
    }

    @Override // g0.L
    public final int q0(int i, S s2, Y y2) {
        return b1(i, s2, y2);
    }

    @Override // g0.L
    public final M r() {
        return this.f1618t == 0 ? new h0(-2, -1) : new h0(-1, -2);
    }

    @Override // g0.L
    public final M s(Context context, AttributeSet attributeSet) {
        return new h0(context, attributeSet);
    }

    @Override // g0.L
    public final M t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new h0((ViewGroup.MarginLayoutParams) layoutParams) : new h0(layoutParams);
    }

    @Override // g0.L
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1614p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1618t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2276b;
            WeakHashMap weakHashMap = T.f423a;
            g3 = L.g(i2, height, recyclerView.getMinimumHeight());
            g2 = L.g(i, (this.f1619u * i3) + F, this.f2276b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2276b;
            WeakHashMap weakHashMap2 = T.f423a;
            g2 = L.g(i, width, recyclerView2.getMinimumWidth());
            g3 = L.g(i2, (this.f1619u * i3) + D2, this.f2276b.getMinimumHeight());
        }
        this.f2276b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.L
    public final void z0(RecyclerView recyclerView, int i) {
        C0137x c0137x = new C0137x(recyclerView.getContext());
        c0137x.f2497a = i;
        A0(c0137x);
    }
}
