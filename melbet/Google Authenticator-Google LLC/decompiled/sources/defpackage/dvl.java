package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvl {
    public final eba a;
    public final eba b;
    public final ijy c;

    public dvl(eba ebaVar, eba ebaVar2, ijy ijyVar) {
        this.a = ebaVar;
        this.b = ebaVar2;
        this.c = ijyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvl)) {
            return false;
        }
        dvl dvlVar = (dvl) obj;
        return ksp.b(this.a, dvlVar.a) && ksp.b(this.b, dvlVar.b) && ksp.b(this.c, dvlVar.c);
    }

    public final int hashCode() {
        eba ebaVar = this.a;
        int hashCode = ebaVar == null ? 0 : ebaVar.hashCode();
        eba ebaVar2 = this.b;
        int hashCode2 = ebaVar2 == null ? 0 : ebaVar2.hashCode();
        int i = hashCode * 31;
        ijy ijyVar = this.c;
        return ((i + hashCode2) * 31) + (ijyVar != null ? ijyVar.hashCode() : 0);
    }

    public final String toString() {
        return "G1AccountData(storageCard=" + this.a + ", aiCard=" + this.b + ", profileBadge=" + this.c + ")";
    }

    public dvl() {
        this(null, null, null);
    }
}
