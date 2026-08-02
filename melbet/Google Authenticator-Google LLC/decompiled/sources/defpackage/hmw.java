package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hmw {
    public final hoj a;
    public final String b;

    public hmw(hoj hojVar, String str) {
        hojVar.getClass();
        this.a = hojVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hmw) {
            hmw hmwVar = (hmw) obj;
            if (this.a.equals(hmwVar.a) && this.b.equals(hmwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
