package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqo extends bqk {
    private final hel a;
    private final hel b;
    private final bpc c;

    public bqo(hel helVar, hel helVar2, bpc bpcVar) {
        if (helVar == null) {
            throw new NullPointerException("Null localConsentedAccounts");
        }
        this.a = helVar;
        if (helVar2 == null) {
            throw new NullPointerException("Null allAccounts");
        }
        this.b = helVar2;
        if (bpcVar == null) {
            throw new NullPointerException("Null otpToUpdate");
        }
        this.c = bpcVar;
    }

    @Override // defpackage.bqk
    public final bpc a() {
        return this.c;
    }

    @Override // defpackage.bqk
    public final hel b() {
        return this.b;
    }

    @Override // defpackage.bqk
    public final hel c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqk) {
            bqk bqkVar = (bqk) obj;
            if (hnu.H(this.a, bqkVar.c()) && hnu.H(this.b, bqkVar.b()) && this.c.equals(bqkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        bpc bpcVar = this.c;
        hel helVar = this.b;
        return "AccountsAndOtpToUpdate{localConsentedAccounts=" + this.a.toString() + ", allAccounts=" + helVar.toString() + ", otpToUpdate=" + bpcVar.toString() + "}";
    }
}
