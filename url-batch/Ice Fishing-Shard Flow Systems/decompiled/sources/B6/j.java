package B6;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.n implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x6.e p02 = (x6.e) obj;
        int intValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(p02, "p0");
        k kVar = (k) this.receiver;
        kVar.getClass();
        if (!p02.j(intValue)) {
            p02.i(intValue).g();
        }
        kVar.f225b = false;
        return false;
    }
}
