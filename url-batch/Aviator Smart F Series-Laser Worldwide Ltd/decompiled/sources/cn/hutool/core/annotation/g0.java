package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public interface g0 {
    Annotation getAnnotation();

    <T extends Annotation> T getAnnotation(Class<T> cls);

    Class<?> getAnnotationType();

    Method getAttribute();

    String getAttributeName();

    Class<?> getAttributeType();

    Object getValue();

    boolean isValueEquivalentToDefaultValue();

    boolean isWrapped();
}
