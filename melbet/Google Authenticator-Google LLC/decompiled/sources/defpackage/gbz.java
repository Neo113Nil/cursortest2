package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbz {
    public final String a;
    public final int b;

    public gbz(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gbz) {
            gbz gbzVar = (gbz) obj;
            if (this.a.equals(gbzVar.a) && this.b == gbzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + (i != 1 ? i != 2 ? "UPDATE" : "KEEP" : "REPLACE") + "}";
    }

    public gbz() {
        throw null;
    }
}
