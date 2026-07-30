package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import java.util.function.Function;

/* loaded from: classes.dex */
public class PrimitiveConverter extends AbstractConverter<Object> {
    private static final long serialVersionUID = 1;
    private final Class<?> targetType;

    public PrimitiveConverter(Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException("PrimitiveConverter not allow null target type!");
        }
        if (cls.isPrimitive()) {
            this.targetType = cls;
            return;
        }
        throw new IllegalArgumentException("[" + cls + "] is not a primitive class!");
    }

    protected static Object convert(Object obj, Class<?> cls, Function<Object, String> function) {
        if (Byte.TYPE == cls) {
            return cn.hutool.core.util.e0.defaultIfNull((int) NumberConverter.convert(obj, Byte.class, function), 0);
        }
        if (Short.TYPE == cls) {
            return cn.hutool.core.util.e0.defaultIfNull((int) NumberConverter.convert(obj, Short.class, function), 0);
        }
        if (Integer.TYPE == cls) {
            return cn.hutool.core.util.e0.defaultIfNull((int) NumberConverter.convert(obj, Integer.class, function), 0);
        }
        if (Long.TYPE == cls) {
            return cn.hutool.core.util.e0.defaultIfNull((int) NumberConverter.convert(obj, Long.class, function), 0);
        }
        if (Float.TYPE == cls) {
            return cn.hutool.core.util.e0.defaultIfNull((int) NumberConverter.convert(obj, Float.class, function), 0);
        }
        if (Double.TYPE == cls) {
            return cn.hutool.core.util.e0.defaultIfNull((int) NumberConverter.convert(obj, Double.class, function), 0);
        }
        if (Character.TYPE == cls) {
            return cn.hutool.core.convert.d.convert(Character.class, obj);
        }
        if (Boolean.TYPE == cls) {
            return cn.hutool.core.convert.d.convert(Boolean.class, obj);
        }
        throw new ConvertException("Unsupported target type: {}", cls);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    protected Object convertInternal(Object obj) {
        return convert(obj, this.targetType, new Function() { // from class: cn.hutool.core.convert.impl.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return PrimitiveConverter.this.convertToStr(obj2);
            }
        });
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    protected String convertToStr(Object obj) {
        return cn.hutool.core.text.l.trim(super.convertToStr(obj));
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Object> getTargetType() {
        return this.targetType;
    }
}
