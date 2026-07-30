package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f1 implements g0 {
    private final Annotation annotation;
    private final Method attribute;
    private Object defaultValue;
    private boolean defaultValueInvoked;
    private Object value;
    private boolean valueInvoked;

    public f1(Annotation annotation, Method method) {
        cn.hutool.core.lang.q.notNull(annotation, "annotation must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(method, "attribute must not null", new Object[0]);
        this.annotation = annotation;
        this.attribute = method;
        this.valueInvoked = false;
        this.defaultValueInvoked = false;
    }

    @Override // cn.hutool.core.annotation.g0
    public Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Class getAnnotationType() {
        return f0.b(this);
    }

    @Override // cn.hutool.core.annotation.g0
    public Method getAttribute() {
        return this.attribute;
    }

    @Override // cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ String getAttributeName() {
        return f0.c(this);
    }

    @Override // cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Class getAttributeType() {
        return f0.d(this);
    }

    @Override // cn.hutool.core.annotation.g0
    public Object getValue() {
        if (!this.valueInvoked) {
            this.valueInvoked = true;
            this.value = cn.hutool.core.util.y0.invoke(this.annotation, this.attribute, new Object[0]);
        }
        return this.value;
    }

    @Override // cn.hutool.core.annotation.g0
    public boolean isValueEquivalentToDefaultValue() {
        if (!this.defaultValueInvoked) {
            this.defaultValue = this.attribute.getDefaultValue();
            this.defaultValueInvoked = true;
        }
        return cn.hutool.core.util.e0.equals(getValue(), this.defaultValue);
    }

    @Override // cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ boolean isWrapped() {
        return f0.f(this);
    }

    @Override // cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Annotation getAnnotation(Class cls) {
        return f0.a(this, cls);
    }
}
