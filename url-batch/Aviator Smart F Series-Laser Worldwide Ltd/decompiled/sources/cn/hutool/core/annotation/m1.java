package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class m1 extends n {
    protected m1(g0 g0Var, g0 g0Var2) {
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
    public Class<?> getAttributeType() {
        return this.linked.getAttributeType();
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public Object getValue() {
        return this.linked.getValue();
    }

    @Override // cn.hutool.core.annotation.n, cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public boolean isValueEquivalentToDefaultValue() {
        return this.linked.isValueEquivalentToDefaultValue();
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
