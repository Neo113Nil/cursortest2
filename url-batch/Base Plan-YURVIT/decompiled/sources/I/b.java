package I;

import B0.E;
import a.AbstractC0086a;
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
    public final LinkedHashMap f514a;

    /* renamed from: b, reason: collision with root package name */
    public final E f515b;

    public b(LinkedHashMap linkedHashMap, boolean z2) {
        this.f514a = linkedHashMap;
        this.f515b = new E(z2);
    }

    public final Map a() {
        D0.c cVar;
        Set<Map.Entry> entrySet = this.f514a.entrySet();
        P0.h.e(entrySet, "<this>");
        int y2 = AbstractC0086a.y(entrySet.size());
        if (y2 < 16) {
            y2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y2);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                P0.h.d(copyOf, "copyOf(this, size)");
                cVar = new D0.c(key, copyOf);
            } else {
                cVar = new D0.c(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(cVar.f199e, cVar.f200f);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        P0.h.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f515b.f20f).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        P0.h.e(dVar, "key");
        Object obj = this.f514a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        P0.h.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(d dVar, Object obj) {
        b();
        LinkedHashMap linkedHashMap = this.f514a;
        if (obj == null) {
            b();
            linkedHashMap.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(E0.f.T((Set) obj));
            P0.h.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(dVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            P0.h.d(copyOf, "copyOf(this, size)");
            linkedHashMap.put(dVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f514a;
            LinkedHashMap linkedHashMap2 = this.f514a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f514a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z2 = P0.h.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z2 = true;
                                }
                                if (z2) {
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f514a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i2 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i2;
    }

    public final String toString() {
        return E0.f.Q(this.f514a.entrySet(), ",\n", "{\n", "\n}", a.f513f, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
