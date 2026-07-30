package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jb extends o81 implements Function2 {
    public final /* synthetic */ g53 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ vl1 p;
    public final /* synthetic */ du1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(g53 g53Var, long j, boolean z, vl1 vl1Var, du1 du1Var) {
        super(2);
        this.m = g53Var;
        this.n = j;
        this.o = z;
        this.p = vl1Var;
        this.q = du1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            yk3.a(p00.s.a(this.m), yj1.H(-1426434671, new ib(this.n, this.o, this.p, this.q), a00Var), a00Var, 56);
        }
        return Unit.a;
    }
}
