package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axr {
    public final String a;
    public final atb b;

    public axr(String str, atb atbVar) {
        atbVar.getClass();
        this.a = str;
        this.b = atbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axr)) {
            return false;
        }
        axr axrVar = (axr) obj;
        return ksp.b(this.a, axrVar.a) && this.b == axrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ")";
    }
}
