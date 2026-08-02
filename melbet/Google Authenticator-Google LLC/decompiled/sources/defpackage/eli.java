package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eli {
    public final boolean a;
    private final hel b;

    public eli(boolean z, hel helVar) {
        this.a = z;
        if (helVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = helVar;
    }

    public final hel a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eli) {
            eli eliVar = (eli) obj;
            if (this.a == eliVar.a && hnu.H(this.b, eliVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public eli() {
        throw null;
    }
}
