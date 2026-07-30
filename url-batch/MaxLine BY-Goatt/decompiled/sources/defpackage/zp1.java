package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zp1 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ up1 n;
    public final /* synthetic */ rp1 o;
    public final /* synthetic */ vl1 p;
    public final /* synthetic */ f6 q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp1(up1 up1Var, rp1 rp1Var, vl1 vl1Var, f6 f6Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2) {
        super(2);
        this.m = i2;
        this.n = up1Var;
        this.o = rp1Var;
        this.p = vl1Var;
        this.q = f6Var;
        this.r = function1;
        this.s = function12;
        this.t = function13;
        this.u = function14;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                ((Number) obj2).intValue();
                o70.i(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (a00) obj, s03.R(this.v | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                o70.i(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (a00) obj, s03.R(this.v | 1));
                break;
            default:
                ((Number) obj2).intValue();
                o70.i(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (a00) obj, s03.R(this.v | 1));
                break;
        }
        return Unit.a;
    }
}
