package cn.hutool.core.map;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class MapProxy implements Map<Object, Object>, j.d, InvocationHandler, Serializable {
    private static final long serialVersionUID = 1;
    Map map;

    public MapProxy(Map<?, ?> map) {
        this.map = map;
    }

    public static MapProxy create(Map<?, ?> map) {
        return map instanceof MapProxy ? (MapProxy) map : new MapProxy(map);
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.map.get(obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ BigDecimal getBigDecimal(Object obj) {
        return j.e.a(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ BigInteger getBigInteger(Object obj) {
        return j.e.b(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Boolean getBool(Object obj) {
        return j.e.c(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Byte getByte(Object obj) {
        return j.e.d(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Character getChar(Object obj) {
        return j.e.e(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Date getDate(Object obj) {
        return j.e.f(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Double getDouble(Object obj) {
        return j.e.g(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Enum getEnum(Class cls, Object obj) {
        return j.e.h(this, cls, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Float getFloat(Object obj) {
        return j.e.i(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Integer getInt(Object obj) {
        return j.e.j(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Long getLong(Object obj) {
        return j.e.k(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Object getObj(Object obj) {
        return j.e.l(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ Short getShort(Object obj) {
        return j.e.m(this, obj);
    }

    @Override // j.d, j.f, j.a
    public /* bridge */ /* synthetic */ String getStr(Object obj) {
        return j.e.n(this, obj);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (cn.hutool.core.util.h.isEmpty((Object[]) parameterTypes)) {
            Class<?> returnType = method.getReturnType();
            if (Void.TYPE != returnType) {
                String name = method.getName();
                if (name.startsWith("get")) {
                    str = cn.hutool.core.text.l.removePreAndLowerFirst(name, 3);
                } else if (cn.hutool.core.util.i.isBoolean(returnType) && name.startsWith("is")) {
                    str = cn.hutool.core.text.l.removePreAndLowerFirst(name, 2);
                } else {
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(hashCode());
                    }
                    if ("toString".equals(name)) {
                        return toString();
                    }
                    str = null;
                }
                if (cn.hutool.core.text.l.isNotBlank(str)) {
                    if (!containsKey(str)) {
                        str = cn.hutool.core.text.l.toUnderlineCase(str);
                    }
                    return cn.hutool.core.convert.d.convert(method.getGenericReturnType(), get(str));
                }
            }
        } else if (1 == parameterTypes.length) {
            String name2 = method.getName();
            if (name2.startsWith("set")) {
                String removePreAndLowerFirst = cn.hutool.core.text.l.removePreAndLowerFirst(name2, 3);
                if (cn.hutool.core.text.l.isNotBlank(removePreAndLowerFirst)) {
                    put(removePreAndLowerFirst, objArr[0]);
                    if (method.getReturnType().isInstance(obj)) {
                        return obj;
                    }
                }
            } else if ("equals".equals(name2)) {
                return Boolean.valueOf(equals(objArr[0]));
            }
        }
        throw new UnsupportedOperationException(method.toGenericString());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.map.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Object, ? extends Object> map) {
        this.map.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.map.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    public <T> T toProxyBean(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cn.hutool.core.util.o.getClassLoader(), new Class[]{cls}, this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ BigDecimal getBigDecimal(Object obj, BigDecimal bigDecimal) {
        return j.c.b(this, obj, bigDecimal);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ BigInteger getBigInteger(Object obj, BigInteger bigInteger) {
        return j.c.d(this, obj, bigInteger);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Boolean getBool(Object obj, Boolean bool) {
        return j.c.f(this, obj, bool);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Byte getByte(Object obj, Byte b8) {
        return j.c.h(this, obj, b8);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Character getChar(Object obj, Character ch) {
        return j.c.j(this, obj, ch);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Date getDate(Object obj, Date date) {
        return j.c.l(this, obj, date);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Double getDouble(Object obj, Double d8) {
        return j.c.n(this, obj, d8);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Enum getEnum(Class cls, Object obj, Enum r32) {
        return j.c.p(this, cls, obj, r32);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Float getFloat(Object obj, Float f8) {
        return j.c.r(this, obj, f8);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Integer getInt(Object obj, Integer num) {
        return j.c.t(this, obj, num);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Long getLong(Object obj, Long l8) {
        return j.c.v(this, obj, l8);
    }

    @Override // j.d, j.f, j.b
    public Object getObj(Object obj, Object obj2) {
        Object obj3 = this.map.get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ Short getShort(Object obj, Short sh) {
        return j.c.y(this, obj, sh);
    }

    @Override // j.d, j.f, j.b
    public /* bridge */ /* synthetic */ String getStr(Object obj, String str) {
        return j.c.A(this, obj, str);
    }
}
