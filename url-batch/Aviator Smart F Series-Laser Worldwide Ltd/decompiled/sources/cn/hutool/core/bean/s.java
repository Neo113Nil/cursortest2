package cn.hutool.core.bean;

import cn.hutool.core.annotation.m2;
import cn.hutool.core.util.ModifierUtil;
import cn.hutool.core.util.e1;
import cn.hutool.core.util.y0;
import java.beans.Transient;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class s {
    final Field field;
    protected Method getter;
    protected Method setter;

    public s(Field field, Method method, Method method2) {
        this.field = field;
        this.getter = cn.hutool.core.util.p.setAccessible(method);
        this.setter = cn.hutool.core.util.p.setAccessible(method2);
    }

    private Class<?> findPropClass(Method method, Method method2) {
        Class<?> returnClass = method != null ? e1.getReturnClass(method) : null;
        return (returnClass != null || method2 == null) ? returnClass : e1.getFirstParamClass(method2);
    }

    private Type findPropType(Method method, Method method2) {
        Type returnType = method != null ? e1.getReturnType(method) : null;
        return (returnType != null || method2 == null) ? returnType : e1.getParamType(method2, 0);
    }

    private boolean isIgnoreGet() {
        return cn.hutool.core.annotation.e1.hasAnnotation(this.field, m2.class) || cn.hutool.core.annotation.e1.hasAnnotation(this.getter, m2.class);
    }

    private boolean isIgnoreSet() {
        return cn.hutool.core.annotation.e1.hasAnnotation(this.field, m2.class) || cn.hutool.core.annotation.e1.hasAnnotation(this.setter, m2.class);
    }

    private boolean isTransientForGet() {
        Method method;
        Field field = this.field;
        ModifierUtil.ModifierType modifierType = ModifierUtil.ModifierType.TRANSIENT;
        boolean hasModifier = ModifierUtil.hasModifier(field, modifierType);
        if (hasModifier || (method = this.getter) == null) {
            return hasModifier;
        }
        boolean hasModifier2 = ModifierUtil.hasModifier(method, modifierType);
        return !hasModifier2 ? cn.hutool.core.annotation.e1.hasAnnotation(this.getter, Transient.class) : hasModifier2;
    }

    private boolean isTransientForSet() {
        Method method;
        Field field = this.field;
        ModifierUtil.ModifierType modifierType = ModifierUtil.ModifierType.TRANSIENT;
        boolean hasModifier = ModifierUtil.hasModifier(field, modifierType);
        if (hasModifier || (method = this.setter) == null) {
            return hasModifier;
        }
        boolean hasModifier2 = ModifierUtil.hasModifier(method, modifierType);
        return !hasModifier2 ? cn.hutool.core.annotation.e1.hasAnnotation(this.setter, Transient.class) : hasModifier2;
    }

    public Field getField() {
        return this.field;
    }

    public Class<?> getFieldClass() {
        Field field = this.field;
        return field != null ? e1.getClass(field) : findPropClass(this.getter, this.setter);
    }

    public String getFieldName() {
        return y0.getFieldName(this.field);
    }

    public Type getFieldType() {
        Field field = this.field;
        return field != null ? e1.getType(field) : findPropType(this.getter, this.setter);
    }

    public Method getGetter() {
        return this.getter;
    }

    public String getRawFieldName() {
        Field field = this.field;
        if (field == null) {
            return null;
        }
        return field.getName();
    }

    public Method getSetter() {
        return this.setter;
    }

    public Object getValue(Object obj) {
        Method method = this.getter;
        if (method != null) {
            return y0.invoke(obj, method, new Object[0]);
        }
        if (ModifierUtil.isPublic(this.field)) {
            return y0.getFieldValue(obj, this.field);
        }
        return null;
    }

    public boolean isReadable(boolean z7) {
        if (this.getter == null && !ModifierUtil.isPublic(this.field)) {
            return false;
        }
        if (z7 && isTransientForGet()) {
            return false;
        }
        return !isIgnoreGet();
    }

    public boolean isWritable(boolean z7) {
        if (this.setter == null && !ModifierUtil.isPublic(this.field)) {
            return false;
        }
        if (z7 && isTransientForSet()) {
            return false;
        }
        return !isIgnoreSet();
    }

    public s setValue(Object obj, Object obj2) {
        Method method = this.setter;
        if (method != null) {
            y0.invoke(obj, method, obj2);
        } else if (ModifierUtil.isPublic(this.field)) {
            y0.setFieldValue(obj, this.field, obj2);
        }
        return this;
    }

    public Object getValue(Object obj, Type type, boolean z7) {
        Object obj2;
        try {
            obj2 = getValue(obj);
        } catch (Exception e8) {
            if (!z7) {
                throw new BeanException(e8, "Get value of [{}] error!", getFieldName());
            }
            obj2 = null;
        }
        return (obj2 == null || type == null) ? obj2 : cn.hutool.core.convert.d.convertWithCheck(type, obj2, null, z7);
    }

    public s setValue(Object obj, Object obj2, boolean z7, boolean z8) {
        return setValue(obj, obj2, z7, z8, true);
    }

    public s setValue(Object obj, Object obj2, boolean z7, boolean z8, boolean z9) {
        if (obj2 == null && z7) {
            return this;
        }
        if (!z9 && getValue(obj) != null) {
            return this;
        }
        if (obj2 != null) {
            Class<?> fieldClass = getFieldClass();
            if (!fieldClass.isInstance(obj2)) {
                obj2 = cn.hutool.core.convert.d.convertWithCheck(fieldClass, obj2, null, z8);
            }
        }
        if (obj2 != null || !z7) {
            try {
                setValue(obj, obj2);
            } catch (Exception e8) {
                if (!z8) {
                    throw new BeanException(e8, "Set value of [{}] error!", getFieldName());
                }
            }
        }
        return this;
    }
}
