package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aq;
import defpackage.e90;
import defpackage.h5;
import defpackage.mz;
import defpackage.n7;
import defpackage.nz;
import defpackage.o8;
import defpackage.op;
import defpackage.oz;
import defpackage.sm;
import defpackage.tz;
import defpackage.w30;
import defpackage.wq;
import defpackage.wr;
import defpackage.x30;
import defpackage.y30;
import defpackage.yz;
import defpackage.z30;
import defpackage.zg;
import defpackage.zz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends nz implements yz {
    public final h5 B;
    public final int C;
    public boolean D;
    public boolean E;
    public z30 F;
    public final Rect G;
    public final w30 H;
    public final boolean I;
    public int[] J;
    public final n7 K;
    public final int p;
    public final wr[] q;
    public final zg r;
    public final zg s;
    public final int t;
    public int u;
    public final aq v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        h5 h5Var = new h5(21, false);
        this.B = h5Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new w30(this);
        this.I = true;
        this.K = new n7(9, this);
        mz I = nz.I(context, attributeSet, i, i2);
        int i3 = I.a;
        if (i3 != 0 && i3 != 1) {
            o8.j("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            zg zgVar = this.r;
            this.r = this.s;
            this.s = zgVar;
            m0();
        }
        int i4 = I.b;
        c(null);
        if (i4 != this.p) {
            h5Var.c();
            m0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new wr[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new wr(this, i5);
            }
            m0();
        }
        boolean z = I.c;
        c(null);
        z30 z30Var = this.F;
        if (z30Var != null && z30Var.m != z) {
            z30Var.m = z;
        }
        this.w = z;
        m0();
        aq aqVar = new aq();
        aqVar.a = true;
        aqVar.f = 0;
        aqVar.g = 0;
        this.v = aqVar;
        this.r = zg.a(this, this.t);
        this.s = zg.a(this, 1 - this.t);
    }

    public static int b1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.nz
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
                this.B.c();
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return op.k(zzVar, this.r, F0(z), E0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0270, code lost:
    
        T0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D0(tz tzVar, aq aqVar, zz zzVar) {
        wr[] wrVarArr;
        BitSet bitSet;
        int i;
        wr[] wrVarArr2;
        wr wrVar;
        ?? r5;
        int i2;
        int c;
        int i3;
        int i4;
        BitSet bitSet2;
        int i5;
        int i6;
        tz tzVar2 = tzVar;
        BitSet bitSet3 = this.y;
        int i7 = this.p;
        bitSet3.set(0, i7, true);
        aq aqVar2 = this.v;
        int i8 = aqVar2.i ? aqVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : aqVar.e == 1 ? aqVar.g + aqVar.b : aqVar.f - aqVar.b;
        int i9 = aqVar.e;
        int i10 = 0;
        while (true) {
            wrVarArr = this.q;
            if (i10 >= i7) {
                break;
            }
            if (!((ArrayList) wrVarArr[i10].f).isEmpty()) {
                a1(wrVarArr[i10], i9, i8);
            }
            i10++;
        }
        boolean z = this.x;
        zg zgVar = this.r;
        int g = z ? zgVar.g() : zgVar.k();
        boolean z2 = false;
        while (true) {
            int i11 = aqVar.c;
            if (i11 < 0 || i11 >= zzVar.b() || (!aqVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View d = tzVar2.d(aqVar.c);
            aqVar.c += aqVar.d;
            x30 x30Var = (x30) d.getLayoutParams();
            int b = x30Var.a.b();
            h5 h5Var = this.B;
            int[] iArr = (int[]) h5Var.g;
            int i12 = (iArr == null || b >= iArr.length) ? -1 : iArr[b];
            if (i12 == -1) {
                if (R0(aqVar.e)) {
                    i = i7;
                    i6 = i7 - 1;
                    i7 = -1;
                    i5 = -1;
                } else {
                    i = i7;
                    i5 = 1;
                    i6 = 0;
                }
                wr wrVar2 = null;
                int i13 = i5;
                if (aqVar.e == 1) {
                    int k = zgVar.k();
                    wrVarArr2 = wrVarArr;
                    int i14 = i6;
                    int i15 = Integer.MAX_VALUE;
                    while (i14 != i7) {
                        int i16 = i14;
                        wr wrVar3 = wrVarArr2[i16];
                        BitSet bitSet4 = bitSet3;
                        int g2 = wrVar3.g(k);
                        if (g2 < i15) {
                            i15 = g2;
                            wrVar2 = wrVar3;
                        }
                        i14 = i16 + i13;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    wrVarArr2 = wrVarArr;
                    int g3 = zgVar.g();
                    int i17 = i6;
                    int i18 = Integer.MIN_VALUE;
                    while (i17 != i7) {
                        wr wrVar4 = wrVarArr2[i17];
                        int i19 = i7;
                        int i20 = wrVar4.i(g3);
                        if (i20 > i18) {
                            i18 = i20;
                            wrVar2 = wrVar4;
                        }
                        i17 += i13;
                        i7 = i19;
                    }
                }
                wrVar = wrVar2;
                h5Var.s(b);
                ((int[]) h5Var.g)[b] = wrVar.e;
            } else {
                bitSet = bitSet3;
                i = i7;
                wrVarArr2 = wrVarArr;
                wrVar = wrVarArr2[i12];
            }
            x30Var.e = wrVar;
            if (aqVar.e == 1) {
                r5 = 0;
                b(d, -1, false);
            } else {
                r5 = 0;
                b(d, 0, false);
            }
            int i21 = this.t;
            if (i21 == 1) {
                P0(d, nz.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) x30Var).width), nz.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) x30Var).height));
            } else {
                P0(d, nz.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) x30Var).width), nz.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) x30Var).height));
            }
            if (aqVar.e == 1) {
                c = wrVar.g(g);
                i2 = zgVar.c(d) + c;
            } else {
                i2 = wrVar.i(g);
                c = i2 - zgVar.c(d);
            }
            int i22 = aqVar.e;
            wr wrVar5 = x30Var.e;
            if (i22 == 1) {
                wrVar5.getClass();
                x30 x30Var2 = (x30) d.getLayoutParams();
                x30Var2.e = wrVar5;
                ArrayList arrayList = (ArrayList) wrVar5.f;
                arrayList.add(d);
                wrVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    wrVar5.b = Integer.MIN_VALUE;
                }
                if (x30Var2.a.h() || x30Var2.a.k()) {
                    wrVar5.d = ((StaggeredGridLayoutManager) wrVar5.g).r.c(d) + wrVar5.d;
                }
            } else {
                wrVar5.getClass();
                x30 x30Var3 = (x30) d.getLayoutParams();
                x30Var3.e = wrVar5;
                ArrayList arrayList2 = (ArrayList) wrVar5.f;
                arrayList2.add(0, d);
                wrVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    wrVar5.c = Integer.MIN_VALUE;
                }
                if (x30Var3.a.h() || x30Var3.a.k()) {
                    wrVar5.d = ((StaggeredGridLayoutManager) wrVar5.g).r.c(d) + wrVar5.d;
                }
            }
            boolean O0 = O0();
            zg zgVar2 = this.s;
            if (O0 && i21 == 1) {
                i4 = zgVar2.g() - (((i - 1) - wrVar.e) * this.u);
                i3 = i4 - zgVar2.c(d);
            } else {
                int k2 = (wrVar.e * this.u) + zgVar2.k();
                int c2 = zgVar2.c(d) + k2;
                i3 = k2;
                i4 = c2;
            }
            z2 = true;
            if (i21 == 1) {
                nz.N(d, i3, c, i4, i2);
            } else {
                nz.N(d, c, i3, i2, i4);
            }
            a1(wrVar, aqVar2.e, i8);
            tzVar2 = tzVar;
            T0(tzVar2, aqVar2);
            if (aqVar2.h && d.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(wrVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i7 = i;
            wrVarArr = wrVarArr2;
        }
        int k3 = aqVar2.e == -1 ? zgVar.k() - L0(zgVar.k()) : K0(zgVar.g()) - zgVar.g();
        if (k3 > 0) {
            return Math.min(aqVar.b, k3);
        }
        return 0;
    }

    public final View E0(boolean z) {
        zg zgVar = this.r;
        int k = zgVar.k();
        int g = zgVar.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = zgVar.e(u);
            int b = zgVar.b(u);
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
        zg zgVar = this.r;
        int k = zgVar.k();
        int g = zgVar.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = zgVar.e(u);
            if (zgVar.b(u) > k && e < g) {
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

    public final void G0(tz tzVar, zz zzVar, boolean z) {
        int g;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g = this.r.g() - K0) > 0) {
            int i = g - (-X0(-g, tzVar, zzVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void H0(tz tzVar, zz zzVar, boolean z) {
        int k;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k = L0 - this.r.k()) > 0) {
            int X0 = k - X0(k, tzVar, zzVar);
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
        return nz.H(u(0));
    }

    public final int J0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return nz.H(u(v - 1));
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

    @Override // defpackage.nz
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
        h5 h5Var;
        int[] iArr;
        ArrayList arrayList;
        y30 y30Var;
        int i6;
        int J0 = this.x ? J0() : I0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                h5Var = this.B;
                iArr = (int[]) h5Var.g;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) h5Var.h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                y30Var = (y30) ((ArrayList) h5Var.h).get(size);
                                if (y30Var.f == i5) {
                                    break;
                                }
                            }
                        }
                        y30Var = null;
                        if (y30Var != null) {
                            ((ArrayList) h5Var.h).remove(y30Var);
                        }
                        int size2 = ((ArrayList) h5Var.h).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((y30) ((ArrayList) h5Var.h).get(i7)).f >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            y30 y30Var2 = (y30) ((ArrayList) h5Var.h).get(i7);
                            ((ArrayList) h5Var.h).remove(i7);
                            i6 = y30Var2.f;
                            int[] iArr2 = (int[]) h5Var.g;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) h5Var.g).length;
                            } else {
                                Arrays.fill((int[]) h5Var.g, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) h5Var.g;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    h5Var.z(i, i2);
                } else if (i3 == 2) {
                    h5Var.A(i, i2);
                } else if (i3 == 8) {
                    h5Var.A(i, 1);
                    h5Var.z(i2, 1);
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
        h5Var = this.B;
        iArr = (int[]) h5Var.g;
        if (iArr != null) {
            arrayList = (ArrayList) h5Var.h;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) h5Var.g;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > J0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View N0() {
        int v = v();
        int i = v - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        char c = (this.t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.x) {
            v = -1;
        } else {
            i = 0;
        }
        int i3 = i < v ? 1 : -1;
        while (i != v) {
            View u = u(i);
            x30 x30Var = (x30) u.getLayoutParams();
            boolean z = bitSet.get(x30Var.e.e);
            zg zgVar = this.r;
            if (z) {
                wr wrVar = x30Var.e;
                if (this.x) {
                    int i4 = wrVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        wrVar.a();
                        i4 = wrVar.c;
                    }
                    if (i4 < zgVar.g()) {
                        ArrayList arrayList = (ArrayList) wrVar.f;
                        ((x30) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u;
                    }
                } else {
                    int i5 = wrVar.b;
                    ArrayList arrayList2 = (ArrayList) wrVar.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        x30 x30Var2 = (x30) view.getLayoutParams();
                        wrVar.b = ((StaggeredGridLayoutManager) wrVar.g).r.e(view);
                        x30Var2.getClass();
                        i5 = wrVar.b;
                    }
                    if (i5 > zgVar.k()) {
                        ((x30) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u;
                    }
                }
                bitSet.clear(x30Var.e.e);
            }
            i += i3;
            if (i != v) {
                View u2 = u(i);
                if (this.x) {
                    int b = zgVar.b(u);
                    int b2 = zgVar.b(u2);
                    if (b < b2) {
                        return u;
                    }
                    if (b == b2) {
                        if ((x30Var.e.e - ((x30) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                            return u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = zgVar.e(u);
                    int e2 = zgVar.e(u2);
                    if (e > e2) {
                        return u;
                    }
                    if (e == e2) {
                        if ((x30Var.e.e - ((x30) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.nz
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            wr wrVar = this.q[i2];
            int i3 = wrVar.b;
            if (i3 != Integer.MIN_VALUE) {
                wrVar.b = i3 + i;
            }
            int i4 = wrVar.c;
            if (i4 != Integer.MIN_VALUE) {
                wrVar.c = i4 + i;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // defpackage.nz
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            wr wrVar = this.q[i2];
            int i3 = wrVar.b;
            if (i3 != Integer.MIN_VALUE) {
                wrVar.b = i3 + i;
            }
            int i4 = wrVar.c;
            if (i4 != Integer.MIN_VALUE) {
                wrVar.c = i4 + i;
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
        x30 x30Var = (x30) view.getLayoutParams();
        int b1 = b1(i, ((ViewGroup.MarginLayoutParams) x30Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) x30Var).rightMargin + rect.right);
        int b12 = b1(i2, ((ViewGroup.MarginLayoutParams) x30Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) x30Var).bottomMargin + rect.bottom);
        if (v0(view, b1, b12, x30Var)) {
            view.measure(b1, b12);
        }
    }

    @Override // defpackage.nz
    public final void Q() {
        this.B.c();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < I0()) != r17.x) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.x != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(tz tzVar, zz zzVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        z30 z30Var;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        z30 z30Var2 = this.F;
        w30 w30Var = this.H;
        if (!(z30Var2 == null && this.z == -1) && zzVar.b() == 0) {
            h0(tzVar);
            w30Var.a();
            return;
        }
        boolean z6 = w30Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = w30Var.g;
        boolean z7 = (z6 && this.z == -1 && this.F == null) ? false : true;
        wr[] wrVarArr = this.q;
        int i4 = this.p;
        h5 h5Var = this.B;
        if (z7) {
            w30Var.a();
            z30 z30Var3 = this.F;
            zg zgVar = this.r;
            if (z30Var3 != null) {
                int i5 = z30Var3.h;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            wrVarArr[i6].b();
                            z30 z30Var4 = this.F;
                            int i7 = z30Var4.i[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += z30Var4.n ? zgVar.g() : zgVar.k();
                            }
                            wr wrVar = wrVarArr[i6];
                            wrVar.b = i7;
                            wrVar.c = i7;
                        }
                    } else {
                        z30Var3.i = null;
                        z30Var3.h = 0;
                        z30Var3.j = 0;
                        z30Var3.k = null;
                        z30Var3.l = null;
                        z30Var3.f = z30Var3.g;
                    }
                }
                z30 z30Var5 = this.F;
                this.E = z30Var5.o;
                boolean z8 = z30Var5.m;
                c(null);
                z30 z30Var6 = this.F;
                if (z30Var6 != null && z30Var6.m != z8) {
                    z30Var6.m = z8;
                }
                this.w = z8;
                m0();
                W0();
                z30 z30Var7 = this.F;
                int i8 = z30Var7.f;
                if (i8 != -1) {
                    this.z = i8;
                    w30Var.c = z30Var7.n;
                } else {
                    w30Var.c = this.x;
                }
                if (z30Var7.j > 1) {
                    h5Var.g = z30Var7.k;
                    h5Var.h = z30Var7.l;
                }
            } else {
                W0();
                w30Var.c = this.x;
            }
            if (!zzVar.g && (i3 = this.z) != -1) {
                if (i3 < 0 || i3 >= zzVar.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    z30 z30Var8 = this.F;
                    if (z30Var8 == null || z30Var8.f == -1 || z30Var8.h < 1) {
                        View q = q(this.z);
                        if (q != null) {
                            w30Var.a = this.x ? J0() : I0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (w30Var.c) {
                                    w30Var.b = (zgVar.g() - this.A) - zgVar.b(q);
                                } else {
                                    w30Var.b = (zgVar.k() + this.A) - zgVar.e(q);
                                }
                            } else if (zgVar.c(q) > zgVar.l()) {
                                w30Var.b = w30Var.c ? zgVar.g() : zgVar.k();
                            } else {
                                int e = zgVar.e(q) - zgVar.k();
                                if (e < 0) {
                                    w30Var.b = -e;
                                } else {
                                    int g = zgVar.g() - zgVar.b(q);
                                    if (g < 0) {
                                        w30Var.b = g;
                                    } else {
                                        w30Var.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.z;
                            w30Var.a = i9;
                            int i10 = this.A;
                            if (i10 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                w30Var.c = z5;
                                zg zgVar2 = staggeredGridLayoutManager.r;
                                w30Var.b = z5 ? zgVar2.g() : zgVar2.k();
                            } else {
                                boolean z9 = w30Var.c;
                                zg zgVar3 = staggeredGridLayoutManager.r;
                                if (z9) {
                                    w30Var.b = zgVar3.g() - i10;
                                } else {
                                    w30Var.b = zgVar3.k() + i10;
                                }
                            }
                            z4 = true;
                            w30Var.d = true;
                            w30Var.e = z4;
                        }
                    } else {
                        w30Var.b = Integer.MIN_VALUE;
                        w30Var.a = this.z;
                    }
                    z4 = true;
                    w30Var.e = z4;
                }
            }
            if (this.D) {
                int b = zzVar.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i2 = nz.H(u(v));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    }
                }
                i2 = 0;
                w30Var.a = i2;
                w30Var.b = Integer.MIN_VALUE;
                z4 = true;
                w30Var.e = z4;
            } else {
                int b2 = zzVar.b();
                int v2 = v();
                for (int i11 = 0; i11 < v2; i11++) {
                    int H = nz.H(u(i11));
                    if (H >= 0 && H < b2) {
                        i2 = H;
                        break;
                    }
                }
                i2 = 0;
                w30Var.a = i2;
                w30Var.b = Integer.MIN_VALUE;
                z4 = true;
                w30Var.e = z4;
            }
        }
        if (this.F == null && this.z == -1 && !(w30Var.c == this.D && O0() == this.E)) {
            h5Var.c();
            i = 1;
            w30Var.d = true;
        } else {
            i = 1;
        }
        if (v() > 0 && ((z30Var = this.F) == null || z30Var.h < i)) {
            if (w30Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    wrVarArr[i12].b();
                    int i13 = w30Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        wr wrVar2 = wrVarArr[i12];
                        wrVar2.b = i13;
                        wrVar2.c = i13;
                    }
                }
            } else if (z7 || w30Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    wr wrVar3 = wrVarArr[i14];
                    boolean z10 = this.x;
                    int i15 = w30Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) wrVar3.g;
                    int g2 = z10 ? wrVar3.g(Integer.MIN_VALUE) : wrVar3.i(Integer.MIN_VALUE);
                    wrVar3.b();
                    if (g2 != Integer.MIN_VALUE && ((!z10 || g2 >= staggeredGridLayoutManager2.r.g()) && (z10 || g2 <= staggeredGridLayoutManager2.r.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            g2 += i15;
                        }
                        wrVar3.c = g2;
                        wrVar3.b = g2;
                    }
                }
                int length = wrVarArr.length;
                int[] iArr = w30Var.f;
                if (iArr == null || iArr.length < length) {
                    w30Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    w30Var.f[i16] = wrVarArr[i16].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    wr wrVar4 = wrVarArr[i17];
                    wrVar4.b();
                    int i18 = w30Var.f[i17];
                    wrVar4.b = i18;
                    wrVar4.c = i18;
                }
            }
        }
        p(tzVar);
        aq aqVar = this.v;
        aqVar.a = false;
        zg zgVar4 = this.s;
        int l = zgVar4.l();
        this.u = l / i4;
        View.MeasureSpec.makeMeasureSpec(l, zgVar4.i());
        Z0(w30Var.a, zzVar);
        if (w30Var.c) {
            Y0(-1);
            D0(tzVar, aqVar, zzVar);
            Y0(1);
            aqVar.c = w30Var.a + aqVar.d;
            D0(tzVar, aqVar, zzVar);
        } else {
            Y0(1);
            D0(tzVar, aqVar, zzVar);
            Y0(-1);
            aqVar.c = w30Var.a + aqVar.d;
            D0(tzVar, aqVar, zzVar);
        }
        if (zgVar4.i() != 1073741824) {
            int v3 = v();
            float f = 0.0f;
            for (int i19 = 0; i19 < v3; i19++) {
                View u = u(i19);
                float c = zgVar4.c(u);
                if (c >= f) {
                    ((x30) u.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i20 = this.u;
            int round = Math.round(f * i4);
            if (zgVar4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, zgVar4.l());
            }
            this.u = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, zgVar4.i());
            if (this.u != i20) {
                for (int i21 = 0; i21 < v3; i21++) {
                    View u2 = u(i21);
                    x30 x30Var = (x30) u2.getLayoutParams();
                    x30Var.getClass();
                    boolean O0 = O0();
                    int i22 = this.t;
                    if (O0 && i22 == 1) {
                        int i23 = -((i4 - 1) - x30Var.e.e);
                        u2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                    } else {
                        int i24 = x30Var.e.e;
                        int i25 = this.u * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            u2.offsetLeftAndRight(i25 - i26);
                        } else {
                            u2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (v() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            G0(tzVar, zzVar, true);
            H0(tzVar, zzVar, false);
        } else {
            z2 = true;
            H0(tzVar, zzVar, true);
            G0(tzVar, zzVar, false);
        }
        if (z && !zzVar.g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (B0()) {
                z3 = z2;
                if (zzVar.g) {
                    w30Var.a();
                }
                this.D = w30Var.c;
                this.E = O0();
                if (z3) {
                    return;
                }
                w30Var.a();
                Q0(tzVar, zzVar, false);
                return;
            }
        }
        z3 = false;
        if (zzVar.g) {
        }
        this.D = w30Var.c;
        this.E = O0();
        if (z3) {
        }
    }

    public final boolean R0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == O0();
    }

    @Override // defpackage.nz
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

    public final void S0(int i, zz zzVar) {
        int I0;
        int i2;
        if (i > 0) {
            I0 = J0();
            i2 = 1;
        } else {
            I0 = I0();
            i2 = -1;
        }
        aq aqVar = this.v;
        aqVar.a = true;
        Z0(I0, zzVar);
        Y0(i2);
        aqVar.c = I0 + aqVar.d;
        aqVar.b = Math.abs(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (O0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (O0() == false) goto L34;
     */
    @Override // defpackage.nz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, tz tzVar, zz zzVar) {
        View view2;
        int i2;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.a.d).contains(view2)) {
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
                    x30 x30Var = (x30) view2.getLayoutParams();
                    x30Var.getClass();
                    wr wrVar = x30Var.e;
                    int J0 = i2 == 1 ? J0() : I0();
                    Z0(J0, zzVar);
                    Y0(i2);
                    aq aqVar = this.v;
                    aqVar.c = aqVar.d + J0;
                    aqVar.b = (int) (this.r.l() * 0.33333334f);
                    aqVar.h = true;
                    aqVar.a = false;
                    D0(tzVar, aqVar, zzVar);
                    this.D = this.x;
                    View h = wrVar.h(J0, i2);
                    if (h != null && h != view2) {
                        return h;
                    }
                    boolean R0 = R0(i2);
                    wr[] wrVarArr = this.q;
                    int i4 = this.p;
                    if (R0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View h2 = wrVarArr[i5].h(J0, i2);
                            if (h2 != null && h2 != view2) {
                                return h2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View h3 = wrVarArr[i6].h(J0, i2);
                            if (h3 != null && h3 != view2) {
                                return h3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View q = q(z ? wrVar.c() : wrVar.d());
                    if (q != null && q != view2) {
                        return q;
                    }
                    if (R0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != wrVar.e) {
                                View q2 = q(z ? wrVarArr[i7].c() : wrVarArr[i7].d());
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View q3 = q(z ? wrVarArr[i8].c() : wrVarArr[i8].d());
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

    public final void T0(tz tzVar, aq aqVar) {
        if (!aqVar.a || aqVar.i) {
            return;
        }
        int i = aqVar.b;
        int i2 = aqVar.e;
        if (i == 0) {
            if (i2 == -1) {
                U0(tzVar, aqVar.g);
                return;
            } else {
                V0(tzVar, aqVar.f);
                return;
            }
        }
        int i3 = this.p;
        wr[] wrVarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = aqVar.f;
            int i6 = wrVarArr[0].i(i5);
            while (i4 < i3) {
                int i7 = wrVarArr[i4].i(i5);
                if (i7 > i6) {
                    i6 = i7;
                }
                i4++;
            }
            int i8 = i5 - i6;
            int i9 = aqVar.g;
            if (i8 >= 0) {
                i9 -= Math.min(i8, aqVar.b);
            }
            U0(tzVar, i9);
            return;
        }
        int i10 = aqVar.g;
        int g = wrVarArr[0].g(i10);
        while (i4 < i3) {
            int g2 = wrVarArr[i4].g(i10);
            if (g2 < g) {
                g = g2;
            }
            i4++;
        }
        int i11 = g - aqVar.g;
        int i12 = aqVar.f;
        if (i11 >= 0) {
            i12 += Math.min(i11, aqVar.b);
        }
        V0(tzVar, i12);
    }

    @Override // defpackage.nz
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 == null || E0 == null) {
                return;
            }
            int H = nz.H(F0);
            int H2 = nz.H(E0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final void U0(tz tzVar, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            zg zgVar = this.r;
            if (zgVar.e(u) < i || zgVar.n(u) < i) {
                return;
            }
            x30 x30Var = (x30) u.getLayoutParams();
            x30Var.getClass();
            if (((ArrayList) x30Var.e.f).size() == 1) {
                return;
            }
            wr wrVar = x30Var.e;
            ArrayList arrayList = (ArrayList) wrVar.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            x30 x30Var2 = (x30) view.getLayoutParams();
            x30Var2.e = null;
            if (x30Var2.a.h() || x30Var2.a.k()) {
                wrVar.d -= ((StaggeredGridLayoutManager) wrVar.g).r.c(view);
            }
            if (size == 1) {
                wrVar.b = Integer.MIN_VALUE;
            }
            wrVar.c = Integer.MIN_VALUE;
            j0(u, tzVar);
        }
    }

    public final void V0(tz tzVar, int i) {
        while (v() > 0) {
            View u = u(0);
            zg zgVar = this.r;
            if (zgVar.b(u) > i || zgVar.m(u) > i) {
                return;
            }
            x30 x30Var = (x30) u.getLayoutParams();
            x30Var.getClass();
            if (((ArrayList) x30Var.e.f).size() == 1) {
                return;
            }
            wr wrVar = x30Var.e;
            ArrayList arrayList = (ArrayList) wrVar.f;
            View view = (View) arrayList.remove(0);
            x30 x30Var2 = (x30) view.getLayoutParams();
            x30Var2.e = null;
            if (arrayList.size() == 0) {
                wrVar.c = Integer.MIN_VALUE;
            }
            if (x30Var2.a.h() || x30Var2.a.k()) {
                wrVar.d -= ((StaggeredGridLayoutManager) wrVar.g).r.c(view);
            }
            wrVar.b = Integer.MIN_VALUE;
            j0(u, tzVar);
        }
    }

    public final void W0() {
        if (this.t == 1 || !O0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.nz
    public final void X(int i, int i2) {
        M0(i, i2, 1);
    }

    public final int X0(int i, tz tzVar, zz zzVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        S0(i, zzVar);
        aq aqVar = this.v;
        int D0 = D0(tzVar, aqVar, zzVar);
        if (aqVar.b >= D0) {
            i = i < 0 ? -D0 : D0;
        }
        this.r.o(-i);
        this.D = this.x;
        aqVar.b = 0;
        T0(tzVar, aqVar);
        return i;
    }

    @Override // defpackage.nz
    public final void Y() {
        this.B.c();
        m0();
    }

    public final void Y0(int i) {
        aq aqVar = this.v;
        aqVar.e = i;
        aqVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.nz
    public final void Z(int i, int i2) {
        M0(i, i2, 8);
    }

    public final void Z0(int i, zz zzVar) {
        int i2;
        int i3;
        int i4;
        aq aqVar = this.v;
        boolean z = false;
        aqVar.b = 0;
        aqVar.c = i;
        wq wqVar = this.e;
        zg zgVar = this.r;
        if (wqVar == null || !wqVar.e || (i4 = zzVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i2 = zgVar.l();
                i3 = 0;
            } else {
                i3 = zgVar.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.l) {
            aqVar.g = zgVar.f() + i2;
            aqVar.f = -i3;
        } else {
            aqVar.f = zgVar.k() - i3;
            aqVar.g = zgVar.g() + i2;
        }
        aqVar.h = false;
        aqVar.a = true;
        if (zgVar.i() == 0 && zgVar.f() == 0) {
            z = true;
        }
        aqVar.i = z;
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
    @Override // defpackage.yz
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

    @Override // defpackage.nz
    public final void a0(int i, int i2) {
        M0(i, i2, 2);
    }

    public final void a1(wr wrVar, int i, int i2) {
        int i3 = wrVar.d;
        int i4 = wrVar.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = wrVar.c;
            if (i5 == Integer.MIN_VALUE) {
                wrVar.a();
                i5 = wrVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = wrVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) wrVar.f).get(0);
            x30 x30Var = (x30) view.getLayoutParams();
            wrVar.b = ((StaggeredGridLayoutManager) wrVar.g).r.e(view);
            x30Var.getClass();
            i6 = wrVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.nz
    public final void b0(int i, int i2) {
        M0(i, i2, 4);
    }

    @Override // defpackage.nz
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.nz
    public final void c0(tz tzVar, zz zzVar) {
        Q0(tzVar, zzVar, true);
    }

    @Override // defpackage.nz
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.nz
    public final void d0(zz zzVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.nz
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.nz
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof z30) {
            z30 z30Var = (z30) parcelable;
            this.F = z30Var;
            if (this.z != -1) {
                z30Var.f = -1;
                z30Var.g = -1;
                z30Var.i = null;
                z30Var.h = 0;
                z30Var.j = 0;
                z30Var.k = null;
                z30Var.l = null;
            }
            m0();
        }
    }

    @Override // defpackage.nz
    public final boolean f(oz ozVar) {
        return ozVar instanceof x30;
    }

    @Override // defpackage.nz
    public final Parcelable f0() {
        int i;
        int k;
        int[] iArr;
        z30 z30Var = this.F;
        if (z30Var != null) {
            z30 z30Var2 = new z30();
            z30Var2.h = z30Var.h;
            z30Var2.f = z30Var.f;
            z30Var2.g = z30Var.g;
            z30Var2.i = z30Var.i;
            z30Var2.j = z30Var.j;
            z30Var2.k = z30Var.k;
            z30Var2.m = z30Var.m;
            z30Var2.n = z30Var.n;
            z30Var2.o = z30Var.o;
            z30Var2.l = z30Var.l;
            return z30Var2;
        }
        z30 z30Var3 = new z30();
        z30Var3.m = this.w;
        z30Var3.n = this.D;
        z30Var3.o = this.E;
        h5 h5Var = this.B;
        if (h5Var == null || (iArr = (int[]) h5Var.g) == null) {
            z30Var3.j = 0;
        } else {
            z30Var3.k = iArr;
            z30Var3.j = iArr.length;
            z30Var3.l = (ArrayList) h5Var.h;
        }
        if (v() <= 0) {
            z30Var3.f = -1;
            z30Var3.g = -1;
            z30Var3.h = 0;
            return z30Var3;
        }
        z30Var3.f = this.D ? J0() : I0();
        View E0 = this.x ? E0(true) : F0(true);
        z30Var3.g = E0 != null ? nz.H(E0) : -1;
        int i2 = this.p;
        z30Var3.h = i2;
        z30Var3.i = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = this.D;
            zg zgVar = this.r;
            wr[] wrVarArr = this.q;
            if (z) {
                i = wrVarArr[i3].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = zgVar.g();
                    i -= k;
                    z30Var3.i[i3] = i;
                } else {
                    z30Var3.i[i3] = i;
                }
            } else {
                i = wrVarArr[i3].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = zgVar.k();
                    i -= k;
                    z30Var3.i[i3] = i;
                } else {
                    z30Var3.i[i3] = i;
                }
            }
        }
        return z30Var3;
    }

    @Override // defpackage.nz
    public final void g0(int i) {
        if (i == 0) {
            B0();
        }
    }

    @Override // defpackage.nz
    public final void h(int i, int i2, zz zzVar, sm smVar) {
        aq aqVar;
        int g;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        S0(i, zzVar);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            aqVar = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = aqVar.d;
            wr[] wrVarArr = this.q;
            if (i6 == -1) {
                int i7 = aqVar.f;
                g = i7 - wrVarArr[i4].i(i7);
            } else {
                g = wrVarArr[i4].g(aqVar.g) - aqVar.g;
            }
            if (g >= 0) {
                this.J[i5] = g;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = aqVar.c;
            if (i9 < 0 || i9 >= zzVar.b()) {
                return;
            }
            smVar.a(aqVar.c, this.J[i8]);
            aqVar.c += aqVar.d;
        }
    }

    @Override // defpackage.nz
    public final int j(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return op.j(zzVar, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.nz
    public final int k(zz zzVar) {
        return C0(zzVar);
    }

    @Override // defpackage.nz
    public final int l(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return op.l(zzVar, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.nz
    public final int m(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return op.j(zzVar, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.nz
    public final int n(zz zzVar) {
        return C0(zzVar);
    }

    @Override // defpackage.nz
    public final int n0(int i, tz tzVar, zz zzVar) {
        return X0(i, tzVar, zzVar);
    }

    @Override // defpackage.nz
    public final int o(zz zzVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return op.l(zzVar, this.r, F0(z), E0(z), this, this.I);
    }

    @Override // defpackage.nz
    public final void o0(int i) {
        z30 z30Var = this.F;
        if (z30Var != null && z30Var.f != i) {
            z30Var.i = null;
            z30Var.h = 0;
            z30Var.f = -1;
            z30Var.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // defpackage.nz
    public final int p0(int i, tz tzVar, zz zzVar) {
        return X0(i, tzVar, zzVar);
    }

    @Override // defpackage.nz
    public final oz r() {
        return this.t == 0 ? new x30(-2, -1) : new x30(-1, -2);
    }

    @Override // defpackage.nz
    public final oz s(Context context, AttributeSet attributeSet) {
        return new x30(context, attributeSet);
    }

    @Override // defpackage.nz
    public final void s0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int F = F() + E();
        int D = D() + G();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = e90.a;
            g2 = nz.g(i2, height, recyclerView.getMinimumHeight());
            g = nz.g(i, (this.u * i4) + F, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = e90.a;
            g = nz.g(i, width, recyclerView2.getMinimumWidth());
            g2 = nz.g(i2, (this.u * i4) + D, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.nz
    public final oz t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new x30((ViewGroup.MarginLayoutParams) layoutParams) : new x30(layoutParams);
    }

    @Override // defpackage.nz
    public final void y0(RecyclerView recyclerView, int i) {
        wq wqVar = new wq(recyclerView.getContext());
        wqVar.a = i;
        z0(wqVar);
    }
}
