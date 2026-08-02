package kotlin.reflect.jvm.internal.impl.types.checker;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import operations.array.Map$evaluateLogic$1;

/* loaded from: classes9.dex */
public final class TypeIntersector {
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public abstract class ResultNullability {
        public static final /* synthetic */ ResultNullability[] $VALUES;
        public static final ACCEPT_NULL ACCEPT_NULL;
        public static final NOT_NULL NOT_NULL;
        public static final START START;
        public static final UNKNOWN UNKNOWN;

        public final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL() {
                super("ACCEPT_NULL", 1);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                return ResultNullability.getResultNullability(unwrappedType);
            }
        }

        public final class NOT_NULL extends ResultNullability {
            public NOT_NULL() {
                super("NOT_NULL", 3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                return this;
            }
        }

        public final class START extends ResultNullability {
            public START() {
                super("START", 0);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                return ResultNullability.getResultNullability(unwrappedType);
            }
        }

        public final class UNKNOWN extends ResultNullability {
            public UNKNOWN() {
                super("UNKNOWN", 2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(UnwrappedType unwrappedType) {
                unwrappedType.getClass();
                ResultNullability resultNullability = ResultNullability.getResultNullability(unwrappedType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        static {
            START start = new START();
            START = start;
            ACCEPT_NULL accept_null = new ACCEPT_NULL();
            ACCEPT_NULL = accept_null;
            UNKNOWN unknown = new UNKNOWN();
            UNKNOWN = unknown;
            NOT_NULL not_null = new NOT_NULL();
            NOT_NULL = not_null;
            $VALUES = new ResultNullability[]{start, accept_null, unknown, not_null};
        }

        public static ResultNullability getResultNullability(UnwrappedType unwrappedType) {
            unwrappedType.getClass();
            return unwrappedType.isMarkedNullable() ? ACCEPT_NULL : (!((unwrappedType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) unwrappedType).getOriginal() instanceof StubTypeForBuilderInference)) && ((unwrappedType instanceof StubTypeForBuilderInference) || !NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType))) ? UNKNOWN : NOT_NULL;
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) $VALUES.clone();
        }

        public abstract ResultNullability combine(UnwrappedType unwrappedType);
    }

    public static final boolean access$isStrictSupertype(TypeIntersector typeIntersector, KotlinType kotlinType, KotlinType kotlinType2) {
        typeIntersector.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    public static ArrayList filterTypes(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SimpleType simpleType2 = (SimpleType) it2.next();
                    if (simpleType2 != simpleType) {
                        simpleType2.getClass();
                        simpleType.getClass();
                        if (((Boolean) function2.invoke(simpleType2, simpleType)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final SimpleType intersectTypes$descriptors(List<? extends SimpleType> list) {
        SimpleType createType;
        list.getClass();
        list.size();
        ArrayList arrayList = new ArrayList();
        for (SimpleType simpleType : list) {
            if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                supertypes.getClass();
                Collection<KotlinType> collection = supertypes;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                for (KotlinType kotlinType : collection) {
                    kotlinType.getClass();
                    SimpleType upperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        upperIfFlexible = upperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(upperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        ResultNullability resultNullability = ResultNullability.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            resultNullability = resultNullability.combine((UnwrappedType) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SimpleType simpleType2 = (SimpleType) it2.next();
            if (resultNullability == ResultNullability.NOT_NULL) {
                if (simpleType2 instanceof NewCapturedType) {
                    simpleType2 = SpecialTypesKt.withNotNullProjection((NewCapturedType) simpleType2);
                }
                simpleType2 = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleType2, false, 1, null);
            }
            linkedHashSet.add(simpleType2);
        }
        List<? extends SimpleType> list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((SimpleType) it3.next()).getAttributes());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
            return null;
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((TypeAttributes) next).intersect((TypeAttributes) it4.next());
        }
        TypeAttributes typeAttributes = (TypeAttributes) next;
        if (linkedHashSet.size() == 1) {
            createType = (SimpleType) CollectionsKt.single(linkedHashSet);
        } else {
            ArrayList filterTypes = filterTypes(linkedHashSet, new Map$evaluateLogic$1(2, this, TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 5));
            filterTypes.isEmpty();
            SimpleType findIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(filterTypes);
            if (findIntersectionType != null) {
                createType = findIntersectionType;
            } else {
                ArrayList filterTypes2 = filterTypes(filterTypes, new Map$evaluateLogic$1(2, NewKotlinTypeChecker.Companion.getDefault(), NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 6));
                filterTypes2.isEmpty();
                createType = filterTypes2.size() < 2 ? (SimpleType) CollectionsKt.single((Iterable) filterTypes2) : new IntersectionTypeConstructor(linkedHashSet).createType();
            }
        }
        return createType.replaceAttributes(typeAttributes);
    }
}
