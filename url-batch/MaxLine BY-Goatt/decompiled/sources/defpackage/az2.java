package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class az2 implements so2 {
    public final ez2 m;
    public Function1 n;
    public Function1 o;
    public final /* synthetic */ bz2 p;

    public az2(bz2 bz2Var, ez2 ez2Var, Function1 function1, Function1 function12) {
        this.p = bz2Var;
        this.m = ez2Var;
        this.n = function1;
        this.o = function12;
    }

    public final void a(cz2 cz2Var) {
        Object invoke = this.o.invoke(cz2Var.c());
        boolean g = this.p.c.g();
        ez2 ez2Var = this.m;
        if (g) {
            ez2Var.h(this.o.invoke(cz2Var.b()), invoke, (bm0) this.n.invoke(cz2Var));
        } else {
            ez2Var.i(invoke, (bm0) this.n.invoke(cz2Var));
        }
    }

    @Override // defpackage.so2
    public final Object getValue() {
        a(this.p.c.f());
        return this.m.v.getValue();
    }
}
