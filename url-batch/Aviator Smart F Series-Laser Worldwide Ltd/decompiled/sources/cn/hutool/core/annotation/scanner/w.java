package cn.hutool.core.annotation.scanner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class w implements r {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$0(Annotation annotation) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Predicate lambda$scan$1(Predicate predicate) {
        return new Predicate() { // from class: cn.hutool.core.annotation.scanner.v
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$0;
                lambda$null$0 = w.lambda$null$0((Annotation) obj);
                return lambda$null$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scan$2(BiConsumer biConsumer, Annotation annotation) {
        biConsumer.accept(0, annotation);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotations(AnnotatedElement annotatedElement) {
        return q.a(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotationsIfSupport(AnnotatedElement annotatedElement) {
        return q.b(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public void scan(final BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate) {
        Stream of;
        Stream filter;
        Predicate a8 = cn.hutool.core.annotation.r0.a(cn.hutool.core.util.e0.defaultIfNull(predicate, (Function<Predicate<Annotation>, ? extends Predicate<Annotation>>) new Function() { // from class: cn.hutool.core.annotation.scanner.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Predicate lambda$scan$1;
                lambda$scan$1 = w.lambda$scan$1((Predicate) obj);
                return lambda$scan$1;
            }
        }));
        of = Stream.of((Object[]) annotatedElement.getAnnotations());
        filter = of.filter(a8);
        filter.forEach(new Consumer() { // from class: cn.hutool.core.annotation.scanner.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                w.lambda$scan$2(biConsumer, (Annotation) obj);
            }
        });
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ void scanIfSupport(BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        q.d(this, biConsumer, annotatedElement, predicate);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public boolean support(AnnotatedElement annotatedElement) {
        return cn.hutool.core.util.e0.isNotNull(annotatedElement);
    }
}
