package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes9.dex */
public final class JsonTreeMapDecoder extends JsonTreeDecoder {
    public final List keys;
    public int position;
    public final int size;
    public final JsonObject value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapDecoder(Json json, JsonObject jsonObject) {
        super(json, jsonObject, (String) null, 12);
        json.getClass();
        this.value = jsonObject;
        List list = CollectionsKt.toList(jsonObject.content.keySet());
        this.keys = list;
        this.size = list.size() * 2;
        this.position = -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement currentElement(String str) {
        str.getClass();
        return this.position % 2 == 0 ? JsonElementKt.JsonPrimitive(str) : (JsonElement) MapsKt__MapsKt.getValue(this.value, str);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.position;
        if (i >= this.size - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.position = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final String elementName(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return (String) this.keys.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void endStructure(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonElement getValue() {
        return this.value;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public final JsonObject getValue() {
        return this.value;
    }
}
