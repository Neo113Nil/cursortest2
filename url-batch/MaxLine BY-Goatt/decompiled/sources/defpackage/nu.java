package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class nu extends p90 implements w22, b81, go0, xh2, rz2 {
    public static final by1 T = new by1(22);
    public bn1 C;
    public d21 D;
    public String E;
    public fb2 F;
    public boolean G;
    public Function0 H;
    public final cp0 J;
    public vr2 K;
    public o90 L;
    public u42 M;
    public cy0 N;
    public bn1 Q;
    public boolean R;
    public final by1 S;
    public final ap0 I = new ap0();
    public final LinkedHashMap O = new LinkedHashMap();
    public long P = 0;

    public nu(bn1 bn1Var, d21 d21Var, boolean z, String str, fb2 fb2Var, Function0 function0) {
        this.C = bn1Var;
        this.D = d21Var;
        this.E = str;
        this.F = fb2Var;
        this.G = z;
        this.H = function0;
        this.J = new cp0(bn1Var);
        bn1 bn1Var2 = this.C;
        this.Q = bn1Var2;
        this.R = bn1Var2 == null && this.D != null;
        this.S = T;
    }

    @Override // defpackage.w22
    public final void J(m22 m22Var, n22 n22Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.P = ap.i((int) (j2 >> 32), (int) (j2 & 4294967295L));
        L0();
        o30 o30Var = null;
        if (this.G && n22Var == n22.n) {
            int i = m22Var.c;
            if (i == 4) {
                z71.H(u0(), null, new z(this, o30Var, 0), 3);
            } else if (i == 5) {
                z71.H(u0(), null, new z(this, o30Var, 1), 3);
            }
        }
        if (this.K == null) {
            v vVar = new v(2, o30Var, this);
            m22 m22Var2 = rr2.a;
            vr2 vr2Var = new vr2(null, null, sr2.m);
            vr2Var.C = vVar;
            G0(vr2Var);
            this.K = vr2Var;
        }
        vr2 vr2Var2 = this.K;
        if (vr2Var2 != null) {
            vr2Var2.J(m22Var, n22Var, j);
        }
    }

    public final void K0() {
        bn1 bn1Var = this.C;
        LinkedHashMap linkedHashMap = this.O;
        if (bn1Var != null) {
            u42 u42Var = this.M;
            if (u42Var != null) {
                bn1Var.c(new t42(u42Var));
            }
            cy0 cy0Var = this.N;
            if (cy0Var != null) {
                bn1Var.c(new dy0(cy0Var));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                bn1Var.c(new t42((u42) it.next()));
            }
        }
        this.M = null;
        this.N = null;
        linkedHashMap.clear();
    }

    public final void L0() {
        d21 d21Var;
        if (this.L == null && (d21Var = this.D) != null) {
            if (this.C == null) {
                this.C = new bn1();
            }
            this.J.J0(this.C);
            bn1 bn1Var = this.C;
            bn1Var.getClass();
            o90 a = d21Var.a(bn1Var);
            G0(a);
            this.L = a;
        }
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        fb2 fb2Var = this.F;
        if (fb2Var != null) {
            ii2.b(sh2Var, fb2Var.a);
        }
        String str = this.E;
        u uVar = new u(0, this);
        t71[] t71VarArr = ii2.a;
        sh2Var.d(rh2.b, new r1(str, uVar));
        if (this.G) {
            this.J.M(sh2Var);
        } else {
            sh2Var.d(gi2.i, Unit.a);
        }
        J0(sh2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.L == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(bn1 bn1Var, d21 d21Var, boolean z, String str, fb2 fb2Var, Function0 function0) {
        boolean z2;
        o90 o90Var;
        boolean z3 = true;
        boolean z4 = false;
        if (Intrinsics.b(this.Q, bn1Var)) {
            z2 = false;
        } else {
            K0();
            this.Q = bn1Var;
            this.C = bn1Var;
            z2 = true;
        }
        if (!Intrinsics.b(this.D, d21Var)) {
            this.D = d21Var;
            z2 = true;
        }
        boolean z5 = this.G;
        cp0 cp0Var = this.J;
        if (z5 != z) {
            o90 o90Var2 = this.I;
            if (z) {
                G0(o90Var2);
                G0(cp0Var);
            } else {
                H0(o90Var2);
                H0(cp0Var);
                K0();
            }
            yh2.l(this);
            this.G = z;
        }
        if (!Intrinsics.b(this.E, str)) {
            this.E = str;
            yh2.l(this);
        }
        if (!Intrinsics.b(this.F, fb2Var)) {
            this.F = fb2Var;
            yh2.l(this);
        }
        this.H = function0;
        boolean z6 = this.R;
        bn1 bn1Var2 = this.Q;
        if (z6 != (bn1Var2 == null && this.D != null)) {
            if (bn1Var2 == null && this.D != null) {
                z4 = true;
            }
            this.R = z4;
            if (!z4) {
            }
        }
        z3 = z2;
        if (z3 && ((o90Var = this.L) != null || !this.R)) {
            if (o90Var != null) {
                H0(o90Var);
            }
            this.L = null;
            L0();
        }
        cp0Var.J0(this.C);
    }

    @Override // defpackage.b81
    public final boolean V(KeyEvent keyEvent) {
        int x;
        L0();
        boolean z = this.G;
        LinkedHashMap linkedHashMap = this.O;
        if (z) {
            int i = ou.b;
            if (z71.D(keyEvent) == 2 && ((x = (int) (z71.x(keyEvent) >> 32)) == 23 || x == 66 || x == 160)) {
                if (!linkedHashMap.containsKey(new w71(s93.l(keyEvent.getKeyCode())))) {
                    u42 u42Var = new u42(this.P);
                    linkedHashMap.put(new w71(s93.l(keyEvent.getKeyCode())), u42Var);
                    if (this.C != null) {
                        z71.H(u0(), null, new y(this, u42Var, null, 0), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.G) {
            int i2 = ou.b;
            if (z71.D(keyEvent) == 1) {
                int x2 = (int) (z71.x(keyEvent) >> 32);
                if (x2 != 23 && x2 != 66 && x2 != 160) {
                    return false;
                }
                u42 u42Var2 = (u42) linkedHashMap.remove(new w71(s93.l(keyEvent.getKeyCode())));
                if (u42Var2 != null && this.C != null) {
                    z71.H(u0(), null, new y(this, u42Var2, null, 1), 3);
                }
                this.H.invoke();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.go0
    public final void X(xo0 xo0Var) {
        if (xo0Var.a()) {
            L0();
        }
        if (this.G) {
            this.J.X(xo0Var);
        }
    }

    @Override // defpackage.w22
    public final void h0() {
        cy0 cy0Var;
        bn1 bn1Var = this.C;
        if (bn1Var != null && (cy0Var = this.N) != null) {
            bn1Var.c(new dy0(cy0Var));
        }
        this.N = null;
        vr2 vr2Var = this.K;
        if (vr2Var != null) {
            vr2Var.h0();
        }
    }

    @Override // defpackage.xh2
    public final boolean k0() {
        return true;
    }

    @Override // defpackage.b81
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.rz2
    public final Object r() {
        return this.S;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.ul1
    public final void y0() {
        if (!this.R) {
            L0();
        }
        if (this.G) {
            G0(this.I);
            G0(this.J);
        }
    }

    @Override // defpackage.ul1
    public final void z0() {
        K0();
        if (this.Q == null) {
            this.C = null;
        }
        o90 o90Var = this.L;
        if (o90Var != null) {
            H0(o90Var);
        }
        this.L = null;
    }

    public void J0(sh2 sh2Var) {
    }
}
