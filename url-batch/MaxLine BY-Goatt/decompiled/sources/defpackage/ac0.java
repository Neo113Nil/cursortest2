package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ac0 implements r82 {
    public final Function1 m;
    public bc0 n;

    public ac0(Function1 function1) {
        this.m = function1;
    }

    @Override // defpackage.r82
    public final void a() {
        this.n = (bc0) this.m.invoke(l41.d);
    }

    @Override // defpackage.r82
    public final void d() {
        bc0 bc0Var = this.n;
        if (bc0Var != null) {
            bc0Var.a();
        }
        this.n = null;
    }

    @Override // defpackage.r82
    public final void c() {
    }
}
