package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.modules.SerializersModule;
import papa.PapaEvent;

@Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SerializersKt {
    public static final KSerializer noCompiledSerializer(SerializersModule serializersModule, KClass kClass) {
        serializersModule.getClass();
        kClass.getClass();
        KSerializer contextual = serializersModule.getContextual(kClass, EmptyList.INSTANCE);
        if (contextual != null) {
            return contextual;
        }
        EnumsKt.serializerNotRegistered(kClass);
        throw null;
    }

    public static final KSerializer parametrizedSerializerOrNull(KClass kClass, List list, Function0 function0) {
        KSerializer hashSetSerializer;
        KSerializer referenceArraySerializer;
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Collection.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(List.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(List.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(ArrayList.class))) {
            hashSetSerializer = new HashSetSerializer((KSerializer) list.get(0), 1);
        } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(HashSet.class))) {
            hashSetSerializer = new HashSetSerializer((KSerializer) list.get(0), 0);
        } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Set.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(Set.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(LinkedHashSet.class))) {
            hashSetSerializer = new HashSetSerializer((KSerializer) list.get(0), 2);
        } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(HashMap.class))) {
            hashSetSerializer = new HashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1), 0);
        } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Map.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(Map.class)) || kClass.equals(reflectionFactory.getOrCreateKotlinClass(LinkedHashMap.class))) {
            hashSetSerializer = new HashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1), 1);
        } else {
            if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) list.get(0);
                KSerializer kSerializer2 = (KSerializer) list.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                referenceArraySerializer = new PairSerializer(kSerializer, kSerializer2, 1);
            } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Pair.class))) {
                KSerializer kSerializer3 = (KSerializer) list.get(0);
                KSerializer kSerializer4 = (KSerializer) list.get(1);
                kSerializer3.getClass();
                kSerializer4.getClass();
                referenceArraySerializer = new PairSerializer(kSerializer3, kSerializer4, 0);
            } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Triple.class))) {
                KSerializer kSerializer5 = (KSerializer) list.get(0);
                KSerializer kSerializer6 = (KSerializer) list.get(1);
                KSerializer kSerializer7 = (KSerializer) list.get(2);
                kSerializer5.getClass();
                kSerializer6.getClass();
                kSerializer7.getClass();
                hashSetSerializer = new TripleSerializer(kSerializer5, kSerializer6, kSerializer7);
            } else if (PapaEvent.getJavaClass(kClass).isArray()) {
                Object invoke = function0.invoke();
                invoke.getClass();
                KSerializer kSerializer8 = (KSerializer) list.get(0);
                kSerializer8.getClass();
                referenceArraySerializer = new ReferenceArraySerializer((KClass) invoke, kSerializer8);
            } else {
                hashSetSerializer = null;
            }
            hashSetSerializer = referenceArraySerializer;
        }
        if (hashSetSerializer != null) {
            return hashSetSerializer;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return EnumsKt.constructSerializerForGivenTypeArgs(PapaEvent.getJavaClass(kClass), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    public static final <T> KSerializer serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final KSerializer serializerOrNull(KClass kClass) {
        kClass.getClass();
        KSerializer constructSerializerForGivenTypeArgs = EnumsKt.constructSerializerForGivenTypeArgs(PapaEvent.getJavaClass(kClass), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return constructSerializerForGivenTypeArgs == null ? (KSerializer) PrimitivesKt.BUILTIN_SERIALIZERS.get(kClass) : constructSerializerForGivenTypeArgs;
    }

    public static final ArrayList serializersForParameters(SerializersModule serializersModule, List list, boolean z) {
        serializersModule.getClass();
        list.getClass();
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(serializer(serializersModule, (KType) it.next()));
            }
            return arrayList;
        }
        List<KType> list3 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (KType kType : list3) {
            kType.getClass();
            KSerializer serializerByKTypeImpl$SerializersKt__SerializersKt = SerializersKt__SerializersKt.serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, kType, false);
            if (serializerByKTypeImpl$SerializersKt__SerializersKt == null) {
                return null;
            }
            arrayList2.add(serializerByKTypeImpl$SerializersKt__SerializersKt);
        }
        return arrayList2;
    }

    public static final <T> KSerializer serializer(KClass kClass) {
        return SerializersKt__SerializersKt.serializer(kClass);
    }

    public static final KSerializer serializer(KClass kClass, List<? extends KSerializer> list, boolean z) {
        return SerializersKt__SerializersKt.serializer(kClass, list, z);
    }

    public static final KSerializer serializer(KType kType) {
        return SerializersKt__SerializersKt.serializer(kType);
    }

    public static final KSerializer serializer(SerializersModule serializersModule, Type type2) {
        return SerializersKt__SerializersJvmKt.serializer(serializersModule, type2);
    }

    public static final KSerializer serializer(SerializersModule serializersModule, KClass kClass, List<? extends KSerializer> list, boolean z) {
        return SerializersKt__SerializersKt.serializer(serializersModule, kClass, list, z);
    }

    public static final KSerializer serializer(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.serializer(serializersModule, kType);
    }

    public static final KSerializer serializer(Type type2) {
        return SerializersKt__SerializersJvmKt.serializer(type2);
    }

    public static final <T> KSerializer serializer(SerializersModule serializersModule) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final KSerializer serializerOrNull(SerializersModule serializersModule, Type type2) {
        serializersModule.getClass();
        type2.getClass();
        return SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type2, false);
    }
}
