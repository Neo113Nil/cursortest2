package com.stripe.android.financialconnections.model.serializer;

import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonTransformingSerializer;

/* loaded from: classes9.dex */
public final class JsonAsStringSerializer extends JsonTransformingSerializer {
    public static final JsonAsStringSerializer INSTANCE = new JsonAsStringSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    public final JsonElement transformDeserialize(JsonElement jsonElement) {
        jsonElement.getClass();
        return JsonElementKt.JsonPrimitive(jsonElement.toString());
    }
}
