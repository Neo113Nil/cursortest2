package cn.hutool.core.annotation.scanner;

import cn.hutool.core.annotation.e1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    static {
        r rVar = r.NOTHING;
    }

    public static List a(r rVar, AnnotatedElement annotatedElement) {
        final ArrayList arrayList = new ArrayList();
        rVar.scan(new BiConsumer() { // from class: cn.hutool.core.annotation.scanner.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                arrayList.add((Annotation) obj2);
            }
        }, annotatedElement, null);
        return arrayList;
    }

    public static List b(r rVar, AnnotatedElement annotatedElement) {
        return rVar.support(annotatedElement) ? rVar.getAnnotations(annotatedElement) : Collections.emptyList();
    }

    public static void c(r rVar, BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        boolean test;
        Predicate a8 = cn.hutool.core.annotation.r0.a(cn.hutool.core.util.e0.defaultIfNull(predicate, (Function<Predicate, ? extends Predicate>) new Function() { // from class: cn.hutool.core.annotation.scanner.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return q.h((Predicate) obj);
            }
        }));
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            if (e1.isNotJdkMateAnnotation(annotation.annotationType())) {
                test = a8.test(annotation);
                if (test) {
                    biConsumer.accept(0, annotation);
                }
            }
        }
    }

    public static void d(r rVar, BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        if (rVar.support(annotatedElement)) {
            rVar.scan(biConsumer, annotatedElement, predicate);
        }
    }

    public static boolean e(r rVar, AnnotatedElement annotatedElement) {
        return false;
    }

    public static /* synthetic */ boolean g(Annotation annotation) {
        return true;
    }

    public static /* synthetic */ Predicate h(Predicate predicate) {
        return new Predicate() { // from class: cn.hutool.core.annotation.scanner.p
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return q.g((Annotation) obj);
            }
        };
    }

    public static List l(final AnnotatedElement annotatedElement, r... rVarArr) {
        Stream of;
        Stream map;
        Stream flatMap;
        Collector list;
        Object collect;
        if (cn.hutool.core.util.e0.isNull(annotatedElement) && cn.hutool.core.util.h.isNotEmpty((Object[]) rVarArr)) {
            return Collections.emptyList();
        }
        of = Stream.of((Object[]) rVarArr);
        map = of.map(new Function() { // from class: cn.hutool.core.annotation.scanner.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List annotationsIfSupport;
                annotationsIfSupport = ((r) obj).getAnnotationsIfSupport(annotatedElement);
                return annotationsIfSupport;
            }
        });
        flatMap = map.flatMap(new Function() { // from class: cn.hutool.core.annotation.scanner.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream stream;
                stream = ((List) obj).stream();
                return stream;
            }
        });
        list = Collectors.toList();
        collect = flatMap.collect(list);
        return (List) collect;
    }

    public static List m(final AnnotatedElement annotatedElement, r... rVarArr) {
        Stream of;
        Stream filter;
        Optional findFirst;
        Optional map;
        Object orElseGet;
        if (cn.hutool.core.util.e0.isNull(annotatedElement) && cn.hutool.core.util.h.isNotEmpty((Object[]) rVarArr)) {
            return Collections.emptyList();
        }
        of = Stream.of((Object[]) rVarArr);
        filter = of.filter(new Predicate() { // from class: cn.hutool.core.annotation.scanner.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean support;
                support = ((r) obj).support(annotatedElement);
                return support;
            }
        });
        findFirst = filter.findFirst();
        map = findFirst.map(new Function() { // from class: cn.hutool.core.annotation.scanner.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List annotations;
                annotations = ((r) obj).getAnnotations(annotatedElement);
                return annotations;
            }
        });
        orElseGet = map.orElseGet(new Supplier() { // from class: cn.hutool.core.annotation.scanner.l
            @Override // java.util.function.Supplier
            public final Object get() {
                return Collections.emptyList();
            }
        });
        return (List) orElseGet;
    }
}
