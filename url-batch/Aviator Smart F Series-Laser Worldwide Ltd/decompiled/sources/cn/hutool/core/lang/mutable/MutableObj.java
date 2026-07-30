package cn.hutool.core.lang.mutable;

import cn.hutool.core.util.e0;
import java.io.Serializable;
import p.a;

/* loaded from: classes.dex */
public class MutableObj<T> implements a, Serializable {
    private static final long serialVersionUID = 1;
    private T value;

    public MutableObj() {
    }

    public static <T> MutableObj<T> of(T t7) {
        return new MutableObj<>(t7);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return e0.equals(this.value, ((MutableObj) obj).value);
        }
        return false;
    }

    @Override // p.a
    public T get() {
        return this.value;
    }

    public int hashCode() {
        T t7 = this.value;
        if (t7 == null) {
            return 0;
        }
        return t7.hashCode();
    }

    @Override // p.a
    public void set(T t7) {
        this.value = t7;
    }

    public String toString() {
        T t7 = this.value;
        return t7 == null ? "null" : t7.toString();
    }

    public MutableObj(T t7) {
        this.value = t7;
    }
}
