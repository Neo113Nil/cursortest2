package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConverterRegistry;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class AtomicReferenceConverter extends AbstractConverter<AtomicReference> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public AtomicReference convertInternal(Object obj) {
        Type typeArgument = cn.hutool.core.util.e1.getTypeArgument(AtomicReference.class);
        Object convert = !cn.hutool.core.util.e1.isUnknown(typeArgument) ? ConverterRegistry.getInstance().convert(typeArgument, obj) : null;
        if (convert != null) {
            obj = convert;
        }
        return new AtomicReference(obj);
    }
}
