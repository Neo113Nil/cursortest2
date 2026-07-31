package i1;

import L1.j;
import M1.B;
import M1.l;
import M1.n;
import Z1.i;
import g1.C0394a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5105a;

    /* renamed from: b, reason: collision with root package name */
    public final C0394a f5106b;

    public C0465b(Map map, boolean z3) {
        i.f(map, "preferencesMap");
        this.f5105a = map;
        this.f5106b = new C0394a(z3);
    }

    public final Map a() {
        j jVar;
        Set<Map.Entry> entrySet = this.f5105a.entrySet();
        int I3 = B.I(n.g0(entrySet, 10));
        if (I3 < 16) {
            I3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I3);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                i.e(copyOf, "copyOf(this, size)");
                jVar = new j(key, copyOf);
            } else {
                jVar = new j(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(jVar.f2708d, jVar.f2709e);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.e(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f5106b.f4796a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(C0467d c0467d, Object obj) {
        i.f(c0467d, "key");
        b();
        Map map = this.f5105a;
        if (obj == null) {
            b();
            map.remove(c0467d);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(l.F0((Set) obj));
            i.e(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(c0467d, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(c0467d, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            i.e(copyOf, "copyOf(this, size)");
            map.put(c0467d, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z3;
        if (!(obj instanceof C0465b)) {
            return false;
        }
        C0465b c0465b = (C0465b) obj;
        Map map = c0465b.f5105a;
        Map map2 = this.f5105a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = c0465b.f5105a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z3 = i.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z3 = true;
                    }
                    if (z3) {
                        return false;
                    }
                }
                z3 = false;
                if (z3) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f5105a.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i3 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i3;
    }

    public final String toString() {
        return l.r0(this.f5105a.entrySet(), ",\n", "{\n", "\n}", C0464a.f5104e, 24);
    }

    public /* synthetic */ C0465b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
