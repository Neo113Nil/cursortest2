package cn.hutool.core.convert;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AbstractConverter<T> implements f, Serializable {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.f
    public T convert(Object obj, T t7) {
        Class targetType = getTargetType();
        if (targetType == null && t7 == null) {
            throw new NullPointerException(cn.hutool.core.text.l.format("[type] and [defaultValue] are both null for Converter [{}], we can not know what type to convert !", getClass().getName()));
        }
        if (targetType == null) {
            targetType = t7.getClass();
        }
        if (obj == null) {
            return t7;
        }
        if (t7 != null && !targetType.isInstance(t7)) {
            throw new IllegalArgumentException(cn.hutool.core.text.l.format("Default value [{}]({}) is not the instance of [{}]", t7, t7.getClass(), targetType));
        }
        if (targetType.isInstance(obj) && !Map.class.isAssignableFrom(targetType)) {
            return (T) targetType.cast(obj);
        }
        T convertInternal = convertInternal(obj);
        return convertInternal == null ? t7 : convertInternal;
    }

    protected abstract T convertInternal(Object obj);

    public T convertQuietly(Object obj, T t7) {
        try {
            return convert(obj, t7);
        } catch (Exception unused) {
            return t7;
        }
    }

    protected String convertToStr(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof CharSequence ? obj.toString() : cn.hutool.core.util.h.isArray(obj) ? cn.hutool.core.util.h.toString(obj) : cn.hutool.core.util.k.isChar(obj) ? cn.hutool.core.util.k.toString(((Character) obj).charValue()) : obj.toString();
    }

    @Override // cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return e.a(this, obj, obj2, z7);
    }

    public Class<T> getTargetType() {
        return (Class<T>) cn.hutool.core.util.p.getTypeArgument(getClass());
    }
}
