package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idf {
    public static final jwv a = new jwv("com.google.frameworks.client.data.android.auth.AuthContext", null);
    public final String b;
    public final String c;

    public idf(String str, String str2) {
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idf) {
            idf idfVar = (idf) obj;
            String str = this.b;
            if (str != null ? str.equals(idfVar.b) : idfVar.b == null) {
                if (this.c.equals(idfVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AuthContext{identifier=" + this.b + ", type=" + this.c + "}";
    }

    public idf() {
        throw null;
    }
}
