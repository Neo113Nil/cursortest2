package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eai {
    public final jim a;
    public final jiu b;

    public eai(jim jimVar, jiu jiuVar) {
        this.a = jimVar;
        this.b = jiuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eai)) {
            return false;
        }
        eai eaiVar = (eai) obj;
        return ksp.b(this.a, eaiVar.a) && ksp.b(this.b, eaiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ReadyStateWithTap(readyState=" + this.a + ", tap=" + this.b + ")";
    }
}
