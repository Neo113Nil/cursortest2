package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iev {
    private final String a;
    private final idf b;
    private final String c;

    public iev(String str, idf idfVar, String str2) {
        if (str == null) {
            throw new NullPointerException("Null endpoint");
        }
        this.a = str;
        this.b = idfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        idf idfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iev) {
            iev ievVar = (iev) obj;
            if (this.a.equals(ievVar.a) && ((idfVar = this.b) != null ? idfVar.equals(ievVar.b) : ievVar.b == null) && this.c.equals(ievVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        idf idfVar = this.b;
        return this.c.hashCode() ^ (((hashCode * 1000003) ^ (idfVar == null ? 0 : idfVar.hashCode())) * 1000003);
    }

    public final String toString() {
        return "InterceptorId{endpoint=" + this.a + ", authContext=" + String.valueOf(this.b) + ", methodName=" + this.c + "}";
    }

    public iev() {
        throw null;
    }
}
