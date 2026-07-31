package com.yandex.div.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ParsingContextKt {
    @NotNull
    public static final ParsingContext collectingErrors(@NotNull ParsingContext parsingContext) {
        Intrinsics.checkNotNullParameter(parsingContext, "<this>");
        return parsingContext instanceof ErrorCollectingParsingContext ? parsingContext : new ErrorCollectingParsingContext(parsingContext);
    }

    @NotNull
    public static final List<Exception> getCollectedErrors(@NotNull ParsingContext parsingContext) {
        Intrinsics.checkNotNullParameter(parsingContext, "<this>");
        return parsingContext instanceof ErrorCollectingParsingContext ? ((ErrorCollectingParsingContext) parsingContext).getErrors() : parsingContext instanceof ParsingContextWrapper ? getCollectedErrors(((ParsingContextWrapper) parsingContext).getBaseContext()) : CollectionsKt.emptyList();
    }

    @NotNull
    public static final ParsingContext restrictPropertyOverride(@NotNull ParsingContext parsingContext) {
        Intrinsics.checkNotNullParameter(parsingContext, "<this>");
        return parsingContext instanceof OverrideRestrictingParsingContext ? parsingContext : new OverrideRestrictingParsingContext(parsingContext);
    }
}
