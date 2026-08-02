package N;

import c3.C0292d;
import d3.k;
import d3.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1785a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.h f1786b;

    public b(LinkedHashMap linkedHashMap, boolean z) {
        this.f1785a = linkedHashMap;
        this.f1786b = new t1.h(z);
    }

    public final Map a() {
        C0292d c0292d;
        Set<Map.Entry> entrySet = this.f1785a.entrySet();
        int z = u.z(k.Y(entrySet));
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(copyOf, "copyOf(this, size)");
                c0292d = new C0292d(key, copyOf);
            } else {
                c0292d = new C0292d(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c0292d.f5724a, c0292d.f5725b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f1786b.f15398b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d key) {
        i.e(key, "key");
        Object obj = this.f1785a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        i.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(d key, Object obj) {
        i.e(key, "key");
        b();
        LinkedHashMap linkedHashMap = this.f1785a;
        if (obj == null) {
            b();
            linkedHashMap.remove(key);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(d3.i.p0((Set) obj));
            i.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            i.d(copyOf, "copyOf(this, size)");
            linkedHashMap.put(key, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f1785a;
            LinkedHashMap linkedHashMap2 = this.f1785a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f1785a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = i.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
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
        Iterator it = this.f1785a.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i4 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i4;
    }

    public final String toString() {
        return d3.i.g0(this.f1785a.entrySet(), ",\n", "{\n", "\n}", a.f1784e, 24);
    }

    public /* synthetic */ b(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
