package cn.hutool.core.annotation.scanner;

import cn.hutool.core.annotation.e1;
import cn.hutool.core.collection.CollUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class o0 implements r {
    private final boolean includeSupperMetaAnnotation;

    public o0(boolean z7) {
        this.includeSupperMetaAnnotation = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAnnotations$1(AnnotatedElement annotatedElement, Annotation annotation) {
        return cn.hutool.core.util.e0.notEqual(annotation, annotatedElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$2(Annotation annotation) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Predicate lambda$scan$3(Predicate predicate) {
        return new Predicate() { // from class: cn.hutool.core.annotation.scanner.n0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$2;
                lambda$null$2 = o0.lambda$null$2((Annotation) obj);
                return lambda$null$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scan$4(Annotation annotation) {
        return !e1.isJdkMetaAnnotation(annotation.annotationType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$scan$5(Set set, Class cls) {
        return !set.contains(cls);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public List<Annotation> getAnnotations(final AnnotatedElement annotatedElement) {
        final ArrayList arrayList = new ArrayList();
        scan(new BiConsumer() { // from class: cn.hutool.core.annotation.scanner.h0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                arrayList.add((Annotation) obj2);
            }
        }, annotatedElement, new Predicate() { // from class: cn.hutool.core.annotation.scanner.i0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAnnotations$1;
                lambda$getAnnotations$1 = o0.lambda$getAnnotations$1(annotatedElement, (Annotation) obj);
                return lambda$getAnnotations$1;
            }
        });
        return arrayList;
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotationsIfSupport(AnnotatedElement annotatedElement) {
        return q.b(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public void scan(BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate) {
        Stream of;
        Stream filter;
        Stream filter2;
        Collector list;
        Object collect;
        Stream stream;
        Stream map;
        Stream filter3;
        Collector list2;
        Object collect2;
        Predicate a8 = cn.hutool.core.annotation.r0.a(cn.hutool.core.util.e0.defaultIfNull(predicate, (Function<Predicate<Annotation>, ? extends Predicate<Annotation>>) new Function() { // from class: cn.hutool.core.annotation.scanner.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Predicate lambda$scan$3;
                lambda$scan$3 = o0.lambda$scan$3((Predicate) obj);
                return lambda$scan$3;
            }
        }));
        final HashSet hashSet = new HashSet();
        int i8 = 0;
        LinkedList newLinkedList = CollUtil.newLinkedList(CollUtil.newArrayList((Class) annotatedElement));
        do {
            for (Class cls : (List) newLinkedList.removeFirst()) {
                of = Stream.of((Object[]) cls.getAnnotations());
                filter = of.filter(new Predicate() { // from class: cn.hutool.core.annotation.scanner.m0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean lambda$scan$4;
                        lambda$scan$4 = o0.lambda$scan$4((Annotation) obj);
                        return lambda$scan$4;
                    }
                });
                filter2 = filter.filter(a8);
                list = Collectors.toList();
                collect = filter2.collect(list);
                List list3 = (List) collect;
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    biConsumer.accept(Integer.valueOf(i8), (Annotation) it.next());
                }
                hashSet.add(cls);
                stream = list3.stream();
                map = stream.map(new Function() { // from class: cn.hutool.core.annotation.scanner.k0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((Annotation) obj).annotationType();
                    }
                });
                filter3 = map.filter(new Predicate() { // from class: cn.hutool.core.annotation.scanner.l0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean lambda$scan$5;
                        lambda$scan$5 = o0.lambda$scan$5(hashSet, (Class) obj);
                        return lambda$scan$5;
                    }
                });
                list2 = Collectors.toList();
                collect2 = filter3.collect(list2);
                List list4 = (List) collect2;
                if (CollUtil.isNotEmpty((Collection<?>) list4)) {
                    newLinkedList.addLast(list4);
                }
            }
            i8++;
            if (!this.includeSupperMetaAnnotation) {
                return;
            }
        } while (!newLinkedList.isEmpty());
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ void scanIfSupport(BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        q.d(this, biConsumer, annotatedElement, predicate);
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public boolean support(AnnotatedElement annotatedElement) {
        return (annotatedElement instanceof Class) && cn.hutool.core.util.p.isAssignable(Annotation.class, (Class) annotatedElement);
    }

    public o0() {
        this(true);
    }
}
