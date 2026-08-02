package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebd {
    public final String a;
    private final gzp b;

    public ebd(String str, gzp gzpVar) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (gzpVar == null) {
            throw new NullPointerException("Null titleContentDescription");
        }
        this.b = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebd) {
            ebd ebdVar = (ebd) obj;
            if (this.a.equals(ebdVar.a) && this.b.equals(ebdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TextViewData{title=" + this.a + ", titleContentDescription=Optional.absent()}";
    }

    public ebd() {
        throw null;
    }
}
