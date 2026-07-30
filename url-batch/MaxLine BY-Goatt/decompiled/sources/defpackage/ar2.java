package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ar2 implements y00 {
    public final at0 m;

    public ar2(at0 at0Var) {
        this.m = at0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((br2) this.m.m).close();
    }

    @Override // defpackage.y00
    public final Object g(boolean z, Function2 function2, r30 r30Var) {
        br2 br2Var = (br2) this.m.m;
        br2Var.getClass();
        return function2.invoke(new dr2(new zq2(br2Var.I())), r30Var);
    }
}
