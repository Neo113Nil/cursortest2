package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kme {
    final jzm a;
    final Object b;

    public kme(jzm jzmVar, Object obj) {
        this.a = jzmVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kme kmeVar = (kme) obj;
            if (Objects.equals(this.a, kmeVar.a) && Objects.equals(this.b, kmeVar.b)) {
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
        T.b("provider", this.a);
        T.b("config", this.b);
        return T.toString();
    }
}
