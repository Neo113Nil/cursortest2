package y2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1343r {
    public static final C1342q a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new C1342q(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof C1342q) {
            throw ((C1342q) obj).f11674d;
        }
    }
}
