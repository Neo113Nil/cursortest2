package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class ParsingException extends RuntimeException {

    @Nullable
    private final String jsonSummary;

    @NotNull
    private final ParsingExceptionReason reason;

    @Nullable
    private final JsonNode source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, JsonNode jsonNode, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingExceptionReason, str, (i4 & 4) != 0 ? null : th, (i4 & 8) != 0 ? null : jsonNode, (i4 & 16) != 0 ? null : str2);
    }

    @Nullable
    public String getJsonSummary() {
        return this.jsonSummary;
    }

    @NotNull
    public ParsingExceptionReason getReason() {
        return this.reason;
    }

    @Nullable
    public JsonNode getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParsingException(@NotNull ParsingExceptionReason reason, @NotNull String message, @Nullable Throwable th, @Nullable JsonNode jsonNode, @Nullable String str) {
        super(message, th);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        this.reason = reason;
        this.source = jsonNode;
        this.jsonSummary = str;
    }
}
