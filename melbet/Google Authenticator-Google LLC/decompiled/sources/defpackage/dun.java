package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dun {
    public final dou a;
    public final dou b;
    public final duc c = null;

    public dun(dou douVar, dou douVar2) {
        this.a = douVar;
        this.b = douVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dun)) {
            return false;
        }
        dun dunVar = (dun) obj;
        if (!ksp.b(this.a, dunVar.a) || !ksp.b(this.b, dunVar.b)) {
            return false;
        }
        duc ducVar = dunVar.c;
        return ksp.b(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "PolicyFooterData(privacyPolicyClickListener=" + this.a + ", termsOfServiceClickListener=" + this.b + ", customItem=null)";
    }
}
