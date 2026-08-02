package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecl extends dja {
    private final gzp a;
    private final gzp b;
    private final gzp d;
    private final gzp e;

    public ecl(gzp gzpVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4) {
        super(null);
        this.a = gzpVar;
        this.b = gzpVar2;
        this.d = gzpVar3;
        this.e = gzpVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecl) {
            ecl eclVar = (ecl) obj;
            if (this.a.equals(eclVar.a) && this.b.equals(eclVar.b) && this.d.equals(eclVar.d) && this.e.equals(eclVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return ((((this.b.hashCode() ^ (hashCode * 1000003)) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.dja
    public final gzp t() {
        return this.a;
    }

    public final String toString() {
        gzp gzpVar = this.e;
        gzp gzpVar2 = this.d;
        gzp gzpVar3 = this.b;
        return "PolicyFooterCustomizerImpl{privacyPolicyClickListener=" + String.valueOf(this.a) + ", termsOfServiceClickListener=" + String.valueOf(gzpVar3) + ", customItemLabelStringId=" + String.valueOf(gzpVar2) + ", customItemClickListener=" + String.valueOf(gzpVar) + "}";
    }

    @Override // defpackage.dja
    public final gzp u() {
        return this.b;
    }

    public ecl() {
        throw null;
    }

    @Override // defpackage.dja
    public final void v() {
    }
}
