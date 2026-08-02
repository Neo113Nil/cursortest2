package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiz {
    public final kkx a;
    public final Object b;
    public final Map c;
    private final kix d;
    private final Map e;
    private final Map f;

    public kiz(kix kixVar, Map map, Map map2, kkx kkxVar, Object obj, Map map3) {
        this.d = kixVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = kkxVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final jym a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new kiy(this);
    }

    final kix b(kae kaeVar) {
        kix kixVar = (kix) this.e.get(kaeVar.b);
        if (kixVar == null) {
            kixVar = (kix) this.f.get(kaeVar.c);
        }
        return kixVar == null ? this.d : kixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kiz kizVar = (kiz) obj;
            if (Objects.equals(this.d, kizVar.d) && Objects.equals(this.e, kizVar.e) && Objects.equals(this.f, kizVar.f) && Objects.equals(this.a, kizVar.a) && Objects.equals(this.b, kizVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.e, this.f, this.a, this.b);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("defaultMethodConfig", this.d);
        T.b("serviceMethodMap", this.e);
        T.b("serviceMap", this.f);
        T.b("retryThrottling", this.a);
        T.b("loadBalancingConfig", this.b);
        return T.toString();
    }
}
