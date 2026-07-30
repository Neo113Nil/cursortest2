package R5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class i {
    public static InterfaceC0168h a(j mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            return new q(initializer, null, 2, null);
        }
        if (ordinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            p pVar = new p();
            pVar.f2424d = initializer;
            pVar.f2425e = C.f2403a;
            return pVar;
        }
        if (ordinal != 2) {
            throw new k();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        H h7 = new H();
        h7.f2407d = initializer;
        h7.f2408e = C.f2403a;
        return h7;
    }

    public static q b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new q(initializer, null, 2, null);
    }
}
