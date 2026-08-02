package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btq extends bvt {
    private final btw a;

    public btq(btw btwVar) {
        if (btwVar == null) {
            throw new NullPointerException("Null displayedOtp");
        }
        this.a = btwVar;
    }

    @Override // defpackage.bvt
    public final btw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvt) {
            return this.a.equals(((bvt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OtpLongClickedEvent{displayedOtp=" + this.a.toString() + "}";
    }
}
