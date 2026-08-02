package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes9.dex */
public interface Encoder {
    default CompositeEncoder beginCollection(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return beginStructure(serialDescriptor);
    }

    CompositeEncoder beginStructure(SerialDescriptor serialDescriptor);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(SerialDescriptor serialDescriptor, int i);

    void encodeFloat(float f);

    Encoder encodeInline(SerialDescriptor serialDescriptor);

    void encodeInt(int i);

    void encodeLong(long j);

    void encodeNull();

    default void encodeNullableSerializableValue(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        if (kSerializer.getDescriptor().isNullable()) {
            encodeSerializableValue(kSerializer, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeSerializableValue(kSerializer, obj);
        }
    }

    default void encodeSerializableValue(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }

    void encodeShort(short s);

    void encodeString(String str);

    SerializersModule getSerializersModule();
}
