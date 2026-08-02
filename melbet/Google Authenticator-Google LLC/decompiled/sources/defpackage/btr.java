package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btr extends bvu {
    private final btw a;

    public btr(btw btwVar) {
        if (btwVar == null) {
            throw new NullPointerException("Null displayedOtp");
        }
        this.a = btwVar;
    }

    @Override // defpackage.bvu
    public final btw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvu) {
            return this.a.equals(((bvu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OtpSwipedForDeletionEvent{displayedOtp=" + this.a.toString() + "}";
    }
}
