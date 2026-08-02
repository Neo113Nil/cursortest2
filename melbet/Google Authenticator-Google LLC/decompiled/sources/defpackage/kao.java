package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kao {
    public final kbs a;
    public final jwt b;
    public final kam c;

    public kao(kbs kbsVar, jwt jwtVar, kam kamVar) {
        this.a = kbsVar;
        jwtVar.getClass();
        this.b = jwtVar;
        this.c = kamVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kao)) {
            return false;
        }
        kao kaoVar = (kao) obj;
        return Objects.equals(this.a, kaoVar.a) && Objects.equals(this.b, kaoVar.b) && Objects.equals(this.c, kaoVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("addressesOrError", this.a.toString());
        T.b("attributes", this.b);
        T.b("serviceConfigOrError", this.c);
        return T.toString();
    }
}
