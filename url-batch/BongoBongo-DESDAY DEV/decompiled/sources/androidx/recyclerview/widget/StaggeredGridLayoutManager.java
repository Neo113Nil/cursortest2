package androidx.recyclerview.widget;

import C.j;
import L.T;
import N0.B;
import V.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.C0132n;
import h0.C0140w;
import h0.I;
import h0.J;
import h0.K;
import h0.P;
import h0.V;
import h0.W;
import h0.d0;
import h0.f0;
import h0.g0;
import h0.h0;
import h0.i0;
import h0.j0;
import h0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends J implements V {

    /* renamed from: B, reason: collision with root package name */
    public final j f1697B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1698C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1699D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1700E;

    /* renamed from: F, reason: collision with root package name */
    public i0 f1701F;
    public final Rect G;

    /* renamed from: H, reason: collision with root package name */
    public final f0 f1702H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1703I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1704J;

    /* renamed from: K, reason: collision with root package name */
    public final B f1705K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1706p;

    /* renamed from: q, reason: collision with root package name */
    public final j0[] f1707q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1708r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1709s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1710t;

    /* renamed from: u, reason: collision with root package name */
    public int f1711u;

    /* renamed from: v, reason: collision with root package name */
    public final r f1712v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1713w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1715y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1714x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1716z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1696A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1706p = -1;
        this.f1713w = false;
        j jVar = new j(12, false);
        this.f1697B = jVar;
        this.f1698C = 2;
        this.G = new Rect();
        this.f1702H = new f0(this);
        this.f1703I = true;
        this.f1705K = new B(8, this);
        I I2 = J.I(context, attributeSet, i, i2);
        int i3 = I2.f2393a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1710t) {
            this.f1710t = i3;
            g gVar = this.f1708r;
            this.f1708r = this.f1709s;
            this.f1709s = gVar;
            n0();
        }
        int i4 = I2.f2394b;
        c(null);
        if (i4 != this.f1706p) {
            jVar.b();
            n0();
            this.f1706p = i4;
            this.f1715y = new BitSet(this.f1706p);
            this.f1707q = new j0[this.f1706p];
            for (int i5 = 0; i5 < this.f1706p; i5++) {
                this.f1707q[i5] = new j0(this, i5);
            }
            n0();
        }
        boolean z2 = I2.f2395c;
        c(null);
        i0 i0Var = this.f1701F;
        if (i0Var != null && i0Var.f2527h != z2) {
            i0Var.f2527h = z2;
        }
        this.f1713w = z2;
        n0();
        r rVar = new r();
        rVar.f2598a = true;
        rVar.f2602f = 0;
        rVar.f2603g = 0;
        this.f1712v = rVar;
        this.f1708r = g.a(this, this.f1710t);
        this.f1709s = g.a(this, 1 - this.f1710t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // h0.J
    public final boolean B0() {
        return this.f1701F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.f1714x ? 1 : -1;
        }
        return (i < M0()) != this.f1714x ? -1 : 1;
    }

    public final boolean D0() {
        int M02;
        if (v() != 0 && this.f1698C != 0 && this.f2401g) {
            if (this.f1714x) {
                M02 = N0();
                M0();
            } else {
                M02 = M0();
                N0();
            }
            j jVar = this.f1697B;
            if (M02 == 0 && R0() != null) {
                jVar.b();
                this.f2400f = true;
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
        g gVar = this.f1708r;
        boolean z2 = !this.f1703I;
        return d0.e(w2, gVar, J0(z2), I0(z2), this, this.f1703I);
    }

    public final int F0(W w2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1708r;
        boolean z2 = !this.f1703I;
        return d0.f(w2, gVar, J0(z2), I0(z2), this, this.f1703I, this.f1714x);
    }

    public final int G0(W w2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1708r;
        boolean z2 = !this.f1703I;
        return d0.g(w2, gVar, J0(z2), I0(z2), this, this.f1703I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(P p2, r rVar, W w2) {
        j0 j0Var;
        ?? r6;
        int i;
        int h2;
        int c2;
        int k2;
        int c3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f1715y.set(0, this.f1706p, true);
        r rVar2 = this.f1712v;
        int i8 = rVar2.i ? rVar.f2601e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f2601e == 1 ? rVar.f2603g + rVar.f2599b : rVar.f2602f - rVar.f2599b;
        int i9 = rVar.f2601e;
        for (int i10 = 0; i10 < this.f1706p; i10++) {
            if (!this.f1707q[i10].f2541a.isEmpty()) {
                e1(this.f1707q[i10], i9, i8);
            }
        }
        int g2 = this.f1714x ? this.f1708r.g() : this.f1708r.k();
        boolean z2 = false;
        while (true) {
            int i11 = rVar.f2600c;
            if (((i11 < 0 || i11 >= w2.b()) ? i6 : i7) == 0 || (!rVar2.i && this.f1715y.isEmpty())) {
                break;
            }
            View view = p2.k(rVar.f2600c, Long.MAX_VALUE).f2455a;
            rVar.f2600c += rVar.d;
            g0 g0Var = (g0) view.getLayoutParams();
            int b2 = g0Var.f2409a.b();
            j jVar = this.f1697B;
            int[] iArr = (int[]) jVar.f86b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (V0(rVar.f2601e)) {
                    i5 = this.f1706p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1706p;
                    i5 = i6;
                }
                j0 j0Var2 = null;
                if (rVar.f2601e == i7) {
                    int k3 = this.f1708r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        j0 j0Var3 = this.f1707q[i5];
                        int f2 = j0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            j0Var2 = j0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1708r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        j0 j0Var4 = this.f1707q[i5];
                        int h3 = j0Var4.h(g3);
                        if (h3 > i14) {
                            j0Var2 = j0Var4;
                            i14 = h3;
                        }
                        i5 += i3;
                    }
                }
                j0Var = j0Var2;
                jVar.u(b2);
                ((int[]) jVar.f86b)[b2] = j0Var.f2544e;
            } else {
                j0Var = this.f1707q[i12];
            }
            g0Var.f2508e = j0Var;
            if (rVar.f2601e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1710t == 1) {
                i = 1;
                T0(view, J.w(r6, this.f1711u, this.f2405l, r6, ((ViewGroup.MarginLayoutParams) g0Var).width), J.w(true, this.f2408o, this.f2406m, D() + G(), ((ViewGroup.MarginLayoutParams) g0Var).height));
            } else {
                i = 1;
                T0(view, J.w(true, this.f2407n, this.f2405l, F() + E(), ((ViewGroup.MarginLayoutParams) g0Var).width), J.w(false, this.f1711u, this.f2406m, 0, ((ViewGroup.MarginLayoutParams) g0Var).height));
            }
            if (rVar.f2601e == i) {
                c2 = j0Var.f(g2);
                h2 = this.f1708r.c(view) + c2;
            } else {
                h2 = j0Var.h(g2);
                c2 = h2 - this.f1708r.c(view);
            }
            if (rVar.f2601e == 1) {
                j0 j0Var5 = g0Var.f2508e;
                j0Var5.getClass();
                g0 g0Var2 = (g0) view.getLayoutParams();
                g0Var2.f2508e = j0Var5;
                ArrayList arrayList = j0Var5.f2541a;
                arrayList.add(view);
                j0Var5.f2543c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    j0Var5.f2542b = Integer.MIN_VALUE;
                }
                if (g0Var2.f2409a.i() || g0Var2.f2409a.l()) {
                    j0Var5.d = j0Var5.f2545f.f1708r.c(view) + j0Var5.d;
                }
            } else {
                j0 j0Var6 = g0Var.f2508e;
                j0Var6.getClass();
                g0 g0Var3 = (g0) view.getLayoutParams();
                g0Var3.f2508e = j0Var6;
                ArrayList arrayList2 = j0Var6.f2541a;
                arrayList2.add(0, view);
                j0Var6.f2542b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    j0Var6.f2543c = Integer.MIN_VALUE;
                }
                if (g0Var3.f2409a.i() || g0Var3.f2409a.l()) {
                    j0Var6.d = j0Var6.f2545f.f1708r.c(view) + j0Var6.d;
                }
            }
            if (S0() && this.f1710t == 1) {
                c3 = this.f1709s.g() - (((this.f1706p - 1) - j0Var.f2544e) * this.f1711u);
                k2 = c3 - this.f1709s.c(view);
            } else {
                k2 = this.f1709s.k() + (j0Var.f2544e * this.f1711u);
                c3 = this.f1709s.c(view) + k2;
            }
            if (this.f1710t == 1) {
                J.N(view, k2, c2, c3, h2);
            } else {
                J.N(view, c2, k2, h2, c3);
            }
            e1(j0Var, rVar2.f2601e, i8);
            X0(p2, rVar2);
            if (rVar2.f2604h && view.hasFocusable()) {
                i2 = 0;
                this.f1715y.set(j0Var.f2544e, false);
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
        int k4 = rVar2.f2601e == -1 ? this.f1708r.k() - P0(this.f1708r.k()) : O0(this.f1708r.g()) - this.f1708r.g();
        return k4 > 0 ? Math.min(rVar.f2599b, k4) : i15;
    }

    public final View I0(boolean z2) {
        int k2 = this.f1708r.k();
        int g2 = this.f1708r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1708r.e(u2);
            int b2 = this.f1708r.b(u2);
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
        int k2 = this.f1708r.k();
        int g2 = this.f1708r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1708r.e(u2);
            if (this.f1708r.b(u2) > k2 && e2 < g2) {
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
        if (O02 != Integer.MIN_VALUE && (g2 = this.f1708r.g() - O02) > 0) {
            int i = g2 - (-b1(-g2, p2, w2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1708r.p(i);
        }
    }

    @Override // h0.J
    public final boolean L() {
        return this.f1698C != 0;
    }

    public final void L0(P p2, W w2, boolean z2) {
        int k2;
        int P02 = P0(Integer.MAX_VALUE);
        if (P02 != Integer.MAX_VALUE && (k2 = P02 - this.f1708r.k()) > 0) {
            int b12 = k2 - b1(k2, p2, w2);
            if (!z2 || b12 <= 0) {
                return;
            }
            this.f1708r.p(-b12);
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

    @Override // h0.J
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1706p; i2++) {
            j0 j0Var = this.f1707q[i2];
            int i3 = j0Var.f2542b;
            if (i3 != Integer.MIN_VALUE) {
                j0Var.f2542b = i3 + i;
            }
            int i4 = j0Var.f2543c;
            if (i4 != Integer.MIN_VALUE) {
                j0Var.f2543c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int f2 = this.f1707q[0].f(i);
        for (int i2 = 1; i2 < this.f1706p; i2++) {
            int f3 = this.f1707q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // h0.J
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1706p; i2++) {
            j0 j0Var = this.f1707q[i2];
            int i3 = j0Var.f2542b;
            if (i3 != Integer.MIN_VALUE) {
                j0Var.f2542b = i3 + i;
            }
            int i4 = j0Var.f2543c;
            if (i4 != Integer.MIN_VALUE) {
                j0Var.f2543c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int h2 = this.f1707q[0].h(i);
        for (int i2 = 1; i2 < this.f1706p; i2++) {
            int h3 = this.f1707q[i2].h(i);
            if (h3 < h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    @Override // h0.J
    public final void Q() {
        this.f1697B.b();
        for (int i = 0; i < this.f1706p; i++) {
            this.f1707q[i].b();
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
        int N02 = this.f1714x ? N0() : M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1697B;
                iArr = (int[]) jVar.f86b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f87c;
                    if (arrayList != null) {
                        h0 h0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                h0 h0Var2 = (h0) ((ArrayList) jVar.f87c).get(size);
                                if (h0Var2.f2514a == i5) {
                                    h0Var = h0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (h0Var != null) {
                            ((ArrayList) jVar.f87c).remove(h0Var);
                        }
                        int size2 = ((ArrayList) jVar.f87c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((h0) ((ArrayList) jVar.f87c).get(i7)).f2514a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            h0 h0Var3 = (h0) ((ArrayList) jVar.f87c).get(i7);
                            ((ArrayList) jVar.f87c).remove(i7);
                            i6 = h0Var3.f2514a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f86b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f86b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f86b, i5, Math.min(i6 + 1, ((int[]) jVar.f86b).length), -1);
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
                if (i5 <= (this.f1714x ? M0() : N0())) {
                    n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1697B;
        iArr = (int[]) jVar.f86b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f87c;
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
        BitSet bitSet = new BitSet(this.f1706p);
        bitSet.set(0, this.f1706p, true);
        char c2 = (this.f1710t == 1 && S0()) ? (char) 1 : (char) 65535;
        if (this.f1714x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            g0 g0Var = (g0) u2.getLayoutParams();
            if (bitSet.get(g0Var.f2508e.f2544e)) {
                j0 j0Var = g0Var.f2508e;
                if (this.f1714x) {
                    int i3 = j0Var.f2543c;
                    if (i3 == Integer.MIN_VALUE) {
                        j0Var.a();
                        i3 = j0Var.f2543c;
                    }
                    if (i3 < this.f1708r.g()) {
                        ArrayList arrayList = j0Var.f2541a;
                        ((g0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(g0Var.f2508e.f2544e);
                } else {
                    int i4 = j0Var.f2542b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) j0Var.f2541a.get(0);
                        g0 g0Var2 = (g0) view.getLayoutParams();
                        j0Var.f2542b = j0Var.f2545f.f1708r.e(view);
                        g0Var2.getClass();
                        i4 = j0Var.f2542b;
                    }
                    if (i4 > this.f1708r.k()) {
                        ((g0) ((View) j0Var.f2541a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(g0Var.f2508e.f2544e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1714x) {
                    int b2 = this.f1708r.b(u2);
                    int b3 = this.f1708r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((g0Var.f2508e.f2544e - ((g0) u3.getLayoutParams()).f2508e.f2544e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1708r.e(u2);
                    int e3 = this.f1708r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((g0Var.f2508e.f2544e - ((g0) u3.getLayoutParams()).f2508e.f2544e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // h0.J
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2397b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1705K);
        }
        for (int i = 0; i < this.f1706p; i++) {
            this.f1707q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f1710t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f1710t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (S0() == false) goto L46;
     */
    @Override // h0.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, P p2, W w2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2397b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f2396a.f2478c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        a1();
        if (i == 1) {
            if (this.f1710t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1710t != 1) {
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
        g0 g0Var = (g0) D2.getLayoutParams();
        g0Var.getClass();
        j0 j0Var = g0Var.f2508e;
        int N02 = i2 == 1 ? N0() : M0();
        d1(N02, w2);
        c1(i2);
        r rVar = this.f1712v;
        rVar.f2600c = rVar.d + N02;
        rVar.f2599b = (int) (this.f1708r.l() * 0.33333334f);
        rVar.f2604h = true;
        rVar.f2598a = false;
        H0(p2, rVar, w2);
        this.f1699D = this.f1714x;
        View g2 = j0Var.g(N02, i2);
        if (g2 != null && g2 != D2) {
            return g2;
        }
        if (V0(i2)) {
            for (int i3 = this.f1706p - 1; i3 >= 0; i3--) {
                View g3 = this.f1707q[i3].g(N02, i2);
                if (g3 != null && g3 != D2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1706p; i4++) {
                View g4 = this.f1707q[i4].g(N02, i2);
                if (g4 != null && g4 != D2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1713w ^ true) == (i2 == -1);
        View q2 = q(z2 ? j0Var.c() : j0Var.d());
        if (q2 != null && q2 != D2) {
            return q2;
        }
        if (V0(i2)) {
            for (int i5 = this.f1706p - 1; i5 >= 0; i5--) {
                if (i5 != j0Var.f2544e) {
                    View q3 = q(z2 ? this.f1707q[i5].c() : this.f1707q[i5].d());
                    if (q3 != null && q3 != D2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1706p; i6++) {
                View q4 = q(z2 ? this.f1707q[i6].c() : this.f1707q[i6].d());
                if (q4 != null && q4 != D2) {
                    return q4;
                }
            }
        }
        return null;
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2397b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        g0 g0Var = (g0) view.getLayoutParams();
        int f1 = f1(i, ((ViewGroup.MarginLayoutParams) g0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) g0Var).rightMargin + rect.right);
        int f12 = f1(i2, ((ViewGroup.MarginLayoutParams) g0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin + rect.bottom);
        if (w0(view, f1, f12, g0Var)) {
            view.measure(f1, f12);
        }
    }

    @Override // h0.J
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
        i0 i0Var;
        int i;
        int i2;
        i0 i0Var2 = this.f1701F;
        f0 f0Var = this.f1702H;
        if (!(i0Var2 == null && this.f1716z == -1) && w2.b() == 0) {
            i0(p2);
            f0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (f0Var.f2501e && this.f1716z == -1 && this.f1701F == null) ? false : true;
        j jVar = this.f1697B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = f0Var.f2503g;
        if (z4) {
            f0Var.a();
            i0 i0Var3 = this.f1701F;
            if (i0Var3 != null) {
                int i3 = i0Var3.f2523c;
                if (i3 > 0) {
                    if (i3 == this.f1706p) {
                        for (int i4 = 0; i4 < this.f1706p; i4++) {
                            this.f1707q[i4].b();
                            i0 i0Var4 = this.f1701F;
                            int i5 = i0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += i0Var4.i ? this.f1708r.g() : this.f1708r.k();
                            }
                            j0 j0Var = this.f1707q[i4];
                            j0Var.f2542b = i5;
                            j0Var.f2543c = i5;
                        }
                    } else {
                        i0Var3.d = null;
                        i0Var3.f2523c = 0;
                        i0Var3.f2524e = 0;
                        i0Var3.f2525f = null;
                        i0Var3.f2526g = null;
                        i0Var3.f2521a = i0Var3.f2522b;
                    }
                }
                i0 i0Var5 = this.f1701F;
                this.f1700E = i0Var5.f2528j;
                boolean z5 = i0Var5.f2527h;
                c(null);
                i0 i0Var6 = this.f1701F;
                if (i0Var6 != null && i0Var6.f2527h != z5) {
                    i0Var6.f2527h = z5;
                }
                this.f1713w = z5;
                n0();
                a1();
                i0 i0Var7 = this.f1701F;
                int i6 = i0Var7.f2521a;
                if (i6 != -1) {
                    this.f1716z = i6;
                    f0Var.f2500c = i0Var7.i;
                } else {
                    f0Var.f2500c = this.f1714x;
                }
                if (i0Var7.f2524e > 1) {
                    jVar.f86b = i0Var7.f2525f;
                    jVar.f87c = i0Var7.f2526g;
                }
            } else {
                a1();
                f0Var.f2500c = this.f1714x;
            }
            if (!w2.f2438g && (i2 = this.f1716z) != -1) {
                if (i2 < 0 || i2 >= w2.b()) {
                    this.f1716z = -1;
                    this.f1696A = Integer.MIN_VALUE;
                } else {
                    i0 i0Var8 = this.f1701F;
                    if (i0Var8 == null || i0Var8.f2521a == -1 || i0Var8.f2523c < 1) {
                        View q2 = q(this.f1716z);
                        if (q2 != null) {
                            f0Var.f2498a = this.f1714x ? N0() : M0();
                            if (this.f1696A != Integer.MIN_VALUE) {
                                if (f0Var.f2500c) {
                                    f0Var.f2499b = (this.f1708r.g() - this.f1696A) - this.f1708r.b(q2);
                                } else {
                                    f0Var.f2499b = (this.f1708r.k() + this.f1696A) - this.f1708r.e(q2);
                                }
                            } else if (this.f1708r.c(q2) > this.f1708r.l()) {
                                f0Var.f2499b = f0Var.f2500c ? this.f1708r.g() : this.f1708r.k();
                            } else {
                                int e2 = this.f1708r.e(q2) - this.f1708r.k();
                                if (e2 < 0) {
                                    f0Var.f2499b = -e2;
                                } else {
                                    int g2 = this.f1708r.g() - this.f1708r.b(q2);
                                    if (g2 < 0) {
                                        f0Var.f2499b = g2;
                                    } else {
                                        f0Var.f2499b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1716z;
                            f0Var.f2498a = i7;
                            int i8 = this.f1696A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = C0(i7) == 1;
                                f0Var.f2500c = z6;
                                f0Var.f2499b = z6 ? staggeredGridLayoutManager.f1708r.g() : staggeredGridLayoutManager.f1708r.k();
                            } else if (f0Var.f2500c) {
                                f0Var.f2499b = staggeredGridLayoutManager.f1708r.g() - i8;
                            } else {
                                f0Var.f2499b = staggeredGridLayoutManager.f1708r.k() + i8;
                            }
                            f0Var.d = true;
                        }
                    } else {
                        f0Var.f2499b = Integer.MIN_VALUE;
                        f0Var.f2498a = this.f1716z;
                    }
                    f0Var.f2501e = true;
                }
            }
            if (this.f1699D) {
                int b2 = w2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = J.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                f0Var.f2498a = i;
                f0Var.f2499b = Integer.MIN_VALUE;
                f0Var.f2501e = true;
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
                f0Var.f2498a = i;
                f0Var.f2499b = Integer.MIN_VALUE;
                f0Var.f2501e = true;
            }
        }
        if (this.f1701F == null && this.f1716z == -1 && (f0Var.f2500c != this.f1699D || S0() != this.f1700E)) {
            jVar.b();
            f0Var.d = true;
        }
        if (v() > 0 && ((i0Var = this.f1701F) == null || i0Var.f2523c < 1)) {
            if (f0Var.d) {
                for (int i10 = 0; i10 < this.f1706p; i10++) {
                    this.f1707q[i10].b();
                    int i11 = f0Var.f2499b;
                    if (i11 != Integer.MIN_VALUE) {
                        j0 j0Var2 = this.f1707q[i10];
                        j0Var2.f2542b = i11;
                        j0Var2.f2543c = i11;
                    }
                }
            } else if (z4 || f0Var.f2502f == null) {
                for (int i12 = 0; i12 < this.f1706p; i12++) {
                    j0 j0Var3 = this.f1707q[i12];
                    boolean z7 = this.f1714x;
                    int i13 = f0Var.f2499b;
                    int f2 = z7 ? j0Var3.f(Integer.MIN_VALUE) : j0Var3.h(Integer.MIN_VALUE);
                    j0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = j0Var3.f2545f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1708r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1708r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            j0Var3.f2543c = f2;
                            j0Var3.f2542b = f2;
                        }
                    }
                }
                j0[] j0VarArr = this.f1707q;
                int length = j0VarArr.length;
                int[] iArr = f0Var.f2502f;
                if (iArr == null || iArr.length < length) {
                    f0Var.f2502f = new int[staggeredGridLayoutManager.f1707q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    f0Var.f2502f[i14] = j0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1706p; i15++) {
                    j0 j0Var4 = this.f1707q[i15];
                    j0Var4.b();
                    int i16 = f0Var.f2502f[i15];
                    j0Var4.f2542b = i16;
                    j0Var4.f2543c = i16;
                }
            }
        }
        p(p2);
        r rVar = this.f1712v;
        rVar.f2598a = false;
        int l2 = this.f1709s.l();
        this.f1711u = l2 / this.f1706p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1709s.i());
        d1(f0Var.f2498a, w2);
        if (f0Var.f2500c) {
            c1(-1);
            H0(p2, rVar, w2);
            c1(1);
            rVar.f2600c = f0Var.f2498a + rVar.d;
            H0(p2, rVar, w2);
        } else {
            c1(1);
            H0(p2, rVar, w2);
            c1(-1);
            rVar.f2600c = f0Var.f2498a + rVar.d;
            H0(p2, rVar, w2);
        }
        if (this.f1709s.i() != 1073741824) {
            int v4 = v();
            float f3 = RecyclerView.A0;
            for (int i17 = 0; i17 < v4; i17++) {
                View u2 = u(i17);
                float c2 = this.f1709s.c(u2);
                if (c2 >= f3) {
                    ((g0) u2.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1711u;
            int round = Math.round(f3 * this.f1706p);
            if (this.f1709s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1709s.l());
            }
            this.f1711u = round / this.f1706p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1709s.i());
            if (this.f1711u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u3 = u(i19);
                    g0 g0Var = (g0) u3.getLayoutParams();
                    g0Var.getClass();
                    if (S0() && this.f1710t == 1) {
                        int i20 = -((this.f1706p - 1) - g0Var.f2508e.f2544e);
                        u3.offsetLeftAndRight((this.f1711u * i20) - (i20 * i18));
                    } else {
                        int i21 = g0Var.f2508e.f2544e;
                        int i22 = this.f1711u * i21;
                        int i23 = i21 * i18;
                        if (this.f1710t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1714x) {
                K0(p2, w2, true);
                L0(p2, w2, false);
            } else {
                L0(p2, w2, true);
                K0(p2, w2, false);
            }
        }
        if (z2 && !w2.f2438g && this.f1698C != 0 && v() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f2397b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1705K);
            }
        }
        z3 = false;
        if (w2.f2438g) {
            f0Var.a();
        }
        this.f1699D = f0Var.f2500c;
        this.f1700E = S0();
        if (z3) {
            f0Var.a();
            U0(p2, w2, false);
        }
    }

    public final boolean V0(int i) {
        if (this.f1710t == 0) {
            return (i == -1) != this.f1714x;
        }
        return ((i == -1) == this.f1714x) == S0();
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
        r rVar = this.f1712v;
        rVar.f2598a = true;
        d1(M02, w2);
        c1(i2);
        rVar.f2600c = M02 + rVar.d;
        rVar.f2599b = Math.abs(i);
    }

    public final void X0(P p2, r rVar) {
        if (!rVar.f2598a || rVar.i) {
            return;
        }
        if (rVar.f2599b == 0) {
            if (rVar.f2601e == -1) {
                Y0(p2, rVar.f2603g);
                return;
            } else {
                Z0(p2, rVar.f2602f);
                return;
            }
        }
        int i = 1;
        if (rVar.f2601e == -1) {
            int i2 = rVar.f2602f;
            int h2 = this.f1707q[0].h(i2);
            while (i < this.f1706p) {
                int h3 = this.f1707q[i].h(i2);
                if (h3 > h2) {
                    h2 = h3;
                }
                i++;
            }
            int i3 = i2 - h2;
            Y0(p2, i3 < 0 ? rVar.f2603g : rVar.f2603g - Math.min(i3, rVar.f2599b));
            return;
        }
        int i4 = rVar.f2603g;
        int f2 = this.f1707q[0].f(i4);
        while (i < this.f1706p) {
            int f3 = this.f1707q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - rVar.f2603g;
        Z0(p2, i5 < 0 ? rVar.f2602f : Math.min(i5, rVar.f2599b) + rVar.f2602f);
    }

    @Override // h0.J
    public final void Y(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Y0(P p2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1708r.e(u2) < i || this.f1708r.o(u2) < i) {
                return;
            }
            g0 g0Var = (g0) u2.getLayoutParams();
            g0Var.getClass();
            if (g0Var.f2508e.f2541a.size() == 1) {
                return;
            }
            j0 j0Var = g0Var.f2508e;
            ArrayList arrayList = j0Var.f2541a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            g0 g0Var2 = (g0) view.getLayoutParams();
            g0Var2.f2508e = null;
            if (g0Var2.f2409a.i() || g0Var2.f2409a.l()) {
                j0Var.d -= j0Var.f2545f.f1708r.c(view);
            }
            if (size == 1) {
                j0Var.f2542b = Integer.MIN_VALUE;
            }
            j0Var.f2543c = Integer.MIN_VALUE;
            k0(u2, p2);
        }
    }

    @Override // h0.J
    public final void Z() {
        this.f1697B.b();
        n0();
    }

    public final void Z0(P p2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1708r.b(u2) > i || this.f1708r.n(u2) > i) {
                return;
            }
            g0 g0Var = (g0) u2.getLayoutParams();
            g0Var.getClass();
            if (g0Var.f2508e.f2541a.size() == 1) {
                return;
            }
            j0 j0Var = g0Var.f2508e;
            ArrayList arrayList = j0Var.f2541a;
            View view = (View) arrayList.remove(0);
            g0 g0Var2 = (g0) view.getLayoutParams();
            g0Var2.f2508e = null;
            if (arrayList.size() == 0) {
                j0Var.f2543c = Integer.MIN_VALUE;
            }
            if (g0Var2.f2409a.i() || g0Var2.f2409a.l()) {
                j0Var.d -= j0Var.f2545f.f1708r.c(view);
            }
            j0Var.f2542b = Integer.MIN_VALUE;
            k0(u2, p2);
        }
    }

    @Override // h0.V
    public final PointF a(int i) {
        int C02 = C0(i);
        PointF pointF = new PointF();
        if (C02 == 0) {
            return null;
        }
        if (this.f1710t == 0) {
            pointF.x = C02;
            pointF.y = RecyclerView.A0;
        } else {
            pointF.x = RecyclerView.A0;
            pointF.y = C02;
        }
        return pointF;
    }

    @Override // h0.J
    public final void a0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void a1() {
        if (this.f1710t == 1 || !S0()) {
            this.f1714x = this.f1713w;
        } else {
            this.f1714x = !this.f1713w;
        }
    }

    @Override // h0.J
    public final void b0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final int b1(int i, P p2, W w2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, w2);
        r rVar = this.f1712v;
        int H02 = H0(p2, rVar, w2);
        if (rVar.f2599b >= H02) {
            i = i < 0 ? -H02 : H02;
        }
        this.f1708r.p(-i);
        this.f1699D = this.f1714x;
        rVar.f2599b = 0;
        X0(p2, rVar);
        return i;
    }

    @Override // h0.J
    public final void c(String str) {
        if (this.f1701F == null) {
            super.c(str);
        }
    }

    @Override // h0.J
    public final void c0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void c1(int i) {
        r rVar = this.f1712v;
        rVar.f2601e = i;
        rVar.d = this.f1714x != (i == -1) ? -1 : 1;
    }

    @Override // h0.J
    public final boolean d() {
        return this.f1710t == 0;
    }

    @Override // h0.J
    public final void d0(P p2, W w2) {
        U0(p2, w2, true);
    }

    public final void d1(int i, W w2) {
        int i2;
        int i3;
        int i4;
        r rVar = this.f1712v;
        boolean z2 = false;
        rVar.f2599b = 0;
        rVar.f2600c = i;
        C0140w c0140w = this.f2399e;
        if (!(c0140w != null && c0140w.f2628e) || (i4 = w2.f2433a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1714x == (i4 < i)) {
                i2 = this.f1708r.l();
                i3 = 0;
            } else {
                i3 = this.f1708r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2397b;
        if (recyclerView == null || !recyclerView.f1664h) {
            rVar.f2603g = this.f1708r.f() + i2;
            rVar.f2602f = -i3;
        } else {
            rVar.f2602f = this.f1708r.k() - i3;
            rVar.f2603g = this.f1708r.g() + i2;
        }
        rVar.f2604h = false;
        rVar.f2598a = true;
        if (this.f1708r.i() == 0 && this.f1708r.f() == 0) {
            z2 = true;
        }
        rVar.i = z2;
    }

    @Override // h0.J
    public final boolean e() {
        return this.f1710t == 1;
    }

    @Override // h0.J
    public final void e0(W w2) {
        this.f1716z = -1;
        this.f1696A = Integer.MIN_VALUE;
        this.f1701F = null;
        this.f1702H.a();
    }

    public final void e1(j0 j0Var, int i, int i2) {
        int i3 = j0Var.d;
        int i4 = j0Var.f2544e;
        if (i != -1) {
            int i5 = j0Var.f2543c;
            if (i5 == Integer.MIN_VALUE) {
                j0Var.a();
                i5 = j0Var.f2543c;
            }
            if (i5 - i3 >= i2) {
                this.f1715y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = j0Var.f2542b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) j0Var.f2541a.get(0);
            g0 g0Var = (g0) view.getLayoutParams();
            j0Var.f2542b = j0Var.f2545f.f1708r.e(view);
            g0Var.getClass();
            i6 = j0Var.f2542b;
        }
        if (i6 + i3 <= i2) {
            this.f1715y.set(i4, false);
        }
    }

    @Override // h0.J
    public final boolean f(K k2) {
        return k2 instanceof g0;
    }

    @Override // h0.J
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof i0) {
            i0 i0Var = (i0) parcelable;
            this.f1701F = i0Var;
            if (this.f1716z != -1) {
                i0Var.d = null;
                i0Var.f2523c = 0;
                i0Var.f2521a = -1;
                i0Var.f2522b = -1;
                i0Var.d = null;
                i0Var.f2523c = 0;
                i0Var.f2524e = 0;
                i0Var.f2525f = null;
                i0Var.f2526g = null;
            }
            n0();
        }
    }

    @Override // h0.J
    public final Parcelable g0() {
        int h2;
        int k2;
        int[] iArr;
        i0 i0Var = this.f1701F;
        if (i0Var != null) {
            i0 i0Var2 = new i0();
            i0Var2.f2523c = i0Var.f2523c;
            i0Var2.f2521a = i0Var.f2521a;
            i0Var2.f2522b = i0Var.f2522b;
            i0Var2.d = i0Var.d;
            i0Var2.f2524e = i0Var.f2524e;
            i0Var2.f2525f = i0Var.f2525f;
            i0Var2.f2527h = i0Var.f2527h;
            i0Var2.i = i0Var.i;
            i0Var2.f2528j = i0Var.f2528j;
            i0Var2.f2526g = i0Var.f2526g;
            return i0Var2;
        }
        i0 i0Var3 = new i0();
        i0Var3.f2527h = this.f1713w;
        i0Var3.i = this.f1699D;
        i0Var3.f2528j = this.f1700E;
        j jVar = this.f1697B;
        if (jVar == null || (iArr = (int[]) jVar.f86b) == null) {
            i0Var3.f2524e = 0;
        } else {
            i0Var3.f2525f = iArr;
            i0Var3.f2524e = iArr.length;
            i0Var3.f2526g = (ArrayList) jVar.f87c;
        }
        if (v() > 0) {
            i0Var3.f2521a = this.f1699D ? N0() : M0();
            View I02 = this.f1714x ? I0(true) : J0(true);
            i0Var3.f2522b = I02 != null ? J.H(I02) : -1;
            int i = this.f1706p;
            i0Var3.f2523c = i;
            i0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1706p; i2++) {
                if (this.f1699D) {
                    h2 = this.f1707q[i2].f(Integer.MIN_VALUE);
                    if (h2 != Integer.MIN_VALUE) {
                        k2 = this.f1708r.g();
                        h2 -= k2;
                        i0Var3.d[i2] = h2;
                    } else {
                        i0Var3.d[i2] = h2;
                    }
                } else {
                    h2 = this.f1707q[i2].h(Integer.MIN_VALUE);
                    if (h2 != Integer.MIN_VALUE) {
                        k2 = this.f1708r.k();
                        h2 -= k2;
                        i0Var3.d[i2] = h2;
                    } else {
                        i0Var3.d[i2] = h2;
                    }
                }
            }
        } else {
            i0Var3.f2521a = -1;
            i0Var3.f2522b = -1;
            i0Var3.f2523c = 0;
        }
        return i0Var3;
    }

    @Override // h0.J
    public final void h(int i, int i2, W w2, C0132n c0132n) {
        r rVar;
        int f2;
        int i3;
        if (this.f1710t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, w2);
        int[] iArr = this.f1704J;
        if (iArr == null || iArr.length < this.f1706p) {
            this.f1704J = new int[this.f1706p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1706p;
            rVar = this.f1712v;
            if (i4 >= i6) {
                break;
            }
            if (rVar.d == -1) {
                f2 = rVar.f2602f;
                i3 = this.f1707q[i4].h(f2);
            } else {
                f2 = this.f1707q[i4].f(rVar.f2603g);
                i3 = rVar.f2603g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1704J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1704J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = rVar.f2600c;
            if (i9 < 0 || i9 >= w2.b()) {
                return;
            }
            c0132n.a(rVar.f2600c, this.f1704J[i8]);
            rVar.f2600c += rVar.d;
        }
    }

    @Override // h0.J
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // h0.J
    public final int j(W w2) {
        return E0(w2);
    }

    @Override // h0.J
    public final int k(W w2) {
        return F0(w2);
    }

    @Override // h0.J
    public final int l(W w2) {
        return G0(w2);
    }

    @Override // h0.J
    public final int m(W w2) {
        return E0(w2);
    }

    @Override // h0.J
    public final int n(W w2) {
        return F0(w2);
    }

    @Override // h0.J
    public final int o(W w2) {
        return G0(w2);
    }

    @Override // h0.J
    public final int o0(int i, P p2, W w2) {
        return b1(i, p2, w2);
    }

    @Override // h0.J
    public final void p0(int i) {
        i0 i0Var = this.f1701F;
        if (i0Var != null && i0Var.f2521a != i) {
            i0Var.d = null;
            i0Var.f2523c = 0;
            i0Var.f2521a = -1;
            i0Var.f2522b = -1;
        }
        this.f1716z = i;
        this.f1696A = Integer.MIN_VALUE;
        n0();
    }

    @Override // h0.J
    public final int q0(int i, P p2, W w2) {
        return b1(i, p2, w2);
    }

    @Override // h0.J
    public final K r() {
        return this.f1710t == 0 ? new g0(-2, -1) : new g0(-1, -2);
    }

    @Override // h0.J
    public final K s(Context context, AttributeSet attributeSet) {
        return new g0(context, attributeSet);
    }

    @Override // h0.J
    public final K t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g0((ViewGroup.MarginLayoutParams) layoutParams) : new g0(layoutParams);
    }

    @Override // h0.J
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1706p;
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f1710t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2397b;
            WeakHashMap weakHashMap = T.f490a;
            g3 = J.g(i2, height, recyclerView.getMinimumHeight());
            g2 = J.g(i, (this.f1711u * i3) + F2, this.f2397b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f2397b;
            WeakHashMap weakHashMap2 = T.f490a;
            g2 = J.g(i, width, recyclerView2.getMinimumWidth());
            g3 = J.g(i2, (this.f1711u * i3) + D2, this.f2397b.getMinimumHeight());
        }
        this.f2397b.setMeasuredDimension(g2, g3);
    }

    @Override // h0.J
    public final void z0(RecyclerView recyclerView, int i) {
        C0140w c0140w = new C0140w(recyclerView.getContext());
        c0140w.f2625a = i;
        A0(c0140w);
    }
}
