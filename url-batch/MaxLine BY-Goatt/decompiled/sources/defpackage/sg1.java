package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class sg1 extends qg1 implements jj1 {
    public final ks1 A;
    public LinkedHashMap C;
    public pj1 E;
    public final hn1 F;
    public long B = 0;
    public final tg1 D = new tg1(this);

    public sg1(ks1 ks1Var) {
        this.A = ks1Var;
        hn1 hn1Var = nt1.a;
        this.F = new hn1();
    }

    public static final void F0(sg1 sg1Var, pj1 pj1Var) {
        LinkedHashMap linkedHashMap;
        if (pj1Var != null) {
            sg1Var.j0((pj1Var.c() & 4294967295L) | (pj1Var.e() << 32));
        } else {
            sg1Var.j0(0L);
        }
        if (!Intrinsics.b(sg1Var.E, pj1Var) && pj1Var != null && ((((linkedHashMap = sg1Var.C) != null && !linkedHashMap.isEmpty()) || !pj1Var.a().isEmpty()) && !Intrinsics.b(pj1Var.a(), sg1Var.C))) {
            xg1 xg1Var = sg1Var.A.A.Q.q;
            xg1Var.getClass();
            xg1Var.C.f();
            LinkedHashMap linkedHashMap2 = sg1Var.C;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                sg1Var.C = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(pj1Var.a());
        }
        sg1Var.E = pj1Var;
    }

    @Override // defpackage.qg1
    public final long A0() {
        return this.B;
    }

    @Override // defpackage.qg1
    public final void E0() {
        i0(this.B, 0.0f, null);
    }

    public void G0() {
        y0().b();
    }

    public final void H0(long j) {
        if (!s31.a(this.B, j)) {
            this.B = j;
            ks1 ks1Var = this.A;
            xg1 xg1Var = ks1Var.A.Q.q;
            if (xg1Var != null) {
                xg1Var.o0();
            }
            qg1.C0(ks1Var);
        }
        if (this.w) {
            return;
        }
        q0(y0());
    }

    public final long I0(sg1 sg1Var, boolean z) {
        long j = 0;
        while (!this.equals(sg1Var)) {
            if (!this.u || !z) {
                j = s31.c(j, this.B);
            }
            ks1 ks1Var = this.A.C;
            ks1Var.getClass();
            this = ks1Var.O0();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.A.d();
    }

    @Override // defpackage.h41
    public final u81 getLayoutDirection() {
        return this.A.A.J;
    }

    @Override // defpackage.n12, defpackage.jj1
    public final Object i() {
        return this.A.i();
    }

    @Override // defpackage.n12
    public final void i0(long j, float f, Function1 function1) {
        H0(j);
        if (this.v) {
            return;
        }
        G0();
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.A.p();
    }

    @Override // defpackage.qg1
    public final qg1 u0() {
        ks1 ks1Var = this.A.B;
        if (ks1Var != null) {
            return ks1Var.O0();
        }
        return null;
    }

    @Override // defpackage.qg1
    public final t81 v0() {
        return this.D;
    }

    @Override // defpackage.qg1, defpackage.h41
    public final boolean w() {
        return true;
    }

    @Override // defpackage.qg1
    public final boolean w0() {
        return this.E != null;
    }

    @Override // defpackage.qg1
    public final i91 x0() {
        return this.A.A;
    }

    @Override // defpackage.qg1
    public final pj1 y0() {
        pj1 pj1Var = this.E;
        if (pj1Var != null) {
            return pj1Var;
        }
        throw q40.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.qg1
    public final qg1 z0() {
        ks1 ks1Var = this.A.C;
        if (ks1Var != null) {
            return ks1Var.O0();
        }
        return null;
    }
}
