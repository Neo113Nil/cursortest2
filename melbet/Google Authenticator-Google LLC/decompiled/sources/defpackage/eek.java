package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eek {
    private final dih a;

    public eek(dih dihVar) {
        this.a = dihVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eek) {
            return this.a.equals(((eek) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogoViewFeature{logoViewInflater=" + this.a.toString() + "}";
    }

    public eek() {
        throw null;
    }
}
