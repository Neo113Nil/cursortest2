package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$$Lambda$1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TakeWhileSequence$iterator$1;

/* loaded from: classes9.dex */
public final class CompositeAnnotations implements Annotations {
    public final List delegates;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(Annotations... annotationsArr) {
        this((List<? extends Annotations>) ArraysKt___ArraysKt.toList(annotationsArr));
        annotationsArr.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public AnnotationDescriptor mo4143findAnnotation(FqName fqName) {
        fqName.getClass();
        return (AnnotationDescriptor) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt.asSequence(this.delegates), new PackageFragmentProviderImpl$$Lambda$1(fqName, 1)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        fqName.getClass();
        Iterator it = ((Iterable) CollectionsKt.asSequence(this.delegates).$this_lineSequence$inlined).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return new TakeWhileSequence$iterator$1(SequencesKt___SequencesKt.flatMap(CollectionsKt.asSequence(this.delegates), CompositeAnnotations$$Lambda$1.INSTANCE));
    }

    public CompositeAnnotations(List<? extends Annotations> list) {
        list.getClass();
        this.delegates = list;
    }
}
