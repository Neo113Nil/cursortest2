package cn.hutool.core.convert.impl;

import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.map.MapProxy;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public class BeanConverter<T> extends AbstractConverter<T> {
    private static final long serialVersionUID = 1;
    private final Class<T> beanClass;
    private final Type beanType;
    private final CopyOptions copyOptions;

    public BeanConverter(Type type) {
        this(type, CopyOptions.create().setIgnoreError(true));
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    protected T convertInternal(Object obj) {
        for (Class<?> cls : this.beanClass.getInterfaces()) {
            if ("cn.hutool.json.JSONBeanParser".equals(cls.getName())) {
                T t7 = (T) cn.hutool.core.util.y0.newInstanceIfPossible(this.beanClass);
                cn.hutool.core.util.y0.invoke(t7, "parse", obj);
                return t7;
            }
        }
        boolean z7 = obj instanceof Map;
        if (z7 || cn.hutool.core.bean.q.isBean(obj.getClass())) {
            return (z7 && this.beanClass.isInterface()) ? (T) MapProxy.create((Map) obj).toProxyBean(this.beanClass) : (T) BeanCopier.create(obj, cn.hutool.core.util.y0.newInstanceIfPossible(this.beanClass), this.beanType, this.copyOptions).copy();
        }
        if (obj instanceof byte[]) {
            return (T) cn.hutool.core.util.e0.deserialize((byte[]) obj, new Class[0]);
        }
        if (cn.hutool.core.util.c1.isEmptyIfStr(obj)) {
            return null;
        }
        throw new ConvertException("Unsupported source type: {}", obj.getClass());
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<T> getTargetType() {
        return this.beanClass;
    }

    public BeanConverter(Class<T> cls) {
        this(cls, CopyOptions.create().setIgnoreError(true));
    }

    public BeanConverter(Type type, CopyOptions copyOptions) {
        this.beanType = type;
        this.beanClass = (Class<T>) cn.hutool.core.util.e1.getClass(type);
        this.copyOptions = copyOptions;
    }
}
