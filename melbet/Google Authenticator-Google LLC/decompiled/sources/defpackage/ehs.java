package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehs {
    public final ehr a;
    private final boolean b;
    private final String c;
    private final dke d;
    private final int e;

    public ehs(ehr ehrVar, String str, dke dkeVar, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = ehrVar;
        this.b = true;
        this.c = str;
        this.d = dkeVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehs)) {
            return false;
        }
        ehs ehsVar = (ehs) obj;
        if (!ksp.b(this.a, ehsVar.a)) {
            return false;
        }
        boolean z = ehsVar.b;
        return ksp.b(this.c, ehsVar.c) && ksp.b(this.d, ehsVar.d) && this.e == ehsVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.c;
        return ((((((hashCode + 1231) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final String toString() {
        return "AccountSnapshot(accountInfo=" + this.a + ", isMetadataAvailable=true, avatarUrl=" + this.c + ", logAuthSpec=" + this.d + ", isUnicornUser=" + ((Object) a.w(this.e)) + ")";
    }
}
