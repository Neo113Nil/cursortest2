package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cj0 extends pc0 implements Function0 {
    public final /* synthetic */ ej0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long g;
    public final /* synthetic */ bx0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj0(ej0 ej0Var, long j, long j2, bx0 bx0Var) {
        super(0);
        this.d = ej0Var;
        this.e = j;
        this.g = j2;
        this.h = bx0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ej0 ej0Var = this.d;
        ej0Var.u0().d = false;
        ej0Var.u0().e = this.e;
        ej0Var.u0().g = this.g;
        Function1 d = this.h.d.d();
        if (d != null) {
            d.invoke(ej0Var.u0());
        }
        return Unit.a;
    }
}
