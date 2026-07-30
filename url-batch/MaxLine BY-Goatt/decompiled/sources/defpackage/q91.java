package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q91 implements hq2 {
    public u81 m = u81.n;
    public float n;
    public float o;
    public final /* synthetic */ v91 p;

    public q91(v91 v91Var) {
        this.p = v91Var;
    }

    @Override // defpackage.qj1
    public final pj1 O(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            h21.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new p91(i, i2, map, function1, this, this.p, function12);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.n;
    }

    @Override // defpackage.h41
    public final u81 getLayoutDirection() {
        return this.m;
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.o;
    }

    @Override // defpackage.hq2
    public final List s(Object obj, Function2 function2) {
        v91 v91Var = this.p;
        v91Var.d();
        i91 i91Var = v91Var.m;
        e91 e91Var = i91Var.Q.d;
        e91 e91Var2 = e91.m;
        if (e91Var != e91Var2 && e91Var != e91.o && e91Var != e91.n && e91Var != e91.p) {
            h21.b("subcompose can only be used inside the measure or layout blocks");
        }
        tn1 tn1Var = v91Var.s;
        Object g = tn1Var.g(obj);
        if (g == null) {
            g = (i91) v91Var.v.k(obj);
            if (g != null) {
                if (v91Var.A <= 0) {
                    h21.b("Check failed.");
                }
                v91Var.A--;
            } else {
                g = v91Var.j(obj);
                if (g == null) {
                    int i = v91Var.p;
                    i91 i91Var2 = new i91(2);
                    i91Var.A = true;
                    i91Var.A(i, i91Var2);
                    Unit unit = Unit.a;
                    i91Var.A = false;
                    g = i91Var2;
                }
            }
            tn1Var.m(obj, g);
        }
        i91 i91Var3 = (i91) g;
        if (zv.w(v91Var.p, i91Var.o()) != i91Var3) {
            int j = ((bo1) i91Var.o()).m.j(i91Var3);
            if (j < v91Var.p) {
                h21.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = v91Var.p;
            if (i2 != j) {
                v91Var.f(j, i2);
            }
        }
        v91Var.p++;
        v91Var.i(i91Var3, obj, function2);
        return (e91Var == e91Var2 || e91Var == e91.o) ? i91Var3.m() : i91Var3.l();
    }

    @Override // defpackage.h41
    public final boolean w() {
        e91 e91Var = this.p.m.Q.d;
        return e91Var == e91.p || e91Var == e91.n;
    }
}
