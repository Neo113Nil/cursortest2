package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v71 extends zq implements hc0, j81, tx0, d80, ul {
    public boolean A;
    public boolean B;
    public ht C;
    public lt D;
    public kt E;
    public jt F;
    public uq1 G;
    public nq0 H;
    public long I;
    public xi1 J;
    public b80 K;
    public long L;
    public i5 M;
    public xp N;
    public final wo0 O;
    public final k71 P;
    public final xp Q;
    public final d81 R;
    public final u2 S;
    public final o10 T;
    public final wm U;
    public jl V;
    public t71 W;
    public zr X;
    public et0 u;
    public k61 v;
    public boolean w;
    public gn0 x;
    public we y;
    public yt z;

    public v71(i5 i5Var, xp xpVar, gn0 gn0Var, et0 et0Var, w71 w71Var, boolean z, boolean z2) {
        k61 k61Var = p71.a;
        this.u = et0Var;
        this.v = k61Var;
        this.w = z;
        this.x = gn0Var;
        this.I = 9205357640488583168L;
        this.L = 0L;
        this.M = i5Var;
        this.N = xpVar;
        wo0 wo0Var = new wo0();
        this.O = wo0Var;
        k71 k71Var = new k71();
        k71Var.s = z;
        z0(k71Var);
        this.P = k71Var;
        xp xpVar2 = new xp(new qp(new nq0(p71.d)));
        this.Q = xpVar2;
        i5 i5Var2 = this.M;
        xp xpVar3 = this.N;
        d81 d81Var = new d81(w71Var, i5Var2, xpVar3 == null ? xpVar2 : xpVar3, et0Var, z2, wo0Var, this, new r71(this, 0));
        this.R = d81Var;
        u2 u2Var = new u2(d81Var, z, 2);
        this.S = u2Var;
        o10 o10Var = new o10(2, null, 10);
        z0(o10Var);
        this.T = o10Var;
        wm wmVar = new wm(et0Var, d81Var, z2, new r71(this, 1));
        z0(wmVar);
        this.U = wmVar;
        z0(new ap0(u2Var, wo0Var));
        he heVar = new he();
        heVar.s = wmVar;
        z0(heVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C0(v71 v71Var, fn fnVar) {
        tt ttVar;
        int i;
        if (fnVar instanceof tt) {
            ttVar = (tt) fnVar;
            int i2 = ttVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ttVar.j = i2 - Integer.MIN_VALUE;
                Object obj = ttVar.h;
                tn tnVar = tn.d;
                i = ttVar.j;
                dn dnVar = null;
                if (i != 0) {
                    ca0.v(obj);
                    yt ytVar = v71Var.z;
                    if (ytVar != null) {
                        gn0 gn0Var = v71Var.x;
                        if (gn0Var != null) {
                            xt xtVar = new xt(ytVar);
                            ttVar.j = 1;
                            if (gn0Var.a(xtVar, ttVar) == tnVar) {
                                return tnVar;
                            }
                        }
                    }
                    uq1.N(v71Var.O.c(), null, new d(new pt(0L, false), v71Var, dnVar, 18), 3);
                    return Unit.a;
                }
                if (i != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                v71Var.z = null;
                uq1.N(v71Var.O.c(), null, new d(new pt(0L, false), v71Var, dnVar, 18), 3);
                return Unit.a;
            }
        }
        ttVar = new tt(v71Var, fnVar);
        Object obj2 = ttVar.h;
        tn tnVar2 = tn.d;
        i = ttVar.j;
        dn dnVar2 = null;
        if (i != 0) {
        }
        v71Var.z = null;
        uq1.N(v71Var.O.c(), null, new d(new pt(0L, false), v71Var, dnVar2, 18), 3);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r2.a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(v71 v71Var, ot otVar, fn fnVar) {
        ut utVar;
        int i;
        yt ytVar;
        gn0 gn0Var;
        ot otVar2;
        yt ytVar2;
        if (fnVar instanceof ut) {
            utVar = (ut) fnVar;
            int i2 = utVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                utVar.l = i2 - Integer.MIN_VALUE;
                Object obj = utVar.j;
                tn tnVar = tn.d;
                i = utVar.l;
                if (i != 0) {
                    ca0.v(obj);
                    yt ytVar3 = v71Var.z;
                    if (ytVar3 != null && (r2 = v71Var.x) != null) {
                        xt xtVar = new xt(ytVar3);
                        utVar.h = otVar;
                        utVar.l = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ytVar2 = utVar.i;
                        otVar2 = utVar.h;
                        ca0.v(obj);
                        ytVar = ytVar2;
                        otVar = otVar2;
                        v71Var.z = ytVar;
                        long j = otVar.a;
                        return Unit.a;
                    }
                    otVar = utVar.h;
                    ca0.v(obj);
                }
                ytVar = new yt();
                gn0Var = v71Var.x;
                if (gn0Var != null) {
                    utVar.h = otVar;
                    utVar.i = ytVar;
                    utVar.l = 2;
                    if (gn0Var.a(ytVar, utVar) != tnVar) {
                        otVar2 = otVar;
                        ytVar2 = ytVar;
                        ytVar = ytVar2;
                        otVar = otVar2;
                    }
                    return tnVar;
                }
                v71Var.z = ytVar;
                long j2 = otVar.a;
                return Unit.a;
            }
        }
        utVar = new ut(v71Var, fnVar);
        Object obj2 = utVar.j;
        tn tnVar2 = tn.d;
        i = utVar.l;
        if (i != 0) {
        }
        ytVar = new yt();
        gn0Var = v71Var.x;
        if (gn0Var != null) {
        }
        v71Var.z = ytVar;
        long j22 = otVar.a;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E0(v71 v71Var, pt ptVar, fn fnVar) {
        vt vtVar;
        int i;
        if (fnVar instanceof vt) {
            vtVar = (vt) fnVar;
            int i2 = vtVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vtVar.k = i2 - Integer.MIN_VALUE;
                Object obj = vtVar.i;
                tn tnVar = tn.d;
                i = vtVar.k;
                dn dnVar = null;
                if (i != 0) {
                    ca0.v(obj);
                    yt ytVar = v71Var.z;
                    if (ytVar != null) {
                        gn0 gn0Var = v71Var.x;
                        if (gn0Var != null) {
                            zt ztVar = new zt(ytVar);
                            vtVar.h = ptVar;
                            vtVar.k = 1;
                            if (gn0Var.a(ztVar, vtVar) == tnVar) {
                                return tnVar;
                            }
                        }
                    }
                    uq1.N(v71Var.O.c(), null, new d(ptVar, v71Var, dnVar, 18), 3);
                    return Unit.a;
                }
                if (i != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ptVar = vtVar.h;
                ca0.v(obj);
                v71Var.z = null;
                uq1.N(v71Var.O.c(), null, new d(ptVar, v71Var, dnVar, 18), 3);
                return Unit.a;
            }
        }
        vtVar = new vt(v71Var, fnVar);
        Object obj2 = vtVar.i;
        tn tnVar2 = tn.d;
        i = vtVar.k;
        dn dnVar2 = null;
        if (i != 0) {
        }
        v71Var.z = null;
        uq1.N(v71Var.O.c(), null, new d(ptVar, v71Var, dnVar2, 18), 3);
        return Unit.a;
    }

    public static void I0(v71 v71Var, qx0 qx0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        kt ktVar = v71Var.E;
        if (ktVar == null) {
            ktVar = new kt();
            ktVar.v = null;
            ktVar.w = Long.MAX_VALUE;
            ktVar.x = false;
            v71Var.E = ktVar;
        }
        ktVar.v = qx0Var;
        ktVar.w = j;
        xi1 xi1Var = v71Var.J;
        et0 et0Var = v71Var.u;
        if (xi1Var == null) {
            v71Var.J = new xi1(et0Var);
        } else {
            xi1Var.e = et0Var;
            xi1Var.d = j2;
        }
        ktVar.x = false;
        v71Var.G = ktVar;
    }

    public final void F0() {
        yt ytVar = this.z;
        if (ytVar != null) {
            gn0 gn0Var = this.x;
            if (gn0Var != null) {
                gn0Var.b(new xt(ytVar));
            }
            this.z = null;
        }
    }

    public final void G0() {
        ht htVar = this.C;
        if (htVar == null) {
            gt gtVar = gt.g;
            htVar = new ht();
            htVar.v = gtVar;
            htVar.w = false;
            this.C = htVar;
        }
        htVar.v = gt.g;
        htVar.w = false;
        this.G = htVar;
    }

    public final void H0(qx0 qx0Var, long j, xi1 xi1Var) {
        jt jtVar = this.F;
        if (jtVar == null) {
            jtVar = new jt();
            jtVar.v = null;
            jtVar.w = Long.MAX_VALUE;
            this.F = jtVar;
        }
        jtVar.v = qx0Var;
        jtVar.w = j;
        xi1Var.d = 0L;
        this.G = jtVar;
    }

    public final void J0(qt qtVar) {
        if ((qtVar instanceof ot) && !this.A) {
            this.A = true;
            P0();
        }
        K0().s(qtVar);
    }

    @Override // defpackage.hc0
    public final boolean K(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (!this.w || ((!fc0.a(xa0.a(keyEvent.getKeyCode()), fc0.n) && !fc0.a(xa0.a(keyEvent.getKeyCode()), fc0.m)) || ka0.t(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.R.d == et0.d;
        wm wmVar = this.U;
        if (z) {
            int i = (int) (wmVar.y & 4294967295L);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(fc0.a(xa0.a(keyEvent.getKeyCode()), fc0.m) ? i : -i));
        } else {
            int i2 = (int) (wmVar.y >> 32);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(fc0.a(xa0.a(keyEvent.getKeyCode()), fc0.m) ? i2 : -i2) << 32);
        }
        uq1.N(n0(), null, new t71(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    public final fg K0() {
        we weVar = this.y;
        if (weVar != null) {
            return weVar;
        }
        dd0.e("Events channel not initialized.");
        return null;
    }

    public final nq0 L0() {
        nq0 nq0Var = this.H;
        if (nq0Var != null) {
            return nq0Var;
        }
        dd0.e("Velocity Tracker not initialized.");
        return null;
    }

    public final void M0(qx0 qx0Var, long j) {
        long b = op.H(this.d).b(0L);
        if (!wq0.b(this.I, 9205357640488583168L) && !wq0.b(b, this.I)) {
            this.L = wq0.e(this.L, wq0.d(b, this.I));
        }
        this.I = b;
        ka0.e(L0(), qx0Var, this.L);
        K0().s(new nt(j, false));
    }

    public final void N0(qx0 qx0Var, qx0 qx0Var2, long j) {
        if (this.H == null) {
            this.H = new nq0(20);
        }
        ka0.e(L0(), qx0Var, 0L);
        long d = wq0.d(qx0Var2.c, j);
        this.L = 0L;
        k61 k61Var = this.v;
        int i = qx0Var.i;
        k61Var.getClass();
        if (i == 2) {
            return;
        }
        if (!this.A) {
            if (this.y == null) {
                this.y = yr1.i(Integer.MAX_VALUE, 6, null);
            }
            P0();
        }
        this.I = op.H(this).b(0L);
        K0().s(new ot(d));
    }

    public final boolean O0() {
        d81 d81Var = this.R;
        if (d81Var.a.b()) {
            return true;
        }
        i5 i5Var = d81Var.b;
        if (i5Var == null) {
            return false;
        }
        su suVar = i5Var.c;
        EdgeEffect edgeEffect = suVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d8.c(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = suVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d8.c(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = suVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? d8.c(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = suVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? d8.c(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void P0() {
        this.A = true;
        if (this.y == null) {
            this.y = yr1.i(Integer.MAX_VALUE, 6, null);
        }
        uq1.N(n0(), null, new wt(this, null), 3);
    }

    public final void Q0(i5 i5Var, xp xpVar, gn0 gn0Var, et0 et0Var, w71 w71Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.w != z) {
            this.S.g = z;
            this.P.s = z;
            z3 = true;
        } else {
            z3 = false;
        }
        xp xpVar2 = xpVar == null ? this.Q : xpVar;
        d81 d81Var = this.R;
        if (Intrinsics.a(d81Var.a, w71Var)) {
            z4 = false;
        } else {
            d81Var.a = w71Var;
            z4 = true;
        }
        d81Var.b = i5Var;
        if (d81Var.d != et0Var) {
            d81Var.d = et0Var;
            z4 = true;
        }
        if (d81Var.e != z2) {
            d81Var.e = z2;
            z4 = true;
        }
        d81Var.c = xpVar2;
        d81Var.f = this.O;
        wm wmVar = this.U;
        wmVar.s = et0Var;
        wmVar.u = z2;
        this.M = i5Var;
        this.N = xpVar;
        k61 k61Var = p71.a;
        et0 et0Var2 = d81Var.d;
        et0 et0Var3 = et0.d;
        if (et0Var2 != et0Var3) {
            et0Var3 = et0.e;
        }
        this.v = k61Var;
        if (this.w != z) {
            this.w = z;
            if (!z) {
                F0();
                this.K = null;
            }
            z4 = true;
        }
        if (!Intrinsics.a(this.x, gn0Var)) {
            F0();
            this.x = gn0Var;
        }
        if (this.u != et0Var3) {
            this.u = et0Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.B;
            mt mtVar = mt.a;
            if (z6) {
                G0();
                if (this.A) {
                    K0().s(mtVar);
                }
                this.H = null;
            }
            b80 b80Var = this.K;
            if (b80Var != null) {
                b80Var.a();
                v71 v71Var = b80Var.a;
                if (v71Var.A) {
                    v71Var.J0(mtVar);
                }
                b80Var.g = null;
                c80 c80Var = b80Var.k;
                c80Var.a = 0;
                c80Var.b.clear();
            }
        }
        if (z3) {
            this.V = null;
            this.W = null;
            ka0.v(this);
        }
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        if (this.w && (this.V == null || this.W == null)) {
            this.V = new jl(8, this);
            this.W = new t71(this, null);
        }
        jl jlVar = this.V;
        if (jlVar != null) {
            dc0[] dc0VarArr = s81.a;
            u81Var.a(g81.d, new z0(null, jlVar));
        }
        t71 t71Var = this.W;
        if (t71Var != null) {
            dc0[] dc0VarArr2 = s81.a;
            u81Var.a(g81.e, t71Var);
        }
    }

    @Override // defpackage.tx0
    public final void X() {
        if (this.B) {
            G0();
            if (this.A) {
                K0().s(mt.a);
            }
            this.H = null;
        }
        this.B = false;
    }

    @Override // defpackage.yq
    public final void a() {
        X();
        if (this.r) {
            nr nrVar = op.I(this).C;
            xp xpVar = this.Q;
            xpVar.getClass();
            xpVar.a = new qp(new nq0(nrVar));
        }
        zr zrVar = this.X;
        if (zrVar != null) {
            zrVar.e = op.I(this).C;
        }
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.d80
    public final void r() {
        b80 b80Var = this.K;
        if (b80Var != null) {
            b80Var.a();
            v71 v71Var = b80Var.a;
            if (v71Var.A) {
                v71Var.J0(mt.a);
            }
            b80Var.g = null;
            c80 c80Var = b80Var.k;
            c80Var.a = 0;
            c80Var.b.clear();
        }
    }

    @Override // defpackage.zl0
    public final void r0() {
        if (this.r) {
            nr nrVar = op.I(this).C;
            xp xpVar = this.Q;
            xpVar.getClass();
            xpVar.a = new qp(new nq0(nrVar));
        }
        zr zrVar = this.X;
        if (zrVar != null) {
            zrVar.e = op.I(this).C;
        }
    }

    @Override // defpackage.zl0
    public final void s0() {
        this.A = false;
        F0();
        this.L = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    @Override // defpackage.d80
    public final void y(u5 u5Var, nx0 nx0Var) {
        Object obj;
        Object obj2;
        boolean z;
        float f;
        Object obj3;
        u70 u70Var;
        float intBitsToFloat;
        u70 u70Var2;
        u70 u70Var3;
        int i = u5Var.a;
        ArrayList arrayList = (ArrayList) u5Var.b;
        if (this.w) {
            if (this.K == null) {
                this.K = new b80(this);
            }
            b80 b80Var = this.K;
            if (b80Var != null) {
                v71 v71Var = b80Var.a;
                if (b80Var.f == null) {
                    w70 w70Var = b80Var.b;
                    if (w70Var == null) {
                        v70 v70Var = v70.g;
                        w70Var = new w70();
                        w70Var.x = v70Var;
                        w70Var.y = false;
                        b80Var.b = w70Var;
                    }
                    b80Var.f = w70Var;
                }
                la0 la0Var = b80Var.f;
                if (la0Var == null) {
                    dd0.e("currentDragState should not be null");
                    return;
                }
                if (la0Var instanceof w70) {
                    w70 w70Var2 = (w70) la0Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        u70 u70Var4 = (u70) arrayList.get(i2);
                        if (u70Var4.h || !u70Var4.d) {
                            return;
                        }
                    }
                    u70 u70Var5 = (u70) CollectionsKt.p(arrayList);
                    v70 v70Var2 = a80.a[w70Var2.x.ordinal()] == 1 ? !v71Var.O0() ? v70.d : v70.e : w70Var2.x;
                    w70Var2.x = v70Var2;
                    if (nx0Var == nx0.d && v70Var2 == v70.e) {
                        u70Var5.i = true;
                        w70Var2.y = true;
                    }
                    if (nx0Var == nx0.e) {
                        if (v70Var2 == v70.d) {
                            b80.c(b80Var, u70Var5, u70Var5.a, 0L, 12);
                            return;
                        }
                        if (w70Var2.y) {
                            b80Var.f(u70Var5, u70Var5, new t70(i), 0L);
                            b80Var.e(u70Var5, new t70(i), 0L);
                            long j = u70Var5.a;
                            z70 z70Var = b80Var.c;
                            if (z70Var == null) {
                                z70Var = new z70();
                                z70Var.x = Long.MAX_VALUE;
                                b80Var.c = z70Var;
                            }
                            z70Var.x = j;
                            b80Var.f = z70Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(la0Var instanceof y70)) {
                    if (la0Var instanceof x70) {
                        x70 x70Var = (x70) la0Var;
                        if (nx0Var != nx0.g) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                z = true;
                                break;
                            } else {
                                if (((u70) arrayList.get(i3)).i) {
                                    z = false;
                                    break;
                                }
                                i3++;
                            }
                        }
                        int size3 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                break;
                            }
                            if (!((u70) arrayList.get(i4)).d) {
                                i4++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    long P = uq1.P((u70) CollectionsKt.p(arrayList), v71Var.u, new t70(i));
                                    u70 u70Var6 = x70Var.x;
                                    u70Var6.getClass();
                                    long d = wq0.d(P, uq1.P(u70Var6, v71Var.u, new t70(i)));
                                    u70 u70Var7 = x70Var.x;
                                    if (u70Var7 != null) {
                                        b80.c(b80Var, u70Var7, x70Var.y, d, 8);
                                        return;
                                    } else {
                                        dd0.e("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        b80Var.a();
                        return;
                    }
                    if (!(la0Var instanceof z70)) {
                        l.a();
                        return;
                    }
                    z70 z70Var2 = (z70) la0Var;
                    if (nx0Var != nx0.e) {
                        return;
                    }
                    long j2 = z70Var2.x;
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i5);
                        if (xa0.n(((u70) obj).a, j2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    u70 u70Var8 = (u70) obj;
                    if (u70Var8 == null) {
                        return;
                    }
                    boolean u = uq1.u(u70Var8);
                    mt mtVar = mt.a;
                    if (!u) {
                        if (u70Var8.i) {
                            v71Var.J0(mtVar);
                            return;
                        }
                        et0 et0Var = v71Var.u;
                        t70 t70Var = new t70(i);
                        if (wq0.c(wq0.d(uq1.P(u70Var8, et0Var, t70Var), uq1.Q(u70Var8, et0Var, t70Var))) == 0.0f) {
                            return;
                        }
                        et0 et0Var2 = v71Var.u;
                        t70 t70Var2 = new t70(i);
                        b80Var.e(u70Var8, new t70(i), u70Var8.i ? 0L : wq0.d(uq1.P(u70Var8, et0Var2, t70Var2), uq1.Q(u70Var8, et0Var2, t70Var2)));
                        u70Var8.i = true;
                        return;
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i6);
                        if (((u70) obj2).d) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    u70 u70Var9 = (u70) obj2;
                    if (u70Var9 != null) {
                        z70Var2.x = u70Var9.a;
                        return;
                    }
                    if (u70Var8.i || !uq1.u(u70Var8)) {
                        v71Var.J0(mtVar);
                    } else {
                        uq1.t(b80Var.d(), u70Var8, v71Var.u, new t70(i), b80Var.j, b80Var.l);
                        float a = ((on1) mo.k(v71Var, yl.s)).a();
                        long p = b80Var.d().p(ca0.d(a, a));
                        tq tqVar = (tq) b80Var.d().e;
                        zm1 zm1Var = (zm1) tqVar.b;
                        qo[] qoVarArr = zm1Var.d;
                        Arrays.fill(qoVarArr, 0, qoVarArr.length, (Object) null);
                        zm1Var.e = 0;
                        zm1 zm1Var2 = (zm1) tqVar.c;
                        qo[] qoVarArr2 = zm1Var2.d;
                        Arrays.fill(qoVarArr2, 0, qoVarArr2.length, (Object) null);
                        zm1Var2.e = 0;
                        tqVar.a = 0L;
                        v71Var.J0(new pt(bu.a(p), true));
                    }
                    b80Var.a();
                    return;
                }
                y70 y70Var = (y70) la0Var;
                if (nx0Var == nx0.d) {
                    return;
                }
                int size6 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        f = 0.0f;
                        obj3 = null;
                        break;
                    } else {
                        obj3 = arrayList.get(i7);
                        f = 0.0f;
                        if (xa0.n(((u70) obj3).a, y70Var.y)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                u70 u70Var10 = (u70) obj3;
                if (u70Var10 == null) {
                    int size7 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            u70Var3 = 0;
                            break;
                        }
                        u70Var3 = arrayList.get(i8);
                        if (((u70) u70Var3).d) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    u70Var10 = u70Var3;
                    if (u70Var10 == null) {
                        b80Var.a();
                        return;
                    }
                    y70Var.y = u70Var10.a;
                }
                if (nx0Var == nx0.e) {
                    if (u70Var10.i) {
                        u70Var = u70Var10;
                        u70 u70Var11 = y70Var.x;
                        if (u70Var11 == null) {
                            dd0.e("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = y70Var.y;
                        xi1 xi1Var = b80Var.i;
                        if (xi1Var == null) {
                            dd0.e("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        b80Var.b(u70Var11, j3, xi1Var);
                    } else if (uq1.u(u70Var10)) {
                        int size8 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size8) {
                                u70Var2 = null;
                                break;
                            }
                            ?? r6 = arrayList.get(i9);
                            if (((u70) r6).d) {
                                u70Var2 = r6;
                                break;
                            }
                            i9++;
                        }
                        u70 u70Var12 = u70Var2;
                        if (u70Var12 == null) {
                            b80Var.a();
                        } else {
                            y70Var.y = u70Var12.a;
                        }
                    } else {
                        on1 on1Var = (on1) mo.k(v71Var, yl.s);
                        float f2 = rt.a;
                        float b = on1Var.b();
                        xi1 xi1Var2 = b80Var.i;
                        if (xi1Var2 == null) {
                            dd0.e("Touch slop detector not initialized.");
                            return;
                        }
                        long P2 = uq1.P(u70Var10, v71Var.u, new t70(i));
                        et0 et0Var3 = v71Var.u;
                        long j4 = u70Var10.g;
                        if (et0Var3 != null) {
                            if (i == 1) {
                                intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                            } else if (i == 2) {
                                intBitsToFloat = Float.intBitsToFloat((int) (j4 & 4294967295L));
                            }
                            j4 = et0Var3 == et0.e ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f) & 4294967295L) : (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                        }
                        long a2 = xi1Var2.a(b, P2, j4);
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            u70Var10.i = true;
                            u70 u70Var13 = y70Var.x;
                            u70Var13.getClass();
                            u70Var = u70Var10;
                            b80Var.f(u70Var13, u70Var, new t70(i), a2);
                            b80Var.e(u70Var, new t70(i), a2);
                            long j5 = u70Var.a;
                            z70 z70Var3 = b80Var.c;
                            if (z70Var3 == null) {
                                z70Var3 = new z70();
                                z70Var3.x = Long.MAX_VALUE;
                                b80Var.c = z70Var3;
                            }
                            z70Var3.x = j5;
                            b80Var.f = z70Var3;
                        } else {
                            u70Var = u70Var10;
                            y70Var.z = true;
                        }
                    }
                    if (nx0Var == nx0.g || !y70Var.z) {
                    }
                    if (!u70Var.i) {
                        y70Var.z = false;
                        return;
                    }
                    u70 u70Var14 = y70Var.x;
                    if (u70Var14 == null) {
                        dd0.e("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j6 = y70Var.y;
                    xi1 xi1Var3 = b80Var.i;
                    if (xi1Var3 != null) {
                        b80Var.b(u70Var14, j6, xi1Var3);
                        return;
                    } else {
                        dd0.e("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                }
                u70Var = u70Var10;
                if (nx0Var == nx0.g) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f2  */
    @Override // defpackage.tx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(mx0 mx0Var, nx0 nx0Var, long j) {
        int i;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        String str;
        Object obj4;
        Object obj5;
        v71 v71Var = this;
        List list = mx0Var.a;
        List list2 = mx0Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            qx0 qx0Var = (qx0) list.get(i2);
            k61 k61Var = v71Var.v;
            int i3 = qx0Var.i;
            k61Var.getClass();
            if (i3 == 2) {
                i2++;
            } else {
                v71Var.B = true;
                if (v71Var.w) {
                    if (v71Var.G == null) {
                        ht htVar = v71Var.C;
                        if (htVar == null) {
                            gt gtVar = gt.g;
                            htVar = new ht();
                            htVar.v = gtVar;
                            htVar.w = false;
                            v71Var.C = htVar;
                        }
                        v71Var.G = htVar;
                    }
                    uq1 uq1Var = v71Var.G;
                    if (uq1Var == null) {
                        dd0.e("currentDragState should not be null");
                        return;
                    }
                    if (uq1Var instanceof ht) {
                        ht htVar2 = (ht) uq1Var;
                        if (!list.isEmpty() && kg1.c(mx0Var, false)) {
                            qx0 qx0Var2 = (qx0) CollectionsKt.p(list);
                            gt gtVar2 = st.a[htVar2.v.ordinal()] == 1 ? !v71Var.O0() ? gt.d : gt.e : htVar2.v;
                            htVar2.v = gtVar2;
                            if (nx0Var == nx0.d && gtVar2 == gt.e) {
                                qx0Var2.a();
                                htVar2.w = true;
                            }
                            if (nx0Var == nx0.e) {
                                if (gtVar2 == gt.d) {
                                    I0(v71Var, qx0Var2, qx0Var2.a, 0L, 12);
                                } else if (htVar2.w) {
                                    v71Var.N0(qx0Var2, qx0Var2, 0L);
                                    v71Var.M0(qx0Var2, 0L);
                                    long j2 = qx0Var2.a;
                                    lt ltVar = v71Var.D;
                                    if (ltVar == null) {
                                        ltVar = new lt();
                                        ltVar.v = Long.MAX_VALUE;
                                        v71Var.D = ltVar;
                                    }
                                    ltVar.v = j2;
                                    v71Var.G = ltVar;
                                }
                            }
                        }
                    } else if (uq1Var instanceof kt) {
                        kt ktVar = (kt) uq1Var;
                        if (nx0Var != nx0.d) {
                            int size2 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i4);
                                if (xa0.n(((qx0) obj3).a, ktVar.w)) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            qx0 qx0Var3 = (qx0) obj3;
                            if (qx0Var3 == null) {
                                int size3 = list.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size3) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = list.get(i5);
                                    if (((qx0) obj5).d) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                qx0Var3 = (qx0) obj5;
                                if (qx0Var3 == null) {
                                    v71Var.G0();
                                    i = 0;
                                } else {
                                    ktVar.w = qx0Var3.a;
                                }
                            }
                            if (nx0Var == nx0.e) {
                                if (qx0Var3.b()) {
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    qx0 qx0Var4 = ktVar.v;
                                    if (qx0Var4 == null) {
                                        dd0.e("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                    long j3 = ktVar.w;
                                    xi1 xi1Var = v71Var.J;
                                    if (xi1Var == null) {
                                        dd0.e(str);
                                        return;
                                    }
                                    v71Var.H0(qx0Var4, j3, xi1Var);
                                } else if (ka0.j(qx0Var3)) {
                                    int size4 = list.size();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= size4) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = list.get(i6);
                                        if (((qx0) obj4).d) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    }
                                    qx0 qx0Var5 = (qx0) obj4;
                                    if (qx0Var5 == null) {
                                        v71Var.G0();
                                    } else {
                                        ktVar.w = qx0Var5.a;
                                    }
                                } else {
                                    float a = rt.a((on1) mo.k(v71Var, yl.s), qx0Var3.i);
                                    xi1 xi1Var2 = v71Var.J;
                                    if (xi1Var2 == null) {
                                        dd0.e("Touch slop detector not initialized.");
                                        return;
                                    }
                                    str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    long a2 = xi1Var2.a(a, qx0Var3.c, qx0Var3.g);
                                    if ((9223372034707292159L & a2) != 9205357640488583168L) {
                                        qx0Var3.a();
                                        qx0 qx0Var6 = ktVar.v;
                                        qx0Var6.getClass();
                                        v71Var.N0(qx0Var6, qx0Var3, a2);
                                        v71Var.M0(qx0Var3, a2);
                                        long j4 = qx0Var3.a;
                                        lt ltVar2 = v71Var.D;
                                        if (ltVar2 == null) {
                                            ltVar2 = new lt();
                                            ltVar2.v = Long.MAX_VALUE;
                                            v71Var.D = ltVar2;
                                        }
                                        ltVar2.v = j4;
                                        v71Var.G = ltVar2;
                                    } else {
                                        ktVar.x = true;
                                    }
                                }
                                if (nx0Var == nx0.g && ktVar.x) {
                                    if (qx0Var3.b()) {
                                        ktVar.x = false;
                                        i = 0;
                                    } else {
                                        qx0 qx0Var7 = ktVar.v;
                                        if (qx0Var7 == null) {
                                            dd0.e("AwaitTouchSlop.initialDown was not initialized");
                                            return;
                                        }
                                        long j5 = ktVar.w;
                                        xi1 xi1Var3 = v71Var.J;
                                        if (xi1Var3 == null) {
                                            dd0.e(str);
                                            return;
                                        }
                                        v71Var.H0(qx0Var7, j5, xi1Var3);
                                    }
                                }
                                i = 0;
                            }
                            str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                            if (nx0Var == nx0.g) {
                                if (qx0Var3.b()) {
                                }
                            }
                            i = 0;
                        }
                    } else {
                        if (uq1Var instanceof jt) {
                            jt jtVar = (jt) uq1Var;
                            if (nx0Var == nx0.g) {
                                int size5 = list.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size5) {
                                        z = true;
                                        break;
                                    } else {
                                        if (((qx0) list.get(i7)).b()) {
                                            z = false;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                int size6 = list.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size6) {
                                        break;
                                    }
                                    if (!((qx0) list.get(i8)).d) {
                                        i8++;
                                    } else if (!list.isEmpty()) {
                                        if (z) {
                                            long j6 = ((qx0) CollectionsKt.p(list)).c;
                                            qx0 qx0Var8 = jtVar.v;
                                            qx0Var8.getClass();
                                            long d = wq0.d(j6, qx0Var8.c);
                                            qx0 qx0Var9 = jtVar.v;
                                            if (qx0Var9 == null) {
                                                dd0.e("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                            I0(v71Var, qx0Var9, jtVar.w, d, 8);
                                        }
                                    }
                                }
                                v71Var.G0();
                            }
                        } else {
                            if (!(uq1Var instanceof lt)) {
                                l.a();
                                return;
                            }
                            lt ltVar3 = (lt) uq1Var;
                            if (nx0Var == nx0.e) {
                                long j7 = ltVar3.v;
                                int size7 = list.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size7) {
                                        obj = null;
                                        break;
                                    }
                                    obj = list.get(i9);
                                    if (xa0.n(((qx0) obj).a, j7)) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                qx0 qx0Var10 = (qx0) obj;
                                if (qx0Var10 != null) {
                                    boolean j8 = ka0.j(qx0Var10);
                                    mt mtVar = mt.a;
                                    if (j8) {
                                        int size8 = list.size();
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size8) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = list.get(i10);
                                            if (((qx0) obj2).d) {
                                                break;
                                            } else {
                                                i10++;
                                            }
                                        }
                                        qx0 qx0Var11 = (qx0) obj2;
                                        if (qx0Var11 == null) {
                                            if (qx0Var10.b() || !ka0.j(qx0Var10)) {
                                                v71Var.K0().s(mtVar);
                                            } else {
                                                ka0.e(v71Var.L0(), qx0Var10, 0L);
                                                float a3 = ((on1) mo.k(v71Var, yl.s)).a();
                                                long p = v71Var.L0().p(ca0.d(a3, a3));
                                                tq tqVar = (tq) v71Var.L0().e;
                                                zm1 zm1Var = (zm1) tqVar.b;
                                                qo[] qoVarArr = zm1Var.d;
                                                Arrays.fill(qoVarArr, 0, qoVarArr.length, (Object) null);
                                                zm1Var.e = 0;
                                                zm1 zm1Var2 = (zm1) tqVar.c;
                                                qo[] qoVarArr2 = zm1Var2.d;
                                                Arrays.fill(qoVarArr2, 0, qoVarArr2.length, (Object) null);
                                                zm1Var2.e = 0;
                                                tqVar.a = 0L;
                                                v71Var.K0().s(new pt(bu.a(p), false));
                                                v71Var.B = false;
                                            }
                                            v71Var.G0();
                                        } else {
                                            ltVar3.v = qx0Var11.a;
                                        }
                                    } else if (qx0Var10.b()) {
                                        v71Var.K0().s(mtVar);
                                    } else if (wq0.c(ka0.z(qx0Var10, true)) != 0.0f) {
                                        i = 0;
                                        v71Var.M0(qx0Var10, ka0.z(qx0Var10, false));
                                        qx0Var10.a();
                                    }
                                }
                            }
                        }
                        i = 0;
                    }
                }
            }
        }
        i = 0;
        if (v71Var.w) {
            if (nx0Var == nx0.d && mx0Var.c == 6) {
                if (v71Var.X == null) {
                    v71Var = this;
                    v71Var.X = new zr(v71Var.R, new s40(5, ViewConfiguration.get(m90.K(v71Var).getContext())), new gk(2, this, v71.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), op.I(v71Var).C);
                }
                zr zrVar = v71Var.X;
                if (zrVar != null) {
                    sn n0 = v71Var.n0();
                    if (((rc1) zrVar.g) == null) {
                        zrVar.g = uq1.N(n0, null, new d(zrVar, null, 15), 3);
                    }
                }
            }
            zr zrVar2 = v71Var.X;
            if (zrVar2 == null || mx0Var.c != 6) {
                return;
            }
            int size9 = list.size();
            for (int i11 = i; i11 < size9; i11++) {
                if (((qx0) list.get(i11)).b()) {
                    return;
                }
            }
            if (nx0Var == nx0.d && zrVar2.a) {
                zrVar2.d(mx0Var);
                int size10 = list2.size();
                for (int i12 = i; i12 < size10; i12++) {
                    ((qx0) list2.get(i12)).a();
                }
            }
            if (nx0Var == nx0.e && !zrVar2.a && zrVar2.d(mx0Var)) {
                int size11 = list2.size();
                for (int i13 = i; i13 < size11; i13++) {
                    ((qx0) list2.get(i13)).a();
                }
            }
        }
    }
}
