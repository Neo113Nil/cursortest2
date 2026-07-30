package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ey1 implements fb1 {
    public final Function1 a;
    public final yt0 b;

    public ey1(Function1 function1, yt0 yt0Var) {
        this.a = function1;
        this.b = yt0Var;
    }

    @Override // defpackage.fb1
    public final Function1 getKey() {
        return this.a;
    }
}
