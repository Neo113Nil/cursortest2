package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bto extends bvr {
    private final btw a;

    public bto(btw btwVar) {
        if (btwVar == null) {
            throw new NullPointerException("Null displayedOtp");
        }
        this.a = btwVar;
    }

    @Override // defpackage.bvr
    public final btw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvr) {
            return this.a.equals(((bvr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CreateHotpCodeEvent{displayedOtp=" + this.a.toString() + "}";
    }
}
