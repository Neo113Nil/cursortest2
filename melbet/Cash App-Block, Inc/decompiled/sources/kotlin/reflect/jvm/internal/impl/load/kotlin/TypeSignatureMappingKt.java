package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* loaded from: classes9.dex */
public final class TypeSignatureMappingKt {
    public static final <T> T boxTypeIfNeeded(JvmTypeFactory<T> jvmTypeFactory, T t, boolean z) {
        jvmTypeFactory.getClass();
        t.getClass();
        return z ? jvmTypeFactory.boxType(t) : t;
    }

    public static final <T> T mapBuiltInType(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, JvmTypeFactory<T> jvmTypeFactory, TypeMappingMode typeMappingMode) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructor)) {
            PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructor);
            if (primitiveType != null) {
                return (T) boxTypeIfNeeded(jvmTypeFactory, jvmTypeFactory.createPrimitiveType(primitiveType), typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) || TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, kotlinTypeMarker));
            }
            PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructor);
            if (primitiveArrayType != null) {
                return jvmTypeFactory.mo4150createFromString("[" + JvmPrimitiveType.get(primitiveArrayType).getDesc());
            }
            if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructor)) {
                FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructor);
                ClassId mapKotlinToJava = classFqNameUnsafe != null ? JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe) : null;
                if (mapKotlinToJava != null) {
                    if (!typeMappingMode.getKotlinCollectionsToJavaCollections()) {
                        List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                        if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                            Iterator<T> it = mutabilityMappings.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.areEqual(((JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).getJavaClass(), mapKotlinToJava)) {
                                }
                            }
                        }
                    }
                    String internalNameByClassId = JvmClassName.internalNameByClassId(mapKotlinToJava);
                    internalNameByClassId.getClass();
                    return jvmTypeFactory.createObjectType(internalNameByClassId);
                }
            }
        }
        return null;
    }
}
