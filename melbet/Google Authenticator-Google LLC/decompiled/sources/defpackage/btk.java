package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btk extends buq {
    private final frv a;

    public btk(frv frvVar) {
        this.a = frvVar;
    }

    @Override // defpackage.buq
    public final frv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof buq) {
            return this.a.equals(((buq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddFirstOtpEvent{accountId=" + this.a.toString() + "}";
    }
}
