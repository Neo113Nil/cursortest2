package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ie2 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ my o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ z63 u;
    public final /* synthetic */ my v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie2(vl1 vl1Var, Function2 function2, my myVar, Function2 function22, Function2 function23, int i, long j, long j2, z63 z63Var, my myVar2, int i2) {
        super(2);
        this.m = vl1Var;
        this.n = function2;
        this.o = myVar;
        this.p = function22;
        this.q = function23;
        this.r = i;
        this.s = j;
        this.t = j2;
        this.u = z63Var;
        this.v = myVar2;
        this.w = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.w | 1);
        j8.d(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (a00) obj, R);
        return Unit.a;
    }
}
