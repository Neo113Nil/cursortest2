package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes9.dex */
public final class TypeEnhancementUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JavaTypeQualifiers computeQualifiersForOverride(JavaTypeQualifiers javaTypeQualifiers, Collection<JavaTypeQualifiers> collection, boolean z, boolean z2, boolean z3) {
        NullabilityQualifier nullabilityQualifier;
        boolean z4;
        MutabilityQualifier mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2;
        javaTypeQualifiers.getClass();
        collection.getClass();
        Collection<JavaTypeQualifiers> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JavaTypeQualifiers javaTypeQualifiers2 = (JavaTypeQualifiers) it.next();
            Enum nullability = javaTypeQualifiers2.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers2.getNullability();
            if (nullability != null) {
                arrayList.add(nullability);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        NullabilityQualifier nullability2 = javaTypeQualifiers.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers.getNullability();
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        if (nullability2 != nullabilityQualifier2) {
            nullabilityQualifier2 = (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability2, z);
        }
        if (nullabilityQualifier2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullability3 = ((JavaTypeQualifiers) it2.next()).getNullability();
                if (nullability3 != null) {
                    arrayList2.add(nullability3);
                }
            }
            Set set2 = CollectionsKt.toSet(arrayList2);
            NullabilityQualifier nullability4 = javaTypeQualifiers.getNullability();
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
            if (nullability4 != nullabilityQualifier) {
                nullabilityQualifier = (NullabilityQualifier) select(set2, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability4, z);
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        NullabilityQualifier nullabilityQualifier3 = (nullabilityQualifier == null || z3 || (z2 && nullabilityQualifier == NullabilityQualifier.NULLABLE)) ? null : nullabilityQualifier;
        boolean z5 = nullabilityQualifier3 != null && nullabilityQualifier2 == null;
        if (nullabilityQualifier3 == NullabilityQualifier.NOT_NULL) {
            if (javaTypeQualifiers.isNullabilityQualifierForWarning() != z5 || !javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection2.isEmpty()) {
                    for (JavaTypeQualifiers javaTypeQualifiers3 : collection2) {
                        if (javaTypeQualifiers3.isNullabilityQualifierForWarning() != z5 || !javaTypeQualifiers3.getDefinitelyNotNull()) {
                        }
                    }
                }
            }
            z4 = true;
            ArrayList arrayList3 = new ArrayList();
            for (JavaTypeQualifiers javaTypeQualifiers4 : collection2) {
                MutabilityQualifier mutability = javaTypeQualifiers4.isMutabilityQualifierForWarning() ? null : javaTypeQualifiers4.getMutability();
                if (mutability != null) {
                    arrayList3.add(mutability);
                }
            }
            mutabilityQualifier = (MutabilityQualifier) select(CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.isMutabilityQualifierForWarning() ? null : javaTypeQualifiers.getMutability(), z);
            if (mutabilityQualifier != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it3 = collection2.iterator();
                while (it3.hasNext()) {
                    MutabilityQualifier mutability2 = ((JavaTypeQualifiers) it3.next()).getMutability();
                    if (mutability2 != null) {
                        arrayList4.add(mutability2);
                    }
                }
                mutabilityQualifier2 = (MutabilityQualifier) select(CollectionsKt.toSet(arrayList4), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z);
            } else {
                mutabilityQualifier2 = mutabilityQualifier;
            }
            return new JavaTypeQualifiers(nullabilityQualifier3, mutabilityQualifier2, z4, z5, mutabilityQualifier2 == null && mutabilityQualifier == null);
        }
        z4 = false;
        ArrayList arrayList32 = new ArrayList();
        while (r1.hasNext()) {
        }
        mutabilityQualifier = (MutabilityQualifier) select(CollectionsKt.toSet(arrayList32), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.isMutabilityQualifierForWarning() ? null : javaTypeQualifiers.getMutability(), z);
        if (mutabilityQualifier != null) {
        }
        return new JavaTypeQualifiers(nullabilityQualifier3, mutabilityQualifier2, z4, z5, mutabilityQualifier2 == null && mutabilityQualifier == null);
    }

    public static final boolean hasEnhancedNullability(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        FqName fqName = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        fqName.getClass();
        return typeSystemCommonBackendContext.hasAnnotation(kotlinTypeMarker, fqName);
    }

    public static final Object select(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set set2;
        if (!z) {
            if (r4 != null && (set2 = CollectionsKt.toSet(SetsKt___SetsKt.plus(set, r4))) != null) {
                set = set2;
            }
            return CollectionsKt.singleOrNull(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (Intrinsics.areEqual(r1, r2) && Intrinsics.areEqual(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }
}
