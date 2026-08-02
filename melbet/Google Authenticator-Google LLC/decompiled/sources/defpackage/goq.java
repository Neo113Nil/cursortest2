package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class goq {
    public final icz a;

    public goq(icz iczVar) {
        this.a = iczVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof goq) && this.a.equals(((goq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 583896283;
    }

    public final String toString() {
        return "GrpcClientConfig{host=null, port=null, rpcServiceConfig=" + String.valueOf(this.a) + "}";
    }

    public goq() {
        throw null;
    }
}
