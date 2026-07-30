package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ArrayConverter extends AbstractConverter<Object> {
    private static final long serialVersionUID = 1;
    private boolean ignoreElementError;
    private final Class<?> targetComponentType;
    private final Class<?> targetType;

    public ArrayConverter(Class<?> cls) {
        this(cls, false);
    }

    private Object convertArrayToArray(Object obj) {
        if (cn.hutool.core.util.h.getComponentType(obj) == this.targetComponentType) {
            return obj;
        }
        int length = cn.hutool.core.util.h.length(obj);
        Object newInstance = Array.newInstance(this.targetComponentType, length);
        for (int i8 = 0; i8 < length; i8++) {
            Array.set(newInstance, i8, convertComponentType(Array.get(obj, i8)));
        }
        return newInstance;
    }

    private Object convertComponentType(Object obj) {
        return cn.hutool.core.convert.d.convertWithCheck(this.targetComponentType, obj, null, this.ignoreElementError);
    }

    private Object convertObjectToArray(Object obj) {
        if (obj instanceof CharSequence) {
            Class<?> cls = this.targetComponentType;
            if (cls == Character.TYPE || cls == Character.class) {
                return convertArrayToArray(obj.toString().toCharArray());
            }
            if (cls != Byte.TYPE) {
                return convertArrayToArray(cn.hutool.core.text.l.splitToArray((CharSequence) obj.toString(), ','));
            }
            String obj2 = obj.toString();
            return g.h.isBase64(obj2) ? g.h.decode(obj.toString()) : obj2.getBytes();
        }
        int i8 = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            Object newInstance = Array.newInstance(this.targetComponentType, list.size());
            while (i8 < list.size()) {
                Array.set(newInstance, i8, convertComponentType(list.get(i8)));
                i8++;
            }
            return newInstance;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            Object newInstance2 = Array.newInstance(this.targetComponentType, collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Array.set(newInstance2, i8, convertComponentType(it.next()));
                i8++;
            }
            return newInstance2;
        }
        if (obj instanceof Iterable) {
            List list2 = cn.hutool.core.collection.k0.toList((Iterable) obj);
            Object newInstance3 = Array.newInstance(this.targetComponentType, list2.size());
            while (i8 < list2.size()) {
                Array.set(newInstance3, i8, convertComponentType(list2.get(i8)));
                i8++;
            }
            return newInstance3;
        }
        if (!(obj instanceof Iterator)) {
            return ((obj instanceof Number) && Byte.TYPE == this.targetComponentType) ? cn.hutool.core.util.j.numberToBytes((Number) obj) : ((obj instanceof Serializable) && Byte.TYPE == this.targetComponentType) ? cn.hutool.core.util.e0.serialize(obj) : convertToSingleElementArray(obj);
        }
        List list3 = cn.hutool.core.collection.k0.toList((Iterator) obj);
        Object newInstance4 = Array.newInstance(this.targetComponentType, list3.size());
        while (i8 < list3.size()) {
            Array.set(newInstance4, i8, convertComponentType(list3.get(i8)));
            i8++;
        }
        return newInstance4;
    }

    private Object[] convertToSingleElementArray(Object obj) {
        Object[] newArray = cn.hutool.core.util.h.newArray(this.targetComponentType, 1);
        newArray[0] = convertComponentType(obj);
        return newArray;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    protected Object convertInternal(Object obj) {
        return obj.getClass().isArray() ? convertArrayToArray(obj) : convertObjectToArray(obj);
    }

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Object> getTargetType() {
        return this.targetType;
    }

    public void setIgnoreElementError(boolean z7) {
        this.ignoreElementError = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayConverter(Class<?> cls, boolean z7) {
        Class cls2 = cls == null ? Object[].class : cls;
        if (cls2.isArray()) {
            this.targetType = cls2;
            this.targetComponentType = cls2.getComponentType();
        } else {
            this.targetComponentType = cls2;
            this.targetType = cn.hutool.core.util.h.getArrayType(cls2);
        }
        this.ignoreElementError = z7;
    }
}
