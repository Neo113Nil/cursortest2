package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes9.dex */
public interface Decoder {
    CompositeDecoder beginStructure(SerialDescriptor serialDescriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(SerialDescriptor serialDescriptor);

    float decodeFloat();

    Decoder decodeInline(SerialDescriptor serialDescriptor);

    int decodeInt();

    long decodeLong();

    boolean decodeNotNullMark();

    default Object decodeSerializableValue$1(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.deserialize(this);
    }

    short decodeShort();

    String decodeString();

    SerializersModule getSerializersModule();
}
