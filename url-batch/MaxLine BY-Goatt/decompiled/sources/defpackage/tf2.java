package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tf2 extends p90 implements xt1, so0, b81, xh2, w22, l00 {
    public ww1 C;
    public gs1 D;
    public boolean E;
    public bn1 F;
    public lq G;
    public od0 H;
    public boolean I;
    public vr2 J;
    public px1 K;
    public om0 L;
    public final js0 M;
    public final kf2 N;
    public final b80 O;
    public final cg2 P;
    public final pf2 Q;
    public final h20 R;
    public qb2 S;
    public c0 T;
    public qf2 U;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [om0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, p90, tf2] */
    public tf2(wp wpVar, om0 om0Var, bn1 bn1Var, ww1 ww1Var, px1 px1Var, uf2 uf2Var, boolean z, boolean z2) {
        gs1 gs1Var = gs1.E;
        this.C = ww1Var;
        this.D = gs1Var;
        this.E = z;
        this.F = bn1Var;
        this.K = px1Var;
        this.L = om0Var;
        js0 js0Var = new js0(6);
        this.M = js0Var;
        kf2 kf2Var = new kf2();
        kf2Var.A = z;
        G0(kf2Var);
        this.N = kf2Var;
        b80 b80Var = new b80(new q70(new at0((ca0) a.c)));
        this.O = b80Var;
        px1 px1Var2 = this.K;
        ?? r12 = this.L;
        cg2 cg2Var = new cg2(uf2Var, px1Var2, r12 == 0 ? b80Var : r12, ww1Var, z2, js0Var);
        this.P = cg2Var;
        pf2 pf2Var = new pf2(cg2Var, z);
        this.Q = pf2Var;
        h20 h20Var = new h20(ww1Var, cg2Var, z2, wpVar);
        G0(h20Var);
        this.R = h20Var;
        G0(new mr1(pf2Var, js0Var));
        G0(new yo0(new rk(1, v41.a, v41.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 2), 3));
        sp spVar = new sp();
        spVar.A = h20Var;
        G0(spVar);
        s72 s72Var = new s72(3, this);
        fp0 fp0Var = new fp0();
        fp0Var.A = s72Var;
        G0(fp0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J0(tf2 tf2Var, r30 r30Var) {
        jd0 jd0Var;
        int i;
        if (r30Var instanceof jd0) {
            jd0Var = (jd0) r30Var;
            int i2 = jd0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jd0Var.p = i2 - Integer.MIN_VALUE;
                Object obj = jd0Var.n;
                b50 b50Var = b50.m;
                i = jd0Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    od0 od0Var = tf2Var.H;
                    if (od0Var != null) {
                        bn1 bn1Var = tf2Var.F;
                        if (bn1Var != null) {
                            nd0 nd0Var = new nd0(od0Var);
                            jd0Var.m = tf2Var;
                            jd0Var.p = 1;
                            if (bn1Var.b(nd0Var, jd0Var) == b50Var) {
                                return b50Var;
                            }
                        }
                    }
                    tf2Var.N0(0L);
                    return Unit.a;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tf2Var = jd0Var.m;
                ca2.b(obj);
                tf2Var.H = null;
                tf2Var.N0(0L);
                return Unit.a;
            }
        }
        jd0Var = new jd0(tf2Var, r30Var);
        Object obj2 = jd0Var.n;
        b50 b50Var2 = b50.m;
        i = jd0Var.p;
        if (i != 0) {
        }
        tf2Var.H = null;
        tf2Var.N0(0L);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r2.b(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K0(tf2 tf2Var, yc0 yc0Var, r30 r30Var) {
        kd0 kd0Var;
        int i;
        od0 od0Var;
        bn1 bn1Var;
        tf2 tf2Var2;
        od0 od0Var2;
        if (r30Var instanceof kd0) {
            kd0Var = (kd0) r30Var;
            int i2 = kd0Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kd0Var.r = i2 - Integer.MIN_VALUE;
                Object obj = kd0Var.p;
                b50 b50Var = b50.m;
                i = kd0Var.r;
                if (i != 0) {
                    ca2.b(obj);
                    od0 od0Var3 = tf2Var.H;
                    if (od0Var3 != null && (r2 = tf2Var.F) != null) {
                        nd0 nd0Var = new nd0(od0Var3);
                        kd0Var.m = tf2Var;
                        kd0Var.n = yc0Var;
                        kd0Var.r = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        od0Var2 = kd0Var.o;
                        yc0Var = kd0Var.n;
                        tf2Var2 = kd0Var.m;
                        ca2.b(obj);
                        od0Var = od0Var2;
                        tf2Var = tf2Var2;
                        tf2Var.H = od0Var;
                        long j = yc0Var.a;
                        return Unit.a;
                    }
                    yc0Var = kd0Var.n;
                    tf2Var = kd0Var.m;
                    ca2.b(obj);
                }
                od0Var = new od0();
                bn1Var = tf2Var.F;
                if (bn1Var != null) {
                    kd0Var.m = tf2Var;
                    kd0Var.n = yc0Var;
                    kd0Var.o = od0Var;
                    kd0Var.r = 2;
                    if (bn1Var.b(od0Var, kd0Var) != b50Var) {
                        tf2Var2 = tf2Var;
                        od0Var2 = od0Var;
                        od0Var = od0Var2;
                        tf2Var = tf2Var2;
                    }
                    return b50Var;
                }
                tf2Var.H = od0Var;
                long j2 = yc0Var.a;
                return Unit.a;
            }
        }
        kd0Var = new kd0(tf2Var, r30Var);
        Object obj2 = kd0Var.p;
        b50 b50Var2 = b50.m;
        i = kd0Var.r;
        if (i != 0) {
        }
        od0Var = new od0();
        bn1Var = tf2Var.F;
        if (bn1Var != null) {
        }
        tf2Var.H = od0Var;
        long j22 = yc0Var.a;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L0(tf2 tf2Var, zc0 zc0Var, r30 r30Var) {
        ld0 ld0Var;
        int i;
        if (r30Var instanceof ld0) {
            ld0Var = (ld0) r30Var;
            int i2 = ld0Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ld0Var.q = i2 - Integer.MIN_VALUE;
                Object obj = ld0Var.o;
                b50 b50Var = b50.m;
                i = ld0Var.q;
                if (i != 0) {
                    ca2.b(obj);
                    od0 od0Var = tf2Var.H;
                    if (od0Var != null) {
                        bn1 bn1Var = tf2Var.F;
                        if (bn1Var != null) {
                            pd0 pd0Var = new pd0(od0Var);
                            ld0Var.m = tf2Var;
                            ld0Var.n = zc0Var;
                            ld0Var.q = 1;
                            if (bn1Var.b(pd0Var, ld0Var) == b50Var) {
                                return b50Var;
                            }
                        }
                    }
                    tf2Var.N0(zc0Var.a);
                    return Unit.a;
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zc0Var = ld0Var.n;
                tf2Var = ld0Var.m;
                ca2.b(obj);
                tf2Var.H = null;
                tf2Var.N0(zc0Var.a);
                return Unit.a;
            }
        }
        ld0Var = new ld0(tf2Var, r30Var);
        Object obj2 = ld0Var.o;
        b50 b50Var2 = b50.m;
        i = ld0Var.q;
        if (i != 0) {
        }
        tf2Var.H = null;
        tf2Var.N0(zc0Var.a);
        return Unit.a;
    }

    @Override // defpackage.w22
    public final void J(m22 m22Var, n22 n22Var, long j) {
        o30 o30Var;
        long j2;
        List list = m22Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            o30Var = null;
            if (i >= size) {
                break;
            }
            if (((Boolean) this.D.invoke((t22) list.get(i))).booleanValue()) {
                if (this.E && this.J == null) {
                    v vVar = new v(23, o30Var, this);
                    m22 m22Var2 = rr2.a;
                    vr2 vr2Var = new vr2(null, null, sr2.m);
                    vr2Var.C = vVar;
                    G0(vr2Var);
                    this.J = vr2Var;
                }
                vr2 vr2Var2 = this.J;
                if (vr2Var2 != null) {
                    vr2Var2.J(m22Var, n22Var, j);
                }
            } else {
                i++;
            }
        }
        if (n22Var == n22.n && m22Var.c == 6) {
            List list2 = m22Var.a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((t22) list2.get(i2)).b()) {
                    return;
                }
            }
            this.S.getClass();
            ca0 ca0Var = s03.J(this).I;
            au1 au1Var = new au1(0L);
            int size3 = list2.size();
            int i3 = 0;
            while (true) {
                j2 = au1Var.a;
                if (i3 >= size3) {
                    break;
                }
                au1Var = new au1(au1.g(j2, ((t22) list2.get(i3)).j));
                i3++;
            }
            z71.H(u0(), null, new qf2(this, au1.h(j2, -ca0Var.D(64.0f)), o30Var, 2), 3);
            int size4 = list2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((t22) list2.get(i4)).a();
            }
        }
    }

    @Override // defpackage.xt1
    public final void L() {
        j8.P(this, new id0(this, 2));
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        if (this.E && (this.T == null || this.U == null)) {
            this.T = new c0(16, this);
            this.U = new qf2(this, null);
        }
        c0 c0Var = this.T;
        if (c0Var != null) {
            t71[] t71VarArr = ii2.a;
            sh2Var.d(rh2.d, new r1(null, c0Var));
        }
        qf2 qf2Var = this.U;
        if (qf2Var != null) {
            t71[] t71VarArr2 = ii2.a;
            sh2Var.d(rh2.e, qf2Var);
        }
    }

    public final void M0() {
        od0 od0Var = this.H;
        if (od0Var != null) {
            bn1 bn1Var = this.F;
            if (bn1Var != null) {
                bn1Var.c(new nd0(od0Var));
            }
            this.H = null;
        }
    }

    public final void N0(long j) {
        a50 a50Var = (a50) ((Function0) this.M.o).invoke();
        if (a50Var == null) {
            lh.g("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        } else {
            z71.H(a50Var, null, new qf2(this, j, null, 0), 3);
        }
    }

    @Override // defpackage.so0
    public final void T(qo0 qo0Var) {
        qo0Var.b(false);
    }

    @Override // defpackage.b81
    public final boolean V(KeyEvent keyEvent) {
        long i;
        if (!this.E || ((!w71.a(z71.x(keyEvent), w71.n) && !w71.a(s93.l(keyEvent.getKeyCode()), w71.m)) || z71.D(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.P.d == ww1.m;
        h20 h20Var = this.R;
        if (z) {
            int i2 = (int) (h20Var.I & 4294967295L);
            i = ap.i(0.0f, w71.a(s93.l(keyEvent.getKeyCode()), w71.m) ? i2 : -i2);
        } else {
            int i3 = (int) (h20Var.I >> 32);
            i = ap.i(w71.a(s93.l(keyEvent.getKeyCode()), w71.m) ? i3 : -i3, 0.0f);
        }
        z71.H(u0(), null, new qf2(this, i, null, 1), 3);
        return true;
    }

    @Override // defpackage.w22
    public final void h0() {
        vr2 vr2Var = this.J;
        if (vr2Var != null) {
            vr2Var.h0();
        }
    }

    @Override // defpackage.b81
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.ul1
    public final void y0() {
        j8.P(this, new id0(this, 2));
        this.S = qb2.D;
    }

    @Override // defpackage.ul1
    public final void z0() {
        this.I = false;
        M0();
    }
}
