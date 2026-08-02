package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;

/* loaded from: classes9.dex */
public interface CompositeEncoder {
    void encodeBooleanElement(SerialDescriptor serialDescriptor, int i, boolean z);

    void encodeByteElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, byte b);

    void encodeCharElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, char c);

    void encodeDoubleElement(SerialDescriptor serialDescriptor, int i, double d);

    void encodeFloatElement(SerialDescriptor serialDescriptor, int i, float f);

    Encoder encodeInlineElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    void encodeIntElement(int i, int i2, SerialDescriptor serialDescriptor);

    void encodeLongElement(SerialDescriptor serialDescriptor, int i, long j);

    void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void encodeSerializableElement(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void encodeShortElement(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, short s);

    void encodeStringElement(SerialDescriptor serialDescriptor, int i, String str);

    void endStructure(SerialDescriptor serialDescriptor);

    default boolean shouldEncodeElementDefault(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }
}
