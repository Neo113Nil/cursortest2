package kotlin.reflect.jvm.internal.impl.builtins;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes3.dex */
public final class StandardNames {
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    public static final Name BACKING_FIELD;
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final Name BUILT_INS_PACKAGE_NAME;
    public static final Name CHAR_CODE;
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    public static final FqName CONCURRENT_ATOMICS_PACKAGE_FQ_NAME;
    public static final FqName CONCURRENT_PACKAGE_FQ_NAME;
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;
    public static final Name COROUTINE_SUSPENDED_NAME;
    public static final String DATA_CLASS_COMPONENT_PREFIX;
    public static final Name DATA_CLASS_COPY;
    public static final Name DEFAULT_IMPLS_CLASS_NAME;
    public static final Name DEFAULT_VALUE_PARAMETER;
    public static final FqName DYNAMIC_FQ_NAME;
    public static final Name ENUM_ENTRIES;
    public static final Name ENUM_VALUES;
    public static final Name ENUM_VALUE_OF;
    public static final Name EQUALS_NAME;
    public static final Name HASHCODE_NAME;
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;
    public static final StandardNames INSTANCE = new StandardNames();
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;
    public static final FqName KOTLIN_REFLECT_FQ_NAME;
    public static final Name MAIN;
    public static final Name MAP_ENTRY_KEY;
    public static final Name MAP_ENTRY_VALUE;
    public static final Name NAME;
    public static final Name NEXT_CHAR;
    public static final List<String> PREFIXES;
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    public static final FqName RESULT_FQ_NAME;
    public static final FqName SEQUENCES_PACKAGE_FQ_NAME;
    public static final FqName TEXT_PACKAGE_FQ_NAME;
    public static final Name TO_STRING_NAME;

    public static final class FqNames {
        public static final FqName accessibleLateinitPropertyLiteral;
        public static final FqName annotation;
        public static final FqName annotationRetention;
        public static final FqName annotationTarget;
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;
        public static final FqName atomicArray;
        public static final FqName atomicBoolean;
        public static final FqName atomicInt;
        public static final FqName atomicIntArray;
        public static final FqName atomicLong;
        public static final FqName atomicLongArray;
        public static final FqName atomicReference;
        public static final FqName collection;
        public static final FqName contextFunctionTypeParams;
        public static final FqName deprecated;
        public static final FqName deprecatedSinceKotlin;
        public static final FqName deprecationLevel;
        public static final FqName extensionFunctionType;
        public static final FqNameUnsafe findAssociatedObject;
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;
        public static final FqNameUnsafe intRange;
        public static final FqName introducedAt;
        public static final FqName iterable;
        public static final FqName iterator;
        public static final FqNameUnsafe kCallable;
        public static final FqNameUnsafe kClass;
        public static final FqNameUnsafe kDeclarationContainer;
        public static final FqNameUnsafe kMutableProperty0;
        public static final FqNameUnsafe kMutableProperty1;
        public static final FqNameUnsafe kMutableProperty2;
        public static final FqNameUnsafe kMutablePropertyFqName;
        public static final ClassId kProperty;
        public static final FqNameUnsafe kProperty0;
        public static final FqNameUnsafe kProperty1;
        public static final FqNameUnsafe kProperty2;
        public static final FqNameUnsafe kPropertyFqName;
        public static final FqNameUnsafe kType;
        public static final FqName list;
        public static final FqName listIterator;
        public static final FqNameUnsafe longRange;
        public static final FqName map;
        public static final FqName mapEntry;
        public static final FqName mustBeDocumented;
        public static final FqName mutableCollection;
        public static final FqName mutableIterable;
        public static final FqName mutableIterator;
        public static final FqName mutableList;
        public static final FqName mutableListIterator;
        public static final FqName mutableMap;
        public static final FqName mutableMapEntry;
        public static final FqName mutableSet;
        public static final FqName parameterName;
        public static final ClassId parameterNameClassId;
        public static final FqName platformDependent;
        public static final ClassId platformDependentClassId;
        public static final Set<Name> primitiveArrayTypeShortNames;
        public static final Set<Name> primitiveTypeShortNames;
        public static final FqName publishedApi;
        public static final FqName repeatable;
        public static final ClassId repeatableClassId;
        public static final FqName replaceWith;
        public static final FqName retention;
        public static final ClassId retentionClassId;
        public static final FqName set;
        public static final FqName target;
        public static final ClassId targetClassId;
        public static final ClassId uByte;
        public static final FqName uByteArrayFqName;
        public static final FqName uByteFqName;
        public static final ClassId uInt;
        public static final FqName uIntArrayFqName;
        public static final FqName uIntFqName;
        public static final ClassId uLong;
        public static final FqName uLongArrayFqName;
        public static final FqName uLongFqName;
        public static final ClassId uShort;
        public static final FqName uShortArrayFqName;
        public static final FqName uShortFqName;
        public static final FqName unsafeVariance;
        public static final FqNames INSTANCE = new FqNames();
        public static final FqNameUnsafe any = fqNameUnsafe("Any");
        public static final FqNameUnsafe nothing = fqNameUnsafe("Nothing");
        public static final FqNameUnsafe cloneable = fqNameUnsafe("Cloneable");
        public static final FqName suppress = fqName("Suppress");
        public static final FqNameUnsafe unit = fqNameUnsafe("Unit");
        public static final FqNameUnsafe charSequence = fqNameUnsafe("CharSequence");

