package j1;

import h1.C0648a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1411O;
import z2.C1442z;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7144a;

    /* renamed from: b, reason: collision with root package name */
    public final C0648a f7145b;

    public C0708b(Map preferencesMap, boolean z4) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f7144a = preferencesMap;
        this.f7145b = new C0648a(z4);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f7144a.entrySet();
        int a4 = C1411O.a(C1442z.h(entrySet, 10));
        if (a4 < 16) {
            a4 = 16;
        }
        LinkedHashMap map = new LinkedHashMap(a4);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.f7485d, pair.f7486e);
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (this.f7145b.f6827a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(C0710d key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        Map map = this.f7144a;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            b();
            map.remove(key);
        } else {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                Intrinsics.checkNotNullParameter(set, "set");
                Set unmodifiableSet = Collections.unmodifiableSet(C1403G.K(set));
                Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(set.toSet())");
                map.put(key, unmodifiableSet);
                return;
            }
            if (!(obj instanceof byte[])) {
                map.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            map.put(key, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z4;
        if (!(obj instanceof C0708b)) {
            return false;
        }
        C0708b c0708b = (C0708b) obj;
        Map map = c0708b.f7144a;
        Map map2 = this.f7144a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = c0708b.f7144a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z4 = Intrinsics.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z4 = true;
                    }
                    if (z4) {
                        return false;
                    }
                }
                z4 = false;
                if (z4) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f7144a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i2 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i2;
    }

    public final String toString() {
        return C1403G.w(this.f7144a.entrySet(), ",\n", "{\n", "\n}", C0707a.f7143d, 24);
    }

    public /* synthetic */ C0708b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
