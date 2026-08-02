package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cey {
    public final long a;
    public final String b;
    public final int c;

    public cey(int i, long j, String str) {
        this.c = i;
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cey) {
            cey ceyVar = (cey) obj;
            if (this.c == ceyVar.c && this.a == ceyVar.a && ((str = this.b) != null ? str.equals(ceyVar.b) : ceyVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.a;
        return ((((this.c ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ hashCode;
    }

    public final String toString() {
        int i = this.c;
        return "BackendResponse{status=" + (i != 1 ? i != 2 ? i != 3 ? "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK") + ", nextRequestWaitMillis=" + this.a + ", updatedPseudonymousId=" + this.b + "}";
    }

    public cey() {
        throw null;
    }
}
