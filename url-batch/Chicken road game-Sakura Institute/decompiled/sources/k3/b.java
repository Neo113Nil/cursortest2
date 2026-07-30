package k3;

import d6.j;
import e6.d0;
import e6.l;
import e6.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5347a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.a f5348b;

    public b(LinkedHashMap linkedHashMap, boolean z8) {
        this.f5347a = linkedHashMap;
        this.f5348b = new i3.a(z8);
    }

    public final Map a() {
        j jVar;
        Set<Map.Entry> entrySet = this.f5347a.entrySet();
        int h02 = d0.h0(n.a0(entrySet, 10));
        if (h02 < 16) {
            h02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h02);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                k.e(copyOf, "copyOf(this, size)");
                jVar = new j(key, copyOf);
            } else {
                jVar = new j(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(jVar.f2618f, jVar.f2619g);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.e(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f5348b.f4886a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(d dVar, Object obj) {
        k.f(dVar, "key");
        b();
        LinkedHashMap linkedHashMap = this.f5347a;
        if (obj == null) {
            b();
            linkedHashMap.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(l.z0((Set) obj));
            k.e(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(dVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            k.e(copyOf, "copyOf(this, size)");
            linkedHashMap.put(dVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z8;
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f5347a;
            LinkedHashMap linkedHashMap2 = this.f5347a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z8 = k.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z8 = true;
                                }
                                if (z8) {
                                }
                            }
                            z8 = false;
                            if (z8) {
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
        Iterator it = this.f5347a.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i7 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i7;
    }

    public final String toString() {
        return l.m0(this.f5347a.entrySet(), ",\n", "{\n", "\n}", a.f5346g, 24);
    }

    public /* synthetic */ b(boolean z8) {
        this(new LinkedHashMap(), z8);
    }
}
