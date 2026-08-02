package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdk extends cdv {
    private final cdu a;

    public cdk(cdu cduVar) {
        this.a = cduVar;
    }

    @Override // defpackage.cdv
    public final cdu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdv) {
            return this.a.equals(((cdv) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a.toString() + "}";
    }
}
