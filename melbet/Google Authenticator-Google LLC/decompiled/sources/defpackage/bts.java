package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bts extends bvv {
    private final btw a;

    public bts(btw btwVar) {
        if (btwVar == null) {
            throw new NullPointerException("Null displayedOtp");
        }
        this.a = btwVar;
    }

    @Override // defpackage.bvv
    public final btw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvv) {
            return this.a.equals(((bvv) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OtpSwipedForEditEvent{displayedOtp=" + this.a.toString() + "}";
    }
}
