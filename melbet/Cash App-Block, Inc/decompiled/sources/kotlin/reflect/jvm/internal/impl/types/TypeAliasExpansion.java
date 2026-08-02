package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes9.dex */
public final class TypeAliasExpansion {
    public static final Companion Companion = new Companion(null);
    public final List arguments;
    public final TypeAliasDescriptor descriptor;
    public final Map mapping;
    public final TypeAliasExpansion parent;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final TypeAliasExpansion create(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list) {
            typeAliasDescriptor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            parameters.getClass();
            List<TypeParameterDescriptor> list2 = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, list, MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList, list)), null);
        }
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.parent = typeAliasExpansion;
        this.descriptor = typeAliasDescriptor;
        this.arguments = list;
        this.mapping = map;
    }

    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public final TypeAliasDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final TypeProjection getReplacement(TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return (TypeProjection) this.mapping.get(mo4153getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(TypeAliasDescriptor typeAliasDescriptor) {
        typeAliasDescriptor.getClass();
        if (Intrinsics.areEqual(this.descriptor, typeAliasDescriptor)) {
            return true;
        }
        TypeAliasExpansion typeAliasExpansion = this.parent;
        return typeAliasExpansion != null ? typeAliasExpansion.isRecursion(typeAliasDescriptor) : false;
    }
}
