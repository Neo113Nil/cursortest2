package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n01 extends o81 implements Function2 {
    public final /* synthetic */ xy1 m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ f6 o;
    public final /* synthetic */ q20 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(xy1 xy1Var, vl1 vl1Var, f6 f6Var, q20 q20Var, float f, int i, int i2) {
        super(2);
        this.m = xy1Var;
        this.n = vl1Var;
        this.o = f6Var;
        this.p = q20Var;
        this.q = f;
        this.r = i;
        this.s = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l41.g(this.m, this.n, this.o, this.p, this.q, (a00) obj, s03.R(this.r | 1), this.s);
        return Unit.a;
    }
}
