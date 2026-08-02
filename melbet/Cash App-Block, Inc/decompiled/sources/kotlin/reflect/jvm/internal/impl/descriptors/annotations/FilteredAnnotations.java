package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class FilteredAnnotations implements Annotations {
    public final Annotations delegate;
    public final Function1 fqNameFilter;
    public final boolean isDefinitelyNewInference;

    public FilteredAnnotations(Annotations annotations, boolean z, Function1<? super FqName, Boolean> function1) {
        annotations.getClass();
        function1.getClass();
        this.delegate = annotations;
        this.isDefinitelyNewInference = z;
        this.fqNameFilter = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: findAnnotation */
    public AnnotationDescriptor mo4143findAnnotation(FqName fqName) {
        fqName.getClass();
        if (((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue()) {
            return this.delegate.mo4143findAnnotation(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        fqName.getClass();
        if (((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue()) {
            return this.delegate.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z;
        Annotations annotations = this.delegate;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                FqName fqName = it.next().getFqName();
                if (fqName != null && ((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return this.isDefinitelyNewInference ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.delegate) {
            FqName fqName = annotationDescriptor.getFqName();
            if (fqName != null && ((Boolean) this.fqNameFilter.invoke(fqName)).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(Annotations annotations, Function1<? super FqName, Boolean> function1) {
        this(annotations, false, function1);
        annotations.getClass();
        function1.getClass();
    }
}
