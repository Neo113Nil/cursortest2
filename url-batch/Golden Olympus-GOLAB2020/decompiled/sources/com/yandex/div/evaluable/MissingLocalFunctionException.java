package com.yandex.div.evaluable;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class MissingLocalFunctionException extends EvaluableException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingLocalFunctionException(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        super("Function '" + name + '(' + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args) + ")' is missing.", null, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
    }
}
