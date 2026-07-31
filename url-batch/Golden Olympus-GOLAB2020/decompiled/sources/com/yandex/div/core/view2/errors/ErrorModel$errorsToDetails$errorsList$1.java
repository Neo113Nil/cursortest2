package com.yandex.div.core.view2.errors;

import com.yandex.div.json.ParsingException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ErrorModel$errorsToDetails$errorsList$1 extends s implements Function1<Throwable, CharSequence> {
    public static final ErrorModel$errorsToDetails$errorsList$1 INSTANCE = new ErrorModel$errorsToDetails$errorsList$1();

    ErrorModel$errorsToDetails$errorsList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Throwable it) {
        String fullStackMessage;
        String fullStackMessage2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof ParsingException)) {
            StringBuilder sb = new StringBuilder();
            sb.append(" - ");
            fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(it);
            sb.append(fullStackMessage);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" - ");
        sb2.append(((ParsingException) it).getReason());
        sb2.append(": ");
        fullStackMessage2 = ErrorVisualMonitorKt.getFullStackMessage(it);
        sb2.append(fullStackMessage2);
        return sb2.toString();
    }
}
