package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lo1 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ao0 e;
    public final /* synthetic */ ao0 g;
    public final /* synthetic */ ao0 h;

    public /* synthetic */ lo1(int i, ao0 ao0Var, ao0 ao0Var2, ao0 ao0Var3) {
        this.d = i;
        this.e = ao0Var;
        this.g = ao0Var2;
        this.h = ao0Var3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.d == ((Number) this.e.getValue()).intValue()) {
            this.g.setValue(Boolean.TRUE);
            m90.f(this.h, false);
        }
        return Unit.a;
    }
}
