package E2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class B extends E {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
