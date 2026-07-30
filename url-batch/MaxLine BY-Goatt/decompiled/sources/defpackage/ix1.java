package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ix1 extends o81 implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ xt0 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ float u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ my w;
    public final /* synthetic */ Function2 x;
    public final /* synthetic */ yx1 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(Function2 function2, xt0 xt0Var, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, float f, Function1 function1, my myVar, Function2 function27, yx1 yx1Var, int i, int i2) {
        super(2);
        this.m = function2;
        this.n = xt0Var;
        this.o = function22;
        this.p = function23;
        this.q = function24;
        this.r = function25;
        this.s = function26;
        this.t = z;
        this.u = f;
        this.v = function1;
        this.w = myVar;
        this.x = function27;
        this.y = yx1Var;
        this.z = i;
        this.A = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.z | 1);
        int R2 = s03.R(this.A);
        kx1.b(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (a00) obj, R, R2);
        return Unit.a;
    }
}
