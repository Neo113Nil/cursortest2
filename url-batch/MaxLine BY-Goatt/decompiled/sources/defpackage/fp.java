package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class fp {
    public static final HashMap a = c(true);
    public static final HashMap b = c(false);
    public static final k9 c = k9.e;

    public static final void a(vl1 vl1Var, a00 a00Var, int i) {
        a00Var.Z(-211209833);
        int i2 = 4;
        if ((((a00Var.f(vl1Var) ? 4 : 2) | i) & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            int D = iv1.D(a00Var);
            vl1 E = bd3.E(a00Var, vl1Var);
            v02 l = a00Var.l();
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, c, oz.f);
            uj2.e(a00Var, l, oz.e);
            uj2.e(a00Var, E, oz.d);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c0(i, i2, vl1Var);
        }
    }

    public static final void b(m12 m12Var, n12 n12Var, jj1 jj1Var, u81 u81Var, int i, int i2, ao aoVar) {
        ao aoVar2;
        Object i3 = jj1Var.i();
        ep epVar = i3 instanceof ep ? (ep) i3 : null;
        m12.h(m12Var, n12Var, ((epVar == null || (aoVar2 = epVar.A) == null) ? aoVar : aoVar2).a(zm3.d(n12Var.m, n12Var.n), zm3.d(i, i2), u81Var));
    }

    public static final HashMap c(boolean z) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z, qb2.p);
        d(hashMap, z, qb2.q);
        d(hashMap, z, qb2.r);
        d(hashMap, z, qb2.s);
        d(hashMap, z, qb2.t);
        d(hashMap, z, qb2.u);
        d(hashMap, z, qb2.v);
        d(hashMap, z, qb2.w);
        d(hashMap, z, qb2.x);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z, ao aoVar) {
        hashMap.put(aoVar, new ip(aoVar, z));
    }

    public static final oj1 e(ao aoVar, boolean z) {
        oj1 oj1Var = (oj1) (z ? a : b).get(aoVar);
        return oj1Var == null ? new ip(aoVar, z) : oj1Var;
    }
}
