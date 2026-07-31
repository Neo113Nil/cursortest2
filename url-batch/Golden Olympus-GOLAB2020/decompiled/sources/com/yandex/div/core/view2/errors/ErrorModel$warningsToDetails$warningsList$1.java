package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ErrorModel$warningsToDetails$warningsList$1 extends s implements Function1<Throwable, CharSequence> {
    public static final ErrorModel$warningsToDetails$warningsList$1 INSTANCE = new ErrorModel$warningsToDetails$warningsList$1();

    ErrorModel$warningsToDetails$warningsList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Throwable it) {
        String fullStackMessage;
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append(" - ");
        fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(it);
        sb.append(fullStackMessage);
        return sb.toString();
    }
}
