package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n91 implements hq2, qj1 {
    public final /* synthetic */ q91 m;
    public final /* synthetic */ v91 n;

    public n91(v91 v91Var) {
        this.n = v91Var;
        this.m = v91Var.t;
    }

    @Override // defpackage.ca0
    public final long A(float f) {
        return this.m.A(f);
    }

    @Override // defpackage.ca0
    public final long C(long j) {
        return this.m.C(j);
    }

    @Override // defpackage.ca0
    public final float D(float f) {
        return this.m.d() * f;
    }

    @Override // defpackage.qj1
    public final pj1 G(int i, int i2, Map map, Function1 function1) {
        return this.m.O(i, i2, map, null, function1);
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        return this.m.K(j);
    }

    @Override // defpackage.qj1
    public final pj1 O(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.m.O(i, i2, map, function1, function12);
    }

    @Override // defpackage.ca0
    public final int R(float f) {
        return this.m.R(f);
    }

    @Override // defpackage.ca0
    public final long c0(long j) {
        return this.m.c0(j);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m.n;
    }

    @Override // defpackage.ca0
    public final float g0(long j) {
        return this.m.g0(j);
    }

    @Override // defpackage.h41
    public final u81 getLayoutDirection() {
        return this.m.m;
    }

    @Override // defpackage.ca0
    public final long l0(float f) {
        return this.m.l0(f);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.m.o;
    }

    @Override // defpackage.ca0
    public final float p0(int i) {
        return this.m.p0(i);
    }

    @Override // defpackage.ca0
    public final float r0(float f) {
        return f / this.m.d();
    }

    @Override // defpackage.hq2
    public final List s(Object obj, Function2 function2) {
        v91 v91Var = this.n;
        i91 i91Var = v91Var.m;
        i91 i91Var2 = (i91) v91Var.s.g(obj);
        if (i91Var2 != null && ((bo1) i91Var.o()).m.j(i91Var2) < v91Var.p) {
            return i91Var2.m();
        }
        tn1 tn1Var = v91Var.v;
        eo1 eo1Var = v91Var.y;
        if (eo1Var.o < v91Var.q) {
            h21.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eo1Var.o;
        int i2 = v91Var.q;
        if (i == i2) {
            eo1Var.b(obj);
        } else {
            Object[] objArr = eo1Var.m;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        v91Var.q++;
        if (tn1Var.b(obj)) {
            i91 i91Var3 = (i91) tn1Var.g(obj);
            o91 o91Var = i91Var3 != null ? (o91) v91Var.r.g(i91Var3) : null;
            if (o91Var != null && o91Var.d) {
                v91Var.i(i91Var3, obj, function2);
            }
        } else {
            v91Var.x.m(obj, v91Var.g(obj, function2));
            if (i91Var.Q.d == e91.o) {
                i91Var.T(true);
            } else {
                i91.U(i91Var, true, 6);
            }
        }
        i91 i91Var4 = (i91) tn1Var.g(obj);
        if (i91Var4 == null) {
            return ah0.m;
        }
        List m0 = i91Var4.Q.p.m0();
        bo1 bo1Var = (bo1) m0;
        int i3 = bo1Var.m.o;
        for (int i4 = 0; i4 < i3; i4++) {
            ((nj1) bo1Var.get(i4)).r.b = true;
        }
        return m0;
    }

    @Override // defpackage.h41
    public final boolean w() {
        return this.m.w();
    }
}
