package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class LazyField extends LazyFieldLite {
    public abstract MessageLite getValue();

    static class LazyEntry implements Map.Entry {
        private Map.Entry entry;

        private LazyEntry(Map.Entry entry) {
            this.entry = entry;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return null;
        }

        public LazyField getField() {
            return (LazyField) this.entry.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return ((LazyField) this.entry.getValue()).setValue((MessageLite) obj);
        }
    }

    static class LazyIterator implements Iterator {
        private Iterator iterator;

        public LazyIterator(Iterator it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.iterator.next();
            return entry.getValue() instanceof LazyField ? new LazyEntry(entry) : entry;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }
}
