package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class l2 extends n {
    public l2(g0 g0Var, g0 g0Var2) {
        super(g0Var, g0Var2);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Annotation getAnnotation() {
        return p3.a(this);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Class getAnnotationType() {
        return f0.b(this);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Method getAttribute() {
        return p3.d(this);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ String getAttributeName() {
        return f0.c(this);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Class getAttributeType() {
        return p3.f(this);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public Object getValue() {
        boolean isValueEquivalentToDefaultValue = this.original.isValueEquivalentToDefaultValue();
        boolean isValueEquivalentToDefaultValue2 = this.linked.isValueEquivalentToDefaultValue();
        Object value = this.original.getValue();
        Object value2 = this.linked.getValue();
        if (isValueEquivalentToDefaultValue != isValueEquivalentToDefaultValue2) {
            return isValueEquivalentToDefaultValue ? value2 : value;
        }
        cn.hutool.core.lang.q.equals(value, value2, "the values of attributes [{}] and [{}] that mirror each other are different: [{}] <==> [{}]", this.original.getAttribute(), this.linked.getAttribute(), value, value2);
        return value;
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public boolean isValueEquivalentToDefaultValue() {
        return this.original.isValueEquivalentToDefaultValue() && this.linked.isValueEquivalentToDefaultValue();
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ boolean isWrapped() {
        return p3.h(this);
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Annotation getAnnotation(Class cls) {
        return p3.b(this, cls);
    }
}
