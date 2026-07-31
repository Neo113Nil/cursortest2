package D2;

import E2.T;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class o extends AbstractC0348a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g configuration, F2.b module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        f();
    }

    private final void f() {
        if (Intrinsics.areEqual(a(), F2.c.a())) {
            return;
        }
        a().a(new T(d().l(), d().c()));
    }
}
