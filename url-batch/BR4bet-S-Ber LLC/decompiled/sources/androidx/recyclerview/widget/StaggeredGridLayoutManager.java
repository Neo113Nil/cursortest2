package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a20;
import defpackage.a5;
import defpackage.b20;
import defpackage.bs;
import defpackage.c20;
import defpackage.fu;
import defpackage.g9;
import defpackage.h20;
import defpackage.ic0;
import defpackage.ij;
import defpackage.j7;
import defpackage.kr;
import defpackage.m20;
import defpackage.n20;
import defpackage.p60;
import defpackage.q60;
import defpackage.r60;
import defpackage.ro;
import defpackage.s60;
import defpackage.xs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends b20 implements m20 {
    public int A;
    public final a5 B;
    public final int C;
    public boolean D;
    public boolean E;
    public s60 F;
    public final Rect G;
    public final p60 H;
    public final boolean I;
    public int[] J;
    public final j7 K;
    public int p;
    public fu[] q;
    public final ij r;
    public final ij s;
    public final int t;
    public int u;
    public final bs v;
    public boolean w;
    public boolean x;
    public BitSet y;
    public int z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new a5(23, false);
        this.C = 2;
        this.G = new Rect();
        this.H = new p60(this);
        this.I = true;
        this.K = new j7(9, this);
        a20 I = b20.I(context, attributeSet, i, i2);
        int i3 = I.a;
        if (i3 != 0 && i3 != 1) {
            g9.i("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            ij ijVar = this.r;
            this.r = this.s;
            this.s = ijVar;
            m0();
        }
        Z0(I.b);
        boolean z = I.c;
        c(null);
        s60 s60Var = this.F;
        if (s60Var != null && s60Var.m != z) {
            s60Var.m = z;
        }
        this.w = z;
        m0();
        this.v = new bs();
        this.r = ij.a(this, this.t);
        this.s = ij.a(this, 1 - this.t);
    }

    public static int c1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.b20
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int I0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                I0 = J0();
                I0();
            } else {
                I0 = I0();
                J0();
            }
            if (I0 == 0 && N0() != null) {
                this.B.i();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return kr.m(n20Var, this.r, F0(z), E0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x025b, code lost:
    
        T0(r1, r3);
     */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D0(h20 h20Var, bs bsVar, n20 n20Var) {
        fu fuVar;
        ?? r8;
        int i;
        int c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        h20 h20Var2 = h20Var;
        int i7 = 0;
        int i8 = 1;
        this.y.set(0, this.p, true);
        bs bsVar2 = this.v;
        int i9 = bsVar2.i ? bsVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : bsVar.e == 1 ? bsVar.g + bsVar.b : bsVar.f - bsVar.b;
        int i10 = bsVar.e;
        for (int i11 = 0; i11 < this.p; i11++) {
            if (!((ArrayList) this.q[i11].f).isEmpty()) {
                b1(this.q[i11], i10, i9);
            }
        }
        boolean z = this.x;
        ij ijVar = this.r;
        int g = z ? ijVar.g() : ijVar.k();
        boolean z2 = false;
        while (true) {
            int i12 = bsVar.c;
            if (i12 < 0 || i12 >= n20Var.b() || (!bsVar2.i && this.y.isEmpty())) {
                break;
            }
            View d = h20Var2.d(bsVar.c);
            bsVar.c += bsVar.d;
            q60 q60Var = (q60) d.getLayoutParams();
            int b = q60Var.a.b();
            a5 a5Var = this.B;
            int[] iArr = (int[]) a5Var.g;
            int i13 = (iArr == null || b >= iArr.length) ? -1 : iArr[b];
            if (i13 == -1) {
                boolean R0 = R0(bsVar.e);
                int i14 = this.p;
                if (R0) {
                    i6 = i14 - 1;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = i14;
                    i6 = i7;
                }
                fu fuVar2 = null;
                if (bsVar.e == i8) {
                    int k = ijVar.k();
                    int i15 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        fu fuVar3 = this.q[i6];
                        int i16 = i6;
                        int g2 = fuVar3.g(k);
                        if (g2 < i15) {
                            fuVar2 = fuVar3;
                            i15 = g2;
                        }
                        i6 = i16 + i4;
                    }
                } else {
                    int g3 = ijVar.g();
                    int i17 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        fu fuVar4 = this.q[i6];
                        int i18 = i5;
                        int i19 = fuVar4.i(g3);
                        if (i19 > i17) {
                            i17 = i19;
                            fuVar2 = fuVar4;
                        }
                        i6 += i4;
                        i5 = i18;
                    }
                }
                fuVar = fuVar2;
                a5Var.y(b);
                ((int[]) a5Var.g)[b] = fuVar.e;
            } else {
                fuVar = this.q[i13];
            }
            q60Var.e = fuVar;
            if (bsVar.e == 1) {
                r8 = 0;
                b(d, -1, false);
            } else {
                r8 = 0;
                b(d, 0, false);
            }
            int i20 = this.t;
            if (i20 == 1) {
                P0(d, b20.w(r8, this.u, this.l, r8, ((ViewGroup.MarginLayoutParams) q60Var).width), b20.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) q60Var).height));
            } else {
                P0(d, b20.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) q60Var).width), b20.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) q60Var).height));
            }
            if (bsVar.e == 1) {
                c = fuVar.g(g);
                i = ijVar.c(d) + c;
            } else {
                i = fuVar.i(g);
                c = i - ijVar.c(d);
            }
            int i21 = bsVar.e;
            fu fuVar5 = q60Var.e;
            if (i21 == 1) {
                fuVar5.getClass();
                q60 q60Var2 = (q60) d.getLayoutParams();
                q60Var2.e = fuVar5;
                ArrayList arrayList = (ArrayList) fuVar5.f;
                arrayList.add(d);
                fuVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    fuVar5.b = Integer.MIN_VALUE;
                }
                if (q60Var2.a.h() || q60Var2.a.k()) {
                    fuVar5.d = ((StaggeredGridLayoutManager) fuVar5.g).r.c(d) + fuVar5.d;
                }
            } else {
                fuVar5.getClass();
                q60 q60Var3 = (q60) d.getLayoutParams();
                q60Var3.e = fuVar5;
                ArrayList arrayList2 = (ArrayList) fuVar5.f;
                arrayList2.add(0, d);
                fuVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    fuVar5.c = Integer.MIN_VALUE;
                }
                if (q60Var3.a.h() || q60Var3.a.k()) {
                    fuVar5.d = ((StaggeredGridLayoutManager) fuVar5.g).r.c(d) + fuVar5.d;
                }
            }
            boolean O0 = O0();
            ij ijVar2 = this.s;
            if (O0 && i20 == 1) {
                i3 = ijVar2.g() - (((this.p - 1) - fuVar.e) * this.u);
                i2 = i3 - ijVar2.c(d);
            } else {
                int k2 = (fuVar.e * this.u) + ijVar2.k();
                int c2 = ijVar2.c(d) + k2;
                i2 = k2;
                i3 = c2;
            }
            if (i20 == 1) {
                b20.N(d, i2, c, i3, i);
            } else {
                b20.N(d, c, i2, i, i3);
            }
            b1(fuVar, bsVar2.e, i9);
            h20Var2 = h20Var;
            T0(h20Var2, bsVar2);
            if (bsVar2.h && d.hasFocusable()) {
                this.y.set(fuVar.e, false);
            }
            i8 = 1;
            z2 = true;
            i7 = 0;
        }
        int k3 = bsVar2.e == -1 ? ijVar.k() - L0(ijVar.k()) : K0(ijVar.g()) - ijVar.g();
        if (k3 > 0) {
            return Math.min(bsVar.b, k3);
        }
        return 0;
    }

    public final View E0(boolean z) {
        ij ijVar = this.r;
        int k = ijVar.k();
        int g = ijVar.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = ijVar.e(u);
            int b = ijVar.b(u);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return u;
                }
                if (view == null) {
                    view = u;
                }
            }
        }
        return view;
    }

    public final View F0(boolean z) {
        ij ijVar = this.r;
        int k = ijVar.k();
        int g = ijVar.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = ijVar.e(u);
            if (ijVar.b(u) > k && e < g) {
                if (e >= k || !z) {
                    return u;
                }
                if (view == null) {
                    view = u;
                }
            }
        }
        return view;
    }

    public final void G0(h20 h20Var, n20 n20Var, boolean z) {
        int g;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g = this.r.g() - K0) > 0) {
            int i = g - (-X0(-g, h20Var, n20Var));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void H0(h20 h20Var, n20 n20Var, boolean z) {
        int k;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k = L0 - this.r.k()) > 0) {
            int X0 = k - X0(k, h20Var, n20Var);
            if (!z || X0 <= 0) {
                return;
            }
            this.r.o(-X0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return b20.H(u(0));
    }

    public final int J0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return b20.H(u(v - 1));
    }

    public final int K0(int i) {
        int g = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int g2 = this.q[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    @Override // defpackage.b20
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i, int i2, int i3) {
        int i4;
        int i5;
        a5 a5Var;
        int[] iArr;
        ArrayList arrayList;
        r60 r60Var;
        int i6;
        int J0 = this.x ? J0() : I0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                a5Var = this.B;
                iArr = (int[]) a5Var.g;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) a5Var.h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                r60Var = (r60) ((ArrayList) a5Var.h).get(size);
                                if (r60Var.f == i5) {
                                    break;
                                }
                            }
                        }
                        r60Var = null;
                        if (r60Var != null) {
                            ((ArrayList) a5Var.h).remove(r60Var);
                        }
                        int size2 = ((ArrayList) a5Var.h).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((r60) ((ArrayList) a5Var.h).get(i7)).f >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            r60 r60Var2 = (r60) ((ArrayList) a5Var.h).get(i7);
                            ((ArrayList) a5Var.h).remove(i7);
                            i6 = r60Var2.f;
                            int[] iArr2 = (int[]) a5Var.g;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) a5Var.g).length;
                            } else {
                                Arrays.fill((int[]) a5Var.g, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) a5Var.g;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    a5Var.F(i, i2);
                } else if (i3 == 2) {
                    a5Var.G(i, i2);
                } else if (i3 == 8) {
                    a5Var.G(i, 1);
                    a5Var.F(i2, 1);
                }
                if (i4 > J0) {
                    return;
                }
                if (i5 <= (this.x ? I0() : J0())) {
                    m0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        a5Var = this.B;
        iArr = (int[]) a5Var.g;
        if (iArr != null) {
            arrayList = (ArrayList) a5Var.h;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) a5Var.g;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > J0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View N0() {
        int v = v();
        int i = v - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        char c = (this.t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.x) {
            v = -1;
        } else {
            i = 0;
        }
        int i2 = i < v ? 1 : -1;
        while (i != v) {
            View u = u(i);
            q60 q60Var = (q60) u.getLayoutParams();
            boolean z = bitSet.get(q60Var.e.e);
            ij ijVar = this.r;
            if (z) {
                fu fuVar = q60Var.e;
                if (this.x) {
                    int i3 = fuVar.c;
                    if (i3 == Integer.MIN_VALUE) {
                        fuVar.a();
                        i3 = fuVar.c;
                    }
                    if (i3 < ijVar.g()) {
                        ArrayList arrayList = (ArrayList) fuVar.f;
                        ((q60) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u;
                    }
                } else {
                    int i4 = fuVar.b;
                    ArrayList arrayList2 = (ArrayList) fuVar.f;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        q60 q60Var2 = (q60) view.getLayoutParams();
                        fuVar.b = ((StaggeredGridLayoutManager) fuVar.g).r.e(view);
                        q60Var2.getClass();
                        i4 = fuVar.b;
                    }
                    if (i4 > ijVar.k()) {
                        ((q60) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u;
                    }
                }
                bitSet.clear(q60Var.e.e);
            }
            i += i2;
            if (i != v) {
                View u2 = u(i);
                if (this.x) {
                    int b = ijVar.b(u);
                    int b2 = ijVar.b(u2);
                    if (b < b2) {
                        return u;
                    }
                    if (b == b2) {
                        if ((q60Var.e.e - ((q60) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                            return u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = ijVar.e(u);
                    int e2 = ijVar.e(u2);
                    if (e > e2) {
                        return u;
                    }
                    if (e == e2) {
                        if ((q60Var.e.e - ((q60) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.b20
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            fu fuVar = this.q[i2];
            int i3 = fuVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fuVar.b = i3 + i;
            }
            int i4 = fuVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fuVar.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // defpackage.b20
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            fu fuVar = this.q[i2];
            int i3 = fuVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fuVar.b = i3 + i;
            }
            int i4 = fuVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fuVar.c = i4 + i;
            }
        }
    }

    public final void P0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        q60 q60Var = (q60) view.getLayoutParams();
        int c1 = c1(i, ((ViewGroup.MarginLayoutParams) q60Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) q60Var).rightMargin + rect.right);
        int c12 = c1(i2, ((ViewGroup.MarginLayoutParams) q60Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) q60Var).bottomMargin + rect.bottom);
        if (v0(view, c1, c12, q60Var)) {
            view.measure(c1, c12);
        }
    }

    @Override // defpackage.b20
    public final void Q() {
        this.B.i();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0190, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        if ((r11 < I0()) != r16.x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x03e8, code lost:
    
        if (B0() != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017e, code lost:
    
        if (r16.x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018e, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(h20 h20Var, n20 n20Var, boolean z) {
        s60 s60Var;
        fu[] fuVarArr;
        int i;
        int i2;
        boolean z2;
        s60 s60Var2 = this.F;
        p60 p60Var = this.H;
        if (!(s60Var2 == null && this.z == -1) && n20Var.b() == 0) {
            h0(h20Var);
            p60Var.a();
            return;
        }
        boolean z3 = p60Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = p60Var.g;
        boolean z4 = true;
        boolean z5 = (z3 && this.z == -1 && this.F == null) ? false : true;
        a5 a5Var = this.B;
        if (z5) {
            p60Var.a();
            s60 s60Var3 = this.F;
            ij ijVar = this.r;
            if (s60Var3 != null) {
                int i3 = s60Var3.h;
                if (i3 > 0) {
                    if (i3 == this.p) {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            this.q[i4].b();
                            s60 s60Var4 = this.F;
                            int i5 = s60Var4.i[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += s60Var4.n ? ijVar.g() : ijVar.k();
                            }
                            fu fuVar = this.q[i4];
                            fuVar.b = i5;
                            fuVar.c = i5;
                        }
                    } else {
                        s60Var3.i = null;
                        s60Var3.h = 0;
                        s60Var3.j = 0;
                        s60Var3.k = null;
                        s60Var3.l = null;
                        s60Var3.f = s60Var3.g;
                    }
                }
                s60 s60Var5 = this.F;
                this.E = s60Var5.o;
                boolean z6 = s60Var5.m;
                c(null);
                s60 s60Var6 = this.F;
                if (s60Var6 != null && s60Var6.m != z6) {
                    s60Var6.m = z6;
                }
                this.w = z6;
                m0();
                W0();
                s60 s60Var7 = this.F;
                int i6 = s60Var7.f;
                if (i6 != -1) {
                    this.z = i6;
                    p60Var.c = s60Var7.n;
                } else {
                    p60Var.c = this.x;
                }
                if (s60Var7.j > 1) {
                    a5Var.g = s60Var7.k;
                    a5Var.h = s60Var7.l;
                }
            } else {
                W0();
                p60Var.c = this.x;
            }
            if (!n20Var.g && (i2 = this.z) != -1) {
                if (i2 < 0 || i2 >= n20Var.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    s60 s60Var8 = this.F;
                    if (s60Var8 == null || s60Var8.f == -1 || s60Var8.h < 1) {
                        View q = q(this.z);
                        if (q != null) {
                            p60Var.a = this.x ? J0() : I0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (p60Var.c) {
                                    p60Var.b = (ijVar.g() - this.A) - ijVar.b(q);
                                } else {
                                    p60Var.b = (ijVar.k() + this.A) - ijVar.e(q);
                                }
                            } else if (ijVar.c(q) > ijVar.l()) {
                                p60Var.b = p60Var.c ? ijVar.g() : ijVar.k();
                            } else {
                                int e = ijVar.e(q) - ijVar.k();
                                if (e < 0) {
                                    p60Var.b = -e;
                                } else {
                                    int g = ijVar.g() - ijVar.b(q);
                                    if (g < 0) {
                                        p60Var.b = g;
                                    } else {
                                        p60Var.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.z;
                            p60Var.a = i7;
                            int i8 = this.A;
                            if (i8 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                p60Var.c = z2;
                                ij ijVar2 = staggeredGridLayoutManager.r;
                                p60Var.b = z2 ? ijVar2.g() : ijVar2.k();
                            } else {
                                boolean z7 = p60Var.c;
                                ij ijVar3 = staggeredGridLayoutManager.r;
                                if (z7) {
                                    p60Var.b = ijVar3.g() - i8;
                                } else {
                                    p60Var.b = ijVar3.k() + i8;
                                }
                            }
                            p60Var.d = true;
                        }
                    } else {
                        p60Var.b = Integer.MIN_VALUE;
                        p60Var.a = this.z;
                    }
                    p60Var.e = true;
                }
            }
            if (this.D) {
                int b = n20Var.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i = b20.H(u(v));
                    if (i >= 0 && i < b) {
                        break;
                    }
                }
                i = 0;
                p60Var.a = i;
                p60Var.b = Integer.MIN_VALUE;
                p60Var.e = true;
            } else {
                int b2 = n20Var.b();
                int v2 = v();
                for (int i9 = 0; i9 < v2; i9++) {
                    int H = b20.H(u(i9));
                    if (H >= 0 && H < b2) {
                        i = H;
                        break;
                    }
                }
                i = 0;
                p60Var.a = i;
                p60Var.b = Integer.MIN_VALUE;
                p60Var.e = true;
            }
        }
        if (this.F == null && this.z == -1 && (p60Var.c != this.D || O0() != this.E)) {
            a5Var.i();
            p60Var.d = true;
        }
        if (v() > 0 && ((s60Var = this.F) == null || s60Var.h < 1)) {
            if (p60Var.d) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    this.q[i10].b();
                    int i11 = p60Var.b;
                    if (i11 != Integer.MIN_VALUE) {
                        fu fuVar2 = this.q[i10];
                        fuVar2.b = i11;
                        fuVar2.c = i11;
                    }
                }
            } else if (z5 || p60Var.f == null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.p;
                    fuVarArr = this.q;
                    if (i12 >= i13) {
                        break;
                    }
                    fu fuVar3 = fuVarArr[i12];
                    boolean z8 = this.x;
                    int i14 = p60Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) fuVar3.g;
                    int g2 = z8 ? fuVar3.g(Integer.MIN_VALUE) : fuVar3.i(Integer.MIN_VALUE);
                    fuVar3.b();
                    if (g2 != Integer.MIN_VALUE && ((!z8 || g2 >= staggeredGridLayoutManager2.r.g()) && (z8 || g2 <= staggeredGridLayoutManager2.r.k()))) {
                        if (i14 != Integer.MIN_VALUE) {
                            g2 += i14;
                        }
                        fuVar3.c = g2;
                        fuVar3.b = g2;
                    }
                    i12++;
                }
                int length = fuVarArr.length;
                int[] iArr = p60Var.f;
                if (iArr == null || iArr.length < length) {
                    p60Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i15 = 0; i15 < length; i15++) {
                    p60Var.f[i15] = fuVarArr[i15].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i16 = 0; i16 < this.p; i16++) {
                    fu fuVar4 = this.q[i16];
                    fuVar4.b();
                    int i17 = p60Var.f[i16];
                    fuVar4.b = i17;
                    fuVar4.c = i17;
                }
            }
        }
        p(h20Var);
        bs bsVar = this.v;
        bsVar.a = false;
        ij ijVar4 = this.s;
        int l = ijVar4.l();
        this.u = l / this.p;
        View.MeasureSpec.makeMeasureSpec(l, ijVar4.i());
        a1(p60Var.a, n20Var);
        if (p60Var.c) {
            Y0(-1);
            D0(h20Var, bsVar, n20Var);
            Y0(1);
            bsVar.c = p60Var.a + bsVar.d;
            D0(h20Var, bsVar, n20Var);
        } else {
            Y0(1);
            D0(h20Var, bsVar, n20Var);
            Y0(-1);
            bsVar.c = p60Var.a + bsVar.d;
            D0(h20Var, bsVar, n20Var);
        }
        if (ijVar4.i() != 1073741824) {
            int v3 = v();
            float f = 0.0f;
            for (int i18 = 0; i18 < v3; i18++) {
                View u = u(i18);
                float c = ijVar4.c(u);
                if (c >= f) {
                    ((q60) u.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i19 = this.u;
            int round = Math.round(f * this.p);
            if (ijVar4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, ijVar4.l());
            }
            this.u = round / this.p;
            View.MeasureSpec.makeMeasureSpec(round, ijVar4.i());
            if (this.u != i19) {
                for (int i20 = 0; i20 < v3; i20++) {
                    View u2 = u(i20);
                    q60 q60Var = (q60) u2.getLayoutParams();
                    q60Var.getClass();
                    boolean O0 = O0();
                    int i21 = this.t;
                    if (O0 && i21 == 1) {
                        int i22 = -((this.p - 1) - q60Var.e.e);
                        u2.offsetLeftAndRight((this.u * i22) - (i22 * i19));
                    } else {
                        int i23 = q60Var.e.e;
                        int i24 = this.u * i23;
                        int i25 = i23 * i19;
                        if (i21 == 1) {
                            u2.offsetLeftAndRight(i24 - i25);
                        } else {
                            u2.offsetTopAndBottom(i24 - i25);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                G0(h20Var, n20Var, true);
                H0(h20Var, n20Var, false);
            } else {
                H0(h20Var, n20Var, true);
                G0(h20Var, n20Var, false);
            }
        }
        if (z && !n20Var.g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
        }
        z4 = false;
        if (n20Var.g) {
            p60Var.a();
        }
        this.D = p60Var.c;
        this.E = O0();
        if (z4) {
            p60Var.a();
            Q0(h20Var, n20Var, false);
        }
    }

    public final boolean R0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == O0();
    }

    @Override // defpackage.b20
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i, n20 n20Var) {
        int I0;
        int i2;
        if (i > 0) {
            I0 = J0();
            i2 = 1;
        } else {
            I0 = I0();
            i2 = -1;
        }
        bs bsVar = this.v;
        bsVar.a = true;
        a1(I0, n20Var);
        Y0(i2);
        bsVar.c = I0 + bsVar.d;
        bsVar.b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x005b, code lost:
    
        if (O0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0065, code lost:
    
        if (O0() == false) goto L34;
     */
    @Override // defpackage.b20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, h20 h20Var, n20 n20Var) {
        View view2;
        int i2;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.a.i).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                W0();
                int i3 = this.t;
                if (i == 1) {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (i3 != 1) {
                    }
                    i2 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 != Integer.MIN_VALUE) {
                    q60 q60Var = (q60) view2.getLayoutParams();
                    q60Var.getClass();
                    fu fuVar = q60Var.e;
                    int J0 = i2 == 1 ? J0() : I0();
                    a1(J0, n20Var);
                    Y0(i2);
                    bs bsVar = this.v;
                    bsVar.c = bsVar.d + J0;
                    bsVar.b = (int) (this.r.l() * 0.33333334f);
                    bsVar.h = true;
                    bsVar.a = false;
                    D0(h20Var, bsVar, n20Var);
                    this.D = this.x;
                    View h = fuVar.h(J0, i2);
                    if (h != null && h != view2) {
                        return h;
                    }
                    if (R0(i2)) {
                        for (int i4 = this.p - 1; i4 >= 0; i4--) {
                            View h2 = this.q[i4].h(J0, i2);
                            if (h2 != null && h2 != view2) {
                                return h2;
                            }
                        }
                    } else {
                        for (int i5 = 0; i5 < this.p; i5++) {
                            View h3 = this.q[i5].h(J0, i2);
                            if (h3 != null && h3 != view2) {
                                return h3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View q = q(z ? fuVar.c() : fuVar.d());
                    if (q != null && q != view2) {
                        return q;
                    }
                    if (R0(i2)) {
                        for (int i6 = this.p - 1; i6 >= 0; i6--) {
                            if (i6 != fuVar.e) {
                                fu[] fuVarArr = this.q;
                                View q2 = q(z ? fuVarArr[i6].c() : fuVarArr[i6].d());
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.p; i7++) {
                            fu[] fuVarArr2 = this.q;
                            View q3 = q(z ? fuVarArr2[i7].c() : fuVarArr2[i7].d());
                            if (q3 != null && q3 != view2) {
                                return q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void T0(h20 h20Var, bs bsVar) {
        if (!bsVar.a || bsVar.i) {
            return;
        }
        int i = bsVar.b;
        int i2 = bsVar.e;
        if (i == 0) {
            if (i2 == -1) {
                U0(h20Var, bsVar.g);
                return;
            } else {
                V0(h20Var, bsVar.f);
                return;
            }
        }
        int i3 = 1;
        if (i2 == -1) {
            int i4 = bsVar.f;
            int i5 = this.q[0].i(i4);
            while (i3 < this.p) {
                int i6 = this.q[i3].i(i4);
                if (i6 > i5) {
                    i5 = i6;
                }
                i3++;
            }
            int i7 = i4 - i5;
            int i8 = bsVar.g;
            if (i7 >= 0) {
                i8 -= Math.min(i7, bsVar.b);
            }
            U0(h20Var, i8);
            return;
        }
        int i9 = bsVar.g;
        int g = this.q[0].g(i9);
        while (i3 < this.p) {
            int g2 = this.q[i3].g(i9);
            if (g2 < g) {
                g = g2;
            }
            i3++;
        }
        int i10 = g - bsVar.g;
        int i11 = bsVar.f;
        if (i10 >= 0) {
            i11 += Math.min(i10, bsVar.b);
        }
        V0(h20Var, i11);
    }

    @Override // defpackage.b20
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 == null || E0 == null) {
                return;
            }
            int H = b20.H(F0);
            int H2 = b20.H(E0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final void U0(h20 h20Var, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            ij ijVar = this.r;
            if (ijVar.e(u) < i || ijVar.n(u) < i) {
                return;
            }
            q60 q60Var = (q60) u.getLayoutParams();
            q60Var.getClass();
            if (((ArrayList) q60Var.e.f).size() == 1) {
                return;
            }
            fu fuVar = q60Var.e;
            ArrayList arrayList = (ArrayList) fuVar.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            q60 q60Var2 = (q60) view.getLayoutParams();
            q60Var2.e = null;
            if (q60Var2.a.h() || q60Var2.a.k()) {
                fuVar.d -= ((StaggeredGridLayoutManager) fuVar.g).r.c(view);
            }
            if (size == 1) {
                fuVar.b = Integer.MIN_VALUE;
            }
            fuVar.c = Integer.MIN_VALUE;
            j0(u, h20Var);
        }
    }

    public final void V0(h20 h20Var, int i) {
        while (v() > 0) {
            View u = u(0);
            ij ijVar = this.r;
            if (ijVar.b(u) > i || ijVar.m(u) > i) {
                return;
            }
            q60 q60Var = (q60) u.getLayoutParams();
            q60Var.getClass();
            if (((ArrayList) q60Var.e.f).size() == 1) {
                return;
            }
            fu fuVar = q60Var.e;
            ArrayList arrayList = (ArrayList) fuVar.f;
            View view = (View) arrayList.remove(0);
            q60 q60Var2 = (q60) view.getLayoutParams();
            q60Var2.e = null;
            if (arrayList.size() == 0) {
                fuVar.c = Integer.MIN_VALUE;
            }
            if (q60Var2.a.h() || q60Var2.a.k()) {
                fuVar.d -= ((StaggeredGridLayoutManager) fuVar.g).r.c(view);
            }
            fuVar.b = Integer.MIN_VALUE;
            j0(u, h20Var);
        }
    }

    public final void W0() {
        if (this.t == 1 || !O0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.b20
    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, h20 h20Var, n20 n20Var) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, n20Var);
        bs bsVar = this.v;
        int D0 = D0(h20Var, bsVar, n20Var);
        if (bsVar.b >= D0) {
            i = i < 0 ? -D0 : D0;
        }
        this.r.o(-i);
        this.D = this.x;
        bsVar.b = 0;
        T0(h20Var, bsVar);
        return i;
    }

    @Override // defpackage.b20
    public final void Y() {
        this.B.i();
        m0();
    }

    public final void Y0(int i) {
        bs bsVar = this.v;
        bsVar.e = i;
        bsVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.b20
    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i) {
        c(null);
        if (i != this.p) {
            this.B.i();
            m0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new fu[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new fu(this, i2);
            }
            m0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < I0()) != r3.x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.m20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i2 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.b20
    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(int i, n20 n20Var) {
        int i2;
        int i3;
        int i4;
        bs bsVar = this.v;
        boolean z = false;
        bsVar.b = 0;
        bsVar.c = i;
        xs xsVar = this.e;
        ij ijVar = this.r;
        if (xsVar == null || !xsVar.e || (i4 = n20Var.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i2 = ijVar.l();
                i3 = 0;
            } else {
                i3 = ijVar.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.l) {
            bsVar.g = ijVar.f() + i2;
            bsVar.f = -i3;
        } else {
            bsVar.f = ijVar.k() - i3;
            bsVar.g = ijVar.g() + i2;
        }
        bsVar.h = false;
        bsVar.a = true;
        if (ijVar.i() == 0 && ijVar.f() == 0) {
            z = true;
        }
        bsVar.i = z;
    }

    @Override // defpackage.b20
    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    public final void b1(fu fuVar, int i, int i2) {
        int i3 = fuVar.d;
        int i4 = fuVar.e;
        if (i != -1) {
            int i5 = fuVar.c;
            if (i5 == Integer.MIN_VALUE) {
                fuVar.a();
                i5 = fuVar.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = fuVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) fuVar.f).get(0);
            q60 q60Var = (q60) view.getLayoutParams();
            fuVar.b = ((StaggeredGridLayoutManager) fuVar.g).r.e(view);
            q60Var.getClass();
            i6 = fuVar.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // defpackage.b20
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.b20
    public final void c0(h20 h20Var, n20 n20Var) {
        Q0(h20Var, n20Var, true);
    }

    @Override // defpackage.b20
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.b20
    public final void d0(n20 n20Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.b20
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.b20
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof s60) {
            s60 s60Var = (s60) parcelable;
            this.F = s60Var;
            if (this.z != -1) {
                s60Var.f = -1;
                s60Var.g = -1;
                s60Var.i = null;
                s60Var.h = 0;
                s60Var.j = 0;
                s60Var.k = null;
                s60Var.l = null;
            }
            m0();
        }
    }

    @Override // defpackage.b20
    public final boolean f(c20 c20Var) {
        return c20Var instanceof q60;
    }

    @Override // defpackage.b20
    public final Parcelable f0() {
        int i;
        int k;
        int[] iArr;
        s60 s60Var = this.F;
        if (s60Var != null) {
            s60 s60Var2 = new s60();
            s60Var2.h = s60Var.h;
            s60Var2.f = s60Var.f;
            s60Var2.g = s60Var.g;
            s60Var2.i = s60Var.i;
            s60Var2.j = s60Var.j;
            s60Var2.k = s60Var.k;
            s60Var2.m = s60Var.m;
            s60Var2.n = s60Var.n;
            s60Var2.o = s60Var.o;
            s60Var2.l = s60Var.l;
            return s60Var2;
        }
        s60 s60Var3 = new s60();
        s60Var3.m = this.w;
        s60Var3.n = this.D;
        s60Var3.o = this.E;
        a5 a5Var = this.B;
        if (a5Var == null || (iArr = (int[]) a5Var.g) == null) {
            s60Var3.j = 0;
        } else {
            s60Var3.k = iArr;
            s60Var3.j = iArr.length;
            s60Var3.l = (ArrayList) a5Var.h;
        }
        if (v() <= 0) {
            s60Var3.f = -1;
            s60Var3.g = -1;
            s60Var3.h = 0;
            return s60Var3;
        }
        s60Var3.f = this.D ? J0() : I0();
        View E0 = this.x ? E0(true) : F0(true);
        s60Var3.g = E0 != null ? b20.H(E0) : -1;
        int i2 = this.p;
        s60Var3.h = i2;
        s60Var3.i = new int[i2];
        for (int i3 = 0; i3 < this.p; i3++) {
            boolean z = this.D;
            fu[] fuVarArr = this.q;
            ij ijVar = this.r;
            if (z) {
                i = fuVarArr[i3].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = ijVar.g();
                    i -= k;
                    s60Var3.i[i3] = i;
                } else {
                    s60Var3.i[i3] = i;
                }
            } else {
                i = fuVarArr[i3].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = ijVar.k();
                    i -= k;
                    s60Var3.i[i3] = i;
                } else {
                    s60Var3.i[i3] = i;
                }
            }
        }
        return s60Var3;
    }

    @Override // defpackage.b20
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // defpackage.b20
    public final void h(int i, int i2, n20 n20Var, ro roVar) {
        bs bsVar;
        int g;
        int i3;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, n20Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.p;
            bsVar = this.v;
            if (i4 >= i6) {
                break;
            }
            if (bsVar.d == -1) {
                g = bsVar.f;
                i3 = this.q[i4].i(g);
            } else {
                g = this.q[i4].g(bsVar.g);
                i3 = bsVar.g;
            }
            int i7 = g - i3;
            if (i7 >= 0) {
                this.J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = bsVar.c;
            if (i9 < 0 || i9 >= n20Var.b()) {
                return;
            }
            roVar.a(bsVar.c, this.J[i8]);
            bsVar.c += bsVar.d;
        }
    }

    @Override // defpackage.b20
    public final int j(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return kr.l(n20Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.b20
    public final int k(n20 n20Var) {
        return C0(n20Var);
    }

    @Override // defpackage.b20
    public final int l(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return kr.n(n20Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.b20
    public final int m(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return kr.l(n20Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.b20
    public final int n(n20 n20Var) {
        return C0(n20Var);
    }

    @Override // defpackage.b20
    public final int n0(int i, h20 h20Var, n20 n20Var) {
        return X0(i, h20Var, n20Var);
    }

    @Override // defpackage.b20
    public final int o(n20 n20Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return kr.n(n20Var, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.b20
    public final void o0(int i) {
        s60 s60Var = this.F;
        if (s60Var != null && s60Var.f != i) {
            s60Var.i = null;
            s60Var.h = 0;
            s60Var.f = -1;
            s60Var.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // defpackage.b20
    public final int p0(int i, h20 h20Var, n20 n20Var) {
        return X0(i, h20Var, n20Var);
    }

    @Override // defpackage.b20
    public final c20 r() {
        return this.t == 0 ? new q60(-2, -1) : new q60(-1, -2);
    }

    @Override // defpackage.b20
    public final c20 s(Context context, AttributeSet attributeSet) {
        return new q60(context, attributeSet);
    }

    @Override // defpackage.b20
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int F = F() + E();
        int D = D() + G();
        if (this.t == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ic0.a;
            g2 = b20.g(i2, height, recyclerView.getMinimumHeight());
            g = b20.g(i, (this.u * this.p) + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ic0.a;
            g = b20.g(i, width, recyclerView2.getMinimumWidth());
            g2 = b20.g(i2, (this.u * this.p) + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.b20
    public final c20 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q60((ViewGroup.MarginLayoutParams) layoutParams) : new q60(layoutParams);
    }

    @Override // defpackage.b20
    public final void y0(RecyclerView recyclerView, int i) {
        xs xsVar = new xs(recyclerView.getContext());
        xsVar.a = i;
        z0(xsVar);
    }

    public StaggeredGridLayoutManager() {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new a5(23, false);
        this.C = 2;
        this.G = new Rect();
        this.H = new p60(this);
        this.I = true;
        this.K = new j7(9, this);
        this.t = 1;
        Z0(2);
        this.v = new bs();
        this.r = ij.a(this, this.t);
        this.s = ij.a(this, 1 - this.t);
    }
}
