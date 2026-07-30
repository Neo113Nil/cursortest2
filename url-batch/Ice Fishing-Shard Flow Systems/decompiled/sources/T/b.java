package T;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.H;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final B.f f2551b;

    public b(LinkedHashMap preferencesMap, boolean z7) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f2550a = preferencesMap;
        this.f2551b = new B.f(z7);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f2550a.entrySet();
        int a7 = H.a(s.g(entrySet, 10));
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap map = new LinkedHashMap(a7);
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
            map.put(pair.f6112d, pair.f6113e);
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f2551b.f152e).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f2550a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        this.f2550a.remove(key);
    }

    public final void e(d key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z7;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f2550a;
            LinkedHashMap linkedHashMap2 = this.f2550a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f2550a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z7 = Intrinsics.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z7 = true;
                                }
                                if (z7) {
                                }
                            }
                            z7 = false;
                            if (z7) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(d key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z7 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f2550a;
        if (z7) {
            Set set = (Set) obj;
            Intrinsics.checkNotNullParameter(set, "set");
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.C(set));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            linkedHashMap.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        linkedHashMap.put(key, copyOf);
    }

    public final int hashCode() {
        Iterator it = this.f2550a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i2 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i2;
    }

    public final String toString() {
        return CollectionsKt.s(this.f2550a.entrySet(), ",\n", "{\n", "\n}", a.f2549d, 24);
    }

    public /* synthetic */ b(boolean z7) {
        this(new LinkedHashMap(), z7);
    }
}
