package kotlinx.serialization;

import bo.app.n$$ExternalSyntheticLambda2;
import dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u001d\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\t\u001a=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0010\u001a!\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\u0011\u001aA\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001*\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0002\u0010\u0012\u001a)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KType;", "type", "", "(Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "kClass", "", "typeArgumentsSerializers", "", "isNullable", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;Ljava/util/List;Z)Lkotlinx/serialization/KSerializer;", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 5, mv = {2, 3, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes9.dex */
final /* synthetic */ class SerializersKt__SerializersKt {
    public static final KSerializer serializer(SerializersModule serializersModule, KClass kClass, List<? extends KSerializer> list, boolean z) {
        KSerializer contextual;
        serializersModule.getClass();
        kClass.getClass();
        list.getClass();
        if (list.isEmpty()) {
            contextual = SerializersKt.serializerOrNull(kClass);
            if (contextual == null) {
                contextual = serializersModule.getContextual(kClass, EmptyList.INSTANCE);
            }
        } else {
            try {
                KSerializer parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kClass, list, new HazeStyleKt$$ExternalSyntheticLambda0(8));
                contextual = parametrizedSerializerOrNull == null ? serializersModule.getContextual(kClass, list) : parametrizedSerializerOrNull;
            } catch (IndexOutOfBoundsException e) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        if (contextual == null) {
            contextual = null;
        } else if (z) {
            contextual = BuiltinSerializersKt.getNullable(contextual);
        }
        if (contextual != null) {
            return contextual;
        }
        EnumsKt.serializerNotRegistered(kClass);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005f, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KType kType, boolean z) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        PolymorphicSerializer polymorphicSerializer;
        KClass kclass = EnumsKt.kclass(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        for (KTypeProjection kTypeProjection : arguments) {
            kTypeProjection.getClass();
            KType kType2 = kTypeProjection.f1521type;
            if (kType2 == null) {
                Path$$ExternalSyntheticBUOutline0.m$3(kType2, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(kType2);
        }
        if (arrayList.isEmpty()) {
            if (!PapaEvent.getJavaClass(kclass).isInterface() || serializersModule.getContextual(kclass, EmptyList.INSTANCE) == null) {
                SerializerCache serializerCache = SerializersCacheKt.SERIALIZERS_CACHE;
                kSerializer = !isMarkedNullable ? SerializersCacheKt.SERIALIZERS_CACHE.get(kclass) : SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE.get(kclass);
                if (kSerializer == null) {
                    return kSerializer;
                }
                if (arrayList.isEmpty()) {
                    kSerializer2 = SerializersKt.serializerOrNull(kclass);
                    if (kSerializer2 == null && (kSerializer2 = serializersModule.getContextual(kclass, EmptyList.INSTANCE)) == null) {
                        if (PapaEvent.getJavaClass(kclass).isInterface()) {
                            polymorphicSerializer = new PolymorphicSerializer(kclass);
                            kSerializer2 = polymorphicSerializer;
                        }
                        kSerializer2 = null;
                    }
                    if (kSerializer2 != null) {
                        return isMarkedNullable ? BuiltinSerializersKt.getNullable(kSerializer2) : kSerializer2;
                    }
                } else {
                    ArrayList serializersForParameters = SerializersKt.serializersForParameters(serializersModule, arrayList, z);
                    if (serializersForParameters != null) {
                        KSerializer parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kclass, serializersForParameters, new n$$ExternalSyntheticLambda2(9, arrayList));
                        if (parametrizedSerializerOrNull == null) {
                            kSerializer2 = serializersModule.getContextual(kclass, serializersForParameters);
                            if (kSerializer2 == null) {
                                if (PapaEvent.getJavaClass(kclass).isInterface()) {
                                    polymorphicSerializer = new PolymorphicSerializer(kclass);
                                    kSerializer2 = polymorphicSerializer;
                                }
                                kSerializer2 = null;
                            }
                        } else {
                            kSerializer2 = parametrizedSerializerOrNull;
                        }
                        if (kSerializer2 != null) {
                        }
                    }
                }
                return null;
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        } else {
            if (!((SerialModuleImpl) serializersModule).hasInterfaceContextualSerializers) {
                SerializerCache serializerCache2 = SerializersCacheKt.SERIALIZERS_CACHE;
                Object mo4205getgIAlus = !isMarkedNullable ? SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE.mo4205getgIAlus(kclass, arrayList) : SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo4205getgIAlus(kclass, arrayList);
                Result.Companion companion = Result.Companion;
                if (mo4205getgIAlus instanceof Result.Failure) {
                    mo4205getgIAlus = null;
                }
                kSerializer = (KSerializer) mo4205getgIAlus;
                if (kSerializer == null) {
                }
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        }
    }

    public static final KSerializer serializer(KType kType) {
        kType.getClass();
        return SerializersKt.serializer(SerializersModuleKt.EmptySerializersModule, kType);
    }

    public static final KSerializer serializer(SerializersModule serializersModule, KType kType) {
        serializersModule.getClass();
        kType.getClass();
        KSerializer serializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, kType, true);
        if (serializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return serializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        EnumsKt.serializerNotRegistered(EnumsKt.kclass(kType));
        throw null;
    }

    public static final <T> KSerializer serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T> KSerializer serializer(SerializersModule serializersModule) {
        serializersModule.getClass();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final KSerializer serializer(KClass kClass, List<? extends KSerializer> list, boolean z) {
        kClass.getClass();
        list.getClass();
        return SerializersKt.serializer(SerializersModuleKt.EmptySerializersModule, kClass, list, z);
    }

    public static final <T> KSerializer serializer(KClass kClass) {
        kClass.getClass();
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        EnumsKt.serializerNotRegistered(kClass);
        throw null;
    }
}
