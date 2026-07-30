package cn.hutool.core.annotation.scanner;

import cn.hutool.core.map.multi.ListValueMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class g0 implements r {
    private final r elementScanner;
    private final r metaScanner;
    private final r methodScanner;
    private final r typeScanner;

    public g0(boolean z7, boolean z8, boolean z9) {
        this.metaScanner = z7 ? new o0() : new x();
        this.typeScanner = new x0(z8, z9, new Predicate() { // from class: cn.hutool.core.annotation.scanner.b0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$0;
                lambda$new$0 = g0.lambda$new$0((Class) obj);
                return lambda$new$0;
            }
        }, Collections.emptySet());
        this.methodScanner = new v0(z8, z9, new Predicate() { // from class: cn.hutool.core.annotation.scanner.c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$1;
                lambda$new$1 = g0.lambda$new$1((Class) obj);
                return lambda$new$1;
            }
        }, Collections.emptySet());
        this.elementScanner = new w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Class cls) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$1(Class cls) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$2(Annotation annotation) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$5(BiConsumer biConsumer, Integer num, Predicate predicate, Annotation annotation) {
        biConsumer.accept(num, annotation);
        this.metaScanner.scan(biConsumer, annotation.annotationType(), predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Predicate lambda$scan$3(Predicate predicate) {
        return new Predicate() { // from class: cn.hutool.core.annotation.scanner.z
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$2;
                lambda$null$2 = g0.lambda$null$2((Annotation) obj);
                return lambda$null$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scanElements$4(Predicate predicate, ListValueMap listValueMap, Integer num, Annotation annotation) {
        boolean test;
        test = predicate.test(annotation);
        if (test) {
            listValueMap.lambda$null$0(num, annotation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scanElements$6(final BiConsumer biConsumer, final Predicate predicate, final Integer num, List list) {
        list.forEach(new Consumer() { // from class: cn.hutool.core.annotation.scanner.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                g0.this.lambda$null$5(biConsumer, num, predicate, (Annotation) obj);
            }
        });
    }

    private void scanElements(r rVar, final BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, final Predicate<Annotation> predicate) {
        final ListValueMap listValueMap = new ListValueMap(new LinkedHashMap());
        rVar.scan(new BiConsumer() { // from class: cn.hutool.core.annotation.scanner.d0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.lambda$scanElements$4(predicate, listValueMap, (Integer) obj, (Annotation) obj2);
            }
        }, annotatedElement, predicate);
        listValueMap.forEach(new BiConsumer() { // from class: cn.hutool.core.annotation.scanner.e0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.this.lambda$scanElements$6(biConsumer, predicate, (Integer) obj, (List) obj2);
            }
        });
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
    public void scan(BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate) {
        Predicate<Annotation> a8 = cn.hutool.core.annotation.r0.a(cn.hutool.core.util.e0.defaultIfNull(predicate, (Function<Predicate<Annotation>, ? extends Predicate<Annotation>>) new Function() { // from class: cn.hutool.core.annotation.scanner.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Predicate lambda$scan$3;
                lambda$scan$3 = g0.lambda$scan$3((Predicate) obj);
                return lambda$scan$3;
            }
        }));
        if (cn.hutool.core.util.e0.isNull(annotatedElement)) {
            return;
        }
        if (annotatedElement instanceof Class) {
            scanElements(this.typeScanner, biConsumer, annotatedElement, a8);
        } else if (annotatedElement instanceof Method) {
            scanElements(this.methodScanner, biConsumer, annotatedElement, a8);
        } else {
            scanElements(this.elementScanner, biConsumer, annotatedElement, a8);
        }
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
