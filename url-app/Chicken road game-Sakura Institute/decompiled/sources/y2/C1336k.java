package y2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1336k {
    public static InterfaceC1335j a(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new C1345t(initializer, null, 2, null);
    }

    public static InterfaceC1335j b(EnumC1337l mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int ordinal = mode.ordinal();
        if (ordinal == 0) {
            return new C1345t(initializer, null, 2, null);
        }
        if (ordinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C1344s c1344s = new C1344s();
            c1344s.f11677d = initializer;
            c1344s.f11678e = C1321A.f11654a;
            return c1344s;
        }
        if (ordinal != 2) {
            throw new C1338m();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        C1325E c1325e = new C1325E();
        c1325e.f11658d = initializer;
        c1325e.f11659e = C1321A.f11654a;
        return c1325e;
    }
}
