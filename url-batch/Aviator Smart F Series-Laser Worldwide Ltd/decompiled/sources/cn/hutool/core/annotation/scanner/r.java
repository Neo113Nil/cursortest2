package cn.hutool.core.annotation.scanner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public interface r {
    public static final r NOTHING = new x();
    public static final r DIRECTLY = new g0(false, false, false);
    public static final r DIRECTLY_AND_META_ANNOTATION = new g0(true, false, false);
    public static final r SUPERCLASS = new g0(false, true, false);
    public static final r SUPERCLASS_AND_META_ANNOTATION = new g0(true, true, false);
    public static final r INTERFACE = new g0(false, false, true);
    public static final r INTERFACE_AND_META_ANNOTATION = new g0(true, false, true);
    public static final r TYPE_HIERARCHY = new g0(false, true, true);
    public static final r TYPE_HIERARCHY_AND_META_ANNOTATION = new g0(true, true, true);

    List<Annotation> getAnnotations(AnnotatedElement annotatedElement);

    List<Annotation> getAnnotationsIfSupport(AnnotatedElement annotatedElement);

    void scan(BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate);

    void scanIfSupport(BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate);

    boolean support(AnnotatedElement annotatedElement);
}
