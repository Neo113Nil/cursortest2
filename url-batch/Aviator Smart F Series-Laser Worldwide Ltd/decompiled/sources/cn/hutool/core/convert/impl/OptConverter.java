package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;

/* loaded from: classes.dex */
public class OptConverter extends AbstractConverter<cn.hutool.core.lang.l0> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public cn.hutool.core.lang.l0 convertInternal(Object obj) {
        return cn.hutool.core.lang.l0.ofNullable(obj);
    }
}
