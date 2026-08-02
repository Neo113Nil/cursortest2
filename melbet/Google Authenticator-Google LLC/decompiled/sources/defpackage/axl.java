package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axl {
    public final String a;
    public final int b;

    public axl(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axl)) {
            return false;
        }
        axl axlVar = (axl) obj;
        return ksp.b(this.a, axlVar.a) && this.b == axlVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ")";
    }
}
