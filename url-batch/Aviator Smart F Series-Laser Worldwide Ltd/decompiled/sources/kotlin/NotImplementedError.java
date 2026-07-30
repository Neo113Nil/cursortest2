package kotlin;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String message) {
        super(message);
        s.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ NotImplementedError(String str, int i8, o oVar) {
        this((i8 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
