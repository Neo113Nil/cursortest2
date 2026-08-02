package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes3.dex */
public final class StandardClassIdsKt {
    public static final ClassId access$annotationId(String str) {
        FqName base_annotation_package = StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_annotation_package, identifier);
    }

    public static final ClassId access$atomicsId(String str) {
        FqName base_concurrent_atomics_package = StandardClassIds.INSTANCE.getBASE_CONCURRENT_ATOMICS_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_concurrent_atomics_package, identifier);
    }

    public static final ClassId access$baseId(String str) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_kotlin_package, identifier);
    }

    public static final ClassId access$collectionsId(String str) {
        FqName base_collections_package = StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_collections_package, identifier);
    }

    public static final ClassId access$coroutinesId(String str) {
        FqName base_coroutines_package = StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_coroutines_package, identifier);
    }

    public static final ClassId access$enumsId(String str) {
        FqName base_enums_package = StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_enums_package, identifier);
    }

    public static final Map access$inverseMap(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap;
    }

    public static final ClassId access$primitiveArrayId(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName packageFqName = standardClassIds.getArray().getPackageFqName();
        Name identifier = Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier());
        identifier.getClass();
        return new ClassId(packageFqName, identifier);
    }

    public static final ClassId access$rangesId(String str) {
        FqName base_ranges_package = StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_ranges_package, identifier);
    }

    public static final ClassId access$reflectId(String str) {
        FqName base_reflect_package = StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_reflect_package, identifier);
    }

    public static final ClassId access$sequencesId(String str) {
        FqName base_sequences_package = StandardClassIds.INSTANCE.getBASE_SEQUENCES_PACKAGE();
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return new ClassId(base_sequences_package, identifier);
    }

    public static final ClassId access$unsignedId(ClassId classId) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name identifier = Name.identifier("U" + classId.getShortClassName().getIdentifier());
        identifier.getClass();
        return new ClassId(base_kotlin_package, identifier);
    }
}
