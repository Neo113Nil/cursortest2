package kotlinx.serialization;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class SealedClassSerializer extends AbstractPolymorphicSerializer {
    public final List _annotations;
    public final KClass baseClass;
    public final Map class2Serializer;
    public final Lazy descriptor$delegate;
    public final LinkedHashMap serialName2Serializer;

    public SealedClassSerializer(String str, KClass kClass, KClass[] kClassArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        kClass.getClass();
        this.baseClass = kClass;
        this._annotations = EmptyList.INSTANCE;
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new InteractionRuleClient$$ExternalSyntheticLambda0(14, str, this));
        if (kClassArr.length != kSerializerArr.length) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("All subclasses of sealed class ", kClass.getSimpleName(), " should be marked @Serializable");
            throw null;
        }
        Map map = MapsKt__MapsKt.toMap(ArraysKt___ArraysKt.zip(kClassArr, kSerializerArr));
        this.class2Serializer = map;
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entrySet) {
            String serialName = ((KSerializer) entry.getValue()).getDescriptor().getSerialName();
            Object obj = linkedHashMap.get(serialName);
            if (obj == null) {
                linkedHashMap.containsKey(serialName);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.baseClass);
                sb.append("' have the same serial name '");
                sb.append(serialName);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(serialName, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this._annotations = asList;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final KSerializer findPolymorphicSerializerOrNull(Encoder encoder, Object obj) {
        obj.getClass();
        KSerializer kSerializer = (KSerializer) this.class2Serializer.get(Reflection.factory.getOrCreateKotlinClass(obj.getClass()));
        KSerializer findPolymorphicSerializerOrNull = kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(encoder, obj);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final KClass getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final KSerializer findPolymorphicSerializerOrNull(CompositeDecoder compositeDecoder, String str) {
        KSerializer kSerializer = (KSerializer) this.serialName2Serializer.get(str);
        return kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(compositeDecoder, str);
    }
}
