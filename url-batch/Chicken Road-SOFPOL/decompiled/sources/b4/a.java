package b4;

import d6.m;
import d6.n;
import d6.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1239a;

    /* renamed from: b, reason: collision with root package name */
    public final b1.b f1240b;

    public a(LinkedHashMap linkedHashMap, boolean z3) {
        this.f1239a = linkedHashMap;
        this.f1240b = new b1.b(z3);
    }

    public final Map a() {
        c6.f fVar;
        Set<Map.Entry> entrySet = this.f1239a.entrySet();
        int F = y.F(n.M(entrySet, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(copyOf, "copyOf(...)");
                fVar = new c6.f(key, copyOf);
            } else {
                fVar = new c6.f(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(fVar.f1747d, fVar.f1748e);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f1240b.f1050e).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(c cVar) {
        i.e(cVar, "key");
        Object obj = this.f1239a.get(cVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final void d(c cVar, Object obj) {
        i.e(cVar, "key");
        b();
        LinkedHashMap linkedHashMap = this.f1239a;
        if (obj == null) {
            b();
            linkedHashMap.remove(cVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(m.j0((Set) obj));
            i.d(unmodifiableSet, "unmodifiableSet(...)");
            linkedHashMap.put(cVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(cVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            i.d(copyOf, "copyOf(...)");
            linkedHashMap.put(cVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z3;
        if (obj instanceof a) {
            LinkedHashMap linkedHashMap = ((a) obj).f1239a;
            LinkedHashMap linkedHashMap2 = this.f1239a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z3 = i.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z3 = true;
                                }
                                if (z3) {
                                }
                            }
                            z3 = false;
                            if (z3) {
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
        Iterator it = this.f1239a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return m.W(this.f1239a.entrySet(), ",\n", "{\n", "\n}", new a4.a(2), 24);
    }

    public /* synthetic */ a(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
