package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdz {
    public final String a;
    public final boolean b;
    public final int c;

    public jdz(String str) {
        this.a = str;
        this.b = true;
        this.c = 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jdz) {
            jdz jdzVar = (jdz) obj;
            if (this.a.equals(jdzVar.a) && this.b == jdzVar.b && this.c == jdzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.c ^ (((hashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.a + ", enableFirelog=" + this.b + ", firelogEventType=" + this.c + "}";
    }

    public jdz() {
        throw null;
    }
}
