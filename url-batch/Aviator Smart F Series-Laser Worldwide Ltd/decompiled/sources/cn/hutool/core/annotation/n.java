package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n implements q3 {
    protected final g0 linked;
    protected final g0 original;

    protected n(g0 g0Var, g0 g0Var2) {
        cn.hutool.core.lang.q.notNull(g0Var, "target must not null", new Object[0]);
        cn.hutool.core.lang.q.notNull(g0Var2, "linked must not null", new Object[0]);
        this.original = g0Var;
        this.linked = g0Var2;
    }

    private void collectLeafAttribute(g0 g0Var, List<g0> list) {
        if (cn.hutool.core.util.e0.isNull(g0Var)) {
            return;
        }
        if (!g0Var.isWrapped()) {
            list.add(g0Var);
            return;
        }
        q3 q3Var = (q3) g0Var;
        collectLeafAttribute(q3Var.getOriginal(), list);
        collectLeafAttribute(q3Var.getLinked(), list);
    }

    @Override // cn.hutool.core.annotation.q3
    public Collection<g0> getAllLinkedNonWrappedAttributes() {
        ArrayList arrayList = new ArrayList();
        collectLeafAttribute(this, arrayList);
        return arrayList;
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Annotation getAnnotation() {
        return p3.a(this);
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Class getAnnotationType() {
        return f0.b(this);
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Method getAttribute() {
        return p3.d(this);
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ String getAttributeName() {
        return f0.c(this);
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Class getAttributeType() {
        return p3.f(this);
    }

    @Override // cn.hutool.core.annotation.q3
    public g0 getLinked() {
        return this.linked;
    }

    @Override // cn.hutool.core.annotation.q3
    public g0 getNonWrappedOriginal() {
        g0 g0Var = null;
        for (g0 g0Var2 = this.original; g0Var2 != null; g0Var2 = g0Var2.isWrapped() ? ((q3) g0Var2).getOriginal() : null) {
            g0Var = g0Var2;
        }
        return g0Var;
    }

    @Override // cn.hutool.core.annotation.q3
    public g0 getOriginal() {
        return this.original;
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Object getValue() {
        return f0.e(this);
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public abstract /* synthetic */ boolean isValueEquivalentToDefaultValue();

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ boolean isWrapped() {
        return p3.h(this);
    }

    @Override // cn.hutool.core.annotation.q3, cn.hutool.core.annotation.g0
    public /* bridge */ /* synthetic */ Annotation getAnnotation(Class cls) {
        return p3.b(this, cls);
    }
}
