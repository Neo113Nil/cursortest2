package kotlinx.serialization.internal;

import kotlin.ULong;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class ULongSerializer implements KSerializer {
    public static final ULongSerializer INSTANCE = new ULongSerializer();
    public static final InlineClassDescriptor descriptor = EnumsKt.InlinePrimitiveDescriptor("kotlin.ULong", BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new ULong(decoder.decodeInline(descriptor).decodeLong());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.encodeInline(descriptor).encodeLong(((ULong) obj).data);
    }
}
