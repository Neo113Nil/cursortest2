package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eeq {
    public final ees a;
    public final ees b;
    public final hel c;
    public final dih d;

    public eeq(ees eesVar, ees eesVar2, dih dihVar, hel helVar) {
        this.a = eesVar;
        this.b = eesVar2;
        this.d = dihVar;
        this.c = helVar;
    }

    public final boolean equals(Object obj) {
        hel helVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeq) {
            eeq eeqVar = (eeq) obj;
            if (this.a.equals(eeqVar.a) && this.b.equals(eeqVar.b) && this.d.equals(eeqVar.d) && ((helVar = this.c) != null ? hnu.H(helVar, eeqVar.c) : eeqVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        hel helVar = this.c;
        return (helVar == null ? 0 : helVar.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        hel helVar = this.c;
        dih dihVar = this.d;
        ees eesVar = this.b;
        return "ImageModelLoader{imageRetriever=" + String.valueOf(this.a) + ", secondaryImageRetriever=" + String.valueOf(eesVar) + ", defaultImageRetriever=" + String.valueOf(dihVar) + ", postProcessors=" + String.valueOf(helVar) + "}";
    }

    public eeq() {
        throw null;
    }
}
