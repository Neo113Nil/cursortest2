package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzc {
    public final jit a;
    public final jgi b;
    public final int c;

    public dzc(jit jitVar, jgi jgiVar, int i) {
        this.a = jitVar;
        this.b = jgiVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzc)) {
            return false;
        }
        dzc dzcVar = (dzc) obj;
        return ksp.b(this.a, dzcVar.a) && ksp.b(this.b, dzcVar.b) && this.c == dzcVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "AvatarDataWithIdentifier(accountIdentifier=" + this.a + ", avatarData=" + this.b + ", accountState=" + ((Object) ile.a(this.c)) + ")";
    }
}
