package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btl extends bus {
    private final frv a;

    public btl(frv frvVar) {
        this.a = frvVar;
    }

    @Override // defpackage.bus
    public final frv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bus) {
            return this.a.equals(((bus) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddOTPManuallyFabEvent{accountId=" + this.a.toString() + "}";
    }
}
