package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kd2 implements jd2 {
    public static final tt1 q = new tt1(10, new ww(19), new zd(26));
    public final Map m;
    public final tn1 n;
    public ld2 o;
    public final a0 p;

    public kd2(Map map) {
        this.m = map;
        long[] jArr = oe2.a;
        this.n = new tn1();
        this.p = new a0(11, this);
    }

    @Override // defpackage.jd2
    public final void e(Object obj, my myVar, a00 a00Var, int i) {
        int i2;
        a00Var.Z(533563200);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (a00Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.h(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.h(this) ? 256 : 128;
        }
        if (a00Var.P(i2 & 1, (i2 & 147) != 146)) {
            a00Var.a0(obj);
            Object M = a00Var.M();
            nj njVar = sz.a;
            if (M == njVar) {
                a0 a0Var = this.p;
                if (!((Boolean) a0Var.invoke(obj)).booleanValue()) {
                    b71.p(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.m.get(obj);
                bp2 bp2Var = nd2.a;
                od2 od2Var = new od2(new md2(map, a0Var));
                a00Var.i0(od2Var);
                M = od2Var;
            }
            od2 od2Var2 = (od2) M;
            yk3.c(new ye[]{nd2.a.a(od2Var2), pf1.a.a(od2Var2)}, myVar, a00Var, (i2 & 112) | 8);
            Unit unit = Unit.a;
            boolean h = a00Var.h(this) | a00Var.h(obj) | a00Var.h(od2Var2);
            Object M2 = a00Var.M();
            if (h || M2 == njVar) {
                M2 = new t4(this, obj, od2Var2, i3);
                a00Var.i0(M2);
            }
            l41.f(unit, (Function1) M2, a00Var);
            a00Var.t();
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new us(this, obj, myVar, i, 4);
        }
    }

    @Override // defpackage.jd2
    public final void f(Object obj) {
        if (this.n.k(obj) == null) {
            this.m.remove(obj);
        }
    }
}
