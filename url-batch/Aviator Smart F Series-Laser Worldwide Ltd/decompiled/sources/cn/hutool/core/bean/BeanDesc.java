package cn.hutool.core.bean;

import cn.hutool.core.annotation.s0;
import cn.hutool.core.lang.a0;
import cn.hutool.core.map.CaseInsensitiveMap;
import cn.hutool.core.util.ModifierUtil;
import cn.hutool.core.util.y0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BeanDesc implements Serializable {
    private static final long serialVersionUID = 1;
    private final Class<?> beanClass;
    private final Map<String, s> propMap = new LinkedHashMap();

    public BeanDesc(Class<?> cls) {
        cn.hutool.core.lang.q.notNull(cls);
        this.beanClass = cls;
        init();
    }

    private s createProp(Field field, Method[] methodArr) {
        s findProp = findProp(field, methodArr, false);
        if (findProp.getter == null || findProp.setter == null) {
            s findProp2 = findProp(field, methodArr, true);
            if (findProp.getter == null) {
                findProp.getter = findProp2.getter;
            }
            if (findProp.setter == null) {
                findProp.setter = findProp2.setter;
            }
        }
        return findProp;
    }

    private s findProp(Field field, Method[] methodArr, boolean z7) {
        String name = field.getName();
        Class<?> type = field.getType();
        boolean isBoolean = cn.hutool.core.util.i.isBoolean(type);
        Method method = null;
        Method method2 = null;
        for (Method method3 : methodArr) {
            String name2 = method3.getName();
            if (s0.a(method3) == 0) {
                if (isMatchGetter(name2, name, isBoolean, z7)) {
                    method = method3;
                }
            } else if (isMatchSetter(name2, name, isBoolean, z7) && type.isAssignableFrom(method3.getParameterTypes()[0])) {
                method2 = method3;
            }
            if (method != null && method2 != null) {
                break;
            }
        }
        return new s(field, method, method2);
    }

    private BeanDesc init() {
        Method[] methods = y0.getMethods(this.beanClass, new a0() { // from class: cn.hutool.core.bean.b
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                return y0.isGetterOrSetterIgnoreCase((Method) obj);
            }
        });
        for (Field field : y0.getFields(this.beanClass)) {
            if (!ModifierUtil.isStatic(field) && !y0.isOuterClassField(field)) {
                s createProp = createProp(field, methods);
                this.propMap.putIfAbsent(createProp.getFieldName(), createProp);
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (("is" + r7).equals(r4) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean isMatchGetter(String str, String str2, boolean z7, boolean z8) {
        String upperFirst;
        if (z8) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
            upperFirst = str2;
        } else {
            upperFirst = cn.hutool.core.text.l.upperFirst(str2);
        }
        if (z7) {
            if (str2.startsWith("is")) {
                if (!str.equals(str2)) {
                    if (!("get" + upperFirst).equals(str)) {
                    }
                }
                return true;
            }
            if (("is" + upperFirst).equals(str)) {
                return true;
            }
        }
        return ("get" + upperFirst).equals(str);
    }

    private boolean isMatchSetter(String str, String str2, boolean z7, boolean z8) {
        String upperFirst;
        if (z8) {
            str = str.toLowerCase();
            str2 = str2.toLowerCase();
            upperFirst = str2;
        } else {
            upperFirst = cn.hutool.core.text.l.upperFirst(str2);
        }
        if (!str.startsWith("set")) {
            return false;
        }
        if (z7 && str2.startsWith("is")) {
            if (("set" + cn.hutool.core.text.l.removePrefix(str2, "is")).equals(str)) {
                return true;
            }
            if (("set" + upperFirst).equals(str)) {
                return true;
            }
        }
        return ("set" + upperFirst).equals(str);
    }

    public Field getField(String str) {
        s sVar = this.propMap.get(str);
        if (sVar == null) {
            return null;
        }
        return sVar.getField();
    }

    public Method getGetter(String str) {
        s sVar = this.propMap.get(str);
        if (sVar == null) {
            return null;
        }
        return sVar.getGetter();
    }

    public String getName() {
        return this.beanClass.getName();
    }

    public s getProp(String str) {
        return this.propMap.get(str);
    }

    public Map<String, s> getPropMap(boolean z7) {
        return z7 ? new CaseInsensitiveMap(1.0f, this.propMap) : this.propMap;
    }

    public Collection<s> getProps() {
        return this.propMap.values();
    }

    public Method getSetter(String str) {
        s sVar = this.propMap.get(str);
        if (sVar == null) {
            return null;
        }
        return sVar.getSetter();
    }

    public String getSimpleName() {
        return this.beanClass.getSimpleName();
    }
}
