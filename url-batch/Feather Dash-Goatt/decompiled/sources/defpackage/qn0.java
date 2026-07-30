package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qn0 {
    public final LinkedHashMap a;
    public final s40 b;

    public qn0(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new s40(z);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int a = hk0.a(ai.h(entrySet));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.d, pair.e);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.e).get()) {
            dd0.j("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(hy0 hy0Var) {
        hy0Var.getClass();
        Object obj = this.a.get(hy0Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final void d(hy0 hy0Var, Object obj) {
        hy0Var.getClass();
        e(hy0Var, obj);
    }

    public final void e(hy0 hy0Var, Object obj) {
        hy0Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(hy0Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.A((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(hy0Var, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(hy0Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(hy0Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof qn0) {
            LinkedHashMap linkedHashMap = ((qn0) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = Intrinsics.a(value, obj2);
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
        Iterator it = this.a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return CollectionsKt.r(this.a.entrySet(), ",\n", "{\n", "\n}", y3.w, 24);
    }

    public /* synthetic */ qn0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
