package a6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0184b extends Z5.b {
    @Override // Z5.b
    public final void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = C0183a.f3105b;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
