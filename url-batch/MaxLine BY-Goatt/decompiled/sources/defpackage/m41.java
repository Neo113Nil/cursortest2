package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m41 extends y92 {
    public int m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ o30 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(o30 o30Var, o30 o30Var2, Function2 function2) {
        super(o30Var);
        this.n = function2;
        this.o = o30Var2;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        int i = this.m;
        if (i != 0) {
            if (i != 1) {
                lh.g("This coroutine had already completed");
                return null;
            }
            this.m = 2;
            ca2.b(obj);
            return obj;
        }
        this.m = 1;
        ca2.b(obj);
        Function2 function2 = this.n;
        function2.getClass();
        s03.f(2, function2);
        return function2.invoke(this.o, this);
    }
}
