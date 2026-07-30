package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hy1 extends s03 {
    public final Function1 p;
    public final yf q;

    public hy1(yt0 yt0Var, Function1 function1, int i) {
        this.p = function1;
        yf yfVar = new yf();
        yfVar.b(i, new ey1(function1, yt0Var));
        this.q = yfVar;
    }

    @Override // defpackage.s03
    public final yf w() {
        return this.q;
    }
}
