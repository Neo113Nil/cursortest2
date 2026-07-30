package cn.hutool.core.map;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class a implements Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return cn.hutool.core.util.e0.equals(getKey(), entry.getKey()) && cn.hutool.core.util.e0.equals(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Entry is read only.");
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
