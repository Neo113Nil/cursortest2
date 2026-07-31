package C2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0325o {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f312a;

    static {
        boolean z4;
        try {
            Class.forName("java.lang.ClassValue");
            z4 = true;
        } catch (Throwable unused) {
            z4 = false;
        }
        f312a = z4;
    }

    public static final I0 a(Function1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f312a ? new C0334t(factory) : new C0344y(factory);
    }

    public static final InterfaceC0335t0 b(Function2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f312a ? new C0336u(factory) : new C0346z(factory);
    }
}
