package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class km2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;
    public final /* synthetic */ z72 o;
    public final /* synthetic */ ff2 p;
    public final /* synthetic */ Function1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km2(float f, z72 z72Var, ff2 ff2Var, Function1 function1, int i) {
        super(1);
        this.m = i;
        this.n = f;
        this.o = z72Var;
        this.p = ff2Var;
        this.q = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Function1 function1 = this.q;
        ff2 ff2Var = this.p;
        z72 z72Var = this.o;
        float f = this.n;
        switch (i) {
            case 0:
                ld ldVar = (ld) obj;
                lz1 lz1Var = ldVar.e;
                Function0 function0 = ldVar.d;
                lz1 lz1Var2 = ldVar.i;
                float abs = Math.abs(((Number) lz1Var.getValue()).floatValue());
                float abs2 = Math.abs(f);
                lz1 lz1Var3 = ldVar.e;
                if (abs >= abs2) {
                    float f2 = yh2.f(((Number) lz1Var3.getValue()).floatValue(), f);
                    float f3 = f2 - z72Var.m;
                    float a = ff2Var.a(f3);
                    function1.invoke(Float.valueOf(a));
                    if (Math.abs(f3 - a) > 0.5f) {
                        lz1Var2.setValue(Boolean.FALSE);
                        function0.invoke();
                    }
                    lz1Var2.setValue(Boolean.FALSE);
                    function0.invoke();
                    z72Var.m = f2;
                } else {
                    float floatValue = ((Number) lz1Var3.getValue()).floatValue() - z72Var.m;
                    float a2 = ff2Var.a(floatValue);
                    function1.invoke(Float.valueOf(a2));
                    if (Math.abs(floatValue - a2) > 0.5f) {
                        lz1Var2.setValue(Boolean.FALSE);
                        function0.invoke();
                    }
                    z72Var.m = ((Number) lz1Var3.getValue()).floatValue();
                }
                break;
            default:
                ld ldVar2 = (ld) obj;
                float f4 = yh2.f(((Number) ldVar2.e.getValue()).floatValue(), f);
                float f5 = f4 - z72Var.m;
                float a3 = ff2Var.a(f5);
                function1.invoke(Float.valueOf(a3));
                if (Math.abs(f5 - a3) > 0.5f || f4 != ((Number) ldVar2.e.getValue()).floatValue()) {
                    ldVar2.i.setValue(Boolean.FALSE);
                    ldVar2.d.invoke();
                }
                z72Var.m += a3;
                break;
        }
        return Unit.a;
    }
}
