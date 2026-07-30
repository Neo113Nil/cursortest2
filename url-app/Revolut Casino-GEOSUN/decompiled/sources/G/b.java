package G;

import A.j;
import F0.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import u0.C0242b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f327a;

    /* renamed from: b, reason: collision with root package name */
    public final j f328b;

    public b(Map map, boolean z2) {
        i.e(map, "preferencesMap");
        this.f327a = map;
        this.f328b = new j(z2);
    }

    public final Map a() {
        C0242b c0242b;
        Set<Map.Entry> entrySet = this.f327a.entrySet();
        i.e(entrySet, "<this>");
        int t2 = o.g.t(entrySet.size());
        if (t2 < 16) {
            t2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(t2);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(copyOf, "copyOf(this, size)");
                c0242b = new C0242b(key, copyOf);
            } else {
                c0242b = new C0242b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c0242b.f2998e, c0242b.f2999f);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f328b.f30f).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        i.e(dVar, "key");
        Object obj = this.f327a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        i.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(d dVar, Object obj) {
        b();
        Map map = this.f327a;
        if (obj == null) {
            b();
            map.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(v0.d.G((Set) obj));
            i.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            i.d(copyOf, "copyOf(this, size)");
            map.put(dVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Map map = bVar.f327a;
        Map map2 = this.f327a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = bVar.f327a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z2 = i.a(value, obj2);
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
        Iterator it = this.f327a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i2 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i2;
    }

    public final String toString() {
        return v0.d.D(this.f327a.entrySet(), ",\n", "{\n", "\n}", a.f326f, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
