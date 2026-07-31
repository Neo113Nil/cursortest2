package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuntimeHelpers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"", "message", "", "throwIllegalStateException", "(Ljava/lang/String;)V", "throwIndexOutOfBoundsException", "throwNoSuchElementException", "throwIllegalArgumentException", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeHelpersKt {
    public static final void throwIllegalStateException(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void throwIndexOutOfBoundsException(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void throwNoSuchElementException(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new NoSuchElementException(message);
    }

    public static final void throwIllegalArgumentException(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }
}
