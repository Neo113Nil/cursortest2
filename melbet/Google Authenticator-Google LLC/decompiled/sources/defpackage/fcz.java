package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcz {
    public final jll a;
    private final jkd b;

    public fcz(jll jllVar, jkd jkdVar) {
        if (jllVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = jllVar;
        if (jkdVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = jkdVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, jll] */
    public final jll a(InputStream inputStream) {
        return this.a.E().g(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fcz) {
            fcz fczVar = (fcz) obj;
            if (this.a.equals(fczVar.a) && this.b.equals(fczVar.b)) {
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
        jkd jkdVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + jkdVar.toString() + "}";
    }

    public fcz() {
        throw null;
    }
}
