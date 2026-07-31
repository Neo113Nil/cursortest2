package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class JsonObject extends JsonNode {

    @NotNull
    private final JSONObject value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonObject(@NotNull JSONObject value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @NotNull
    public String dump() {
        String jSONObject = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "value.toString()");
        return jSONObject;
    }
}
