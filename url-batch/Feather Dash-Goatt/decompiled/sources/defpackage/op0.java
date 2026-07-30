package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class op0 extends pc0 implements Function0 {
    public final /* synthetic */ qp0 d;
    public final /* synthetic */ zl0 e;
    public final /* synthetic */ mp0 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ i60 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ float l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(qp0 qp0Var, zl0 zl0Var, mp0 mp0Var, long j, i60 i60Var, int i, boolean z, float f, boolean z2) {
        super(0);
        this.d = qp0Var;
        this.e = zl0Var;
        this.g = mp0Var;
        this.h = j;
        this.i = i60Var;
        this.j = i;
        this.k = z;
        this.l = f;
        this.m = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.d.X0(ka0.d(this.e, this.g.h()), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        return Unit.a;
    }
}
