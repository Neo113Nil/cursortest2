package kotlinx.serialization.json;

import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public final class JsonElementSerializer implements KSerializer {
    public static final JsonElementSerializer INSTANCE = new JsonElementSerializer();
    public static final SerialDescriptorImpl descriptor = Tags.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", PolymorphicKind.OPEN.INSTANCE$1, new SerialDescriptor[0], new InstantKt$$ExternalSyntheticLambda0(28));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return MarkdownAnimationsKt.asJsonDecoder(decoder).decodeJsonElement();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        jsonElement.getClass();
        MarkdownAnimationsKt.asJsonEncoder(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.encodeSerializableValue(JsonPrimitiveSerializer.INSTANCE, jsonElement);
            return;
        }
        if (jsonElement instanceof JsonObject) {
            encoder.encodeSerializableValue(JsonObjectSerializer.INSTANCE, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.encodeSerializableValue(JsonArraySerializer.INSTANCE, jsonElement);
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
