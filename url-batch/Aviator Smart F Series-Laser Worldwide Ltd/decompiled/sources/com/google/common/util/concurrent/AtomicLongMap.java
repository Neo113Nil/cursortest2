package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class AtomicLongMap<K> implements Serializable {

    @CheckForNull
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.transformValues(this.map, new Function<AtomicLong, Long>(this) { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k8, long j8) {
        AtomicLong atomicLong;
        long j9;
        long j10;
        do {
            atomicLong = this.map.get(k8);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k8, new AtomicLong(j8))) == null) {
                return j8;
            }
            do {
                j9 = atomicLong.get();
                if (j9 != 0) {
                    j10 = j9 + j8;
                }
            } while (!atomicLong.compareAndSet(j9, j10));
            return j10;
        } while (!this.map.replace(k8, atomicLong, new AtomicLong(j8)));
        return j8;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k8) {
        return addAndGet(k8, -1L);
    }

    public long get(K k8) {
        AtomicLong atomicLong = this.map.get(k8);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k8, long j8) {
        AtomicLong atomicLong;
        long j9;
        do {
            atomicLong = this.map.get(k8);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k8, new AtomicLong(j8))) == null) {
                return 0L;
            }
            do {
                j9 = atomicLong.get();
                if (j9 == 0) {
                }
            } while (!atomicLong.compareAndSet(j9, j9 + j8));
            return j9;
        } while (!this.map.replace(k8, atomicLong, new AtomicLong(j8)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k8) {
        return getAndAdd(k8, -1L);
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k8) {
        return getAndAdd(k8, 1L);
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k8) {
        return addAndGet(k8, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @CanIgnoreReturnValue
    public long put(K k8, long j8) {
        AtomicLong atomicLong;
        long j9;
        do {
            atomicLong = this.map.get(k8);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k8, new AtomicLong(j8))) == null) {
                return 0L;
            }
            do {
                j9 = atomicLong.get();
                if (j9 == 0) {
                }
            } while (!atomicLong.compareAndSet(j9, j8));
            return j9;
        } while (!this.map.replace(k8, atomicLong, new AtomicLong(j8)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    long putIfAbsent(K k8, long j8) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.map.get(k8);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(k8, new AtomicLong(j8))) == null) {
                return 0L;
            }
            long j9 = atomicLong.get();
            if (j9 != 0) {
                return j9;
            }
        } while (!this.map.replace(k8, atomicLong, new AtomicLong(j8)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long remove(K k8) {
        long j8;
        AtomicLong atomicLong = this.map.get(k8);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j8 = atomicLong.get();
            if (j8 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j8, 0L));
        this.map.remove(k8, atomicLong);
        return j8;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @CanIgnoreReturnValue
    @Beta
    public boolean removeIfZero(K k8) {
        return remove(k8, 0L);
    }

    boolean replace(K k8, long j8, long j9) {
        if (j8 == 0) {
            return putIfAbsent(k8, j9) == 0;
        }
        AtomicLong atomicLong = this.map.get(k8);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j8, j9);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j8 = 0;
        while (it.hasNext()) {
            j8 += it.next().get();
        }
        return j8;
    }

    public String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> create = create();
        create.putAll(map);
        return create;
    }

    boolean remove(K k8, long j8) {
        AtomicLong atomicLong = this.map.get(k8);
        if (atomicLong == null) {
            return false;
        }
        long j9 = atomicLong.get();
        if (j9 != j8) {
            return false;
        }
        if (j9 != 0 && !atomicLong.compareAndSet(j9, 0L)) {
            return false;
        }
        this.map.remove(k8, atomicLong);
        return true;
    }
}
