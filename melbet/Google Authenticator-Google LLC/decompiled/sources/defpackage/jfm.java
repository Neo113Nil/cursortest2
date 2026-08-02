package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfm {
    public final jfh a;
    private final jfo b;

    public jfm(jfh jfhVar) {
        this.b = null;
        this.a = jfhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfm)) {
            return false;
        }
        jfm jfmVar = (jfm) obj;
        jfo jfoVar = jfmVar.b;
        return ksp.b(null, null) && ksp.b(this.a, jfmVar.a);
    }

    public final int hashCode() {
        jfh jfhVar = this.a;
        if (jfhVar == null) {
            return 0;
        }
        return jfhVar.hashCode();
    }

    public final String toString() {
        return "DiscDecorations(ring=null, badge=" + this.a + ")";
    }

    public jfm() {
        this(null);
    }
}
