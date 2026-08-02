package kotlin.reflect.jvm.internal.impl.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Map;

/* loaded from: classes9.dex */
public class LazyField extends LazyFieldLite {

    public final class LazyEntry implements Map.Entry {
        public Map.Entry entry;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.entry.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.entry.getValue()).setValue((MessageLite) obj);
            }
            a$$ExternalSyntheticBUOutline0.m$3("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
    }

    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(null);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