        /* renamed from: string, reason: collision with root package name */
        public static final FqNameUnsafe f1525string = fqNameUnsafe("String");

        /* renamed from: array, reason: collision with root package name */
        public static final FqNameUnsafe f1524array = fqNameUnsafe("Array");
        public static final FqNameUnsafe _boolean = fqNameUnsafe("Boolean");
        public static final FqNameUnsafe _char = fqNameUnsafe("Char");
        public static final FqNameUnsafe _byte = fqNameUnsafe("Byte");
        public static final FqNameUnsafe _short = fqNameUnsafe("Short");
        public static final FqNameUnsafe _int = fqNameUnsafe("Int");
        public static final FqNameUnsafe _long = fqNameUnsafe("Long");
        public static final FqNameUnsafe _float = fqNameUnsafe("Float");
        public static final FqNameUnsafe _double = fqNameUnsafe("Double");
        public static final FqNameUnsafe number = fqNameUnsafe("Number");
        public static final FqNameUnsafe _enum = fqNameUnsafe("Enum");
        public static final FqNameUnsafe functionSupertype = fqNameUnsafe("Function");
        public static final FqName throwable = fqName("Throwable");
        public static final FqName comparable = fqName("Comparable");

        static {
            FqName fqName = StandardNames.RANGES_PACKAGE_FQ_NAME;
            Name identifier = Name.identifier("IntRange");
            identifier.getClass();
            intRange = fqName.child(identifier).toUnsafe();
            Name identifier2 = Name.identifier("LongRange");
            identifier2.getClass();
            longRange = fqName.child(identifier2).toUnsafe();
            deprecated = fqName("Deprecated");
            deprecatedSinceKotlin = fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqName("DeprecationLevel");
            replaceWith = fqName("ReplaceWith");
            extensionFunctionType = fqName("ExtensionFunctionType");
            contextFunctionTypeParams = fqName("ContextFunctionTypeParams");
            FqName fqName2 = fqName("ParameterName");
            parameterName = fqName2;
            ClassId.Companion companion = ClassId.Companion;
            parameterNameClassId = companion.topLevel(fqName2);
            annotation = fqName("Annotation");
            FqName annotationName = annotationName("Target");
            target = annotationName;
            targetClassId = companion.topLevel(annotationName);
            annotationTarget = annotationName("AnnotationTarget");
            annotationRetention = annotationName("AnnotationRetention");
            FqName annotationName2 = annotationName("Retention");
            retention = annotationName2;
            retentionClassId = companion.topLevel(annotationName2);
            FqName annotationName3 = annotationName("Repeatable");
            repeatable = annotationName3;
            repeatableClassId = companion.topLevel(annotationName3);
            mustBeDocumented = annotationName("MustBeDocumented");
            unsafeVariance = fqName("UnsafeVariance");
            publishedApi = fqName("PublishedApi");
            accessibleLateinitPropertyLiteral = BalanceFeedKt$$ExternalSyntheticOutline0.m("AccessibleLateinitPropertyLiteral", StandardNames.KOTLIN_INTERNAL_FQ_NAME);
            FqName fqName3 = new FqName("kotlin.internal.PlatformDependent");
            platformDependent = fqName3;
            platformDependentClassId = companion.topLevel(fqName3);
            introducedAt = fqName("IntroducedAt");
            iterator = collectionsFqName("Iterator");
            iterable = collectionsFqName("Iterable");
            collection = collectionsFqName("Collection");
            list = collectionsFqName("List");
            listIterator = collectionsFqName("ListIterator");
            set = collectionsFqName("Set");
            FqName collectionsFqName = collectionsFqName("Map");
            map = collectionsFqName;
            mapEntry = BalanceFeedKt$$ExternalSyntheticOutline0.m("Entry", collectionsFqName);
            mutableIterator = collectionsFqName("MutableIterator");
            mutableIterable = collectionsFqName("MutableIterable");
            mutableCollection = collectionsFqName("MutableCollection");
            mutableList = collectionsFqName("MutableList");
            mutableListIterator = collectionsFqName("MutableListIterator");
            mutableSet = collectionsFqName("MutableSet");
            FqName collectionsFqName2 = collectionsFqName("MutableMap");
            mutableMap = collectionsFqName2;
            mutableMapEntry = BalanceFeedKt$$ExternalSyntheticOutline0.m("MutableEntry", collectionsFqName2);
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe reflect = reflect("KProperty");
            kPropertyFqName = reflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            kProperty = companion.topLevel(reflect.toSafe());
            kDeclarationContainer = reflect("KDeclarationContainer");
            findAssociatedObject = reflect("findAssociatedObject");
            FqName fqName4 = fqName("UByte");
            uByteFqName = fqName4;
            FqName fqName5 = fqName("UShort");
            uShortFqName = fqName5;
            FqName fqName6 = fqName("UInt");
            uIntFqName = fqName6;
            FqName fqName7 = fqName("ULong");
            uLongFqName = fqName7;
            uByte = companion.topLevel(fqName4);
            uShort = companion.topLevel(fqName5);
            uInt = companion.topLevel(fqName6);
            uLong = companion.topLevel(fqName7);
            uByteArrayFqName = fqName("UByteArray");
            uShortArrayFqName = fqName("UShortArray");
            uIntArrayFqName = fqName("UIntArray");
            uLongArrayFqName = fqName("ULongArray");
            atomicInt = concurrentAtomics("AtomicInt");
            atomicLong = concurrentAtomics("AtomicLong");
            atomicBoolean = concurrentAtomics("AtomicBoolean");
            atomicReference = concurrentAtomics("AtomicReference");
            atomicIntArray = concurrentAtomics("AtomicIntArray");
            atomicLongArray = concurrentAtomics("AtomicLongArray");
            atomicArray = concurrentAtomics("AtomicArray");
            HashSet newHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                newHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = newHashSetWithExpectedSize;
            HashSet newHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                newHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = newHashSetWithExpectedSize2;
            HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames = INSTANCE;
                String asString = primitiveType3.getTypeName().asString();
                asString.getClass();
                fqNames.getClass();
                newHashMapWithExpectedSize.put(fqNameUnsafe(asString), primitiveType3);
            }
            fqNameToPrimitiveType = newHashMapWithExpectedSize;
            HashMap newHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String asString2 = primitiveType4.getArrayTypeName().asString();
                asString2.getClass();
                fqNames2.getClass();
                newHashMapWithExpectedSize2.put(fqNameUnsafe(asString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = newHashMapWithExpectedSize2;
        }

        public static FqName annotationName(String str) {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m(str, StandardNames.ANNOTATION_PACKAGE_FQ_NAME);
        }

        public static FqName collectionsFqName(String str) {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m(str, StandardNames.COLLECTIONS_PACKAGE_FQ_NAME);
        }

        public static FqName concurrentAtomics(String str) {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m(str, StandardNames.CONCURRENT_ATOMICS_PACKAGE_FQ_NAME);
        }

        public static FqName fqName(String str) {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m(str, StandardNames.BUILT_INS_PACKAGE_FQ_NAME);
        }

        public static FqNameUnsafe fqNameUnsafe(String str) {
            return fqName(str).toUnsafe();
        }

        public static final FqNameUnsafe reflect(String str) {
            str.getClass();
            FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
            Name identifier = Name.identifier(str);
            identifier.getClass();
            return fqName.child(identifier).toUnsafe();
        }
    }

