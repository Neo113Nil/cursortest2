package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iec {
    public final String a;

    public iec(String str) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof iec) && this.a.equals(((iec) obj).a);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 443) * 1000003) ^ 443;
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=443, alternatePort=443}";
    }

    public iec() {
        throw null;
    }
}
