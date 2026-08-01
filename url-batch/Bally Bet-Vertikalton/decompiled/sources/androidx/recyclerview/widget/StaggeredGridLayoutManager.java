package androidx.recyclerview.widget;

import B.j;
import K0.B;
import L.i;
import T.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.C0097m;
import f0.C0101q;
import f0.C0105v;
import f0.H;
import f0.I;
import f0.J;
import f0.O;
import f0.T;
import f0.U;
import f0.b0;
import f0.c0;
import f0.d0;
import f0.e0;
import f0.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import q1.d;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends I implements T {

    /* renamed from: B, reason: collision with root package name */
    public final j f1477B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1478C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1479D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1480E;
    public e0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1481G;

    /* renamed from: H, reason: collision with root package name */
    public final b0 f1482H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1483I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1484J;

    /* renamed from: K, reason: collision with root package name */
    public final B f1485K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1486p;

    /* renamed from: q, reason: collision with root package name */
    public final f0[] f1487q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1488r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1489s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1490t;

    /* renamed from: u, reason: collision with root package name */
    public int f1491u;

    /* renamed from: v, reason: collision with root package name */
    public final C0101q f1492v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1493w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1495y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1494x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1496z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1476A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1486p = -1;
        this.f1493w = false;
        j jVar = new j(12, false);
        this.f1477B = jVar;
        this.f1478C = 2;
        this.f1481G = new Rect();
        this.f1482H = new b0(this);
        this.f1483I = true;
        this.f1485K = new B(8, this);
        H I2 = I.I(context, attributeSet, i, i2);
        int i3 = I2.f1958a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1490t) {
            this.f1490t = i3;
            g gVar = this.f1488r;
            this.f1488r = this.f1489s;
            this.f1489s = gVar;
            l0();
        }
        int i4 = I2.f1959b;
        c(null);
        if (i4 != this.f1486p) {
            int[] iArr = (int[]) jVar.f30b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f31c = null;
            l0();
            this.f1486p = i4;
            this.f1495y = new BitSet(this.f1486p);
            this.f1487q = new f0[this.f1486p];
            for (int i5 = 0; i5 < this.f1486p; i5++) {
                this.f1487q[i5] = new f0(this, i5);
            }
            l0();
        }
        boolean z2 = I2.f1960c;
        c(null);
        e0 e0Var = this.F;
        if (e0Var != null && e0Var.h != z2) {
            e0Var.h = z2;
        }
        this.f1493w = z2;
        l0();
        C0101q c0101q = new C0101q();
        c0101q.f2146a = true;
        c0101q.f2150f = 0;
        c0101q.f2151g = 0;
        this.f1492v = c0101q;
        this.f1488r = g.a(this, this.f1490t);
        this.f1489s = g.a(this, 1 - this.f1490t);
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
            return this.f1494x ? 1 : -1;
        }
        return (i < K0()) != this.f1494x ? -1 : 1;
    }

    public final boolean B0() {
        int K02;
        if (v() != 0 && this.f1478C != 0 && this.f1966g) {
            if (this.f1494x) {
                K02 = L0();
                K0();
            } else {
                K02 = K0();
                L0();
            }
            j jVar = this.f1477B;
            if (K02 == 0 && P0() != null) {
                int[] iArr = (int[]) jVar.f30b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                jVar.f31c = null;
                this.f1965f = true;
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
        g gVar = this.f1488r;
        boolean z2 = !this.f1483I;
        return d.m(u2, gVar, H0(z2), G0(z2), this, this.f1483I);
    }

    public final int D0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1488r;
        boolean z2 = !this.f1483I;
        return d.n(u2, gVar, H0(z2), G0(z2), this, this.f1483I, this.f1494x);
    }

    public final int E0(U u2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1488r;
        boolean z2 = !this.f1483I;
        return d.o(u2, gVar, H0(z2), G0(z2), this, this.f1483I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int F0(O o2, C0101q c0101q, U u2) {
        f0 f0Var;
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
        this.f1495y.set(0, this.f1486p, true);
        C0101q c0101q2 = this.f1492v;
        int i8 = c0101q2.i ? c0101q.f2149e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0101q.f2149e == 1 ? c0101q.f2151g + c0101q.f2147b : c0101q.f2150f - c0101q.f2147b;
        int i9 = c0101q.f2149e;
        for (int i10 = 0; i10 < this.f1486p; i10++) {
            if (!this.f1487q[i10].f2070a.isEmpty()) {
                c1(this.f1487q[i10], i9, i8);
            }
        }
        int g2 = this.f1494x ? this.f1488r.g() : this.f1488r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0101q.f2148c;
            if (((i11 < 0 || i11 >= u2.b()) ? i6 : i7) == 0 || (!c0101q2.i && this.f1495y.isEmpty())) {
                break;
            }
            View view = o2.i(c0101q.f2148c, Long.MAX_VALUE).f2012a;
            c0101q.f2148c += c0101q.d;
            c0 c0Var = (c0) view.getLayoutParams();
            int b2 = c0Var.f1973a.b();
            j jVar = this.f1477B;
            int[] iArr = (int[]) jVar.f30b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (T0(c0101q.f2149e)) {
                    i5 = this.f1486p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1486p;
                    i5 = i6;
                }
                f0 f0Var2 = null;
                if (c0101q.f2149e == i7) {
                    int k3 = this.f1488r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        f0 f0Var3 = this.f1487q[i5];
                        int f2 = f0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            f0Var2 = f0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1488r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        f0 f0Var4 = this.f1487q[i5];
                        int h2 = f0Var4.h(g3);
                        if (h2 > i14) {
                            f0Var2 = f0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                f0Var = f0Var2;
                jVar.t(b2);
                ((int[]) jVar.f30b)[b2] = f0Var.f2073e;
            } else {
                f0Var = this.f1487q[i12];
            }
            c0Var.f2046e = f0Var;
            if (c0101q.f2149e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1490t == 1) {
                i = 1;
                R0(view, I.w(r6, this.f1491u, this.f1969l, r6, ((ViewGroup.MarginLayoutParams) c0Var).width), I.w(true, this.f1972o, this.f1970m, D() + G(), ((ViewGroup.MarginLayoutParams) c0Var).height));
            } else {
                i = 1;
                R0(view, I.w(true, this.f1971n, this.f1969l, F() + E(), ((ViewGroup.MarginLayoutParams) c0Var).width), I.w(false, this.f1491u, this.f1970m, 0, ((ViewGroup.MarginLayoutParams) c0Var).height));
            }
            if (c0101q.f2149e == i) {
                c2 = f0Var.f(g2);
                h = this.f1488r.c(view) + c2;
            } else {
                h = f0Var.h(g2);
                c2 = h - this.f1488r.c(view);
            }
            if (c0101q.f2149e == 1) {
                f0 f0Var5 = c0Var.f2046e;
                f0Var5.getClass();
                c0 c0Var2 = (c0) view.getLayoutParams();
                c0Var2.f2046e = f0Var5;
                ArrayList arrayList = f0Var5.f2070a;
                arrayList.add(view);
                f0Var5.f2072c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    f0Var5.f2071b = Integer.MIN_VALUE;
                }
                if (c0Var2.f1973a.i() || c0Var2.f1973a.l()) {
                    f0Var5.d = f0Var5.f2074f.f1488r.c(view) + f0Var5.d;
                }
            } else {
                f0 f0Var6 = c0Var.f2046e;
                f0Var6.getClass();
                c0 c0Var3 = (c0) view.getLayoutParams();
                c0Var3.f2046e = f0Var6;
                ArrayList arrayList2 = f0Var6.f2070a;
                arrayList2.add(0, view);
                f0Var6.f2071b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    f0Var6.f2072c = Integer.MIN_VALUE;
                }
                if (c0Var3.f1973a.i() || c0Var3.f1973a.l()) {
                    f0Var6.d = f0Var6.f2074f.f1488r.c(view) + f0Var6.d;
                }
            }
            if (Q0() && this.f1490t == 1) {
                c3 = this.f1489s.g() - (((this.f1486p - 1) - f0Var.f2073e) * this.f1491u);
                k2 = c3 - this.f1489s.c(view);
            } else {
                k2 = this.f1489s.k() + (f0Var.f2073e * this.f1491u);
                c3 = this.f1489s.c(view) + k2;
            }
            if (this.f1490t == 1) {
                I.N(view, k2, c2, c3, h);
            } else {
                I.N(view, c2, k2, h, c3);
            }
            c1(f0Var, c0101q2.f2149e, i8);
            V0(o2, c0101q2);
            if (c0101q2.h && view.hasFocusable()) {
                i2 = 0;
                this.f1495y.set(f0Var.f2073e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            V0(o2, c0101q2);
        }
        int k4 = c0101q2.f2149e == -1 ? this.f1488r.k() - N0(this.f1488r.k()) : M0(this.f1488r.g()) - this.f1488r.g();
        return k4 > 0 ? Math.min(c0101q.f2147b, k4) : i15;
    }

    public final View G0(boolean z2) {
        int k2 = this.f1488r.k();
        int g2 = this.f1488r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1488r.e(u2);
            int b2 = this.f1488r.b(u2);
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
        int k2 = this.f1488r.k();
        int g2 = this.f1488r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1488r.e(u2);
            if (this.f1488r.b(u2) > k2 && e2 < g2) {
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
        if (M02 != Integer.MIN_VALUE && (g2 = this.f1488r.g() - M02) > 0) {
            int i = g2 - (-Z0(-g2, o2, u2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1488r.p(i);
        }
    }

    @Override // f0.I
    public final int J(O o2, U u2) {
        return this.f1490t == 0 ? this.f1486p : super.J(o2, u2);
    }

    public final void J0(O o2, U u2, boolean z2) {
        int k2;
        int N02 = N0(Integer.MAX_VALUE);
        if (N02 != Integer.MAX_VALUE && (k2 = N02 - this.f1488r.k()) > 0) {
            int Z02 = k2 - Z0(k2, o2, u2);
            if (!z2 || Z02 <= 0) {
                return;
            }
            this.f1488r.p(-Z02);
        }
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return I.H(u(0));
    }

    @Override // f0.I
    public final boolean L() {
        return this.f1478C != 0;
    }

    public final int L0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return I.H(u(v2 - 1));
    }

    public final int M0(int i) {
        int f2 = this.f1487q[0].f(i);
        for (int i2 = 1; i2 < this.f1486p; i2++) {
            int f3 = this.f1487q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public final int N0(int i) {
        int h = this.f1487q[0].h(i);
        for (int i2 = 1; i2 < this.f1486p; i2++) {
            int h2 = this.f1487q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // f0.I
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1486p; i2++) {
            f0 f0Var = this.f1487q[i2];
            int i3 = f0Var.f2071b;
            if (i3 != Integer.MIN_VALUE) {
                f0Var.f2071b = i3 + i;
            }
            int i4 = f0Var.f2072c;
            if (i4 != Integer.MIN_VALUE) {
                f0Var.f2072c = i4 + i;
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
        int L02 = this.f1494x ? L0() : K0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1477B;
                iArr = (int[]) jVar.f30b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f31c;
                    if (arrayList != null) {
                        d0 d0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                d0 d0Var2 = (d0) ((ArrayList) jVar.f31c).get(size);
                                if (d0Var2.f2051a == i5) {
                                    d0Var = d0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (d0Var != null) {
                            ((ArrayList) jVar.f31c).remove(d0Var);
                        }
                        int size2 = ((ArrayList) jVar.f31c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((d0) ((ArrayList) jVar.f31c).get(i7)).f2051a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            d0 d0Var3 = (d0) ((ArrayList) jVar.f31c).get(i7);
                            ((ArrayList) jVar.f31c).remove(i7);
                            i6 = d0Var3.f2051a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f30b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f30b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f30b, i5, i6 + 1, -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    jVar.y(i, i2);
                } else if (i3 == 2) {
                    jVar.z(i, i2);
                } else if (i3 == 8) {
                    jVar.z(i, 1);
                    jVar.y(i2, 1);
                }
                if (i4 > L02) {
                    return;
                }
                if (i5 <= (this.f1494x ? K0() : L0())) {
                    l0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1477B;
        iArr = (int[]) jVar.f30b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f31c;
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

    @Override // f0.I
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1486p; i2++) {
            f0 f0Var = this.f1487q[i2];
            int i3 = f0Var.f2071b;
            if (i3 != Integer.MIN_VALUE) {
                f0Var.f2071b = i3 + i;
            }
            int i4 = f0Var.f2072c;
            if (i4 != Integer.MIN_VALUE) {
                f0Var.f2072c = i4 + i;
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
        BitSet bitSet = new BitSet(this.f1486p);
        bitSet.set(0, this.f1486p, true);
        char c2 = (this.f1490t == 1 && Q0()) ? (char) 1 : (char) 65535;
        if (this.f1494x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            c0 c0Var = (c0) u2.getLayoutParams();
            if (bitSet.get(c0Var.f2046e.f2073e)) {
                f0 f0Var = c0Var.f2046e;
                if (this.f1494x) {
                    int i3 = f0Var.f2072c;
                    if (i3 == Integer.MIN_VALUE) {
                        f0Var.a();
                        i3 = f0Var.f2072c;
                    }
                    if (i3 < this.f1488r.g()) {
                        ArrayList arrayList = f0Var.f2070a;
                        ((c0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(c0Var.f2046e.f2073e);
                } else {
                    int i4 = f0Var.f2071b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) f0Var.f2070a.get(0);
                        c0 c0Var2 = (c0) view.getLayoutParams();
                        f0Var.f2071b = f0Var.f2074f.f1488r.e(view);
                        c0Var2.getClass();
                        i4 = f0Var.f2071b;
                    }
                    if (i4 > this.f1488r.k()) {
                        ((c0) ((View) f0Var.f2070a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(c0Var.f2046e.f2073e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1494x) {
                    int b2 = this.f1488r.b(u2);
                    int b3 = this.f1488r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((c0Var.f2046e.f2073e - ((c0) u3.getLayoutParams()).f2046e.f2073e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1488r.e(u2);
                    int e3 = this.f1488r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((c0Var.f2046e.f2073e - ((c0) u3.getLayoutParams()).f2046e.f2073e >= 0) == (c2 >= 0)) {
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

    @Override // f0.I
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1962b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1485K);
        }
        for (int i = 0; i < this.f1486p; i++) {
            this.f1487q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f1962b;
        Rect rect = this.f1481G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        c0 c0Var = (c0) view.getLayoutParams();
        int d12 = d1(i, ((ViewGroup.MarginLayoutParams) c0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0Var).rightMargin + rect.right);
        int d13 = d1(i2, ((ViewGroup.MarginLayoutParams) c0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0Var).bottomMargin + rect.bottom);
        if (u0(view, d12, d13, c0Var)) {
            view.measure(d12, d13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004f, code lost:
    
        if (r8.f1490t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0054, code lost:
    
        if (r8.f1490t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0061, code lost:
    
        if (Q0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
    
        if (Q0() == false) goto L46;
     */
    @Override // f0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, O o2, U u2) {
        View A2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f1962b;
        if (recyclerView == null || (A2 = recyclerView.A(view)) == null || ((ArrayList) this.f1961a.d).contains(A2)) {
            A2 = null;
        }
        if (A2 == null) {
            return null;
        }
        Y0();
        if (i == 1) {
            if (this.f1490t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1490t != 1) {
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
        c0 c0Var = (c0) A2.getLayoutParams();
        c0Var.getClass();
        f0 f0Var = c0Var.f2046e;
        int L02 = i2 == 1 ? L0() : K0();
        b1(L02, u2);
        a1(i2);
        C0101q c0101q = this.f1492v;
        c0101q.f2148c = c0101q.d + L02;
        c0101q.f2147b = (int) (this.f1488r.l() * 0.33333334f);
        c0101q.h = true;
        c0101q.f2146a = false;
        F0(o2, c0101q, u2);
        this.f1479D = this.f1494x;
        View g2 = f0Var.g(L02, i2);
        if (g2 != null && g2 != A2) {
            return g2;
        }
        if (T0(i2)) {
            for (int i3 = this.f1486p - 1; i3 >= 0; i3--) {
                View g3 = this.f1487q[i3].g(L02, i2);
                if (g3 != null && g3 != A2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1486p; i4++) {
                View g4 = this.f1487q[i4].g(L02, i2);
                if (g4 != null && g4 != A2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1493w ^ true) == (i2 == -1);
        View q2 = q(z2 ? f0Var.c() : f0Var.d());
        if (q2 != null && q2 != A2) {
            return q2;
        }
        if (T0(i2)) {
            for (int i5 = this.f1486p - 1; i5 >= 0; i5--) {
                if (i5 != f0Var.f2073e) {
                    View q3 = q(z2 ? this.f1487q[i5].c() : this.f1487q[i5].d());
                    if (q3 != null && q3 != A2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1486p; i6++) {
                View q4 = q(z2 ? this.f1487q[i6].c() : this.f1487q[i6].d());
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
        e0 e0Var;
        int i;
        int i2;
        e0 e0Var2 = this.F;
        b0 b0Var = this.f1482H;
        if (!(e0Var2 == null && this.f1496z == -1) && u2.b() == 0) {
            g0(o2);
            b0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (b0Var.f2040e && this.f1496z == -1 && this.F == null) ? false : true;
        j jVar = this.f1477B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = b0Var.f2042g;
        if (z4) {
            b0Var.a();
            e0 e0Var3 = this.F;
            if (e0Var3 != null) {
                int i3 = e0Var3.f2061c;
                if (i3 > 0) {
                    if (i3 == this.f1486p) {
                        for (int i4 = 0; i4 < this.f1486p; i4++) {
                            this.f1487q[i4].b();
                            e0 e0Var4 = this.F;
                            int i5 = e0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += e0Var4.i ? this.f1488r.g() : this.f1488r.k();
                            }
                            f0 f0Var = this.f1487q[i4];
                            f0Var.f2071b = i5;
                            f0Var.f2072c = i5;
                        }
                    } else {
                        e0Var3.d = null;
                        e0Var3.f2061c = 0;
                        e0Var3.f2062e = 0;
                        e0Var3.f2063f = null;
                        e0Var3.f2064g = null;
                        e0Var3.f2059a = e0Var3.f2060b;
                    }
                }
                e0 e0Var5 = this.F;
                this.f1480E = e0Var5.f2065j;
                boolean z5 = e0Var5.h;
                c(null);
                e0 e0Var6 = this.F;
                if (e0Var6 != null && e0Var6.h != z5) {
                    e0Var6.h = z5;
                }
                this.f1493w = z5;
                l0();
                Y0();
                e0 e0Var7 = this.F;
                int i6 = e0Var7.f2059a;
                if (i6 != -1) {
                    this.f1496z = i6;
                    b0Var.f2039c = e0Var7.i;
                } else {
                    b0Var.f2039c = this.f1494x;
                }
                if (e0Var7.f2062e > 1) {
                    jVar.f30b = e0Var7.f2063f;
                    jVar.f31c = e0Var7.f2064g;
                }
            } else {
                Y0();
                b0Var.f2039c = this.f1494x;
            }
            if (!u2.f1999g && (i2 = this.f1496z) != -1) {
                if (i2 < 0 || i2 >= u2.b()) {
                    this.f1496z = -1;
                    this.f1476A = Integer.MIN_VALUE;
                } else {
                    e0 e0Var8 = this.F;
                    if (e0Var8 == null || e0Var8.f2059a == -1 || e0Var8.f2061c < 1) {
                        View q2 = q(this.f1496z);
                        if (q2 != null) {
                            b0Var.f2037a = this.f1494x ? L0() : K0();
                            if (this.f1476A != Integer.MIN_VALUE) {
                                if (b0Var.f2039c) {
                                    b0Var.f2038b = (this.f1488r.g() - this.f1476A) - this.f1488r.b(q2);
                                } else {
                                    b0Var.f2038b = (this.f1488r.k() + this.f1476A) - this.f1488r.e(q2);
                                }
                            } else if (this.f1488r.c(q2) > this.f1488r.l()) {
                                b0Var.f2038b = b0Var.f2039c ? this.f1488r.g() : this.f1488r.k();
                            } else {
                                int e2 = this.f1488r.e(q2) - this.f1488r.k();
                                if (e2 < 0) {
                                    b0Var.f2038b = -e2;
                                } else {
                                    int g2 = this.f1488r.g() - this.f1488r.b(q2);
                                    if (g2 < 0) {
                                        b0Var.f2038b = g2;
                                    } else {
                                        b0Var.f2038b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1496z;
                            b0Var.f2037a = i7;
                            int i8 = this.f1476A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = A0(i7) == 1;
                                b0Var.f2039c = z6;
                                b0Var.f2038b = z6 ? staggeredGridLayoutManager.f1488r.g() : staggeredGridLayoutManager.f1488r.k();
                            } else if (b0Var.f2039c) {
                                b0Var.f2038b = staggeredGridLayoutManager.f1488r.g() - i8;
                            } else {
                                b0Var.f2038b = staggeredGridLayoutManager.f1488r.k() + i8;
                            }
                            b0Var.d = true;
                        }
                    } else {
                        b0Var.f2038b = Integer.MIN_VALUE;
                        b0Var.f2037a = this.f1496z;
                    }
                    b0Var.f2040e = true;
                }
            }
            if (this.f1479D) {
                int b2 = u2.b();
                for (int v2 = v() - 1; v2 >= 0; v2--) {
                    i = I.H(u(v2));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                b0Var.f2037a = i;
                b0Var.f2038b = Integer.MIN_VALUE;
                b0Var.f2040e = true;
            } else {
                int b3 = u2.b();
                int v3 = v();
                for (int i9 = 0; i9 < v3; i9++) {
                    int H2 = I.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                b0Var.f2037a = i;
                b0Var.f2038b = Integer.MIN_VALUE;
                b0Var.f2040e = true;
            }
        }
        if (this.F == null && this.f1496z == -1 && (b0Var.f2039c != this.f1479D || Q0() != this.f1480E)) {
            int[] iArr = (int[]) jVar.f30b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            jVar.f31c = null;
            b0Var.d = true;
        }
        if (v() > 0 && ((e0Var = this.F) == null || e0Var.f2061c < 1)) {
            if (b0Var.d) {
                for (int i10 = 0; i10 < this.f1486p; i10++) {
                    this.f1487q[i10].b();
                    int i11 = b0Var.f2038b;
                    if (i11 != Integer.MIN_VALUE) {
                        f0 f0Var2 = this.f1487q[i10];
                        f0Var2.f2071b = i11;
                        f0Var2.f2072c = i11;
                    }
                }
            } else if (z4 || b0Var.f2041f == null) {
                for (int i12 = 0; i12 < this.f1486p; i12++) {
                    f0 f0Var3 = this.f1487q[i12];
                    boolean z7 = this.f1494x;
                    int i13 = b0Var.f2038b;
                    int f2 = z7 ? f0Var3.f(Integer.MIN_VALUE) : f0Var3.h(Integer.MIN_VALUE);
                    f0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = f0Var3.f2074f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1488r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1488r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            f0Var3.f2072c = f2;
                            f0Var3.f2071b = f2;
                        }
                    }
                }
                f0[] f0VarArr = this.f1487q;
                int length = f0VarArr.length;
                int[] iArr2 = b0Var.f2041f;
                if (iArr2 == null || iArr2.length < length) {
                    b0Var.f2041f = new int[staggeredGridLayoutManager.f1487q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    b0Var.f2041f[i14] = f0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1486p; i15++) {
                    f0 f0Var4 = this.f1487q[i15];
                    f0Var4.b();
                    int i16 = b0Var.f2041f[i15];
                    f0Var4.f2071b = i16;
                    f0Var4.f2072c = i16;
                }
            }
        }
        p(o2);
        C0101q c0101q = this.f1492v;
        c0101q.f2146a = false;
        int l2 = this.f1489s.l();
        this.f1491u = l2 / this.f1486p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1489s.i());
        b1(b0Var.f2037a, u2);
        if (b0Var.f2039c) {
            a1(-1);
            F0(o2, c0101q, u2);
            a1(1);
            c0101q.f2148c = b0Var.f2037a + c0101q.d;
            F0(o2, c0101q, u2);
        } else {
            a1(1);
            F0(o2, c0101q, u2);
            a1(-1);
            c0101q.f2148c = b0Var.f2037a + c0101q.d;
            F0(o2, c0101q, u2);
        }
        if (this.f1489s.i() != 1073741824) {
            int v4 = v();
            float f3 = 0.0f;
            for (int i17 = 0; i17 < v4; i17++) {
                View u3 = u(i17);
                float c2 = this.f1489s.c(u3);
                if (c2 >= f3) {
                    ((c0) u3.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1491u;
            int round = Math.round(f3 * this.f1486p);
            if (this.f1489s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1489s.l());
            }
            this.f1491u = round / this.f1486p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1489s.i());
            if (this.f1491u != i18) {
                for (int i19 = 0; i19 < v4; i19++) {
                    View u4 = u(i19);
                    c0 c0Var = (c0) u4.getLayoutParams();
                    c0Var.getClass();
                    if (Q0() && this.f1490t == 1) {
                        int i20 = -((this.f1486p - 1) - c0Var.f2046e.f2073e);
                        u4.offsetLeftAndRight((this.f1491u * i20) - (i20 * i18));
                    } else {
                        int i21 = c0Var.f2046e.f2073e;
                        int i22 = this.f1491u * i21;
                        int i23 = i21 * i18;
                        if (this.f1490t == 1) {
                            u4.offsetLeftAndRight(i22 - i23);
                        } else {
                            u4.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1494x) {
                I0(o2, u2, true);
                J0(o2, u2, false);
            } else {
                J0(o2, u2, true);
                I0(o2, u2, false);
            }
        }
        if (z2 && !u2.f1999g && this.f1478C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.f1962b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1485K);
            }
        }
        z3 = false;
        if (u2.f1999g) {
            b0Var.a();
        }
        this.f1479D = b0Var.f2039c;
        this.f1480E = Q0();
        if (z3) {
            b0Var.a();
            S0(o2, u2, false);
        }
    }

    @Override // f0.I
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View H02 = H0(false);
            View G02 = G0(false);
            if (H02 == null || G02 == null) {
                return;
            }
            int H2 = I.H(H02);
            int H3 = I.H(G02);
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
        if (this.f1490t == 0) {
            return (i == -1) != this.f1494x;
        }
        return ((i == -1) == this.f1494x) == Q0();
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
        C0101q c0101q = this.f1492v;
        c0101q.f2146a = true;
        b1(K02, u2);
        a1(i2);
        c0101q.f2148c = K02 + c0101q.d;
        c0101q.f2147b = Math.abs(i);
    }

    @Override // f0.I
    public final void V(O o2, U u2, View view, L.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c0)) {
            U(view, jVar);
            return;
        }
        c0 c0Var = (c0) layoutParams;
        if (this.f1490t == 0) {
            f0 f0Var = c0Var.f2046e;
            jVar.h(i.a(false, f0Var == null ? -1 : f0Var.f2073e, 1, -1, -1));
        } else {
            f0 f0Var2 = c0Var.f2046e;
            jVar.h(i.a(false, -1, -1, f0Var2 == null ? -1 : f0Var2.f2073e, 1));
        }
    }

    public final void V0(O o2, C0101q c0101q) {
        if (!c0101q.f2146a || c0101q.i) {
            return;
        }
        if (c0101q.f2147b == 0) {
            if (c0101q.f2149e == -1) {
                W0(o2, c0101q.f2151g);
                return;
            } else {
                X0(o2, c0101q.f2150f);
                return;
            }
        }
        int i = 1;
        if (c0101q.f2149e == -1) {
            int i2 = c0101q.f2150f;
            int h = this.f1487q[0].h(i2);
            while (i < this.f1486p) {
                int h2 = this.f1487q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            W0(o2, i3 < 0 ? c0101q.f2151g : c0101q.f2151g - Math.min(i3, c0101q.f2147b));
            return;
        }
        int i4 = c0101q.f2151g;
        int f2 = this.f1487q[0].f(i4);
        while (i < this.f1486p) {
            int f3 = this.f1487q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - c0101q.f2151g;
        X0(o2, i5 < 0 ? c0101q.f2150f : Math.min(i5, c0101q.f2147b) + c0101q.f2150f);
    }

    @Override // f0.I
    public final void W(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void W0(O o2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1488r.e(u2) < i || this.f1488r.o(u2) < i) {
                return;
            }
            c0 c0Var = (c0) u2.getLayoutParams();
            c0Var.getClass();
            if (c0Var.f2046e.f2070a.size() == 1) {
                return;
            }
            f0 f0Var = c0Var.f2046e;
            ArrayList arrayList = f0Var.f2070a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            c0 c0Var2 = (c0) view.getLayoutParams();
            c0Var2.f2046e = null;
            if (c0Var2.f1973a.i() || c0Var2.f1973a.l()) {
                f0Var.d -= f0Var.f2074f.f1488r.c(view);
            }
            if (size == 1) {
                f0Var.f2071b = Integer.MIN_VALUE;
            }
            f0Var.f2072c = Integer.MIN_VALUE;
            i0(u2, o2);
        }
    }

    @Override // f0.I
    public final void X() {
        j jVar = this.f1477B;
        int[] iArr = (int[]) jVar.f30b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        jVar.f31c = null;
        l0();
    }

    public final void X0(O o2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1488r.b(u2) > i || this.f1488r.n(u2) > i) {
                return;
            }
            c0 c0Var = (c0) u2.getLayoutParams();
            c0Var.getClass();
            if (c0Var.f2046e.f2070a.size() == 1) {
                return;
            }
            f0 f0Var = c0Var.f2046e;
            ArrayList arrayList = f0Var.f2070a;
            View view = (View) arrayList.remove(0);
            c0 c0Var2 = (c0) view.getLayoutParams();
            c0Var2.f2046e = null;
            if (arrayList.size() == 0) {
                f0Var.f2072c = Integer.MIN_VALUE;
            }
            if (c0Var2.f1973a.i() || c0Var2.f1973a.l()) {
                f0Var.d -= f0Var.f2074f.f1488r.c(view);
            }
            f0Var.f2071b = Integer.MIN_VALUE;
            i0(u2, o2);
        }
    }

    @Override // f0.I
    public final void Y(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void Y0() {
        if (this.f1490t == 1 || !Q0()) {
            this.f1494x = this.f1493w;
        } else {
            this.f1494x = !this.f1493w;
        }
    }

    @Override // f0.I
    public final void Z(int i, int i2) {
        O0(i, i2, 2);
    }

    public final int Z0(int i, O o2, U u2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, u2);
        C0101q c0101q = this.f1492v;
        int F02 = F0(o2, c0101q, u2);
        if (c0101q.f2147b >= F02) {
            i = i < 0 ? -F02 : F02;
        }
        this.f1488r.p(-i);
        this.f1479D = this.f1494x;
        c0101q.f2147b = 0;
        V0(o2, c0101q);
        return i;
    }

    @Override // f0.T
    public final PointF a(int i) {
        int A02 = A0(i);
        PointF pointF = new PointF();
        if (A02 == 0) {
            return null;
        }
        if (this.f1490t == 0) {
            pointF.x = A02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = A02;
        }
        return pointF;
    }

    @Override // f0.I
    public final void a0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void a1(int i) {
        C0101q c0101q = this.f1492v;
        c0101q.f2149e = i;
        c0101q.d = this.f1494x != (i == -1) ? -1 : 1;
    }

    @Override // f0.I
    public final void b0(O o2, U u2) {
        S0(o2, u2, true);
    }

    public final void b1(int i, U u2) {
        int i2;
        int i3;
        int i4;
        C0101q c0101q = this.f1492v;
        boolean z2 = false;
        c0101q.f2147b = 0;
        c0101q.f2148c = i;
        C0105v c0105v = this.f1964e;
        if (!(c0105v != null && c0105v.f2174e) || (i4 = u2.f1994a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1494x == (i4 < i)) {
                i2 = this.f1488r.l();
                i3 = 0;
            } else {
                i3 = this.f1488r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f1962b;
        if (recyclerView == null || !recyclerView.f1447g) {
            c0101q.f2151g = this.f1488r.f() + i2;
            c0101q.f2150f = -i3;
        } else {
            c0101q.f2150f = this.f1488r.k() - i3;
            c0101q.f2151g = this.f1488r.g() + i2;
        }
        c0101q.h = false;
        c0101q.f2146a = true;
        if (this.f1488r.i() == 0 && this.f1488r.f() == 0) {
            z2 = true;
        }
        c0101q.i = z2;
    }

    @Override // f0.I
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // f0.I
    public final void c0(U u2) {
        this.f1496z = -1;
        this.f1476A = Integer.MIN_VALUE;
        this.F = null;
        this.f1482H.a();
    }

    public final void c1(f0 f0Var, int i, int i2) {
        int i3 = f0Var.d;
        int i4 = f0Var.f2073e;
        if (i != -1) {
            int i5 = f0Var.f2072c;
            if (i5 == Integer.MIN_VALUE) {
                f0Var.a();
                i5 = f0Var.f2072c;
            }
            if (i5 - i3 >= i2) {
                this.f1495y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = f0Var.f2071b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) f0Var.f2070a.get(0);
            c0 c0Var = (c0) view.getLayoutParams();
            f0Var.f2071b = f0Var.f2074f.f1488r.e(view);
            c0Var.getClass();
            i6 = f0Var.f2071b;
        }
        if (i6 + i3 <= i2) {
            this.f1495y.set(i4, false);
        }
    }

    @Override // f0.I
    public final boolean d() {
        return this.f1490t == 0;
    }

    @Override // f0.I
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof e0) {
            this.F = (e0) parcelable;
            l0();
        }
    }

    @Override // f0.I
    public final boolean e() {
        return this.f1490t == 1;
    }

    @Override // f0.I
    public final Parcelable e0() {
        int h;
        int k2;
        int[] iArr;
        e0 e0Var = this.F;
        if (e0Var != null) {
            e0 e0Var2 = new e0();
            e0Var2.f2061c = e0Var.f2061c;
            e0Var2.f2059a = e0Var.f2059a;
            e0Var2.f2060b = e0Var.f2060b;
            e0Var2.d = e0Var.d;
            e0Var2.f2062e = e0Var.f2062e;
            e0Var2.f2063f = e0Var.f2063f;
            e0Var2.h = e0Var.h;
            e0Var2.i = e0Var.i;
            e0Var2.f2065j = e0Var.f2065j;
            e0Var2.f2064g = e0Var.f2064g;
            return e0Var2;
        }
        e0 e0Var3 = new e0();
        e0Var3.h = this.f1493w;
        e0Var3.i = this.f1479D;
        e0Var3.f2065j = this.f1480E;
        j jVar = this.f1477B;
        if (jVar == null || (iArr = (int[]) jVar.f30b) == null) {
            e0Var3.f2062e = 0;
        } else {
            e0Var3.f2063f = iArr;
            e0Var3.f2062e = iArr.length;
            e0Var3.f2064g = (ArrayList) jVar.f31c;
        }
        if (v() > 0) {
            e0Var3.f2059a = this.f1479D ? L0() : K0();
            View G02 = this.f1494x ? G0(true) : H0(true);
            e0Var3.f2060b = G02 != null ? I.H(G02) : -1;
            int i = this.f1486p;
            e0Var3.f2061c = i;
            e0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1486p; i2++) {
                if (this.f1479D) {
                    h = this.f1487q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1488r.g();
                        h -= k2;
                        e0Var3.d[i2] = h;
                    } else {
                        e0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f1487q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1488r.k();
                        h -= k2;
                        e0Var3.d[i2] = h;
                    } else {
                        e0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            e0Var3.f2059a = -1;
            e0Var3.f2060b = -1;
            e0Var3.f2061c = 0;
        }
        return e0Var3;
    }

    @Override // f0.I
    public final boolean f(J j2) {
        return j2 instanceof c0;
    }

    @Override // f0.I
    public final void f0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // f0.I
    public final void h(int i, int i2, U u2, C0097m c0097m) {
        C0101q c0101q;
        int f2;
        int i3;
        if (this.f1490t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, u2);
        int[] iArr = this.f1484J;
        if (iArr == null || iArr.length < this.f1486p) {
            this.f1484J = new int[this.f1486p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1486p;
            c0101q = this.f1492v;
            if (i4 >= i6) {
                break;
            }
            if (c0101q.d == -1) {
                f2 = c0101q.f2150f;
                i3 = this.f1487q[i4].h(f2);
            } else {
                f2 = this.f1487q[i4].f(c0101q.f2151g);
                i3 = c0101q.f2151g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1484J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1484J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0101q.f2148c;
            if (i9 < 0 || i9 >= u2.b()) {
                return;
            }
            c0097m.a(c0101q.f2148c, this.f1484J[i8]);
            c0101q.f2148c += c0101q.d;
        }
    }

    @Override // f0.I
    public final int j(U u2) {
        return C0(u2);
    }

    @Override // f0.I
    public final int k(U u2) {
        return D0(u2);
    }

    @Override // f0.I
    public final int l(U u2) {
        return E0(u2);
    }

    @Override // f0.I
    public final int m(U u2) {
        return C0(u2);
    }

    @Override // f0.I
    public final int m0(int i, O o2, U u2) {
        return Z0(i, o2, u2);
    }

    @Override // f0.I
    public final int n(U u2) {
        return D0(u2);
    }

    @Override // f0.I
    public final void n0(int i) {
        e0 e0Var = this.F;
        if (e0Var != null && e0Var.f2059a != i) {
            e0Var.d = null;
            e0Var.f2061c = 0;
            e0Var.f2059a = -1;
            e0Var.f2060b = -1;
        }
        this.f1496z = i;
        this.f1476A = Integer.MIN_VALUE;
        l0();
    }

    @Override // f0.I
    public final int o(U u2) {
        return E0(u2);
    }

    @Override // f0.I
    public final int o0(int i, O o2, U u2) {
        return Z0(i, o2, u2);
    }

    @Override // f0.I
    public final J r() {
        return this.f1490t == 0 ? new c0(-2, -1) : new c0(-1, -2);
    }

    @Override // f0.I
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1486p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1490t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f1962b;
            WeakHashMap weakHashMap = K.T.f381a;
            g3 = I.g(i2, height, recyclerView.getMinimumHeight());
            g2 = I.g(i, (this.f1491u * i3) + F, this.f1962b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f1962b;
            WeakHashMap weakHashMap2 = K.T.f381a;
            g2 = I.g(i, width, recyclerView2.getMinimumWidth());
            g3 = I.g(i2, (this.f1491u * i3) + D2, this.f1962b.getMinimumHeight());
        }
        this.f1962b.setMeasuredDimension(g2, g3);
    }

    @Override // f0.I
    public final J s(Context context, AttributeSet attributeSet) {
        return new c0(context, attributeSet);
    }

    @Override // f0.I
    public final J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c0((ViewGroup.MarginLayoutParams) layoutParams) : new c0(layoutParams);
    }

    @Override // f0.I
    public final int x(O o2, U u2) {
        return this.f1490t == 1 ? this.f1486p : super.x(o2, u2);
    }

    @Override // f0.I
    public final void x0(RecyclerView recyclerView, int i) {
        C0105v c0105v = new C0105v(recyclerView.getContext());
        c0105v.f2171a = i;
        y0(c0105v);
    }

    @Override // f0.I
    public final boolean z0() {
        return this.F == null;
    }
}
