package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.convert.ConverterRegistry;
import cn.hutool.core.lang.Pair;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public class PairConverter extends AbstractConverter<Pair<?, ?>> {
    private final Type keyType;
    private final Type pairType;
    private final Type valueType;

    public PairConverter(Type type) {
        this(type, null, null);
    }

    private static Pair<?, ?> mapToPair(Type type, Type type2, Type type3, Map map) {
        Object obj;
        Object obj2;
        if (1 == map.size()) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            obj = entry.getKey();
            obj2 = entry.getValue();
        } else if (2 == map.size()) {
            obj = map.get("key");
            obj2 = map.get("value");
        } else {
            obj = null;
            obj2 = null;
        }
        ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
        Class<?> cls = cn.hutool.core.util.e1.getClass(type);
        Object[] objArr = new Object[2];
        if (!cn.hutool.core.util.e1.isUnknown(type2)) {
            obj = converterRegistry.convert(type2, obj);
        }
        objArr[0] = obj;
        if (!cn.hutool.core.util.e1.isUnknown(type3)) {
            obj2 = converterRegistry.convert(type3, obj2);
        }
        objArr[1] = obj2;
        return (Pair) cn.hutool.core.util.y0.newInstance(cls, objArr);
    }

    private static Map<CharSequence, CharSequence> strToMap(CharSequence charSequence) {
        int indexOf = cn.hutool.core.text.l.indexOf(charSequence, '=', 0, charSequence.length());
        if (indexOf > -1) {
            return cn.hutool.core.map.h1.of(charSequence.subSequence(0, indexOf + 1), charSequence.subSequence(indexOf, charSequence.length()));
        }
        return null;
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    public PairConverter(Type type, Type type2, Type type3) {
        this.pairType = type;
        this.keyType = type2;
        this.valueType = type3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Pair<?, ?> convertInternal(Object obj) {
        Map strToMap;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            strToMap = cn.hutool.core.map.h1.of(entry.getKey(), entry.getValue());
        } else {
            strToMap = obj instanceof Map ? (Map) obj : obj instanceof CharSequence ? strToMap((CharSequence) obj) : cn.hutool.core.bean.q.isReadableBean(obj.getClass()) ? cn.hutool.core.bean.q.beanToMap(obj, new String[0]) : null;
        }
        if (strToMap != null) {
            return mapToPair(this.pairType, this.keyType, this.valueType, strToMap);
        }
        throw new ConvertException("Unsupported to map from [{}] of type: {}", obj, obj.getClass().getName());
    }
}
