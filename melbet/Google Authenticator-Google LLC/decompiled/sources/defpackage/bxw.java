package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxw extends byn {
    private final byj a;

    public bxw(byj byjVar) {
        this.a = byjVar;
    }

    @Override // defpackage.byn
    public final byj a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byn) {
            return this.a.equals(((byn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OtpClickedTransformedEvent{otpForExport=" + this.a.toString() + "}";
    }
}
