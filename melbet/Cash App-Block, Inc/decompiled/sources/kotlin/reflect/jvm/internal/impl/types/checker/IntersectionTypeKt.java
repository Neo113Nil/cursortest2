package kotlin.reflect.jvm.internal.impl.types.checker;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType intersectTypes(Collection<? extends UnwrappedType> collection) {
        SimpleType lowerBound;
        collection.getClass();
        int size = collection.size();
        if (size == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Expected some types");
            return null;
        }
        if (size == 1) {
            return (UnwrappedType) CollectionsKt.single(collection);
        }
        Collection<? extends UnwrappedType> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
        boolean z = false;
        boolean z2 = false;
        for (UnwrappedType unwrappedType : collection2) {
            z = z || KotlinTypeKt.isError(unwrappedType);
            if (unwrappedType instanceof SimpleType) {
                lowerBound = (SimpleType) unwrappedType;
            } else {
                if (!(unwrappedType instanceof FlexibleType)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (DynamicTypesKt.isDynamic(unwrappedType)) {
                    return unwrappedType;
                }
                lowerBound = ((FlexibleType) unwrappedType).getLowerBound();
                z2 = true;
            }
            arrayList.add(lowerBound);
        }
        if (z) {
            return ErrorUtils.createErrorType(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, collection.toString());
        }
        if (!z2) {
            return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList2.add(FlexibleTypesKt.upperIfFlexible((UnwrappedType) it.next()));
        }
        TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
        return KotlinTypeFactory.flexibleType(typeIntersector.intersectTypes$descriptors(arrayList), typeIntersector.intersectTypes$descriptors(arrayList2));
    }
}
