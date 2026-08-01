package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.q;
import androidx.fragment.app.g;
import g1.a1;
import g1.b;
import g1.b1;
import g1.c0;
import g1.g1;
import g1.h0;
import g1.l1;
import g1.m1;
import g1.u1;
import g1.v1;
import g1.w1;
import g1.x1;
import g1.y;
import g1.y1;
import g1.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import n0.p0;
import o0.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends a1 implements l1 {
    public final q B;
    public final int C;
    public boolean D;
    public boolean E;
    public x1 F;
    public final Rect G;
    public final u1 H;
    public final boolean I;
    public int[] J;
    public final g K;

    /* renamed from: p, reason: collision with root package name */
    public final int f804p;

    /* renamed from: q, reason: collision with root package name */
    public final y1[] f805q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.emoji2.text.g f806r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.emoji2.text.g f807s;

    /* renamed from: t, reason: collision with root package name */
    public final int f808t;

    /* renamed from: u, reason: collision with root package name */
    public int f809u;

    /* renamed from: v, reason: collision with root package name */
    public final c0 f810v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f811w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f813y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f812x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f814z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f804p = -1;
        this.f811w = false;
        q qVar = new q(8, false);
        this.B = qVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new u1(this);
        this.I = true;
        this.K = new g(4, this);
        z0 H = a1.H(context, attributeSet, i, i4);
        int i5 = H.f1866a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i5 != this.f808t) {
            this.f808t = i5;
            androidx.emoji2.text.g gVar = this.f806r;
            this.f806r = this.f807s;
            this.f807s = gVar;
            o0();
        }
        int i6 = H.f1867b;
        c(null);
        if (i6 != this.f804p) {
            qVar.b();
            o0();
            this.f804p = i6;
            this.f813y = new BitSet(this.f804p);
            this.f805q = new y1[this.f804p];
            for (int i7 = 0; i7 < this.f804p; i7++) {
                this.f805q[i7] = new y1(this, i7);
            }
            o0();
        }
        boolean z4 = H.f1868c;
        c(null);
        x1 x1Var = this.F;
        if (x1Var != null && x1Var.f1848m != z4) {
            x1Var.f1848m = z4;
        }
        this.f811w = z4;
        o0();
        c0 c0Var = new c0();
        c0Var.f1622a = true;
        c0Var.f1626f = 0;
        c0Var.f1627g = 0;
        this.f810v = c0Var;
        this.f806r = androidx.emoji2.text.g.a(this, this.f808t);
        this.f807s = androidx.emoji2.text.g.a(this, 1 - this.f808t);
    }

    public static int d1(int i, int i4, int i5) {
        int mode;
        return (!(i4 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i5), mode) : i;
    }

    @Override // g1.a1
    public final void A0(RecyclerView recyclerView, int i) {
        h0 h0Var = new h0(recyclerView.getContext());
        h0Var.f1675a = i;
        B0(h0Var);
    }

    @Override // g1.a1
    public final boolean C0() {
        return this.F == null;
    }

    public final boolean D0() {
        int K0;
        if (v() != 0 && this.C != 0 && this.f1602g) {
            if (this.f812x) {
                K0 = L0();
                K0();
            } else {
                K0 = K0();
                L0();
            }
            if (K0 == 0 && P0() != null) {
                this.B.b();
                this.f1601f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return b.b(m1Var, this.f806r, H0(z4), G0(z4), this, this.I, this.f812x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0267, code lost:
    
        V0(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(g1 g1Var, c0 c0Var, m1 m1Var) {
        y1 y1Var;
        ?? r8;
        int i;
        int c5;
        int k4;
        int c6;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.f813y.set(0, this.f804p, true);
        c0 c0Var2 = this.f810v;
        int i9 = c0Var2.i ? c0Var.f1625e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0Var.f1625e == 1 ? c0Var.f1627g + c0Var.f1623b : c0Var.f1626f - c0Var.f1623b;
        int i10 = c0Var.f1625e;
        for (int i11 = 0; i11 < this.f804p; i11++) {
            if (!((ArrayList) this.f805q[i11].f1860f).isEmpty()) {
                c1(this.f805q[i11], i10, i9);
            }
        }
        int g3 = this.f812x ? this.f806r.g() : this.f806r.k();
        boolean z4 = false;
        while (true) {
            int i12 = c0Var.f1624c;
            if (i12 < 0 || i12 >= m1Var.b() || (!c0Var2.i && this.f813y.isEmpty())) {
                break;
            }
            View d = g1Var.d(c0Var.f1624c);
            c0Var.f1624c += c0Var.d;
            v1 v1Var = (v1) d.getLayoutParams();
            int b2 = v1Var.f1617a.b();
            q qVar = this.B;
            int[] iArr = (int[]) qVar.f466g;
            int i13 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i13 == -1) {
                if (T0(c0Var.f1625e)) {
                    i6 = this.f804p - i8;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = this.f804p;
                    i6 = i7;
                }
                y1 y1Var2 = null;
                if (c0Var.f1625e == i8) {
                    int k5 = this.f806r.k();
                    int i14 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        y1 y1Var3 = this.f805q[i6];
                        int g5 = y1Var3.g(k5);
                        if (g5 < i14) {
                            i14 = g5;
                            y1Var2 = y1Var3;
                        }
                        i6 += i4;
                    }
                } else {
                    int g6 = this.f806r.g();
                    int i15 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        y1 y1Var4 = this.f805q[i6];
                        int i16 = y1Var4.i(g6);
                        if (i16 > i15) {
                            y1Var2 = y1Var4;
                            i15 = i16;
                        }
                        i6 += i4;
                    }
                }
                y1Var = y1Var2;
                qVar.t(b2);
                ((int[]) qVar.f466g)[b2] = y1Var.f1859e;
            } else {
                y1Var = this.f805q[i13];
            }
            v1Var.f1810e = y1Var;
            if (c0Var.f1625e == 1) {
                r8 = 0;
                b(d, -1, false);
            } else {
                r8 = 0;
                b(d, 0, false);
            }
            if (this.f808t == 1) {
                R0(d, a1.w(r8, this.f809u, this.f1605l, r8, ((ViewGroup.MarginLayoutParams) v1Var).width), a1.w(true, this.f1608o, this.f1606m, C() + F(), ((ViewGroup.MarginLayoutParams) v1Var).height));
            } else {
                R0(d, a1.w(true, this.f1607n, this.f1605l, E() + D(), ((ViewGroup.MarginLayoutParams) v1Var).width), a1.w(false, this.f809u, this.f1606m, 0, ((ViewGroup.MarginLayoutParams) v1Var).height));
            }
            if (c0Var.f1625e == 1) {
                c5 = y1Var.g(g3);
                i = this.f806r.c(d) + c5;
            } else {
                i = y1Var.i(g3);
                c5 = i - this.f806r.c(d);
            }
            if (c0Var.f1625e == 1) {
                y1 y1Var5 = v1Var.f1810e;
                y1Var5.getClass();
                v1 v1Var2 = (v1) d.getLayoutParams();
                v1Var2.f1810e = y1Var5;
                ArrayList arrayList = (ArrayList) y1Var5.f1860f;
                arrayList.add(d);
                y1Var5.f1858c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    y1Var5.f1857b = Integer.MIN_VALUE;
                }
                if (v1Var2.f1617a.h() || v1Var2.f1617a.k()) {
                    y1Var5.d = ((StaggeredGridLayoutManager) y1Var5.f1861g).f806r.c(d) + y1Var5.d;
                }
            } else {
                y1 y1Var6 = v1Var.f1810e;
                y1Var6.getClass();
                v1 v1Var3 = (v1) d.getLayoutParams();
                v1Var3.f1810e = y1Var6;
                ArrayList arrayList2 = (ArrayList) y1Var6.f1860f;
                arrayList2.add(0, d);
                y1Var6.f1857b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    y1Var6.f1858c = Integer.MIN_VALUE;
                }
                if (v1Var3.f1617a.h() || v1Var3.f1617a.k()) {
                    y1Var6.d = ((StaggeredGridLayoutManager) y1Var6.f1861g).f806r.c(d) + y1Var6.d;
                }
            }
            if (Q0() && this.f808t == 1) {
                c6 = this.f807s.g() - (((this.f804p - 1) - y1Var.f1859e) * this.f809u);
                k4 = c6 - this.f807s.c(d);
            } else {
                k4 = this.f807s.k() + (y1Var.f1859e * this.f809u);
                c6 = this.f807s.c(d) + k4;
            }
            if (this.f808t == 1) {
                a1.N(d, k4, c5, c6, i);
            } else {
                a1.N(d, c5, k4, i, c6);
            }
            c1(y1Var, c0Var2.f1625e, i9);
            V0(g1Var, c0Var2);
            if (c0Var2.h && d.hasFocusable()) {
                this.f813y.set(y1Var.f1859e, false);
            }
            i8 = 1;
            z4 = true;
            i7 = 0;
        }
        int k6 = c0Var2.f1625e == -1 ? this.f806r.k() - N0(this.f806r.k()) : M0(this.f806r.g()) - this.f806r.g();
        if (k6 > 0) {
            return Math.min(c0Var.f1623b, k6);
        }
        return 0;
    }

    public final View G0(boolean z4) {
        int k4 = this.f806r.k();
        int g3 = this.f806r.g();
        View view = null;
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            View u4 = u(v4);
            int e4 = this.f806r.e(u4);
            int b2 = this.f806r.b(u4);
            if (b2 > k4 && e4 < g3) {
                if (b2 <= g3 || !z4) {
                    return u4;
                }
                if (view == null) {
                    view = u4;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z4) {
        int k4 = this.f806r.k();
        int g3 = this.f806r.g();
        int v4 = v();
        View view = null;
        for (int i = 0; i < v4; i++) {
            View u4 = u(i);
            int e4 = this.f806r.e(u4);
            if (this.f806r.b(u4) > k4 && e4 < g3) {
                if (e4 >= k4 || !z4) {
                    return u4;
                }
                if (view == null) {
                    view = u4;
                }
            }
        }
        return view;
    }

    @Override // g1.a1
    public final int I(g1 g1Var, m1 m1Var) {
        if (this.f808t == 0) {
            return Math.min(this.f804p, m1Var.b());
        }
        return -1;
    }

    public final void I0(g1 g1Var, m1 m1Var, boolean z4) {
        int g3;
        int M0 = M0(Integer.MIN_VALUE);
        if (M0 != Integer.MIN_VALUE && (g3 = this.f806r.g() - M0) > 0) {
            int i = g3 - (-Z0(-g3, g1Var, m1Var));
            if (!z4 || i <= 0) {
                return;
            }
            this.f806r.o(i);
        }
    }

    public final void J0(g1 g1Var, m1 m1Var, boolean z4) {
        int k4;
        int N0 = N0(Integer.MAX_VALUE);
        if (N0 != Integer.MAX_VALUE && (k4 = N0 - this.f806r.k()) > 0) {
            int Z0 = k4 - Z0(k4, g1Var, m1Var);
            if (!z4 || Z0 <= 0) {
                return;
            }
            this.f806r.o(-Z0);
        }
    }

    @Override // g1.a1
    public final boolean K() {
        return this.C != 0;
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return a1.G(u(0));
    }

    @Override // g1.a1
    public final boolean L() {
        return this.f811w;
    }

    public final int L0() {
        int v4 = v();
        if (v4 == 0) {
            return 0;
        }
        return a1.G(u(v4 - 1));
    }

    public final int M0(int i) {
        int g3 = this.f805q[0].g(i);
        for (int i4 = 1; i4 < this.f804p; i4++) {
            int g5 = this.f805q[i4].g(i);
            if (g5 > g3) {
                g3 = g5;
            }
        }
        return g3;
    }

    public final int N0(int i) {
        int i4 = this.f805q[0].i(i);
        for (int i5 = 1; i5 < this.f804p; i5++) {
            int i6 = this.f805q[i5].i(i);
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4;
    }

    @Override // g1.a1
    public final void O(int i) {
        super.O(i);
        for (int i4 = 0; i4 < this.f804p; i4++) {
            y1 y1Var = this.f805q[i4];
            int i5 = y1Var.f1857b;
            if (i5 != Integer.MIN_VALUE) {
                y1Var.f1857b = i5 + i;
            }
            int i6 = y1Var.f1858c;
            if (i6 != Integer.MIN_VALUE) {
                y1Var.f1858c = i6 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(int i, int i4, int i5) {
        int i6;
        int i7;
        q qVar;
        int[] iArr;
        ArrayList arrayList;
        w1 w1Var;
        int i8;
        int L0 = this.f812x ? L0() : K0();
        if (i5 != 8) {
            i6 = i + i4;
        } else {
            if (i >= i4) {
                i6 = i + 1;
                i7 = i4;
                qVar = this.B;
                iArr = (int[]) qVar.f466g;
                if (iArr != null && i7 < iArr.length) {
                    arrayList = (ArrayList) qVar.h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                w1Var = (w1) ((ArrayList) qVar.h).get(size);
                                if (w1Var.f1818f == i7) {
                                    break;
                                }
                            }
                        }
                        w1Var = null;
                        if (w1Var != null) {
                            ((ArrayList) qVar.h).remove(w1Var);
                        }
                        int size2 = ((ArrayList) qVar.h).size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                i9 = -1;
                                break;
                            } else if (((w1) ((ArrayList) qVar.h).get(i9)).f1818f >= i7) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (i9 != -1) {
                            w1 w1Var2 = (w1) ((ArrayList) qVar.h).get(i9);
                            ((ArrayList) qVar.h).remove(i9);
                            i8 = w1Var2.f1818f;
                            if (i8 == -1) {
                                int[] iArr2 = (int[]) qVar.f466g;
                                Arrays.fill(iArr2, i7, iArr2.length, -1);
                                int length = ((int[]) qVar.f466g).length;
                            } else {
                                Arrays.fill((int[]) qVar.f466g, i7, Math.min(i8 + 1, ((int[]) qVar.f466g).length), -1);
                            }
                        }
                    }
                    i8 = -1;
                    if (i8 == -1) {
                    }
                }
                if (i5 != 1) {
                    qVar.y(i, i4);
                } else if (i5 == 2) {
                    qVar.z(i, i4);
                } else if (i5 == 8) {
                    qVar.z(i, 1);
                    qVar.y(i4, 1);
                }
                if (i6 > L0) {
                    return;
                }
                if (i7 <= (this.f812x ? K0() : L0())) {
                    o0();
                    return;
                }
                return;
            }
            i6 = i4 + 1;
        }
        i7 = i;
        qVar = this.B;
        iArr = (int[]) qVar.f466g;
        if (iArr != null) {
            arrayList = (ArrayList) qVar.h;
            if (arrayList != null) {
            }
            i8 = -1;
            if (i8 == -1) {
            }
        }
        if (i5 != 1) {
        }
        if (i6 > L0) {
        }
    }

    @Override // g1.a1
    public final void P(int i) {
        super.P(i);
        for (int i4 = 0; i4 < this.f804p; i4++) {
            y1 y1Var = this.f805q[i4];
            int i5 = y1Var.f1857b;
            if (i5 != Integer.MIN_VALUE) {
                y1Var.f1857b = i5 + i;
            }
            int i6 = y1Var.f1858c;
            if (i6 != Integer.MIN_VALUE) {
                y1Var.f1858c = i6 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View P0() {
        int v4 = v();
        int i = v4 - 1;
        BitSet bitSet = new BitSet(this.f804p);
        bitSet.set(0, this.f804p, true);
        char c5 = (this.f808t == 1 && Q0()) ? (char) 1 : (char) 65535;
        if (this.f812x) {
            v4 = -1;
        } else {
            i = 0;
        }
        int i4 = i < v4 ? 1 : -1;
        while (i != v4) {
            View u4 = u(i);
            v1 v1Var = (v1) u4.getLayoutParams();
            if (bitSet.get(v1Var.f1810e.f1859e)) {
                y1 y1Var = v1Var.f1810e;
                if (this.f812x) {
                    int i5 = y1Var.f1858c;
                    if (i5 == Integer.MIN_VALUE) {
                        y1Var.a();
                        i5 = y1Var.f1858c;
                    }
                    if (i5 < this.f806r.g()) {
                        ArrayList arrayList = (ArrayList) y1Var.f1860f;
                        ((v1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u4;
                    }
                } else {
                    int i6 = y1Var.f1857b;
                    ArrayList arrayList2 = (ArrayList) y1Var.f1860f;
                    if (i6 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        v1 v1Var2 = (v1) view.getLayoutParams();
                        y1Var.f1857b = ((StaggeredGridLayoutManager) y1Var.f1861g).f806r.e(view);
                        v1Var2.getClass();
                        i6 = y1Var.f1857b;
                    }
                    if (i6 > this.f806r.k()) {
                        ((v1) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u4;
                    }
                }
                bitSet.clear(v1Var.f1810e.f1859e);
            }
            i += i4;
            if (i != v4) {
                View u5 = u(i);
                if (this.f812x) {
                    int b2 = this.f806r.b(u4);
                    int b5 = this.f806r.b(u5);
                    if (b2 < b5) {
                        return u4;
                    }
                    if (b2 == b5) {
                        if ((v1Var.f1810e.f1859e - ((v1) u5.getLayoutParams()).f1810e.f1859e >= 0) == (c5 >= 0)) {
                            return u4;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e4 = this.f806r.e(u4);
                    int e5 = this.f806r.e(u5);
                    if (e4 > e5) {
                        return u4;
                    }
                    if (e4 == e5) {
                        if ((v1Var.f1810e.f1859e - ((v1) u5.getLayoutParams()).f1810e.f1859e >= 0) == (c5 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // g1.a1
    public final void Q() {
        this.B.b();
        for (int i = 0; i < this.f804p; i++) {
            this.f805q[i].b();
        }
    }

    public final boolean Q0() {
        return this.f1598b.getLayoutDirection() == 1;
    }

    public final void R0(View view, int i, int i4) {
        RecyclerView recyclerView = this.f1598b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        v1 v1Var = (v1) view.getLayoutParams();
        int d12 = d1(i, ((ViewGroup.MarginLayoutParams) v1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) v1Var).rightMargin + rect.right);
        int d13 = d1(i4, ((ViewGroup.MarginLayoutParams) v1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) v1Var).bottomMargin + rect.bottom);
        if (x0(view, d12, d13, v1Var)) {
            view.measure(d12, d13);
        }
    }

    @Override // g1.a1
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1598b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.f804p; i++) {
            this.f805q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r11 < K0()) != r16.f812x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0416, code lost:
    
        if (D0() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f812x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(g1 g1Var, m1 m1Var, boolean z4) {
        x1 x1Var;
        int i;
        int i4;
        boolean z5;
        x1 x1Var2 = this.F;
        u1 u1Var = this.H;
        if (!(x1Var2 == null && this.f814z == -1) && m1Var.b() == 0) {
            j0(g1Var);
            u1Var.a();
            return;
        }
        boolean z6 = u1Var.f1802e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = u1Var.f1804g;
        boolean z7 = true;
        boolean z8 = (z6 && this.f814z == -1 && this.F == null) ? false : true;
        q qVar = this.B;
        if (z8) {
            u1Var.a();
            x1 x1Var3 = this.F;
            if (x1Var3 != null) {
                int i5 = x1Var3.h;
                if (i5 > 0) {
                    if (i5 == this.f804p) {
                        for (int i6 = 0; i6 < this.f804p; i6++) {
                            this.f805q[i6].b();
                            x1 x1Var4 = this.F;
                            int i7 = x1Var4.i[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += x1Var4.f1849n ? this.f806r.g() : this.f806r.k();
                            }
                            y1 y1Var = this.f805q[i6];
                            y1Var.f1857b = i7;
                            y1Var.f1858c = i7;
                        }
                    } else {
                        x1Var3.i = null;
                        x1Var3.h = 0;
                        x1Var3.f1845j = 0;
                        x1Var3.f1846k = null;
                        x1Var3.f1847l = null;
                        x1Var3.f1843f = x1Var3.f1844g;
                    }
                }
                x1 x1Var5 = this.F;
                this.E = x1Var5.f1850o;
                boolean z9 = x1Var5.f1848m;
                c(null);
                x1 x1Var6 = this.F;
                if (x1Var6 != null && x1Var6.f1848m != z9) {
                    x1Var6.f1848m = z9;
                }
                this.f811w = z9;
                o0();
                Y0();
                x1 x1Var7 = this.F;
                int i8 = x1Var7.f1843f;
                if (i8 != -1) {
                    this.f814z = i8;
                    u1Var.f1801c = x1Var7.f1849n;
                } else {
                    u1Var.f1801c = this.f812x;
                }
                if (x1Var7.f1845j > 1) {
                    qVar.f466g = x1Var7.f1846k;
                    qVar.h = x1Var7.f1847l;
                }
            } else {
                Y0();
                u1Var.f1801c = this.f812x;
            }
            if (!m1Var.f1725g && (i4 = this.f814z) != -1) {
                if (i4 < 0 || i4 >= m1Var.b()) {
                    this.f814z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    x1 x1Var8 = this.F;
                    if (x1Var8 == null || x1Var8.f1843f == -1 || x1Var8.h < 1) {
                        View q4 = q(this.f814z);
                        if (q4 != null) {
                            u1Var.f1799a = this.f812x ? L0() : K0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (u1Var.f1801c) {
                                    u1Var.f1800b = (this.f806r.g() - this.A) - this.f806r.b(q4);
                                } else {
                                    u1Var.f1800b = (this.f806r.k() + this.A) - this.f806r.e(q4);
                                }
                            } else if (this.f806r.c(q4) > this.f806r.l()) {
                                u1Var.f1800b = u1Var.f1801c ? this.f806r.g() : this.f806r.k();
                            } else {
                                int e4 = this.f806r.e(q4) - this.f806r.k();
                                if (e4 < 0) {
                                    u1Var.f1800b = -e4;
                                } else {
                                    int g3 = this.f806r.g() - this.f806r.b(q4);
                                    if (g3 < 0) {
                                        u1Var.f1800b = g3;
                                    } else {
                                        u1Var.f1800b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.f814z;
                            u1Var.f1799a = i9;
                            int i10 = this.A;
                            if (i10 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                u1Var.f1801c = z5;
                                u1Var.f1800b = z5 ? staggeredGridLayoutManager.f806r.g() : staggeredGridLayoutManager.f806r.k();
                            } else if (u1Var.f1801c) {
                                u1Var.f1800b = staggeredGridLayoutManager.f806r.g() - i10;
                            } else {
                                u1Var.f1800b = staggeredGridLayoutManager.f806r.k() + i10;
                            }
                            u1Var.d = true;
                        }
                    } else {
                        u1Var.f1800b = Integer.MIN_VALUE;
                        u1Var.f1799a = this.f814z;
                    }
                    u1Var.f1802e = true;
                }
            }
            if (this.D) {
                int b2 = m1Var.b();
                for (int v4 = v() - 1; v4 >= 0; v4--) {
                    i = a1.G(u(v4));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                u1Var.f1799a = i;
                u1Var.f1800b = Integer.MIN_VALUE;
                u1Var.f1802e = true;
            } else {
                int b5 = m1Var.b();
                int v5 = v();
                for (int i11 = 0; i11 < v5; i11++) {
                    int G = a1.G(u(i11));
                    if (G >= 0 && G < b5) {
                        i = G;
                        break;
                    }
                }
                i = 0;
                u1Var.f1799a = i;
                u1Var.f1800b = Integer.MIN_VALUE;
                u1Var.f1802e = true;
            }
        }
        if (this.F == null && this.f814z == -1 && (u1Var.f1801c != this.D || Q0() != this.E)) {
            qVar.b();
            u1Var.d = true;
        }
        if (v() > 0 && ((x1Var = this.F) == null || x1Var.h < 1)) {
            if (u1Var.d) {
                for (int i12 = 0; i12 < this.f804p; i12++) {
                    this.f805q[i12].b();
                    int i13 = u1Var.f1800b;
                    if (i13 != Integer.MIN_VALUE) {
                        y1 y1Var2 = this.f805q[i12];
                        y1Var2.f1857b = i13;
                        y1Var2.f1858c = i13;
                    }
                }
            } else if (z8 || u1Var.f1803f == null) {
                for (int i14 = 0; i14 < this.f804p; i14++) {
                    y1 y1Var3 = this.f805q[i14];
                    boolean z10 = this.f812x;
                    int i15 = u1Var.f1800b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) y1Var3.f1861g;
                    int g5 = z10 ? y1Var3.g(Integer.MIN_VALUE) : y1Var3.i(Integer.MIN_VALUE);
                    y1Var3.b();
                    if (g5 != Integer.MIN_VALUE && ((!z10 || g5 >= staggeredGridLayoutManager2.f806r.g()) && (z10 || g5 <= staggeredGridLayoutManager2.f806r.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            g5 += i15;
                        }
                        y1Var3.f1858c = g5;
                        y1Var3.f1857b = g5;
                    }
                }
                y1[] y1VarArr = this.f805q;
                int length = y1VarArr.length;
                int[] iArr = u1Var.f1803f;
                if (iArr == null || iArr.length < length) {
                    u1Var.f1803f = new int[staggeredGridLayoutManager.f805q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    u1Var.f1803f[i16] = y1VarArr[i16].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < this.f804p; i17++) {
                    y1 y1Var4 = this.f805q[i17];
                    y1Var4.b();
                    int i18 = u1Var.f1803f[i17];
                    y1Var4.f1857b = i18;
                    y1Var4.f1858c = i18;
                }
            }
        }
        p(g1Var);
        c0 c0Var = this.f810v;
        c0Var.f1622a = false;
        int l4 = this.f807s.l();
        this.f809u = l4 / this.f804p;
        View.MeasureSpec.makeMeasureSpec(l4, this.f807s.i());
        b1(u1Var.f1799a, m1Var);
        if (u1Var.f1801c) {
            a1(-1);
            F0(g1Var, c0Var, m1Var);
            a1(1);
            c0Var.f1624c = u1Var.f1799a + c0Var.d;
            F0(g1Var, c0Var, m1Var);
        } else {
            a1(1);
            F0(g1Var, c0Var, m1Var);
            a1(-1);
            c0Var.f1624c = u1Var.f1799a + c0Var.d;
            F0(g1Var, c0Var, m1Var);
        }
        if (this.f807s.i() != 1073741824) {
            int v6 = v();
            float f5 = 0.0f;
            for (int i19 = 0; i19 < v6; i19++) {
                View u4 = u(i19);
                float c5 = this.f807s.c(u4);
                if (c5 >= f5) {
                    ((v1) u4.getLayoutParams()).getClass();
                    f5 = Math.max(f5, c5);
                }
            }
            int i20 = this.f809u;
            int round = Math.round(f5 * this.f804p);
            if (this.f807s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f807s.l());
            }
            this.f809u = round / this.f804p;
            View.MeasureSpec.makeMeasureSpec(round, this.f807s.i());
            if (this.f809u != i20) {
                for (int i21 = 0; i21 < v6; i21++) {
                    View u5 = u(i21);
                    v1 v1Var = (v1) u5.getLayoutParams();
                    v1Var.getClass();
                    if (Q0() && this.f808t == 1) {
                        int i22 = -((this.f804p - 1) - v1Var.f1810e.f1859e);
                        u5.offsetLeftAndRight((this.f809u * i22) - (i22 * i20));
                    } else {
                        int i23 = v1Var.f1810e.f1859e;
                        int i24 = this.f809u * i23;
                        int i25 = i23 * i20;
                        if (this.f808t == 1) {
                            u5.offsetLeftAndRight(i24 - i25);
                        } else {
                            u5.offsetTopAndBottom(i24 - i25);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f812x) {
                I0(g1Var, m1Var, true);
                J0(g1Var, m1Var, false);
            } else {
                J0(g1Var, m1Var, true);
                I0(g1Var, m1Var, false);
            }
        }
        if (z4 && !m1Var.f1725g && this.C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.f1598b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
        }
        z7 = false;
        if (m1Var.f1725g) {
            u1Var.a();
        }
        this.D = u1Var.f1801c;
        this.E = Q0();
        if (z7) {
            u1Var.a();
            S0(g1Var, m1Var, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x004f, code lost:
    
        if (r8.f808t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0055, code lost:
    
        if (r8.f808t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0061, code lost:
    
        if (Q0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006d, code lost:
    
        if (Q0() == false) goto L37;
     */
    @Override // g1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, g1 g1Var, m1 m1Var) {
        View view2;
        int i4;
        if (v() != 0) {
            RecyclerView recyclerView = this.f1598b;
            if (recyclerView == null || (view2 = recyclerView.D(view)) == null || this.f1597a.f1673c.contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                Y0();
                if (i == 1) {
                    if (this.f808t != 1) {
                    }
                    i4 = -1;
                } else if (i == 2) {
                    if (this.f808t != 1) {
                    }
                    i4 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i4 = Integer.MIN_VALUE;
                }
                if (i4 != Integer.MIN_VALUE) {
                    v1 v1Var = (v1) view2.getLayoutParams();
                    v1Var.getClass();
                    y1 y1Var = v1Var.f1810e;
                    int L0 = i4 == 1 ? L0() : K0();
                    b1(L0, m1Var);
                    a1(i4);
                    c0 c0Var = this.f810v;
                    c0Var.f1624c = c0Var.d + L0;
                    c0Var.f1623b = (int) (this.f806r.l() * 0.33333334f);
                    c0Var.h = true;
                    c0Var.f1622a = false;
                    F0(g1Var, c0Var, m1Var);
                    this.D = this.f812x;
                    View h = y1Var.h(L0, i4);
                    if (h != null && h != view2) {
                        return h;
                    }
                    if (T0(i4)) {
                        for (int i5 = this.f804p - 1; i5 >= 0; i5--) {
                            View h5 = this.f805q[i5].h(L0, i4);
                            if (h5 != null && h5 != view2) {
                                return h5;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f804p; i6++) {
                            View h6 = this.f805q[i6].h(L0, i4);
                            if (h6 != null && h6 != view2) {
                                return h6;
                            }
                        }
                    }
                    boolean z4 = (this.f811w ^ true) == (i4 == -1);
                    View q4 = q(z4 ? y1Var.c() : y1Var.d());
                    if (q4 != null && q4 != view2) {
                        return q4;
                    }
                    if (T0(i4)) {
                        for (int i7 = this.f804p - 1; i7 >= 0; i7--) {
                            if (i7 != y1Var.f1859e) {
                                View q5 = q(z4 ? this.f805q[i7].c() : this.f805q[i7].d());
                                if (q5 != null && q5 != view2) {
                                    return q5;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < this.f804p; i8++) {
                            View q6 = q(z4 ? this.f805q[i8].c() : this.f805q[i8].d());
                            if (q6 != null && q6 != view2) {
                                return q6;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean T0(int i) {
        if (this.f808t == 0) {
            return (i == -1) != this.f812x;
        }
        return ((i == -1) == this.f812x) == Q0();
    }

    @Override // g1.a1
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(false);
            View G0 = G0(false);
            if (H0 == null || G0 == null) {
                return;
            }
            int G = a1.G(H0);
            int G2 = a1.G(G0);
            if (G < G2) {
                accessibilityEvent.setFromIndex(G);
                accessibilityEvent.setToIndex(G2);
            } else {
                accessibilityEvent.setFromIndex(G2);
                accessibilityEvent.setToIndex(G);
            }
        }
    }

    public final void U0(int i, m1 m1Var) {
        int K0;
        int i4;
        if (i > 0) {
            K0 = L0();
            i4 = 1;
        } else {
            K0 = K0();
            i4 = -1;
        }
        c0 c0Var = this.f810v;
        c0Var.f1622a = true;
        b1(K0, m1Var);
        a1(i4);
        c0Var.f1624c = K0 + c0Var.d;
        c0Var.f1623b = Math.abs(i);
    }

    @Override // g1.a1
    public final void V(g1 g1Var, m1 m1Var, o0.g gVar) {
        super.V(g1Var, m1Var, gVar);
        gVar.h("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(g1 g1Var, c0 c0Var) {
        if (!c0Var.f1622a || c0Var.i) {
            return;
        }
        if (c0Var.f1623b == 0) {
            if (c0Var.f1625e == -1) {
                W0(g1Var, c0Var.f1627g);
                return;
            } else {
                X0(g1Var, c0Var.f1626f);
                return;
            }
        }
        int i = 1;
        if (c0Var.f1625e == -1) {
            int i4 = c0Var.f1626f;
            int i5 = this.f805q[0].i(i4);
            while (i < this.f804p) {
                int i6 = this.f805q[i].i(i4);
                if (i6 > i5) {
                    i5 = i6;
                }
                i++;
            }
            int i7 = i4 - i5;
            W0(g1Var, i7 < 0 ? c0Var.f1627g : c0Var.f1627g - Math.min(i7, c0Var.f1623b));
            return;
        }
        int i8 = c0Var.f1627g;
        int g3 = this.f805q[0].g(i8);
        while (i < this.f804p) {
            int g5 = this.f805q[i].g(i8);
            if (g5 < g3) {
                g3 = g5;
            }
            i++;
        }
        int i9 = g3 - c0Var.f1627g;
        X0(g1Var, i9 < 0 ? c0Var.f1626f : Math.min(i9, c0Var.f1623b) + c0Var.f1626f);
    }

    public final void W0(g1 g1Var, int i) {
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            View u4 = u(v4);
            if (this.f806r.e(u4) < i || this.f806r.n(u4) < i) {
                return;
            }
            v1 v1Var = (v1) u4.getLayoutParams();
            v1Var.getClass();
            if (((ArrayList) v1Var.f1810e.f1860f).size() == 1) {
                return;
            }
            y1 y1Var = v1Var.f1810e;
            ArrayList arrayList = (ArrayList) y1Var.f1860f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            v1 v1Var2 = (v1) view.getLayoutParams();
            v1Var2.f1810e = null;
            if (v1Var2.f1617a.h() || v1Var2.f1617a.k()) {
                y1Var.d -= ((StaggeredGridLayoutManager) y1Var.f1861g).f806r.c(view);
            }
            if (size == 1) {
                y1Var.f1857b = Integer.MIN_VALUE;
            }
            y1Var.f1858c = Integer.MIN_VALUE;
            l0(u4, g1Var);
        }
    }

    @Override // g1.a1
    public final void X(g1 g1Var, m1 m1Var, View view, o0.g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof v1)) {
            W(view, gVar);
            return;
        }
        v1 v1Var = (v1) layoutParams;
        if (this.f808t == 0) {
            y1 y1Var = v1Var.f1810e;
            gVar.i(f.a(false, y1Var == null ? -1 : y1Var.f1859e, 1, -1, -1));
        } else {
            y1 y1Var2 = v1Var.f1810e;
            gVar.i(f.a(false, -1, -1, y1Var2 == null ? -1 : y1Var2.f1859e, 1));
        }
    }

    public final void X0(g1 g1Var, int i) {
        while (v() > 0) {
            View u4 = u(0);
            if (this.f806r.b(u4) > i || this.f806r.m(u4) > i) {
                return;
            }
            v1 v1Var = (v1) u4.getLayoutParams();
            v1Var.getClass();
            if (((ArrayList) v1Var.f1810e.f1860f).size() == 1) {
                return;
            }
            y1 y1Var = v1Var.f1810e;
            ArrayList arrayList = (ArrayList) y1Var.f1860f;
            View view = (View) arrayList.remove(0);
            v1 v1Var2 = (v1) view.getLayoutParams();
            v1Var2.f1810e = null;
            if (arrayList.size() == 0) {
                y1Var.f1858c = Integer.MIN_VALUE;
            }
            if (v1Var2.f1617a.h() || v1Var2.f1617a.k()) {
                y1Var.d -= ((StaggeredGridLayoutManager) y1Var.f1861g).f806r.c(view);
            }
            y1Var.f1857b = Integer.MIN_VALUE;
            l0(u4, g1Var);
        }
    }

    @Override // g1.a1
    public final void Y(int i, int i4) {
        O0(i, i4, 1);
    }

    public final void Y0() {
        if (this.f808t == 1 || !Q0()) {
            this.f812x = this.f811w;
        } else {
            this.f812x = !this.f811w;
        }
    }

    @Override // g1.a1
    public final void Z() {
        this.B.b();
        o0();
    }

    public final int Z0(int i, g1 g1Var, m1 m1Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, m1Var);
        c0 c0Var = this.f810v;
        int F0 = F0(g1Var, c0Var, m1Var);
        if (c0Var.f1623b >= F0) {
            i = i < 0 ? -F0 : F0;
        }
        this.f806r.o(-i);
        this.D = this.f812x;
        c0Var.f1623b = 0;
        V0(g1Var, c0Var);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < K0()) != r3.f812x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f812x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // g1.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i4 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i4 == 0) {
            return null;
        }
        if (this.f808t == 0) {
            pointF.x = i4;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i4;
        return pointF;
    }

    @Override // g1.a1
    public final void a0(int i, int i4) {
        O0(i, i4, 8);
    }

    public final void a1(int i) {
        c0 c0Var = this.f810v;
        c0Var.f1625e = i;
        c0Var.d = this.f812x != (i == -1) ? -1 : 1;
    }

    @Override // g1.a1
    public final void b0(int i, int i4) {
        O0(i, i4, 2);
    }

    public final void b1(int i, m1 m1Var) {
        int i4;
        int i5;
        int i6;
        c0 c0Var = this.f810v;
        boolean z4 = false;
        c0Var.f1623b = 0;
        c0Var.f1624c = i;
        h0 h0Var = this.f1600e;
        if (h0Var == null || !h0Var.f1678e || (i6 = m1Var.f1720a) == -1) {
            i4 = 0;
            i5 = 0;
        } else {
            if (this.f812x == (i6 < i)) {
                i4 = this.f806r.l();
                i5 = 0;
            } else {
                i5 = this.f806r.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.f1598b;
        if (recyclerView == null || !recyclerView.f776m) {
            c0Var.f1627g = this.f806r.f() + i4;
            c0Var.f1626f = -i5;
        } else {
            c0Var.f1626f = this.f806r.k() - i5;
            c0Var.f1627g = this.f806r.g() + i4;
        }
        c0Var.h = false;
        c0Var.f1622a = true;
        if (this.f806r.i() == 0 && this.f806r.f() == 0) {
            z4 = true;
        }
        c0Var.i = z4;
    }

    @Override // g1.a1
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // g1.a1
    public final void c0(int i, int i4) {
        O0(i, i4, 4);
    }

    public final void c1(y1 y1Var, int i, int i4) {
        int i5 = y1Var.d;
        int i6 = y1Var.f1859e;
        if (i != -1) {
            int i7 = y1Var.f1858c;
            if (i7 == Integer.MIN_VALUE) {
                y1Var.a();
                i7 = y1Var.f1858c;
            }
            if (i7 - i5 >= i4) {
                this.f813y.set(i6, false);
                return;
            }
            return;
        }
        int i8 = y1Var.f1857b;
        if (i8 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) y1Var.f1860f).get(0);
            v1 v1Var = (v1) view.getLayoutParams();
            y1Var.f1857b = ((StaggeredGridLayoutManager) y1Var.f1861g).f806r.e(view);
            v1Var.getClass();
            i8 = y1Var.f1857b;
        }
        if (i8 + i5 <= i4) {
            this.f813y.set(i6, false);
        }
    }

    @Override // g1.a1
    public final boolean d() {
        return this.f808t == 0;
    }

    @Override // g1.a1
    public final void d0(g1 g1Var, m1 m1Var) {
        S0(g1Var, m1Var, true);
    }

    @Override // g1.a1
    public final boolean e() {
        return this.f808t == 1;
    }

    @Override // g1.a1
    public final void e0(m1 m1Var) {
        this.f814z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // g1.a1
    public final boolean f(b1 b1Var) {
        return b1Var instanceof v1;
    }

    @Override // g1.a1
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof x1) {
            x1 x1Var = (x1) parcelable;
            this.F = x1Var;
            if (this.f814z != -1) {
                x1Var.f1843f = -1;
                x1Var.f1844g = -1;
                x1Var.i = null;
                x1Var.h = 0;
                x1Var.f1845j = 0;
                x1Var.f1846k = null;
                x1Var.f1847l = null;
            }
            o0();
        }
    }

    @Override // g1.a1
    public final Parcelable g0() {
        int i;
        int k4;
        int[] iArr;
        x1 x1Var = this.F;
        if (x1Var != null) {
            x1 x1Var2 = new x1();
            x1Var2.h = x1Var.h;
            x1Var2.f1843f = x1Var.f1843f;
            x1Var2.f1844g = x1Var.f1844g;
            x1Var2.i = x1Var.i;
            x1Var2.f1845j = x1Var.f1845j;
            x1Var2.f1846k = x1Var.f1846k;
            x1Var2.f1848m = x1Var.f1848m;
            x1Var2.f1849n = x1Var.f1849n;
            x1Var2.f1850o = x1Var.f1850o;
            x1Var2.f1847l = x1Var.f1847l;
            return x1Var2;
        }
        x1 x1Var3 = new x1();
        x1Var3.f1848m = this.f811w;
        x1Var3.f1849n = this.D;
        x1Var3.f1850o = this.E;
        q qVar = this.B;
        if (qVar == null || (iArr = (int[]) qVar.f466g) == null) {
            x1Var3.f1845j = 0;
        } else {
            x1Var3.f1846k = iArr;
            x1Var3.f1845j = iArr.length;
            x1Var3.f1847l = (ArrayList) qVar.h;
        }
        if (v() <= 0) {
            x1Var3.f1843f = -1;
            x1Var3.f1844g = -1;
            x1Var3.h = 0;
            return x1Var3;
        }
        x1Var3.f1843f = this.D ? L0() : K0();
        View G0 = this.f812x ? G0(true) : H0(true);
        x1Var3.f1844g = G0 != null ? a1.G(G0) : -1;
        int i4 = this.f804p;
        x1Var3.h = i4;
        x1Var3.i = new int[i4];
        for (int i5 = 0; i5 < this.f804p; i5++) {
            if (this.D) {
                i = this.f805q[i5].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k4 = this.f806r.g();
                    i -= k4;
                    x1Var3.i[i5] = i;
                } else {
                    x1Var3.i[i5] = i;
                }
            } else {
                i = this.f805q[i5].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k4 = this.f806r.k();
                    i -= k4;
                    x1Var3.i[i5] = i;
                } else {
                    x1Var3.i[i5] = i;
                }
            }
        }
        return x1Var3;
    }

    @Override // g1.a1
    public final void h(int i, int i4, m1 m1Var, y yVar) {
        c0 c0Var;
        int g3;
        int i5;
        if (this.f808t != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, m1Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f804p) {
            this.J = new int[this.f804p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f804p;
            c0Var = this.f810v;
            if (i6 >= i8) {
                break;
            }
            if (c0Var.d == -1) {
                g3 = c0Var.f1626f;
                i5 = this.f805q[i6].i(g3);
            } else {
                g3 = this.f805q[i6].g(c0Var.f1627g);
                i5 = c0Var.f1627g;
            }
            int i9 = g3 - i5;
            if (i9 >= 0) {
                this.J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = c0Var.f1624c;
            if (i11 < 0 || i11 >= m1Var.b()) {
                return;
            }
            yVar.a(c0Var.f1624c, this.J[i10]);
            c0Var.f1624c += c0Var.d;
        }
    }

    @Override // g1.a1
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // g1.a1
    public final int j(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return b.a(m1Var, this.f806r, H0(z4), G0(z4), this, this.I);
    }

    @Override // g1.a1
    public final int k(m1 m1Var) {
        return E0(m1Var);
    }

    @Override // g1.a1
    public final int l(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return b.c(m1Var, this.f806r, H0(z4), G0(z4), this, this.I);
    }

    @Override // g1.a1
    public final int m(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return b.a(m1Var, this.f806r, H0(z4), G0(z4), this, this.I);
    }

    @Override // g1.a1
    public final int n(m1 m1Var) {
        return E0(m1Var);
    }

    @Override // g1.a1
    public final int o(m1 m1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z4 = !this.I;
        return b.c(m1Var, this.f806r, H0(z4), G0(z4), this, this.I);
    }

    @Override // g1.a1
    public final int p0(int i, g1 g1Var, m1 m1Var) {
        return Z0(i, g1Var, m1Var);
    }

    @Override // g1.a1
    public final void q0(int i) {
        x1 x1Var = this.F;
        if (x1Var != null && x1Var.f1843f != i) {
            x1Var.i = null;
            x1Var.h = 0;
            x1Var.f1843f = -1;
            x1Var.f1844g = -1;
        }
        this.f814z = i;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // g1.a1
    public final b1 r() {
        return this.f808t == 0 ? new v1(-2, -1) : new v1(-1, -2);
    }

    @Override // g1.a1
    public final int r0(int i, g1 g1Var, m1 m1Var) {
        return Z0(i, g1Var, m1Var);
    }

    @Override // g1.a1
    public final b1 s(Context context, AttributeSet attributeSet) {
        return new v1(context, attributeSet);
    }

    @Override // g1.a1
    public final b1 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new v1((ViewGroup.MarginLayoutParams) layoutParams) : new v1(layoutParams);
    }

    @Override // g1.a1
    public final void u0(Rect rect, int i, int i4) {
        int g3;
        int g5;
        int E = E() + D();
        int C = C() + F();
        int i5 = this.f808t;
        int i6 = this.f804p;
        if (i5 == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f1598b;
            WeakHashMap weakHashMap = p0.f2816a;
            g5 = a1.g(i4, height, recyclerView.getMinimumHeight());
            g3 = a1.g(i, (this.f809u * i6) + E, this.f1598b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f1598b;
            WeakHashMap weakHashMap2 = p0.f2816a;
            g3 = a1.g(i, width, recyclerView2.getMinimumWidth());
            g5 = a1.g(i4, (this.f809u * i6) + C, this.f1598b.getMinimumHeight());
        }
        this.f1598b.setMeasuredDimension(g3, g5);
    }

    @Override // g1.a1
    public final int x(g1 g1Var, m1 m1Var) {
        if (this.f808t == 1) {
            return Math.min(this.f804p, m1Var.b());
        }
        return -1;
    }
}
