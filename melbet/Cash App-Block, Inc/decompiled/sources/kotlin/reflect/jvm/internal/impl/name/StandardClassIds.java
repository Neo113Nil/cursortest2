package kotlin.reflect.jvm.internal.impl.name;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;

/* loaded from: classes3.dex */
public final class StandardClassIds {
    public static final ClassId Any;
    public static final ClassId Array;
    public static final FqName BASE_ANNOTATION_PACKAGE;
    public static final FqName BASE_COLLECTIONS_PACKAGE;
    public static final FqName BASE_CONCURRENT_ATOMICS_PACKAGE;
    public static final FqName BASE_COROUTINES_PACKAGE;
    public static final FqName BASE_ENUMS_PACKAGE;
    public static final FqName BASE_KOTLIN_PACKAGE;
    public static final FqName BASE_RANGES_PACKAGE;
    public static final FqName BASE_REFLECT_PACKAGE;
    public static final FqName BASE_SEQUENCES_PACKAGE;
    public static final ClassId Boolean;
    public static final ClassId Enum;
    public static final ClassId EnumEntries;
    public static final StandardClassIds INSTANCE = new StandardClassIds();
    public static final ClassId Int;
    public static final ClassId KClass;
    public static final ClassId KFunction;
    public static final ClassId Long;
    public static final ClassId MutableList;
    public static final ClassId MutableMap;
    public static final ClassId MutableSet;
    public static final ClassId String;
    public static final ClassId UByte;
    public static final ClassId UInt;
    public static final ClassId ULong;
    public static final ClassId UShort;
    public static final ClassId Unit;
    public static final Set primitiveTypes;
    public static final Set unsignedTypes;

