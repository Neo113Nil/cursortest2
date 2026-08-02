package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.aag;
import defpackage.aah;
import defpackage.jv;
import defpackage.kc;
import defpackage.kd;
import defpackage.ke;
import defpackage.kf;
import defpackage.ko;
import defpackage.kr;
import defpackage.kt;
import defpackage.kx;
import defpackage.ky;
import defpackage.kz;
import defpackage.le;
import defpackage.lk;
import defpackage.ll;
import defpackage.lm;
import defpackage.lp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinearLayoutManager extends ky implements lk {
    private ke a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final boolean e;
    private final kd f;
    private final int g;
    private final int[] h;
    public int k;
    ko l;
    boolean m;
    int n;
    int o;
    kf p;
    final kc q;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new kc();
        this.f = new kd();
        this.g = 2;
        this.h = new int[2];
        kx aD = aD(context, attributeSet, i, i2);
        ab(aD.a);
        ac(aD.c);
        s(aD.d);
    }

    private final int bA(lm lmVar) {
        if (at() == 0) {
            return 0;
        }
        V();
        ko koVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return kt.x(lmVar, koVar, an(z2), am(z2), this, z, this.m);
    }

    private final int bB(lm lmVar) {
        if (at() == 0) {
            return 0;
        }
        V();
        ko koVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return kt.y(lmVar, koVar, an(z2), am(z2), this, z);
    }

    private final int bC(int i, le leVar, lm lmVar, boolean z) {
        int f;
        int f2 = this.l.f() - i;
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -L(-f2, leVar, lmVar);
        int i3 = i + i2;
        if (!z || (f = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(f);
        return f + i2;
    }

    private final int bD(int i, le leVar, lm lmVar, boolean z) {
        int j;
        int j2 = i - this.l.j();
        if (j2 <= 0) {
            return 0;
        }
        int i2 = -L(j2, leVar, lmVar);
        int i3 = i + i2;
        if (!z || (j = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-j);
        return i2 - j;
    }

    private final View bE() {
        return Q(0, at());
    }

    private final View bF() {
        return Q(at() - 1, -1);
    }

    private final View bG() {
        return aF(this.m ? 0 : at() - 1);
    }

    private final View bH() {
        return aF(this.m ? at() - 1 : 0);
    }

    private final void bI(le leVar, ke keVar) {
        if (!keVar.a || keVar.m) {
            return;
        }
        int i = keVar.g;
        int i2 = keVar.i;
        if (keVar.f == -1) {
            int at = at();
            if (i >= 0) {
                int e = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < at; i3++) {
                        View aF = aF(i3);
                        if (this.l.d(aF) < e || this.l.m(aF) < e) {
                            bJ(leVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = at - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View aF2 = aF(i5);
                    if (this.l.d(aF2) < e || this.l.m(aF2) < e) {
                        bJ(leVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int at2 = at();
            if (!this.m) {
                for (int i7 = 0; i7 < at2; i7++) {
                    View aF3 = aF(i7);
                    if (this.l.a(aF3) > i6 || this.l.l(aF3) > i6) {
                        bJ(leVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = at2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View aF4 = aF(i9);
                if (this.l.a(aF4) > i6 || this.l.l(aF4) > i6) {
                    bJ(leVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bJ(le leVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aS(i, leVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aS(i2, leVar);
                }
            }
        }
    }

    private final void bK(int i, int i2, boolean z, lm lmVar) {
        int j;
        this.a.m = ai();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        U(lmVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        int i3 = i == 1 ? max2 : max;
        ke keVar = this.a;
        keVar.h = i3;
        if (i != 1) {
            max = max2;
        }
        keVar.i = max;
        if (i == 1) {
            keVar.h = i3 + this.l.g();
            View bG = bG();
            ke keVar2 = this.a;
            keVar2.e = true == this.m ? -1 : 1;
            int bl = bl(bG);
            ke keVar3 = this.a;
            keVar2.d = bl + keVar3.e;
            keVar3.b = this.l.a(bG);
            j = this.l.a(bG) - this.l.f();
        } else {
            View bH = bH();
            this.a.h += this.l.j();
            ke keVar4 = this.a;
            keVar4.e = true != this.m ? -1 : 1;
            int bl2 = bl(bH);
            ke keVar5 = this.a;
            keVar4.d = bl2 + keVar5.e;
            keVar5.b = this.l.d(bH);
            j = (-this.l.d(bH)) + this.l.j();
        }
        ke keVar6 = this.a;
        keVar6.c = i2;
        if (z) {
            keVar6.c = i2 - j;
        }
        keVar6.g = j;
    }

    private final void bL(kc kcVar) {
        bM(kcVar.b, kcVar.c);
    }

    private final void bM(int i, int i2) {
        this.a.c = this.l.f() - i2;
        ke keVar = this.a;
        keVar.e = true != this.m ? 1 : -1;
        keVar.d = i;
        keVar.f = 1;
        keVar.b = i2;
        keVar.g = Integer.MIN_VALUE;
    }

    private final void bN(kc kcVar) {
        bO(kcVar.b, kcVar.c);
    }

    private final void bO(int i, int i2) {
        this.a.c = i2 - this.l.j();
        ke keVar = this.a;
        keVar.d = i;
        keVar.e = true != this.m ? -1 : 1;
        keVar.f = -1;
        keVar.b = i2;
        keVar.g = Integer.MIN_VALUE;
    }

    private final int c(lm lmVar) {
        if (at() == 0) {
            return 0;
        }
        V();
        ko koVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return kt.w(lmVar, koVar, an(z2), am(z2), this, z);
    }

    @Override // defpackage.ky
    public final int C(lm lmVar) {
        return c(lmVar);
    }

    @Override // defpackage.ky
    public final int D(lm lmVar) {
        return bA(lmVar);
    }

    @Override // defpackage.ky
    public final int E(lm lmVar) {
        return bB(lmVar);
    }

    @Override // defpackage.ky
    public final int F(lm lmVar) {
        return c(lmVar);
    }

    @Override // defpackage.ky
    public final int G(lm lmVar) {
        return bA(lmVar);
    }

    @Override // defpackage.ky
    public final int H(lm lmVar) {
        return bB(lmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int I(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && ag()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && ag()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
                }
                i2 = 1;
            }
            if (this.k != i3) {
                return i2;
            }
            return Integer.MIN_VALUE;
        }
        i3 = 0;
        if (this.k != i3) {
        }
    }

    final int J(le leVar, ke keVar, lm lmVar, boolean z) {
        int i = keVar.c;
        int i2 = keVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                keVar.g = i2 + i;
            }
            bI(leVar, keVar);
        }
        int i3 = keVar.c + keVar.h;
        kd kdVar = this.f;
        while (true) {
            if ((!keVar.m && i3 <= 0) || !keVar.c(lmVar)) {
                break;
            }
            kdVar.a = 0;
            kdVar.b = false;
            kdVar.c = false;
            kdVar.d = false;
            l(leVar, lmVar, keVar, kdVar);
            if (!kdVar.b) {
                int i4 = keVar.b;
                int i5 = kdVar.a;
                keVar.b = i4 + (keVar.f * i5);
                if (!kdVar.c || keVar.l != null || !lmVar.g) {
                    keVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = keVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    keVar.g = i7;
                    int i8 = keVar.c;
                    if (i8 < 0) {
                        keVar.g = i7 + i8;
                    }
                    bI(leVar, keVar);
                }
                if (z && kdVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - keVar.c;
    }

    public final int K() {
        View ao = ao(0, at(), false);
        if (ao == null) {
            return -1;
        }
        return bl(ao);
    }

    final int L(int i, le leVar, lm lmVar) {
        if (at() != 0 && i != 0) {
            V();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            bK(i2, abs, true, lmVar);
            ke keVar = this.a;
            int J = keVar.g + J(leVar, keVar, lmVar, false);
            if (J >= 0) {
                if (abs > J) {
                    i = i2 * J;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.lk
    public final PointF M(int i) {
        if (at() == 0) {
            return null;
        }
        float f = (i < bl(aF(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.ky
    public final Parcelable N() {
        kf kfVar = this.p;
        if (kfVar != null) {
            return new kf(kfVar);
        }
        kf kfVar2 = new kf();
        if (at() <= 0) {
            kfVar2.a();
            return kfVar2;
        }
        V();
        boolean z = this.b ^ this.m;
        kfVar2.c = z;
        if (z) {
            View bG = bG();
            kfVar2.b = this.l.f() - this.l.a(bG);
            kfVar2.a = bl(bG);
            return kfVar2;
        }
        View bH = bH();
        kfVar2.a = bl(bH);
        kfVar2.b = this.l.d(bH) - this.l.j();
        return kfVar2;
    }

    final View O() {
        int i;
        int at;
        int i2;
        if (this.m) {
            i2 = at();
            i = 1;
            at = 0;
        } else {
            i = -1;
            at = at() - 1;
            i2 = -1;
        }
        while (at != i2) {
            View aF = aF(at);
            if (aF != null && aF.hasFocusable()) {
                return aF;
            }
            at += i;
        }
        return null;
    }

    final View P() {
        int at;
        int i;
        int i2;
        if (this.m) {
            at = -1;
            i2 = at() - 1;
            i = -1;
        } else {
            at = at();
            i = 1;
            i2 = 0;
        }
        while (i2 != at) {
            View aF = aF(i2);
            if (aF != null && aF.hasFocusable()) {
                return aF;
            }
            i2 += i;
        }
        return null;
    }

    final View Q(int i, int i2) {
        V();
        if (i2 <= i && i2 >= i) {
            return aF(i);
        }
        int d = this.l.d(aF(i));
        int j = this.l.j();
        int i3 = d < j ? 16388 : 4097;
        int i4 = d < j ? 16644 : 4161;
        return this.k == 0 ? this.E.k(i, i2, i4, i3) : this.F.k(i, i2, i4, i3);
    }

    @Override // defpackage.ky
    public final View R(int i) {
        int at = at();
        if (at == 0) {
            return null;
        }
        int bl = i - bl(aF(0));
        if (bl >= 0 && bl < at) {
            View aF = aF(bl);
            if (bl(aF) == i) {
                return aF;
            }
        }
        return super.R(i);
    }

    public final View S(int i, le leVar, lm lmVar) {
        int I;
        View bE;
        Z();
        if (at() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        V();
        bK(I, (int) (this.l.k() * 0.33333334f), false, lmVar);
        ke keVar = this.a;
        keVar.g = Integer.MIN_VALUE;
        keVar.a = false;
        J(leVar, keVar, lmVar, true);
        boolean z = this.m;
        if (I == -1) {
            bE = z ? bF() : bE();
            I = -1;
        } else {
            bE = z ? bE() : bF();
        }
        View bH = I == -1 ? bH() : bG();
        if (!bH.hasFocusable()) {
            return bE;
        }
        if (bE == null) {
            return null;
        }
        return bH;
    }

    @Override // defpackage.ky
    public final void T(String str) {
        if (this.p == null) {
            super.T(str);
        }
    }

    protected void U(lm lmVar, int[] iArr) {
        int k = lmVar.a != -1 ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : k;
        if (i != -1) {
            k = 0;
        }
        iArr[0] = k;
        iArr[1] = i2;
    }

    final void V() {
        if (this.a == null) {
            this.a = new ke();
        }
    }

    @Override // defpackage.ky
    public final void W(AccessibilityEvent accessibilityEvent) {
        super.W(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(K());
            View ao = ao(at() - 1, -1, false);
            accessibilityEvent.setToIndex(ao != null ? bl(ao) : -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    public final void X(le leVar, lm lmVar) {
        View i;
        int i2;
        int i3;
        int i4;
        ?? r7;
        int i5;
        int i6;
        int bC;
        int i7;
        View R;
        int d;
        int i8;
        int i9 = -1;
        if (!(this.p == null && this.n == -1) && lmVar.a() == 0) {
            aP(leVar);
            return;
        }
        kf kfVar = this.p;
        if (kfVar != null && kfVar.b()) {
            this.n = kfVar.a;
        }
        V();
        boolean z = false;
        this.a.a = false;
        Z();
        View aG = aG();
        kc kcVar = this.q;
        boolean z2 = true;
        if (!kcVar.e || this.n != -1 || this.p != null) {
            kcVar.d();
            kcVar.d = this.m ^ this.d;
            if (!lmVar.g && (i2 = this.n) != -1) {
                if (i2 < 0 || i2 >= lmVar.a()) {
                    this.n = -1;
                    this.o = Integer.MIN_VALUE;
                } else {
                    int i10 = this.n;
                    kcVar.b = i10;
                    kf kfVar2 = this.p;
                    if (kfVar2 != null && kfVar2.b()) {
                        boolean z3 = kfVar2.c;
                        kcVar.d = z3;
                        ko koVar = this.l;
                        if (z3) {
                            kcVar.c = koVar.f() - this.p.b;
                        } else {
                            kcVar.c = koVar.j() + this.p.b;
                        }
                    } else if (this.o == Integer.MIN_VALUE) {
                        View R2 = R(i10);
                        if (R2 == null) {
                            if (at() > 0) {
                                kcVar.d = (this.n < bl(aF(0))) == this.m;
                            }
                            kcVar.a();
                        } else if (this.l.b(R2) > this.l.k()) {
                            kcVar.a();
                        } else {
                            int d2 = this.l.d(R2) - this.l.j();
                            ko koVar2 = this.l;
                            if (d2 < 0) {
                                kcVar.c = koVar2.j();
                                kcVar.d = false;
                            } else if (koVar2.f() - this.l.a(R2) < 0) {
                                kcVar.c = this.l.f();
                                kcVar.d = true;
                            } else {
                                boolean z4 = kcVar.d;
                                ko koVar3 = this.l;
                                kcVar.c = z4 ? koVar3.a(R2) + this.l.o() : koVar3.d(R2);
                            }
                        }
                    } else {
                        boolean z5 = this.m;
                        kcVar.d = z5;
                        ko koVar4 = this.l;
                        if (z5) {
                            kcVar.c = koVar4.f() - this.o;
                        } else {
                            kcVar.c = koVar4.j() + this.o;
                        }
                    }
                    kcVar.e = true;
                }
            }
            if (at() != 0) {
                View aG2 = aG();
                if (aG2 != null) {
                    kz kzVar = (kz) aG2.getLayoutParams();
                    if (!kzVar.c() && kzVar.a() >= 0 && kzVar.a() < lmVar.a()) {
                        kcVar.c(aG2, bl(aG2));
                        kcVar.e = true;
                    }
                }
                boolean z6 = this.b;
                boolean z7 = this.d;
                if (z6 == z7 && (i = i(leVar, lmVar, kcVar.d, z7)) != null) {
                    kcVar.b(i, bl(i));
                    if (!lmVar.g && v()) {
                        int d3 = this.l.d(i);
                        int a = this.l.a(i);
                        int j = this.l.j();
                        int f = this.l.f();
                        boolean z8 = a <= j && d3 < j;
                        boolean z9 = d3 >= f && a > f;
                        if (z8 || z9) {
                            if (true == kcVar.d) {
                                j = f;
                            }
                            kcVar.c = j;
                        }
                    }
                    kcVar.e = true;
                }
            }
            kcVar.a();
            kcVar.b = this.d ? lmVar.a() - 1 : 0;
            kcVar.e = true;
        } else if (aG != null && (this.l.d(aG) >= this.l.f() || this.l.a(aG) <= this.l.j())) {
            kcVar.c(aG, bl(aG));
        }
        ke keVar = this.a;
        keVar.f = keVar.k >= 0 ? 1 : -1;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        U(lmVar, iArr);
        int max = Math.max(0, iArr[0]) + this.l.j();
        int max2 = Math.max(0, iArr[1]) + this.l.g();
        if (lmVar.g && (i7 = this.n) != -1 && this.o != Integer.MIN_VALUE && (R = R(i7)) != null) {
            boolean z10 = this.m;
            ko koVar5 = this.l;
            if (z10) {
                i8 = koVar5.f() - this.l.a(R);
                d = this.o;
            } else {
                d = koVar5.d(R) - this.l.j();
                i8 = this.o;
            }
            int i11 = i8 - d;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        boolean z11 = kcVar.d;
        boolean z12 = this.m;
        if (!z11 ? true != z12 : true == z12) {
            i9 = 1;
        }
        m(leVar, lmVar, kcVar, i9);
        aJ(leVar);
        this.a.m = ai();
        ke keVar2 = this.a;
        keVar2.j = lmVar.g;
        keVar2.i = 0;
        if (kcVar.d) {
            bN(kcVar);
            ke keVar3 = this.a;
            keVar3.h = max;
            J(leVar, keVar3, lmVar, false);
            ke keVar4 = this.a;
            i4 = keVar4.b;
            int i12 = keVar4.d;
            int i13 = keVar4.c;
            if (i13 > 0) {
                max2 += i13;
            }
            bL(kcVar);
            ke keVar5 = this.a;
            keVar5.h = max2;
            keVar5.d += keVar5.e;
            J(leVar, keVar5, lmVar, false);
            ke keVar6 = this.a;
            i3 = keVar6.b;
            int i14 = keVar6.c;
            if (i14 > 0) {
                bO(i12, i4);
                ke keVar7 = this.a;
                keVar7.h = i14;
                J(leVar, keVar7, lmVar, false);
                i4 = this.a.b;
            }
        } else {
            bL(kcVar);
            ke keVar8 = this.a;
            keVar8.h = max2;
            J(leVar, keVar8, lmVar, false);
            ke keVar9 = this.a;
            i3 = keVar9.b;
            int i15 = keVar9.d;
            int i16 = keVar9.c;
            if (i16 > 0) {
                max += i16;
            }
            bN(kcVar);
            ke keVar10 = this.a;
            keVar10.h = max;
            keVar10.d += keVar10.e;
            J(leVar, keVar10, lmVar, false);
            ke keVar11 = this.a;
            i4 = keVar11.b;
            int i17 = keVar11.c;
            if (i17 > 0) {
                bM(i15, i3);
                ke keVar12 = this.a;
                keVar12.h = i17;
                J(leVar, keVar12, lmVar, false);
                i3 = this.a.b;
            }
        }
        if (at() > 0) {
            if (this.m ^ this.d) {
                int bC2 = bC(i3, leVar, lmVar, true);
                i5 = i4 + bC2;
                i6 = i3 + bC2;
                bC = bD(i5, leVar, lmVar, false);
            } else {
                int bD = bD(i4, leVar, lmVar, true);
                i5 = i4 + bD;
                i6 = i3 + bD;
                bC = bC(i6, leVar, lmVar, false);
            }
            i4 = i5 + bC;
            i3 = i6 + bC;
        }
        if (lmVar.k && at() != 0 && !lmVar.g && v()) {
            List list = leVar.d;
            int size = list.size();
            int bl = bl(aF(0));
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < size) {
                lp lpVar = (lp) list.get(i18);
                if (!lpVar.u()) {
                    boolean z13 = lpVar.b() >= bl ? z : z2;
                    boolean z14 = this.m;
                    ko koVar6 = this.l;
                    if (z13 != z14) {
                        i19 += koVar6.b(lpVar.a);
                    } else {
                        i20 += koVar6.b(lpVar.a);
                    }
                }
                i18++;
                z = false;
                z2 = true;
            }
            this.a.l = list;
            if (i19 > 0) {
                bO(bl(bH()), i4);
                ke keVar13 = this.a;
                keVar13.h = i19;
                r7 = 0;
                keVar13.c = 0;
                keVar13.b(null);
                J(leVar, this.a, lmVar, false);
            } else {
                r7 = 0;
            }
            if (i20 > 0) {
                bM(bl(bG()), i3);
                ke keVar14 = this.a;
                keVar14.h = i20;
                keVar14.c = r7;
                keVar14.b(null);
                J(leVar, this.a, lmVar, r7);
            }
            this.a.l = null;
        }
        if (lmVar.g) {
            kcVar.d();
        } else {
            ko koVar7 = this.l;
            koVar7.b = koVar7.k();
        }
        this.b = this.d;
    }

    @Override // defpackage.ky
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof kf) {
            kf kfVar = (kf) parcelable;
            this.p = kfVar;
            if (this.n != -1) {
                kfVar.a();
            }
            aU();
        }
    }

    final void Z() {
        this.m = (this.k == 1 || !ag()) ? this.c : !this.c;
    }

    @Override // defpackage.ky
    public final void aa(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        kf kfVar = this.p;
        if (kfVar != null) {
            kfVar.a();
        }
        aU();
    }

    public final void ab(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.Y(i, "invalid orientation:"));
        }
        T(null);
        if (i != this.k || this.l == null) {
            ko p = ko.p(this, i);
            this.l = p;
            this.q.a = p;
            this.k = i;
            aU();
        }
    }

    public final void ac(boolean z) {
        T(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aU();
    }

    @Override // defpackage.ky
    public final boolean ad() {
        return this.k == 0;
    }

    @Override // defpackage.ky
    public final boolean ae() {
        return this.k == 1;
    }

    @Override // defpackage.ky
    public final boolean af() {
        return true;
    }

    protected final boolean ag() {
        return aw() == 1;
    }

    @Override // defpackage.ky
    public final boolean ah() {
        return this.c;
    }

    final boolean ai() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.ky
    public final boolean aj() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int at = at();
            for (int i = 0; i < at; i++) {
                ViewGroup.LayoutParams layoutParams = aF(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ky
    public final void ak(int i, int i2, lm lmVar, jv jvVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (at() == 0 || i == 0) {
            return;
        }
        V();
        bK(i > 0 ? 1 : -1, Math.abs(i), true, lmVar);
        w(lmVar, this.a, jvVar);
    }

    @Override // defpackage.ky
    public final void al(int i, jv jvVar) {
        boolean z;
        int i2;
        kf kfVar = this.p;
        if (kfVar == null || !kfVar.b()) {
            Z();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = kfVar.c;
            i2 = kfVar.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            jvVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View am(boolean z) {
        return this.m ? ao(0, at(), z) : ao(at() - 1, -1, z);
    }

    final View an(boolean z) {
        return this.m ? ao(at() - 1, -1, z) : ao(0, at(), z);
    }

    final View ao(int i, int i2, boolean z) {
        V();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        return i3 == 0 ? this.E.k(i, i2, i4, 320) : this.F.k(i, i2, i4, 320);
    }

    @Override // defpackage.ky
    public final void aq(RecyclerView recyclerView, int i) {
        ll llVar = new ll(recyclerView.getContext());
        llVar.b = i;
        bb(llVar);
    }

    public final void ar(int i) {
        this.n = i;
        this.o = 0;
        kf kfVar = this.p;
        if (kfVar != null) {
            kfVar.a();
        }
        aU();
    }

    @Override // defpackage.ky
    public int d(int i, le leVar, lm lmVar) {
        if (this.k == 1) {
            return 0;
        }
        return L(i, leVar, lmVar);
    }

    @Override // defpackage.ky
    public int e(int i, le leVar, lm lmVar) {
        if (this.k == 0) {
            return 0;
        }
        return L(i, leVar, lmVar);
    }

    @Override // defpackage.ky
    public kz f() {
        return new kz(-2, -2);
    }

    public View i(le leVar, lm lmVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        V();
        int at = at();
        if (z2) {
            i = -1;
            i3 = at() - 1;
            i2 = -1;
        } else {
            i = at;
            i2 = 1;
            i3 = 0;
        }
        int a = lmVar.a();
        int j = this.l.j();
        int f = this.l.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i) {
            View aF = aF(i3);
            int bl = bl(aF);
            int d = this.l.d(aF);
            int a2 = this.l.a(aF);
            if (bl >= 0 && bl < a) {
                if (!((kz) aF.getLayoutParams()).c()) {
                    boolean z3 = a2 <= j && d < j;
                    boolean z4 = d >= f && a2 > f;
                    if (!z3 && !z4) {
                        return aF;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = aF;
                        }
                        view2 = aF;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = aF;
                        }
                        view2 = aF;
                    }
                } else if (view3 == null) {
                    view3 = aF;
                }
            }
            i3 += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // defpackage.ky
    public View j(int i, le leVar, lm lmVar) {
        int I;
        Z();
        if (at() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        V();
        int a = (I == -1) ^ this.m ? lmVar.a() - 1 : 0;
        if (R(a) != null) {
            aq(this.s, a);
        } else {
            this.n = a;
            X(leVar, lmVar);
        }
        View O = I == -1 ? O() : P();
        return (O == null || !O.hasFocusable()) ? S(i, leVar, lmVar) : O;
    }

    @Override // defpackage.ky
    public View k(View view, int i, le leVar, lm lmVar) {
        return S(i, leVar, lmVar);
    }

    public void l(le leVar, lm lmVar, ke keVar, kd kdVar) {
        int aC;
        int i;
        int i2;
        int i3;
        int i4;
        View a = keVar.a(leVar);
        if (a == null) {
            kdVar.b = true;
            return;
        }
        kz kzVar = (kz) a.getLayoutParams();
        List list = keVar.l;
        boolean z = this.m;
        if (list == null) {
            if (z == (keVar.f == -1)) {
                super.aH(a, -1, false);
            } else {
                super.aH(a, 0, false);
            }
        } else {
            if (z == (keVar.f == -1)) {
                super.aH(a, -1, true);
            } else {
                super.aH(a, 0, true);
            }
        }
        kz kzVar2 = (kz) a.getLayoutParams();
        Rect e = this.s.e(a);
        int i5 = e.left + e.right;
        int i6 = e.top + e.bottom;
        int au = ky.au(this.C, this.A, aA() + aB() + kzVar2.leftMargin + kzVar2.rightMargin + i5, kzVar2.width, ad());
        int au2 = ky.au(this.D, this.B, aC() + az() + kzVar2.topMargin + kzVar2.bottomMargin + i6, kzVar2.height, ae());
        if (bf(a, au, au2, kzVar2)) {
            a.measure(au, au2);
        }
        kdVar.a = this.l.b(a);
        if (this.k == 1) {
            if (ag()) {
                i2 = this.C - aB();
                i4 = i2 - this.l.c(a);
            } else {
                int aA = aA();
                i2 = this.l.c(a) + aA;
                i4 = aA;
            }
            if (keVar.f == -1) {
                i3 = keVar.b;
                aC = i3 - kdVar.a;
            } else {
                aC = keVar.b;
                i3 = kdVar.a + aC;
            }
        } else {
            aC = aC();
            int c = this.l.c(a) + aC;
            if (keVar.f == -1) {
                i2 = keVar.b;
                i = i2 - kdVar.a;
            } else {
                i = keVar.b;
                i2 = kdVar.a + i;
            }
            int i7 = i;
            i3 = c;
            i4 = i7;
        }
        bq(a, i4, aC, i2, i3);
        if (kzVar.c() || kzVar.b()) {
            kdVar.c = true;
        }
        kdVar.d = a.hasFocusable();
    }

    @Override // defpackage.ky
    public void n(le leVar, lm lmVar, aah aahVar) {
        super.n(leVar, lmVar, aahVar);
        kr krVar = this.s.l;
        if (krVar == null || krVar.a() <= 0) {
            return;
        }
        aahVar.h(aag.g);
    }

    @Override // defpackage.ky
    public void p(le leVar, lm lmVar) {
        X(leVar, lmVar);
    }

    @Override // defpackage.ky
    public void q(lm lmVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void s(boolean z) {
        T(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aU();
    }

    @Override // defpackage.ky
    public boolean u(int i, Bundle bundle) {
        int min;
        if (super.u(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                min = Math.min(i2, b(recyclerView.e, recyclerView.M) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                min = Math.min(i3, a(recyclerView2.e, recyclerView2.M) - 1);
            }
            if (min >= 0) {
                ar(min);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ky
    public boolean v() {
        return this.p == null && this.b == this.d;
    }

    public void w(lm lmVar, ke keVar, jv jvVar) {
        int i = keVar.d;
        if (i < 0 || i >= lmVar.a()) {
            return;
        }
        jvVar.a(i, Math.max(0, keVar.g));
    }

    @Override // defpackage.ky
    public final void ap(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new kc();
        this.f = new kd();
        this.g = 2;
        this.h = new int[2];
        ab(i);
        ac(false);
    }

    public void m(le leVar, lm lmVar, kc kcVar, int i) {
    }
}
