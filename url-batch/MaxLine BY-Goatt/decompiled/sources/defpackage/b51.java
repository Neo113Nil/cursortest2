package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b51 extends j61 {
    public final Function1 t;

    public b51(Function1 function1) {
        this.t = function1;
    }

    @Override // defpackage.j61
    public final boolean r() {
        return false;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        this.t.invoke(th);
    }
}
