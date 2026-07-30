package cn.hutool.core.bean.copier;

import cn.hutool.core.lang.q;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public class BeanCopier<T> implements cn.hutool.core.lang.copier.a, Serializable {
    private static final long serialVersionUID = 1;
    private final cn.hutool.core.lang.copier.a copier;

    public BeanCopier(Object obj, T t7, Type type, CopyOptions copyOptions) {
        q.notNull(obj, "Source bean must be not null!", new Object[0]);
        q.notNull(t7, "Target bean must be not null!", new Object[0]);
        this.copier = obj instanceof Map ? t7 instanceof Map ? new o((Map) obj, (Map) t7, type, copyOptions) : new m((Map) obj, t7, type, copyOptions) : t7 instanceof Map ? new e(obj, (Map) t7, type, copyOptions) : new c(obj, t7, type, copyOptions);
    }

    public static <T> BeanCopier<T> create(Object obj, T t7, CopyOptions copyOptions) {
        return create(obj, t7, t7.getClass(), copyOptions);
    }

    @Override // cn.hutool.core.lang.copier.a
    public T copy() {
        return (T) this.copier.copy();
    }

    public static <T> BeanCopier<T> create(Object obj, T t7, Type type, CopyOptions copyOptions) {
        return new BeanCopier<>(obj, t7, type, copyOptions);
    }
}
