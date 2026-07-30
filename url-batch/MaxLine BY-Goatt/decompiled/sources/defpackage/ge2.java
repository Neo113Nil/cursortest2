package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ge2 implements ce2 {
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function1 n;

    public ge2(Function2 function2, Function1 function1) {
        this.m = function2;
        this.n = function1;
    }

    @Override // defpackage.ce2
    public final Object e(Object obj) {
        return this.n.invoke(obj);
    }

    @Override // defpackage.ce2
    public final Object i(id2 id2Var, Object obj) {
        return this.m.invoke(id2Var, obj);
    }
}
