package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byj {
    public final String a;
    public final String b;
    public final boolean c;

    public byj(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null uniqueId");
        }
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byj) {
            byj byjVar = (byj) obj;
            if (this.a.equals(byjVar.a) && this.b.equals(byjVar.b) && this.c == byjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OtpForExport{name=" + this.a + ", uniqueId=" + this.b + ", isChecked=" + this.c + "}";
    }

    public byj() {
        throw null;
    }
}
