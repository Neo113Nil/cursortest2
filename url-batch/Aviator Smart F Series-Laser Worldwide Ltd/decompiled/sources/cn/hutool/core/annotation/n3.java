package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class n3 implements InvocationHandler {
    private final r2 annotation;
    private final h0 annotationAttributeValueProvider;
    private final Map<String, BiFunction<Method, Object[], Object>> methods;

    interface a extends r2 {
        @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
        /* bridge */ /* synthetic */ int compareTo(i2 i2Var);

        @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2, java.lang.Comparable
        /* bridge */ /* synthetic */ int compareTo(Object obj);

        @Override // cn.hutool.core.annotation.r2
        /* synthetic */ Annotation getAnnotation();

        @Override // cn.hutool.core.annotation.r2
        /* synthetic */ Object getAttributeValue(String str);

        @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.h0
        /* synthetic */ Object getAttributeValue(String str, Class cls);

        @Override // cn.hutool.core.annotation.r2
        /* synthetic */ Map getAttributes();

        @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
        /* synthetic */ int getHorizontalDistance();

        @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
        /* synthetic */ Object getRoot();

        r2 getSynthesizedAnnotation();

        @Override // cn.hutool.core.annotation.r2, cn.hutool.core.annotation.i2
        /* synthetic */ int getVerticalDistance();

        @Override // cn.hutool.core.annotation.r2
        /* synthetic */ boolean hasAttribute(String str, Class cls);

        @Override // cn.hutool.core.annotation.r2
        /* synthetic */ void replaceAttribute(String str, UnaryOperator unaryOperator);

        @Override // cn.hutool.core.annotation.r2
        /* synthetic */ void setAttribute(String str, g0 g0Var);

        @Override // cn.hutool.core.annotation.r2
        /* bridge */ /* synthetic */ void setAttributes(Map map);
    }

    n3(h0 h0Var, r2 r2Var) {
        cn.hutool.core.lang.q.notNull(h0Var, "annotationAttributeValueProvider must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(r2Var, "annotation must not null", new Object[0]);
        this.annotationAttributeValueProvider = h0Var;
        this.annotation = r2Var;
        this.methods = new HashMap(9);
        loadMethods();
    }

    public static <T extends Annotation> T create(Class<T> cls, h0 h0Var, r2 r2Var) {
        if (cn.hutool.core.util.e0.isNull(r2Var)) {
            return null;
        }
        n3 n3Var = new n3(h0Var, r2Var);
        if (cn.hutool.core.util.e0.isNull(r2Var)) {
            return null;
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, a.class}, n3Var);
    }

    public static boolean isProxyAnnotation(Class<?> cls) {
        return cn.hutool.core.util.p.isAssignable(a.class, cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$invoke$0(Method method, Object[] objArr, BiFunction biFunction) {
        Object apply;
        apply = biFunction.apply(method, objArr);
        return apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$invoke$1(Method method, Object[] objArr) {
        return cn.hutool.core.util.y0.invoke(this, method, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$loadMethods$10(Method method, Object[] objArr) {
        throw new UnsupportedOperationException("proxied annotation can not reset attributes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$11(Method method, Object[] objArr) {
        return this.annotation.getAttributeValue((String) objArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$12(Method method, Object[] objArr) {
        return this.annotation.annotationType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$13(Method method, Object[] objArr) {
        return proxyAttributeValue(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$2(Method method, Object[] objArr) {
        return proxyToString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$3(Method method, Object[] objArr) {
        return Integer.valueOf(proxyHashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$4(Method method, Object[] objArr) {
        return proxyGetSynthesizedAnnotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$5(Method method, Object[] objArr) {
        return this.annotation.getRoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$6(Method method, Object[] objArr) {
        return Integer.valueOf(this.annotation.getVerticalDistance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$7(Method method, Object[] objArr) {
        return Integer.valueOf(this.annotation.getHorizontalDistance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$8(Method method, Object[] objArr) {
        return Boolean.valueOf(this.annotation.hasAttribute((String) objArr[0], (Class) objArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$loadMethods$9(Method method, Object[] objArr) {
        return this.annotation.getAttributes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$proxyToString$14(Method method) {
        return cn.hutool.core.text.l.format("{}={}", method.getName(), proxyAttributeValue(method));
    }

    private Object proxyAttributeValue(Method method) {
        return this.annotationAttributeValueProvider.getAttributeValue(method.getName(), method.getReturnType());
    }

    private Object proxyGetSynthesizedAnnotation() {
        return this.annotation;
    }

    private int proxyHashCode() {
        return Objects.hash(this.annotationAttributeValueProvider, this.annotation);
    }

    private String proxyToString() {
        Stream of;
        Stream filter;
        Stream map;
        Collector joining;
        Object collect;
        of = Stream.of((Object[]) cn.hutool.core.util.p.getDeclaredMethods(this.annotation.getAnnotation().annotationType()));
        filter = of.filter(new y1());
        map = filter.map(new Function() { // from class: cn.hutool.core.annotation.e3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$proxyToString$14;
                lambda$proxyToString$14 = n3.this.lambda$proxyToString$14((Method) obj);
                return lambda$proxyToString$14;
            }
        });
        joining = Collectors.joining(", ");
        collect = map.collect(joining);
        return cn.hutool.core.text.l.format("@{}({})", this.annotation.annotationType().getName(), (String) collect);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, final Method method, final Object[] objArr) {
        return cn.hutool.core.lang.l0.ofNullable(this.methods.get(method.getName())).map(new Function() { // from class: cn.hutool.core.annotation.c3
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Object lambda$invoke$0;
                lambda$invoke$0 = n3.lambda$invoke$0(method, objArr, (BiFunction) obj2);
                return lambda$invoke$0;
            }
        }).orElseGet(new Supplier() { // from class: cn.hutool.core.annotation.d3
            @Override // java.util.function.Supplier
            public final Object get() {
                Object lambda$invoke$1;
                lambda$invoke$1 = n3.this.lambda$invoke$1(method, objArr);
                return lambda$invoke$1;
            }
        });
    }

    void loadMethods() {
        this.methods.put("toString", new BiFunction() { // from class: cn.hutool.core.annotation.f3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$2;
                lambda$loadMethods$2 = n3.this.lambda$loadMethods$2((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$2;
            }
        });
        this.methods.put("hashCode", new BiFunction() { // from class: cn.hutool.core.annotation.i3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$3;
                lambda$loadMethods$3 = n3.this.lambda$loadMethods$3((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$3;
            }
        });
        this.methods.put("getSynthesizedAnnotation", new BiFunction() { // from class: cn.hutool.core.annotation.j3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$4;
                lambda$loadMethods$4 = n3.this.lambda$loadMethods$4((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$4;
            }
        });
        this.methods.put("getRoot", new BiFunction() { // from class: cn.hutool.core.annotation.k3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$5;
                lambda$loadMethods$5 = n3.this.lambda$loadMethods$5((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$5;
            }
        });
        this.methods.put("getVerticalDistance", new BiFunction() { // from class: cn.hutool.core.annotation.l3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$6;
                lambda$loadMethods$6 = n3.this.lambda$loadMethods$6((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$6;
            }
        });
        this.methods.put("getHorizontalDistance", new BiFunction() { // from class: cn.hutool.core.annotation.x2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$7;
                lambda$loadMethods$7 = n3.this.lambda$loadMethods$7((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$7;
            }
        });
        this.methods.put("hasAttribute", new BiFunction() { // from class: cn.hutool.core.annotation.y2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$8;
                lambda$loadMethods$8 = n3.this.lambda$loadMethods$8((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$8;
            }
        });
        this.methods.put("getAttributes", new BiFunction() { // from class: cn.hutool.core.annotation.z2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$9;
                lambda$loadMethods$9 = n3.this.lambda$loadMethods$9((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$9;
            }
        });
        this.methods.put("setAttribute", new BiFunction() { // from class: cn.hutool.core.annotation.a3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$10;
                lambda$loadMethods$10 = n3.lambda$loadMethods$10((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$10;
            }
        });
        this.methods.put("getAttributeValue", new BiFunction() { // from class: cn.hutool.core.annotation.b3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$11;
                lambda$loadMethods$11 = n3.this.lambda$loadMethods$11((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$11;
            }
        });
        this.methods.put("annotationType", new BiFunction() { // from class: cn.hutool.core.annotation.g3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$loadMethods$12;
                lambda$loadMethods$12 = n3.this.lambda$loadMethods$12((Method) obj, (Object[]) obj2);
                return lambda$loadMethods$12;
            }
        });
        for (Method method : cn.hutool.core.util.p.getDeclaredMethods(this.annotation.getAnnotation().annotationType())) {
            this.methods.put(method.getName(), new BiFunction() { // from class: cn.hutool.core.annotation.h3
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Object lambda$loadMethods$13;
                    lambda$loadMethods$13 = n3.this.lambda$loadMethods$13((Method) obj, (Object[]) obj2);
                    return lambda$loadMethods$13;
                }
            });
        }
    }

    public static <T extends Annotation> T create(Class<T> cls, r2 r2Var) {
        return (T) create(cls, r2Var, r2Var);
    }
}
