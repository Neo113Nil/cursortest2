package b3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final l f1069d = new l(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        int intValue = ((Number) obj2).intValue();
        if (!i0Var.O(intValue & 1, (intValue & 3) != 2)) {
            i0Var.R();
        }
        return Unit.f5554a;
    }
}
