package cn.hutool.core.annotation;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.func.Func1;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class e1 {
    static final Set<Class<? extends Annotation>> META_ANNOTATIONS = CollUtil.newHashSet(Target.class, Retention.class, Inherited.class, Documented.class, SuppressWarnings.class, Override.class, Deprecated.class);

    public static o2 aggregatingFromAnnotation(Annotation... annotationArr) {
        return new t1(Arrays.asList(annotationArr), cn.hutool.core.annotation.scanner.r.NOTHING);
    }

    public static o2 aggregatingFromAnnotationWithMeta(Annotation... annotationArr) {
        return new t1(Arrays.asList(annotationArr), cn.hutool.core.annotation.scanner.r.DIRECTLY_AND_META_ANNOTATION);
    }

    public static <T extends Annotation> List<T> getAllSynthesizedAnnotations(AnnotatedElement annotatedElement, final Class<T> cls) {
        Stream stream;
        Stream map;
        Stream filter;
        Collector list;
        Object collect;
        stream = cn.hutool.core.annotation.scanner.r.DIRECTLY.getAnnotationsIfSupport(annotatedElement).stream();
        map = stream.map(new Function() { // from class: cn.hutool.core.annotation.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Annotation lambda$getAllSynthesizedAnnotations$4;
                lambda$getAllSynthesizedAnnotations$4 = e1.lambda$getAllSynthesizedAnnotations$4(cls, (Annotation) obj);
                return lambda$getAllSynthesizedAnnotations$4;
            }
        });
        filter = map.filter(new Predicate() { // from class: cn.hutool.core.annotation.x0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return t0.a((Annotation) obj);
            }
        });
        list = Collectors.toList();
        collect = filter.collect(list);
        return (List) collect;
    }

    public static <A extends Annotation> A getAnnotation(AnnotatedElement annotatedElement, Class<A> cls) {
        if (annotatedElement == null) {
            return null;
        }
        return (A) toCombination(annotatedElement).getAnnotation(cls);
    }

    public static <T extends Annotation> T getAnnotationAlias(AnnotatedElement annotatedElement, Class<T> cls) {
        Annotation annotation = getAnnotation(annotatedElement, cls);
        if (annotation == null) {
            return null;
        }
        return (T) aggregatingFromAnnotation(annotation).synthesize(cls);
    }

    public static <T> T getAnnotationValue(AnnotatedElement annotatedElement, Class<? extends Annotation> cls) {
        return (T) getAnnotationValue(annotatedElement, cls, "value");
    }

    public static Map<String, Object> getAnnotationValueMap(AnnotatedElement annotatedElement, Class<? extends Annotation> cls) {
        Annotation annotation = getAnnotation(annotatedElement, cls);
        if (annotation == null) {
            return null;
        }
        Method[] methods = cn.hutool.core.util.y0.getMethods(cls, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.annotation.z0
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$getAnnotationValueMap$1;
                lambda$getAnnotationValueMap$1 = e1.lambda$getAnnotationValueMap$1((Method) obj);
                return lambda$getAnnotationValueMap$1;
            }
        });
        HashMap hashMap = new HashMap(methods.length, 1.0f);
        for (Method method : methods) {
            hashMap.put(method.getName(), cn.hutool.core.util.y0.invoke(annotation, method, new Object[0]));
        }
        return hashMap;
    }

    public static Annotation[] getAnnotations(AnnotatedElement annotatedElement, boolean z7) {
        return getAnnotations(annotatedElement, z7, (Predicate<Annotation>) r0.a(null));
    }

    public static <T> T[] getCombinationAnnotations(AnnotatedElement annotatedElement, Class<T> cls) {
        return (T[]) getAnnotations(annotatedElement, true, (Class) cls);
    }

    public static RetentionPolicy getRetentionPolicy(Class<? extends Annotation> cls) {
        Retention retention = (Retention) cls.getAnnotation(Retention.class);
        return retention == null ? RetentionPolicy.CLASS : retention.value();
    }

    public static <T extends Annotation> T getSynthesizedAnnotation(final Class<T> cls, Annotation... annotationArr) {
        return (T) cn.hutool.core.lang.l0.ofNullable(annotationArr).filter(new Predicate() { // from class: cn.hutool.core.annotation.b1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cn.hutool.core.util.h.isNotEmpty((Object[]) obj);
            }
        }).map(new Function() { // from class: cn.hutool.core.annotation.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return e1.aggregatingFromAnnotationWithMeta((Annotation[]) obj);
            }
        }).map(new Function() { // from class: cn.hutool.core.annotation.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Annotation lambda$getSynthesizedAnnotation$2;
                lambda$getSynthesizedAnnotation$2 = e1.lambda$getSynthesizedAnnotation$2(cls, (o2) obj);
                return lambda$getSynthesizedAnnotation$2;
            }
        }).get();
    }

    public static ElementType[] getTargetType(Class<? extends Annotation> cls) {
        Target target = (Target) cls.getAnnotation(Target.class);
        return target == null ? new ElementType[]{ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE} : target.value();
    }

    public static boolean hasAnnotation(AnnotatedElement annotatedElement, Class<? extends Annotation> cls) {
        return getAnnotation(annotatedElement, cls) != null;
    }

    static boolean isAttributeMethod(Method method) {
        return s0.a(method) == 0 && method.getReturnType() != Void.TYPE;
    }

    public static boolean isDocumented(Class<? extends Annotation> cls) {
        return cls.isAnnotationPresent(Documented.class);
    }

    public static boolean isInherited(Class<? extends Annotation> cls) {
        return cls.isAnnotationPresent(Inherited.class);
    }

    public static boolean isJdkMetaAnnotation(Class<? extends Annotation> cls) {
        return META_ANNOTATIONS.contains(cls);
    }

    public static boolean isNotJdkMateAnnotation(Class<? extends Annotation> cls) {
        return !isJdkMetaAnnotation(cls);
    }

    public static boolean isSynthesizedAnnotation(Annotation annotation) {
        return n3.isProxyAnnotation(annotation.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Annotation lambda$getAllSynthesizedAnnotations$4(Class cls, Annotation annotation) {
        return getSynthesizedAnnotation(cls, annotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAnnotationValueMap$1(Method method) {
        if (!cn.hutool.core.util.h.isEmpty((Object[]) method.getParameterTypes())) {
            return false;
        }
        String name = method.getName();
        return ("hashCode".equals(name) || "toString".equals(name) || "annotationType".equals(name)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAnnotations$0(Class cls, Annotation annotation) {
        return cls == null || cls.isAssignableFrom(annotation.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Annotation lambda$getSynthesizedAnnotation$2(Class cls, o2 o2Var) {
        return o2Var.synthesize(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Annotation lambda$getSynthesizedAnnotation$3(Class cls, Annotation annotation) {
        return getSynthesizedAnnotation(cls, annotation);
    }

    public static List<Annotation> scanClass(Class<?> cls) {
        return cn.hutool.core.annotation.scanner.r.TYPE_HIERARCHY.getAnnotationsIfSupport(cls);
    }

    public static List<Annotation> scanMetaAnnotation(Class<? extends Annotation> cls) {
        return cn.hutool.core.annotation.scanner.r.DIRECTLY_AND_META_ANNOTATION.getAnnotationsIfSupport(cls);
    }

    public static List<Annotation> scanMethod(Method method) {
        return cn.hutool.core.annotation.scanner.r.TYPE_HIERARCHY.getAnnotationsIfSupport(method);
    }

    public static void setValue(Annotation annotation, String str, Object obj) {
        ((Map) cn.hutool.core.util.y0.getFieldValue(Proxy.getInvocationHandler(annotation), "memberValues")).put(str, obj);
    }

    public static CombinationAnnotationElement toCombination(AnnotatedElement annotatedElement) {
        return annotatedElement instanceof CombinationAnnotationElement ? (CombinationAnnotationElement) annotatedElement : new CombinationAnnotationElement(annotatedElement);
    }

    public static <T> T getAnnotationValue(AnnotatedElement annotatedElement, Class<? extends Annotation> cls, String str) {
        Method methodOfObj;
        Annotation annotation = getAnnotation(annotatedElement, cls);
        if (annotation == null || (methodOfObj = cn.hutool.core.util.y0.getMethodOfObj(annotation, str, new Object[0])) == null) {
            return null;
        }
        return (T) cn.hutool.core.util.y0.invoke(annotation, methodOfObj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] getAnnotations(AnnotatedElement annotatedElement, boolean z7, final Class<T> cls) {
        Annotation[] annotations = getAnnotations(annotatedElement, z7, (Predicate<Annotation>) new Predicate() { // from class: cn.hutool.core.annotation.y0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAnnotations$0;
                lambda$getAnnotations$0 = e1.lambda$getAnnotations$0(cls, (Annotation) obj);
                return lambda$getAnnotations$0;
            }
        });
        T[] tArr = (T[]) cn.hutool.core.util.h.newArray(cls, annotations.length);
        for (int i8 = 0; i8 < annotations.length; i8++) {
            tArr[i8] = annotations[i8];
        }
        return tArr;
    }

    public static <A extends Annotation, R> R getAnnotationValue(AnnotatedElement annotatedElement, Func1<A, R> func1) {
        if (func1 == null) {
            return null;
        }
        SerializedLambda resolve = m.e.resolve(func1);
        String instantiatedMethodType = resolve.getInstantiatedMethodType();
        return (R) getAnnotationValue(annotatedElement, cn.hutool.core.util.p.loadClass(cn.hutool.core.text.l.sub(instantiatedMethodType, 2, cn.hutool.core.text.l.indexOf(instantiatedMethodType, ';'))), resolve.getImplMethodName());
    }

    public static Annotation[] getAnnotations(AnnotatedElement annotatedElement, boolean z7, final Predicate<Annotation> predicate) {
        if (annotatedElement == null) {
            return null;
        }
        if (z7) {
            if (predicate == null) {
                return toCombination(annotatedElement).getAnnotations();
            }
            return CombinationAnnotationElement.of(annotatedElement, predicate).getAnnotations();
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        if (predicate == null) {
            return annotations;
        }
        predicate.getClass();
        return (Annotation[]) cn.hutool.core.util.h.filter(annotations, new cn.hutool.core.lang.a0() { // from class: cn.hutool.core.annotation.a1
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean test;
                test = predicate.test((Annotation) obj);
                return test;
            }
        });
    }

    public static <T extends Annotation> T getSynthesizedAnnotation(AnnotatedElement annotatedElement, final Class<T> cls) {
        Stream stream;
        Stream map;
        Stream filter;
        Optional findFirst;
        Object orElse;
        T t7 = (T) annotatedElement.getAnnotation(cls);
        if (cn.hutool.core.util.e0.isNotNull(t7)) {
            return t7;
        }
        stream = cn.hutool.core.annotation.scanner.r.DIRECTLY.getAnnotationsIfSupport(annotatedElement).stream();
        map = stream.map(new Function() { // from class: cn.hutool.core.annotation.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Annotation lambda$getSynthesizedAnnotation$3;
                lambda$getSynthesizedAnnotation$3 = e1.lambda$getSynthesizedAnnotation$3(cls, (Annotation) obj);
                return lambda$getSynthesizedAnnotation$3;
            }
        });
        filter = map.filter(new Predicate() { // from class: cn.hutool.core.annotation.v0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return t0.a((Annotation) obj);
            }
        });
        findFirst = filter.findFirst();
        orElse = findFirst.orElse(null);
        return (T) orElse;
    }
}
