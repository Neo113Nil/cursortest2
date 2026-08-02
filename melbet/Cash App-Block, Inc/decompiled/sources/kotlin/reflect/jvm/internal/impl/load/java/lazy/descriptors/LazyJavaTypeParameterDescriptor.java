package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final LazyJavaResolverContext c;
    public final JavaTypeParameter javaTypeParameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaTypeParameter javaTypeParameter, int i, DeclarationDescriptor declarationDescriptor) {
        super(lazyJavaResolverContext.getStorageManager(), declarationDescriptor, new LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i, SourceElement.NO_SOURCE, lazyJavaResolverContext.getComponents().getSupertypeLoopChecker());
        lazyJavaResolverContext.getClass();
        javaTypeParameter.getClass();
        declarationDescriptor.getClass();
        this.c = lazyJavaResolverContext;
        this.javaTypeParameter = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List processBoundsWithoutCycles(List list) {
        list.getClass();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        return lazyJavaResolverContext.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, list, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void reportSupertypeLoopError(KotlinType kotlinType) {
        kotlinType.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List resolveUpperBounds() {
        Collection<JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        boolean isEmpty = upperBounds.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (isEmpty) {
            SimpleType anyType = lazyJavaResolverContext.getModule().getBuiltIns().getAnyType();
            anyType.getClass();
            SimpleType nullableAnyType = lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType();
            nullableAnyType.getClass();
            return CollectionsKt__CollectionsJVMKt.listOf(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = this;
            arrayList.add(lazyJavaResolverContext.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, lazyJavaTypeParameterDescriptor, 3, null)));
            this = lazyJavaTypeParameterDescriptor;
        }
        return arrayList;
    }
}
