package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class NullableSerializer implements KSerializer {
    public final SerialDescriptorForNullable descriptor;
    public final KSerializer serializer;

    public NullableSerializer(KSerializer kSerializer) {
        kSerializer.getClass();
        this.serializer = kSerializer;
        this.descriptor = new SerialDescriptorForNullable(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.decodeNotNullMark()) {
            return decoder.decodeSerializableValue$1(this.serializer);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NullableSerializer.class == obj.getClass() && Intrinsics.areEqual(this.serializer, ((NullableSerializer) obj).serializer);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.encodeSerializableValue(this.serializer, obj);
        } else {
            encoder.encodeNull();
        }
    }
}
