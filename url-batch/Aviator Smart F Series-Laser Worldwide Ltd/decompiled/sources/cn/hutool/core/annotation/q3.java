package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;

/* loaded from: classes.dex */
public interface q3 extends g0 {
    Collection<g0> getAllLinkedNonWrappedAttributes();

    @Override // cn.hutool.core.annotation.g0
    Annotation getAnnotation();

    @Override // cn.hutool.core.annotation.g0
    <T extends Annotation> T getAnnotation(Class<T> cls);

    @Override // cn.hutool.core.annotation.g0
    /* bridge */ /* synthetic */ Class getAnnotationType();

    @Override // cn.hutool.core.annotation.g0
    Method getAttribute();

    @Override // cn.hutool.core.annotation.g0
    /* bridge */ /* synthetic */ String getAttributeName();

    @Override // cn.hutool.core.annotation.g0
    Class<?> getAttributeType();

    g0 getLinked();

    g0 getNonWrappedOriginal();

    g0 getOriginal();

    @Override // cn.hutool.core.annotation.g0
    /* bridge */ /* synthetic */ Object getValue();

    @Override // cn.hutool.core.annotation.g0
    boolean isValueEquivalentToDefaultValue();

    @Override // cn.hutool.core.annotation.g0
    boolean isWrapped();
}
