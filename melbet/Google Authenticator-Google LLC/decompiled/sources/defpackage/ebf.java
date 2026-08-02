package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebf {
    public final ebi a;
    public final ebd b;
    public final gzp c;
    public final eaz d;

    public ebf(ebi ebiVar, ebd ebdVar, gzp gzpVar, eaz eazVar) {
        this.a = ebiVar;
        this.b = ebdVar;
        this.c = gzpVar;
        this.d = eazVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebf) {
            ebf ebfVar = (ebf) obj;
            if (this.a.equals(ebfVar.a) && this.b.equals(ebfVar.b) && this.c.equals(ebfVar.c) && this.d.equals(ebfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        eaz eazVar = this.d;
        gzp gzpVar = this.c;
        ebd ebdVar = this.b;
        return "TextualCardInitialData{cardIcon=" + String.valueOf(this.a) + ", titleData=" + String.valueOf(ebdVar) + ", highlightId=" + String.valueOf(gzpVar) + ", visualElementsInfo=" + String.valueOf(eazVar) + "}";
    }

    public ebf() {
        throw null;
    }
}
