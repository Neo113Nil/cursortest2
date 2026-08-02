package kotlinx.serialization.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class AbstractPolymorphicSerializer implements KSerializer {
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object obj = null;
        while (true) {
            int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
            if (decodeElementIndex == -1) {
                if (obj != null) {
                    beginStructure.endStructure(descriptor);
                    return obj;
                }
                Path$$ExternalSyntheticBUOutline0.m$3((String) ref$ObjectRef.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (decodeElementIndex != 0) {
                Object obj2 = ref$ObjectRef.element;
                if (decodeElementIndex != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) obj2;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(decodeElementIndex);
                    throw new SerializationException(sb.toString());
                }
                if (obj2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Cannot read polymorphic value before its type token");
                    return null;
                }
                ref$ObjectRef.element = obj2;
                obj = beginStructure.decodeSerializableElement(getDescriptor(), decodeElementIndex, PolymorphicSerializerKt.findPolymorphicSerializer(this, beginStructure, (String) obj2), null);
            } else {
                ref$ObjectRef.element = beginStructure.decodeStringElement(getDescriptor(), decodeElementIndex);
            }
        }
    }

    public KSerializer findPolymorphicSerializerOrNull(CompositeDecoder compositeDecoder, String str) {
        SerializersModule serializersModule = compositeDecoder.getSerializersModule();
        KClass baseClass = getBaseClass();
        SerialModuleImpl serialModuleImpl = (SerialModuleImpl) serializersModule;
        serialModuleImpl.getClass();
        baseClass.getClass();
        Map map = (Map) serialModuleImpl.polyBase2NamedSerializers.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = serialModuleImpl.polyBase2DefaultDeserializerProvider.get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (KSerializer) function1.invoke(str);
        }
        return null;
    }

    public abstract KClass getBaseClass();

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        KSerializer findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        beginStructure.encodeStringElement(getDescriptor(), 0, findPolymorphicSerializer.getDescriptor().getSerialName());
        beginStructure.encodeSerializableElement(getDescriptor(), 1, findPolymorphicSerializer, obj);
        beginStructure.endStructure(descriptor);
    }

    public KSerializer findPolymorphicSerializerOrNull(Encoder encoder, Object obj) {
        obj.getClass();
        return encoder.getSerializersModule().getPolymorphic(getBaseClass(), obj);
    }
}
