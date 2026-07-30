package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gp extends o81 implements Function1 {
    public final /* synthetic */ n12 m;
    public final /* synthetic */ jj1 n;
    public final /* synthetic */ qj1 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ ip r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(n12 n12Var, jj1 jj1Var, qj1 qj1Var, int i, int i2, ip ipVar) {
        super(1);
        this.m = n12Var;
        this.n = jj1Var;
        this.o = qj1Var;
        this.p = i;
        this.q = i2;
        this.r = ipVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fp.b((m12) obj, this.m, this.n, this.o.getLayoutDirection(), this.p, this.q, this.r.a);
        return Unit.a;
    }
}
