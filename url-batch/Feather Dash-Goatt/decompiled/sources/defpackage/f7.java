package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f7 extends pc0 implements Function2 {
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ am0 e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(Function1 function1, am0 am0Var, Function1 function12, int i) {
        super(2);
        this.d = function1;
        this.e = am0Var;
        this.g = function12;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int P = gb0.P(this.h | 1);
        m90.b(this.d, this.e, this.g, (hl) obj, P);
        return Unit.a;
    }
}
