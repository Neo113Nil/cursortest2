package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final Annotations$Companion$EMPTY$1 EMPTY = new Annotations$Companion$EMPTY$1();

        public final Annotations create(List<? extends AnnotationDescriptor> list) {
            list.getClass();
            return list.isEmpty() ? EMPTY : new AnnotationsImpl(list);
        }

        public final Annotations getEMPTY() {
            return EMPTY;
        }
    }

    public static final class DefaultImpls {
        public static AnnotationDescriptor findAnnotation(Annotations annotations, FqName fqName) {
            AnnotationDescriptor annotationDescriptor;
            fqName.getClass();
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    annotationDescriptor = null;
                    break;
                }
                annotationDescriptor = it.next();
                if (Intrinsics.areEqual(annotationDescriptor.getFqName(), fqName)) {
                    break;
                }
            }
            return annotationDescriptor;
        }

        public static boolean hasAnnotation(Annotations annotations, FqName fqName) {
            fqName.getClass();
            return annotations.mo4143findAnnotation(fqName) != null;
        }
    }

    /* renamed from: findAnnotation */
    AnnotationDescriptor mo4143findAnnotation(FqName fqName);

    boolean hasAnnotation(FqName fqName);

    boolean isEmpty();
}
