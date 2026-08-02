package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes9.dex */
public final class JsonTreeListDecoder extends AbstractJsonTreeDecoder {
    public int currentIndex;
    public final int size;
    public final JsonArray value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListDecoder(Json json, JsonArray jsonArray) {
        super(json, null);
        json.getClass();
        jsonArray.getClass();
        this.value = jsonArray;
        this.size = jsonArray.content.size();
        this.currentIndex = -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement currentElement(String str) {
        str.getClass();
        return (JsonElement) this.value.content.get(Integer.parseInt(str));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.currentIndex;
        if (i >= this.size - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.currentIndex = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final String elementName(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement getValue() {
        return this.value;
    }
}
