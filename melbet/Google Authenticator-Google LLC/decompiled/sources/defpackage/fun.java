package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fun {
    public final frv a;
    private final ful b;

    public fun(frv frvVar, ful fulVar) {
        if (frvVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = frvVar;
        this.b = fulVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fun) {
            fun funVar = (fun) obj;
            if (this.a.equals(funVar.a) && this.b.equals(funVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        ful fulVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + fulVar.toString() + "}";
    }

    public fun() {
        throw null;
    }
}
