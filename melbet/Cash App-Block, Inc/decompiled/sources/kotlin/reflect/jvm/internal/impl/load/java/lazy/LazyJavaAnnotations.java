package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes9.dex */
public final class LazyJavaAnnotations implements Annotations {
    public final MemoizedFunctionToNullable annotationDescriptors;
    public final JavaAnnotationOwner annotationOwner;
    public final boolean areAnnotationsFreshlySupported;
    public final LazyJavaResolverContext c;

    public LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z) {
        lazyJavaResolverContext.getClass();
        javaAnnotationOwner.getClass();
        this.c = lazyJavaResolverContext;
        this.annotationOwner = javaAnnotationOwner;
        this.areAnnotationsFreshlySupported = z;
        this.annotationDescriptors = lazyJavaResolverContext.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new TasksKt$awaitImpl$2$2(this, 8));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public AnnotationDescriptor mo4143findAnnotation(FqName fqName) {
        AnnotationDescriptor annotationDescriptor;
        fqName.getClass();
        JavaAnnotationOwner javaAnnotationOwner = this.annotationOwner;
        JavaAnnotation findAnnotation = javaAnnotationOwner.findAnnotation(fqName);
        return (findAnnotation == null || (annotationDescriptor = (AnnotationDescriptor) this.annotationDescriptors.invoke(findAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, javaAnnotationOwner, this.c) : annotationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public /* bridge */ boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        JavaAnnotationOwner javaAnnotationOwner = this.annotationOwner;
        return javaAnnotationOwner.getAnnotations().isEmpty() && !javaAnnotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        JavaAnnotationOwner javaAnnotationOwner = this.annotationOwner;
        return new FilteringSequence$iterator$1(new FilteringSequence(SequencesKt__SequencesKt.flatten(ArraysKt___ArraysKt.asSequence(new Sequence[]{SequencesKt___SequencesKt.map(CollectionsKt.asSequence(javaAnnotationOwner.getAnnotations()), this.annotationDescriptors), new LinesSequence(JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, javaAnnotationOwner, this.c), 6)})), false, new Perfs$$ExternalSyntheticLambda4(17)));
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i & 4) != 0 ? false : z);
    }
}
