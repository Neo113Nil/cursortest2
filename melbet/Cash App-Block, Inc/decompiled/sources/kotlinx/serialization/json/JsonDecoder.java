package kotlinx.serialization.json;

import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes9.dex */
public interface JsonDecoder extends Decoder, CompositeDecoder {
    JsonElement decodeJsonElement();

    Json getJson();
}
