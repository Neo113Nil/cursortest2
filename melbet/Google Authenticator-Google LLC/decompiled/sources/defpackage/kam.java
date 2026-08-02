package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kam {
    public final kbq a;
    public final Object b;

    public kam(kbq kbqVar) {
        this.b = null;
        this.a = kbqVar;
        hoq.C(!kbqVar.g(), "cannot use OK status: %s", kbqVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kam kamVar = (kam) obj;
            if (Objects.equals(this.a, kamVar.a) && Objects.equals(this.b, kamVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            gzo T = hoq.T(this);
            T.b("config", obj);
            return T.toString();
        }
        gzo T2 = hoq.T(this);
        T2.b("error", this.a);
        return T2.toString();
    }

    public kam(Object obj) {
        this.b = obj;
        this.a = null;
    }
}