    static {
        Name identifier = Name.identifier("field");
        identifier.getClass();
        BACKING_FIELD = identifier;
        Name identifier2 = Name.identifier("value");
        identifier2.getClass();
        DEFAULT_VALUE_PARAMETER = identifier2;
        Name identifier3 = Name.identifier("values");
        identifier3.getClass();
        ENUM_VALUES = identifier3;
        Name identifier4 = Name.identifier("entries");
        identifier4.getClass();
        ENUM_ENTRIES = identifier4;
        Name identifier5 = Name.identifier("valueOf");
        identifier5.getClass();
        ENUM_VALUE_OF = identifier5;
        Name identifier6 = Name.identifier("copy");
        identifier6.getClass();
        DATA_CLASS_COPY = identifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name identifier7 = Name.identifier("hashCode");
        identifier7.getClass();
        HASHCODE_NAME = identifier7;
        Name identifier8 = Name.identifier("toString");
        identifier8.getClass();
        TO_STRING_NAME = identifier8;
        Name identifier9 = Name.identifier("equals");
        identifier9.getClass();
        EQUALS_NAME = identifier9;
        Name identifier10 = Name.identifier("code");
        identifier10.getClass();
        CHAR_CODE = identifier10;
        Name identifier11 = Name.identifier("name");
        identifier11.getClass();
        NAME = identifier11;
        Name identifier12 = Name.identifier("main");
        identifier12.getClass();
        MAIN = identifier12;
        Name identifier13 = Name.identifier("nextChar");
        identifier13.getClass();
        NEXT_CHAR = identifier13;
        Name identifier14 = Name.identifier("it");
        identifier14.getClass();
        IMPLICIT_LAMBDA_PARAMETER_NAME = identifier14;
        Name identifier15 = Name.identifier("count");
        identifier15.getClass();
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = identifier15;
        Name identifier16 = Name.identifier("DefaultImpls");
        identifier16.getClass();
        DEFAULT_IMPLS_CLASS_NAME = identifier16;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        Name identifier17 = Name.identifier("COROUTINE_SUSPENDED");
        identifier17.getClass();
        COROUTINE_SUSPENDED_NAME = identifier17;
        CONTINUATION_INTERFACE_FQ_NAME = BalanceFeedKt$$ExternalSyntheticOutline0.m("Continuation", fqName);
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name identifier18 = Name.identifier("kotlin");
        identifier18.getClass();
        BUILT_INS_PACKAGE_NAME = identifier18;
        Name identifier19 = Name.identifier("key");
        identifier19.getClass();
        MAP_ENTRY_KEY = identifier19;
        MAP_ENTRY_VALUE = identifier2;
        FqName fqName3 = FqName.Companion.topLevel(identifier18);
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName m = BalanceFeedKt$$ExternalSyntheticOutline0.m("annotation", fqName3);
        ANNOTATION_PACKAGE_FQ_NAME = m;
        FqName m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m("collections", fqName3);
        COLLECTIONS_PACKAGE_FQ_NAME = m2;
        SEQUENCES_PACKAGE_FQ_NAME = BalanceFeedKt$$ExternalSyntheticOutline0.m("sequences", fqName3);
        FqName m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m("ranges", fqName3);
        RANGES_PACKAGE_FQ_NAME = m3;
        TEXT_PACKAGE_FQ_NAME = BalanceFeedKt$$ExternalSyntheticOutline0.m("text", fqName3);
        FqName m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m("internal", fqName3);
        KOTLIN_INTERNAL_FQ_NAME = m4;
        FqName m5 = BalanceFeedKt$$ExternalSyntheticOutline0.m("concurrent", fqName3);
        CONCURRENT_PACKAGE_FQ_NAME = m5;
        FqName m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m("atomics", m5);
        CONCURRENT_ATOMICS_PACKAGE_FQ_NAME = m6;
        new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = ArraysKt___ArraysKt.toSet(new FqName[]{fqName3, m2, m3, m, fqName2, m4, fqName, m6});
    }

    public static final ClassId getFunctionClassId(int i) {
        FqName fqName = BUILT_INS_PACKAGE_FQ_NAME;
        Name identifier = Name.identifier(getFunctionName(i));
        identifier.getClass();
        return new ClassId(fqName, identifier);
    }

    public static final String getFunctionName(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Function");
    }

    public static final FqName getPrimitiveFqName(PrimitiveType primitiveType) {
        primitiveType.getClass();
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    public static final String getSuspendFunctionName(int i) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i;
    }

    public static final boolean isPrimitiveArray(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }
}
