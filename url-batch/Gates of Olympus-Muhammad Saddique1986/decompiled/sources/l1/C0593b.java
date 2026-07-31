package l1;

import R1.i;
import S1.B;
import S1.l;
import S1.n;
import f2.j;
import j1.C0555a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6584a;

    /* renamed from: b, reason: collision with root package name */
    public final C0555a f6585b;

    public C0593b(Map map, boolean z3) {
        j.f(map, "preferencesMap");
        this.f6584a = map;
        this.f6585b = new C0555a(z3);
    }

    public final Map a() {
        i iVar;
        Set<Map.Entry> entrySet = this.f6584a.entrySet();
        int J3 = B.J(n.E0(entrySet, 10));
        if (J3 < 16) {
            J3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J3);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                j.e(copyOf, "copyOf(this, size)");
                iVar = new i(key, copyOf);
            } else {
                iVar = new i(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(iVar.f4150d, iVar.f4151e);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j.e(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f6585b.f6365a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(C0595d c0595d, Object obj) {
        j.f(c0595d, "key");
        b();
        Map map = this.f6584a;
        if (obj == null) {
            b();
            map.remove(c0595d);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(l.d1((Set) obj));
            j.e(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(c0595d, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(c0595d, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            j.e(copyOf, "copyOf(this, size)");
            map.put(c0595d, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z3;
        if (!(obj instanceof C0593b)) {
            return false;
        }
        C0593b c0593b = (C0593b) obj;
        Map map = c0593b.f6584a;
        Map map2 = this.f6584a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = c0593b.f6584a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z3 = j.a(value, obj2);
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
        Iterator it = this.f6584a.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i3 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i3;
    }

    public final String toString() {
        return l.P0(this.f6584a.entrySet(), ",\n", "{\n", "\n}", C0592a.f6583e, 24);
    }

    public /* synthetic */ C0593b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
