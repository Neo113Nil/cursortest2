package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class JavaToKotlinClassMap {
    public static final ClassId FUNCTION_N_CLASS_ID;
    public static final FqName FUNCTION_N_FQ_NAME;
    public static final JavaToKotlinClassMap INSTANCE = new JavaToKotlinClassMap();
    public static final ClassId K_FUNCTION_CLASS_ID;
    public static final String NUMBERED_FUNCTION_PREFIX;
    public static final String NUMBERED_K_FUNCTION_PREFIX;
    public static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;
    public static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;
    public static final HashMap javaToKotlin;
    public static final HashMap kotlinToJava;
    public static final LinkedHashSet mappedKotlinClassFqNames;
    public static final List mutabilityMappings;
    public static final HashMap mutableToReadOnly;
    public static final HashMap mutableToReadOnlyClassId;
    public static final HashMap readOnlyToMutable;
    public static final HashMap readOnlyToMutableClassId;

    public static final class PlatformMutabilityMapping {
        public final ClassId javaClass;
        public final ClassId kotlinMutable;
        public final ClassId kotlinReadOnly;

        public PlatformMutabilityMapping(ClassId classId, ClassId classId2, ClassId classId3) {
            classId.getClass();
            classId2.getClass();
            classId3.getClass();
            this.javaClass = classId;
            this.kotlinReadOnly = classId2;
            this.kotlinMutable = classId3;
        }

        public final ClassId component1() {
            return this.javaClass;
        }

        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        public final ClassId component3() {
            return this.kotlinMutable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.areEqual(this.javaClass, platformMutabilityMapping.javaClass) && Intrinsics.areEqual(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && Intrinsics.areEqual(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
        }

        public final ClassId getJavaClass() {
            return this.javaClass;
        }

        public int hashCode() {
            return this.kotlinMutable.hashCode() + ((this.kotlinReadOnly.hashCode() + (this.javaClass.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.javaClass + ", kotlinReadOnly=" + this.kotlinReadOnly + ", kotlinMutable=" + this.kotlinMutable + ')';
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb.append(function.getPackageFqName());
        sb.append('.');
        sb.append(function.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb2.append(kFunction.getPackageFqName());
        sb2.append('.');
        sb2.append(kFunction.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb3.append(suspendFunction.getPackageFqName());
        sb3.append('.');
        sb3.append(suspendFunction.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb4.append(kSuspendFunction.getPackageFqName());
        sb4.append('.');
        sb4.append(kSuspendFunction.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classId = companion.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        FUNCTION_N_CLASS_ID = classId;
        FUNCTION_N_FQ_NAME = classId.asSingleFqName();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        K_FUNCTION_CLASS_ID = standardClassIds.getKFunction();
        standardClassIds.getKClass();
        classId(Class.class);
        javaToKotlin = new HashMap();
        kotlinToJava = new HashMap();
        mutableToReadOnly = new HashMap();
        readOnlyToMutable = new HashMap();
        mutableToReadOnlyClassId = new HashMap();
        readOnlyToMutableClassId = new HashMap();
        mappedKotlinClassFqNames = new LinkedHashSet();
        ClassId classId2 = companion.topLevel(StandardNames.FqNames.iterable);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(classId(Iterable.class), classId2, new ClassId(classId2.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false));
        ClassId classId3 = companion.topLevel(StandardNames.FqNames.iterator);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(classId(Iterator.class), classId3, new ClassId(classId3.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterator, classId3.getPackageFqName()), false));
        ClassId classId4 = companion.topLevel(StandardNames.FqNames.collection);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(classId(Collection.class), classId4, new ClassId(classId4.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableCollection, classId4.getPackageFqName()), false));
        ClassId classId5 = companion.topLevel(StandardNames.FqNames.list);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(classId(List.class), classId5, new ClassId(classId5.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableList, classId5.getPackageFqName()), false));
        ClassId classId6 = companion.topLevel(StandardNames.FqNames.set);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(classId(Set.class), classId6, new ClassId(classId6.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableSet, classId6.getPackageFqName()), false));
        ClassId classId7 = companion.topLevel(StandardNames.FqNames.listIterator);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(classId(ListIterator.class), classId7, new ClassId(classId7.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableListIterator, classId7.getPackageFqName()), false));
        FqName fqName = StandardNames.FqNames.map;
        ClassId classId8 = companion.topLevel(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(classId(Map.class), classId8, new ClassId(classId8.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMap, classId8.getPackageFqName()), false));
        ClassId createNestedClassId = companion.topLevel(fqName).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        List<PlatformMutabilityMapping> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(classId(Map.Entry.class), createNestedClassId, new ClassId(createNestedClassId.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMapEntry, createNestedClassId.getPackageFqName()), false))});
        mutabilityMappings = listOf;
        addTopLevel(Object.class, StandardNames.FqNames.any);
        addTopLevel(String.class, StandardNames.FqNames.f1525string);
        addTopLevel(CharSequence.class, StandardNames.FqNames.charSequence);
        add(classId(Throwable.class), companion.topLevel(StandardNames.FqNames.throwable));
        addTopLevel(Cloneable.class, StandardNames.FqNames.cloneable);
        addTopLevel(Number.class, StandardNames.FqNames.number);
        add(classId(Comparable.class), companion.topLevel(StandardNames.FqNames.comparable));
        addTopLevel(Enum.class, StandardNames.FqNames._enum);
        add(classId(Annotation.class), companion.topLevel(StandardNames.FqNames.annotation));
        for (PlatformMutabilityMapping platformMutabilityMapping8 : listOf) {
            INSTANCE.getClass();
            ClassId component1 = platformMutabilityMapping8.component1();
            ClassId component2 = platformMutabilityMapping8.component2();
            ClassId component3 = platformMutabilityMapping8.component3();
            add(component1, component2);
            addKotlinToJava(component3.asSingleFqName(), component1);
            mutableToReadOnlyClassId.put(component3, component2);
            readOnlyToMutableClassId.put(component2, component3);
            FqName asSingleFqName = component2.asSingleFqName();
            FqName asSingleFqName2 = component3.asSingleFqName();
            mutableToReadOnly.put(component3.asSingleFqName().toUnsafe(), asSingleFqName);
            readOnlyToMutable.put(asSingleFqName.toUnsafe(), asSingleFqName2);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            wrapperFqName.getClass();
            ClassId classId9 = companion2.topLevel(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            ClassId classId10 = companion2.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            javaToKotlinClassMap.getClass();
            add(classId9, classId10);
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId12 = ClassId.Companion.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject"));
            ClassId createNestedClassId2 = classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            javaToKotlinClassMap2.getClass();
            add(classId12, createNestedClassId2);
        }
        for (int i = 0; i < 23; i++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId13 = ClassId.Companion.topLevel(new FqName(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "kotlin.jvm.functions.Function")));
            ClassId functionClassId = StandardNames.getFunctionClassId(i);
            javaToKotlinClassMap3.getClass();
            add(classId13, functionClassId);
            addKotlinToJava(new FqName(Boxes$$ExternalSyntheticOutline1.m(i, NUMBERED_K_FUNCTION_PREFIX, new StringBuilder())), K_FUNCTION_CLASS_ID);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            FqName fqName2 = new FqName(Boxes$$ExternalSyntheticOutline1.m(i2, NUMBERED_K_SUSPEND_FUNCTION_PREFIX, new StringBuilder()));
            ClassId classId14 = K_FUNCTION_CLASS_ID;
            javaToKotlinClassMap4.getClass();
            addKotlinToJava(fqName2, classId14);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName fqName3 = new FqName("kotlin.concurrent.atomics.AtomicInt");
        javaToKotlinClassMap5.getClass();
        addKotlinToJava(fqName3, classId(AtomicInteger.class));
        addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicLong"), classId(AtomicLong.class));
        addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicBoolean"), classId(AtomicBoolean.class));
        addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicReference"), classId(AtomicReference.class));
        addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicIntArray"), classId(AtomicIntegerArray.class));
        addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicLongArray"), classId(AtomicLongArray.class));
        addKotlinToJava(new FqName("kotlin.concurrent.atomics.AtomicArray"), classId(AtomicReferenceArray.class));
        addKotlinToJava(StandardNames.FqNames.nothing.toSafe(), classId(Void.class));
    }

    public static void add(ClassId classId, ClassId classId2) {
        javaToKotlin.put(classId.asSingleFqName().toUnsafe(), classId2);
        addKotlinToJava(classId2.asSingleFqName(), classId);
    }

    public static void addKotlinToJava(FqName fqName, ClassId classId) {
        mappedKotlinClassFqNames.add(fqName);
        kotlinToJava.put(fqName.toUnsafe(), classId);
    }

    public static void addTopLevel(Class cls, FqNameUnsafe fqNameUnsafe) {
        add(classId(cls), ClassId.Companion.topLevel(fqNameUnsafe.toSafe()));
    }

    public static ClassId classId(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.Companion;
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            return companion.topLevel(new FqName(canonicalName));
        }
        ClassId classId = classId(declaringClass);
        Name identifier = Name.identifier(cls.getSimpleName());
        identifier.getClass();
        return classId.createNestedClassId(identifier);
    }

    public static boolean isKotlinFunctionWithBigArity(FqNameUnsafe fqNameUnsafe, String str, boolean z) {
        String asString = fqNameUnsafe.asString();
        if (StringsKt__StringsJVMKt.startsWith(asString, str, false)) {
            String substring = asString.substring(str.length());
            if (!StringsKt.startsWith$default(substring, '0')) {
                Integer intOrNull = StringsKt.toIntOrNull(substring);
                int i = z ? 22 : 23;
                if (intOrNull != null && intOrNull.intValue() >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.containsKey(fqNameUnsafe);
    }

    public final ClassId mapJavaToKotlin(FqName fqName) {
        fqName.getClass();
        return (ClassId) javaToKotlin.get(fqName.toUnsafe());
    }

    public final ClassId mapKotlinToJava(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return (isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_FUNCTION_PREFIX, false) || isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_SUSPEND_FUNCTION_PREFIX, true)) ? FUNCTION_N_CLASS_ID : (isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_FUNCTION_PREFIX, false) || isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_SUSPEND_FUNCTION_PREFIX, true)) ? K_FUNCTION_CLASS_ID : (ClassId) kotlinToJava.get(fqNameUnsafe);
    }

    public final FqName mutableToReadOnly(FqNameUnsafe fqNameUnsafe) {
        return (FqName) mutableToReadOnly.get(fqNameUnsafe);
    }

    public final FqName readOnlyToMutable(FqNameUnsafe fqNameUnsafe) {
        return (FqName) readOnlyToMutable.get(fqNameUnsafe);
    }

    public final boolean isMutable(ClassId classId) {
        return mutableToReadOnlyClassId.containsKey(classId);
    }
}
