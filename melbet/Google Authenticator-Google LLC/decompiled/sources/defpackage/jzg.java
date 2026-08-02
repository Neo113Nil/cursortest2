package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzg {
    public final List a;
    public final jwt b;
    public final Object c;

    public jzg(List list, jwt jwtVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        jwtVar.getClass();
        this.b = jwtVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jzg)) {
            return false;
        }
        jzg jzgVar = (jzg) obj;
        return Objects.equals(this.a, jzgVar.a) && Objects.equals(this.b, jzgVar.b) && Objects.equals(this.c, jzgVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("addresses", this.a);
        T.b("loadBalancingPolicyConfig", this.c);
        T.b("attributes", this.b);
        return T.toString();
    }
}
