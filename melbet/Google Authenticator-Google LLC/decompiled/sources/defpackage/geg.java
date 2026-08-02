package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class geg extends gdp {
    private final hfm a;

    public geg(hfm hfmVar) {
        if (hfmVar == null) {
            throw new NullPointerException("Null notificationKeys");
        }
        this.a = hfmVar;
    }

    @Override // defpackage.gdp
    public final hfm a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof geg) {
            return this.a.equals(((geg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetKey{notificationKeys=" + this.a.toString() + "}";
    }

    public geg() {
        throw null;
    }
}
