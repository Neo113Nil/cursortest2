package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class din {
    public final int a;
    private final long b;
    private final String c;
    private final String d;

    public din(int i, long j, String str, String str2) {
        this.a = i;
        this.b = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof din) {
            din dinVar = (din) obj;
            if (this.a == dinVar.a && this.b == dinVar.b && this.c.equals(dinVar.c) && this.d.equals(dinVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = ((i ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "ThreadIdentifier{tid=" + this.a + ", id=" + this.b + ", name=" + this.c + ", threadPoolName=" + this.d + "}";
    }

    public din() {
        throw null;
    }
}
