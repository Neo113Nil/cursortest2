package cn.hutool.core.bean;

import cn.hutool.core.util.y0;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class DynaBean extends f.a implements Serializable {
    private static final long serialVersionUID = 1;
    private final Object bean;
    private final Class<?> beanClass;

    public DynaBean(Class<?> cls, Object... objArr) {
        this(y0.newInstance(cls, objArr));
    }

    public static DynaBean create(Object obj) {
        return new DynaBean(obj);
    }

    public boolean containsProp(String str) {
        return Map.class.isAssignableFrom(this.beanClass) ? ((Map) this.bean).containsKey(str) : q.getBeanDesc(this.beanClass).getProp(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynaBean dynaBean = (DynaBean) obj;
        Object obj2 = this.bean;
        return obj2 == null ? dynaBean.bean == null : obj2.equals(dynaBean.bean);
    }

    public <T> T get(String str) {
        if (Map.class.isAssignableFrom(this.beanClass)) {
            return (T) ((Map) this.bean).get(str);
        }
        s prop = q.getBeanDesc(this.beanClass).getProp(str);
        if (prop != null) {
            return (T) prop.getValue(this.bean);
        }
        throw new BeanException("No public field or get method for {}", str);
    }

    public <T> T getBean() {
        return (T) this.bean;
    }

    public <T> Class<T> getBeanClass() {
        return (Class<T>) this.beanClass;
    }

    public int hashCode() {
        Object obj = this.bean;
        return 31 + (obj == null ? 0 : obj.hashCode());
    }

    public Object invoke(String str, Object... objArr) {
        return y0.invoke(this.bean, str, objArr);
    }

    public <T> T safeGet(String str) {
        try {
            return (T) get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void set(String str, Object obj) {
        if (Map.class.isAssignableFrom(this.beanClass)) {
            ((Map) this.bean).put(str, obj);
            return;
        }
        s prop = q.getBeanDesc(this.beanClass).getProp(str);
        if (prop == null) {
            throw new BeanException("No public field or set method for {}", str);
        }
        prop.setValue(this.bean, obj);
    }

    public String toString() {
        return this.bean.toString();
    }

    public DynaBean(Class<?> cls) {
        this(y0.newInstance(cls, new Object[0]));
    }

    public static DynaBean create(Class<?> cls) {
        return new DynaBean(cls);
    }

    public DynaBean(Object obj) {
        cn.hutool.core.lang.q.notNull(obj);
        obj = obj instanceof DynaBean ? ((DynaBean) obj).getBean() : obj;
        this.bean = obj;
        this.beanClass = cn.hutool.core.util.p.getClass(obj);
    }

    public static DynaBean create(Class<?> cls, Object... objArr) {
        return new DynaBean(cls, objArr);
    }
}
