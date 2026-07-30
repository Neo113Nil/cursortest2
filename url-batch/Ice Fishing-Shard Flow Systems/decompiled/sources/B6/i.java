package B6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
