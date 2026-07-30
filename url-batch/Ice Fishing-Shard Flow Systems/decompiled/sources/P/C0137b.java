package P;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137b extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0137b(String message, int i2) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
