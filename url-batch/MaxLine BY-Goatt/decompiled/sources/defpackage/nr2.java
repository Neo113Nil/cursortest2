package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nr2 extends o81 implements Function1 {
    public final /* synthetic */ c82 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ hd o;
    public final /* synthetic */ sd p;
    public final /* synthetic */ nd q;
    public final /* synthetic */ float r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr2(c82 c82Var, Object obj, hd hdVar, sd sdVar, nd ndVar, float f, Function1 function1) {
        super(1);
        this.m = c82Var;
        this.n = obj;
        this.o = hdVar;
        this.p = sdVar;
        this.q = ndVar;
        this.r = f;
        this.s = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        hd hdVar = this.o;
        ld ldVar = new ld(this.n, hdVar.d(), this.p, longValue, hdVar.e(), longValue, new mr2(this.q, 0));
        nk2.g(ldVar, longValue, this.r, this.o, this.q, this.s);
        this.m.m = ldVar;
        return Unit.a;
    }
}
