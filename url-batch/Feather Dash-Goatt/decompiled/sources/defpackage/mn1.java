package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mn1 extends pc0 implements Function0 {
    public final /* synthetic */ o d;
    public final /* synthetic */ r5 e;
    public final /* synthetic */ dd0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn1(o oVar, r5 r5Var, dd0 dd0Var) {
        super(0);
        this.d = oVar;
        this.e = r5Var;
        this.g = dd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r5 r5Var = this.e;
        o oVar = this.d;
        oVar.removeOnAttachStateChangeListener(r5Var);
        t80.u(oVar).a.remove(this.g);
        return Unit.a;
    }
}
