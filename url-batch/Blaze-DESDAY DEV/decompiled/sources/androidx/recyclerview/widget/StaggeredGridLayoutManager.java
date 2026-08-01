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
import g0.C0130n;
import g0.C0138w;
import g0.I;
import g0.J;
import g0.K;
import g0.P;
import g0.V;
import g0.W;
import g0.e0;
import g0.f0;
import g0.g0;
import g0.h0;
import g0.i0;
import g0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import z1.d;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends J implements V {

    /* renamed from: B, reason: collision with root package name */
    public final j f1634B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1635C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1636D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1637E;
    public h0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1638G;

    /* renamed from: H, reason: collision with root package name */
    public final e0 f1639H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1640I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1641J;

    /* renamed from: K, reason: collision with root package name */
    public final B f1642K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1643p;

    /* renamed from: q, reason: collision with root package name */
    public final i0[] f1644q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1645r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1646s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1647t;

    /* renamed from: u, reason: collision with root package name */
    public int f1648u;

    /* renamed from: v, reason: collision with root package name */
    public final r f1649v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1650w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1652y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1651x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1653z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1633A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1643p = -1;
        this.f1650w = false;
        j jVar = new j(13, false);
        this.f1634B = jVar;
        this.f1635C = 2;
        this.f1638G = new Rect();
        this.f1639H = new e0(this);
        this.f1640I = true;
        this.f1642K = new B(8, this);
        I I2 = J.I(context, attributeSet, i, i2);
        int i3 = I2.f2307a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1647t) {
            this.f1647t = i3;
            g gVar = this.f1645r;
            this.f1645r = this.f1646s;
            this.f1646s = gVar;
            n0();
        }
        int i4 = I2.f2308b;
        c(null);
        if (i4 != this.f1643p) {
            jVar.c();
            n0();
            this.f1643p = i4;
            this.f1652y = new BitSet(this.f1643p);
            this.f1644q = new i0[this.f1643p];
            for (int i5 = 0; i5 < this.f1643p; i5++) {
                this.f1644q[i5] = new i0(this, i5);
            }
            n0();
        }
        boolean z2 = I2.f2309c;
        c(null);
        h0 h0Var = this.F;
        if (h0Var != null && h0Var.h != z2) {
            h0Var.h = z2;
        }
        this.f1650w = z2;
        n0();
        r rVar = new r();
        rVar.f2502a = true;
        rVar.f2506f = 0;
        rVar.f2507g = 0;
        this.f1649v = rVar;
        this.f1645r = g.a(this, this.f1647t);
        this.f1646s = g.a(this, 1 - this.f1647t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // g0.J
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.f1651x ? 1 : -1;
        }
        return (i < M0()) != this.f1651x ? -1 : 1;
    }

    public final boolean D0() {
        int M02;
        if (v() != 0 && this.f1635C != 0 && this.f2315g) {
            if (this.f1651x) {
                M02 = N0();
                M0();
            } else {
                M02 = M0();
                N0();
            }
            j jVar = this.f1634B;
            if (M02 == 0 && R0() != null) {
                jVar.c();
                this.f2314f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(W w2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1645r;
        boolean z2 = !this.f1640I;
        return d.t(w2, gVar, J0(z2), I0(z2), this, this.f1640I);
    }

    public final int F0(W w2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1645r;
        boolean z2 = !this.f1640I;
        return d.u(w2, gVar, J0(z2), I0(z2), this, this.f1640I, this.f1651x);
    }

    public final int G0(W w2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1645r;
        boolean z2 = !this.f1640I;
        return d.v(w2, gVar, J0(z2), I0(z2), this, this.f1640I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(P p2, r rVar, W w2) {
        i0 i0Var;
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
        this.f1652y.set(0, this.f1643p, true);
        r rVar2 = this.f1649v;
        int i8 = rVar2.i ? rVar.f2505e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f2505e == 1 ? rVar.f2507g + rVar.f2503b : rVar.f2506f - rVar.f2503b;
        int i9 = rVar.f2505e;
        for (int i10 = 0; i10 < this.f1643p; i10++) {
            if (!this.f1644q[i10].f2435a.isEmpty()) {
                e1(this.f1644q[i10], i9, i8);
            }
        }
        int g2 = this.f1651x ? this.f1645r.g() : this.f1645r.k();
        boolean z2 = false;
        while (true) {
            int i11 = rVar.f2504c;
            if (((i11 < 0 || i11 >= w2.b()) ? i6 : i7) == 0 || (!rVar2.i && this.f1652y.isEmpty())) {
                break;
            }
            View view = p2.k(rVar.f2504c, Long.MAX_VALUE).f2366a;
            rVar.f2504c += rVar.d;
            f0 f0Var = (f0) view.getLayoutParams();
            int b2 = f0Var.f2322a.b();
            j jVar = this.f1634B;
            int[] iArr = (int[]) jVar.f45b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (V0(rVar.f2505e)) {
                    i5 = this.f1643p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1643p;
                    i5 = i6;
                }
                i0 i0Var2 = null;
                if (rVar.f2505e == i7) {
                    int k3 = this.f1645r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        i0 i0Var3 = this.f1644q[i5];
                        int f2 = i0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            i0Var2 = i0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1645r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        i0 i0Var4 = this.f1644q[i5];
                        int h2 = i0Var4.h(g3);
                        if (h2 > i14) {
                            i0Var2 = i0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                i0Var = i0Var2;
                jVar.u(b2);
                ((int[]) jVar.f45b)[b2] = i0Var.f2438e;
            } else {
                i0Var = this.f1644q[i12];
            }
            f0Var.f2411e = i0Var;
            if (rVar.f2505e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1647t == 1) {
                i = 1;
                T0(view, J.w(r6, this.f1648u, this.f2318l, r6, ((ViewGroup.MarginLayoutParams) f0Var).width), J.w(true, this.f2321o, this.f2319m, D() + G(), ((ViewGroup.MarginLayoutParams) f0Var).height));
            } else {
                i = 1;
                T0(view, J.w(true, this.f2320n, this.f2318l, F() + E(), ((ViewGroup.MarginLayoutParams) f0Var).width), J.w(false, this.f1648u, this.f2319m, 0, ((ViewGroup.MarginLayoutParams) f0Var).height));
            }
            if (rVar.f2505e == i) {
                c2 = i0Var.f(g2);
                h = this.f1645r.c(view) + c2;
            } else {
                h = i0Var.h(g2);
                c2 = h - this.f1645r.c(view);
            }
            if (rVar.f2505e == 1) {
                i0 i0Var5 = f0Var.f2411e;
                i0Var5.getClass();
                f0 f0Var2 = (f0) view.getLayoutParams();
                f0Var2.f2411e = i0Var5;
                ArrayList arrayList = i0Var5.f2435a;
                arrayList.add(view);
                i0Var5.f2437c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    i0Var5.f2436b = Integer.MIN_VALUE;
                }
                if (f0Var2.f2322a.i() || f0Var2.f2322a.l()) {
                    i0Var5.d = i0Var5.f2439f.f1645r.c(view) + i0Var5.d;
                }
            } else {
                i0 i0Var6 = f0Var.f2411e;
                i0Var6.getClass();
                f0 f0Var3 = (f0) view.getLayoutParams();
                f0Var3.f2411e = i0Var6;
                ArrayList arrayList2 = i0Var6.f2435a;
                arrayList2.add(0, view);
                i0Var6.f2436b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    i0Var6.f2437c = Integer.MIN_VALUE;
                }
                if (f0Var3.f2322a.i() || f0Var3.f2322a.l()) {
                    i0Var6.d = i0Var6.f2439f.f1645r.c(view) + i0Var6.d;
                }
            }
            if (S0() && this.f1647t == 1) {
                c3 = this.f1646s.g() - (((this.f1643p - 1) - i0Var.f2438e) * this.f1648u);
                k2 = c3 - this.f1646s.c(view);
            } else {
                k2 = this.f1646s.k() + (i0Var.f2438e * this.f1648u);
                c3 = this.f1646s.c(view) + k2;
            }
            if (this.f1647t == 1) {
                J.N(view, k2, c2, c3, h);
            } else {
                J.N(view, c2, k2, h, c3);
            }
            e1(i0Var, rVar2.f2505e, i8);
            X0(p2, rVar2);
            if (rVar2.h && view.hasFocusable()) {
                i2 = 0;
                this.f1652y.set(i0Var.f2438e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            X0(p2, rVar2);
        }
        int k4 = rVar2.f2505e == -1 ? this.f1645r.k() - P0(this.f1645r.k()) : O0(this.f1645r.g()) - this.f1645r.g();
        return k4 > 0 ? Math.min(rVar.f2503b, k4) : i15;
    }

    public final View I0(boolean z2) {
        int k2 = this.f1645r.k();
        int g2 = this.f1645r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1645r.e(u2);
            int b2 = this.f1645r.b(u2);
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
        int k2 = this.f1645r.k();
        int g2 = this.f1645r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1645r.e(u2);
            if (this.f1645r.b(u2) > k2 && e2 < g2) {
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

    public final void K0(P p2, W w2, boolean z2) {
        int g2;
        int O02 = O0(Integer.MIN_VALUE);
        if (O02 != Integer.MIN_VALUE && (g2 = this.f1645r.g() - O02) > 0) {
            int i = g2 - (-b1(-g2, p2, w2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1645r.p(i);
        }
    }

    @Override // g0.J
    public final boolean L() {
        return this.f1635C != 0;
    }

    public final void L0(P p2, W w2, boolean z2) {
        int k2;
        int P02 = P0(Integer.MAX_VALUE);
        if (P02 != Integer.MAX_VALUE && (k2 = P02 - this.f1645r.k()) > 0) {
            int b12 = k2 - b1(k2, p2, w2);
            if (!z2 || b12 <= 0) {
                return;
            }
            this.f1645r.p(-b12);
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return J.H(u(0));
    }

    public final int N0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return J.H(u(v2 - 1));
    }

    @Override // g0.J
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1643p; i2++) {
            i0 i0Var = this.f1644q[i2];
            int i3 = i0Var.f2436b;
            if (i3 != Integer.MIN_VALUE) {
                i0Var.f2436b = i3 + i;
            }
            int i4 = i0Var.f2437c;
            if (i4 != Integer.MIN_VALUE) {
                i0Var.f2437c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int f2 = this.f1644q[0].f(i);
        for (int i2 = 1; i2 < this.f1643p; i2++) {
            int f3 = this.f1644q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // g0.J
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1643p; i2++) {
            i0 i0Var = this.f1644q[i2];
            int i3 = i0Var.f2436b;
            if (i3 != Integer.MIN_VALUE) {
                i0Var.f2436b = i3 + i;
            }
            int i4 = i0Var.f2437c;
            if (i4 != Integer.MIN_VALUE) {
                i0Var.f2437c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int h = this.f1644q[0].h(i);
        for (int i2 = 1; i2 < this.f1643p; i2++) {
            int h2 = this.f1644q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // g0.J
    public final void Q() {
        this.f1634B.c();
        for (int i = 0; i < this.f1643p; i++) {
            this.f1644q[i].b();
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
        int N02 = this.f1651x ? N0() : M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1634B;
                iArr = (int[]) jVar.f45b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f46c;
                    if (arrayList != null) {
                        g0 g0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                g0 g0Var2 = (g0) ((ArrayList) jVar.f46c).get(size);
                                if (g0Var2.f2416a == i5) {
                                    g0Var = g0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (g0Var != null) {
                            ((ArrayList) jVar.f46c).remove(g0Var);
                        }
                        int size2 = ((ArrayList) jVar.f46c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((g0) ((ArrayList) jVar.f46c).get(i7)).f2416a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            g0 g0Var3 = (g0) ((ArrayList) jVar.f46c).get(i7);
                            ((ArrayList) jVar.f46c).remove(i7);
                            i6 = g0Var3.f2416a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f45b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f45b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f45b, i5, Math.min(i6 + 1, ((int[]) jVar.f45b).length), -1);
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
                if (i5 <= (this.f1651x ? M0() : N0())) {
                    n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1634B;
        iArr = (int[]) jVar.f45b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f46c;
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
        BitSet bitSet = new BitSet(this.f1643p);
        bitSet.set(0, this.f1643p, true);
        char c2 = (this.f1647t == 1 && S0()) ? (char) 1 : (char) 65535;
        if (this.f1651x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            f0 f0Var = (f0) u2.getLayoutParams();
            if (bitSet.get(f0Var.f2411e.f2438e)) {
                i0 i0Var = f0Var.f2411e;
                if (this.f1651x) {
                    int i3 = i0Var.f2437c;
                    if (i3 == Integer.MIN_VALUE) {
                        i0Var.a();
                        i3 = i0Var.f2437c;
                    }
                    if (i3 < this.f1645r.g()) {
                        ArrayList arrayList = i0Var.f2435a;
                        ((f0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(f0Var.f2411e.f2438e);
                } else {
                    int i4 = i0Var.f2436b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) i0Var.f2435a.get(0);
                        f0 f0Var2 = (f0) view.getLayoutParams();
                        i0Var.f2436b = i0Var.f2439f.f1645r.e(view);
                        f0Var2.getClass();
                        i4 = i0Var.f2436b;
                    }
                    if (i4 > this.f1645r.k()) {
                        ((f0) ((View) i0Var.f2435a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(f0Var.f2411e.f2438e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1651x) {
                    int b2 = this.f1645r.b(u2);
                    int b3 = this.f1645r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((f0Var.f2411e.f2438e - ((f0) u3.getLayoutParams()).f2411e.f2438e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1645r.e(u2);
                    int e3 = this.f1645r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((f0Var.f2411e.f2438e - ((f0) u3.getLayoutParams()).f2411e.f2438e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // g0.J
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2311b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1642K);
        }
        for (int i = 0; i < this.f1643p; i++) {
            this.f1644q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f1647t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f1647t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (S0() == false) goto L46;
     */
    @Override // g0.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, P p2, W w2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f2310a.f2388c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        a1();
        if (i == 1) {
            if (this.f1647t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1647t != 1) {
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
        f0 f0Var = (f0) D2.getLayoutParams();
        f0Var.getClass();
        i0 i0Var = f0Var.f2411e;
        int N02 = i2 == 1 ? N0() : M0();
        d1(N02, w2);
        c1(i2);
        r rVar = this.f1649v;
        rVar.f2504c = rVar.d + N02;
        rVar.f2503b = (int) (this.f1645r.l() * 0.33333334f);
        rVar.h = true;
        rVar.f2502a = false;
        H0(p2, rVar, w2);
        this.f1636D = this.f1651x;
        View g2 = i0Var.g(N02, i2);
        if (g2 != null && g2 != D2) {
            return g2;
        }
        if (V0(i2)) {
            for (int i3 = this.f1643p - 1; i3 >= 0; i3--) {
                View g3 = this.f1644q[i3].g(N02, i2);
                if (g3 != null && g3 != D2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1643p; i4++) {
                View g4 = this.f1644q[i4].g(N02, i2);
                if (g4 != null && g4 != D2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1650w ^ true) == (i2 == -1);
        View q2 = q(z2 ? i0Var.c() : i0Var.d());
        if (q2 != null && q2 != D2) {
            return q2;
        }
        if (V0(i2)) {
            for (int i5 = this.f1643p - 1; i5 >= 0; i5--) {
                if (i5 != i0Var.f2438e) {
                    View q3 = q(z2 ? this.f1644q[i5].c() : this.f1644q[i5].d());
                    if (q3 != null && q3 != D2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1643p; i6++) {
                View q4 = q(z2 ? this.f1644q[i6].c() : this.f1644q[i6].d());
                if (q4 != null && q4 != D2) {
                    return q4;
                }
            }
        }
        return null;
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2311b;
        Rect rect = this.f1638G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        f0 f0Var = (f0) view.getLayoutParams();
        int f12 = f1(i, ((ViewGroup.MarginLayoutParams) f0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) f0Var).rightMargin + rect.right);
        int f13 = f1(i2, ((ViewGroup.MarginLayoutParams) f0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) f0Var).bottomMargin + rect.bottom);
        if (w0(view, f12, f13, f0Var)) {
            view.measure(f12, f13);
        }
    }

    @Override // g0.J
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View J02 = J0(false);
            View I02 = I0(false);
            if (J02 == null || I02 == null) {
                return;
            }
            int H2 = J.H(J02);
            int H3 = J.H(I02);
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
    public final void U0(P p2, W w2, boolean z2) {
        h0 h0Var;
        int i;
        int i2;
        h0 h0Var2 = this.F;
        e0 e0Var = this.f1639H;
        if (!(h0Var2 == null && this.f1653z == -1) && w2.b() == 0) {
            i0(p2);
            e0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (e0Var.f2403e && this.f1653z == -1 && this.F == null) ? false : true;
        j jVar = this.f1634B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = e0Var.f2405g;
        if (z4) {
            e0Var.a();
            h0 h0Var3 = this.F;
            if (h0Var3 != null) {
                int i3 = h0Var3.f2426c;
                if (i3 > 0) {
                    if (i3 == this.f1643p) {
                        for (int i4 = 0; i4 < this.f1643p; i4++) {
                            this.f1644q[i4].b();
                            h0 h0Var4 = this.F;
                            int i5 = h0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += h0Var4.i ? this.f1645r.g() : this.f1645r.k();
                            }
                            i0 i0Var = this.f1644q[i4];
                            i0Var.f2436b = i5;
                            i0Var.f2437c = i5;
                        }
                    } else {
                        h0Var3.d = null;
                        h0Var3.f2426c = 0;
                        h0Var3.f2427e = 0;
                        h0Var3.f2428f = null;
                        h0Var3.f2429g = null;
                        h0Var3.f2424a = h0Var3.f2425b;
                    }
                }
                h0 h0Var5 = this.F;
                this.f1637E = h0Var5.f2430j;
                boolean z5 = h0Var5.h;
                c(null);
                h0 h0Var6 = this.F;
                if (h0Var6 != null && h0Var6.h != z5) {
                    h0Var6.h = z5;
                }
                this.f1650w = z5;
                n0();
                a1();
                h0 h0Var7 = this.F;
                int i6 = h0Var7.f2424a;
                if (i6 != -1) {
                    this.f1653z = i6;
                    e0Var.f2402c = h0Var7.i;
                } else {
                    e0Var.f2402c = this.f1651x;
                }
                if (h0Var7.f2427e > 1) {
                    jVar.f45b = h0Var7.f2428f;
                    jVar.f46c = h0Var7.f2429g;
                }
            } else {
                a1();
                e0Var.f2402c = this.f1651x;
            }
            if (!w2.f2350g && (i2 = this.f1653z) != -1) {
                if (i2 < 0 || i2 >= w2.b()) {
                    this.f1653z = -1;
                    this.f1633A = Integer.MIN_VALUE;
                } else {
                    h0 h0Var8 = this.F;
                    if (h0Var8 == null || h0Var8.f2424a == -1 || h0Var8.f2426c < 1) {
                        View q2 = q(this.f1653z);
                        if (q2 != null) {
                            e0Var.f2400a = this.f1651x ? N0() : M0();
                            if (this.f1633A != Integer.MIN_VALUE) {
                                if (e0Var.f2402c) {
                                    e0Var.f2401b = (this.f1645r.g() - this.f1633A) - this.f1645r.b(q2);
                                } else {
                                    e0Var.f2401b = (this.f1645r.k() + this.f1633A) - this.f1645r.e(q2);
                                }
                            } else if (this.f1645r.c(q2) > this.f1645r.l()) {
                                e0Var.f2401b = e0Var.f2402c ? this.f1645r.g() : this.f1645r.k();
                            } else {
                                int e2 = this.f1645r.e(q2) - this.f1645r.k();
                                if (e2 < 0) {
                                    e0Var.f2401b = -e2;
                                } else {
                                    int g2 = this.f1645r.g() - this.f1645r.b(q2);
                                    if (g2 < 0) {
                                        e0Var.f2401b = g2;
                                    } else {
                                        e0Var.f2401b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1653z;
                            e0Var.f2400a = i7;
                            int i8 = this.f1633A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = C0(i7) == 1;
                                e0Var.f2402c = z6;
                                e0Var.f2401b = z6 ? staggeredGridLayoutManager.f1645r.g() : staggeredGridLayoutManager.f1645r.k();
                            } else if (e0Var.f2402c) {
                                e0Var.f2401b = staggeredGridLayoutManager.f1645r.g() - i8;
                            } else {
                                e0Var.f2401b = staggeredGridLayoutManager.f1645r.k() + i8;
                            }
                            e0Var.d = true;
                        }
                    } else {
                        e0Var.f2401b = Integer.MIN_VALUE;
                        e0Var.f2400a = this.f1653z;
                    }
                    e0Var.f2403e = true;
                }
            }
            if (this.f1636D) {
                int b2 = w2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = J.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                e0Var.f2400a = i;
                e0Var.f2401b = Integer.MIN_VALUE;
                e0Var.f2403e = true;
            } else {
                int b3 = w2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H2 = J.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                e0Var.f2400a = i;
                e0Var.f2401b = Integer.MIN_VALUE;
                e0Var.f2403e = true;
            }
        }
        if (this.F == null && this.f1653z == -1 && (e0Var.f2402c != this.f1636D || S0() != this.f1637E)) {
            jVar.c();
            e0Var.d = true;
        }
        if (v() > 0 && ((h0Var = this.F) == null || h0Var.f2426c < 1)) {
            if (e0Var.d) {
                for (int i10 = 0; i10 < this.f1643p; i10++) {
                    this.f1644q[i10].b();
                    int i11 = e0Var.f2401b;
                    if (i11 != Integer.MIN_VALUE) {
                        i0 i0Var2 = this.f1644q[i10];
                        i0Var2.f2436b = i11;
                        i0Var2.f2437c = i11;
                    }
                }
            } else if (z4 || e0Var.f2404f == null) {
                for (int i12 = 0; i12 < this.f1643p; i12++) {
                    i0 i0Var3 = this.f1644q[i12];
                    boolean z7 = this.f1651x;
                    int i13 = e0Var.f2401b;
                    int f2 = z7 ? i0Var3.f(Integer.MIN_VALUE) : i0Var3.h(Integer.MIN_VALUE);
                    i0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = i0Var3.f2439f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1645r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1645r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            i0Var3.f2437c = f2;
                            i0Var3.f2436b = f2;
                        }
                    }
                }
                i0[] i0VarArr = this.f1644q;
                int length = i0VarArr.length;
                int[] iArr = e0Var.f2404f;
                if (iArr == null || iArr.length < length) {
                    e0Var.f2404f = new int[staggeredGridLayoutManager.f1644q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    e0Var.f2404f[i14] = i0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1643p; i15++) {
                    i0 i0Var4 = this.f1644q[i15];
                    i0Var4.b();
                    int i16 = e0Var.f2404f[i15];
                    i0Var4.f2436b = i16;
                    i0Var4.f2437c = i16;
                }
            }
        }
        p(p2);
        r rVar = this.f1649v;
        rVar.f2502a = false;
        int l2 = this.f1646s.l();
        this.f1648u = l2 / this.f1643p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1646s.i());
        d1(e0Var.f2400a, w2);
        if (e0Var.f2402c) {
            c1(-1);
            H0(p2, rVar, w2);
            c1(1);
            rVar.f2504c = e0Var.f2400a + rVar.d;
            H0(p2, rVar, w2);
        } else {
            c1(1);
            H0(p2, rVar, w2);
            c1(-1);
            rVar.f2504c = e0Var.f2400a + rVar.d;
            H0(p2, rVar, w2);
        }
        if (this.f1646s.i() != 1073741824) {
            int v4 = v();
            float f3 = RecyclerView.f1559A0;
            for (int i17 = 0; i17 < v4; i17++) {
                View u2 = u(i17);
                float c2 = this.f1646s.c(u2);
                if (c2 >= f3) {
                    ((f0) u2.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1648u;
            int round = Math.round(f3 * this.f1643p);
            if (this.f1646s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1646s.l());
            }
            this.f1648u = round / this.f1643p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1646s.i());
            if (this.f1648u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u3 = u(i19);
                    f0 f0Var = (f0) u3.getLayoutParams();
                    f0Var.getClass();
                    if (S0() && this.f1647t == 1) {
                        int i20 = -((this.f1643p - 1) - f0Var.f2411e.f2438e);
                        u3.offsetLeftAndRight((this.f1648u * i20) - (i20 * i18));
                    } else {
                        int i21 = f0Var.f2411e.f2438e;
                        int i22 = this.f1648u * i21;
                        int i23 = i21 * i18;
                        if (this.f1647t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1651x) {
                K0(p2, w2, true);
                L0(p2, w2, false);
            } else {
                L0(p2, w2, true);
                K0(p2, w2, false);
            }
        }
        if (z2 && !w2.f2350g && this.f1635C != 0 && v() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f2311b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1642K);
            }
        }
        z3 = false;
        if (w2.f2350g) {
            e0Var.a();
        }
        this.f1636D = e0Var.f2402c;
        this.f1637E = S0();
        if (z3) {
            e0Var.a();
            U0(p2, w2, false);
        }
    }

    public final boolean V0(int i) {
        if (this.f1647t == 0) {
            return (i == -1) != this.f1651x;
        }
        return ((i == -1) == this.f1651x) == S0();
    }

    public final void W0(int i, W w2) {
        int M02;
        int i2;
        if (i > 0) {
            M02 = N0();
            i2 = 1;
        } else {
            M02 = M0();
            i2 = -1;
        }
        r rVar = this.f1649v;
        rVar.f2502a = true;
        d1(M02, w2);
        c1(i2);
        rVar.f2504c = M02 + rVar.d;
        rVar.f2503b = Math.abs(i);
    }

    public final void X0(P p2, r rVar) {
        if (!rVar.f2502a || rVar.i) {
            return;
        }
        if (rVar.f2503b == 0) {
            if (rVar.f2505e == -1) {
                Y0(p2, rVar.f2507g);
                return;
            } else {
                Z0(p2, rVar.f2506f);
                return;
            }
        }
        int i = 1;
        if (rVar.f2505e == -1) {
            int i2 = rVar.f2506f;
            int h = this.f1644q[0].h(i2);
            while (i < this.f1643p) {
                int h2 = this.f1644q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            Y0(p2, i3 < 0 ? rVar.f2507g : rVar.f2507g - Math.min(i3, rVar.f2503b));
            return;
        }
        int i4 = rVar.f2507g;
        int f2 = this.f1644q[0].f(i4);
        while (i < this.f1643p) {
            int f3 = this.f1644q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - rVar.f2507g;
        Z0(p2, i5 < 0 ? rVar.f2506f : Math.min(i5, rVar.f2503b) + rVar.f2506f);
    }

    @Override // g0.J
    public final void Y(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Y0(P p2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1645r.e(u2) < i || this.f1645r.o(u2) < i) {
                return;
            }
            f0 f0Var = (f0) u2.getLayoutParams();
            f0Var.getClass();
            if (f0Var.f2411e.f2435a.size() == 1) {
                return;
            }
            i0 i0Var = f0Var.f2411e;
            ArrayList arrayList = i0Var.f2435a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            f0 f0Var2 = (f0) view.getLayoutParams();
            f0Var2.f2411e = null;
            if (f0Var2.f2322a.i() || f0Var2.f2322a.l()) {
                i0Var.d -= i0Var.f2439f.f1645r.c(view);
            }
            if (size == 1) {
                i0Var.f2436b = Integer.MIN_VALUE;
            }
            i0Var.f2437c = Integer.MIN_VALUE;
            k0(u2, p2);
        }
    }

    @Override // g0.J
    public final void Z() {
        this.f1634B.c();
        n0();
    }

    public final void Z0(P p2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1645r.b(u2) > i || this.f1645r.n(u2) > i) {
                return;
            }
            f0 f0Var = (f0) u2.getLayoutParams();
            f0Var.getClass();
            if (f0Var.f2411e.f2435a.size() == 1) {
                return;
            }
            i0 i0Var = f0Var.f2411e;
            ArrayList arrayList = i0Var.f2435a;
            View view = (View) arrayList.remove(0);
            f0 f0Var2 = (f0) view.getLayoutParams();
            f0Var2.f2411e = null;
            if (arrayList.size() == 0) {
                i0Var.f2437c = Integer.MIN_VALUE;
            }
            if (f0Var2.f2322a.i() || f0Var2.f2322a.l()) {
                i0Var.d -= i0Var.f2439f.f1645r.c(view);
            }
            i0Var.f2436b = Integer.MIN_VALUE;
            k0(u2, p2);
        }
    }

    @Override // g0.V
    public final PointF a(int i) {
        int C02 = C0(i);
        PointF pointF = new PointF();
        if (C02 == 0) {
            return null;
        }
        if (this.f1647t == 0) {
            pointF.x = C02;
            pointF.y = RecyclerView.f1559A0;
        } else {
            pointF.x = RecyclerView.f1559A0;
            pointF.y = C02;
        }
        return pointF;
    }

    @Override // g0.J
    public final void a0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void a1() {
        if (this.f1647t == 1 || !S0()) {
            this.f1651x = this.f1650w;
        } else {
            this.f1651x = !this.f1650w;
        }
    }

    @Override // g0.J
    public final void b0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final int b1(int i, P p2, W w2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, w2);
        r rVar = this.f1649v;
        int H02 = H0(p2, rVar, w2);
        if (rVar.f2503b >= H02) {
            i = i < 0 ? -H02 : H02;
        }
        this.f1645r.p(-i);
        this.f1636D = this.f1651x;
        rVar.f2503b = 0;
        X0(p2, rVar);
        return i;
    }

    @Override // g0.J
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // g0.J
    public final void c0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void c1(int i) {
        r rVar = this.f1649v;
        rVar.f2505e = i;
        rVar.d = this.f1651x != (i == -1) ? -1 : 1;
    }

    @Override // g0.J
    public final boolean d() {
        return this.f1647t == 0;
    }

    @Override // g0.J
    public final void d0(P p2, W w2) {
        U0(p2, w2, true);
    }

    public final void d1(int i, W w2) {
        int i2;
        int i3;
        int i4;
        r rVar = this.f1649v;
        boolean z2 = false;
        rVar.f2503b = 0;
        rVar.f2504c = i;
        C0138w c0138w = this.f2313e;
        if (!(c0138w != null && c0138w.f2530e) || (i4 = w2.f2345a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1651x == (i4 < i)) {
                i2 = this.f1645r.l();
                i3 = 0;
            } else {
                i3 = this.f1645r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2311b;
        if (recyclerView == null || !recyclerView.h) {
            rVar.f2507g = this.f1645r.f() + i2;
            rVar.f2506f = -i3;
        } else {
            rVar.f2506f = this.f1645r.k() - i3;
            rVar.f2507g = this.f1645r.g() + i2;
        }
        rVar.h = false;
        rVar.f2502a = true;
        if (this.f1645r.i() == 0 && this.f1645r.f() == 0) {
            z2 = true;
        }
        rVar.i = z2;
    }

    @Override // g0.J
    public final boolean e() {
        return this.f1647t == 1;
    }

    @Override // g0.J
    public final void e0(W w2) {
        this.f1653z = -1;
        this.f1633A = Integer.MIN_VALUE;
        this.F = null;
        this.f1639H.a();
    }

    public final void e1(i0 i0Var, int i, int i2) {
        int i3 = i0Var.d;
        int i4 = i0Var.f2438e;
        if (i != -1) {
            int i5 = i0Var.f2437c;
            if (i5 == Integer.MIN_VALUE) {
                i0Var.a();
                i5 = i0Var.f2437c;
            }
            if (i5 - i3 >= i2) {
                this.f1652y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = i0Var.f2436b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) i0Var.f2435a.get(0);
            f0 f0Var = (f0) view.getLayoutParams();
            i0Var.f2436b = i0Var.f2439f.f1645r.e(view);
            f0Var.getClass();
            i6 = i0Var.f2436b;
        }
        if (i6 + i3 <= i2) {
            this.f1652y.set(i4, false);
        }
    }

    @Override // g0.J
    public final boolean f(K k2) {
        return k2 instanceof f0;
    }

    @Override // g0.J
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof h0) {
            h0 h0Var = (h0) parcelable;
            this.F = h0Var;
            if (this.f1653z != -1) {
                h0Var.d = null;
                h0Var.f2426c = 0;
                h0Var.f2424a = -1;
                h0Var.f2425b = -1;
                h0Var.d = null;
                h0Var.f2426c = 0;
                h0Var.f2427e = 0;
                h0Var.f2428f = null;
                h0Var.f2429g = null;
            }
            n0();
        }
    }

    @Override // g0.J
    public final Parcelable g0() {
        int h;
        int k2;
        int[] iArr;
        h0 h0Var = this.F;
        if (h0Var != null) {
            h0 h0Var2 = new h0();
            h0Var2.f2426c = h0Var.f2426c;
            h0Var2.f2424a = h0Var.f2424a;
            h0Var2.f2425b = h0Var.f2425b;
            h0Var2.d = h0Var.d;
            h0Var2.f2427e = h0Var.f2427e;
            h0Var2.f2428f = h0Var.f2428f;
            h0Var2.h = h0Var.h;
            h0Var2.i = h0Var.i;
            h0Var2.f2430j = h0Var.f2430j;
            h0Var2.f2429g = h0Var.f2429g;
            return h0Var2;
        }
        h0 h0Var3 = new h0();
        h0Var3.h = this.f1650w;
        h0Var3.i = this.f1636D;
        h0Var3.f2430j = this.f1637E;
        j jVar = this.f1634B;
        if (jVar == null || (iArr = (int[]) jVar.f45b) == null) {
            h0Var3.f2427e = 0;
        } else {
            h0Var3.f2428f = iArr;
            h0Var3.f2427e = iArr.length;
            h0Var3.f2429g = (ArrayList) jVar.f46c;
        }
        if (v() > 0) {
            h0Var3.f2424a = this.f1636D ? N0() : M0();
            View I02 = this.f1651x ? I0(true) : J0(true);
            h0Var3.f2425b = I02 != null ? J.H(I02) : -1;
            int i = this.f1643p;
            h0Var3.f2426c = i;
            h0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1643p; i2++) {
                if (this.f1636D) {
                    h = this.f1644q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1645r.g();
                        h -= k2;
                        h0Var3.d[i2] = h;
                    } else {
                        h0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f1644q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1645r.k();
                        h -= k2;
                        h0Var3.d[i2] = h;
                    } else {
                        h0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            h0Var3.f2424a = -1;
            h0Var3.f2425b = -1;
            h0Var3.f2426c = 0;
        }
        return h0Var3;
    }

    @Override // g0.J
    public final void h(int i, int i2, W w2, C0130n c0130n) {
        r rVar;
        int f2;
        int i3;
        if (this.f1647t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, w2);
        int[] iArr = this.f1641J;
        if (iArr == null || iArr.length < this.f1643p) {
            this.f1641J = new int[this.f1643p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1643p;
            rVar = this.f1649v;
            if (i4 >= i6) {
                break;
            }
            if (rVar.d == -1) {
                f2 = rVar.f2506f;
                i3 = this.f1644q[i4].h(f2);
            } else {
                f2 = this.f1644q[i4].f(rVar.f2507g);
                i3 = rVar.f2507g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1641J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1641J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = rVar.f2504c;
            if (i9 < 0 || i9 >= w2.b()) {
                return;
            }
            c0130n.a(rVar.f2504c, this.f1641J[i8]);
            rVar.f2504c += rVar.d;
        }
    }

    @Override // g0.J
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // g0.J
    public final int j(W w2) {
        return E0(w2);
    }

    @Override // g0.J
    public final int k(W w2) {
        return F0(w2);
    }

    @Override // g0.J
    public final int l(W w2) {
        return G0(w2);
    }

    @Override // g0.J
    public final int m(W w2) {
        return E0(w2);
    }

    @Override // g0.J
    public final int n(W w2) {
        return F0(w2);
    }

    @Override // g0.J
    public final int o(W w2) {
        return G0(w2);
    }

    @Override // g0.J
    public final int o0(int i, P p2, W w2) {
        return b1(i, p2, w2);
    }

    @Override // g0.J
    public final void p0(int i) {
        h0 h0Var = this.F;
        if (h0Var != null && h0Var.f2424a != i) {
            h0Var.d = null;
            h0Var.f2426c = 0;
            h0Var.f2424a = -1;
            h0Var.f2425b = -1;
        }
        this.f1653z = i;
        this.f1633A = Integer.MIN_VALUE;
        n0();
    }

    @Override // g0.J
    public final int q0(int i, P p2, W w2) {
        return b1(i, p2, w2);
    }

    @Override // g0.J
    public final K r() {
        return this.f1647t == 0 ? new f0(-2, -1) : new f0(-1, -2);
    }

    @Override // g0.J
    public final K s(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    @Override // g0.J
    public final K t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f0((ViewGroup.MarginLayoutParams) layoutParams) : new f0(layoutParams);
    }

    @Override // g0.J
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1643p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1647t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2311b;
            WeakHashMap weakHashMap = T.f440a;
            g3 = J.g(i2, height, recyclerView.getMinimumHeight());
            g2 = J.g(i, (this.f1648u * i3) + F, this.f2311b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2311b;
            WeakHashMap weakHashMap2 = T.f440a;
            g2 = J.g(i, width, recyclerView2.getMinimumWidth());
            g3 = J.g(i2, (this.f1648u * i3) + D2, this.f2311b.getMinimumHeight());
        }
        this.f2311b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.J
    public final void z0(RecyclerView recyclerView, int i) {
        C0138w c0138w = new C0138w(recyclerView.getContext());
        c0138w.f2527a = i;
        A0(c0138w);
    }
}
