package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class AnnotationsImpl implements Annotations {
    public final List annotations;

    public AnnotationsImpl(List<? extends AnnotationDescriptor> list) {
        list.getClass();
        this.annotations = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public /* bridge */ AnnotationDescriptor mo4143findAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public /* bridge */ boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.annotations.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return this.annotations.iterator();
    }

    public String toString() {
        return this.annotations.toString();
    }
}
