package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public abstract class StreamingJsonEncoderKt {
    public static final Set unsignedNumberDescriptors = ArraysKt___ArraysKt.toSet(new SerialDescriptor[]{BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(), BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor()});

    public static final boolean isUnsignedNumber(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.isInline() && unsignedNumberDescriptors.contains(serialDescriptor);
    }
}
