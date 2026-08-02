package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bor extends bol {
    private final frv a;

    public bor(frv frvVar) {
        this.a = frvVar;
    }

    @Override // defpackage.bol
    public final frv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bol) {
            return this.a.equals(((bol) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AddViaEnteringKeyEvent{accountId=" + this.a.toString() + "}";
    }
}
