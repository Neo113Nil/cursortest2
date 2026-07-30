package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public interface r2 extends Annotation, i2, h0 {
    /* bridge */ /* synthetic */ int compareTo(i2 i2Var);

    /* bridge */ /* synthetic */ int compareTo(Object obj);

    Annotation getAnnotation();

    Object getAttributeValue(String str);

    /* synthetic */ Object getAttributeValue(String str, Class cls);

    Map<String, g0> getAttributes();

    int getHorizontalDistance();

    /* synthetic */ Object getRoot();

    int getVerticalDistance();

    boolean hasAttribute(String str, Class<?> cls);

    void replaceAttribute(String str, UnaryOperator<g0> unaryOperator);

    void setAttribute(String str, g0 g0Var);

    void setAttributes(Map<String, g0> map);
}
