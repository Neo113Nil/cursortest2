package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface Parser<IN, OUT> {

    @Metadata
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static <IN, OUT> OUT parseOrNull(@NotNull Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                Result.Companion companion = Result.Companion;
                out = (OUT) Result.m243constructorimpl(parser.parse(in));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                out = (OUT) Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m244isFailureimpl(out)) {
                return null;
            }
            return out;
        }
    }

    @NotNull
    OUT parse(IN in);

    @Nullable
    OUT parseOrNull(IN in);
}
