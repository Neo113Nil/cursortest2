package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btp extends bvs {
    private final btw a;

    public btp(btw btwVar) {
        if (btwVar == null) {
            throw new NullPointerException("Null displayedOtp");
        }
        this.a = btwVar;
    }

    @Override // defpackage.bvs
    public final btw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvs) {
            return this.a.equals(((bvs) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OtpClickedEvent{displayedOtp=" + this.a.toString() + "}";
    }
}
