package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface o2 extends o, i2, i0, h0 {
    @Override // java.lang.annotation.Annotation
    Class<? extends Annotation> annotationType();

    @Override // cn.hutool.core.annotation.i2
    /* bridge */ /* synthetic */ int compareTo(i2 i2Var);

    @Override // cn.hutool.core.annotation.i2, java.lang.Comparable
    /* bridge */ /* synthetic */ int compareTo(Object obj);

    @Override // cn.hutool.core.annotation.i0
    /* synthetic */ Map getAllSynthesizedAnnotation();

    <T extends Annotation> T getAnnotation(Class<T> cls);

    s2 getAnnotationAttributeProcessor();

    @Override // cn.hutool.core.annotation.i0
    /* synthetic */ Collection getAnnotationPostProcessors();

    @Override // cn.hutool.core.annotation.i0
    /* synthetic */ o3 getAnnotationSelector();

    @Override // cn.hutool.core.annotation.o
    /* synthetic */ Annotation[] getAnnotations();

    @Override // cn.hutool.core.annotation.h0
    Object getAttributeValue(String str, Class<?> cls);

    @Override // cn.hutool.core.annotation.i2
    int getHorizontalDistance();

    @Override // cn.hutool.core.annotation.i2
    /* synthetic */ Object getRoot();

    @Override // cn.hutool.core.annotation.i0
    /* synthetic */ Object getSource();

    @Override // cn.hutool.core.annotation.i0
    /* synthetic */ r2 getSynthesizedAnnotation(Class cls);

    @Override // cn.hutool.core.annotation.i2
    int getVerticalDistance();

    @Override // cn.hutool.core.annotation.o
    /* synthetic */ boolean isAnnotationPresent(Class cls);

    @Override // cn.hutool.core.annotation.i0
    /* synthetic */ Annotation synthesize(Class cls);
}
