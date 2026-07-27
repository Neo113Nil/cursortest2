package y2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: y2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339n extends Error {
    public C1339n() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1339n(String message, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super(message);
        message = (i2 & 1) != 0 ? "An operation is not implemented." : message;
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
