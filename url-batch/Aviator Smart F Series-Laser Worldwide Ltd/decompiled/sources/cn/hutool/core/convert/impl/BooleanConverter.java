package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;

/* loaded from: classes.dex */
public class BooleanConverter extends AbstractConverter<Boolean> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Boolean convertInternal(Object obj) {
        if (obj instanceof Number) {
            return Boolean.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON != ((Number) obj).doubleValue());
        }
        return Boolean.valueOf(cn.hutool.core.util.i.toBoolean(convertToStr(obj)));
    }
}
