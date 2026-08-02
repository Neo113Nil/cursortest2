package kotlinx.serialization.json;

import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.WriteModeKt;

/* loaded from: classes9.dex */
public abstract class JsonTransformingSerializer implements KSerializer {
    public final KSerializer tSerializer;

    public JsonTransformingSerializer(KSerializer kSerializer) {
        kSerializer.getClass();
        this.tSerializer = kSerializer;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        JsonDecoder asJsonDecoder = MarkdownAnimationsKt.asJsonDecoder(decoder);
        JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
        Json json = asJsonDecoder.getJson();
        KSerializer kSerializer = this.tSerializer;
        JsonElement transformDeserialize = transformDeserialize(decodeJsonElement);
        json.getClass();
        kSerializer.getClass();
        transformDeserialize.getClass();
        return WriteModeKt.readJson(json, transformDeserialize, kSerializer);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonEncoder asJsonEncoder = MarkdownAnimationsKt.asJsonEncoder(encoder);
        asJsonEncoder.encodeJsonElement(transformSerialize(WriteModeKt.writeJson(asJsonEncoder.getJson(), obj, this.tSerializer)));
    }

    public JsonElement transformDeserialize(JsonElement jsonElement) {
        jsonElement.getClass();
        return jsonElement;
    }

    public JsonElement transformSerialize(JsonElement jsonElement) {
        jsonElement.getClass();
        return jsonElement;
    }
}
