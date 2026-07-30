package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n61 implements h61 {
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function1 e;

    public n61(Function2 function2, Function1 function1) {
        this.d = function2;
        this.e = function1;
    }

    @Override // defpackage.h61
    public final Object b(Object obj) {
        return this.e.invoke(obj);
    }

    @Override // defpackage.h61
    public final Object c(o51 o51Var, Object obj) {
        return this.d.b(o51Var, obj);
    }
}
