package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gb extends hh {
    public final db a;

    public gb(db dbVar) {
        this.a = dbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        Object obj2 = gh.d;
        if (obj2.equals(obj2)) {
            return this.a.equals(((gb) hhVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((gh.d.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + gh.d + ", androidClientInfo=" + this.a + "}";
    }
}
