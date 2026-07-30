package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z5 extends o81 implements Function2 {
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ fk2 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ my u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(Function2 function2, Function2 function22, fk2 fk2Var, long j, long j2, long j3, long j4, Function2 function23, my myVar) {
        super(2);
        this.m = function2;
        this.n = function22;
        this.o = fk2Var;
        this.p = j;
        this.q = j2;
        this.r = j3;
        this.s = j4;
        this.t = function23;
        this.u = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            e6.a(yj1.H(1163543932, new y5(this.t, this.u, 1), a00Var), null, this.m, this.n, this.o, this.p, hw.d(26, a00Var), this.q, this.r, this.s, a00Var, 6);
        }
        return Unit.a;
    }
}
