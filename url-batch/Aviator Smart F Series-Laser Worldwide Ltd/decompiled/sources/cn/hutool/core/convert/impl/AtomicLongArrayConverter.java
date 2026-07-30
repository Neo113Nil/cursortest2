package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public class AtomicLongArrayConverter extends AbstractConverter<AtomicLongArray> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public AtomicLongArray convertInternal(Object obj) {
        return new AtomicLongArray((long[]) cn.hutool.core.convert.d.convert(long[].class, obj));
    }
}
