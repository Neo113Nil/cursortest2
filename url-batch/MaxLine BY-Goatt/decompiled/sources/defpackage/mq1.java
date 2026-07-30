package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mq1 extends o81 implements Function2 {
    public final /* synthetic */ gc2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Function0 o;
    public final /* synthetic */ my p;
    public final /* synthetic */ vl1 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ jq1 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq1(gc2 gc2Var, boolean z, Function0 function0, my myVar, vl1 vl1Var, boolean z2, Function2 function2, boolean z3, jq1 jq1Var, int i) {
        super(2);
        this.m = gc2Var;
        this.n = z;
        this.o = function0;
        this.p = myVar;
        this.q = vl1Var;
        this.r = z2;
        this.s = function2;
        this.t = z3;
        this.u = jq1Var;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        iv1.h(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (a00) obj, s03.R(this.v | 1));
        return Unit.a;
    }
}
