package kotlinx.serialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "", "serializer", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 5, mv = {2, 3, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes9.dex */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final Class prettyClass$SerializersKt__SerializersJvmKt(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type2).getRawType();
            rawType.getClass();
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            upperBounds.getClass();
            Object first = ArraysKt___ArraysKt.first(upperBounds);
            first.getClass();
            return prettyClass$SerializersKt__SerializersJvmKt((Type) first);
        }
        if (type2 instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
            genericComponentType.getClass();
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type2);
        sb.append(" has type ");
        a$$ExternalSyntheticBUOutline0.m$3(SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, type2.getClass(), sb));
        return null;
    }

    public static final KSerializer reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule serializersModule, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer constructSerializerForGivenTypeArgs = EnumsKt.constructSerializerForGivenTypeArgs(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (constructSerializerForGivenTypeArgs != null) {
            return constructSerializerForGivenTypeArgs;
        }
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls);
        KSerializer kSerializer = (KSerializer) PrimitivesKt.BUILTIN_SERIALIZERS.get(orCreateKotlinClass);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer contextual = serializersModule.getContextual(orCreateKotlinClass, list);
        if (contextual != null) {
            return contextual;
        }
        if (cls.isInterface()) {
            return new PolymorphicSerializer(reflectionFactory.getOrCreateKotlinClass(cls));
        }
        return null;
    }

    public static final KSerializer serializer(SerializersModule serializersModule, Type type2) {
        serializersModule.getClass();
        type2.getClass();
        KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type2, true);
        if (serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        Class prettyClass$SerializersKt__SerializersJvmKt = prettyClass$SerializersKt__SerializersJvmKt(type2);
        prettyClass$SerializersKt__SerializersJvmKt.getClass();
        throw new SerializationException(EnumsKt.notRegisteredMessage(Reflection.factory.getOrCreateKotlinClass(prettyClass$SerializersKt__SerializersJvmKt)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v22 kotlinx.serialization.KSerializer, still in use, count: 2, list:
          (r7v22 kotlinx.serialization.KSerializer) from 0x002c: IF  (r7v22 kotlinx.serialization.KSerializer) == (null kotlinx.serialization.KSerializer)  -> B:22:0x00f6 A[HIDDEN]
          (r7v22 kotlinx.serialization.KSerializer) from 0x0030: PHI (r7v23 kotlinx.serialization.KSerializer) = (r7v22 kotlinx.serialization.KSerializer) binds: [B:21:0x002c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final kotlinx.serialization.KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule, java.lang.reflect.Type, boolean):kotlinx.serialization.KSerializer");
    }

    public static final KSerializer serializer(Type type2) {
        type2.getClass();
        return SerializersKt.serializer(SerializersModuleKt.EmptySerializersModule, type2);
    }
}
