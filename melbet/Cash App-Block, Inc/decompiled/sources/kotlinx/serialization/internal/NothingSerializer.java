package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes3.dex */
public final class NothingSerializer implements KSerializer {
    public static final NothingSerializer INSTANCE = new NothingSerializer();
    public static final NothingSerialDescriptor descriptor = NothingSerialDescriptor.INSTANCE;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((Void) obj).getClass();
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
