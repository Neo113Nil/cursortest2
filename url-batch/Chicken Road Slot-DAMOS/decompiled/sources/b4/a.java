package b4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.o0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.c f1093b;

    public a(LinkedHashMap linkedHashMap, boolean z10) {
        this.f1092a = linkedHashMap;
        this.f1093b = new d9.c(z10);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f1092a.entrySet();
        int a9 = o0.a(z.j(entrySet, 10));
        if (a9 < 16) {
            a9 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a9);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.f5552d, pair.f5553e);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f1093b.f3701e).get()) {
            i0.l("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(c cVar, Object obj) {
        cVar.getClass();
        d(cVar, obj);
    }

    public final void d(c cVar, Object obj) {
        cVar.getClass();
        b();
        LinkedHashMap linkedHashMap = this.f1092a;
        if (obj == null) {
            b();
            linkedHashMap.remove(cVar);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.T((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(cVar, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(cVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(cVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof a) {
            LinkedHashMap linkedHashMap = ((a) obj).f1092a;
            LinkedHashMap linkedHashMap2 = this.f1092a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z10 = Intrinsics.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z10 = true;
                                }
                                if (z10) {
                                }
                            }
                            z10 = false;
                            if (z10) {
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
        Iterator it = this.f1092a.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i3 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i3;
    }

    public final String toString() {
        return CollectionsKt.B(this.f1092a.entrySet(), ",\n", "{\n", "\n}", new a1.f(12), 24);
    }

    public /* synthetic */ a(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
