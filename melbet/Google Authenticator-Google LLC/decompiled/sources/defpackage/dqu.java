package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqu {
    public final gzp a;
    public final dih b;

    public dqu(gzp gzpVar, dih dihVar) {
        this.a = gzpVar;
        this.b = dihVar;
    }

    public static final dze a() {
        dze dzeVar = new dze();
        dzeVar.b = new dih();
        return dzeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqu)) {
            return false;
        }
        dqu dquVar = (dqu) obj;
        return ksp.b(this.a, dquVar.a) && ksp.b(this.b, dquVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() - 1161807148;
    }

    public final String toString() {
        return "AdditionalAccountInformation(observableAccountInformation=" + this.a + ", accountCapabilitiesRetriever=" + this.b + ")";
    }
}
