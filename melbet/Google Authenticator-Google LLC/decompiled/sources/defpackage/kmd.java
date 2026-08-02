package defpackage;

import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmd {
    public final String a;
    public final Map b;

    public kmd(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kmd) {
            kmd kmdVar = (kmd) obj;
            if (this.a.equals(kmdVar.a) && this.b.equals(kmdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("policyName", this.a);
        T.b("rawConfigValue", this.b);
        return T.toString();
    }
}
