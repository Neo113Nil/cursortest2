package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class na0 extends fn {
    public int h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ dn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(dn dnVar, CoroutineContext coroutineContext, Function2 function2, dn dnVar2) {
        super(dnVar, coroutineContext);
        this.i = function2;
        this.j = dnVar2;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                dd0.j("This coroutine had already completed");
                return null;
            }
            this.h = 2;
            ca0.v(obj);
            return obj;
        }
        this.h = 1;
        ca0.v(obj);
        Function2 function2 = this.i;
        function2.getClass();
        tj1.b(2, function2);
        return function2.b(this.j, this);
    }
}
