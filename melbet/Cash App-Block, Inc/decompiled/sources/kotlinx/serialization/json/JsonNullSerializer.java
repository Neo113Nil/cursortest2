package kotlinx.serialization.json;

import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.WriteModeKt;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public final class JsonNullSerializer implements KSerializer {
    public static final JsonNullSerializer INSTANCE = new JsonNullSerializer();
    public static final SerialDescriptorImpl descriptor = Tags.buildSerialDescriptor$default("kotlinx.serialization.json.JsonNull", SerialKind$ENUM.INSTANCE, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        MarkdownAnimationsKt.asJsonDecoder(decoder);
        if (decoder.decodeNotNullMark()) {
            throw new JsonDecodingException(WriteModeKt.formatDecodingException("Expected 'null' literal", -1, null, null, null));
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        MarkdownAnimationsKt.asJsonEncoder(encoder);
        encoder.encodeNull();
    }
}
