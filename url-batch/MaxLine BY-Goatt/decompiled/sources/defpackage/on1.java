package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class on1 extends d42 {
    public final LinkedHashMap a;
    public final ar0 b;

    public on1(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new ar0(z);
    }

    @Override // defpackage.d42
    public final Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        int a = li1.a(rv.l(entrySet, 10));
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
            linkedHashMap.put(pair.m, pair.n);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.n).get()) {
            lh.g("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(b42 b42Var, Object obj) {
        b42Var.getClass();
        d(b42Var, obj);
    }

    public final void d(b42 b42Var, Object obj) {
        b42Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(b42Var);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(zv.Q((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(b42Var, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(b42Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(b42Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof on1) {
            LinkedHashMap linkedHashMap = ((on1) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = Intrinsics.b(value, obj2);
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
        return zv.A(this.a.entrySet(), ",\n", "{\n", "\n}", bl0.F, 24);
    }

    public /* synthetic */ on1(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
