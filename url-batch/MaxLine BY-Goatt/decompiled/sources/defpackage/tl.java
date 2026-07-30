package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tl extends qu {
    public final ql a;

    public tl(ql qlVar) {
        this.a = qlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        Object obj2 = pu.m;
        if (obj2.equals(obj2)) {
            return this.a.equals(((tl) quVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((pu.m.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + pu.m + ", androidClientInfo=" + this.a + "}";
    }
}
