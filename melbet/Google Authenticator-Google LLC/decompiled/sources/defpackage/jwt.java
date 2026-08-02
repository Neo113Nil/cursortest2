package defpackage;

import j$.util.Objects;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwt {
    public static final jwt a;
    private static final IdentityHashMap c;
    public final IdentityHashMap b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c = identityHashMap;
        a = new jwt(identityHashMap);
    }

    public jwt(IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final Object a(jws jwsVar) {
        return this.b.get(jwsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.b;
        IdentityHashMap identityHashMap2 = ((jwt) obj).b;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            i += Objects.hash(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
