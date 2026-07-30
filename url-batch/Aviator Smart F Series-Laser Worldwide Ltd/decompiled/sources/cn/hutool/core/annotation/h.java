package cn.hutool.core.annotation;

import cn.hutool.core.collection.CollUtil;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class h implements i0 {
    protected final cn.hutool.core.annotation.scanner.r annotationScanner;
    protected final o3 annotationSelector;
    protected final Collection<u2> postProcessors;
    protected final Object source;
    protected final Map<Class<? extends Annotation>, r2> synthesizedAnnotationMap;
    private final Map<Class<? extends Annotation>, Annotation> synthesizedProxyAnnotations;

    protected h(Object obj, o3 o3Var, Collection<u2> collection, cn.hutool.core.annotation.scanner.r rVar) {
        Comparator comparing;
        cn.hutool.core.lang.q.notNull(obj, "source must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(o3Var, "annotationSelector must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(collection, "annotationPostProcessors must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(collection, "annotationScanner must not null", new Object[0]);
        this.source = obj;
        this.annotationSelector = o3Var;
        this.annotationScanner = rVar;
        comparing = Comparator.comparing(new d());
        this.postProcessors = CollUtil.unmodifiable(CollUtil.sort(collection, comparing));
        this.synthesizedProxyAnnotations = new LinkedHashMap();
        this.synthesizedAnnotationMap = cn.hutool.core.map.h1.unmodifiable(loadAnnotations());
        collection.forEach(new Consumer() { // from class: cn.hutool.core.annotation.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                h.this.lambda$new$1((u2) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(final u2 u2Var) {
        this.synthesizedAnnotationMap.values().forEach(new Consumer() { // from class: cn.hutool.core.annotation.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                h.this.lambda$null$0(u2Var, (r2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$0(u2 u2Var, r2 r2Var) {
        u2Var.process(r2Var, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Annotation lambda$synthesize$2(Class cls, Class cls2) {
        r2 r2Var = this.synthesizedAnnotationMap.get(cls);
        if (cn.hutool.core.util.e0.isNull(r2Var)) {
            return null;
        }
        return synthesize(cls, r2Var);
    }

    @Override // cn.hutool.core.annotation.i0
    public Map<Class<? extends Annotation>, r2> getAllSynthesizedAnnotation() {
        return this.synthesizedAnnotationMap;
    }

    @Override // cn.hutool.core.annotation.i0
    public Collection<u2> getAnnotationPostProcessors() {
        return this.postProcessors;
    }

    @Override // cn.hutool.core.annotation.i0
    public o3 getAnnotationSelector() {
        return this.annotationSelector;
    }

    @Override // cn.hutool.core.annotation.i0
    public Object getSource() {
        return this.source;
    }

    @Override // cn.hutool.core.annotation.i0
    public r2 getSynthesizedAnnotation(Class<?> cls) {
        return this.synthesizedAnnotationMap.get(cls);
    }

    protected abstract Map<Class<? extends Annotation>, r2> loadAnnotations();

    @Override // cn.hutool.core.annotation.i0
    public <A extends Annotation> A synthesize(final Class<A> cls) {
        Object computeIfAbsent;
        computeIfAbsent = this.synthesizedProxyAnnotations.computeIfAbsent(cls, new Function() { // from class: cn.hutool.core.annotation.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Annotation lambda$synthesize$2;
                lambda$synthesize$2 = h.this.lambda$synthesize$2(cls, (Class) obj);
                return lambda$synthesize$2;
            }
        });
        return (A) computeIfAbsent;
    }

    protected abstract <A extends Annotation> A synthesize(Class<A> cls, r2 r2Var);
}
