package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes9.dex */
public final class AnnotationsKt {
    public static final Annotations composeAnnotations(Annotations annotations, Annotations annotations2) {
        annotations.getClass();
        annotations2.getClass();
        return annotations.isEmpty() ? annotations2 : annotations2.isEmpty() ? annotations : new CompositeAnnotations(annotations, annotations2);
    }
}
