package androidx.recyclerview.widget;

import a2.s;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.g;
import b1.g1;
import b1.h1;
import b1.i1;
import b1.j1;
import b1.k1;
import b1.m0;
import b1.n0;
import b1.o;
import b1.o0;
import b1.t0;
import b1.x;
import b1.y0;
import b1.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import k0.j0;
import k3.d;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends n0 implements y0 {
    public final s B;
    public final int C;
    public boolean D;
    public boolean E;
    public j1 F;
    public final Rect G;
    public final g1 H;
    public final boolean I;
    public int[] J;
    public final g K;

    /* renamed from: p, reason: collision with root package name */
    public final int f671p;

    /* renamed from: q, reason: collision with root package name */
    public final k1[] f672q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.emoji2.text.g f673r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.emoji2.text.g f674s;

    /* renamed from: t, reason: collision with root package name */
    public final int f675t;

    /* renamed from: u, reason: collision with root package name */
    public int f676u;

    /* renamed from: v, reason: collision with root package name */
    public final b1.s f677v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f678w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f680y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f679x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f681z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f671p = -1;
        this.f678w = false;
        s sVar = new s(8, false);
        this.B = sVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new g1(this);
        this.I = true;
        this.K = new g(4, this);
        m0 I = n0.I(context, attributeSet, i4, i5);
        int i6 = I.f845a;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i6 != this.f675t) {
            this.f675t = i6;
            androidx.emoji2.text.g gVar = this.f673r;
            this.f673r = this.f674s;
            this.f674s = gVar;
            m0();
        }
        int i7 = I.f846b;
        c(null);
        if (i7 != this.f671p) {
            sVar.c();
            m0();
            this.f671p = i7;
            this.f680y = new BitSet(this.f671p);
            this.f672q = new k1[this.f671p];
            for (int i8 = 0; i8 < this.f671p; i8++) {
                this.f672q[i8] = new k1(this, i8);
            }
            m0();
        }
        boolean z3 = I.c;
        c(null);
        j1 j1Var = this.F;
        if (j1Var != null && j1Var.f826m != z3) {
            j1Var.f826m = z3;
        }
        this.f678w = z3;
        m0();
        b1.s sVar2 = new b1.s();
        sVar2.f905a = true;
        sVar2.f909f = 0;
        sVar2.g = 0;
        this.f677v = sVar2;
        this.f673r = androidx.emoji2.text.g.a(this, this.f675t);
        this.f674s = androidx.emoji2.text.g.a(this, 1 - this.f675t);
    }

    public static int b1(int i4, int i5, int i6) {
        int mode;
        return (!(i5 == 0 && i6 == 0) && ((mode = View.MeasureSpec.getMode(i4)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    @Override // b1.n0
    public final boolean A0() {
        return this.F == null;
    }

    public final boolean B0() {
        int I0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.f679x) {
                I0 = J0();
                I0();
            } else {
                I0 = I0();
                J0();
            }
            if (I0 == 0 && N0() != null) {
                this.B.c();
                this.f878f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int C0(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return d.m(z0Var, this.f673r, F0(z3), E0(z3), this, this.I, this.f679x);
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
    public final int D0(t0 t0Var, b1.s sVar, z0 z0Var) {
        k1 k1Var;
        ?? r8;
        int i4;
        int c;
        int k4;
        int c4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 1;
        this.f680y.set(0, this.f671p, true);
        b1.s sVar2 = this.f677v;
        int i10 = sVar2.f910i ? sVar.f908e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : sVar.f908e == 1 ? sVar.g + sVar.f906b : sVar.f909f - sVar.f906b;
        int i11 = sVar.f908e;
        for (int i12 = 0; i12 < this.f671p; i12++) {
            if (!((ArrayList) this.f672q[i12].f834f).isEmpty()) {
                a1(this.f672q[i12], i11, i10);
            }
        }
        int g = this.f679x ? this.f673r.g() : this.f673r.k();
        boolean z3 = false;
        while (true) {
            int i13 = sVar.c;
            if (i13 < 0 || i13 >= z0Var.b() || (!sVar2.f910i && this.f680y.isEmpty())) {
                break;
            }
            View d4 = t0Var.d(sVar.c);
            sVar.c += sVar.f907d;
            h1 h1Var = (h1) d4.getLayoutParams();
            int b2 = h1Var.f889a.b();
            s sVar3 = this.B;
            int[] iArr = (int[]) sVar3.g;
            int i14 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i14 == -1) {
                if (R0(sVar.f908e)) {
                    i7 = this.f671p - i9;
                    i6 = -1;
                    i5 = -1;
                } else {
                    i5 = i9;
                    i6 = this.f671p;
                    i7 = i8;
                }
                k1 k1Var2 = null;
                if (sVar.f908e == i9) {
                    int k5 = this.f673r.k();
                    int i15 = Integer.MAX_VALUE;
                    while (i7 != i6) {
                        k1 k1Var3 = this.f672q[i7];
                        int g4 = k1Var3.g(k5);
                        if (g4 < i15) {
                            i15 = g4;
                            k1Var2 = k1Var3;
                        }
                        i7 += i5;
                    }
                } else {
                    int g5 = this.f673r.g();
                    int i16 = Integer.MIN_VALUE;
                    while (i7 != i6) {
                        k1 k1Var4 = this.f672q[i7];
                        int i17 = k1Var4.i(g5);
                        if (i17 > i16) {
                            k1Var2 = k1Var4;
                            i16 = i17;
                        }
                        i7 += i5;
                    }
                }
                k1Var = k1Var2;
                sVar3.t(b2);
                ((int[]) sVar3.g)[b2] = k1Var.f833e;
            } else {
                k1Var = this.f672q[i14];
            }
            h1Var.f796e = k1Var;
            if (sVar.f908e == 1) {
                r8 = 0;
                b(d4, -1, false);
            } else {
                r8 = 0;
                b(d4, 0, false);
            }
            if (this.f675t == 1) {
                P0(d4, n0.w(r8, this.f676u, this.f882l, r8, ((ViewGroup.MarginLayoutParams) h1Var).width), n0.w(true, this.f885o, this.f883m, D() + G(), ((ViewGroup.MarginLayoutParams) h1Var).height));
            } else {
                P0(d4, n0.w(true, this.f884n, this.f882l, F() + E(), ((ViewGroup.MarginLayoutParams) h1Var).width), n0.w(false, this.f676u, this.f883m, 0, ((ViewGroup.MarginLayoutParams) h1Var).height));
            }
            if (sVar.f908e == 1) {
                c = k1Var.g(g);
                i4 = this.f673r.c(d4) + c;
            } else {
                i4 = k1Var.i(g);
                c = i4 - this.f673r.c(d4);
            }
            if (sVar.f908e == 1) {
                k1 k1Var5 = h1Var.f796e;
                k1Var5.getClass();
                h1 h1Var2 = (h1) d4.getLayoutParams();
                h1Var2.f796e = k1Var5;
                ArrayList arrayList = (ArrayList) k1Var5.f834f;
                arrayList.add(d4);
                k1Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    k1Var5.f831b = Integer.MIN_VALUE;
                }
                if (h1Var2.f889a.h() || h1Var2.f889a.k()) {
                    k1Var5.f832d = ((StaggeredGridLayoutManager) k1Var5.g).f673r.c(d4) + k1Var5.f832d;
                }
            } else {
                k1 k1Var6 = h1Var.f796e;
                k1Var6.getClass();
                h1 h1Var3 = (h1) d4.getLayoutParams();
                h1Var3.f796e = k1Var6;
                ArrayList arrayList2 = (ArrayList) k1Var6.f834f;
                arrayList2.add(0, d4);
                k1Var6.f831b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    k1Var6.c = Integer.MIN_VALUE;
                }
                if (h1Var3.f889a.h() || h1Var3.f889a.k()) {
                    k1Var6.f832d = ((StaggeredGridLayoutManager) k1Var6.g).f673r.c(d4) + k1Var6.f832d;
                }
            }
            if (O0() && this.f675t == 1) {
                c4 = this.f674s.g() - (((this.f671p - 1) - k1Var.f833e) * this.f676u);
                k4 = c4 - this.f674s.c(d4);
            } else {
                k4 = this.f674s.k() + (k1Var.f833e * this.f676u);
                c4 = this.f674s.c(d4) + k4;
            }
            if (this.f675t == 1) {
                n0.N(d4, k4, c, c4, i4);
            } else {
                n0.N(d4, c, k4, i4, c4);
            }
            a1(k1Var, sVar2.f908e, i10);
            T0(t0Var, sVar2);
            if (sVar2.h && d4.hasFocusable()) {
                this.f680y.set(k1Var.f833e, false);
            }
            i9 = 1;
            z3 = true;
            i8 = 0;
        }
        int k6 = sVar2.f908e == -1 ? this.f673r.k() - L0(this.f673r.k()) : K0(this.f673r.g()) - this.f673r.g();
        if (k6 > 0) {
            return Math.min(sVar.f906b, k6);
        }
        return 0;
    }

    public final View E0(boolean z3) {
        int k4 = this.f673r.k();
        int g = this.f673r.g();
        View view = null;
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            int e4 = this.f673r.e(u3);
            int b2 = this.f673r.b(u3);
            if (b2 > k4 && e4 < g) {
                if (b2 <= g || !z3) {
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
        int k4 = this.f673r.k();
        int g = this.f673r.g();
        int v3 = v();
        View view = null;
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = u(i4);
            int e4 = this.f673r.e(u3);
            if (this.f673r.b(u3) > k4 && e4 < g) {
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

    public final void G0(t0 t0Var, z0 z0Var, boolean z3) {
        int g;
        int K0 = K0(Integer.MIN_VALUE);
        if (K0 != Integer.MIN_VALUE && (g = this.f673r.g() - K0) > 0) {
            int i4 = g - (-X0(-g, t0Var, z0Var));
            if (!z3 || i4 <= 0) {
                return;
            }
            this.f673r.o(i4);
        }
    }

    public final void H0(t0 t0Var, z0 z0Var, boolean z3) {
        int k4;
        int L0 = L0(Integer.MAX_VALUE);
        if (L0 != Integer.MAX_VALUE && (k4 = L0 - this.f673r.k()) > 0) {
            int X0 = k4 - X0(k4, t0Var, z0Var);
            if (!z3 || X0 <= 0) {
                return;
            }
            this.f673r.o(-X0);
        }
    }

    public final int I0() {
        if (v() == 0) {
            return 0;
        }
        return n0.H(u(0));
    }

    public final int J0() {
        int v3 = v();
        if (v3 == 0) {
            return 0;
        }
        return n0.H(u(v3 - 1));
    }

    public final int K0(int i4) {
        int g = this.f672q[0].g(i4);
        for (int i5 = 1; i5 < this.f671p; i5++) {
            int g4 = this.f672q[i5].g(i4);
            if (g4 > g) {
                g = g4;
            }
        }
        return g;
    }

    @Override // b1.n0
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0(int i4) {
        int i5 = this.f672q[0].i(i4);
        for (int i6 = 1; i6 < this.f671p; i6++) {
            int i7 = this.f672q[i6].i(i4);
            if (i7 < i5) {
                i5 = i7;
            }
        }
        return i5;
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
    public final void M0(int i4, int i5, int i6) {
        int i7;
        int i8;
        s sVar;
        int[] iArr;
        ArrayList arrayList;
        i1 i1Var;
        int i9;
        int J0 = this.f679x ? J0() : I0();
        if (i6 != 8) {
            i7 = i4 + i5;
        } else {
            if (i4 >= i5) {
                i7 = i4 + 1;
                i8 = i5;
                sVar = this.B;
                iArr = (int[]) sVar.g;
                if (iArr != null && i8 < iArr.length) {
                    arrayList = (ArrayList) sVar.h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                i1Var = (i1) ((ArrayList) sVar.h).get(size);
                                if (i1Var.f803f == i8) {
                                    break;
                                }
                            }
                        }
                        i1Var = null;
                        if (i1Var != null) {
                            ((ArrayList) sVar.h).remove(i1Var);
                        }
                        int size2 = ((ArrayList) sVar.h).size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size2) {
                                i10 = -1;
                                break;
                            } else if (((i1) ((ArrayList) sVar.h).get(i10)).f803f >= i8) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (i10 != -1) {
                            i1 i1Var2 = (i1) ((ArrayList) sVar.h).get(i10);
                            ((ArrayList) sVar.h).remove(i10);
                            i9 = i1Var2.f803f;
                            if (i9 == -1) {
                                int[] iArr2 = (int[]) sVar.g;
                                Arrays.fill(iArr2, i8, iArr2.length, -1);
                                int length = ((int[]) sVar.g).length;
                            } else {
                                Arrays.fill((int[]) sVar.g, i8, Math.min(i9 + 1, ((int[]) sVar.g).length), -1);
                            }
                        }
                    }
                    i9 = -1;
                    if (i9 == -1) {
                    }
                }
                if (i6 != 1) {
                    sVar.y(i4, i5);
                } else if (i6 == 2) {
                    sVar.z(i4, i5);
                } else if (i6 == 8) {
                    sVar.z(i4, 1);
                    sVar.y(i5, 1);
                }
                if (i7 > J0) {
                    return;
                }
                if (i8 <= (this.f679x ? I0() : J0())) {
                    m0();
                    return;
                }
                return;
            }
            i7 = i5 + 1;
        }
        i8 = i4;
        sVar = this.B;
        iArr = (int[]) sVar.g;
        if (iArr != null) {
            arrayList = (ArrayList) sVar.h;
            if (arrayList != null) {
            }
            i9 = -1;
            if (i9 == -1) {
            }
        }
        if (i6 != 1) {
        }
        if (i7 > J0) {
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
        int i4 = v3 - 1;
        BitSet bitSet = new BitSet(this.f671p);
        bitSet.set(0, this.f671p, true);
        char c = (this.f675t == 1 && O0()) ? (char) 1 : (char) 65535;
        if (this.f679x) {
            v3 = -1;
        } else {
            i4 = 0;
        }
        int i5 = i4 < v3 ? 1 : -1;
        while (i4 != v3) {
            View u3 = u(i4);
            h1 h1Var = (h1) u3.getLayoutParams();
            if (bitSet.get(h1Var.f796e.f833e)) {
                k1 k1Var = h1Var.f796e;
                if (this.f679x) {
                    int i6 = k1Var.c;
                    if (i6 == Integer.MIN_VALUE) {
                        k1Var.a();
                        i6 = k1Var.c;
                    }
                    if (i6 < this.f673r.g()) {
                        ArrayList arrayList = (ArrayList) k1Var.f834f;
                        ((h1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u3;
                    }
                } else {
                    int i7 = k1Var.f831b;
                    ArrayList arrayList2 = (ArrayList) k1Var.f834f;
                    if (i7 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        h1 h1Var2 = (h1) view.getLayoutParams();
                        k1Var.f831b = ((StaggeredGridLayoutManager) k1Var.g).f673r.e(view);
                        h1Var2.getClass();
                        i7 = k1Var.f831b;
                    }
                    if (i7 > this.f673r.k()) {
                        ((h1) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u3;
                    }
                }
                bitSet.clear(h1Var.f796e.f833e);
            }
            i4 += i5;
            if (i4 != v3) {
                View u4 = u(i4);
                if (this.f679x) {
                    int b2 = this.f673r.b(u3);
                    int b4 = this.f673r.b(u4);
                    if (b2 < b4) {
                        return u3;
                    }
                    if (b2 == b4) {
                        if ((h1Var.f796e.f833e - ((h1) u4.getLayoutParams()).f796e.f833e >= 0) == (c >= 0)) {
                            return u3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e4 = this.f673r.e(u3);
                    int e5 = this.f673r.e(u4);
                    if (e4 > e5) {
                        return u3;
                    }
                    if (e4 == e5) {
                        if ((h1Var.f796e.f833e - ((h1) u4.getLayoutParams()).f796e.f833e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // b1.n0
    public final void O(int i4) {
        super.O(i4);
        for (int i5 = 0; i5 < this.f671p; i5++) {
            k1 k1Var = this.f672q[i5];
            int i6 = k1Var.f831b;
            if (i6 != Integer.MIN_VALUE) {
                k1Var.f831b = i6 + i4;
            }
            int i7 = k1Var.c;
            if (i7 != Integer.MIN_VALUE) {
                k1Var.c = i7 + i4;
            }
        }
    }

    public final boolean O0() {
        return C() == 1;
    }

    @Override // b1.n0
    public final void P(int i4) {
        super.P(i4);
        for (int i5 = 0; i5 < this.f671p; i5++) {
            k1 k1Var = this.f672q[i5];
            int i6 = k1Var.f831b;
            if (i6 != Integer.MIN_VALUE) {
                k1Var.f831b = i6 + i4;
            }
            int i7 = k1Var.c;
            if (i7 != Integer.MIN_VALUE) {
                k1Var.c = i7 + i4;
            }
        }
    }

    public final void P0(View view, int i4, int i5) {
        RecyclerView recyclerView = this.f875b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        h1 h1Var = (h1) view.getLayoutParams();
        int b12 = b1(i4, ((ViewGroup.MarginLayoutParams) h1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) h1Var).rightMargin + rect.right);
        int b13 = b1(i5, ((ViewGroup.MarginLayoutParams) h1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) h1Var).bottomMargin + rect.bottom);
        if (v0(view, b12, b13, h1Var)) {
            view.measure(b12, b13);
        }
    }

    @Override // b1.n0
    public final void Q() {
        this.B.c();
        for (int i4 = 0; i4 < this.f671p; i4++) {
            this.f672q[i4].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r11 < I0()) != r16.f679x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0416, code lost:
    
        if (B0() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f679x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(t0 t0Var, z0 z0Var, boolean z3) {
        j1 j1Var;
        int i4;
        int i5;
        boolean z4;
        j1 j1Var2 = this.F;
        g1 g1Var = this.H;
        if (!(j1Var2 == null && this.f681z == -1) && z0Var.b() == 0) {
            h0(t0Var);
            g1Var.a();
            return;
        }
        boolean z5 = g1Var.f789e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = g1Var.g;
        boolean z6 = true;
        boolean z7 = (z5 && this.f681z == -1 && this.F == null) ? false : true;
        s sVar = this.B;
        if (z7) {
            g1Var.a();
            j1 j1Var3 = this.F;
            if (j1Var3 != null) {
                int i6 = j1Var3.h;
                if (i6 > 0) {
                    if (i6 == this.f671p) {
                        for (int i7 = 0; i7 < this.f671p; i7++) {
                            this.f672q[i7].b();
                            j1 j1Var4 = this.F;
                            int i8 = j1Var4.f822i[i7];
                            if (i8 != Integer.MIN_VALUE) {
                                i8 += j1Var4.f827n ? this.f673r.g() : this.f673r.k();
                            }
                            k1 k1Var = this.f672q[i7];
                            k1Var.f831b = i8;
                            k1Var.c = i8;
                        }
                    } else {
                        j1Var3.f822i = null;
                        j1Var3.h = 0;
                        j1Var3.f823j = 0;
                        j1Var3.f824k = null;
                        j1Var3.f825l = null;
                        j1Var3.f821f = j1Var3.g;
                    }
                }
                j1 j1Var5 = this.F;
                this.E = j1Var5.f828o;
                boolean z8 = j1Var5.f826m;
                c(null);
                j1 j1Var6 = this.F;
                if (j1Var6 != null && j1Var6.f826m != z8) {
                    j1Var6.f826m = z8;
                }
                this.f678w = z8;
                m0();
                W0();
                j1 j1Var7 = this.F;
                int i9 = j1Var7.f821f;
                if (i9 != -1) {
                    this.f681z = i9;
                    g1Var.c = j1Var7.f827n;
                } else {
                    g1Var.c = this.f679x;
                }
                if (j1Var7.f823j > 1) {
                    sVar.g = j1Var7.f824k;
                    sVar.h = j1Var7.f825l;
                }
            } else {
                W0();
                g1Var.c = this.f679x;
            }
            if (!z0Var.g && (i5 = this.f681z) != -1) {
                if (i5 < 0 || i5 >= z0Var.b()) {
                    this.f681z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    j1 j1Var8 = this.F;
                    if (j1Var8 == null || j1Var8.f821f == -1 || j1Var8.h < 1) {
                        View q4 = q(this.f681z);
                        if (q4 != null) {
                            g1Var.f786a = this.f679x ? J0() : I0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (g1Var.c) {
                                    g1Var.f787b = (this.f673r.g() - this.A) - this.f673r.b(q4);
                                } else {
                                    g1Var.f787b = (this.f673r.k() + this.A) - this.f673r.e(q4);
                                }
                            } else if (this.f673r.c(q4) > this.f673r.l()) {
                                g1Var.f787b = g1Var.c ? this.f673r.g() : this.f673r.k();
                            } else {
                                int e4 = this.f673r.e(q4) - this.f673r.k();
                                if (e4 < 0) {
                                    g1Var.f787b = -e4;
                                } else {
                                    int g = this.f673r.g() - this.f673r.b(q4);
                                    if (g < 0) {
                                        g1Var.f787b = g;
                                    } else {
                                        g1Var.f787b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i10 = this.f681z;
                            g1Var.f786a = i10;
                            int i11 = this.A;
                            if (i11 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                g1Var.c = z4;
                                g1Var.f787b = z4 ? staggeredGridLayoutManager.f673r.g() : staggeredGridLayoutManager.f673r.k();
                            } else if (g1Var.c) {
                                g1Var.f787b = staggeredGridLayoutManager.f673r.g() - i11;
                            } else {
                                g1Var.f787b = staggeredGridLayoutManager.f673r.k() + i11;
                            }
                            g1Var.f788d = true;
                        }
                    } else {
                        g1Var.f787b = Integer.MIN_VALUE;
                        g1Var.f786a = this.f681z;
                    }
                    g1Var.f789e = true;
                }
            }
            if (this.D) {
                int b2 = z0Var.b();
                for (int v3 = v() - 1; v3 >= 0; v3--) {
                    i4 = n0.H(u(v3));
                    if (i4 >= 0 && i4 < b2) {
                        break;
                    }
                }
                i4 = 0;
                g1Var.f786a = i4;
                g1Var.f787b = Integer.MIN_VALUE;
                g1Var.f789e = true;
            } else {
                int b4 = z0Var.b();
                int v4 = v();
                for (int i12 = 0; i12 < v4; i12++) {
                    int H = n0.H(u(i12));
                    if (H >= 0 && H < b4) {
                        i4 = H;
                        break;
                    }
                }
                i4 = 0;
                g1Var.f786a = i4;
                g1Var.f787b = Integer.MIN_VALUE;
                g1Var.f789e = true;
            }
        }
        if (this.F == null && this.f681z == -1 && (g1Var.c != this.D || O0() != this.E)) {
            sVar.c();
            g1Var.f788d = true;
        }
        if (v() > 0 && ((j1Var = this.F) == null || j1Var.h < 1)) {
            if (g1Var.f788d) {
                for (int i13 = 0; i13 < this.f671p; i13++) {
                    this.f672q[i13].b();
                    int i14 = g1Var.f787b;
                    if (i14 != Integer.MIN_VALUE) {
                        k1 k1Var2 = this.f672q[i13];
                        k1Var2.f831b = i14;
                        k1Var2.c = i14;
                    }
                }
            } else if (z7 || g1Var.f790f == null) {
                for (int i15 = 0; i15 < this.f671p; i15++) {
                    k1 k1Var3 = this.f672q[i15];
                    boolean z9 = this.f679x;
                    int i16 = g1Var.f787b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) k1Var3.g;
                    int g4 = z9 ? k1Var3.g(Integer.MIN_VALUE) : k1Var3.i(Integer.MIN_VALUE);
                    k1Var3.b();
                    if (g4 != Integer.MIN_VALUE && ((!z9 || g4 >= staggeredGridLayoutManager2.f673r.g()) && (z9 || g4 <= staggeredGridLayoutManager2.f673r.k()))) {
                        if (i16 != Integer.MIN_VALUE) {
                            g4 += i16;
                        }
                        k1Var3.c = g4;
                        k1Var3.f831b = g4;
                    }
                }
                k1[] k1VarArr = this.f672q;
                int length = k1VarArr.length;
                int[] iArr = g1Var.f790f;
                if (iArr == null || iArr.length < length) {
                    g1Var.f790f = new int[staggeredGridLayoutManager.f672q.length];
                }
                for (int i17 = 0; i17 < length; i17++) {
                    g1Var.f790f[i17] = k1VarArr[i17].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i18 = 0; i18 < this.f671p; i18++) {
                    k1 k1Var4 = this.f672q[i18];
                    k1Var4.b();
                    int i19 = g1Var.f790f[i18];
                    k1Var4.f831b = i19;
                    k1Var4.c = i19;
                }
            }
        }
        p(t0Var);
        b1.s sVar2 = this.f677v;
        sVar2.f905a = false;
        int l4 = this.f674s.l();
        this.f676u = l4 / this.f671p;
        View.MeasureSpec.makeMeasureSpec(l4, this.f674s.i());
        Z0(g1Var.f786a, z0Var);
        if (g1Var.c) {
            Y0(-1);
            D0(t0Var, sVar2, z0Var);
            Y0(1);
            sVar2.c = g1Var.f786a + sVar2.f907d;
            D0(t0Var, sVar2, z0Var);
        } else {
            Y0(1);
            D0(t0Var, sVar2, z0Var);
            Y0(-1);
            sVar2.c = g1Var.f786a + sVar2.f907d;
            D0(t0Var, sVar2, z0Var);
        }
        if (this.f674s.i() != 1073741824) {
            int v5 = v();
            float f4 = 0.0f;
            for (int i20 = 0; i20 < v5; i20++) {
                View u3 = u(i20);
                float c = this.f674s.c(u3);
                if (c >= f4) {
                    ((h1) u3.getLayoutParams()).getClass();
                    f4 = Math.max(f4, c);
                }
            }
            int i21 = this.f676u;
            int round = Math.round(f4 * this.f671p);
            if (this.f674s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f674s.l());
            }
            this.f676u = round / this.f671p;
            View.MeasureSpec.makeMeasureSpec(round, this.f674s.i());
            if (this.f676u != i21) {
                for (int i22 = 0; i22 < v5; i22++) {
                    View u4 = u(i22);
                    h1 h1Var = (h1) u4.getLayoutParams();
                    h1Var.getClass();
                    if (O0() && this.f675t == 1) {
                        int i23 = -((this.f671p - 1) - h1Var.f796e.f833e);
                        u4.offsetLeftAndRight((this.f676u * i23) - (i23 * i21));
                    } else {
                        int i24 = h1Var.f796e.f833e;
                        int i25 = this.f676u * i24;
                        int i26 = i24 * i21;
                        if (this.f675t == 1) {
                            u4.offsetLeftAndRight(i25 - i26);
                        } else {
                            u4.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f679x) {
                G0(t0Var, z0Var, true);
                H0(t0Var, z0Var, false);
            } else {
                H0(t0Var, z0Var, true);
                G0(t0Var, z0Var, false);
            }
        }
        if (z3 && !z0Var.g && this.C != 0 && v() > 0 && N0() != null) {
            RecyclerView recyclerView = this.f875b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
        }
        z6 = false;
        if (z0Var.g) {
            g1Var.a();
        }
        this.D = g1Var.c;
        this.E = O0();
        if (z6) {
            g1Var.a();
            Q0(t0Var, z0Var, false);
        }
    }

    public final boolean R0(int i4) {
        if (this.f675t == 0) {
            return (i4 == -1) != this.f679x;
        }
        return ((i4 == -1) == this.f679x) == O0();
    }

    @Override // b1.n0
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f875b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i4 = 0; i4 < this.f671p; i4++) {
            this.f672q[i4].b();
        }
        recyclerView.requestLayout();
    }

    public final void S0(int i4, z0 z0Var) {
        int I0;
        int i5;
        if (i4 > 0) {
            I0 = J0();
            i5 = 1;
        } else {
            I0 = I0();
            i5 = -1;
        }
        b1.s sVar = this.f677v;
        sVar.f905a = true;
        Z0(I0, z0Var);
        Y0(i5);
        sVar.c = I0 + sVar.f907d;
        sVar.f906b = Math.abs(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f675t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f675t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (O0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (O0() == false) goto L37;
     */
    @Override // b1.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i4, t0 t0Var, z0 z0Var) {
        View view2;
        int i5;
        if (v() != 0) {
            RecyclerView recyclerView = this.f875b;
            if (recyclerView == null || (view2 = recyclerView.A(view)) == null || ((ArrayList) this.f874a.f358d).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                W0();
                if (i4 == 1) {
                    if (this.f675t != 1) {
                    }
                    i5 = -1;
                } else if (i4 == 2) {
                    if (this.f675t != 1) {
                    }
                    i5 = 1;
                } else if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 == 66) {
                        }
                    }
                    i5 = Integer.MIN_VALUE;
                }
                if (i5 != Integer.MIN_VALUE) {
                    h1 h1Var = (h1) view2.getLayoutParams();
                    h1Var.getClass();
                    k1 k1Var = h1Var.f796e;
                    int J0 = i5 == 1 ? J0() : I0();
                    Z0(J0, z0Var);
                    Y0(i5);
                    b1.s sVar = this.f677v;
                    sVar.c = sVar.f907d + J0;
                    sVar.f906b = (int) (this.f673r.l() * 0.33333334f);
                    sVar.h = true;
                    sVar.f905a = false;
                    D0(t0Var, sVar, z0Var);
                    this.D = this.f679x;
                    View h = k1Var.h(J0, i5);
                    if (h != null && h != view2) {
                        return h;
                    }
                    if (R0(i5)) {
                        for (int i6 = this.f671p - 1; i6 >= 0; i6--) {
                            View h4 = this.f672q[i6].h(J0, i5);
                            if (h4 != null && h4 != view2) {
                                return h4;
                            }
                        }
                    } else {
                        for (int i7 = 0; i7 < this.f671p; i7++) {
                            View h5 = this.f672q[i7].h(J0, i5);
                            if (h5 != null && h5 != view2) {
                                return h5;
                            }
                        }
                    }
                    boolean z3 = (this.f678w ^ true) == (i5 == -1);
                    View q4 = q(z3 ? k1Var.c() : k1Var.d());
                    if (q4 != null && q4 != view2) {
                        return q4;
                    }
                    if (R0(i5)) {
                        for (int i8 = this.f671p - 1; i8 >= 0; i8--) {
                            if (i8 != k1Var.f833e) {
                                View q5 = q(z3 ? this.f672q[i8].c() : this.f672q[i8].d());
                                if (q5 != null && q5 != view2) {
                                    return q5;
                                }
                            }
                        }
                    } else {
                        for (int i9 = 0; i9 < this.f671p; i9++) {
                            View q6 = q(z3 ? this.f672q[i9].c() : this.f672q[i9].d());
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

    public final void T0(t0 t0Var, b1.s sVar) {
        if (!sVar.f905a || sVar.f910i) {
            return;
        }
        if (sVar.f906b == 0) {
            if (sVar.f908e == -1) {
                U0(t0Var, sVar.g);
                return;
            } else {
                V0(t0Var, sVar.f909f);
                return;
            }
        }
        int i4 = 1;
        if (sVar.f908e == -1) {
            int i5 = sVar.f909f;
            int i6 = this.f672q[0].i(i5);
            while (i4 < this.f671p) {
                int i7 = this.f672q[i4].i(i5);
                if (i7 > i6) {
                    i6 = i7;
                }
                i4++;
            }
            int i8 = i5 - i6;
            U0(t0Var, i8 < 0 ? sVar.g : sVar.g - Math.min(i8, sVar.f906b));
            return;
        }
        int i9 = sVar.g;
        int g = this.f672q[0].g(i9);
        while (i4 < this.f671p) {
            int g4 = this.f672q[i4].g(i9);
            if (g4 < g) {
                g = g4;
            }
            i4++;
        }
        int i10 = g - sVar.g;
        V0(t0Var, i10 < 0 ? sVar.f909f : Math.min(i10, sVar.f906b) + sVar.f909f);
    }

    @Override // b1.n0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View F0 = F0(false);
            View E0 = E0(false);
            if (F0 == null || E0 == null) {
                return;
            }
            int H = n0.H(F0);
            int H2 = n0.H(E0);
            if (H < H2) {
                accessibilityEvent.setFromIndex(H);
                accessibilityEvent.setToIndex(H2);
            } else {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H);
            }
        }
    }

    public final void U0(t0 t0Var, int i4) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            if (this.f673r.e(u3) < i4 || this.f673r.n(u3) < i4) {
                return;
            }
            h1 h1Var = (h1) u3.getLayoutParams();
            h1Var.getClass();
            if (((ArrayList) h1Var.f796e.f834f).size() == 1) {
                return;
            }
            k1 k1Var = h1Var.f796e;
            ArrayList arrayList = (ArrayList) k1Var.f834f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            h1 h1Var2 = (h1) view.getLayoutParams();
            h1Var2.f796e = null;
            if (h1Var2.f889a.h() || h1Var2.f889a.k()) {
                k1Var.f832d -= ((StaggeredGridLayoutManager) k1Var.g).f673r.c(view);
            }
            if (size == 1) {
                k1Var.f831b = Integer.MIN_VALUE;
            }
            k1Var.c = Integer.MIN_VALUE;
            j0(u3, t0Var);
        }
    }

    public final void V0(t0 t0Var, int i4) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f673r.b(u3) > i4 || this.f673r.m(u3) > i4) {
                return;
            }
            h1 h1Var = (h1) u3.getLayoutParams();
            h1Var.getClass();
            if (((ArrayList) h1Var.f796e.f834f).size() == 1) {
                return;
            }
            k1 k1Var = h1Var.f796e;
            ArrayList arrayList = (ArrayList) k1Var.f834f;
            View view = (View) arrayList.remove(0);
            h1 h1Var2 = (h1) view.getLayoutParams();
            h1Var2.f796e = null;
            if (arrayList.size() == 0) {
                k1Var.c = Integer.MIN_VALUE;
            }
            if (h1Var2.f889a.h() || h1Var2.f889a.k()) {
                k1Var.f832d -= ((StaggeredGridLayoutManager) k1Var.g).f673r.c(view);
            }
            k1Var.f831b = Integer.MIN_VALUE;
            j0(u3, t0Var);
        }
    }

    public final void W0() {
        if (this.f675t == 1 || !O0()) {
            this.f679x = this.f678w;
        } else {
            this.f679x = !this.f678w;
        }
    }

    @Override // b1.n0
    public final void X(int i4, int i5) {
        M0(i4, i5, 1);
    }

    public final int X0(int i4, t0 t0Var, z0 z0Var) {
        if (v() == 0 || i4 == 0) {
            return 0;
        }
        S0(i4, z0Var);
        b1.s sVar = this.f677v;
        int D0 = D0(t0Var, sVar, z0Var);
        if (sVar.f906b >= D0) {
            i4 = i4 < 0 ? -D0 : D0;
        }
        this.f673r.o(-i4);
        this.D = this.f679x;
        sVar.f906b = 0;
        T0(t0Var, sVar);
        return i4;
    }

    @Override // b1.n0
    public final void Y() {
        this.B.c();
        m0();
    }

    public final void Y0(int i4) {
        b1.s sVar = this.f677v;
        sVar.f908e = i4;
        sVar.f907d = this.f679x != (i4 == -1) ? -1 : 1;
    }

    @Override // b1.n0
    public final void Z(int i4, int i5) {
        M0(i4, i5, 8);
    }

    public final void Z0(int i4, z0 z0Var) {
        int i5;
        int i6;
        int i7;
        b1.s sVar = this.f677v;
        boolean z3 = false;
        sVar.f906b = 0;
        sVar.c = i4;
        x xVar = this.f877e;
        if (xVar == null || !xVar.f939e || (i7 = z0Var.f956a) == -1) {
            i5 = 0;
            i6 = 0;
        } else {
            if (this.f679x == (i7 < i4)) {
                i5 = this.f673r.l();
                i6 = 0;
            } else {
                i6 = this.f673r.l();
                i5 = 0;
            }
        }
        RecyclerView recyclerView = this.f875b;
        if (recyclerView == null || !recyclerView.f641l) {
            sVar.g = this.f673r.f() + i5;
            sVar.f909f = -i6;
        } else {
            sVar.f909f = this.f673r.k() - i6;
            sVar.g = this.f673r.g() + i5;
        }
        sVar.h = false;
        sVar.f905a = true;
        if (this.f673r.i() == 0 && this.f673r.f() == 0) {
            z3 = true;
        }
        sVar.f910i = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < I0()) != r3.f679x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f679x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // b1.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i4) {
        int i5 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i5 == 0) {
            return null;
        }
        if (this.f675t == 0) {
            pointF.x = i5;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i5;
        return pointF;
    }

    @Override // b1.n0
    public final void a0(int i4, int i5) {
        M0(i4, i5, 2);
    }

    public final void a1(k1 k1Var, int i4, int i5) {
        int i6 = k1Var.f832d;
        int i7 = k1Var.f833e;
        if (i4 != -1) {
            int i8 = k1Var.c;
            if (i8 == Integer.MIN_VALUE) {
                k1Var.a();
                i8 = k1Var.c;
            }
            if (i8 - i6 >= i5) {
                this.f680y.set(i7, false);
                return;
            }
            return;
        }
        int i9 = k1Var.f831b;
        if (i9 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) k1Var.f834f).get(0);
            h1 h1Var = (h1) view.getLayoutParams();
            k1Var.f831b = ((StaggeredGridLayoutManager) k1Var.g).f673r.e(view);
            h1Var.getClass();
            i9 = k1Var.f831b;
        }
        if (i9 + i6 <= i5) {
            this.f680y.set(i7, false);
        }
    }

    @Override // b1.n0
    public final void b0(int i4, int i5) {
        M0(i4, i5, 4);
    }

    @Override // b1.n0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // b1.n0
    public final void c0(t0 t0Var, z0 z0Var) {
        Q0(t0Var, z0Var, true);
    }

    @Override // b1.n0
    public final boolean d() {
        return this.f675t == 0;
    }

    @Override // b1.n0
    public final void d0(z0 z0Var) {
        this.f681z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // b1.n0
    public final boolean e() {
        return this.f675t == 1;
    }

    @Override // b1.n0
    public final void e0(Parcelable parcelable) {
        if (parcelable instanceof j1) {
            j1 j1Var = (j1) parcelable;
            this.F = j1Var;
            if (this.f681z != -1) {
                j1Var.f821f = -1;
                j1Var.g = -1;
                j1Var.f822i = null;
                j1Var.h = 0;
                j1Var.f823j = 0;
                j1Var.f824k = null;
                j1Var.f825l = null;
            }
            m0();
        }
    }

    @Override // b1.n0
    public final boolean f(o0 o0Var) {
        return o0Var instanceof h1;
    }

    @Override // b1.n0
    public final Parcelable f0() {
        int i4;
        int k4;
        int[] iArr;
        j1 j1Var = this.F;
        if (j1Var != null) {
            j1 j1Var2 = new j1();
            j1Var2.h = j1Var.h;
            j1Var2.f821f = j1Var.f821f;
            j1Var2.g = j1Var.g;
            j1Var2.f822i = j1Var.f822i;
            j1Var2.f823j = j1Var.f823j;
            j1Var2.f824k = j1Var.f824k;
            j1Var2.f826m = j1Var.f826m;
            j1Var2.f827n = j1Var.f827n;
            j1Var2.f828o = j1Var.f828o;
            j1Var2.f825l = j1Var.f825l;
            return j1Var2;
        }
        j1 j1Var3 = new j1();
        j1Var3.f826m = this.f678w;
        j1Var3.f827n = this.D;
        j1Var3.f828o = this.E;
        s sVar = this.B;
        if (sVar == null || (iArr = (int[]) sVar.g) == null) {
            j1Var3.f823j = 0;
        } else {
            j1Var3.f824k = iArr;
            j1Var3.f823j = iArr.length;
            j1Var3.f825l = (ArrayList) sVar.h;
        }
        if (v() <= 0) {
            j1Var3.f821f = -1;
            j1Var3.g = -1;
            j1Var3.h = 0;
            return j1Var3;
        }
        j1Var3.f821f = this.D ? J0() : I0();
        View E0 = this.f679x ? E0(true) : F0(true);
        j1Var3.g = E0 != null ? n0.H(E0) : -1;
        int i5 = this.f671p;
        j1Var3.h = i5;
        j1Var3.f822i = new int[i5];
        for (int i6 = 0; i6 < this.f671p; i6++) {
            if (this.D) {
                i4 = this.f672q[i6].g(Integer.MIN_VALUE);
                if (i4 != Integer.MIN_VALUE) {
                    k4 = this.f673r.g();
                    i4 -= k4;
                    j1Var3.f822i[i6] = i4;
                } else {
                    j1Var3.f822i[i6] = i4;
                }
            } else {
                i4 = this.f672q[i6].i(Integer.MIN_VALUE);
                if (i4 != Integer.MIN_VALUE) {
                    k4 = this.f673r.k();
                    i4 -= k4;
                    j1Var3.f822i[i6] = i4;
                } else {
                    j1Var3.f822i[i6] = i4;
                }
            }
        }
        return j1Var3;
    }

    @Override // b1.n0
    public final void g0(int i4) {
        if (i4 == 0) {
            B0();
        }
    }

    @Override // b1.n0
    public final void h(int i4, int i5, z0 z0Var, o oVar) {
        b1.s sVar;
        int g;
        int i6;
        if (this.f675t != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        S0(i4, z0Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f671p) {
            this.J = new int[this.f671p];
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f671p;
            sVar = this.f677v;
            if (i7 >= i9) {
                break;
            }
            if (sVar.f907d == -1) {
                g = sVar.f909f;
                i6 = this.f672q[i7].i(g);
            } else {
                g = this.f672q[i7].g(sVar.g);
                i6 = sVar.g;
            }
            int i10 = g - i6;
            if (i10 >= 0) {
                this.J[i8] = i10;
                i8++;
            }
            i7++;
        }
        Arrays.sort(this.J, 0, i8);
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = sVar.c;
            if (i12 < 0 || i12 >= z0Var.b()) {
                return;
            }
            oVar.a(sVar.c, this.J[i11]);
            sVar.c += sVar.f907d;
        }
    }

    @Override // b1.n0
    public final int j(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return d.l(z0Var, this.f673r, F0(z3), E0(z3), this, this.I);
    }

    @Override // b1.n0
    public final int k(z0 z0Var) {
        return C0(z0Var);
    }

    @Override // b1.n0
    public final int l(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return d.n(z0Var, this.f673r, F0(z3), E0(z3), this, this.I);
    }

    @Override // b1.n0
    public final int m(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return d.l(z0Var, this.f673r, F0(z3), E0(z3), this, this.I);
    }

    @Override // b1.n0
    public final int n(z0 z0Var) {
        return C0(z0Var);
    }

    @Override // b1.n0
    public final int n0(int i4, t0 t0Var, z0 z0Var) {
        return X0(i4, t0Var, z0Var);
    }

    @Override // b1.n0
    public final int o(z0 z0Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z3 = !this.I;
        return d.n(z0Var, this.f673r, F0(z3), E0(z3), this, this.I);
    }

    @Override // b1.n0
    public final void o0(int i4) {
        j1 j1Var = this.F;
        if (j1Var != null && j1Var.f821f != i4) {
            j1Var.f822i = null;
            j1Var.h = 0;
            j1Var.f821f = -1;
            j1Var.g = -1;
        }
        this.f681z = i4;
        this.A = Integer.MIN_VALUE;
        m0();
    }

    @Override // b1.n0
    public final int p0(int i4, t0 t0Var, z0 z0Var) {
        return X0(i4, t0Var, z0Var);
    }

    @Override // b1.n0
    public final o0 r() {
        return this.f675t == 0 ? new h1(-2, -1) : new h1(-1, -2);
    }

    @Override // b1.n0
    public final o0 s(Context context, AttributeSet attributeSet) {
        return new h1(context, attributeSet);
    }

    @Override // b1.n0
    public final void s0(Rect rect, int i4, int i5) {
        int g;
        int g4;
        int F = F() + E();
        int D = D() + G();
        int i6 = this.f675t;
        int i7 = this.f671p;
        if (i6 == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f875b;
            WeakHashMap weakHashMap = j0.f2752a;
            g4 = n0.g(i5, height, recyclerView.getMinimumHeight());
            g = n0.g(i4, (this.f676u * i7) + F, this.f875b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f875b;
            WeakHashMap weakHashMap2 = j0.f2752a;
            g = n0.g(i4, width, recyclerView2.getMinimumWidth());
            g4 = n0.g(i5, (this.f676u * i7) + D, this.f875b.getMinimumHeight());
        }
        this.f875b.setMeasuredDimension(g, g4);
    }

    @Override // b1.n0
    public final o0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new h1((ViewGroup.MarginLayoutParams) layoutParams) : new h1(layoutParams);
    }

    @Override // b1.n0
    public final void y0(RecyclerView recyclerView, int i4) {
        x xVar = new x(recyclerView.getContext());
        xVar.f936a = i4;
        z0(xVar);
    }
}
