package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class Annotations$Companion$EMPTY$1 implements Annotations {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ AnnotationDescriptor mo4143findAnnotation(FqName fqName) {
        return (AnnotationDescriptor) findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public /* bridge */ boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        EmptyList.INSTANCE.getClass();
        return EmptyIterator.INSTANCE;
    }

    public String toString() {
        return "EMPTY";
    }

    public Void findAnnotation(FqName fqName) {
        fqName.getClass();
        return null;
    }
}
