package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ma0 extends g31 {
    public int e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ dn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(dn dnVar, dn dnVar2, Function2 function2) {
        super(dnVar);
        this.g = function2;
        this.h = dnVar2;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                dd0.j("This coroutine had already completed");
                return null;
            }
            this.e = 2;
            ca0.v(obj);
            return obj;
        }
        this.e = 1;
        ca0.v(obj);
        Function2 function2 = this.g;
        function2.getClass();
        tj1.b(2, function2);
        return function2.b(this.h, this);
    }
}
