package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.s;
import y5.w;

/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@IntRange(from = 1, to = Long.MAX_VALUE) int i8) {
        this.maxSize = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k8, V v7) {
        int sizeOf = sizeOf(k8, v7);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k8 + '=' + v7).toString());
    }

    protected V create(K key) {
        s.checkNotNullParameter(key, "key");
        return null;
    }

    public final int createCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.createCount;
        }
        return i8;
    }

    protected void entryRemoved(boolean z7, K key, V oldValue, V v7) {
        s.checkNotNullParameter(key, "key");
        s.checkNotNullParameter(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.evictionCount;
        }
        return i8;
    }

    public final V get(K key) {
        V v7;
        s.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            V v8 = this.map.get(key);
            if (v8 != null) {
                this.hitCount++;
                return v8;
            }
            this.missCount++;
            V create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v7 = (V) this.map.put(key, create);
                    if (v7 != null) {
                        this.map.put(key, v7);
                    } else {
                        this.size += safeSizeOf(key, create);
                        w wVar = w.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v7 != null) {
                entryRemoved(false, key, create, v7);
                return v7;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.hitCount;
        }
        return i8;
    }

    public final int maxSize() {
        int i8;
        synchronized (this.lock) {
            i8 = this.maxSize;
        }
        return i8;
    }

    public final int missCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.missCount;
        }
        return i8;
    }

    public final V put(K key, V value) {
        V put;
        s.checkNotNullParameter(key, "key");
        s.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                put = this.map.put(key, value);
                if (put != null) {
                    this.size -= safeSizeOf(key, put);
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i8;
        synchronized (this.lock) {
            i8 = this.putCount;
        }
        return i8;
    }

    public final V remove(K key) {
        V remove;
        s.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                remove = this.map.remove(key);
                if (remove != null) {
                    this.size -= safeSizeOf(key, remove);
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(@IntRange(from = 1, to = Long.MAX_VALUE) int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.lock) {
            this.maxSize = i8;
            w wVar = w.INSTANCE;
        }
        trimToSize(i8);
    }

    public final int size() {
        int i8;
        synchronized (this.lock) {
            i8 = this.size;
        }
        return i8;
    }

    protected int sizeOf(K key, V value) {
        s.checkNotNullParameter(key, "key");
        s.checkNotNullParameter(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.map.getEntries().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                w wVar = w.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i8 = this.hitCount;
                int i9 = this.missCount + i8;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i9 != 0 ? (i8 * 100) / i9 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i8) {
        Object firstOrNull;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i8 || this.map.isEmpty()) {
                        break;
                    }
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(this.map.getEntries());
                    Map.Entry entry = (Map.Entry) firstOrNull;
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
