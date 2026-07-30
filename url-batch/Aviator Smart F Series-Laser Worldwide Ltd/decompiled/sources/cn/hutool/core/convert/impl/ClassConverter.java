package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;

/* loaded from: classes.dex */
public class ClassConverter extends AbstractConverter<Class<?>> {
    private static final long serialVersionUID = 1;
    private final boolean isInitialized;

    public ClassConverter() {
        this(true);
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    public ClassConverter(boolean z7) {
        this.isInitialized = z7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<?> convertInternal(Object obj) {
        return cn.hutool.core.util.o.loadClass(convertToStr(obj), this.isInitialized);
    }
}
