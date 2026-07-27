package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
