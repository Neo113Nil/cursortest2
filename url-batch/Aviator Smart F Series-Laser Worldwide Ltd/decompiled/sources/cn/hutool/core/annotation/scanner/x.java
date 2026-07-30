package cn.hutool.core.annotation.scanner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class x implements r {
    @Override // cn.hutool.core.annotation.scanner.r
    public List<Annotation> getAnnotations(AnnotatedElement annotatedElement) {
        return Collections.emptyList();
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotationsIfSupport(AnnotatedElement annotatedElement) {
        return q.b(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public void scan(BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate) {
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ void scanIfSupport(BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        q.d(this, biConsumer, annotatedElement, predicate);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public boolean support(AnnotatedElement annotatedElement) {
        return true;
    }
}
