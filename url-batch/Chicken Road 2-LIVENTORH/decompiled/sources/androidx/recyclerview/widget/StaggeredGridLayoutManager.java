package androidx.recyclerview.widget;

import a.y;
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
import f1.f1;
import f1.g1;
import f1.h1;
import f1.i1;
import f1.j1;
import f1.l0;
import f1.m0;
import f1.n;
import f1.n0;
import f1.r;
import f1.s0;
import f1.w;
import f1.x0;
import f1.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends m0 implements x0 {
    public final q B;
    public final int C;
    public boolean D;
    public boolean E;
    public i1 F;
    public final Rect G;
    public final f1 H;
    public final boolean I;
    public int[] J;
    public final g K;

    /* renamed from: p, reason: collision with root package name */
    public final int f703p;

    /* renamed from: q, reason: collision with root package name */
    public final j1[] f704q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.emoji2.text.g f705r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.emoji2.text.g f706s;

    /* renamed from: t, reason: collision with root package name */
    public final int f707t;

    /* renamed from: u, reason: collision with root package name */
    public int f708u;

    /* renamed from: v, reason: collision with root package name */
    public final r f709v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f710w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f712y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f711x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f713z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f703p = -1;
        this.f710w = false;
        q qVar = new q(8, false);
        this.B = qVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new f1(this);
        this.I = true;
        this.K = new g(4, this);
        l0 I = m0.I(context, attributeSet, i, i4);
        int i5 = I.f1414a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i5 != this.f707t) {
            this.f707t = i5;
            androidx.emoji2.text.g gVar = this.f705r;
            this.f705r = this.f706s;
            this.f706s = gVar;
            m0();
        }
        int i6 = I.f1415b;
        c(null);
        if (i6 != this.f703p) {
            qVar.b();
            m0();
            this.f703p = i6;
            this.f712y = new BitSet(this.f703p);
            this.f704q = new j1[this.f703p];
            for (int i7 = 0; i7 < this.f703p; i7++) {
                this.f704q[i7] = new j1(this, i7);
            }
            m0();
        }
        boolean z3 = I.f1416c;
        c(null);
        i1 i1Var = this.F;
        if (i1Var != null && i1Var.f1384m != z3) {
            i1Var.f1384m = z3;
        }
        this.f710w = z3;
        m0();
        r rVar = new r();
        rVar.f1477a = true;
        rVar.f1481f = 0;
        rVar.f1482g = 0;
        this.f709v = rVar;
        this.f705r = androidx.emoji2.text.g.a(this, this.f707t);
        this.f706s = androidx.emoji2.text.g.a(this, 1 - this.f707t);
    }

    public static int b1(int i, int i4, int i5) {
        int mode;
        return (!(i4 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i5), mode) : i;
    }

    @Override // f1.m0
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int I0;
        if (v() != 0 && this.C != 0 && this.f1449g) {
            if (this.f711x) {
                I0 = J0();
                I0();
            } else {
                I0 = I0();
                J0();
            }
            if (I0 == 0 && N0() != null) {
                this.B.b();
                this.f1448f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return y.l(y0Var, this.f705r, F0(z3), E0(z3), this, this.I, this.f711x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0267, code lost:
    
        T0(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D0(s0 s0Var, r rVar, y0 y0Var) {
        j1 j1Var;
        ?? r8;
        int i;
        int c4;
        int k4;
        int c5;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.f712y.set(0, this.f703p, true);
        r rVar2 = this.f709v;
        int i9 = rVar2.i ? rVar.f1480e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f1480e == 1 ? rVar.f1482g + rVar.f1478b : rVar.f1481f - rVar.f1478b;
        int i10 = rVar.f1480e;
        for (int i11 = 0; i11 < this.f703p; i11++) {
            if (!((ArrayList) this.f704q[i11].f1403f).isEmpty()) {
                a1(this.f704q[i11], i10, i9);
            }
        }
        int g4 = this.f711x ? this.f705r.g() : this.f705r.k();
        boolean z3 = false;
        while (true) {
            int i12 = rVar.f1479c;
            if (i12 < 0 || i12 >= y0Var.b() || (!rVar2.i && this.f712y.isEmpty())) {
                break;
            }
            View d = s0Var.d(rVar.f1479c);
            rVar.f1479c += rVar.d;
            g1 g1Var = (g1) d.getLayoutParams();
            int b4 = g1Var.f1460a.b();
            q qVar = this.B;
            int[] iArr = (int[]) qVar.f346g;
            int i13 = (iArr == null || b4 >= iArr.length) ? -1 : iArr[b4];
            if (i13 == -1) {
                if (R0(rVar.f1480e)) {
                    i6 = this.f703p - i8;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = this.f703p;
                    i6 = i7;
                }
                j1 j1Var2 = null;
                if (rVar.f1480e == i8) {
                    int k5 = this.f705r.k();
                    int i14 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        j1 j1Var3 = this.f704q[i6];
                        int g5 = j1Var3.g(k5);
                        if (g5 < i14) {
                            i14 = g5;
                            j1Var2 = j1Var3;
                        }
                        i6 += i4;
                    }
                } else {
                    int g6 = this.f705r.g();
                    int i15 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        j1 j1Var4 = this.f704q[i6];
                        int i16 = j1Var4.i(g6);
                        if (i16 > i15) {
                            j1Var2 = j1Var4;
                            i15 = i16;
                        }
                        i6 += i4;
                    }
                }
                j1Var = j1Var2;
                qVar.s(b4);
                ((int[]) qVar.f346g)[b4] = j1Var.f1402e;
            } else {
                j1Var = this.f704q[i13];
            }
            g1Var.f1358e = j1Var;
            if (rVar.f1480e == 1) {
                r8 = 0;
                b(d, -1, false);
            } else {
                r8 = 0;
                b(d, 0, false);
            }
            if (this.f707t == 1) {
                P0(d, m0.w(r8, this.f708u, this.f1453l, r8, ((ViewGroup.MarginLayoutParams) g1Var).width), m0.w(true, this.f1456o, this.f1454m, D() + G(), ((ViewGroup.MarginLayoutParams) g1Var).height));
            } else {
                P0(d, m0.w(true, this.f1455n, this.f1453l, F() + E(), ((ViewGroup.MarginLayoutParams) g1Var).width), m0.w(false, this.f708u, this.f1454m, 0, ((ViewGroup.MarginLayoutParams) g1Var).height));
            }
            if (rVar.f1480e == 1) {
                c4 = j1Var.g(g4);
                i = this.f705r.c(d) + c4;
            } else {
                i = j1Var.i(g4);
                c4 = i - this.f705r.c(d);
            }
            if (rVar.f1480e == 1) {
                j1 j1Var5 = g1Var.f1358e;
                j1Var5.getClass();
                g1 g1Var2 = (g1) d.getLayoutParams();
                g1Var2.f1358e = j1Var5;
                ArrayList arrayList = (ArrayList) j1Var5.f1403f;
                arrayList.add(d);
                j1Var5.f1401c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    j1Var5.f1400b = Integer.MIN_VALUE;
                }
                if (g1Var2.f1460a.h() || g1Var2.f1460a.k()) {
                    j1Var5.d = ((StaggeredGridLayoutManager) j1Var5.f1404g).f705r.c(d) + j1Var5.d;
                }
            } else {
                j1 j1Var6 = g1Var.f1358e;
                j1Var6.getClass();
                g1 g1Var3 = (g1) d.getLayoutParams();
                g1Var3.f1358e = j1Var6;
                ArrayList arrayList2 = (ArrayList) j1Var6.f1403f;
                arrayList2.add(0, d);
                j1Var6.f1400b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    j1Var6.f1401c = Integer.MIN_VALUE;
                }
                if (g1Var3.f1460a.h() || g1Var3.f1460a.k()) {
                    j1Var6.d = ((StaggeredGridLayoutManager) j1Var6.f1404g).f705r.c(d) + j1Var6.d;
                }
            }
            if (O0() && this.f707t == 1) {
                c5 = this.f706s.g() - (((this.f703p - 1) - j1Var.f1402e) * this.f708u);
                k4 = c5 - this.f706s.c(d);
            } else {
                k4 = this.f706s.k() + (j1Var.f1402e * this.f708u);
                c5 = this.f706s.c(d) + k4;
            }
            if (this.f707t == 1) {
                m0.N(d, k4, c4, c5, i);
            } else {
                m0.N(d, c4, k4, i, c5);
            }
            a1(j1Var, rVar2.f1480e, i9);
            T0(s0Var, rVar2);
            if (rVar2.f1483h && d.hasFocusable()) {
                this.f712y.set(j1Var.f1402e, false);
            }
            i8 = 1;
            z3 = true;
            i7 = 0;
        }
        int k6 = rVar2.f1480e == -1 ? this.f705r.k() - L0(this.f705r.k()) : K0(this.f705r.g()) - this.f705r.g();
        if (k6 > 0) {
            return Math.min(rVar.f1478b, k6);
        }
        return 0;
    }

    public final View E0(boolean z3) {
        int k4 = this.f705r.k();
        int g4 = this.f705r.g();
        View view = null;
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            int e4 = this.f705r.e(u3);
            int b4 = this.f705r.b(u3);
            if (b4 > k4 && e4 < g4) {
                if (b4 <= g4 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z3) {
        int k4 = this.f705r.k();
        int g4 = this.f705r.g();
        int v3 = v();
        View view = null;
        for (int i = 0; i < v3; i++) {
            View u3 = u(i);
            int e4 = this.f705r.e(u3);
            if (this.f705r.b(u3) > k4 && e4 < g4) {
                if (e4 >= k4 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final void G0(s0 s0Var, y0 y0Var, boolean z3) {
        int g4;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g4 = this.f705r.g() - K0) > 0) {
            int i = g4 - (-X0(-g4, s0Var, y0Var));
            if (!z3 || i <= 0) {
                return;
            }
            this.f705r.o(i);
        }
    }

    public final void H0(s0 s0Var, y0 y0Var, boolean z3) {
        int k4;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k4 = L0 - this.f705r.k()) > 0) {
            int X0 = k4 - X0(k4, s0Var, y0Var);
            if (!z3 || X0 <= 0) {
                return;
            }
            this.f705r.o(-X0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return m0.H(u(0));
    }

    public final int J0() {
        int v3 = v();
        if (v3 == 0) {
            return 0;
        }
        return m0.H(u(v3 - 1));
    }

    public final int K0(int i) {
        int g4 = this.f704q[0].g(i);
        for (int i4 = 1; i4 < this.f703p; i4++) {
            int g5 = this.f704q[i4].g(i);
            if (g5 > g4) {
                g4 = g5;
            }
        }
        return g4;
    }

    @Override // f1.m0
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i) {
        int i4 = this.f704q[0].i(i);
        for (int i5 = 1; i5 < this.f703p; i5++) {
            int i6 = this.f704q[i5].i(i);
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4;
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
    public final void M0(int i, int i4, int i5) {
        int i6;
        int i7;
        q qVar;
        int[] iArr;
        ArrayList arrayList;
        h1 h1Var;
        int i8;
        int J0 = this.f711x ? J0() : I0();
        if (i5 != 8) {
            i6 = i + i4;
        } else {
            if (i >= i4) {
                i6 = i + 1;
                i7 = i4;
                qVar = this.B;
                iArr = (int[]) qVar.f346g;
                if (iArr != null && i7 < iArr.length) {
                    arrayList = (ArrayList) qVar.f347h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                h1Var = (h1) ((ArrayList) qVar.f347h).get(size);
                                if (h1Var.f1366f == i7) {
                                    break;
                                }
                            }
                        }
                        h1Var = null;
                        if (h1Var != null) {
                            ((ArrayList) qVar.f347h).remove(h1Var);
                        }
                        int size2 = ((ArrayList) qVar.f347h).size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                i9 = -1;
                                break;
                            } else if (((h1) ((ArrayList) qVar.f347h).get(i9)).f1366f >= i7) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (i9 != -1) {
                            h1 h1Var2 = (h1) ((ArrayList) qVar.f347h).get(i9);
                            ((ArrayList) qVar.f347h).remove(i9);
                            i8 = h1Var2.f1366f;
                            if (i8 == -1) {
                                int[] iArr2 = (int[]) qVar.f346g;
                                Arrays.fill(iArr2, i7, iArr2.length, -1);
                                int length = ((int[]) qVar.f346g).length;
                            } else {
                                Arrays.fill((int[]) qVar.f346g, i7, Math.min(i8 + 1, ((int[]) qVar.f346g).length), -1);
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
                if (i6 > J0) {
                    return;
                }
                if (i7 <= (this.f711x ? I0() : J0())) {
                    m0();
                    return;
                }
                return;
            }
            i6 = i4 + 1;
        }
        i7 = i;
        qVar = this.B;
        iArr = (int[]) qVar.f346g;
        if (iArr != null) {
            arrayList = (ArrayList) qVar.f347h;
            if (arrayList != null) {
            }
            i8 = -1;
            if (i8 == -1) {
            }
        }
        if (i5 != 1) {
        }
        if (i6 > J0) {
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
    public final View N0() {
        int v3 = v();
        int i = v3 - 1;
        BitSet bitSet = new BitSet(this.f703p);
        bitSet.set(0, this.f703p, true);
        char c4 = (this.f707t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.f711x) {
            v3 = -1;
        } else {
            i = 0;
        }
        int i4 = i < v3 ? 1 : -1;
        while (i != v3) {
            View u3 = u(i);
            g1 g1Var = (g1) u3.getLayoutParams();
            if (bitSet.get(g1Var.f1358e.f1402e)) {
                j1 j1Var = g1Var.f1358e;
                if (this.f711x) {
                    int i5 = j1Var.f1401c;
                    if (i5 == Integer.MIN_VALUE) {
                        j1Var.a();
                        i5 = j1Var.f1401c;
                    }
                    if (i5 < this.f705r.g()) {
                        ArrayList arrayList = (ArrayList) j1Var.f1403f;
                        ((g1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u3;
                    }
                } else {
                    int i6 = j1Var.f1400b;
                    ArrayList arrayList2 = (ArrayList) j1Var.f1403f;
                    if (i6 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        g1 g1Var2 = (g1) view.getLayoutParams();
                        j1Var.f1400b = ((StaggeredGridLayoutManager) j1Var.f1404g).f705r.e(view);
                        g1Var2.getClass();
                        i6 = j1Var.f1400b;
                    }
                    if (i6 > this.f705r.k()) {
                        ((g1) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u3;
                    }
                }
                bitSet.clear(g1Var.f1358e.f1402e);
            }
            i += i4;
            if (i != v3) {
                View u4 = u(i);
                if (this.f711x) {
                    int b4 = this.f705r.b(u3);
                    int b5 = this.f705r.b(u4);
                    if (b4 < b5) {
                        return u3;
                    }
                    if (b4 == b5) {
                        if ((g1Var.f1358e.f1402e - ((g1) u4.getLayoutParams()).f1358e.f1402e >= 0) == (c4 >= 0)) {
                            return u3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e4 = this.f705r.e(u3);
                    int e5 = this.f705r.e(u4);
                    if (e4 > e5) {
                        return u3;
                    }
                    if (e4 == e5) {
                        if ((g1Var.f1358e.f1402e - ((g1) u4.getLayoutParams()).f1358e.f1402e >= 0) == (c4 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // f1.m0
    public final void O(int i) {
        super.O(i);
        for (int i4 = 0; i4 < this.f703p; i4++) {
            j1 j1Var = this.f704q[i4];
            int i5 = j1Var.f1400b;
            if (i5 != Integer.MIN_VALUE) {
                j1Var.f1400b = i5 + i;
            }
            int i6 = j1Var.f1401c;
            if (i6 != Integer.MIN_VALUE) {
                j1Var.f1401c = i6 + i;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // f1.m0
    public final void P(int i) {
        super.P(i);
        for (int i4 = 0; i4 < this.f703p; i4++) {
            j1 j1Var = this.f704q[i4];
            int i5 = j1Var.f1400b;
            if (i5 != Integer.MIN_VALUE) {
                j1Var.f1400b = i5 + i;
            }
            int i6 = j1Var.f1401c;
            if (i6 != Integer.MIN_VALUE) {
                j1Var.f1401c = i6 + i;
            }
        }
    }

    public final void P0(View view, int i, int i4) {
        RecyclerView recyclerView = this.f1445b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        g1 g1Var = (g1) view.getLayoutParams();
        int b12 = b1(i, ((ViewGroup.MarginLayoutParams) g1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) g1Var).rightMargin + rect.right);
        int b13 = b1(i4, ((ViewGroup.MarginLayoutParams) g1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) g1Var).bottomMargin + rect.bottom);
        if (v0(view, b12, b13, g1Var)) {
            view.measure(b12, b13);
        }
    }

    @Override // f1.m0
    public final void Q() {
        this.B.b();
        for (int i = 0; i < this.f703p; i++) {
            this.f704q[i].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r11 < I0()) != r16.f711x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0416, code lost:
    
        if (B0() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f711x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(s0 s0Var, y0 y0Var, boolean z3) {
        i1 i1Var;
        int i;
        int i4;
        boolean z4;
        i1 i1Var2 = this.F;
        f1 f1Var = this.H;
        if (!(i1Var2 == null && this.f713z == -1) && y0Var.b() == 0) {
            h0(s0Var);
            f1Var.a();
            return;
        }
        boolean z5 = f1Var.f1351e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = f1Var.f1353g;
        boolean z6 = true;
        boolean z7 = (z5 && this.f713z == -1 && this.F == null) ? false : true;
        q qVar = this.B;
        if (z7) {
            f1Var.a();
            i1 i1Var3 = this.F;
            if (i1Var3 != null) {
                int i5 = i1Var3.f1380h;
                if (i5 > 0) {
                    if (i5 == this.f703p) {
                        for (int i6 = 0; i6 < this.f703p; i6++) {
                            this.f704q[i6].b();
                            i1 i1Var4 = this.F;
                            int i7 = i1Var4.i[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += i1Var4.f1385n ? this.f705r.g() : this.f705r.k();
                            }
                            j1 j1Var = this.f704q[i6];
                            j1Var.f1400b = i7;
                            j1Var.f1401c = i7;
                        }
                    } else {
                        i1Var3.i = null;
                        i1Var3.f1380h = 0;
                        i1Var3.f1381j = 0;
                        i1Var3.f1382k = null;
                        i1Var3.f1383l = null;
                        i1Var3.f1378f = i1Var3.f1379g;
                    }
                }
                i1 i1Var5 = this.F;
                this.E = i1Var5.f1386o;
                boolean z8 = i1Var5.f1384m;
                c(null);
                i1 i1Var6 = this.F;
                if (i1Var6 != null && i1Var6.f1384m != z8) {
                    i1Var6.f1384m = z8;
                }
                this.f710w = z8;
                m0();
                W0();
                i1 i1Var7 = this.F;
                int i8 = i1Var7.f1378f;
                if (i8 != -1) {
                    this.f713z = i8;
                    f1Var.f1350c = i1Var7.f1385n;
                } else {
                    f1Var.f1350c = this.f711x;
                }
                if (i1Var7.f1381j > 1) {
                    qVar.f346g = i1Var7.f1382k;
                    qVar.f347h = i1Var7.f1383l;
                }
            } else {
                W0();
                f1Var.f1350c = this.f711x;
            }
            if (!y0Var.f1541g && (i4 = this.f713z) != -1) {
                if (i4 < 0 || i4 >= y0Var.b()) {
                    this.f713z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    i1 i1Var8 = this.F;
                    if (i1Var8 == null || i1Var8.f1378f == -1 || i1Var8.f1380h < 1) {
                        View q3 = q(this.f713z);
                        if (q3 != null) {
                            f1Var.f1348a = this.f711x ? J0() : I0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (f1Var.f1350c) {
                                    f1Var.f1349b = (this.f705r.g() - this.A) - this.f705r.b(q3);
                                } else {
                                    f1Var.f1349b = (this.f705r.k() + this.A) - this.f705r.e(q3);
                                }
                            } else if (this.f705r.c(q3) > this.f705r.l()) {
                                f1Var.f1349b = f1Var.f1350c ? this.f705r.g() : this.f705r.k();
                            } else {
                                int e4 = this.f705r.e(q3) - this.f705r.k();
                                if (e4 < 0) {
                                    f1Var.f1349b = -e4;
                                } else {
                                    int g4 = this.f705r.g() - this.f705r.b(q3);
                                    if (g4 < 0) {
                                        f1Var.f1349b = g4;
                                    } else {
                                        f1Var.f1349b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.f713z;
                            f1Var.f1348a = i9;
                            int i10 = this.A;
                            if (i10 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                f1Var.f1350c = z4;
                                f1Var.f1349b = z4 ? staggeredGridLayoutManager.f705r.g() : staggeredGridLayoutManager.f705r.k();
                            } else if (f1Var.f1350c) {
                                f1Var.f1349b = staggeredGridLayoutManager.f705r.g() - i10;
                            } else {
                                f1Var.f1349b = staggeredGridLayoutManager.f705r.k() + i10;
                            }
                            f1Var.d = true;
                        }
                    } else {
                        f1Var.f1349b = Integer.MIN_VALUE;
                        f1Var.f1348a = this.f713z;
                    }
                    f1Var.f1351e = true;
                }
            }
            if (this.D) {
                int b4 = y0Var.b();
                for (int v3 = v() - 1; v3 >= 0; v3--) {
                    i = m0.H(u(v3));
                    if (i >= 0 && i < b4) {
                        break;
                    }
                }
                i = 0;
                f1Var.f1348a = i;
                f1Var.f1349b = Integer.MIN_VALUE;
                f1Var.f1351e = true;
            } else {
                int b5 = y0Var.b();
                int v4 = v();
                for (int i11 = 0; i11 < v4; i11++) {
                    int H = m0.H(u(i11));
                    if (H >= 0 && H < b5) {
                        i = H;
                        break;
                    }
                }
                i = 0;
                f1Var.f1348a = i;
                f1Var.f1349b = Integer.MIN_VALUE;
                f1Var.f1351e = true;
            }
        }
        if (this.F == null && this.f713z == -1 && (f1Var.f1350c != this.D || O0() != this.E)) {
            qVar.b();
            f1Var.d = true;
        }
        if (v() > 0 && ((i1Var = this.F) == null || i1Var.f1380h < 1)) {
            if (f1Var.d) {
                for (int i12 = 0; i12 < this.f703p; i12++) {
                    this.f704q[i12].b();
                    int i13 = f1Var.f1349b;
                    if (i13 != Integer.MIN_VALUE) {
                        j1 j1Var2 = this.f704q[i12];
                        j1Var2.f1400b = i13;
                        j1Var2.f1401c = i13;
                    }
                }
            } else if (z7 || f1Var.f1352f == null) {
                for (int i14 = 0; i14 < this.f703p; i14++) {
                    j1 j1Var3 = this.f704q[i14];
                    boolean z9 = this.f711x;
                    int i15 = f1Var.f1349b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) j1Var3.f1404g;
                    int g5 = z9 ? j1Var3.g(Integer.MIN_VALUE) : j1Var3.i(Integer.MIN_VALUE);
                    j1Var3.b();
                    if (g5 != Integer.MIN_VALUE && ((!z9 || g5 >= staggeredGridLayoutManager2.f705r.g()) && (z9 || g5 <= staggeredGridLayoutManager2.f705r.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            g5 += i15;
                        }
                        j1Var3.f1401c = g5;
                        j1Var3.f1400b = g5;
                    }
                }
                j1[] j1VarArr = this.f704q;
                int length = j1VarArr.length;
                int[] iArr = f1Var.f1352f;
                if (iArr == null || iArr.length < length) {
                    f1Var.f1352f = new int[staggeredGridLayoutManager.f704q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    f1Var.f1352f[i16] = j1VarArr[i16].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < this.f703p; i17++) {
                    j1 j1Var4 = this.f704q[i17];
                    j1Var4.b();
                    int i18 = f1Var.f1352f[i17];
                    j1Var4.f1400b = i18;
                    j1Var4.f1401c = i18;
                }
            }
        }
        p(s0Var);
        r rVar = this.f709v;
        rVar.f1477a = false;
        int l4 = this.f706s.l();
        this.f708u = l4 / this.f703p;
        View.MeasureSpec.makeMeasureSpec(l4, this.f706s.i());
        Z0(f1Var.f1348a, y0Var);
        if (f1Var.f1350c) {
            Y0(-1);
            D0(s0Var, rVar, y0Var);
            Y0(1);
            rVar.f1479c = f1Var.f1348a + rVar.d;
            D0(s0Var, rVar, y0Var);
        } else {
            Y0(1);
            D0(s0Var, rVar, y0Var);
            Y0(-1);
            rVar.f1479c = f1Var.f1348a + rVar.d;
            D0(s0Var, rVar, y0Var);
        }
        if (this.f706s.i() != 1073741824) {
            int v5 = v();
            float f2 = 0.0f;
            for (int i19 = 0; i19 < v5; i19++) {
                View u3 = u(i19);
                float c4 = this.f706s.c(u3);
                if (c4 >= f2) {
                    ((g1) u3.getLayoutParams()).getClass();
                    f2 = Math.max(f2, c4);
                }
            }
            int i20 = this.f708u;
            int round = Math.round(f2 * this.f703p);
            if (this.f706s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f706s.l());
            }
            this.f708u = round / this.f703p;
            View.MeasureSpec.makeMeasureSpec(round, this.f706s.i());
            if (this.f708u != i20) {
                for (int i21 = 0; i21 < v5; i21++) {
                    View u4 = u(i21);
                    g1 g1Var = (g1) u4.getLayoutParams();
                    g1Var.getClass();
                    if (O0() && this.f707t == 1) {
                        int i22 = -((this.f703p - 1) - g1Var.f1358e.f1402e);
                        u4.offsetLeftAndRight((this.f708u * i22) - (i22 * i20));
                    } else {
                        int i23 = g1Var.f1358e.f1402e;
                        int i24 = this.f708u * i23;
                        int i25 = i23 * i20;
                        if (this.f707t == 1) {
                            u4.offsetLeftAndRight(i24 - i25);
                        } else {
                            u4.offsetTopAndBottom(i24 - i25);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f711x) {
                G0(s0Var, y0Var, true);
                H0(s0Var, y0Var, false);
            } else {
                H0(s0Var, y0Var, true);
                G0(s0Var, y0Var, false);
            }
        }
        if (z3 && !y0Var.f1541g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.f1445b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
        }
        z6 = false;
        if (y0Var.f1541g) {
            f1Var.a();
        }
        this.D = f1Var.f1350c;
        this.E = O0();
        if (z6) {
            f1Var.a();
            Q0(s0Var, y0Var, false);
        }
    }

    public final boolean R0(int i) {
        if (this.f707t == 0) {
            return (i == -1) != this.f711x;
        }
        return ((i == -1) == this.f711x) == O0();
    }

    @Override // f1.m0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1445b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.f703p; i++) {
            this.f704q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, y0 y0Var) {
        int I0;
        int i4;
        if (i > 0) {
            I0 = J0();
            i4 = 1;
        } else {
            I0 = I0();
            i4 = -1;
        }
        r rVar = this.f709v;
        rVar.f1477a = true;
        Z0(I0, y0Var);
        Y0(i4);
        rVar.f1479c = I0 + rVar.d;
        rVar.f1478b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f707t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f707t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (O0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (O0() == false) goto L37;
     */
    @Override // f1.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, s0 s0Var, y0 y0Var) {
        View view2;
        int i4;
        if (v() != 0) {
            RecyclerView recyclerView = this.f1445b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.f1444a.d).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                W0();
                if (i == 1) {
                    if (this.f707t != 1) {
                    }
                    i4 = -1;
                } else if (i == 2) {
                    if (this.f707t != 1) {
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
                    g1 g1Var = (g1) view2.getLayoutParams();
                    g1Var.getClass();
                    j1 j1Var = g1Var.f1358e;
                    int J0 = i4 == 1 ? J0() : I0();
                    Z0(J0, y0Var);
                    Y0(i4);
                    r rVar = this.f709v;
                    rVar.f1479c = rVar.d + J0;
                    rVar.f1478b = (int) (this.f705r.l() * 0.33333334f);
                    rVar.f1483h = true;
                    rVar.f1477a = false;
                    D0(s0Var, rVar, y0Var);
                    this.D = this.f711x;
                    View h4 = j1Var.h(J0, i4);
                    if (h4 != null && h4 != view2) {
                        return h4;
                    }
                    if (R0(i4)) {
                        for (int i5 = this.f703p - 1; i5 >= 0; i5--) {
                            View h5 = this.f704q[i5].h(J0, i4);
                            if (h5 != null && h5 != view2) {
                                return h5;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f703p; i6++) {
                            View h6 = this.f704q[i6].h(J0, i4);
                            if (h6 != null && h6 != view2) {
                                return h6;
                            }
                        }
                    }
                    boolean z3 = (this.f710w ^ true) == (i4 == -1);
                    View q3 = q(z3 ? j1Var.c() : j1Var.d());
                    if (q3 != null && q3 != view2) {
                        return q3;
                    }
                    if (R0(i4)) {
                        for (int i7 = this.f703p - 1; i7 >= 0; i7--) {
                            if (i7 != j1Var.f1402e) {
                                View q4 = q(z3 ? this.f704q[i7].c() : this.f704q[i7].d());
                                if (q4 != null && q4 != view2) {
                                    return q4;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < this.f703p; i8++) {
                            View q5 = q(z3 ? this.f704q[i8].c() : this.f704q[i8].d());
                            if (q5 != null && q5 != view2) {
                                return q5;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void T0(s0 s0Var, r rVar) {
        if (!rVar.f1477a || rVar.i) {
            return;
        }
        if (rVar.f1478b == 0) {
            if (rVar.f1480e == -1) {
                U0(s0Var, rVar.f1482g);
                return;
            } else {
                V0(s0Var, rVar.f1481f);
                return;
            }
        }
        int i = 1;
        if (rVar.f1480e == -1) {
            int i4 = rVar.f1481f;
            int i5 = this.f704q[0].i(i4);
            while (i < this.f703p) {
                int i6 = this.f704q[i].i(i4);
                if (i6 > i5) {
                    i5 = i6;
                }
                i++;
            }
            int i7 = i4 - i5;
            U0(s0Var, i7 < 0 ? rVar.f1482g : rVar.f1482g - Math.min(i7, rVar.f1478b));
            return;
        }
        int i8 = rVar.f1482g;
        int g4 = this.f704q[0].g(i8);
        while (i < this.f703p) {
            int g5 = this.f704q[i].g(i8);
            if (g5 < g4) {
                g4 = g5;
            }
            i++;
        }
        int i9 = g4 - rVar.f1482g;
        V0(s0Var, i9 < 0 ? rVar.f1481f : Math.min(i9, rVar.f1478b) + rVar.f1481f);
    }

    @Override // f1.m0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 == null || E0 == null) {
                return;
            }
            int H = m0.H(F0);
            int H2 = m0.H(E0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final void U0(s0 s0Var, int i) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            if (this.f705r.e(u3) < i || this.f705r.n(u3) < i) {
                return;
            }
            g1 g1Var = (g1) u3.getLayoutParams();
            g1Var.getClass();
            if (((ArrayList) g1Var.f1358e.f1403f).size() == 1) {
                return;
            }
            j1 j1Var = g1Var.f1358e;
            ArrayList arrayList = (ArrayList) j1Var.f1403f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            g1 g1Var2 = (g1) view.getLayoutParams();
            g1Var2.f1358e = null;
            if (g1Var2.f1460a.h() || g1Var2.f1460a.k()) {
                j1Var.d -= ((StaggeredGridLayoutManager) j1Var.f1404g).f705r.c(view);
            }
            if (size == 1) {
                j1Var.f1400b = Integer.MIN_VALUE;
            }
            j1Var.f1401c = Integer.MIN_VALUE;
            j0(u3, s0Var);
        }
    }

    public final void V0(s0 s0Var, int i) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f705r.b(u3) > i || this.f705r.m(u3) > i) {
                return;
            }
            g1 g1Var = (g1) u3.getLayoutParams();
            g1Var.getClass();
            if (((ArrayList) g1Var.f1358e.f1403f).size() == 1) {
                return;
            }
            j1 j1Var = g1Var.f1358e;
            ArrayList arrayList = (ArrayList) j1Var.f1403f;
            View view = (View) arrayList.remove(0);
            g1 g1Var2 = (g1) view.getLayoutParams();
            g1Var2.f1358e = null;
            if (arrayList.size() == 0) {
                j1Var.f1401c = Integer.MIN_VALUE;
            }
            if (g1Var2.f1460a.h() || g1Var2.f1460a.k()) {
                j1Var.d -= ((StaggeredGridLayoutManager) j1Var.f1404g).f705r.c(view);
            }
            j1Var.f1400b = Integer.MIN_VALUE;
            j0(u3, s0Var);
        }
    }

    public final void W0() {
        if (this.f707t == 1 || !O0()) {
            this.f711x = this.f710w;
        } else {
            this.f711x = !this.f710w;
        }
    }

    @Override // f1.m0
    public final void X(int i, int i4) {
        M0(i, i4, 1);
    }

    public final int X0(int i, s0 s0Var, y0 y0Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, y0Var);
        r rVar = this.f709v;
        int D0 = D0(s0Var, rVar, y0Var);
        if (rVar.f1478b >= D0) {
            i = i < 0 ? -D0 : D0;
        }
        this.f705r.o(-i);
        this.D = this.f711x;
        rVar.f1478b = 0;
        T0(s0Var, rVar);
        return i;
    }

    @Override // f1.m0
    public final void Y() {
        this.B.b();
        m0();
    }

    public final void Y0(int i) {
        r rVar = this.f709v;
        rVar.f1480e = i;
        rVar.d = this.f711x != (i == -1) ? -1 : 1;
    }

    @Override // f1.m0
    public final void Z(int i, int i4) {
        M0(i, i4, 8);
    }

    public final void Z0(int i, y0 y0Var) {
        int i4;
        int i5;
        int i6;
        r rVar = this.f709v;
        boolean z3 = false;
        rVar.f1478b = 0;
        rVar.f1479c = i;
        w wVar = this.f1447e;
        if (wVar == null || !wVar.f1518e || (i6 = y0Var.f1536a) == -1) {
            i4 = 0;
            i5 = 0;
        } else {
            if (this.f711x == (i6 < i)) {
                i4 = this.f705r.l();
                i5 = 0;
            } else {
                i5 = this.f705r.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.f1445b;
        if (recyclerView == null || !recyclerView.f673l) {
            rVar.f1482g = this.f705r.f() + i4;
            rVar.f1481f = -i5;
        } else {
            rVar.f1481f = this.f705r.k() - i5;
            rVar.f1482g = this.f705r.g() + i4;
        }
        rVar.f1483h = false;
        rVar.f1477a = true;
        if (this.f705r.i() == 0 && this.f705r.f() == 0) {
            z3 = true;
        }
        rVar.i = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < I0()) != r3.f711x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f711x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // f1.x0
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
        if (this.f707t == 0) {
            pointF.x = i4;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i4;
        return pointF;
    }

    @Override // f1.m0
    public final void a0(int i, int i4) {
        M0(i, i4, 2);
    }

    public final void a1(j1 j1Var, int i, int i4) {
        int i5 = j1Var.d;
        int i6 = j1Var.f1402e;
        if (i != -1) {
            int i7 = j1Var.f1401c;
            if (i7 == Integer.MIN_VALUE) {
                j1Var.a();
                i7 = j1Var.f1401c;
            }
            if (i7 - i5 >= i4) {
                this.f712y.set(i6, false);
                return;
            }
            return;
        }
        int i8 = j1Var.f1400b;
        if (i8 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) j1Var.f1403f).get(0);
            g1 g1Var = (g1) view.getLayoutParams();
            j1Var.f1400b = ((StaggeredGridLayoutManager) j1Var.f1404g).f705r.e(view);
            g1Var.getClass();
            i8 = j1Var.f1400b;
        }
        if (i8 + i5 <= i4) {
            this.f712y.set(i6, false);
        }
    }

    @Override // f1.m0
    public final void b0(int i, int i4) {
        M0(i, i4, 4);
    }

    @Override // f1.m0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // f1.m0
    public final void c0(s0 s0Var, y0 y0Var) {
        Q0(s0Var, y0Var, true);
    }

    @Override // f1.m0
    public final boolean d() {
        return this.f707t == 0;
    }

    @Override // f1.m0
    public final void d0(y0 y0Var) {
        this.f713z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // f1.m0
    public final boolean e() {
        return this.f707t == 1;
    }

    @Override // f1.m0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof i1) {
            i1 i1Var = (i1) parcelable;
            this.F = i1Var;
            if (this.f713z != -1) {
                i1Var.f1378f = -1;
                i1Var.f1379g = -1;
                i1Var.i = null;
                i1Var.f1380h = 0;
                i1Var.f1381j = 0;
                i1Var.f1382k = null;
                i1Var.f1383l = null;
            }
            m0();
        }
    }

    @Override // f1.m0
    public final boolean f(n0 n0Var) {
        return n0Var instanceof g1;
    }

    @Override // f1.m0
    public final Parcelable f0() {
        int i;
        int k4;
        int[] iArr;
        i1 i1Var = this.F;
        if (i1Var != null) {
            i1 i1Var2 = new i1();
            i1Var2.f1380h = i1Var.f1380h;
            i1Var2.f1378f = i1Var.f1378f;
            i1Var2.f1379g = i1Var.f1379g;
            i1Var2.i = i1Var.i;
            i1Var2.f1381j = i1Var.f1381j;
            i1Var2.f1382k = i1Var.f1382k;
            i1Var2.f1384m = i1Var.f1384m;
            i1Var2.f1385n = i1Var.f1385n;
            i1Var2.f1386o = i1Var.f1386o;
            i1Var2.f1383l = i1Var.f1383l;
            return i1Var2;
        }
        i1 i1Var3 = new i1();
        i1Var3.f1384m = this.f710w;
        i1Var3.f1385n = this.D;
        i1Var3.f1386o = this.E;
        q qVar = this.B;
        if (qVar == null || (iArr = (int[]) qVar.f346g) == null) {
            i1Var3.f1381j = 0;
        } else {
            i1Var3.f1382k = iArr;
            i1Var3.f1381j = iArr.length;
            i1Var3.f1383l = (ArrayList) qVar.f347h;
        }
        if (v() <= 0) {
            i1Var3.f1378f = -1;
            i1Var3.f1379g = -1;
            i1Var3.f1380h = 0;
            return i1Var3;
        }
        i1Var3.f1378f = this.D ? J0() : I0();
        View E0 = this.f711x ? E0(true) : F0(true);
        i1Var3.f1379g = E0 != null ? m0.H(E0) : -1;
        int i4 = this.f703p;
        i1Var3.f1380h = i4;
        i1Var3.i = new int[i4];
        for (int i5 = 0; i5 < this.f703p; i5++) {
            if (this.D) {
                i = this.f704q[i5].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k4 = this.f705r.g();
                    i -= k4;
                    i1Var3.i[i5] = i;
                } else {
                    i1Var3.i[i5] = i;
                }
            } else {
                i = this.f704q[i5].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k4 = this.f705r.k();
                    i -= k4;
                    i1Var3.i[i5] = i;
                } else {
                    i1Var3.i[i5] = i;
                }
            }
        }
        return i1Var3;
    }

    @Override // f1.m0
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // f1.m0
    public final void h(int i, int i4, y0 y0Var, n nVar) {
        r rVar;
        int g4;
        int i5;
        if (this.f707t != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, y0Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f703p) {
            this.J = new int[this.f703p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f703p;
            rVar = this.f709v;
            if (i6 >= i8) {
                break;
            }
            if (rVar.d == -1) {
                g4 = rVar.f1481f;
                i5 = this.f704q[i6].i(g4);
            } else {
                g4 = this.f704q[i6].g(rVar.f1482g);
                i5 = rVar.f1482g;
            }
            int i9 = g4 - i5;
            if (i9 >= 0) {
                this.J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = rVar.f1479c;
            if (i11 < 0 || i11 >= y0Var.b()) {
                return;
            }
            nVar.a(rVar.f1479c, this.J[i10]);
            rVar.f1479c += rVar.d;
        }
    }

    @Override // f1.m0
    public final int j(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return y.k(y0Var, this.f705r, F0(z3), E0(z3), this, this.I);
    }

    @Override // f1.m0
    public final int k(y0 y0Var) {
        return C0(y0Var);
    }

    @Override // f1.m0
    public final int l(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return y.m(y0Var, this.f705r, F0(z3), E0(z3), this, this.I);
    }

    @Override // f1.m0
    public final int m(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return y.k(y0Var, this.f705r, F0(z3), E0(z3), this, this.I);
    }

    @Override // f1.m0
    public final int n(y0 y0Var) {
        return C0(y0Var);
    }

    @Override // f1.m0
    public final int n0(int i, s0 s0Var, y0 y0Var) {
        return X0(i, s0Var, y0Var);
    }

    @Override // f1.m0
    public final int o(y0 y0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return y.m(y0Var, this.f705r, F0(z3), E0(z3), this, this.I);
    }

    @Override // f1.m0
    public final void o0(int i) {
        i1 i1Var = this.F;
        if (i1Var != null && i1Var.f1378f != i) {
            i1Var.i = null;
            i1Var.f1380h = 0;
            i1Var.f1378f = -1;
            i1Var.f1379g = -1;
        }
        this.f713z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // f1.m0
    public final int p0(int i, s0 s0Var, y0 y0Var) {
        return X0(i, s0Var, y0Var);
    }

    @Override // f1.m0
    public final n0 r() {
        return this.f707t == 0 ? new g1(-2, -1) : new g1(-1, -2);
    }

    @Override // f1.m0
    public final n0 s(Context context, AttributeSet attributeSet) {
        return new g1(context, attributeSet);
    }

    @Override // f1.m0
    public final void s0(Rect rect, int i, int i4) {
        int g4;
        int g5;
        int F = F() + E();
        int D = D() + G();
        int i5 = this.f707t;
        int i6 = this.f703p;
        if (i5 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f1445b;
            WeakHashMap weakHashMap = n0.l0.f2757a;
            g5 = m0.g(i4, height, recyclerView.getMinimumHeight());
            g4 = m0.g(i, (this.f708u * i6) + F, this.f1445b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f1445b;
            WeakHashMap weakHashMap2 = n0.l0.f2757a;
            g4 = m0.g(i, width, recyclerView2.getMinimumWidth());
            g5 = m0.g(i4, (this.f708u * i6) + D, this.f1445b.getMinimumHeight());
        }
        this.f1445b.setMeasuredDimension(g4, g5);
    }

    @Override // f1.m0
    public final n0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g1((ViewGroup.MarginLayoutParams) layoutParams) : new g1(layoutParams);
    }

    @Override // f1.m0
    public final void y0(RecyclerView recyclerView, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.f1515a = i;
        z0(wVar);
    }
}
