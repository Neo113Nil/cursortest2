package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btn extends bux {
    private final btw a;

    public btn(btw btwVar) {
        if (btwVar == null) {
            throw new NullPointerException("Null displayedOtp");
        }
        this.a = btwVar;
    }

    @Override // defpackage.bux
    public final btw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bux) {
            return this.a.equals(((bux) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DeleteOtpEvent{displayedOtp=" + this.a.toString() + "}";
    }
}
