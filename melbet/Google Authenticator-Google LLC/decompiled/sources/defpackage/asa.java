package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asa {
    public static final asa a = new brn((char[]) null, (char[]) null).x();
    public final Map b;

    public asa(asa asaVar) {
        asaVar.getClass();
        this.b = new HashMap(asaVar.b);
    }

    public final Map a() {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(this.b);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public final boolean b(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final long c(String str) {
        Object obj = this.b.get(str);
        return ((Number) (true == (obj instanceof Long) ? obj : 0L)).longValue();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !ksp.b(getClass(), obj.getClass())) {
            return false;
        }
        Map map = this.b;
        Map map2 = ((asa) obj).b;
        Set<String> keySet = map.keySet();
        if (!ksp.b(keySet, map2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = map.get(str);
            Object obj3 = map2.get(str);
            if (obj2 == null || obj3 == null) {
                z = obj2 == obj3;
            } else {
                if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if (obj3 instanceof Object[]) {
                        z = ixc.C(objArr, (Object[]) obj3);
                    }
                }
                z = ksp.b(obj2, obj3);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return "Data {" + ixc.y(this.b.entrySet(), null, null, null, new ajt(5), 31) + "}";
    }

    public asa(Map map) {
        this.b = new HashMap(map);
    }
}
