package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgg {
    public final jit a;
    public final jgi b;
    public final String c;
    public final String d;
    public final jht e;
    public final jhy f;
    public final int g;

    public jgg(jit jitVar, jgi jgiVar, String str, String str2, int i, jht jhtVar, jhy jhyVar) {
        this.a = jitVar;
        this.b = jgiVar;
        this.c = str;
        this.d = str2;
        this.g = i;
        this.e = jhtVar;
        this.f = jhyVar;
    }

    public static /* synthetic */ jgg a(jgg jggVar, jgi jgiVar, jhy jhyVar, int i) {
        jit jitVar = (i & 1) != 0 ? jggVar.a : null;
        if ((i & 2) != 0) {
            jgiVar = jggVar.b;
        }
        jgi jgiVar2 = jgiVar;
        String str = (i & 4) != 0 ? jggVar.c : null;
        String str2 = (i & 8) != 0 ? jggVar.d : null;
        int i2 = (i & 16) != 0 ? jggVar.g : 0;
        jht jhtVar = (i & 32) != 0 ? jggVar.e : null;
        if ((i & 64) != 0) {
            jhyVar = jggVar.f;
        }
        jhy jhyVar2 = jhyVar;
        jitVar.getClass();
        jgiVar2.getClass();
        str.getClass();
        if (i2 != 0) {
            return new jgg(jitVar, jgiVar2, str, str2, i2, jhtVar, jhyVar2);
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgg)) {
            return false;
        }
        jgg jggVar = (jgg) obj;
        return ksp.b(this.a, jggVar.a) && ksp.b(this.b, jggVar.b) && ksp.b(this.c, jggVar.c) && ksp.b(this.d, jggVar.d) && this.g == jggVar.g && ksp.b(this.e, jggVar.e) && ksp.b(this.f, jggVar.f);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.g) * 31;
        jht jhtVar = this.e;
        int hashCode3 = (hashCode2 + (jhtVar == null ? 0 : jhtVar.hashCode())) * 31;
        jhy jhyVar = this.f;
        return hashCode3 + (jhyVar != null ? jhyVar.hashCode() : 0);
    }

    public final String toString() {
        return "AvailableAccountData(accountIdentifier=" + this.a + ", avatarData=" + this.b + ", primaryText=" + this.c + ", secondaryText=" + this.d + ", accountState=" + ((Object) ile.a(this.g)) + ", trailingContentData=" + this.e + ", criticalAlertCard=" + this.f + ")";
    }
}
