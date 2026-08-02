package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eba {
    public final jhy a;
    public final eax b;

    public eba(jhy jhyVar, eax eaxVar) {
        this.a = jhyVar;
        this.b = eaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eba)) {
            return false;
        }
        eba ebaVar = (eba) obj;
        return ksp.b(this.a, ebaVar.a) && ksp.b(this.b, ebaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eax eaxVar = this.b;
        return hashCode + (eaxVar == null ? 0 : eaxVar.hashCode());
    }

    public final String toString() {
        return "CardWithViewModelData(card=" + this.a + ", viewModelData=" + this.b + ")";
    }
}
