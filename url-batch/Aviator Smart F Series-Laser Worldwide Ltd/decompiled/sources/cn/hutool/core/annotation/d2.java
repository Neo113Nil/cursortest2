package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class d2 implements r2 {
    private final Annotation annotation;
    private final Map<String, g0> attributeMethodCaches;
    private final int horizontalDistance;
    private final Object root;
    private final int verticalDistance;

    protected d2(Object obj, Annotation annotation, int i8, int i9) {
        this.root = obj;
        this.annotation = annotation;
        this.verticalDistance = i8;
        this.horizontalDistance = i9;
        HashMap hashMap = new HashMap();
        this.attributeMethodCaches = hashMap;
        hashMap.putAll(loadAttributeMethods());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAttributeValue$2(Class cls, g0 g0Var) {
        return cn.hutool.core.util.p.isAssignable(cls, g0Var.getAttributeType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hasAttribute$1(Class cls, g0 g0Var) {
        return cn.hutool.core.util.p.isAssignable(cls, g0Var.getAttributeType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g0 lambda$loadAttributeMethods$0(Method method) {
        return new f1(this.annotation, method);
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return this.annotation.annotationType();
    }

    @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
    public /* bridge */ /* synthetic */ int compareTo(i2 i2Var) {
        return h2.a(this, i2Var);
    }

    @Override // cn.hutool.core.annotation.r2
    public Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // cn.hutool.core.annotation.r2
    public Object getAttributeValue(String str) {
        return cn.hutool.core.lang.l0.ofNullable(this.attributeMethodCaches.get(str)).map(new x1()).get();
    }

    @Override // cn.hutool.core.annotation.r2
    public Map<String, g0> getAttributes() {
        return this.attributeMethodCaches;
    }

    @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
    public int getHorizontalDistance() {
        return this.horizontalDistance;
    }

    @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
    public Object getRoot() {
        return this.root;
    }

    @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
    public int getVerticalDistance() {
        return this.verticalDistance;
    }

    public boolean hasAttribute(String str) {
        return this.attributeMethodCaches.containsKey(str);
    }

    protected Map<String, g0> loadAttributeMethods() {
        Stream of;
        Stream filter;
        Collector map;
        Object collect;
        of = Stream.of((Object[]) cn.hutool.core.util.p.getDeclaredMethods(this.annotation.annotationType()));
        filter = of.filter(new y1());
        map = Collectors.toMap(new Function() { // from class: cn.hutool.core.annotation.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Method) obj).getName();
            }
        }, new Function() { // from class: cn.hutool.core.annotation.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                g0 lambda$loadAttributeMethods$0;
                lambda$loadAttributeMethods$0 = d2.this.lambda$loadAttributeMethods$0((Method) obj);
                return lambda$loadAttributeMethods$0;
            }
        });
        collect = filter.collect(map);
        return (Map) collect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.hutool.core.annotation.r2
    public void replaceAttribute(String str, UnaryOperator<g0> unaryOperator) {
        Object apply;
        g0 g0Var = this.attributeMethodCaches.get(str);
        if (cn.hutool.core.util.e0.isNotNull(g0Var)) {
            Map<String, g0> map = this.attributeMethodCaches;
            apply = unaryOperator.apply(g0Var);
            map.put(str, apply);
        }
    }

    @Override // cn.hutool.core.annotation.r2
    public void setAttribute(String str, g0 g0Var) {
        this.attributeMethodCaches.put(str, g0Var);
    }

    @Override // cn.hutool.core.annotation.r2
    public /* bridge */ /* synthetic */ void setAttributes(Map map) {
        q2.c(this, map);
    }

    @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        compareTo = compareTo((i2) obj);
        return compareTo;
    }

    @Override // cn.hutool.core.annotation.r2
    public boolean hasAttribute(String str, final Class<?> cls) {
        return cn.hutool.core.lang.l0.ofNullable(this.attributeMethodCaches.get(str)).filter(new Predicate() { // from class: cn.hutool.core.annotation.b2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$hasAttribute$1;
                lambda$hasAttribute$1 = d2.lambda$hasAttribute$1(cls, (g0) obj);
                return lambda$hasAttribute$1;
            }
        }).isPresent();
    }

    @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.h0
    public Object getAttributeValue(String str, final Class<?> cls) {
        return cn.hutool.core.lang.l0.ofNullable(this.attributeMethodCaches.get(str)).filter(new Predicate() { // from class: cn.hutool.core.annotation.c2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAttributeValue$2;
                lambda$getAttributeValue$2 = d2.lambda$getAttributeValue$2(cls, (g0) obj);
                return lambda$getAttributeValue$2;
            }
        }).map(new x1()).get();
    }
}
