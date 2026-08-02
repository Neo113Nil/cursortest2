package kotlinx.serialization.json;

import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.WriteModeKt;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public final class JsonPrimitiveSerializer implements KSerializer {
    public static final JsonPrimitiveSerializer INSTANCE = new JsonPrimitiveSerializer();
    public static final SerialDescriptorImpl descriptor = Tags.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", PrimitiveKind$INT.INSTANCE$8, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        JsonDecoder asJsonDecoder = MarkdownAnimationsKt.asJsonDecoder(decoder);
        JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
        if (decodeJsonElement instanceof JsonPrimitive) {
            return (JsonPrimitive) decodeJsonElement;
        }
        throw new JsonDecodingException(WriteModeKt.formatDecodingException(SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, decodeJsonElement.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), -1, null, null, asJsonDecoder.getJson().configuration.exceptionsWithDebugInfo ? WriteModeKt.minify(-1, decodeJsonElement.toString()).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        jsonPrimitive.getClass();
        MarkdownAnimationsKt.asJsonEncoder(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.encodeSerializableValue(JsonNullSerializer.INSTANCE, JsonNull.INSTANCE);
        } else {
            encoder.encodeSerializableValue(JsonLiteralSerializer.INSTANCE, (JsonLiteral) jsonPrimitive);
        }
    }
}
