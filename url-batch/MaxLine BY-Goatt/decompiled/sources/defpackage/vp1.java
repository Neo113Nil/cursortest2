package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vp1 extends o81 implements Function2 {
    public final /* synthetic */ up1 m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ f6 o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(up1 up1Var, vl1 vl1Var, f6 f6Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i) {
        super(2);
        this.m = up1Var;
        this.n = vl1Var;
        this.o = f6Var;
        this.p = function1;
        this.q = function12;
        this.r = function13;
        this.s = function14;
        this.t = function15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(49);
        o70.h(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (a00) obj, R);
        return Unit.a;
    }
}
