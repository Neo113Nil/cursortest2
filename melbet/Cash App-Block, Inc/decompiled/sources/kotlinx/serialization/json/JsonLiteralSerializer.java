package kotlinx.serialization.json;

import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.ULong;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.json.internal.WriteModeKt;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public final class JsonLiteralSerializer implements KSerializer {
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
    public static final PrimitiveSerialDescriptor descriptor = Tags.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        JsonDecoder asJsonDecoder = MarkdownAnimationsKt.asJsonDecoder(decoder);
        JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
        if (decodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) decodeJsonElement;
        }
        throw new JsonDecodingException(WriteModeKt.formatDecodingException(SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, decodeJsonElement.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), -1, null, null, asJsonDecoder.getJson().configuration.exceptionsWithDebugInfo ? WriteModeKt.minify(-1, decodeJsonElement.toString()).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        jsonLiteral.getClass();
        MarkdownAnimationsKt.asJsonEncoder(encoder);
        boolean z = jsonLiteral.isString;
        String str = jsonLiteral.content;
        if (z) {
            encoder.encodeString(str);
            return;
        }
        SerialDescriptor serialDescriptor = jsonLiteral.coerceToInlineType;
        if (serialDescriptor != null) {
            encoder.encodeInline(serialDescriptor).encodeString(str);
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            encoder.encodeLong(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(str);
        if (uLongOrNull != null) {
            encoder.encodeInline(BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor()).encodeLong(uLongOrNull.data);
            return;
        }
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
        if (doubleOrNull != null) {
            encoder.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str);
        if (booleanStrictOrNull != null) {
            encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            encoder.encodeString(str);
        }
    }
}
