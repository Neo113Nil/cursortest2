package cn.hutool.core.convert.impl;

import cn.hutool.core.collection.CollUtil;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes.dex */
public class a implements cn.hutool.core.convert.f {
    private final Type collectionType;
    private final Type elementType;

    public a() {
        this((Class<?>) Collection.class);
    }

    protected Collection<?> convertInternal(Object obj) {
        return CollUtil.addAll(CollUtil.create(cn.hutool.core.util.e1.getClass(this.collectionType), cn.hutool.core.util.e1.getClass(this.elementType)), obj, this.elementType);
    }

    @Override // cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    public a(Type type) {
        this(type, cn.hutool.core.util.e1.getTypeArgument(type));
    }

    @Override // cn.hutool.core.convert.f
    public Collection<?> convert(Object obj, Collection<?> collection) {
        return (Collection) cn.hutool.core.util.e0.defaultIfNull(convertInternal(obj), collection);
    }

    public a(Class<?> cls) {
        this(cls, cn.hutool.core.util.e1.getTypeArgument(cls));
    }

    public a(Type type, Type type2) {
        this.collectionType = type;
        this.elementType = type2;
    }
}
