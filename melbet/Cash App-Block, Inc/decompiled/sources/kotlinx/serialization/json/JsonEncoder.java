package kotlinx.serialization.json;

import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public interface JsonEncoder extends Encoder, CompositeEncoder {
    void encodeJsonElement(JsonElement jsonElement);

    Json getJson();
}
