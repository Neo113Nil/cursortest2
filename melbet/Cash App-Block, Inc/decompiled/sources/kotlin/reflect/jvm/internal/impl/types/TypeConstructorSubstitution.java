package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes9.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    public static final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    public static final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public TypeProjection mo4156get(KotlinType kotlinType) {
        kotlinType.getClass();
        return get(kotlinType.getConstructor());
    }

    public abstract TypeProjection get(TypeConstructor typeConstructor);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createByConstructorsMap(map, z);
        }

        public final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
            typeConstructor.getClass();
            list.getClass();
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            parameters.getClass();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.isCapturedFromOuterDeclaration()) {
                return new IndexedParametersSubstitution(parameters, list);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            parameters2.getClass();
            List<TypeParameterDescriptor> list2 = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
            }
            return createByConstructorsMap$default(this, MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList, list)), false, 2, null);
        }

        public final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
            map.getClass();
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        public final TypeConstructorSubstitution createByConstructorsMap(final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z) {
            map.getClass();
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection get(TypeConstructor typeConstructor) {
                    typeConstructor.getClass();
                    return (TypeProjection) map.get(typeConstructor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return map.isEmpty();
                }
            };
        }

        public final TypeSubstitution create(KotlinType kotlinType) {
            kotlinType.getClass();
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }
    }
}
