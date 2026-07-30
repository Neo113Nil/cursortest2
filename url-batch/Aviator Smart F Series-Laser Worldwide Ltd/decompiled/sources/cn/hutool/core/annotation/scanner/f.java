package cn.hutool.core.annotation.scanner;

import cn.hutool.core.annotation.e1;
import cn.hutool.core.collection.CollUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public abstract class f implements r {
    private final List<UnaryOperator<Class<?>>> converters;
    private final Set<Class<?>> excludeTypes;
    private Predicate<Class<?>> filter;
    private boolean hasConverters;
    private boolean includeInterfaces;
    private boolean includeSuperClass;
    private final f typedThis;

    protected f(boolean z7, boolean z8, Predicate<Class<?>> predicate, Set<Class<?>> set) {
        cn.hutool.core.lang.q.notNull(predicate, "filter must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(set, "excludeTypes must not null", new Object[0]);
        this.includeSuperClass = z7;
        this.includeInterfaces = z8;
        this.filter = predicate;
        this.excludeTypes = set;
        this.converters = new ArrayList();
        this.typedThis = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$null$0(Annotation annotation) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Predicate lambda$scan$1(Predicate predicate) {
        return new Predicate() { // from class: cn.hutool.core.annotation.scanner.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$null$0;
                lambda$null$0 = f.lambda$null$0((Annotation) obj);
                return lambda$null$0;
            }
        };
    }

    public f addConverters(UnaryOperator<Class<?>> unaryOperator) {
        cn.hutool.core.lang.q.notNull(unaryOperator, "converter must not null", new Object[0]);
        this.converters.add(unaryOperator);
        if (!this.hasConverters) {
            this.hasConverters = CollUtil.isNotEmpty((Collection<?>) this.converters);
        }
        return this.typedThis;
    }

    public f addExcludeTypes(Class<?>... clsArr) {
        CollUtil.addAll((Collection) this.excludeTypes, (Object[]) clsArr);
        return this.typedThis;
    }

    protected Class<?> convert(Class<?> cls) {
        Object apply;
        if (this.hasConverters) {
            Iterator<UnaryOperator<Class<?>>> it = this.converters.iterator();
            while (it.hasNext()) {
                apply = c.a(it.next()).apply(cls);
                cls = (Class) apply;
            }
        }
        return cls;
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotations(AnnotatedElement annotatedElement) {
        return q.a(this, annotatedElement);
    }

    protected abstract Annotation[] getAnnotationsFromTargetClass(AnnotatedElement annotatedElement, int i8, Class<?> cls);

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotationsIfSupport(AnnotatedElement annotatedElement) {
        return q.b(this, annotatedElement);
    }

    protected abstract Class<?> getClassFormAnnotatedElement(AnnotatedElement annotatedElement);

    public boolean isIncludeInterfaces() {
        return this.includeInterfaces;
    }

    public boolean isIncludeSuperClass() {
        return this.includeSuperClass;
    }

    protected boolean isNotNeedProcess(Set<Class<?>> set, Class<?> cls) {
        Predicate negate;
        boolean test;
        if (!cn.hutool.core.util.e0.isNull(cls) && !set.contains(cls) && !this.excludeTypes.contains(cls)) {
            negate = this.filter.negate();
            test = negate.test(cls);
            if (!test) {
                return false;
            }
        }
        return true;
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public void scan(BiConsumer<Integer, Annotation> biConsumer, AnnotatedElement annotatedElement, Predicate<Annotation> predicate) {
        boolean test;
        Predicate a8 = cn.hutool.core.annotation.r0.a(cn.hutool.core.util.e0.defaultIfNull(predicate, (Function<Predicate<Annotation>, ? extends Predicate<Annotation>>) new Function() { // from class: cn.hutool.core.annotation.scanner.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Predicate lambda$scan$1;
                lambda$scan$1 = f.lambda$scan$1((Predicate) obj);
                return lambda$scan$1;
            }
        }));
        LinkedList newLinkedList = CollUtil.newLinkedList(CollUtil.newArrayList(getClassFormAnnotatedElement(annotatedElement)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i8 = 0;
        while (!newLinkedList.isEmpty()) {
            List list = (List) newLinkedList.removeFirst();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class<?> convert = convert((Class) it.next());
                if (!isNotNeedProcess(linkedHashSet, convert)) {
                    linkedHashSet.add(convert);
                    scanSuperClassIfNecessary(arrayList, convert);
                    scanInterfaceIfNecessary(arrayList, convert);
                    for (Annotation annotation : getAnnotationsFromTargetClass(annotatedElement, i8, convert)) {
                        if (e1.isNotJdkMateAnnotation(annotation.annotationType())) {
                            test = a8.test(annotation);
                            if (test) {
                                biConsumer.accept(Integer.valueOf(i8), annotation);
                            }
                        }
                    }
                    i8++;
                }
            }
            if (CollUtil.isNotEmpty((Collection<?>) arrayList)) {
                newLinkedList.addLast(arrayList);
            }
        }
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ void scanIfSupport(BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        q.d(this, biConsumer, annotatedElement, predicate);
    }

    protected void scanInterfaceIfNecessary(List<Class<?>> list, Class<?> cls) {
        if (this.includeInterfaces) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (cn.hutool.core.util.h.isNotEmpty((Object[]) interfaces)) {
                CollUtil.addAll((Collection) list, (Object[]) interfaces);
            }
        }
    }

    protected void scanSuperClassIfNecessary(List<Class<?>> list, Class<?> cls) {
        if (this.includeSuperClass) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (cn.hutool.core.util.e0.equals(superclass, Object.class) || !cn.hutool.core.util.e0.isNotNull(superclass)) {
                return;
            }
            list.add(superclass);
        }
    }

    public f setFilter(Predicate<Class<?>> predicate) {
        cn.hutool.core.lang.q.notNull(predicate, "filter must not null", new Object[0]);
        this.filter = predicate;
        return this.typedThis;
    }

    protected f setIncludeInterfaces(boolean z7) {
        this.includeInterfaces = z7;
        return this.typedThis;
    }

    protected f setIncludeSuperClass(boolean z7) {
        this.includeSuperClass = z7;
        return this.typedThis;
    }

    @Override // cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ boolean support(AnnotatedElement annotatedElement) {
        return q.e(this, annotatedElement);
    }
}
