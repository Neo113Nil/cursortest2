package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jir implements jip {
    public final jhq a;
    public final jhb b;

    public jir(jhq jhqVar, jhb jhbVar) {
        jhqVar.getClass();
        this.a = jhqVar;
        this.b = jhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jir)) {
            return false;
        }
        jir jirVar = (jir) obj;
        return ksp.b(this.a, jirVar.a) && this.b == jirVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jhb jhbVar = this.b;
        return hashCode + (jhbVar == null ? 0 : jhbVar.hashCode());
    }

    public final String toString() {
        return "TrailingText(text=" + this.a + ", background=" + this.b + ")";
    }
}
