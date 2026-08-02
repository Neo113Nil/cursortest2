package j$.util;

import java.util.Map;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class l implements Map.Entry {
    public Map.Entry a;

    public l(Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = this.a;
        if (this != obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry2 = (Map.Entry) obj;
                Object key = entry.getKey();
                Object key2 = entry2.getKey();
                if (key == null ? key2 == null : key.equals(key2)) {
                    Object value = entry.getValue();
                    Object value2 = entry2.getValue();
                    if (value == null ? value2 == null : value.equals(value2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString();
    }
}
