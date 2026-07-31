package androidx.recyclerview.widget;

import a0.a0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h4.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
import o.s;
import q3.k0;
import w4.d0;
import w4.e0;
import w4.j0;
import w4.m0;
import w4.n;
import w4.o;
import w4.s0;
import w4.u;
import w4.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends d0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f943k;

    /* renamed from: l, reason: collision with root package name */
    public final s[] f944l;

    /* renamed from: m, reason: collision with root package name */
    public final u f945m;

    /* renamed from: n, reason: collision with root package name */
    public final u f946n;

    /* renamed from: o, reason: collision with root package name */
    public final int f947o;

    /* renamed from: p, reason: collision with root package name */
    public final n f948p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f949q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f950r = false;

    /* renamed from: s, reason: collision with root package name */
    public final BitSet f951s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f952t;

    /* renamed from: u, reason: collision with root package name */
    public final int f953u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f954v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f955w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f956x;

    /* renamed from: y, reason: collision with root package name */
    public final b f957y;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        this.f943k = -1;
        this.f949q = false;
        a0 a0Var = new a0(25, false);
        this.f952t = a0Var;
        this.f953u = 2;
        this.f955w = new Rect();
        new p.b(this);
        this.f956x = true;
        this.f957y = new b(9, this);
        o B = d0.B(context, attributeSet, i, i8);
        int i9 = B.f7990b;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        b(null);
        if (i9 != this.f947o) {
            this.f947o = i9;
            u uVar = this.f945m;
            this.f945m = this.f946n;
            this.f946n = uVar;
            W();
        }
        int i10 = B.f7991c;
        b(null);
        if (i10 != this.f943k) {
            a0Var.j();
            W();
            this.f943k = i10;
            this.f951s = new BitSet(this.f943k);
            this.f944l = new s[this.f943k];
            for (int i11 = 0; i11 < this.f943k; i11++) {
                this.f944l[i11] = new s(this, i11);
            }
            W();
        }
        boolean z3 = B.f7992d;
        b(null);
        this.f949q = z3;
        W();
        n nVar = new n();
        nVar.f7981a = true;
        nVar.f7986f = 0;
        nVar.f7987g = 0;
        this.f948p = nVar;
        this.f945m = u.a(this, this.f947o);
        this.f946n = u.a(this, 1 - this.f947o);
    }

    public static int n0(int i, int i8, int i9) {
        int mode;
        return (!(i8 == 0 && i9 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i8) - i9), mode) : i;
    }

    @Override // w4.d0
    public final boolean E() {
        return this.f953u != 0;
    }

    @Override // w4.d0
    public final void H(int i) {
        super.H(i);
        for (int i8 = 0; i8 < this.f943k; i8++) {
            s sVar = this.f944l[i8];
            int i9 = sVar.f5530b;
            if (i9 != Integer.MIN_VALUE) {
                sVar.f5530b = i9 + i;
            }
            int i10 = sVar.f5531c;
            if (i10 != Integer.MIN_VALUE) {
                sVar.f5531c = i10 + i;
            }
        }
    }

    @Override // w4.d0
    public final void I(int i) {
        super.I(i);
        for (int i8 = 0; i8 < this.f943k; i8++) {
            s sVar = this.f944l[i8];
            int i9 = sVar.f5530b;
            if (i9 != Integer.MIN_VALUE) {
                sVar.f5530b = i9 + i;
            }
            int i10 = sVar.f5531c;
            if (i10 != Integer.MIN_VALUE) {
                sVar.f5531c = i10 + i;
            }
        }
    }

    @Override // w4.d0
    public final void J() {
        this.f952t.j();
        for (int i = 0; i < this.f943k; i++) {
            this.f944l[i].b();
        }
    }

    @Override // w4.d0
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7900b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f957y);
        }
        for (int i = 0; i < this.f943k; i++) {
            this.f944l[i].b();
        }
        recyclerView.requestLayout();
    }

    @Override // w4.d0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            View f02 = f0(false);
            View e02 = e0(false);
            if (f02 == null || e02 == null) {
                return;
            }
            int A = d0.A(f02);
            int A2 = d0.A(e02);
            if (A < A2) {
                accessibilityEvent.setFromIndex(A);
                accessibilityEvent.setToIndex(A2);
            } else {
                accessibilityEvent.setFromIndex(A2);
                accessibilityEvent.setToIndex(A);
            }
        }
    }

    @Override // w4.d0
    public final Parcelable P() {
        int e8;
        int m7;
        int[] iArr;
        u0 u0Var = new u0();
        u0Var.f8046k = this.f949q;
        u0Var.f8047l = this.f954v;
        u0Var.f8048m = false;
        a0 a0Var = this.f952t;
        if (a0Var == null || (iArr = (int[]) a0Var.f11e) == null) {
            u0Var.f8044h = 0;
        } else {
            u0Var.i = iArr;
            u0Var.f8044h = iArr.length;
            u0Var.f8045j = (ArrayList) a0Var.f12f;
        }
        if (q() <= 0) {
            u0Var.f8040d = -1;
            u0Var.f8041e = -1;
            u0Var.f8042f = 0;
            return u0Var;
        }
        u0Var.f8040d = this.f954v ? h0() : g0();
        View e02 = this.f950r ? e0(true) : f0(true);
        u0Var.f8041e = e02 != null ? d0.A(e02) : -1;
        int i = this.f943k;
        u0Var.f8042f = i;
        u0Var.f8043g = new int[i];
        for (int i8 = 0; i8 < this.f943k; i8++) {
            if (this.f954v) {
                e8 = this.f944l[i8].d(Integer.MIN_VALUE);
                if (e8 != Integer.MIN_VALUE) {
                    m7 = this.f945m.h();
                    e8 -= m7;
                    u0Var.f8043g[i8] = e8;
                } else {
                    u0Var.f8043g[i8] = e8;
                }
            } else {
                e8 = this.f944l[i8].e(Integer.MIN_VALUE);
                if (e8 != Integer.MIN_VALUE) {
                    m7 = this.f945m.m();
                    e8 -= m7;
                    u0Var.f8043g[i8] = e8;
                } else {
                    u0Var.f8043g[i8] = e8;
                }
            }
        }
        return u0Var;
    }

    @Override // w4.d0
    public final void Q(int i) {
        if (i == 0) {
            c0();
        }
    }

    @Override // w4.d0
    public final int X(int i, j0 j0Var, m0 m0Var) {
        return m0(i, j0Var, m0Var);
    }

    @Override // w4.d0
    public final int Y(int i, j0 j0Var, m0 m0Var) {
        return m0(i, j0Var, m0Var);
    }

    @Override // w4.d0
    public final void b(String str) {
        super.b(str);
    }

    @Override // w4.d0
    public final boolean c() {
        return this.f947o == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138 A[EDGE_INSN: B:48:0x0138->B:49:0x0138 BREAK  A[LOOP:0: B:23:0x0058->B:54:0x0131], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0054  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0() {
        int g02;
        char c8;
        ?? r16;
        View view;
        int i;
        if (q() != 0 && this.f953u != 0 && this.f7903e) {
            boolean z3 = this.f950r;
            if (z3) {
                g02 = h0();
                g0();
            } else {
                g02 = g0();
                h0();
            }
            if (g02 == 0) {
                int q4 = q();
                int i8 = q4 - 1;
                int i9 = this.f943k;
                BitSet bitSet = new BitSet(i9);
                int i10 = 1;
                bitSet.set(0, i9, true);
                if (this.f947o == 1) {
                    RecyclerView recyclerView = this.f7900b;
                    Field field = k0.f6120a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        c8 = 1;
                        if (z3) {
                            i8 = 0;
                        } else {
                            q4 = -1;
                        }
                        int i11 = i8 < q4 ? 1 : -1;
                        while (true) {
                            if (i8 != q4) {
                                r16 = i10;
                                view = null;
                                break;
                            }
                            view = p(i8);
                            s0 s0Var = (s0) view.getLayoutParams();
                            boolean z7 = bitSet.get(s0Var.f8032d.f5533e);
                            u uVar = this.f945m;
                            if (z7) {
                                s sVar = s0Var.f8032d;
                                if (z3) {
                                    int i12 = sVar.f5531c;
                                    if (i12 == Integer.MIN_VALUE) {
                                        sVar.a();
                                        i12 = sVar.f5531c;
                                    }
                                    if (i12 < uVar.h()) {
                                        ArrayList arrayList = (ArrayList) sVar.f5534f;
                                        ((s0) ((View) arrayList.get(arrayList.size() - i10)).getLayoutParams()).getClass();
                                        r16 = i10;
                                        break;
                                    }
                                    i = i10;
                                    bitSet.clear(s0Var.f8032d.f5533e);
                                    r16 = i;
                                } else {
                                    int i13 = sVar.f5530b;
                                    ArrayList arrayList2 = (ArrayList) sVar.f5534f;
                                    if (i13 != Integer.MIN_VALUE) {
                                        r16 = i10;
                                    } else {
                                        View view2 = (View) arrayList2.get(0);
                                        s0 s0Var2 = (s0) view2.getLayoutParams();
                                        r16 = i10;
                                        sVar.f5530b = ((StaggeredGridLayoutManager) sVar.f5535g).f945m.f(view2);
                                        s0Var2.getClass();
                                        i13 = sVar.f5530b;
                                    }
                                    i = r16;
                                    if (i13 > uVar.m()) {
                                        ((s0) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                                        break;
                                    }
                                    bitSet.clear(s0Var.f8032d.f5533e);
                                    r16 = i;
                                }
                            } else {
                                r16 = i10;
                            }
                            i8 += i11;
                            if (i8 != q4) {
                                View p7 = p(i8);
                                if (!z3) {
                                    int f6 = uVar.f(view);
                                    int f8 = uVar.f(p7);
                                    if (f6 > f8) {
                                        break;
                                    }
                                    if (f6 != f8) {
                                        continue;
                                    }
                                    if ((s0Var.f8032d.f5533e - ((s0) p7.getLayoutParams()).f8032d.f5533e >= 0 ? r16 == true ? 1 : 0 : false) == (c8 >= 0 ? r16 == true ? 1 : 0 : false)) {
                                    }
                                } else {
                                    int c9 = uVar.c(view);
                                    int c10 = uVar.c(p7);
                                    if (c9 < c10) {
                                        break;
                                    }
                                    if (c9 != c10) {
                                        continue;
                                    }
                                    if ((s0Var.f8032d.f5533e - ((s0) p7.getLayoutParams()).f8032d.f5533e >= 0 ? r16 == true ? 1 : 0 : false) == (c8 >= 0 ? r16 == true ? 1 : 0 : false)) {
                                        break;
                                    }
                                }
                            }
                            i10 = r16 == true ? 1 : 0;
                        }
                        if (view != null) {
                            this.f952t.j();
                            W();
                            return r16;
                        }
                    }
                }
                c8 = 65535;
                if (z3) {
                }
                if (i8 < q4) {
                }
                while (true) {
                    if (i8 != q4) {
                    }
                    i10 = r16 == true ? 1 : 0;
                }
                if (view != null) {
                }
            }
        }
        return false;
    }

    @Override // w4.d0
    public final boolean d() {
        return this.f947o == 1;
    }

    public final int d0(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z3 = !this.f956x;
        return r2.o.w(m0Var, this.f945m, f0(z3), e0(z3), this, this.f956x, this.f950r);
    }

    @Override // w4.d0
    public final boolean e(e0 e0Var) {
        return e0Var instanceof s0;
    }

    public final View e0(boolean z3) {
        int m7 = this.f945m.m();
        int h8 = this.f945m.h();
        View view = null;
        for (int q4 = q() - 1; q4 >= 0; q4--) {
            View p7 = p(q4);
            int f6 = this.f945m.f(p7);
            int c8 = this.f945m.c(p7);
            if (c8 > m7 && f6 < h8) {
                if (c8 <= h8 || !z3) {
                    return p7;
                }
                if (view == null) {
                    view = p7;
                }
            }
        }
        return view;
    }

    public final View f0(boolean z3) {
        int m7 = this.f945m.m();
        int h8 = this.f945m.h();
        int q4 = q();
        View view = null;
        for (int i = 0; i < q4; i++) {
            View p7 = p(i);
            int f6 = this.f945m.f(p7);
            if (this.f945m.c(p7) > m7 && f6 < h8) {
                if (f6 >= m7 || !z3) {
                    return p7;
                }
                if (view == null) {
                    view = p7;
                }
            }
        }
        return view;
    }

    @Override // w4.d0
    public final int g(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z3 = !this.f956x;
        return r2.o.v(m0Var, this.f945m, f0(z3), e0(z3), this, this.f956x);
    }

    public final int g0() {
        if (q() == 0) {
            return 0;
        }
        return d0.A(p(0));
    }

    @Override // w4.d0
    public final int h(m0 m0Var) {
        return d0(m0Var);
    }

    public final int h0() {
        int q4 = q();
        if (q4 == 0) {
            return 0;
        }
        return d0.A(p(q4 - 1));
    }

    @Override // w4.d0
    public final int i(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z3 = !this.f956x;
        return r2.o.x(m0Var, this.f945m, f0(z3), e0(z3), this, this.f956x);
    }

    public final void i0(View view, int i, int i8) {
        RecyclerView recyclerView = this.f7900b;
        Rect rect = this.f955w;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.t(view));
        }
        s0 s0Var = (s0) view.getLayoutParams();
        int n02 = n0(i, ((ViewGroup.MarginLayoutParams) s0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) s0Var).rightMargin + rect.right);
        int n03 = n0(i8, ((ViewGroup.MarginLayoutParams) s0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) s0Var).bottomMargin + rect.bottom);
        if (a0(view, n02, n03, s0Var)) {
            view.measure(n02, n03);
        }
    }

    @Override // w4.d0
    public final int j(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z3 = !this.f956x;
        return r2.o.v(m0Var, this.f945m, f0(z3), e0(z3), this, this.f956x);
    }

    public final void j0(j0 j0Var, n nVar) {
        if (!nVar.f7981a || nVar.i) {
            return;
        }
        if (nVar.f7982b == 0) {
            if (nVar.f7985e == -1) {
                k0(j0Var, nVar.f7987g);
                return;
            } else {
                l0(j0Var, nVar.f7986f);
                return;
            }
        }
        int i = 1;
        if (nVar.f7985e == -1) {
            int i8 = nVar.f7986f;
            int e8 = this.f944l[0].e(i8);
            while (i < this.f943k) {
                int e9 = this.f944l[i].e(i8);
                if (e9 > e8) {
                    e8 = e9;
                }
                i++;
            }
            int i9 = i8 - e8;
            k0(j0Var, i9 < 0 ? nVar.f7987g : nVar.f7987g - Math.min(i9, nVar.f7982b));
            return;
        }
        int i10 = nVar.f7987g;
        int d8 = this.f944l[0].d(i10);
        while (i < this.f943k) {
            int d9 = this.f944l[i].d(i10);
            if (d9 < d8) {
                d8 = d9;
            }
            i++;
        }
        int i11 = d8 - nVar.f7987g;
        l0(j0Var, i11 < 0 ? nVar.f7986f : Math.min(i11, nVar.f7982b) + nVar.f7986f);
    }

    @Override // w4.d0
    public final int k(m0 m0Var) {
        return d0(m0Var);
    }

    public final void k0(j0 j0Var, int i) {
        int q4 = q() - 1;
        if (q4 >= 0) {
            View p7 = p(q4);
            if (this.f945m.f(p7) < i || this.f945m.q(p7) < i) {
                return;
            }
            s0 s0Var = (s0) p7.getLayoutParams();
            s0Var.getClass();
            if (((ArrayList) s0Var.f8032d.f5534f).size() == 1) {
                return;
            }
            ArrayList arrayList = (ArrayList) s0Var.f8032d.f5534f;
            ((s0) ((View) arrayList.remove(arrayList.size() - 1)).getLayoutParams()).f8032d = null;
            throw null;
        }
    }

    @Override // w4.d0
    public final int l(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        boolean z3 = !this.f956x;
        return r2.o.x(m0Var, this.f945m, f0(z3), e0(z3), this, this.f956x);
    }

    public final void l0(j0 j0Var, int i) {
        if (q() > 0) {
            View p7 = p(0);
            if (this.f945m.c(p7) > i || this.f945m.p(p7) > i) {
                return;
            }
            s0 s0Var = (s0) p7.getLayoutParams();
            s0Var.getClass();
            if (((ArrayList) s0Var.f8032d.f5534f).size() == 1) {
                return;
            }
            s sVar = s0Var.f8032d;
            ArrayList arrayList = (ArrayList) sVar.f5534f;
            ((s0) ((View) arrayList.remove(0)).getLayoutParams()).f8032d = null;
            if (arrayList.size() == 0) {
                sVar.f5531c = Integer.MIN_VALUE;
            }
            throw null;
        }
    }

    @Override // w4.d0
    public final e0 m() {
        return this.f947o == 0 ? new s0(-2, -1) : new s0(-1, -2);
    }

    public final int m0(int i, j0 j0Var, m0 m0Var) {
        int g02;
        int i8;
        int h8;
        if (q() == 0 || i == 0) {
            return 0;
        }
        if (i > 0) {
            g02 = h0();
            i8 = 1;
        } else {
            g02 = g0();
            i8 = -1;
        }
        n nVar = this.f948p;
        nVar.f7981a = true;
        n nVar2 = this.f948p;
        boolean z3 = false;
        nVar2.f7982b = 0;
        nVar2.f7983c = g02;
        RecyclerView recyclerView = this.f7900b;
        if (recyclerView == null || !recyclerView.i) {
            nVar2.f7987g = this.f945m.g();
            nVar2.f7986f = 0;
        } else {
            nVar2.f7986f = this.f945m.m();
            nVar2.f7987g = this.f945m.h();
        }
        nVar2.f7988h = false;
        nVar2.f7981a = true;
        if (this.f945m.j() == 0 && this.f945m.g() == 0) {
            z3 = true;
        }
        nVar2.i = z3;
        n nVar3 = this.f948p;
        nVar3.f7985e = i8;
        nVar3.f7984d = this.f950r != (i8 == -1) ? -1 : 1;
        nVar.f7983c = g02 + nVar.f7984d;
        nVar.f7982b = Math.abs(i);
        this.f951s.set(0, this.f943k, true);
        n nVar4 = this.f948p;
        boolean z7 = nVar4.i;
        n nVar5 = this.f948p;
        int i9 = z7 ? nVar5.f7985e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar5.f7985e == 1 ? nVar5.f7987g + nVar5.f7982b : nVar5.f7986f - nVar5.f7982b;
        int i10 = nVar5.f7985e;
        for (int i11 = 0; i11 < this.f943k; i11++) {
            if (!((ArrayList) this.f944l[i11].f5534f).isEmpty()) {
                s sVar = this.f944l[i11];
                int i12 = sVar.f5532d;
                int i13 = sVar.f5533e;
                if (i10 == -1) {
                    int i14 = sVar.f5530b;
                    if (i14 == Integer.MIN_VALUE) {
                        View view = (View) ((ArrayList) sVar.f5534f).get(0);
                        s0 s0Var = (s0) view.getLayoutParams();
                        sVar.f5530b = ((StaggeredGridLayoutManager) sVar.f5535g).f945m.f(view);
                        s0Var.getClass();
                        i14 = sVar.f5530b;
                    }
                    if (i14 + i12 <= i9) {
                        this.f951s.set(i13, false);
                    }
                } else {
                    int i15 = sVar.f5531c;
                    if (i15 == Integer.MIN_VALUE) {
                        sVar.a();
                        i15 = sVar.f5531c;
                    }
                    if (i15 - i12 >= i9) {
                        this.f951s.set(i13, false);
                    }
                }
            }
        }
        if (this.f950r) {
            this.f945m.h();
        } else {
            this.f945m.m();
        }
        int i16 = nVar5.f7983c;
        if (i16 >= 0 && i16 < m0Var.a() && (nVar4.i || !this.f951s.isEmpty())) {
            View d8 = j0Var.d(nVar5.f7983c);
            nVar5.f7983c += nVar5.f7984d;
            ((s0) d8.getLayoutParams()).getClass();
            throw null;
        }
        j0(j0Var, nVar4);
        if (nVar4.f7985e == -1) {
            int m7 = this.f945m.m();
            int e8 = this.f944l[0].e(m7);
            for (int i17 = 1; i17 < this.f943k; i17++) {
                int e9 = this.f944l[i17].e(m7);
                if (e9 < e8) {
                    e8 = e9;
                }
            }
            h8 = this.f945m.m() - e8;
        } else {
            int h9 = this.f945m.h();
            int d9 = this.f944l[0].d(h9);
            for (int i18 = 1; i18 < this.f943k; i18++) {
                int d10 = this.f944l[i18].d(h9);
                if (d10 > d9) {
                    d9 = d10;
                }
            }
            h8 = d9 - this.f945m.h();
        }
        int min = h8 > 0 ? Math.min(nVar5.f7982b, h8) : 0;
        int i19 = nVar5.f7982b < min ? i : i < 0 ? -min : min;
        this.f945m.r(-i19);
        this.f954v = this.f950r;
        nVar5.f7982b = 0;
        j0(j0Var, nVar5);
        return i19;
    }

    @Override // w4.d0
    public final e0 n(Context context, AttributeSet attributeSet) {
        return new s0(context, attributeSet);
    }

    @Override // w4.d0
    public final e0 o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new s0((ViewGroup.MarginLayoutParams) layoutParams) : new s0(layoutParams);
    }
}
