package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class t1 extends h implements o2 {
    private final s2 attributeProcessor;
    private final int horizontalDistance;
    private final Object root;
    private final int verticalDistance;

    public static class a extends d2 {
        protected a(Annotation annotation, Annotation annotation2, int i8, int i9) {
            super(annotation, annotation2, i8, i9);
        }

        @Override // cn.hutool.core.annotation.d2, cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
        public /* bridge */ /* synthetic */ int compareTo(i2 i2Var) {
            return h2.a(this, i2Var);
        }

        @Override // cn.hutool.core.annotation.d2, cn.hutool.core.annotation.r2
        public /* bridge */ /* synthetic */ void setAttributes(Map map) {
            q2.c(this, map);
        }

        @Override // cn.hutool.core.annotation.d2, cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            int compareTo;
            compareTo = compareTo((i2) obj);
            return compareTo;
        }
    }

    public t1(Annotation... annotationArr) {
        this(Arrays.asList(annotationArr), new cn.hutool.core.annotation.scanner.o0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Annotation[] lambda$getAnnotations$1(int i8) {
        return new Annotation[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAnnotations$0(Map map, Annotation annotation, Integer num, Annotation annotation2) {
        r2 r2Var = (r2) map.get(annotation2.annotationType());
        a aVar = new a(annotation, annotation2, num.intValue() + 1, map.size());
        if (cn.hutool.core.util.e0.isNull(r2Var)) {
            map.put(annotation2.annotationType(), aVar);
        } else {
            map.put(annotation2.annotationType(), this.annotationSelector.choose(r2Var, aVar));
        }
    }

    @Override // cn.hutool.core.annotation.o2, java.lang.annotation.Annotation
    public /* bridge */ /* synthetic */ Class annotationType() {
        return n2.a(this);
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.i2
    public /* bridge */ /* synthetic */ int compareTo(i2 i2Var) {
        return h2.a(this, i2Var);
    }

    @Override // cn.hutool.core.annotation.o2
    public <T extends Annotation> T getAnnotation(final Class<T> cls) {
        cn.hutool.core.lang.l0 ofNullable = cn.hutool.core.lang.l0.ofNullable(cls);
        final Map<Class<? extends Annotation>, r2> map = this.synthesizedAnnotationMap;
        map.getClass();
        cn.hutool.core.lang.l0 map2 = ofNullable.map(new Function() { // from class: cn.hutool.core.annotation.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (r2) map.get((Class) obj);
            }
        }).map(new p1());
        cls.getClass();
        return (T) map2.map(new Function() { // from class: cn.hutool.core.annotation.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Annotation) cls.cast((Annotation) obj);
            }
        }).orElse(null);
    }

    @Override // cn.hutool.core.annotation.o2
    public s2 getAnnotationAttributeProcessor() {
        return this.attributeProcessor;
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.o
    public Annotation[] getAnnotations() {
        Stream stream;
        Stream map;
        Object[] array;
        stream = this.synthesizedAnnotationMap.values().stream();
        map = stream.map(new p1());
        array = map.toArray(new IntFunction() { // from class: cn.hutool.core.annotation.s1
            @Override // java.util.function.IntFunction
            public final Object apply(int i8) {
                Annotation[] lambda$getAnnotations$1;
                lambda$getAnnotations$1 = t1.lambda$getAnnotations$1(i8);
                return lambda$getAnnotations$1;
            }
        });
        return (Annotation[]) array;
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.h0
    public Object getAttributeValue(String str, Class<?> cls) {
        return this.attributeProcessor.getAttributeValue(str, cls, this.synthesizedAnnotationMap.values());
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.i2
    public int getHorizontalDistance() {
        return this.horizontalDistance;
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.i2
    public Object getRoot() {
        return this.root;
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.i2
    public int getVerticalDistance() {
        return this.verticalDistance;
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.o
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.synthesizedAnnotationMap.containsKey(cls);
    }

    @Override // cn.hutool.core.annotation.h
    protected Map<Class<? extends Annotation>, r2> loadAnnotations() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < ((List) this.source).size(); i8++) {
            final Annotation annotation = (Annotation) ((List) this.source).get(i8);
            cn.hutool.core.lang.q.isFalse(e1.isSynthesizedAnnotation(annotation), "source [{}] has been synthesized", new Object[0]);
            linkedHashMap.put(annotation.annotationType(), new a(annotation, annotation, 0, i8));
            cn.hutool.core.lang.q.isTrue(this.annotationScanner.support(annotation.annotationType()), "annotation scanner [{}] cannot support scan [{}]", this.annotationScanner, annotation.annotationType());
            this.annotationScanner.scan(new BiConsumer() { // from class: cn.hutool.core.annotation.r1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    t1.this.lambda$loadAnnotations$0(linkedHashMap, annotation, (Integer) obj, (Annotation) obj2);
                }
            }, annotation.annotationType(), null);
        }
        return linkedHashMap;
    }

    @Override // cn.hutool.core.annotation.h
    public <T extends Annotation> T synthesize(Class<T> cls, r2 r2Var) {
        return (T) n3.create(cls, this, r2Var);
    }

    public t1(List<Annotation> list, cn.hutool.core.annotation.scanner.r rVar) {
        this(list, o3.NEAREST_AND_OLDEST_PRIORITY, new l1(), Arrays.asList(u2.ALIAS_ANNOTATION_POST_PROCESSOR, u2.MIRROR_LINK_ANNOTATION_POST_PROCESSOR, u2.ALIAS_LINK_ANNOTATION_POST_PROCESSOR), rVar);
    }

    @Override // cn.hutool.core.annotation.o2, cn.hutool.core.annotation.i2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((i2) obj);
        return compareTo;
    }

    public t1(List<Annotation> list, o3 o3Var, s2 s2Var, Collection<u2> collection, cn.hutool.core.annotation.scanner.r rVar) {
        this(null, 0, 0, list, o3Var, s2Var, collection, rVar);
    }

    t1(Object obj, int i8, int i9, List<Annotation> list, o3 o3Var, s2 s2Var, Collection<u2> collection, cn.hutool.core.annotation.scanner.r rVar) {
        super(list, o3Var, collection, rVar);
        cn.hutool.core.lang.q.notNull(s2Var, "attributeProcessor must not null", new Object[0]);
        this.root = cn.hutool.core.util.e0.defaultIfNull((t1) obj, this);
        this.verticalDistance = i8;
        this.horizontalDistance = i9;
        this.attributeProcessor = s2Var;
    }
}
