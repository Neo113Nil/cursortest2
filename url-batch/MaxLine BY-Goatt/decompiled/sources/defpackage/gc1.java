package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gc1 implements ld2, jd2 {
    public final md2 m;
    public final lz1 n;
    public final LinkedHashSet o;

    public gc1(ld2 ld2Var, Map map) {
        fc1 fc1Var = new fc1(ld2Var, 0);
        bp2 bp2Var = nd2.a;
        this.m = new md2(map, fc1Var);
        this.n = ij2.j(null);
        this.o = new LinkedHashSet();
    }

    @Override // defpackage.ld2
    public final boolean a(Object obj) {
        return this.m.a(obj);
    }

    @Override // defpackage.ld2
    public final Map b() {
        jd2 jd2Var = (jd2) this.n.getValue();
        if (jd2Var != null) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                jd2Var.f(it.next());
            }
        }
        return this.m.b();
    }

    @Override // defpackage.ld2
    public final Object c(String str) {
        return this.m.c(str);
    }

    @Override // defpackage.ld2
    public final mh d(String str, Function0 function0) {
        return this.m.d(str, function0);
    }

    @Override // defpackage.jd2
    public final void e(Object obj, my myVar, a00 a00Var, int i) {
        int i2;
        a00Var.Z(-697180401);
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
        if ((i2 & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            jd2 jd2Var = (jd2) this.n.getValue();
            if (jd2Var == null) {
                lh.e("null wrappedHolder");
                return;
            }
            jd2Var.e(obj, myVar, a00Var, i2 & 126);
            boolean h = a00Var.h(this) | a00Var.h(obj);
            Object M = a00Var.M();
            if (h || M == sz.a) {
                M = new p8(21, this, obj);
                a00Var.i0(M);
            }
            l41.f(obj, (Function1) M, a00Var);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new i9(this, obj, myVar, i, 4);
        }
    }

    @Override // defpackage.jd2
    public final void f(Object obj) {
        jd2 jd2Var = (jd2) this.n.getValue();
        if (jd2Var != null) {
            jd2Var.f(obj);
        } else {
            lh.e("null wrappedHolder");
        }
    }
}
