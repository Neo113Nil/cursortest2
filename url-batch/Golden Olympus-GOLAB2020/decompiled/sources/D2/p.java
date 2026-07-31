package D2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p {
    public static final AbstractC0348a a(AbstractC0348a from, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        e eVar = new e(from);
        builderAction.invoke(eVar);
        return new o(eVar.a(), eVar.b());
    }

    public static /* synthetic */ AbstractC0348a b(AbstractC0348a abstractC0348a, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            abstractC0348a = AbstractC0348a.f371d;
        }
        return a(abstractC0348a, function1);
    }
}
