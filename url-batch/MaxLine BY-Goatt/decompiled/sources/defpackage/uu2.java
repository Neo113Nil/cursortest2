package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uu2 extends o81 implements Function2 {
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ xt0 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ float u;
    public final /* synthetic */ my v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ yx1 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(Function2 function2, Function2 function22, xt0 xt0Var, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, float f, my myVar, Function2 function27, yx1 yx1Var, int i, int i2) {
        super(2);
        this.m = function2;
        this.n = function22;
        this.o = xt0Var;
        this.p = function23;
        this.q = function24;
        this.r = function25;
        this.s = function26;
        this.t = z;
        this.u = f;
        this.v = myVar;
        this.w = function27;
        this.x = yx1Var;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.y | 1);
        int R2 = s03.R(this.z);
        ak2.b(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (a00) obj, R, R2);
        return Unit.a;
    }
}
