package kotlin.reflect.jvm.internal.types;

import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.StandardKTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class MutableCollectionKClassKt$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final KClass arg$0;
    public final FqName arg$1;

    public MutableCollectionKClassKt$$Lambda$0(KClass kClass, FqName fqName) {
        this.arg$0 = kClass;
        this.arg$1 = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KClass kClass;
        switch (this.$r8$classId) {
            case 0:
                KClass kClass2 = this.arg$0;
                FqName fqName = this.arg$1;
                MutableCollectionKClass mutableCollectionKClass = (MutableCollectionKClass) obj;
                mutableCollectionKClass.getClass();
                List typeParameters = kClass2.getTypeParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    KTypeParameterImpl kTypeParameterImpl = new KTypeParameterImpl(mutableCollectionKClass, ((KTypeParameterImpl) ((KTypeParameterBase) it.next())).name, (Intrinsics.areEqual(fqName, StandardNames.FqNames.mutableIterable) || Intrinsics.areEqual(fqName, StandardNames.FqNames.mutableIterator)) ? KVariance.OUT : KVariance.INVARIANT);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(StandardKTypes.NULLABLE_ANY);
                    listOf.getClass();
                    kTypeParameterImpl.upperBounds = listOf;
                    arrayList.add(kTypeParameterImpl);
                }
                return arrayList;
            default:
                FqName fqName2 = this.arg$1;
                KClass kClass3 = this.arg$0;
                MutableCollectionKClass mutableCollectionKClass2 = (MutableCollectionKClass) obj;
                mutableCollectionKClass2.getClass();
                if (Intrinsics.areEqual(fqName2, StandardNames.FqNames.mutableCollection)) {
                    KTypeProjection.INSTANCE.getClass();
                    KType typeOf = Reflection.typeOf(Iterable.class, KTypeProjection.star);
                    ReflectionFactory reflectionFactory = Reflection.factory;
                    kClass = ((AbstractKType) reflectionFactory.mutableCollectionType(typeOf)).getMutableCollectionClass();
                    if (kClass == null) {
                        throw new KotlinReflectionInternalError(SizeMode$EnumUnboxingLocalUtility.m(reflectionFactory, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (Intrinsics.areEqual(fqName2, StandardNames.FqNames.mutableList)) {
                    KTypeProjection.INSTANCE.getClass();
                    KType typeOf2 = Reflection.typeOf(Collection.class, KTypeProjection.star);
                    ReflectionFactory reflectionFactory2 = Reflection.factory;
                    kClass = ((AbstractKType) reflectionFactory2.mutableCollectionType(typeOf2)).getMutableCollectionClass();
                    if (kClass == null) {
                        throw new KotlinReflectionInternalError(SizeMode$EnumUnboxingLocalUtility.m(reflectionFactory2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (Intrinsics.areEqual(fqName2, StandardNames.FqNames.mutableSet)) {
                    KTypeProjection.INSTANCE.getClass();
                    KType typeOf3 = Reflection.typeOf(Collection.class, KTypeProjection.star);
                    ReflectionFactory reflectionFactory3 = Reflection.factory;
                    kClass = ((AbstractKType) reflectionFactory3.mutableCollectionType(typeOf3)).getMutableCollectionClass();
                    if (kClass == null) {
                        throw new KotlinReflectionInternalError(SizeMode$EnumUnboxingLocalUtility.m(reflectionFactory3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (Intrinsics.areEqual(fqName2, StandardNames.FqNames.mutableListIterator)) {
                    KTypeProjection.INSTANCE.getClass();
                    KType typeOf4 = Reflection.typeOf(Iterator.class, KTypeProjection.star);
                    ReflectionFactory reflectionFactory4 = Reflection.factory;
                    kClass = ((AbstractKType) reflectionFactory4.mutableCollectionType(typeOf4)).getMutableCollectionClass();
                    if (kClass == null) {
                        throw new KotlinReflectionInternalError(SizeMode$EnumUnboxingLocalUtility.m(reflectionFactory4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    kClass = null;
                }
                List<KTypeParameterBase> list = mutableCollectionKClass2.typeParameters;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (KTypeParameterBase kTypeParameterBase : list) {
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    AbstractKType createType$default = KClassifiers.createType$default(kTypeParameterBase, null, 7);
                    companion.getClass();
                    arrayList2.add(KTypeProjection.Companion.invariant(createType$default));
                }
                List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new KClass[]{kClass3, kClass});
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10));
                Iterator it2 = filterNotNull.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(KClassifiers.createType$default((KClass) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }

    public MutableCollectionKClassKt$$Lambda$0(FqName fqName, KClass kClass) {
        this.arg$1 = fqName;
        this.arg$0 = kClass;
    }
}
