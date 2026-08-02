package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idl {
    public final gzp a;
    public final hfm b;

    public idl(gzp gzpVar, hfm hfmVar) {
        this.a = gzpVar;
        this.b = hfmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idl) {
            idl idlVar = (idl) obj;
            if (this.a.equals(idlVar.a) && this.b.equals(idlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((hjb) this.b).c ^ 2097800333;
    }

    public final String toString() {
        hfm hfmVar = this.b;
        return "Options{customScopes=" + String.valueOf(this.a) + ", fallbackOptions=" + String.valueOf(hfmVar) + "}";
    }

    public idl() {
        throw null;
    }
}
