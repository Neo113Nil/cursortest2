package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* loaded from: classes2.dex */
public final class JsonArray extends JsonNode {

    @NotNull
    private final JSONArray value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonArray(@NotNull JSONArray value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @NotNull
    public String dump() {
        String jSONArray = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "value.toString()");
        return jSONArray;
    }
}
