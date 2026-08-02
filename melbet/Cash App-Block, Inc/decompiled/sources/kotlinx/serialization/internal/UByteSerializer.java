package kotlinx.serialization.internal;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UByteSerializer implements KSerializer {
    public static final UByteSerializer INSTANCE = new UByteSerializer();
    public static final InlineClassDescriptor descriptor = EnumsKt.InlinePrimitiveDescriptor("kotlin.UByte", BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new UByte(decoder.decodeInline(descriptor).decodeByte());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.encodeInline(descriptor).encodeByte(((UByte) obj).data);
    }
}
