package kotlinx.serialization.json.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes9.dex */
public final class JsonTreeMapEncoder extends JsonTreeEncoder {
    public boolean isKey;
    public String tag;

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder
    public final JsonElement getCurrent() {
        return new JsonObject((LinkedHashMap) this.content);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder
    public final void putElement(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (!this.isKey) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.content;
            String str2 = this.tag;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                throw null;
            }
            linkedHashMap.put(str2, jsonElement);
            this.isKey = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.tag = ((JsonPrimitive) jsonElement).getContent();
            this.isKey = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw WriteModeKt.InvalidKeyKindException(JsonObjectSerializer.descriptor);
            }
            if (jsonElement instanceof JsonArray) {
                throw WriteModeKt.InvalidKeyKindException(JsonArraySerializer.descriptor);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
