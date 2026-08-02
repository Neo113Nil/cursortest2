package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqz {
    public final String a;
    public final ful b;
    public final boolean c;
    private final String d;

    public bqz(String str, ful fulVar, String str2, boolean z) {
        this.a = str;
        this.b = fulVar;
        this.d = str2;
        this.c = z;
    }

    public static bqz a(ful fulVar, boolean z) {
        String str = fulVar.g;
        if (str == null) {
            throw new NullPointerException("Null email");
        }
        String str2 = fulVar.c;
        if (str2 != null) {
            return new bqz(str, fulVar, str2, z);
        }
        throw new NullPointerException("Null obfuscatedGaiaId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqz) {
            bqz bqzVar = (bqz) obj;
            if (this.a.equals(bqzVar.a) && this.b.equals(bqzVar.b) && this.d.equals(bqzVar.d) && this.c == bqzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LocalAccount{email=" + this.a + ", accountInfo=" + String.valueOf(this.b) + ", obfuscatedGaiaId=" + this.d + ", isCheckedOnStart=" + this.c + "}";
    }

    public bqz() {
        throw null;
    }
}
