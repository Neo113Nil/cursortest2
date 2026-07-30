package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c93 extends o81 implements Function1 {
    public final /* synthetic */ d93 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ n12 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ qj1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c93(d93 d93Var, int i, n12 n12Var, int i2, qj1 qj1Var) {
        super(1);
        this.m = d93Var;
        this.n = i;
        this.o = n12Var;
        this.p = i2;
        this.q = qj1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function2 function2 = this.m.B;
        n12 n12Var = this.o;
        m12.h((m12) obj, n12Var, ((s31) function2.invoke(new x31(zm3.d(this.n - n12Var.m, this.p - n12Var.n)), this.q.getLayoutDirection())).a);
        return Unit.a;
    }
}
