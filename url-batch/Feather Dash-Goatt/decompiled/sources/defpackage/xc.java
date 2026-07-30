package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xc extends zl0 implements ad0, gu, j81, tx0, cm0, bv0, sc0, u40, h10, fu0 {
    public yl0 s;

    public final void A0() {
        yl0 yl0Var = this.s;
        o80.b("onFocusEvent called on wrong node");
        yl0Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.gu
    public final void F(ld0 ld0Var) {
        yl0 yl0Var = this.s;
        yl0Var.getClass();
        ld0Var.a();
    }

    @Override // defpackage.h10
    public final void J(f10 f10Var) {
        yl0 yl0Var = this.s;
        o80.b("applyFocusProperties called on wrong node");
        yl0Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.tx0
    public final boolean O() {
        yl0 yl0Var = this.s;
        yl0Var.getClass();
        ((xx0) yl0Var).d.getClass();
        return true;
    }

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        yl0 yl0Var = this.s;
        yl0Var.getClass();
        a9 a9Var = (a9) yl0Var;
        h81 h81Var = new h81();
        h81Var.g = a9Var.a;
        a9Var.b.invoke(h81Var);
        u81Var.getClass();
        h81 h81Var2 = (h81) u81Var;
        vn0 vn0Var = h81Var2.d;
        if (h81Var.g) {
            h81Var2.g = true;
        }
        if (h81Var.h) {
            h81Var2.h = true;
        }
        vn0 vn0Var2 = h81Var.d;
        Object[] objArr = vn0Var2.b;
        Object[] objArr2 = vn0Var2.c;
        long[] jArr = vn0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        t81 t81Var = (t81) obj;
                        if (!vn0Var.b(t81Var)) {
                            vn0Var.m(t81Var, obj2);
                        } else if (obj2 instanceof z0) {
                            Object g = vn0Var.g(t81Var);
                            g.getClass();
                            z0 z0Var = (z0) g;
                            String str = z0Var.a;
                            if (str == null) {
                                str = ((z0) obj2).a;
                            }
                            z30 z30Var = z0Var.b;
                            if (z30Var == null) {
                                z30Var = ((z0) obj2).b;
                            }
                            vn0Var.m(t81Var, new z0(str, z30Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.tx0
    public final void X() {
        yl0 yl0Var = this.s;
        yl0Var.getClass();
        o91 o91Var = ((xx0) yl0Var).d;
        vx0 vx0Var = (vx0) o91Var.e;
        xx0 xx0Var = (xx0) o91Var.h;
        if (vx0Var == vx0.e) {
            long uptimeMillis = SystemClock.uptimeMillis();
            wx0 wx0Var = new wx0(xx0Var, 0);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            wx0Var.invoke(obtain);
            obtain.recycle();
            o91Var.e = vx0.d;
            xx0Var.c = false;
            o91Var.g = null;
        }
    }

    @Override // defpackage.yq
    public final void a() {
        if (this.s instanceof xx0) {
            X();
        }
    }

    @Override // defpackage.cm0
    public final a60 c() {
        return a60.h;
    }

    @Override // defpackage.bv0
    public final Object e0(Object obj) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.gu
    public final void f0() {
        yr1.O(this);
    }

    @Override // defpackage.tx0
    public final void h0() {
        yl0 yl0Var = this.s;
        yl0Var.getClass();
        ((xx0) yl0Var).d.getClass();
    }

    @Override // defpackage.u40
    public final void n(qp0 qp0Var) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.zl0
    public final void r0() {
        z0(true);
    }

    @Override // defpackage.zl0
    public final void s0() {
        if (!this.r) {
            o80.b("unInitializeModifier called on unattached node");
        }
        if ((this.g & 8) != 0) {
            ((d4) op.J(this)).A();
        }
    }

    @Override // defpackage.fu0
    public final boolean t() {
        return this.r;
    }

    public final String toString() {
        return this.s.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(mx0 mx0Var, nx0 nx0Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        yl0 yl0Var = this.s;
        yl0Var.getClass();
        o91 o91Var = ((xx0) yl0Var).d;
        xx0 xx0Var = (xx0) o91Var.h;
        List list = mx0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qx0 qx0Var = (qx0) list.get(i);
            if (ka0.i(qx0Var) || ka0.j(qx0Var)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!((qx0) list.get(i2)).b()) {
                }
            }
            z2 = true;
            if (!xx0Var.c) {
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size3) {
                        qx0 qx0Var2 = (qx0) list.get(i3);
                        if (ka0.i(qx0Var2) || ka0.j(qx0Var2)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (!z2) {
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (((vx0) o91Var.e) != vx0.g) {
                if (nx0Var == nx0.d && z3) {
                    o91Var.g = mx0Var;
                    o91Var.e(mx0Var, !z || xx0Var.c);
                }
                if (nx0Var == nx0.e && z && mx0Var == ((mx0) o91Var.g) && xx0Var.c) {
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((qx0) list.get(i4)).a();
                    }
                }
                if (nx0Var == nx0.g && !z3 && mx0Var != ((mx0) o91Var.g)) {
                    o91Var.e(mx0Var, true);
                }
            }
            if (nx0Var != nx0.g) {
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        o91Var.e = vx0.d;
                        ((xx0) o91Var.h).c = false;
                        o91Var.g = null;
                        break;
                    } else if (!ka0.j((qx0) list.get(i5))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (mx0Var == ((mx0) o91Var.g) && z) {
                    int size6 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size6) {
                            break;
                        }
                        if (!((qx0) list.get(i6)).b()) {
                            i6++;
                        } else if (!xx0Var.c) {
                            o91Var.r(mx0Var);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        ((qx0) list.get(i7)).a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (!xx0Var.c) {
        }
        z3 = true;
        if (((vx0) o91Var.e) != vx0.g) {
        }
        if (nx0Var != nx0.g) {
        }
    }

    public final void z0(boolean z) {
        if (!this.r) {
            o80.b("initializeModifier called on unattached node");
        }
        yl0 yl0Var = this.s;
        if ((this.g & 4) != 0 && !z) {
            op.G(this, 2).Q0();
        }
        if ((this.g & 2) != 0) {
            ig1 ig1Var = (ig1) op.I(this).J.f;
            ig1Var.getClass();
            if (ig1Var.s) {
                qp0 qp0Var = this.l;
                qp0Var.getClass();
                ((cd0) qp0Var).h1(this);
                du0 du0Var = qp0Var.P;
                if (du0Var != null) {
                    ((n50) du0Var).c();
                }
            }
            if (!z) {
                op.G(this, 2).Q0();
                op.I(this).C();
            }
        }
        if (yl0Var instanceof uf0) {
            ((uf0) yl0Var).a.k = op.I(this);
        }
        int i = this.g;
        if ((i & 16) != 0 && (yl0Var instanceof xx0)) {
            ((xx0) yl0Var).d.d = this.l;
        }
        if ((i & 8) != 0) {
            ((d4) op.J(this)).A();
        }
    }

    @Override // defpackage.sc0
    public final void g(uc0 uc0Var) {
    }

    @Override // defpackage.sc0
    public final void l(long j) {
    }
}
