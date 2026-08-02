package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdo extends gdp {
    private final String a;

    public gdo(String str) {
        this.a = str;
    }

    @Override // defpackage.gdp
    public final hfm a() {
        return new hjn(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gdo) {
            return this.a.equals(((gdo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SingleStringKey{stringRepresentation=" + this.a + "}";
    }

    public gdo() {
        throw null;
    }
}
