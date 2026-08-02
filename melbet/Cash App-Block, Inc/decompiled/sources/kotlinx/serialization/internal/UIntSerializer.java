package kotlinx.serialization.internal;

import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class UIntSerializer implements KSerializer {
    public static final UIntSerializer INSTANCE = new UIntSerializer();
    public static final InlineClassDescriptor descriptor = EnumsKt.InlinePrimitiveDescriptor("kotlin.UInt", BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new UInt(decoder.decodeInline(descriptor).decodeInt());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.encodeInline(descriptor).encodeInt(((UInt) obj).data);
    }
}
