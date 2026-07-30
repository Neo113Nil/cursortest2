package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kq1 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ z63 p;
    public final /* synthetic */ my q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq1(vl1 vl1Var, long j, long j2, z63 z63Var, my myVar, int i) {
        super(2);
        this.m = vl1Var;
        this.n = j;
        this.o = j2;
        this.p = z63Var;
        this.q = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(196657);
        iv1.g(this.m, this.n, this.o, this.p, this.q, (a00) obj, R);
        return Unit.a;
    }
}
