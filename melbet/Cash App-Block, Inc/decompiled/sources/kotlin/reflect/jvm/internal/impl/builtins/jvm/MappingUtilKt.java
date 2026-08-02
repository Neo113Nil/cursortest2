package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class MappingUtilKt {
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        classDescriptor.getClass();
        classDescriptor2.getClass();
        classDescriptor.getDeclaredTypeParameters().size();
        classDescriptor2.getDeclaredTypeParameters().size();
        TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.Companion;
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        List<TypeParameterDescriptor> list = declaredTypeParameters;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
        }
        List<TypeParameterDescriptor> declaredTypeParameters2 = classDescriptor2.getDeclaredTypeParameters();
        declaredTypeParameters2.getClass();
        List<TypeParameterDescriptor> list2 = declaredTypeParameters2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            SimpleType defaultType = ((TypeParameterDescriptor) it2.next()).getDefaultType();
            defaultType.getClass();
            arrayList2.add(TypeUtilsKt.asTypeProjection(defaultType));
        }
        return TypeConstructorSubstitution.Companion.createByConstructorsMap$default(companion, MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList, arrayList2)), false, 2, null);
    }
}
