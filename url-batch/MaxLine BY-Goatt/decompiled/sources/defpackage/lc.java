package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class lc {
    public static final eo2 a = bd3.G(7, null);

    static {
        Map map = f63.a;
        ph2.a(0.5f, 0.5f);
        ap.i(0.5f, 0.5f);
    }

    public static final so2 a(Object obj, k03 k03Var, md mdVar, Float f, String str, a00 a00Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object M = a00Var.M();
        Object obj2 = sz.a;
        if (M == obj2) {
            M = ij2.j(null);
            a00Var.i0(M);
        }
        zn1 zn1Var = (zn1) M;
        Object M2 = a00Var.M();
        if (M2 == obj2) {
            M2 = new jc(obj, k03Var, f);
            a00Var.i0(M2);
        }
        jc jcVar = (jc) M2;
        zn1 k = ij2.k(null, a00Var);
        if (f != null && (mdVar instanceof eo2)) {
            eo2 eo2Var = (eo2) mdVar;
            if (!Intrinsics.b(eo2Var.c, f)) {
                mdVar = new eo2(eo2Var.a, eo2Var.b, f);
            }
        }
        zn1 k2 = ij2.k(mdVar, a00Var);
        Object M3 = a00Var.M();
        if (M3 == obj2) {
            M3 = s93.g(-1, 6, null);
            a00Var.i0(M3);
        }
        gt gtVar = (gt) M3;
        boolean h = a00Var.h(gtVar) | a00Var.h(obj);
        Object M4 = a00Var.M();
        if (h || M4 == obj2) {
            M4 = new k7(3, gtVar, obj);
            a00Var.i0(M4);
        }
        l41.m((Function0) M4, a00Var);
        boolean h2 = a00Var.h(gtVar) | a00Var.h(jcVar) | a00Var.f(k2) | a00Var.f(k);
        Object M5 = a00Var.M();
        if (h2 || M5 == obj2) {
            Object kcVar = new kc(gtVar, jcVar, k2, k, null);
            a00Var.i0(kcVar);
            M5 = kcVar;
        }
        l41.h(a00Var, gtVar, (Function2) M5);
        so2 so2Var = (so2) zn1Var.getValue();
        return so2Var == null ? jcVar.c : so2Var;
    }
}
