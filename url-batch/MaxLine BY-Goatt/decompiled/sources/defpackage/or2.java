package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class or2 extends o81 implements Function1 {
    public final /* synthetic */ c82 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ hd o;
    public final /* synthetic */ nd p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(c82 c82Var, float f, hd hdVar, nd ndVar, Function1 function1) {
        super(1);
        this.m = c82Var;
        this.n = f;
        this.o = hdVar;
        this.p = ndVar;
        this.q = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.m.m;
        obj2.getClass();
        nk2.g((ld) obj2, longValue, this.n, this.o, this.p, this.q);
        return Unit.a;
    }
}
