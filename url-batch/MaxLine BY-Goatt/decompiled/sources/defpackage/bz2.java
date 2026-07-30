package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bz2 {
    public final k03 a;
    public final lz1 b = ij2.j(null);
    public final /* synthetic */ fz2 c;

    public bz2(fz2 fz2Var, k03 k03Var, String str) {
        this.c = fz2Var;
        this.a = k03Var;
    }

    public final az2 a(Function1 function1, Function1 function12) {
        lz1 lz1Var = this.b;
        az2 az2Var = (az2) lz1Var.getValue();
        fz2 fz2Var = this.c;
        if (az2Var == null) {
            Object invoke = function12.invoke(fz2Var.a.j());
            Object invoke2 = function12.invoke(fz2Var.a.j());
            k03 k03Var = this.a;
            sd sdVar = (sd) k03Var.a.invoke(invoke2);
            sdVar.d();
            ez2 ez2Var = new ez2(fz2Var, invoke, sdVar, k03Var);
            az2Var = new az2(this, ez2Var, function1, function12);
            lz1Var.setValue(az2Var);
            fz2Var.i.add(ez2Var);
        }
        az2Var.o = function12;
        az2Var.n = function1;
        az2Var.a(fz2Var.f());
        return az2Var;
    }
}
