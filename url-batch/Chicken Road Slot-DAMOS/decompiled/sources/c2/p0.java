package c2;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p0 extends o0 implements a2.f0 {
    public final i1 B;
    public LinkedHashMap D;
    public a2.h0 F;
    public final s.c0 G;
    public long C = 0;
    public final a2.e0 E = new a2.e0(this);

    public p0(i1 i1Var) {
        this.B = i1Var;
        s.c0 c0Var = s.m0.f8346a;
        this.G = new s.c0();
    }

    public static final void s0(p0 p0Var, a2.h0 h0Var) {
        LinkedHashMap linkedHashMap;
        if (h0Var != null) {
            p0Var.a0((h0Var.c() & 4294967295L) | (h0Var.e() << 32));
        } else {
            p0Var.a0(0L);
        }
        if (!Intrinsics.a(p0Var.F, h0Var) && h0Var != null && ((((linkedHashMap = p0Var.D) != null && !linkedHashMap.isEmpty()) || !h0Var.a().isEmpty()) && !Intrinsics.a(h0Var.a(), p0Var.D))) {
            s0 s0Var = p0Var.B.B.T.f1607q;
            s0Var.getClass();
            s0Var.E.f();
            LinkedHashMap linkedHashMap2 = p0Var.D;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                p0Var.D = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(h0Var.a());
        }
        p0Var.F = h0Var;
    }

    @Override // a2.o0
    public final void Z(long j, float f3, Function1 function1) {
        u0(j);
        if (this.f1634w) {
            return;
        }
        t0();
    }

    @Override // x2.c
    public final float d() {
        return this.B.d();
    }

    @Override // x2.c
    public final float g() {
        return this.B.g();
    }

    @Override // a2.i0
    public final x2.l getLayoutDirection() {
        return this.B.B.M;
    }

    @Override // a2.o0, a2.f0
    public final Object h() {
        return this.B.h();
    }

    @Override // c2.o0
    public final o0 h0() {
        i1 i1Var = this.B.C;
        if (i1Var != null) {
            return i1Var.B0();
        }
        return null;
    }

    @Override // c2.o0
    public final a2.n i0() {
        return this.E;
    }

    @Override // c2.o0, a2.i0
    public final boolean j() {
        return true;
    }

    @Override // c2.o0
    public final boolean j0() {
        return this.F != null;
    }

    @Override // c2.o0
    public final g0 k0() {
        return this.B.B;
    }

    @Override // c2.o0
    public final a2.h0 l0() {
        a2.h0 h0Var = this.F;
        if (h0Var != null) {
            return h0Var;
        }
        throw v4.a.h("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // c2.o0
    public final o0 m0() {
        i1 i1Var = this.B.D;
        if (i1Var != null) {
            return i1Var.B0();
        }
        return null;
    }

    @Override // c2.o0
    public final long n0() {
        return this.C;
    }

    @Override // c2.o0
    public final void r0() {
        Z(this.C, 0.0f, null);
    }

    public void t0() {
        l0().b();
    }

    public final void u0(long j) {
        if (!x2.i.a(this.C, j)) {
            this.C = j;
            i1 i1Var = this.B;
            s0 s0Var = i1Var.B.T.f1607q;
            if (s0Var != null) {
                s0Var.f0();
            }
            o0.p0(i1Var);
        }
        if (this.f1635x) {
            return;
        }
        f0(l0());
    }

    public final long v0(p0 p0Var, boolean z10) {
        long j = 0;
        p0 p0Var2 = this;
        while (!p0Var2.equals(p0Var)) {
            j = x2.i.c(j, p0Var2.C);
            i1 i1Var = p0Var2.B.D;
            i1Var.getClass();
            p0Var2 = i1Var.B0();
            p0Var2.getClass();
        }
        return j;
    }
}
