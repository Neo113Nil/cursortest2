package f1;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609c extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609c(String message) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
