package j$.util;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class e implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;
    public final java.util.Map a;
    public final e b;
    public transient f c;
    public transient f d;
    public transient d e;

    public e(java.util.Map map) {
        map.getClass();
        this.a = map;
        this.b = this;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object compute;
        synchronized (this.b) {
            java.util.Map map = this.a;
            compute = map instanceof Map ? ((Map) map).compute(obj, biFunction) : map instanceof ConcurrentMap ? j$.nio.file.attribute.a.i((ConcurrentMap) map, obj, biFunction) : Map.CC.$default$compute(map, obj, biFunction);
        }
        return compute;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        synchronized (this.b) {
            computeIfAbsent = Map.EL.computeIfAbsent(this.a, obj, function);
        }
        return computeIfAbsent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        r3 = r2;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object $default$computeIfPresent;
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                $default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        $default$computeIfPresent = null;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj2);
                    if (apply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, apply)) {
                        break;
                    }
                }
            } else {
                $default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return $default$computeIfPresent;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = this.a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.b) {
            containsValue = this.a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        f fVar;
        synchronized (this.b) {
            try {
                fVar = this.d;
                if (fVar == null) {
                    fVar = new f(this.a.entrySet(), this.b);
                    this.d = fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            equals = this.a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.b) {
            Map.EL.a(this.a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.b) {
            orDefault = Map.EL.getOrDefault(this.a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = this.a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = this.a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        f fVar;
        synchronized (this.b) {
            try {
                fVar = this.c;
                if (fVar == null) {
                    fVar = new f(this.a.keySet(), this.b);
                    this.c = fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = r6.apply(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r3.remove(r4, r1) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        if (r3.replace(r4, r1, r2) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        r5 = r2;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                obj2 = ((Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                obj2.getClass();
                loop0: while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    while (true) {
                        if (obj3 != null) {
                            break;
                        }
                        obj3 = concurrentMap.putIfAbsent(obj, obj2);
                        if (obj3 == null) {
                            break loop0;
                        }
                    }
                }
            } else {
                obj2 = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.b) {
            put = this.a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.b) {
            this.a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object putIfAbsent;
        synchronized (this.b) {
            putIfAbsent = Map.EL.putIfAbsent(this.a, obj, obj2);
        }
        return putIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.b) {
            java.util.Map map = this.a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                biFunction.getClass();
                j$.util.concurrent.w wVar = new j$.util.concurrent.w(0, concurrentMap, biFunction);
                if (concurrentMap instanceof ConcurrentHashMap) {
                    ((ConcurrentHashMap) concurrentMap).forEach(wVar);
                } else {
                    j$.nio.file.attribute.a.j(concurrentMap, wVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        d dVar;
        synchronized (this.b) {
            try {
                dVar = this.e;
                if (dVar == null) {
                    dVar = new d(this.a.values(), this.b);
                    this.e = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.b) {
            remove = this.a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.b) {
            java.util.Map map = this.a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }
}
