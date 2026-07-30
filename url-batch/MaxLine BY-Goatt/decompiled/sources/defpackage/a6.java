package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a6 extends o81 implements Function2 {
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ my n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ fk2 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ cb0 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(Function0 function0, my myVar, vl1 vl1Var, Function2 function2, Function2 function22, Function2 function23, fk2 fk2Var, long j, long j2, long j3, long j4, cb0 cb0Var, int i, int i2) {
        super(2);
        this.m = function0;
        this.n = myVar;
        this.o = vl1Var;
        this.p = function2;
        this.q = function22;
        this.r = function23;
        this.s = fk2Var;
        this.t = j;
        this.u = j2;
        this.v = j3;
        this.w = j4;
        this.x = cb0Var;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.y | 1);
        int R2 = s03.R(this.z);
        e6.c(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (a00) obj, R, R2);
        return Unit.a;
    }
}
