package cn.hutool.core.annotation.scanner;

import cn.hutool.core.collection.CollUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class v0 extends f {
    public v0() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasSameSignature, reason: merged with bridge method [inline-methods] */
    public boolean lambda$getAnnotationsFromTargetClass$2(Method method, Method method2) {
        if (!cn.hutool.core.text.l.equals(method.getName(), method2.getName())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        if (parameterTypes.length == parameterTypes2.length && cn.hutool.core.util.h.containsAll(parameterTypes, parameterTypes2)) {
            return cn.hutool.core.util.p.isAssignable(method2.getReturnType(), method.getReturnType());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAnnotationsFromTargetClass$1(Method method) {
        return !method.isBridge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Annotation[] lambda$getAnnotationsFromTargetClass$3(int i8) {
        return new Annotation[i8];
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
        Stream of;
        Stream filter;
        Stream filter2;
        Stream map;
        Stream flatMap;
        Object[] array;
        final Method method = (Method) annotatedElement;
        of = Stream.of((Object[]) cn.hutool.core.util.p.getDeclaredMethods(cls));
        filter = of.filter(new Predicate() { // from class: cn.hutool.core.annotation.scanner.r0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAnnotationsFromTargetClass$1;
                lambda$getAnnotationsFromTargetClass$1 = v0.lambda$getAnnotationsFromTargetClass$1((Method) obj);
                return lambda$getAnnotationsFromTargetClass$1;
            }
        });
        filter2 = filter.filter(new Predicate() { // from class: cn.hutool.core.annotation.scanner.s0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAnnotationsFromTargetClass$2;
                lambda$getAnnotationsFromTargetClass$2 = v0.this.lambda$getAnnotationsFromTargetClass$2(method, (Method) obj);
                return lambda$getAnnotationsFromTargetClass$2;
            }
        });
        map = filter2.map(new Function() { // from class: cn.hutool.core.annotation.scanner.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Method) obj).getAnnotations();
            }
        });
        flatMap = map.flatMap(new Function() { // from class: cn.hutool.core.annotation.scanner.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream of2;
                of2 = Stream.of((Object[]) obj);
                return of2;
            }
        });
        array = flatMap.toArray(new IntFunction() { // from class: cn.hutool.core.annotation.scanner.q0
            @Override // java.util.function.IntFunction
            public final Object apply(int i9) {
                Annotation[] lambda$getAnnotationsFromTargetClass$3;
                lambda$getAnnotationsFromTargetClass$3 = v0.lambda$getAnnotationsFromTargetClass$3(i9);
                return lambda$getAnnotationsFromTargetClass$3;
            }
        });
        return (Annotation[]) array;
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ List getAnnotationsIfSupport(AnnotatedElement annotatedElement) {
        return q.b(this, annotatedElement);
    }

    @Override // cn.hutool.core.annotation.scanner.f
    protected Class<?> getClassFormAnnotatedElement(AnnotatedElement annotatedElement) {
        return ((Method) annotatedElement).getDeclaringClass();
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public /* bridge */ /* synthetic */ void scanIfSupport(BiConsumer biConsumer, AnnotatedElement annotatedElement, Predicate predicate) {
        q.d(this, biConsumer, annotatedElement, predicate);
    }

    public v0 setScanSameSignatureMethod(boolean z7) {
        setIncludeInterfaces(z7);
        setIncludeSuperClass(z7);
        return this;
    }

    @Override // cn.hutool.core.annotation.scanner.f, cn.hutool.core.annotation.scanner.r
    public boolean support(AnnotatedElement annotatedElement) {
        return annotatedElement instanceof Method;
    }

    public v0(boolean z7) {
        this(z7, new Predicate() { // from class: cn.hutool.core.annotation.scanner.p0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$0;
                lambda$new$0 = v0.lambda$new$0((Class) obj);
                return lambda$new$0;
            }
        }, CollUtil.newLinkedHashSet(new Class[0]));
    }

    public v0(boolean z7, Predicate<Class<?>> predicate, Set<Class<?>> set) {
        super(z7, z7, predicate, set);
    }

    public v0(boolean z7, boolean z8, Predicate<Class<?>> predicate, Set<Class<?>> set) {
        super(z7, z8, predicate, set);
    }
}
