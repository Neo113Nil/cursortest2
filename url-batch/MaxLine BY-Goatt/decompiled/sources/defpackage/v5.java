package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v5 extends o81 implements Function2 {
    public final /* synthetic */ my m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ fk2 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(my myVar, vl1 vl1Var, Function2 function2, Function2 function22, fk2 fk2Var, long j, long j2, long j3, long j4, long j5, int i) {
        super(2);
        this.m = myVar;
        this.n = vl1Var;
        this.o = function2;
        this.p = function22;
        this.q = fk2Var;
        this.r = j;
        this.s = j2;
        this.t = j3;
        this.u = j4;
        this.v = j5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(7);
        e6.a(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (a00) obj, R);
        return Unit.a;
    }
}
