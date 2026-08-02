package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuu {
    public final String a;
    public final fut b;

    public fuu(String str, fut futVar) {
        this.a = str;
        this.b = futVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fuu) {
            fuu fuuVar = (fuu) obj;
            if (this.a.equals(fuuVar.a) && this.b.equals(fuuVar.b)) {
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
        return "AccountProviderConfig{type=" + this.a + ", provider=" + String.valueOf(this.b) + "}";
    }

    public fuu() {
        throw null;
    }
}
