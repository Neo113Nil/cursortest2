package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cab {
    public final boolean a;
    public final hel b;
    public final int c;
    public final int d;

    public cab(boolean z, hel helVar, int i, int i2) {
        this.a = z;
        this.b = helVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cab)) {
            return false;
        }
        cab cabVar = (cab) obj;
        return this.a == cabVar.a && ksp.b(this.b, cabVar.b) && this.c == cabVar.c && this.d == cabVar.d;
    }

    public final int hashCode() {
        return (((((a.m(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "StagedImportModel(hasStagedData=" + this.a + ", parsedOtps=" + this.b + ", failedCount=" + this.c + ", rawPayloadCount=" + this.d + ")";
    }
}
