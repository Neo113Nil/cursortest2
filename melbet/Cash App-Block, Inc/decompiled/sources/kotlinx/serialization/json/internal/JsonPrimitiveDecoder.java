package kotlinx.serialization.json.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes9.dex */
public final class JsonPrimitiveDecoder extends AbstractJsonTreeDecoder {
    public final JsonElement value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveDecoder(Json json, JsonElement jsonElement, String str) {
        super(json, str);
        json.getClass();
        jsonElement.getClass();
        this.value = jsonElement;
        this.tagStack.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement currentElement(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.value;
        }
        a$$ExternalSyntheticBUOutline0.m$3("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement getValue() {
        return this.value;
    }
}
