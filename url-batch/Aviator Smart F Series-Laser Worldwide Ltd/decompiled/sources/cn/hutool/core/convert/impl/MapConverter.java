package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConverterRegistry;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class MapConverter extends AbstractConverter<Map<?, ?>> {
    private static final long serialVersionUID = 1;
    private final Type keyType;
    private final Type mapType;
    private final Type valueType;

    public MapConverter(Type type) {
        this(type, cn.hutool.core.util.e1.getTypeArgument(type, 0), cn.hutool.core.util.e1.getTypeArgument(type, 1));
    }

    private void convertMapToMap(Map<?, ?> map, final Map<Object, Object> map2) {
        final ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
        map.forEach(new BiConsumer() { // from class: cn.hutool.core.convert.impl.t
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MapConverter.this.lambda$convertMapToMap$0(converterRegistry, map2, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convertMapToMap$0(ConverterRegistry converterRegistry, Map map, Object obj, Object obj2) {
        if (!cn.hutool.core.util.e1.isUnknown(this.keyType)) {
            obj = converterRegistry.convert(this.keyType, obj);
        }
        if (!cn.hutool.core.util.e1.isUnknown(this.valueType)) {
            obj2 = converterRegistry.convert(this.valueType, obj2);
        }
        map.put(obj, obj2);
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Map<?, ?>> getTargetType() {
        return cn.hutool.core.util.e1.getClass(this.mapType);
    }

    public MapConverter(Type type, Type type2, Type type3) {
        this.mapType = type;
        this.keyType = type2;
        this.valueType = type3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Map<?, ?> convertInternal(Object obj) {
        Type[] typeArguments;
        if (!(obj instanceof Map)) {
            if (cn.hutool.core.bean.q.isBean(obj.getClass())) {
                return convertInternal((Object) cn.hutool.core.bean.q.beanToMap(obj, new String[0]));
            }
            throw new UnsupportedOperationException(cn.hutool.core.text.l.format("Unsupported toMap value type: {}", obj.getClass().getName()));
        }
        Class<?> cls = obj.getClass();
        if (cls.equals(this.mapType) && (typeArguments = cn.hutool.core.util.e1.getTypeArguments(cls)) != null && 2 == typeArguments.length && Objects.equals(this.keyType, typeArguments[0]) && Objects.equals(this.valueType, typeArguments[1])) {
            return (Map) obj;
        }
        Class<?> cls2 = cn.hutool.core.util.e1.getClass(this.mapType);
        Map<?, ?> linkedHashMap = (cls2 == null || cls2.isAssignableFrom(AbstractMap.class)) ? new LinkedHashMap<>() : cn.hutool.core.map.h1.createMap(cls2);
        convertMapToMap((Map) obj, linkedHashMap);
        return linkedHashMap;
    }
}