    static {
        FqName fqName = new FqName("kotlin");
        BASE_KOTLIN_PACKAGE = fqName;
        FqName m = BalanceFeedKt$$ExternalSyntheticOutline0.m("reflect", fqName);
        BASE_REFLECT_PACKAGE = m;
        Name identifier = Name.identifier("experimental");
        identifier.getClass();
        fqName.child(identifier);
        Name identifier2 = Name.identifier("collections");
        identifier2.getClass();
        FqName child = fqName.child(identifier2);
        BASE_COLLECTIONS_PACKAGE = child;
        BASE_SEQUENCES_PACKAGE = BalanceFeedKt$$ExternalSyntheticOutline0.m("sequences", fqName);
        FqName m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m("ranges", fqName);
        BASE_RANGES_PACKAGE = m2;
        FqName m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m("jvm", fqName);
        Name identifier3 = Name.identifier("js");
        identifier3.getClass();
        fqName.child(identifier3);
        Name identifier4 = Name.identifier("annotations");
        identifier4.getClass();
        FqName child2 = fqName.child(identifier4);
        Name identifier5 = Name.identifier("jvm");
        identifier5.getClass();
        child2.child(identifier5);
        Name identifier6 = Name.identifier("internal");
        identifier6.getClass();
        m3.child(identifier6);
        Name identifier7 = Name.identifier("functions");
        identifier7.getClass();
        m3.child(identifier7);
        FqName m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m("annotation", fqName);
        BASE_ANNOTATION_PACKAGE = m4;
        FqName m5 = BalanceFeedKt$$ExternalSyntheticOutline0.m("internal", fqName);
        Name identifier8 = Name.identifier("ir");
        identifier8.getClass();
        m5.child(identifier8);
        Name identifier9 = Name.identifier("coroutines");
        identifier9.getClass();
        FqName child3 = fqName.child(identifier9);
        BASE_COROUTINES_PACKAGE = child3;
        Name identifier10 = Name.identifier("intrinsics");
        identifier10.getClass();
        child3.child(identifier10);
        Name identifier11 = Name.identifier("enums");
        identifier11.getClass();
        BASE_ENUMS_PACKAGE = fqName.child(identifier11);
        Name identifier12 = Name.identifier("contracts");
        identifier12.getClass();
        fqName.child(identifier12);
        Name identifier13 = Name.identifier("concurrent");
        identifier13.getClass();
        FqName m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m("atomics", fqName.child(identifier13));
        BASE_CONCURRENT_ATOMICS_PACKAGE = m6;
        Name identifier14 = Name.identifier("test");
        identifier14.getClass();
        fqName.child(identifier14);
        Name identifier15 = Name.identifier("text");
        identifier15.getClass();
        fqName.child(identifier15);
        ArraysKt___ArraysKt.toSet(new FqName[]{fqName, child, m2, m4});
        ArraysKt___ArraysKt.toSet(new FqName[]{fqName, child, m2, m4, m, m5, child3, m6});
        StandardClassIdsKt.access$baseId("Nothing");
        Unit = StandardClassIdsKt.access$baseId("Unit");
        Any = StandardClassIdsKt.access$baseId("Any");
        Enum = StandardClassIdsKt.access$baseId("Enum");
        StandardClassIdsKt.access$baseId("Annotation");
        Array = StandardClassIdsKt.access$baseId("Array");
        ClassId access$baseId = StandardClassIdsKt.access$baseId("Boolean");
        Boolean = access$baseId;
        ClassId access$baseId2 = StandardClassIdsKt.access$baseId("Char");
        ClassId access$baseId3 = StandardClassIdsKt.access$baseId("Byte");
        ClassId access$baseId4 = StandardClassIdsKt.access$baseId("Short");
        ClassId access$baseId5 = StandardClassIdsKt.access$baseId("Int");
        Int = access$baseId5;
        ClassId access$baseId6 = StandardClassIdsKt.access$baseId("Long");
        Long = access$baseId6;
        ClassId access$baseId7 = StandardClassIdsKt.access$baseId("Float");
        ClassId access$baseId8 = StandardClassIdsKt.access$baseId("Double");
        UByte = StandardClassIdsKt.access$unsignedId(access$baseId3);
        UShort = StandardClassIdsKt.access$unsignedId(access$baseId4);
        UInt = StandardClassIdsKt.access$unsignedId(access$baseId5);
        ULong = StandardClassIdsKt.access$unsignedId(access$baseId6);
        StandardClassIdsKt.access$baseId("CharSequence");
        String = StandardClassIdsKt.access$baseId("String");
        StandardClassIdsKt.access$baseId("Throwable");
        StandardClassIdsKt.access$baseId("Cloneable");
        StandardClassIdsKt.access$reflectId("KProperty");
        StandardClassIdsKt.access$reflectId("KMutableProperty");
        StandardClassIdsKt.access$reflectId("KProperty0");
        StandardClassIdsKt.access$reflectId("KMutableProperty0");
        StandardClassIdsKt.access$reflectId("KProperty1");
        StandardClassIdsKt.access$reflectId("KMutableProperty1");
        StandardClassIdsKt.access$reflectId("KProperty2");
        StandardClassIdsKt.access$reflectId("KMutableProperty2");
        KFunction = StandardClassIdsKt.access$reflectId("KFunction");
        KClass = StandardClassIdsKt.access$reflectId("KClass");
        StandardClassIdsKt.access$reflectId("KCallable");
        StandardClassIdsKt.access$reflectId("KType");
        StandardClassIdsKt.access$sequencesId("Sequence");
        StandardClassIdsKt.access$baseId("Comparable");
        StandardClassIdsKt.access$baseId("Number");
        StandardClassIdsKt.access$baseId("Function");
        StandardClassIdsKt.access$coroutinesId("SuspendFunction");
        Set set = ArraysKt___ArraysKt.toSet(new ClassId[]{access$baseId, access$baseId2, access$baseId3, access$baseId4, access$baseId5, access$baseId6, access$baseId7, access$baseId8});
        primitiveTypes = set;
        ArraysKt___ArraysKt.toSet(new ClassId[]{access$baseId3, access$baseId4, access$baseId5, access$baseId6});
        Set set2 = set;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj : set2) {
            linkedHashMap.put(obj, StandardClassIdsKt.access$primitiveArrayId(((ClassId) obj).getShortClassName()));
        }
        StandardClassIdsKt.access$inverseMap(linkedHashMap);
        Set set3 = ArraysKt___ArraysKt.toSet(new ClassId[]{UByte, UShort, UInt, ULong});
        unsignedTypes = set3;
        Set set4 = set3;
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (Object obj2 : set4) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.access$primitiveArrayId(((ClassId) obj2).getShortClassName()));
        }
        StandardClassIdsKt.access$inverseMap(linkedHashMap2);
        Set set5 = primitiveTypes;
        Set set6 = unsignedTypes;
        LinkedHashSet plus = SetsKt___SetsKt.plus(set5, (Iterable) set6);
        ClassId classId = String;
        SetsKt___SetsKt.plus(plus, classId);
        StandardClassIdsKt.access$coroutinesId("Continuation");
        StandardClassIdsKt.access$collectionsId("Iterator");
        StandardClassIdsKt.access$collectionsId("Iterable");
        StandardClassIdsKt.access$collectionsId("Collection");
        StandardClassIdsKt.access$collectionsId("List");
        StandardClassIdsKt.access$collectionsId("ListIterator");
        StandardClassIdsKt.access$collectionsId("Set");
        ClassId access$collectionsId = StandardClassIdsKt.access$collectionsId("Map");
        StandardClassIdsKt.access$collectionsId("AbstractMap");
        StandardClassIdsKt.access$collectionsId("MutableIterator");
        StandardClassIdsKt.access$collectionsId("CharIterator");
        StandardClassIdsKt.access$collectionsId("MutableIterable");
        StandardClassIdsKt.access$collectionsId("MutableCollection");
        MutableList = StandardClassIdsKt.access$collectionsId("MutableList");
        StandardClassIdsKt.access$collectionsId("MutableListIterator");
        MutableSet = StandardClassIdsKt.access$collectionsId("MutableSet");
        ClassId access$collectionsId2 = StandardClassIdsKt.access$collectionsId("MutableMap");
        MutableMap = access$collectionsId2;
        Name identifier16 = Name.identifier("Entry");
        identifier16.getClass();
        access$collectionsId.createNestedClassId(identifier16);
        Name identifier17 = Name.identifier("MutableEntry");
        identifier17.getClass();
        access$collectionsId2.createNestedClassId(identifier17);
        StandardClassIdsKt.access$baseId("Result");
        StandardClassIdsKt.access$rangesId("IntRange");
        StandardClassIdsKt.access$rangesId("LongRange");
        StandardClassIdsKt.access$rangesId("CharRange");
        StandardClassIdsKt.access$annotationId("AnnotationRetention");
        StandardClassIdsKt.access$annotationId("AnnotationTarget");
        StandardClassIdsKt.access$baseId("DeprecationLevel");
        EnumEntries = StandardClassIdsKt.access$enumsId("EnumEntries");
        ClassId access$atomicsId = StandardClassIdsKt.access$atomicsId("AtomicBoolean");
        ClassId access$atomicsId2 = StandardClassIdsKt.access$atomicsId("AtomicInt");
        ClassId access$atomicsId3 = StandardClassIdsKt.access$atomicsId("AtomicLong");
        StandardClassIdsKt.access$atomicsId("AtomicReference");
        Pair pair = new Pair(Boolean, access$atomicsId);
        ClassId classId2 = Int;
        Pair pair2 = new Pair(classId2, access$atomicsId2);
        ClassId classId3 = Long;
        MapsKt__MapsKt.mapOf(pair, pair2, new Pair(classId3, access$atomicsId3));
        StandardClassIdsKt.access$atomicsId("AtomicArray");
        MapsKt__MapsKt.mapOf(new Pair(classId2, StandardClassIdsKt.access$atomicsId("AtomicIntArray")), new Pair(classId3, StandardClassIdsKt.access$atomicsId("AtomicLongArray")));
        SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(SetsKt___SetsKt.plus(set5, (Iterable) set6), classId), Unit), Any), Enum);
    }

    public final ClassId getArray() {
        return Array;
    }

    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    public final FqName getBASE_CONCURRENT_ATOMICS_PACKAGE() {
        return BASE_CONCURRENT_ATOMICS_PACKAGE;
    }

    public final FqName getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    public final FqName getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    public final FqName getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    public final FqName getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    public final FqName getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    public final FqName getBASE_SEQUENCES_PACKAGE() {
        return BASE_SEQUENCES_PACKAGE;
    }

    public final ClassId getEnumEntries() {
        return EnumEntries;
    }

    public final ClassId getKClass() {
        return KClass;
    }

    public final ClassId getKFunction() {
        return KFunction;
    }

    public final ClassId getMutableList() {
        return MutableList;
    }

    public final ClassId getMutableMap() {
        return MutableMap;
    }

    public final ClassId getMutableSet() {
        return MutableSet;
    }
}
