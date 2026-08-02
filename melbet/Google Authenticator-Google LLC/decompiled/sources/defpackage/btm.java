package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btm extends but {
    private final frv a;

    public btm(frv frvVar) {
        this.a = frvVar;
    }

    @Override // defpackage.but
    public final frv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof but) {
            return this.a.equals(((but) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddOTPViaQrCodeFabEvent{accountId=" + this.a.toString() + "}";
    }
}
