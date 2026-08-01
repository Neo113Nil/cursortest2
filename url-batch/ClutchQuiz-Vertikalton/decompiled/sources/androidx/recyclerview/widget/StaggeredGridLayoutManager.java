package androidx.recyclerview.widget;

import B.j;
import L.k;
import Q.b;
import T.d;
import T.h;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.C0107m;
import f0.C0111q;
import f0.C0115v;
import f0.G;
import f0.H;
import f0.I;
import f0.N;
import f0.S;
import f0.T;
import f0.a0;
import f0.b0;
import f0.c0;
import f0.d0;
import f0.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends H implements S {

    /* renamed from: B, reason: collision with root package name */
    public final j f1621B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1622C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1623D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1624E;
    public d0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1625G;

    /* renamed from: H, reason: collision with root package name */
    public final a0 f1626H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1627I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1628J;

    /* renamed from: K, reason: collision with root package name */
    public final b f1629K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1630p;

    /* renamed from: q, reason: collision with root package name */
    public final e0[] f1631q;

    /* renamed from: r, reason: collision with root package name */
    public final h f1632r;

    /* renamed from: s, reason: collision with root package name */
    public final h f1633s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1634t;

    /* renamed from: u, reason: collision with root package name */
    public int f1635u;

    /* renamed from: v, reason: collision with root package name */
    public final C0111q f1636v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1637w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1639y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1638x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1640z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1620A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1630p = -1;
        this.f1637w = false;
        j jVar = new j(11, false);
        this.f1621B = jVar;
        this.f1622C = 2;
        this.f1625G = new Rect();
        this.f1626H = new a0(this);
        this.f1627I = true;
        this.f1629K = new b(9, this);
        G I2 = H.I(context, attributeSet, i, i2);
        int i3 = I2.f2139a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1634t) {
            this.f1634t = i3;
            h hVar = this.f1632r;
            this.f1632r = this.f1633s;
            this.f1633s = hVar;
            l0();
        }
        int i4 = I2.f2140b;
        c(null);
        if (i4 != this.f1630p) {
            int[] iArr = (int[]) jVar.f56b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f57c = null;
            l0();
            this.f1630p = i4;
            this.f1639y = new BitSet(this.f1630p);
            this.f1631q = new e0[this.f1630p];
            for (int i5 = 0; i5 < this.f1630p; i5++) {
                this.f1631q[i5] = new e0(this, i5);
            }
            l0();
        }
        boolean z2 = I2.f2141c;
        c(null);
        d0 d0Var = this.F;
        if (d0Var != null && d0Var.h != z2) {
            d0Var.h = z2;
        }
        this.f1637w = z2;
        l0();
        C0111q c0111q = new C0111q();
        c0111q.f2326a = true;
        c0111q.f2330f = 0;
        c0111q.f2331g = 0;
        this.f1636v = c0111q;
        this.f1632r = h.a(this, this.f1634t);
        this.f1633s = h.a(this, 1 - this.f1634t);
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
            return this.f1638x ? 1 : -1;
        }
        return (i < K0()) != this.f1638x ? -1 : 1;
    }

    public final boolean B0() {
        int K02;
        if (v() != 0 && this.f1622C != 0 && this.f2147g) {
            if (this.f1638x) {
                K02 = L0();
                K0();
            } else {
                K02 = K0();
                L0();
            }
            j jVar = this.f1621B;
            if (K02 == 0 && P0() != null) {
                int[] iArr = (int[]) jVar.f56b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                jVar.f57c = null;
                this.f2146f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    public final int C0(T t2) {
        if (v() == 0) {
            return 0;
        }
        h hVar = this.f1632r;
        boolean z2 = !this.f1627I;
        return d.l(t2, hVar, H0(z2), G0(z2), this, this.f1627I);
    }

    public final int D0(T t2) {
        if (v() == 0) {
            return 0;
        }
        h hVar = this.f1632r;
        boolean z2 = !this.f1627I;
        return d.m(t2, hVar, H0(z2), G0(z2), this, this.f1627I, this.f1638x);
    }

    public final int E0(T t2) {
        if (v() == 0) {
            return 0;
        }
        h hVar = this.f1632r;
        boolean z2 = !this.f1627I;
        return d.n(t2, hVar, H0(z2), G0(z2), this, this.f1627I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int F0(N n2, C0111q c0111q, T t2) {
        e0 e0Var;
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
        this.f1639y.set(0, this.f1630p, true);
        C0111q c0111q2 = this.f1636v;
        int i8 = c0111q2.i ? c0111q.f2329e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0111q.f2329e == 1 ? c0111q.f2331g + c0111q.f2327b : c0111q.f2330f - c0111q.f2327b;
        int i9 = c0111q.f2329e;
        for (int i10 = 0; i10 < this.f1630p; i10++) {
            if (!this.f1631q[i10].f2246a.isEmpty()) {
                c1(this.f1631q[i10], i9, i8);
            }
        }
        int g2 = this.f1638x ? this.f1632r.g() : this.f1632r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0111q.f2328c;
            if (((i11 < 0 || i11 >= t2.b()) ? i6 : i7) == 0 || (!c0111q2.i && this.f1639y.isEmpty())) {
                break;
            }
            View view = n2.i(c0111q.f2328c, Long.MAX_VALUE).f2193a;
            c0111q.f2328c += c0111q.d;
            b0 b0Var = (b0) view.getLayoutParams();
            int b2 = b0Var.f2154a.b();
            j jVar = this.f1621B;
            int[] iArr = (int[]) jVar.f56b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (T0(c0111q.f2329e)) {
                    i5 = this.f1630p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1630p;
                    i5 = i6;
                }
                e0 e0Var2 = null;
                if (c0111q.f2329e == i7) {
                    int k3 = this.f1632r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        e0 e0Var3 = this.f1631q[i5];
                        int f2 = e0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            e0Var2 = e0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1632r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        e0 e0Var4 = this.f1631q[i5];
                        int h2 = e0Var4.h(g3);
                        if (h2 > i14) {
                            e0Var2 = e0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                e0Var = e0Var2;
                jVar.v(b2);
                ((int[]) jVar.f56b)[b2] = e0Var.f2249e;
            } else {
                e0Var = this.f1631q[i12];
            }
            b0Var.f2223e = e0Var;
            if (c0111q.f2329e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1634t == 1) {
                i = 1;
                R0(view, H.w(r6, this.f1635u, this.f2150l, r6, ((ViewGroup.MarginLayoutParams) b0Var).width), H.w(true, this.f2153o, this.f2151m, D() + G(), ((ViewGroup.MarginLayoutParams) b0Var).height));
            } else {
                i = 1;
                R0(view, H.w(true, this.f2152n, this.f2150l, F() + E(), ((ViewGroup.MarginLayoutParams) b0Var).width), H.w(false, this.f1635u, this.f2151m, 0, ((ViewGroup.MarginLayoutParams) b0Var).height));
            }
            if (c0111q.f2329e == i) {
                c2 = e0Var.f(g2);
                h = this.f1632r.c(view) + c2;
            } else {
                h = e0Var.h(g2);
                c2 = h - this.f1632r.c(view);
            }
            if (c0111q.f2329e == 1) {
                e0 e0Var5 = b0Var.f2223e;
                e0Var5.getClass();
                b0 b0Var2 = (b0) view.getLayoutParams();
                b0Var2.f2223e = e0Var5;
                ArrayList arrayList = e0Var5.f2246a;
                arrayList.add(view);
                e0Var5.f2248c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    e0Var5.f2247b = Integer.MIN_VALUE;
                }
                if (b0Var2.f2154a.i() || b0Var2.f2154a.l()) {
                    e0Var5.d = e0Var5.f2250f.f1632r.c(view) + e0Var5.d;
                }
            } else {
                e0 e0Var6 = b0Var.f2223e;
                e0Var6.getClass();
                b0 b0Var3 = (b0) view.getLayoutParams();
                b0Var3.f2223e = e0Var6;
                ArrayList arrayList2 = e0Var6.f2246a;
                arrayList2.add(0, view);
                e0Var6.f2247b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    e0Var6.f2248c = Integer.MIN_VALUE;
                }
                if (b0Var3.f2154a.i() || b0Var3.f2154a.l()) {
                    e0Var6.d = e0Var6.f2250f.f1632r.c(view) + e0Var6.d;
                }
            }
            if (Q0() && this.f1634t == 1) {
                c3 = this.f1633s.g() - (((this.f1630p - 1) - e0Var.f2249e) * this.f1635u);
                k2 = c3 - this.f1633s.c(view);
            } else {
                k2 = this.f1633s.k() + (e0Var.f2249e * this.f1635u);
                c3 = this.f1633s.c(view) + k2;
            }
            if (this.f1634t == 1) {
                H.N(view, k2, c2, c3, h);
            } else {
                H.N(view, c2, k2, h, c3);
            }
            c1(e0Var, c0111q2.f2329e, i8);
            V0(n2, c0111q2);
            if (c0111q2.h && view.hasFocusable()) {
                i2 = 0;
                this.f1639y.set(e0Var.f2249e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            V0(n2, c0111q2);
        }
        int k4 = c0111q2.f2329e == -1 ? this.f1632r.k() - N0(this.f1632r.k()) : M0(this.f1632r.g()) - this.f1632r.g();
        return k4 > 0 ? Math.min(c0111q.f2327b, k4) : i15;
    }

    public final View G0(boolean z2) {
        int k2 = this.f1632r.k();
        int g2 = this.f1632r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1632r.e(u2);
            int b2 = this.f1632r.b(u2);
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
        int k2 = this.f1632r.k();
        int g2 = this.f1632r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1632r.e(u2);
            if (this.f1632r.b(u2) > k2 && e2 < g2) {
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

    public final void I0(N n2, T t2, boolean z2) {
        int g2;
        int M02 = M0(Integer.MIN_VALUE);
        if (M02 != Integer.MIN_VALUE && (g2 = this.f1632r.g() - M02) > 0) {
            int i = g2 - (-Z0(-g2, n2, t2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1632r.p(i);
        }
    }

    @Override // f0.H
    public final int J(N n2, T t2) {
        return this.f1634t == 0 ? this.f1630p : super.J(n2, t2);
    }

    public final void J0(N n2, T t2, boolean z2) {
        int k2;
        int N02 = N0(Integer.MAX_VALUE);
        if (N02 != Integer.MAX_VALUE && (k2 = N02 - this.f1632r.k()) > 0) {
            int Z02 = k2 - Z0(k2, n2, t2);
            if (!z2 || Z02 <= 0) {
                return;
            }
            this.f1632r.p(-Z02);
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return H.H(u(0));
    }

    @Override // f0.H
    public final boolean L() {
        return this.f1622C != 0;
    }

    public final int L0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return H.H(u(v2 - 1));
    }

    public final int M0(int i) {
        int f2 = this.f1631q[0].f(i);
        for (int i2 = 1; i2 < this.f1630p; i2++) {
            int f3 = this.f1631q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public final int N0(int i) {
        int h = this.f1631q[0].h(i);
        for (int i2 = 1; i2 < this.f1630p; i2++) {
            int h2 = this.f1631q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // f0.H
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1630p; i2++) {
            e0 e0Var = this.f1631q[i2];
            int i3 = e0Var.f2247b;
            if (i3 != Integer.MIN_VALUE) {
                e0Var.f2247b = i3 + i;
            }
            int i4 = e0Var.f2248c;
            if (i4 != Integer.MIN_VALUE) {
                e0Var.f2248c = i4 + i;
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
        int L02 = this.f1638x ? L0() : K0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1621B;
                iArr = (int[]) jVar.f56b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f57c;
                    if (arrayList != null) {
                        c0 c0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                c0 c0Var2 = (c0) ((ArrayList) jVar.f57c).get(size);
                                if (c0Var2.f2227a == i5) {
                                    c0Var = c0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (c0Var != null) {
                            ((ArrayList) jVar.f57c).remove(c0Var);
                        }
                        int size2 = ((ArrayList) jVar.f57c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((c0) ((ArrayList) jVar.f57c).get(i7)).f2227a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            c0 c0Var3 = (c0) ((ArrayList) jVar.f57c).get(i7);
                            ((ArrayList) jVar.f57c).remove(i7);
                            i6 = c0Var3.f2227a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f56b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f56b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f56b, i5, i6 + 1, -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    jVar.A(i, i2);
                } else if (i3 == 2) {
                    jVar.B(i, i2);
                } else if (i3 == 8) {
                    jVar.B(i, 1);
                    jVar.A(i2, 1);
                }
                if (i4 > L02) {
                    return;
                }
                if (i5 <= (this.f1638x ? K0() : L0())) {
                    l0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1621B;
        iArr = (int[]) jVar.f56b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f57c;
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

    @Override // f0.H
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1630p; i2++) {
            e0 e0Var = this.f1631q[i2];
            int i3 = e0Var.f2247b;
            if (i3 != Integer.MIN_VALUE) {
                e0Var.f2247b = i3 + i;
            }
            int i4 = e0Var.f2248c;
            if (i4 != Integer.MIN_VALUE) {
                e0Var.f2248c = i4 + i;
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
        BitSet bitSet = new BitSet(this.f1630p);
        bitSet.set(0, this.f1630p, true);
        char c2 = (this.f1634t == 1 && Q0()) ? (char) 1 : (char) 65535;
        if (this.f1638x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            b0 b0Var = (b0) u2.getLayoutParams();
            if (bitSet.get(b0Var.f2223e.f2249e)) {
                e0 e0Var = b0Var.f2223e;
                if (this.f1638x) {
                    int i3 = e0Var.f2248c;
                    if (i3 == Integer.MIN_VALUE) {
                        e0Var.a();
                        i3 = e0Var.f2248c;
                    }
                    if (i3 < this.f1632r.g()) {
                        ArrayList arrayList = e0Var.f2246a;
                        ((b0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(b0Var.f2223e.f2249e);
                } else {
                    int i4 = e0Var.f2247b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) e0Var.f2246a.get(0);
                        b0 b0Var2 = (b0) view.getLayoutParams();
                        e0Var.f2247b = e0Var.f2250f.f1632r.e(view);
                        b0Var2.getClass();
                        i4 = e0Var.f2247b;
                    }
                    if (i4 > this.f1632r.k()) {
                        ((b0) ((View) e0Var.f2246a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(b0Var.f2223e.f2249e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1638x) {
                    int b2 = this.f1632r.b(u2);
                    int b3 = this.f1632r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((b0Var.f2223e.f2249e - ((b0) u3.getLayoutParams()).f2223e.f2249e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1632r.e(u2);
                    int e3 = this.f1632r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((b0Var.f2223e.f2249e - ((b0) u3.getLayoutParams()).f2223e.f2249e >= 0) == (c2 >= 0)) {
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

    @Override // f0.H
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2143b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1629K);
        }
        for (int i = 0; i < this.f1630p; i++) {
            this.f1631q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2143b;
        Rect rect = this.f1625G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        b0 b0Var = (b0) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) b0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) b0Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) b0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) b0Var).bottomMargin + rect.bottom);
        if (u0(view, d1, d12, b0Var)) {
            view.measure(d1, d12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004f, code lost:
    
        if (r8.f1634t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0054, code lost:
    
        if (r8.f1634t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0061, code lost:
    
        if (Q0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
    
        if (Q0() == false) goto L46;
     */
    @Override // f0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, N n2, T t2) {
        View A2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView == null || (A2 = recyclerView.A(view)) == null || ((ArrayList) this.f2142a.d).contains(A2)) {
            A2 = null;
        }
        if (A2 == null) {
            return null;
        }
        Y0();
        if (i == 1) {
            if (this.f1634t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1634t != 1) {
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
        b0 b0Var = (b0) A2.getLayoutParams();
        b0Var.getClass();
        e0 e0Var = b0Var.f2223e;
        int L02 = i2 == 1 ? L0() : K0();
        b1(L02, t2);
        a1(i2);
        C0111q c0111q = this.f1636v;
        c0111q.f2328c = c0111q.d + L02;
        c0111q.f2327b = (int) (this.f1632r.l() * 0.33333334f);
        c0111q.h = true;
        c0111q.f2326a = false;
        F0(n2, c0111q, t2);
        this.f1623D = this.f1638x;
        View g2 = e0Var.g(L02, i2);
        if (g2 != null && g2 != A2) {
            return g2;
        }
        if (T0(i2)) {
            for (int i3 = this.f1630p - 1; i3 >= 0; i3--) {
                View g3 = this.f1631q[i3].g(L02, i2);
                if (g3 != null && g3 != A2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1630p; i4++) {
                View g4 = this.f1631q[i4].g(L02, i2);
                if (g4 != null && g4 != A2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1637w ^ true) == (i2 == -1);
        View q2 = q(z2 ? e0Var.c() : e0Var.d());
        if (q2 != null && q2 != A2) {
            return q2;
        }
        if (T0(i2)) {
            for (int i5 = this.f1630p - 1; i5 >= 0; i5--) {
                if (i5 != e0Var.f2249e) {
                    View q3 = q(z2 ? this.f1631q[i5].c() : this.f1631q[i5].d());
                    if (q3 != null && q3 != A2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1630p; i6++) {
                View q4 = q(z2 ? this.f1631q[i6].c() : this.f1631q[i6].d());
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
    public final void S0(N n2, T t2, boolean z2) {
        d0 d0Var;
        int i;
        int i2;
        d0 d0Var2 = this.F;
        a0 a0Var = this.f1626H;
        if (!(d0Var2 == null && this.f1640z == -1) && t2.b() == 0) {
            g0(n2);
            a0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (a0Var.f2218e && this.f1640z == -1 && this.F == null) ? false : true;
        j jVar = this.f1621B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = a0Var.f2220g;
        if (z4) {
            a0Var.a();
            d0 d0Var3 = this.F;
            if (d0Var3 != null) {
                int i3 = d0Var3.f2236c;
                if (i3 > 0) {
                    if (i3 == this.f1630p) {
                        for (int i4 = 0; i4 < this.f1630p; i4++) {
                            this.f1631q[i4].b();
                            d0 d0Var4 = this.F;
                            int i5 = d0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += d0Var4.i ? this.f1632r.g() : this.f1632r.k();
                            }
                            e0 e0Var = this.f1631q[i4];
                            e0Var.f2247b = i5;
                            e0Var.f2248c = i5;
                        }
                    } else {
                        d0Var3.d = null;
                        d0Var3.f2236c = 0;
                        d0Var3.f2237e = 0;
                        d0Var3.f2238f = null;
                        d0Var3.f2239g = null;
                        d0Var3.f2234a = d0Var3.f2235b;
                    }
                }
                d0 d0Var5 = this.F;
                this.f1624E = d0Var5.f2240j;
                boolean z5 = d0Var5.h;
                c(null);
                d0 d0Var6 = this.F;
                if (d0Var6 != null && d0Var6.h != z5) {
                    d0Var6.h = z5;
                }
                this.f1637w = z5;
                l0();
                Y0();
                d0 d0Var7 = this.F;
                int i6 = d0Var7.f2234a;
                if (i6 != -1) {
                    this.f1640z = i6;
                    a0Var.f2217c = d0Var7.i;
                } else {
                    a0Var.f2217c = this.f1638x;
                }
                if (d0Var7.f2237e > 1) {
                    jVar.f56b = d0Var7.f2238f;
                    jVar.f57c = d0Var7.f2239g;
                }
            } else {
                Y0();
                a0Var.f2217c = this.f1638x;
            }
            if (!t2.f2180g && (i2 = this.f1640z) != -1) {
                if (i2 < 0 || i2 >= t2.b()) {
                    this.f1640z = -1;
                    this.f1620A = Integer.MIN_VALUE;
                } else {
                    d0 d0Var8 = this.F;
                    if (d0Var8 == null || d0Var8.f2234a == -1 || d0Var8.f2236c < 1) {
                        View q2 = q(this.f1640z);
                        if (q2 != null) {
                            a0Var.f2215a = this.f1638x ? L0() : K0();
                            if (this.f1620A != Integer.MIN_VALUE) {
                                if (a0Var.f2217c) {
                                    a0Var.f2216b = (this.f1632r.g() - this.f1620A) - this.f1632r.b(q2);
                                } else {
                                    a0Var.f2216b = (this.f1632r.k() + this.f1620A) - this.f1632r.e(q2);
                                }
                            } else if (this.f1632r.c(q2) > this.f1632r.l()) {
                                a0Var.f2216b = a0Var.f2217c ? this.f1632r.g() : this.f1632r.k();
                            } else {
                                int e2 = this.f1632r.e(q2) - this.f1632r.k();
                                if (e2 < 0) {
                                    a0Var.f2216b = -e2;
                                } else {
                                    int g2 = this.f1632r.g() - this.f1632r.b(q2);
                                    if (g2 < 0) {
                                        a0Var.f2216b = g2;
                                    } else {
                                        a0Var.f2216b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1640z;
                            a0Var.f2215a = i7;
                            int i8 = this.f1620A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = A0(i7) == 1;
                                a0Var.f2217c = z6;
                                a0Var.f2216b = z6 ? staggeredGridLayoutManager.f1632r.g() : staggeredGridLayoutManager.f1632r.k();
                            } else if (a0Var.f2217c) {
                                a0Var.f2216b = staggeredGridLayoutManager.f1632r.g() - i8;
                            } else {
                                a0Var.f2216b = staggeredGridLayoutManager.f1632r.k() + i8;
                            }
                            a0Var.d = true;
                        }
                    } else {
                        a0Var.f2216b = Integer.MIN_VALUE;
                        a0Var.f2215a = this.f1640z;
                    }
                    a0Var.f2218e = true;
                }
            }
            if (this.f1623D) {
                int b2 = t2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = H.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                a0Var.f2215a = i;
                a0Var.f2216b = Integer.MIN_VALUE;
                a0Var.f2218e = true;
            } else {
                int b3 = t2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H2 = H.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                a0Var.f2215a = i;
                a0Var.f2216b = Integer.MIN_VALUE;
                a0Var.f2218e = true;
            }
        }
        if (this.F == null && this.f1640z == -1 && (a0Var.f2217c != this.f1623D || Q0() != this.f1624E)) {
            int[] iArr = (int[]) jVar.f56b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f57c = null;
            a0Var.d = true;
        }
        if (v() > 0 && ((d0Var = this.F) == null || d0Var.f2236c < 1)) {
            if (a0Var.d) {
                for (int i10 = 0; i10 < this.f1630p; i10++) {
                    this.f1631q[i10].b();
                    int i11 = a0Var.f2216b;
                    if (i11 != Integer.MIN_VALUE) {
                        e0 e0Var2 = this.f1631q[i10];
                        e0Var2.f2247b = i11;
                        e0Var2.f2248c = i11;
                    }
                }
            } else if (z4 || a0Var.f2219f == null) {
                for (int i12 = 0; i12 < this.f1630p; i12++) {
                    e0 e0Var3 = this.f1631q[i12];
                    boolean z7 = this.f1638x;
                    int i13 = a0Var.f2216b;
                    int f2 = z7 ? e0Var3.f(Integer.MIN_VALUE) : e0Var3.h(Integer.MIN_VALUE);
                    e0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = e0Var3.f2250f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1632r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1632r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            e0Var3.f2248c = f2;
                            e0Var3.f2247b = f2;
                        }
                    }
                }
                e0[] e0VarArr = this.f1631q;
                int length = e0VarArr.length;
                int[] iArr2 = a0Var.f2219f;
                if (iArr2 == null || iArr2.length < length) {
                    a0Var.f2219f = new int[staggeredGridLayoutManager.f1631q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    a0Var.f2219f[i14] = e0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1630p; i15++) {
                    e0 e0Var4 = this.f1631q[i15];
                    e0Var4.b();
                    int i16 = a0Var.f2219f[i15];
                    e0Var4.f2247b = i16;
                    e0Var4.f2248c = i16;
                }
            }
        }
        p(n2);
        C0111q c0111q = this.f1636v;
        c0111q.f2326a = false;
        int l2 = this.f1633s.l();
        this.f1635u = l2 / this.f1630p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1633s.i());
        b1(a0Var.f2215a, t2);
        if (a0Var.f2217c) {
            a1(-1);
            F0(n2, c0111q, t2);
            a1(1);
            c0111q.f2328c = a0Var.f2215a + c0111q.d;
            F0(n2, c0111q, t2);
        } else {
            a1(1);
            F0(n2, c0111q, t2);
            a1(-1);
            c0111q.f2328c = a0Var.f2215a + c0111q.d;
            F0(n2, c0111q, t2);
        }
        if (this.f1633s.i() != 1073741824) {
            int v4 = v();
            float f3 = 0.0f;
            for (int i17 = 0; i17 < v4; i17++) {
                View u2 = u(i17);
                float c2 = this.f1633s.c(u2);
                if (c2 >= f3) {
                    ((b0) u2.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1635u;
            int round = Math.round(f3 * this.f1630p);
            if (this.f1633s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1633s.l());
            }
            this.f1635u = round / this.f1630p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1633s.i());
            if (this.f1635u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u3 = u(i19);
                    b0 b0Var = (b0) u3.getLayoutParams();
                    b0Var.getClass();
                    if (Q0() && this.f1634t == 1) {
                        int i20 = -((this.f1630p - 1) - b0Var.f2223e.f2249e);
                        u3.offsetLeftAndRight((this.f1635u * i20) - (i20 * i18));
                    } else {
                        int i21 = b0Var.f2223e.f2249e;
                        int i22 = this.f1635u * i21;
                        int i23 = i21 * i18;
                        if (this.f1634t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1638x) {
                I0(n2, t2, true);
                J0(n2, t2, false);
            } else {
                J0(n2, t2, true);
                I0(n2, t2, false);
            }
        }
        if (z2 && !t2.f2180g && this.f1622C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.f2143b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1629K);
            }
        }
        z3 = false;
        if (t2.f2180g) {
            a0Var.a();
        }
        this.f1623D = a0Var.f2217c;
        this.f1624E = Q0();
        if (z3) {
            a0Var.a();
            S0(n2, t2, false);
        }
    }

    @Override // f0.H
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View H02 = H0(false);
            View G02 = G0(false);
            if (H02 == null || G02 == null) {
                return;
            }
            int H2 = H.H(H02);
            int H3 = H.H(G02);
            if (H2 < H3) {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H3);
            } else {
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    public final boolean T0(int i) {
        if (this.f1634t == 0) {
            return (i == -1) != this.f1638x;
        }
        return ((i == -1) == this.f1638x) == Q0();
    }

    public final void U0(int i, T t2) {
        int K02;
        int i2;
        if (i > 0) {
            K02 = L0();
            i2 = 1;
        } else {
            K02 = K0();
            i2 = -1;
        }
        C0111q c0111q = this.f1636v;
        c0111q.f2326a = true;
        b1(K02, t2);
        a1(i2);
        c0111q.f2328c = K02 + c0111q.d;
        c0111q.f2327b = Math.abs(i);
    }

    @Override // f0.H
    public final void V(N n2, T t2, View view, k kVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b0)) {
            U(view, kVar);
            return;
        }
        b0 b0Var = (b0) layoutParams;
        if (this.f1634t == 0) {
            e0 e0Var = b0Var.f2223e;
            kVar.h(L.j.a(false, e0Var == null ? -1 : e0Var.f2249e, 1, -1, -1));
        } else {
            e0 e0Var2 = b0Var.f2223e;
            kVar.h(L.j.a(false, -1, -1, e0Var2 == null ? -1 : e0Var2.f2249e, 1));
        }
    }

    public final void V0(N n2, C0111q c0111q) {
        if (!c0111q.f2326a || c0111q.i) {
            return;
        }
        if (c0111q.f2327b == 0) {
            if (c0111q.f2329e == -1) {
                W0(n2, c0111q.f2331g);
                return;
            } else {
                X0(n2, c0111q.f2330f);
                return;
            }
        }
        int i = 1;
        if (c0111q.f2329e == -1) {
            int i2 = c0111q.f2330f;
            int h = this.f1631q[0].h(i2);
            while (i < this.f1630p) {
                int h2 = this.f1631q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            W0(n2, i3 < 0 ? c0111q.f2331g : c0111q.f2331g - Math.min(i3, c0111q.f2327b));
            return;
        }
        int i4 = c0111q.f2331g;
        int f2 = this.f1631q[0].f(i4);
        while (i < this.f1630p) {
            int f3 = this.f1631q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - c0111q.f2331g;
        X0(n2, i5 < 0 ? c0111q.f2330f : Math.min(i5, c0111q.f2327b) + c0111q.f2330f);
    }

    @Override // f0.H
    public final void W(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void W0(N n2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1632r.e(u2) < i || this.f1632r.o(u2) < i) {
                return;
            }
            b0 b0Var = (b0) u2.getLayoutParams();
            b0Var.getClass();
            if (b0Var.f2223e.f2246a.size() == 1) {
                return;
            }
            e0 e0Var = b0Var.f2223e;
            ArrayList arrayList = e0Var.f2246a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f2223e = null;
            if (b0Var2.f2154a.i() || b0Var2.f2154a.l()) {
                e0Var.d -= e0Var.f2250f.f1632r.c(view);
            }
            if (size == 1) {
                e0Var.f2247b = Integer.MIN_VALUE;
            }
            e0Var.f2248c = Integer.MIN_VALUE;
            i0(u2, n2);
        }
    }

    @Override // f0.H
    public final void X() {
        j jVar = this.f1621B;
        int[] iArr = (int[]) jVar.f56b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        jVar.f57c = null;
        l0();
    }

    public final void X0(N n2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1632r.b(u2) > i || this.f1632r.n(u2) > i) {
                return;
            }
            b0 b0Var = (b0) u2.getLayoutParams();
            b0Var.getClass();
            if (b0Var.f2223e.f2246a.size() == 1) {
                return;
            }
            e0 e0Var = b0Var.f2223e;
            ArrayList arrayList = e0Var.f2246a;
            View view = (View) arrayList.remove(0);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f2223e = null;
            if (arrayList.size() == 0) {
                e0Var.f2248c = Integer.MIN_VALUE;
            }
            if (b0Var2.f2154a.i() || b0Var2.f2154a.l()) {
                e0Var.d -= e0Var.f2250f.f1632r.c(view);
            }
            e0Var.f2247b = Integer.MIN_VALUE;
            i0(u2, n2);
        }
    }

    @Override // f0.H
    public final void Y(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void Y0() {
        if (this.f1634t == 1 || !Q0()) {
            this.f1638x = this.f1637w;
        } else {
            this.f1638x = !this.f1637w;
        }
    }

    @Override // f0.H
    public final void Z(int i, int i2) {
        O0(i, i2, 2);
    }

    public final int Z0(int i, N n2, T t2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, t2);
        C0111q c0111q = this.f1636v;
        int F02 = F0(n2, c0111q, t2);
        if (c0111q.f2327b >= F02) {
            i = i < 0 ? -F02 : F02;
        }
        this.f1632r.p(-i);
        this.f1623D = this.f1638x;
        c0111q.f2327b = 0;
        V0(n2, c0111q);
        return i;
    }

    @Override // f0.S
    public final PointF a(int i) {
        int A02 = A0(i);
        PointF pointF = new PointF();
        if (A02 == 0) {
            return null;
        }
        if (this.f1634t == 0) {
            pointF.x = A02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = A02;
        }
        return pointF;
    }

    @Override // f0.H
    public final void a0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void a1(int i) {
        C0111q c0111q = this.f1636v;
        c0111q.f2329e = i;
        c0111q.d = this.f1638x != (i == -1) ? -1 : 1;
    }

    @Override // f0.H
    public final void b0(N n2, T t2) {
        S0(n2, t2, true);
    }

    public final void b1(int i, T t2) {
        int i2;
        int i3;
        int i4;
        C0111q c0111q = this.f1636v;
        boolean z2 = false;
        c0111q.f2327b = 0;
        c0111q.f2328c = i;
        C0115v c0115v = this.f2145e;
        if (!(c0115v != null && c0115v.f2354e) || (i4 = t2.f2175a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1638x == (i4 < i)) {
                i2 = this.f1632r.l();
                i3 = 0;
            } else {
                i3 = this.f1632r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2143b;
        if (recyclerView == null || !recyclerView.f1592g) {
            c0111q.f2331g = this.f1632r.f() + i2;
            c0111q.f2330f = -i3;
        } else {
            c0111q.f2330f = this.f1632r.k() - i3;
            c0111q.f2331g = this.f1632r.g() + i2;
        }
        c0111q.h = false;
        c0111q.f2326a = true;
        if (this.f1632r.i() == 0 && this.f1632r.f() == 0) {
            z2 = true;
        }
        c0111q.i = z2;
    }

    @Override // f0.H
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // f0.H
    public final void c0(T t2) {
        this.f1640z = -1;
        this.f1620A = Integer.MIN_VALUE;
        this.F = null;
        this.f1626H.a();
    }

    public final void c1(e0 e0Var, int i, int i2) {
        int i3 = e0Var.d;
        int i4 = e0Var.f2249e;
        if (i != -1) {
            int i5 = e0Var.f2248c;
            if (i5 == Integer.MIN_VALUE) {
                e0Var.a();
                i5 = e0Var.f2248c;
            }
            if (i5 - i3 >= i2) {
                this.f1639y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = e0Var.f2247b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) e0Var.f2246a.get(0);
            b0 b0Var = (b0) view.getLayoutParams();
            e0Var.f2247b = e0Var.f2250f.f1632r.e(view);
            b0Var.getClass();
            i6 = e0Var.f2247b;
        }
        if (i6 + i3 <= i2) {
            this.f1639y.set(i4, false);
        }
    }

    @Override // f0.H
    public final boolean d() {
        return this.f1634t == 0;
    }

    @Override // f0.H
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof d0) {
            this.F = (d0) parcelable;
            l0();
        }
    }

    @Override // f0.H
    public final boolean e() {
        return this.f1634t == 1;
    }

    @Override // f0.H
    public final Parcelable e0() {
        int h;
        int k2;
        int[] iArr;
        d0 d0Var = this.F;
        if (d0Var != null) {
            d0 d0Var2 = new d0();
            d0Var2.f2236c = d0Var.f2236c;
            d0Var2.f2234a = d0Var.f2234a;
            d0Var2.f2235b = d0Var.f2235b;
            d0Var2.d = d0Var.d;
            d0Var2.f2237e = d0Var.f2237e;
            d0Var2.f2238f = d0Var.f2238f;
            d0Var2.h = d0Var.h;
            d0Var2.i = d0Var.i;
            d0Var2.f2240j = d0Var.f2240j;
            d0Var2.f2239g = d0Var.f2239g;
            return d0Var2;
        }
        d0 d0Var3 = new d0();
        d0Var3.h = this.f1637w;
        d0Var3.i = this.f1623D;
        d0Var3.f2240j = this.f1624E;
        j jVar = this.f1621B;
        if (jVar == null || (iArr = (int[]) jVar.f56b) == null) {
            d0Var3.f2237e = 0;
        } else {
            d0Var3.f2238f = iArr;
            d0Var3.f2237e = iArr.length;
            d0Var3.f2239g = (ArrayList) jVar.f57c;
        }
        if (v() > 0) {
            d0Var3.f2234a = this.f1623D ? L0() : K0();
            View G02 = this.f1638x ? G0(true) : H0(true);
            d0Var3.f2235b = G02 != null ? H.H(G02) : -1;
            int i = this.f1630p;
            d0Var3.f2236c = i;
            d0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1630p; i2++) {
                if (this.f1623D) {
                    h = this.f1631q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1632r.g();
                        h -= k2;
                        d0Var3.d[i2] = h;
                    } else {
                        d0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f1631q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1632r.k();
                        h -= k2;
                        d0Var3.d[i2] = h;
                    } else {
                        d0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            d0Var3.f2234a = -1;
            d0Var3.f2235b = -1;
            d0Var3.f2236c = 0;
        }
        return d0Var3;
    }

    @Override // f0.H
    public final boolean f(I i) {
        return i instanceof b0;
    }

    @Override // f0.H
    public final void f0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // f0.H
    public final void h(int i, int i2, T t2, C0107m c0107m) {
        C0111q c0111q;
        int f2;
        int i3;
        if (this.f1634t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, t2);
        int[] iArr = this.f1628J;
        if (iArr == null || iArr.length < this.f1630p) {
            this.f1628J = new int[this.f1630p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1630p;
            c0111q = this.f1636v;
            if (i4 >= i6) {
                break;
            }
            if (c0111q.d == -1) {
                f2 = c0111q.f2330f;
                i3 = this.f1631q[i4].h(f2);
            } else {
                f2 = this.f1631q[i4].f(c0111q.f2331g);
                i3 = c0111q.f2331g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1628J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1628J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0111q.f2328c;
            if (i9 < 0 || i9 >= t2.b()) {
                return;
            }
            c0107m.a(c0111q.f2328c, this.f1628J[i8]);
            c0111q.f2328c += c0111q.d;
        }
    }

    @Override // f0.H
    public final int j(T t2) {
        return C0(t2);
    }

    @Override // f0.H
    public final int k(T t2) {
        return D0(t2);
    }

    @Override // f0.H
    public final int l(T t2) {
        return E0(t2);
    }

    @Override // f0.H
    public final int m(T t2) {
        return C0(t2);
    }

    @Override // f0.H
    public final int m0(int i, N n2, T t2) {
        return Z0(i, n2, t2);
    }

    @Override // f0.H
    public final int n(T t2) {
        return D0(t2);
    }

    @Override // f0.H
    public final void n0(int i) {
        d0 d0Var = this.F;
        if (d0Var != null && d0Var.f2234a != i) {
            d0Var.d = null;
            d0Var.f2236c = 0;
            d0Var.f2234a = -1;
            d0Var.f2235b = -1;
        }
        this.f1640z = i;
        this.f1620A = Integer.MIN_VALUE;
        l0();
    }

    @Override // f0.H
    public final int o(T t2) {
        return E0(t2);
    }

    @Override // f0.H
    public final int o0(int i, N n2, T t2) {
        return Z0(i, n2, t2);
    }

    @Override // f0.H
    public final I r() {
        return this.f1634t == 0 ? new b0(-2, -1) : new b0(-1, -2);
    }

    @Override // f0.H
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1630p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1634t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2143b;
            WeakHashMap weakHashMap = K.S.f365a;
            g3 = H.g(i2, height, recyclerView.getMinimumHeight());
            g2 = H.g(i, (this.f1635u * i3) + F, this.f2143b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2143b;
            WeakHashMap weakHashMap2 = K.S.f365a;
            g2 = H.g(i, width, recyclerView2.getMinimumWidth());
            g3 = H.g(i2, (this.f1635u * i3) + D2, this.f2143b.getMinimumHeight());
        }
        this.f2143b.setMeasuredDimension(g2, g3);
    }

    @Override // f0.H
    public final I s(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    @Override // f0.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b0((ViewGroup.MarginLayoutParams) layoutParams) : new b0(layoutParams);
    }

    @Override // f0.H
    public final int x(N n2, T t2) {
        return this.f1634t == 1 ? this.f1630p : super.x(n2, t2);
    }

    @Override // f0.H
    public final void x0(RecyclerView recyclerView, int i) {
        C0115v c0115v = new C0115v(recyclerView.getContext());
        c0115v.f2351a = i;
        y0(c0115v);
    }

    @Override // f0.H
    public final boolean z0() {
        return this.F == null;
    }
}
