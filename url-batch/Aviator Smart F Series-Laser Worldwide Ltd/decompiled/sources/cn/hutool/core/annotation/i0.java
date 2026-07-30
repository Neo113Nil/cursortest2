package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface i0 {
    Map<Class<? extends Annotation>, r2> getAllSynthesizedAnnotation();

    Collection<u2> getAnnotationPostProcessors();

    o3 getAnnotationSelector();

    Object getSource();

    r2 getSynthesizedAnnotation(Class<?> cls);

    <T extends Annotation> T synthesize(Class<T> cls);
}
