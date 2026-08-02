package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzf {
    public final jww a;
    public final kaa b;
    public final kae c;
    private final jzd d;

    public jzf(kae kaeVar, kaa kaaVar, jww jwwVar, jzd jzdVar) {
        kaeVar.getClass();
        this.c = kaeVar;
        kaaVar.getClass();
        this.b = kaaVar;
        jwwVar.getClass();
        this.a = jwwVar;
        jzdVar.getClass();
        this.d = jzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jzf jzfVar = (jzf) obj;
            if (Objects.equals(this.a, jzfVar.a) && Objects.equals(this.b, jzfVar.b) && Objects.equals(this.c, jzfVar.c) && Objects.equals(this.d, jzfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        jww jwwVar = this.a;
        kaa kaaVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + kaaVar.toString() + " callOptions=" + jwwVar.toString() + "]";
    }

    public jzf() {
        throw null;
    }
}
