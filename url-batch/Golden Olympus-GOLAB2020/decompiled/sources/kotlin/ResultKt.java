package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ResultKt {
    public static final void a(Object obj) {
        if (obj instanceof Result.a) {
            throw ((Result.a) obj).f41026b;
        }
    }

    @NotNull
    public static final Object createFailure(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.a(exception);
    }
}
