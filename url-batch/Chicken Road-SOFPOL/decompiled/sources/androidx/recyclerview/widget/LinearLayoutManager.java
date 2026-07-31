package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import q3.k0;
import w4.d0;
import w4.e0;
import w4.j0;
import w4.m0;
import w4.o;
import w4.p;
import w4.q;
import w4.r;
import w4.u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class LinearLayoutManager extends d0 {

    /* renamed from: k, reason: collision with root package name */
    public int f894k;

    /* renamed from: l, reason: collision with root package name */
    public q f895l;

    /* renamed from: m, reason: collision with root package name */
    public u f896m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f897n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f898o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f899p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f900q;

    /* renamed from: r, reason: collision with root package name */
    public final r f901r;

    /* renamed from: s, reason: collision with root package name */
    public final o f902s;

    /* renamed from: t, reason: collision with root package name */
    public final p f903t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f904u;

    public LinearLayoutManager() {
        this.f894k = 1;
        this.f897n = false;
        this.f898o = false;
        this.f899p = false;
        this.f900q = true;
        this.f901r = null;
        this.f902s = new o(0);
        this.f903t = new p();
        this.f904u = new int[2];
        q0(1);
        b(null);
        if (this.f897n) {
            this.f897n = false;
            W();
        }
    }

    @Override // w4.d0
    public final boolean E() {
        return true;
    }

    @Override // w4.d0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            View i02 = i0(0, q(), false);
            accessibilityEvent.setFromIndex(i02 == null ? -1 : d0.A(i02));
            View i03 = i0(q() - 1, -1, false);
            accessibilityEvent.setToIndex(i03 != null ? d0.A(i03) : -1);
        }
    }

    @Override // w4.d0
    public final Parcelable P() {
        r rVar = this.f901r;
        if (rVar != null) {
            r rVar2 = new r();
            rVar2.f8023d = rVar.f8023d;
            rVar2.f8024e = rVar.f8024e;
            rVar2.f8025f = rVar.f8025f;
            return rVar2;
        }
        r rVar3 = new r();
        if (q() <= 0) {
            rVar3.f8023d = -1;
            return rVar3;
        }
        f0();
        boolean z3 = false ^ this.f898o;
        rVar3.f8025f = z3;
        if (z3) {
            View j02 = j0();
            rVar3.f8024e = this.f896m.h() - this.f896m.c(j02);
            rVar3.f8023d = d0.A(j02);
            return rVar3;
        }
        View k02 = k0();
        rVar3.f8023d = d0.A(k02);
        rVar3.f8024e = this.f896m.f(k02) - this.f896m.m();
        return rVar3;
    }

    @Override // w4.d0
    public int X(int i, j0 j0Var, m0 m0Var) {
        if (this.f894k == 1) {
            return 0;
        }
        return p0(i, j0Var, m0Var);
    }

    @Override // w4.d0
    public int Y(int i, j0 j0Var, m0 m0Var) {
        if (this.f894k == 0) {
            return 0;
        }
        return p0(i, j0Var, m0Var);
    }

    @Override // w4.d0
    public final void b(String str) {
        if (this.f901r == null) {
            super.b(str);
        }
    }

    @Override // w4.d0
    public final boolean c() {
        return this.f894k == 0;
    }

    public final int c0(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        u uVar = this.f896m;
        boolean z3 = !this.f900q;
        return r2.o.v(m0Var, uVar, h0(z3), g0(z3), this, this.f900q);
    }

    @Override // w4.d0
    public final boolean d() {
        return this.f894k == 1;
    }

    public final int d0(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        u uVar = this.f896m;
        boolean z3 = !this.f900q;
        return r2.o.w(m0Var, uVar, h0(z3), g0(z3), this, this.f900q, this.f898o);
    }

    public final int e0(m0 m0Var) {
        if (q() == 0) {
            return 0;
        }
        f0();
        u uVar = this.f896m;
        boolean z3 = !this.f900q;
        return r2.o.x(m0Var, uVar, h0(z3), g0(z3), this, this.f900q);
    }

    public final void f0() {
        if (this.f895l == null) {
            q qVar = new q();
            qVar.f8011a = true;
            qVar.f8018h = 0;
            qVar.i = 0;
            qVar.f8019j = null;
            this.f895l = qVar;
        }
    }

    @Override // w4.d0
    public final int g(m0 m0Var) {
        return c0(m0Var);
    }

    public final View g0(boolean z3) {
        return this.f898o ? i0(0, q(), z3) : i0(q() - 1, -1, z3);
    }

    @Override // w4.d0
    public int h(m0 m0Var) {
        return d0(m0Var);
    }

    public final View h0(boolean z3) {
        return this.f898o ? i0(q() - 1, -1, z3) : i0(0, q(), z3);
    }

    @Override // w4.d0
    public int i(m0 m0Var) {
        return e0(m0Var);
    }

    public final View i0(int i, int i8, boolean z3) {
        f0();
        int i9 = z3 ? 24579 : 320;
        return this.f894k == 0 ? this.f7901c.n(i, i8, i9, 320) : this.f7902d.n(i, i8, i9, 320);
    }

    @Override // w4.d0
    public final int j(m0 m0Var) {
        return c0(m0Var);
    }

    public final View j0() {
        return p(this.f898o ? 0 : q() - 1);
    }

    @Override // w4.d0
    public int k(m0 m0Var) {
        return d0(m0Var);
    }

    public final View k0() {
        return p(this.f898o ? q() - 1 : 0);
    }

    @Override // w4.d0
    public int l(m0 m0Var) {
        return e0(m0Var);
    }

    public final boolean l0() {
        RecyclerView recyclerView = this.f7900b;
        Field field = k0.f6120a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // w4.d0
    public e0 m() {
        return new e0(-2, -2);
    }

    public void m0(j0 j0Var, m0 m0Var, q qVar, p pVar) {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        View b8 = qVar.b(j0Var);
        if (b8 == null) {
            pVar.f8001b = true;
            return;
        }
        e0 e0Var = (e0) b8.getLayoutParams();
        if (qVar.f8019j == null) {
            if (this.f898o == (qVar.f8016f == -1)) {
                a(b8, -1, false);
            } else {
                a(b8, 0, false);
            }
        } else {
            if (this.f898o == (qVar.f8016f == -1)) {
                a(b8, -1, true);
            } else {
                a(b8, 0, true);
            }
        }
        e0 e0Var2 = (e0) b8.getLayoutParams();
        Rect t3 = this.f7900b.t(b8);
        int i12 = t3.left + t3.right;
        int i13 = t3.top + t3.bottom;
        int r7 = d0.r(c(), this.i, this.f7905g, y() + x() + ((ViewGroup.MarginLayoutParams) e0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) e0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) e0Var2).width);
        int r8 = d0.r(d(), this.f7907j, this.f7906h, w() + z() + ((ViewGroup.MarginLayoutParams) e0Var2).topMargin + ((ViewGroup.MarginLayoutParams) e0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) e0Var2).height);
        if (a0(b8, r7, r8, e0Var2)) {
            b8.measure(r7, r8);
        }
        pVar.f8000a = this.f896m.d(b8);
        if (this.f894k == 1) {
            if (l0()) {
                i8 = this.i - y();
                i10 = i8 - this.f896m.e(b8);
            } else {
                i10 = x();
                i8 = this.f896m.e(b8) + i10;
            }
            if (qVar.f8016f == -1) {
                i11 = qVar.f8012b;
                i = i11 - pVar.f8000a;
            } else {
                int i14 = qVar.f8012b;
                i9 = pVar.f8000a + i14;
                i = i14;
                i11 = i9;
            }
        } else {
            int z3 = z();
            int e8 = this.f896m.e(b8) + z3;
            if (qVar.f8016f == -1) {
                int i15 = qVar.f8012b;
                int i16 = i15 - pVar.f8000a;
                i = z3;
                i8 = i15;
                i11 = e8;
                i10 = i16;
            } else {
                int i17 = qVar.f8012b;
                int i18 = pVar.f8000a + i17;
                i = z3;
                i8 = i18;
                i9 = e8;
                i10 = i17;
                i11 = i9;
            }
        }
        d0.G(b8, i10, i, i8, i11);
        e0Var.getClass();
        throw null;
    }

    public final void n0(j0 j0Var, q qVar) {
        if (!qVar.f8011a || qVar.f8020k) {
            return;
        }
        int i = qVar.f8017g;
        int i8 = qVar.i;
        if (qVar.f8016f == -1) {
            int q4 = q();
            if (i < 0) {
                return;
            }
            int g3 = (this.f896m.g() - i) + i8;
            if (this.f898o) {
                for (int i9 = 0; i9 < q4; i9++) {
                    View p7 = p(i9);
                    if (this.f896m.f(p7) < g3 || this.f896m.q(p7) < g3) {
                        o0(j0Var, 0, i9);
                        return;
                    }
                }
                return;
            }
            int i10 = q4 - 1;
            for (int i11 = i10; i11 >= 0; i11--) {
                View p8 = p(i11);
                if (this.f896m.f(p8) < g3 || this.f896m.q(p8) < g3) {
                    o0(j0Var, i10, i11);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i12 = i - i8;
        int q7 = q();
        if (!this.f898o) {
            for (int i13 = 0; i13 < q7; i13++) {
                View p9 = p(i13);
                if (this.f896m.c(p9) > i12 || this.f896m.p(p9) > i12) {
                    o0(j0Var, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = q7 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View p10 = p(i15);
            if (this.f896m.c(p10) > i12 || this.f896m.p(p10) > i12) {
                o0(j0Var, i14, i15);
                return;
            }
        }
    }

    public final void o0(j0 j0Var, int i, int i8) {
        if (i == i8) {
            return;
        }
        if (i8 <= i) {
            while (i > i8) {
                View p7 = p(i);
                U(i);
                j0Var.g(p7);
                i--;
            }
            return;
        }
        for (int i9 = i8 - 1; i9 >= i; i9--) {
            View p8 = p(i9);
            U(i9);
            j0Var.g(p8);
        }
    }

    public final int p0(int i, j0 j0Var, m0 m0Var) {
        int m7;
        int i8;
        if (q() != 0 && i != 0) {
            f0();
            this.f895l.f8011a = true;
            int i9 = i <= 0 ? -1 : 1;
            int abs = Math.abs(i);
            this.f895l.f8020k = this.f896m.j() == 0 && this.f896m.g() == 0;
            this.f895l.f8016f = i9;
            int[] iArr = this.f904u;
            iArr[0] = 0;
            iArr[1] = 0;
            m0Var.getClass();
            int i10 = this.f895l.f8016f;
            iArr[0] = 0;
            iArr[1] = 0;
            int max = Math.max(0, iArr[0]);
            int max2 = Math.max(0, iArr[1]);
            boolean z3 = i9 == 1;
            q qVar = this.f895l;
            int i11 = z3 ? max2 : max;
            qVar.f8018h = i11;
            if (!z3) {
                max = max2;
            }
            qVar.i = max;
            if (z3) {
                qVar.f8018h = this.f896m.i() + i11;
                View j02 = j0();
                q qVar2 = this.f895l;
                qVar2.f8015e = this.f898o ? -1 : 1;
                int A = d0.A(j02);
                q qVar3 = this.f895l;
                qVar2.f8014d = A + qVar3.f8015e;
                qVar3.f8012b = this.f896m.c(j02);
                m7 = this.f896m.c(j02) - this.f896m.h();
            } else {
                View k02 = k0();
                q qVar4 = this.f895l;
                qVar4.f8018h = this.f896m.m() + qVar4.f8018h;
                q qVar5 = this.f895l;
                qVar5.f8015e = this.f898o ? 1 : -1;
                int A2 = d0.A(k02);
                q qVar6 = this.f895l;
                qVar5.f8014d = A2 + qVar6.f8015e;
                qVar6.f8012b = this.f896m.f(k02);
                m7 = (-this.f896m.f(k02)) + this.f896m.m();
            }
            q qVar7 = this.f895l;
            qVar7.f8013c = abs;
            qVar7.f8013c = abs - m7;
            qVar7.f8017g = m7;
            q qVar8 = this.f895l;
            int i12 = qVar8.f8017g;
            int i13 = qVar8.f8013c;
            int i14 = qVar8.f8017g;
            if (i14 != Integer.MIN_VALUE) {
                if (i13 < 0) {
                    qVar8.f8017g = i14 + i13;
                }
                n0(j0Var, qVar8);
            }
            int i15 = qVar8.f8013c + qVar8.f8018h;
            while (true) {
                if ((!qVar8.f8020k && i15 <= 0) || (i8 = qVar8.f8014d) < 0 || i8 >= m0Var.a()) {
                    break;
                }
                p pVar = this.f903t;
                pVar.f8000a = 0;
                pVar.f8001b = false;
                pVar.f8002c = false;
                pVar.f8003d = false;
                m0(j0Var, m0Var, qVar8, pVar);
                if (pVar.f8001b) {
                    break;
                }
                int i16 = qVar8.f8012b;
                int i17 = pVar.f8000a;
                qVar8.f8012b = (qVar8.f8016f * i17) + i16;
                if (!pVar.f8002c || qVar8.f8019j != null || !m0Var.f7977e) {
                    qVar8.f8013c -= i17;
                    i15 -= i17;
                }
                int i18 = qVar8.f8017g;
                if (i18 != Integer.MIN_VALUE) {
                    int i19 = i18 + i17;
                    qVar8.f8017g = i19;
                    int i20 = qVar8.f8013c;
                    if (i20 < 0) {
                        qVar8.f8017g = i19 + i20;
                    }
                    n0(j0Var, qVar8);
                }
            }
            int i21 = (i13 - qVar8.f8013c) + i12;
            if (i21 >= 0) {
                if (abs > i21) {
                    i = i9 * i21;
                }
                this.f896m.r(-i);
                this.f895l.getClass();
                return i;
            }
        }
        return 0;
    }

    public final void q0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a0.q.h("invalid orientation:", i));
        }
        b(null);
        if (i != this.f894k || this.f896m == null) {
            this.f896m = u.a(this, i);
            this.f902s.getClass();
            this.f894k = i;
            W();
        }
    }

    public void r0(boolean z3) {
        b(null);
        if (this.f899p == z3) {
            return;
        }
        this.f899p = z3;
        W();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i8) {
        this.f894k = 1;
        this.f897n = false;
        this.f898o = false;
        this.f899p = false;
        this.f900q = true;
        this.f901r = null;
        this.f902s = new o(0);
        this.f903t = new p();
        this.f904u = new int[2];
        o B = d0.B(context, attributeSet, i, i8);
        q0(B.f7990b);
        boolean z3 = B.f7992d;
        b(null);
        if (z3 != this.f897n) {
            this.f897n = z3;
            W();
        }
        r0(B.f7993e);
    }

    @Override // w4.d0
    public final void L(RecyclerView recyclerView) {
    }
}
