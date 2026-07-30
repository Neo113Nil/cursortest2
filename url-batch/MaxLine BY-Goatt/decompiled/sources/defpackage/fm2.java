package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fm2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ z72 n;
    public final /* synthetic */ Function1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm2(z72 z72Var, Function1 function1, int i) {
        super(1);
        this.m = i;
        this.n = z72Var;
        this.o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Function1 function1 = this.o;
        z72 z72Var = this.n;
        switch (i) {
            case 0:
                float floatValue = z72Var.m - ((Number) obj).floatValue();
                z72Var.m = floatValue;
                function1.invoke(Float.valueOf(floatValue));
                break;
            default:
                float floatValue2 = z72Var.m - ((Number) obj).floatValue();
                z72Var.m = floatValue2;
                function1.invoke(Float.valueOf(floatValue2));
                break;
        }
        return Unit.a;
    }
}
