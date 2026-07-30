package cn.hutool.core.annotation.scanner;

import cn.hutool.core.collection.CollUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class x0 extends f {
    public x0(boolean z7, boolean z8, Predicate<Class<?>> predicate, Set<Class<?>> set) {
        super(z7, z8, predicate, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Class cls) {
        return true;
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotations(AnnotatedElement annotatedElement) {
        return q.a(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.f
    protected Annotation[] getAnnotationsFromTargetClass(AnnotatedElement annotatedElement, int i8, Class<?> cls) {
        return cls.getAnnotations();
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotationsIfSupport(AnnotatedElement annotatedElement) {
        return q.b(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.f
    protected Class<?> getClassFormAnnotatedElement(AnnotatedElement annotatedElement) {
        return (Class) annotatedElement;
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ void scanIfSupport(BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        q.d(this, biConsumer, annotatedElement, predicate);
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public boolean support(AnnotatedElement annotatedElement) {
        return annotatedElement instanceof Class;
    }

    public x0() {
        this(true, true, new Predicate() { // from class: cn.hutool.core.annotation.scanner.w0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$0;
                lambda$new$0 = x0.lambda$new$0((Class) obj);
                return lambda$new$0;
            }
        }, CollUtil.newLinkedHashSet(new Class[0]));
    }

    @Override // cn.hutool.core.annotation.scanner.f
    public x0 setIncludeInterfaces(boolean z7) {
        return (x0) super.setIncludeInterfaces(z7);
    }

    @Override // cn.hutool.core.annotation.scanner.f
    public x0 setIncludeSuperClass(boolean z7) {
        return (x0) super.setIncludeSuperClass(z7);
    }
}
