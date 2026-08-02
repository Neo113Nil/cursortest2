package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axh {
    public final String a;
    public final int b;
    public final int c;

    public axh(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axh)) {
            return false;
        }
        axh axhVar = (axh) obj;
        return ksp.b(this.a, axhVar.a) && this.b == axhVar.b && this.c == axhVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ")";
    }
}
