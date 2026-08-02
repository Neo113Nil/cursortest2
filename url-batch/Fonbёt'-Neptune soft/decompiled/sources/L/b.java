package L;

import B.m;
import a.AbstractC0132a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f757a;

    /* renamed from: b, reason: collision with root package name */
    public final m f758b;

    public b(Map map, boolean z2) {
        Q0.h.e(map, "preferencesMap");
        this.f757a = map;
        this.f758b = new m(z2);
    }

    public final Map a() {
        F0.c cVar;
        Set<Map.Entry> entrySet = this.f757a.entrySet();
        Q0.h.e(entrySet, "<this>");
        int z2 = AbstractC0132a.z(entrySet.size());
        if (z2 < 16) {
            z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z2);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Q0.h.d(copyOf, "copyOf(this, size)");
                cVar = new F0.c(key, copyOf);
            } else {
                cVar = new F0.c(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(cVar.f461e, cVar.f462f);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Q0.h.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f758b.f78f).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        Q0.h.e(dVar, "key");
        Object obj = this.f757a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Q0.h.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(d dVar, Object obj) {
        b();
        Map map = this.f757a;
        if (obj == null) {
            b();
            map.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(G0.d.T((Set) obj));
            Q0.h.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Q0.h.d(copyOf, "copyOf(this, size)");
            map.put(dVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002d->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Map map = bVar.f757a;
        Map map2 = this.f757a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = bVar.f757a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z2 = Q0.h.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z2 = true;
                    }
                    if (z2) {
                        return false;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f757a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i2 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i2;
    }

    public final String toString() {
        return G0.d.Q(this.f757a.entrySet(), ",\n", "{\n", "\n}", a.f756f, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
