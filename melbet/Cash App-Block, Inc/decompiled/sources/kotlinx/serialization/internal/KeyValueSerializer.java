package kotlinx.serialization.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.WriteModeKt;
import okhttp3.internal.Tags;

/* loaded from: classes9.dex */
public abstract class KeyValueSerializer implements KSerializer {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object keySerializer;
    public final Object valueSerializer;

    public KeyValueSerializer(KClass kClass) {
        kClass.getClass();
        this.keySerializer = kClass;
        this.valueSerializer = Tags.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + kClass.getSimpleName() + '>', PolymorphicKind.OPEN.INSTANCE$1, new SerialDescriptor[0]);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        switch (this.$r8$classId) {
            case 0:
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                Object obj = TuplesKt.NULL;
                Object obj2 = obj;
                Object obj3 = obj2;
                while (true) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                    if (decodeElementIndex == -1) {
                        if (obj2 == obj) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (obj3 == obj) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object result = toResult(obj2, obj3);
                        beginStructure.endStructure(descriptor);
                        return result;
                    }
                    if (decodeElementIndex == 0) {
                        obj2 = beginStructure.decodeSerializableElement(getDescriptor(), 0, (KSerializer) this.keySerializer, null);
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new SerializationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(decodeElementIndex, "Invalid index: "));
                        }
                        obj3 = beginStructure.decodeSerializableElement(getDescriptor(), 1, (KSerializer) this.valueSerializer, null);
                    }
                }
            default:
                JsonDecoder asJsonDecoder = MarkdownAnimationsKt.asJsonDecoder(decoder);
                JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
                KSerializer selectDeserializer = selectDeserializer(decodeJsonElement);
                selectDeserializer.getClass();
                Json json = asJsonDecoder.getJson();
                json.getClass();
                return WriteModeKt.readJson(json, decodeJsonElement, selectDeserializer);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptorImpl) this.valueSerializer;
    }

    public abstract Object getKey(Object obj);

    public abstract Object getValue(Object obj);

    public abstract KSerializer selectDeserializer(JsonElement jsonElement);

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.keySerializer;
        switch (i) {
            case 0:
                CompositeEncoder beginStructure = encoder.beginStructure(getDescriptor());
                beginStructure.encodeSerializableElement(getDescriptor(), 0, (KSerializer) obj2, getKey(obj));
                beginStructure.encodeSerializableElement(getDescriptor(), 1, (KSerializer) this.valueSerializer, getValue(obj));
                beginStructure.endStructure(getDescriptor());
                return;
            default:
                obj.getClass();
                KClass kClass = (KClass) obj2;
                KSerializer polymorphic = encoder.getSerializersModule().getPolymorphic(kClass, obj);
                if (polymorphic == null) {
                    Class<?> cls = obj.getClass();
                    ReflectionFactory reflectionFactory = Reflection.factory;
                    KSerializer serializerOrNull = SerializersKt.serializerOrNull(reflectionFactory.getOrCreateKotlinClass(cls));
                    if (serializerOrNull == null) {
                        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(obj.getClass());
                        String simpleName = orCreateKotlinClass.getSimpleName();
                        if (simpleName == null) {
                            simpleName = String.valueOf(orCreateKotlinClass);
                        }
                        throw new SerializationException(Boxes$$ExternalSyntheticOutline1.m("Class '", simpleName, "' is not registered for polymorphic serialization ", "in the scope of '" + kClass.getSimpleName() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    }
                    polymorphic = serializerOrNull;
                }
                polymorphic.serialize(encoder, obj);
                return;
        }
    }

    public abstract Object toResult(Object obj, Object obj2);

    public KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        this.keySerializer = kSerializer;
        this.valueSerializer = kSerializer2;
    }
}
