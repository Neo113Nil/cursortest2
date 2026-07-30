package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class og1 extends o81 implements Function0 {
    public final /* synthetic */ qg1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ p12 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og1(qg1 qg1Var, long j, long j2, p12 p12Var) {
        super(0);
        this.m = qg1Var;
        this.n = j;
        this.o = j2;
        this.p = p12Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qg1 qg1Var = this.m;
        qg1Var.B0().m = false;
        qg1Var.B0().n = this.n;
        qg1Var.B0().o = this.o;
        Function1 d = this.p.m.d();
        if (d != null) {
            d.invoke(qg1Var.B0());
        }
        return Unit.a;
    }
}
