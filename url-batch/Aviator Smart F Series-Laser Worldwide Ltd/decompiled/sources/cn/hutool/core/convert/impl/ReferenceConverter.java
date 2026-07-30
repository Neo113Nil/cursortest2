package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConverterRegistry;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class ReferenceConverter extends AbstractConverter<Reference> {
    private static final long serialVersionUID = 1;
    private final Class<? extends Reference> targetType;

    public ReferenceConverter(Class<? extends Reference> cls) {
        this.targetType = cls;
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Reference convertInternal(Object obj) {
        Type typeArgument = cn.hutool.core.util.e1.getTypeArgument(this.targetType);
        Object convert = !cn.hutool.core.util.e1.isUnknown(typeArgument) ? ConverterRegistry.getInstance().convert(typeArgument, obj) : null;
        if (convert != null) {
            obj = convert;
        }
        Class<? extends Reference> cls = this.targetType;
        if (cls == WeakReference.class) {
            return new WeakReference(obj);
        }
        if (cls == SoftReference.class) {
            return new SoftReference(obj);
        }
        throw new UnsupportedOperationException(cn.hutool.core.text.l.format("Unsupport Reference type: {}", this.targetType.getName()));
    }
}
