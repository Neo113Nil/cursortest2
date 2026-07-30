package cn.hutool.core.annotation;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class l1 implements s2 {
    private final Comparator<i2> annotationComparator;
    private final cn.hutool.core.map.multi.r valueCaches;

    public l1(Comparator<i2> comparator) {
        this.valueCaches = new cn.hutool.core.map.multi.h();
        cn.hutool.core.lang.q.notNull(comparator, "annotationComparator must not null", new Object[0]);
        this.annotationComparator = comparator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAttributeValue$0(String str, Class cls, r2 r2Var) {
        return r2Var.hasAttribute(str, cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getAttributeValue$1(String str, r2 r2Var) {
        return r2Var.getAttributeValue(str);
    }

    @Override // cn.hutool.core.annotation.s2
    public <T> T getAttributeValue(final String str, final Class<T> cls, Collection<? extends r2> collection) {
        Stream stream;
        Stream filter;
        Optional min;
        Optional map;
        Object orElse;
        T t7 = (T) this.valueCaches.get(str, cls);
        if (cn.hutool.core.util.e0.isNotNull(t7)) {
            return t7;
        }
        stream = collection.stream();
        filter = stream.filter(new Predicate() { // from class: cn.hutool.core.annotation.j1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAttributeValue$0;
                lambda$getAttributeValue$0 = l1.lambda$getAttributeValue$0(str, cls, (r2) obj);
                return lambda$getAttributeValue$0;
            }
        });
        min = filter.min(this.annotationComparator);
        map = min.map(new Function() { // from class: cn.hutool.core.annotation.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$getAttributeValue$1;
                lambda$getAttributeValue$1 = l1.lambda$getAttributeValue$1(str, (r2) obj);
                return lambda$getAttributeValue$1;
            }
        });
        orElse = map.orElse(null);
        T t8 = (T) orElse;
        this.valueCaches.put(str, cls, t8);
        return t8;
    }

    public l1() {
        this(i2.DEFAULT_HIERARCHICAL_COMPARATOR);
    }
}
